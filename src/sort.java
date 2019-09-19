public class Book{
    private Stirng name;

    public String getName(){    //定义一个方法
        int id=0;               //局部变量
        setName("Java");        //调用类中的其他方法
        return id+this.name;    //返回值
    }

    private void setName(String name){  //私有成员 只能在本类中使用，不可被同包、其他包的其他类或子类使用
        this.name=name;
    }

    public Book getBook(){
        return this;
    }
}