基于Android设备的⼈脸检测（表情分析）功能实现
  具体内容
    1. 对深度学习算法的了解与使⽤
    2. 使⽤现有⽅法，完成相应功能实现
    3. 基于各类框架实现相应⽹络的运⾏
    4. Android端开发技术
    5. 优化⼯作
设备
⾼通778G
麒麟980
虚拟机
实现⽅案推荐
  1. 算法选择
    1. 先使⽤已有的⽅法接⼝进⾏开发实现
      1. OpenCV https://opencv.org/
      2. dlib http://dlib.net/
    2. 使⽤预训练好的模型进⾏开发**
      1. RetinaFace https://github.com/biubug6/Pytorch_Retinaface
      2. etc...
      3. 基于2的⽹络进⾏调优（可选）
      4. 或⾃⾏训练相应的算法模型（可选）
  2. 实现⽅式
    1. 直接基于Java/Kotlin 在Android上进⾏开发
      1. OpenCV
      2. Torch Mobile 等提供了Java包的框架
  2. 基于C++进⾏开发**
    1. 建议先在本机实现功能、提供接⼝（也可以直接在AS中开发）
      1. OpenCV、dlib等已有接⼝
      2. ncnn/MNN 等C++框架
    2. 通过JNI技术完成Java对C接⼝调⽤
      1. 可以借助SWIG等简化接⼝开发
    3. 其他⽅案（可选）
      1. 将图⽚/视频传输到服务器端？
      2. etc....
      ~先完成图像分析 再做视频分析
  3. Android端开发
      1. 设备资源的调⽤
        1. 相机等硬件调⽤
        2. NPU模块调⽤
        3. etc...
      2. 合理的组件使⽤
        1. 在运⾏速度不⾜以实时的情况下，如何保证整体流畅?
  4. (速度)优化
      1. 关注每次优化后的提升并进⾏记录
      2. C++编译选项
      3. 代码优化
        1. 多线程
        2. 并⾏（OpenMP）
        3. Neon指令
        4. 对模型的优化
          1. 换更⼩的模型/使⽤更⼩的输⼊
          2. 模型的量化/剪枝...
        5. NPU等硬件资源
  5. 其他⼯作
    1. 其他接⼝的使⽤
    2. 其他提升
⼯具
  1. Git
  2. Netron
  3. VSCode AS CLion
课题要求
  1. 通过git进⾏代码提交
    1. 使⽤github或gitee进⾏代码管理
      1. github 需要将 Xyzhao1999 添加为reporter
      2. gitee 需要将 xyzhao1999 添加为观察者
    2. 每周⾄少与周报同步进⾏⼀次代码提交
  2. 代码应当遵循规范
    1. Java https://google.github.io/styleguide/javaguide.html
    2. C++ https://google.github.io/styleguide/cppguide.html
    3. 当然你有⾃⼰的统⼀⻛格习惯 也是可以接受的，但要保证统⼀性与可读性
  3. 代码的注释
    1. 推荐采⽤doxygen⽀持的⽅式进⾏注释，以⽀持⽣成相应的⽂档
  4. 周报
    1. 每周五下午填写周报发送到群⽂件中，包括但不限于本周⼯作内容、收获、下周计划、问题与需要协助。
    2. 周报⽬的是为了跟踪各位的进展，提前发现问题并进⾏调整，避免脱节导致后续进度难以完成
