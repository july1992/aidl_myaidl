// VilyServiceAidl.aidl
package com.vily.aidl_myaidl;
import com.vily.aidl_myaidl.bean.aaaa;

// Declare any non-default types here with import statements

interface VilyServiceAidl {

           int addNumbers(int num1, int num2);//2 argument method to add
           List<String> getStringList();
           List<Person> getPersonList();

}
