#include <opencv2/opencv.hpp>
#include <bits/stdc++.h>

using namespace std;
using namespace cv;


int main(){
    char imgPath[] = "man.jpg";
    Mat img;
    img = imread(imgPath);
    if(!img.data){
        cout<<"The path is wrong!"<<endl;
        exit(-1);
    }
    Mat grey;
    cvtColor(img,grey,COLOR_BGR2GRAY);
    vector<Rect> faces;
    CascadeClassifier faceCascade("E:\\opencv\\sources\\data\\haarcascades_cuda\\haarcascade_frontalface_default.xml");
    faceCascade.detectMultiScale(grey,faces,1.1,5);
    for (auto face : faces) {
        rectangle(img, face, (0, 255, 0), 4);
    }
    imshow("Face", img);
    waitKey(0);
    imwrite("./result/dman.jpg",img);
    return 0;

}
