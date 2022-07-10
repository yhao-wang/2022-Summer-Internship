#include <opencv2/opencv.hpp>
#include <bits/stdc++.h>

using namespace std;
using namespace cv;


int main(){

    VideoCapture cap;
    cap.open(0); //打开摄像头
 
    if(!cap.isOpened())
        return 0;
 
    Mat img;
    while(1)
    {
        cap>>img;//等价于cap.read(img);
        //cvtColor(img, img, CV_BGR2HSV);//BGR空间转为HSV颜色空间，注意，两者不能同时对同一张图片（在此为img）进行处理，否则报错
        if(img.empty())
            break;
        imshow("video", img);
        if(waitKey(20)>0)//按下任意键退出摄像头　　因电脑环境而异，有的电脑可能会出现一闪而过的情况
            break;
    }
    if(!img.data){
        cout<<"The path is wrong!"<<endl;
        exit(-1);
    }
    Mat grey;
    cvtColor(img,grey,COLOR_BGR2GRAY);
    vector<Rect> faces;
    CascadeClassifier faceCascade(".\\haarcascade_frontalface_default.xml");
    faceCascade.detectMultiScale(grey,faces,1.1,5);
    for (auto face : faces) {
        rectangle(img, face, (0, 255, 0), 4);
    }
    imshow("Face", img);
    waitKey(0);
    imwrite("./result/dman.jpg",img);
    return 0;

}
