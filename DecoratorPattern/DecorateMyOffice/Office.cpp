#include <string>
#include <stdio.h>
using namespace std;
class Office{
    private:
    string offcName;
    string location;
    double area;
    int nStoryes;
    double cost;

    public:

    Office(string& offcName, string& locName, double area, int nStoryes, double cost){
         this->offcName = offcName;
         this->location = locName;
         this->area = area;
         this->nStoryes = nStoryes;
         this->cost = cost;
    }

    Office(){
    }

    virtual ~Office(){
        printf("Office object destroyed\n");
    }

    void printOfficeDetails(){
        printf("Name = %s\n", getOffcName().c_str());
        printf("location = %s\n", getLocation().c_str());
        printf("Area = %ld\n", getArea());
        printf("Number of Storeys = %d\n", getNStoreys());
        printf("Cost = %ld\n", getCost());
    }
    void setOffcName(string& offcName){
        this->offcName = offcName;
    }
    
    string& getOffcName(){
        return this->offcName;
    }

    void setLocation(string& locName){
        this->location = locName;
    }
    
    string& getLocation(){
        return this->location;
    }
    
    void setArea(double area){
        this->area = area;
    }

    double getArea(){
        return this->area;
    }
    
    void setNStoreys(int nStoryes){
        this->nStoryes = nStoryes;
    }

    int getNStoreys(){
        return this->nStoryes;
    }

    void setCost(double cost){
        this->cost = cost;
    }

    double getCost(){
        return this->cost;
    }
};
