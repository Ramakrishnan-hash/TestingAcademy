package Nov.ex_11112024.Real_life_Project_example;

// We are creating Base class/ Common class to have all the common functionality like methods, variable in one class
public class Base_Class {
    // We will have browser variable(Instance/Class variable) as private access modifier to have it in Encapsulation
    // To access browser variable(Instance/Class variable) in Testcase1 & Testcase2 class we will create getter & setter methods
  private  String browser;

    public String getBrowser() {
        return browser;
    }
// If user is authenticator then we can set or else it is not allowed
    public void setBrowser(String browser, boolean auth) {
        if(auth){
            this.browser = browser;
            System.out.println(browser);
        }
        else{
            System.out.println("Not allowed");
        }
    }

    //Overloading of Constructor concept

    // Default Constructor of Base Class

    Base_Class(){
        System.out.println("Default Constructor of Base Class");
    }

    // Parametrized Constructor of Base Class

    Base_Class(String b){
        System.out.println("Parametrized Constructor of Base Class");
    }
// Method Overloading
    //Normal method

    void openbrowser(){
        System.out.println("Base Class - Open Browser method");
    }
    void openbrowser(String browsername){
        System.out.println("Base Class - Open Browser method: "+ browsername);
    }
    void closebrowser(){
        System.out.println("Base Class - Close Browser method");
    }

}
