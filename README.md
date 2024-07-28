# Android Data Binding [One way]

# Overview

Android has now released a stable data-binding library which allows you to connect views with data in a much more powerful way than was possible  previously. Applying data binding can improve your app by removing boilerplate for data-driven UI and allowing for two-way binding between views and data objects. This provides a way to tie the UI with business logic allowing the UI values to update automatically without manual intervention. This reduces lot of boilerplate code in your business logic that you usually write to sync the UI when new data is available. DataBinding is one of the android architecture components suggested by android


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
The usage of data binding requires changes in your layout files. Such layout files starts with a **layout** root tag followed by a **data** element and a **view root element**. The **data** elements describe data which is available for binding. This view element contains your root hierarchy similar to layout files which are not used with data binding. References to the data elements or expressions within the layout are written in the attribute properties using the **@{} or @={}**.

# Data binding for events via listener

Events may be bound to handler methods directly, similar to the way android:onClick can be assigned to a method in the activity. Event attribute names are governed by the name of the listener method with a few exceptions. For example, View.OnLongClickListener has a method onLongClick(), so the attribute for this event is android:onLongClick.

To assign an event to its handler, use a normal binding expression, with the value being the method name to call. The binding expression can assign the click listener for a View.


```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">
    <data>
        <variable
            name="itemClickListener"
            type="com.databinding.custom.CustomClickListener" />
    </data>
    <ConstraintLayout... /> 
</layout>
```
# Attached listener in layout
you can bind the listener using below tag.

```
android:onClick="@{() -> itemClickListener.cardClicked(dataModel)}"
```
> Example:
```
<androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:onClick="@{() -> itemClickListener.cardClicked(dataModel)}"
        app:cardUseCompatPadding="true">

</androidx.cardview.widget.CardView>
```

# End Result
<img src="../master/data_binding.gif" width="200" height="400")
