# Android Data Binding [One way]

# Overview

Android has now released a stable data-binding library which allows you to connect views with data in a much more powerful way than was possible  previously. Applying data binding can improve your app by removing boilerplate for data-driven UI and allowing for two-way binding between views and data objects.


# Setup
To enable the usage of data binding in your Android application, add the following snippet to the app/build.gradle file.

```
 android {
     dataBinding.enabled = true
     }
```

# Binding data

A binding class is generated for each layout file. By default, the name of the class is based on the name of the layout file, converting it to Pascal case and adding the Binding suffix to it. The above layout filename is **activity_main.xml** so the corresponding generated class is **ActivityMainBinding**.

# Layouts and binding expressions

The expression language allows you to write expressions that connect variables to the views in the layout. The Data Binding Library automatically  generates the classes required to bind the views in the layout with your data objects.

For example, the binding variables that can be used in expressions are defined inside a data element that is a sibling of the UI layout's root element. Both elements are wrapped in a layout tag, as shown in the following example:

```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">
    <data>
        <variable
            name="viewmodel"
            type="com.myapp.data.ViewModel" />
    </data>
    <ConstraintLayout... /> 
</layout>
```


# End Result
![Optional Text](../master/data_binding.gif)
