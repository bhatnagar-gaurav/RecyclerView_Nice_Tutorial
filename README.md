# RecyclerView_Nice_Tutorial

In this repositiory we have provided six separate projects to accompany RecyclerView Basic Tutorial.
Please go through the projects in the sequential manner (as mentioned below) based on the complexity involved :

**1)  RecyclerView_PlainList: **
    This project is the first step towards shifting to the RecyclerView from the AdapterView family of widgets. It shows a simple dumb plain list of shopping items to be purchased from the retail store. Each row comprises of one shopping item, its word's length and an accompnaying icon (which changes based on the length of each shopping item ).
    
**2)  RecyclerViewCard-List:**
     This project just uses Card-View widget instead of LinearLayout for each row in the simple plain list as explained in the first project to give a better visual representation. This helps in providing a segregation of different items/rows in the given list.
    
**3)  RecyclerListWithDivider:**
      This project uses the ItemDecoration component of the recyclerview-v7 library to provide explicit dividers between each rows in the given list.This shows the flexibility of the RecyclerView widget that for each functionality a different component is available in its library which can be plugged in/plugged out as per convenience. 
      
**4)  RecyclerViewClickList:**
       This project provides the clickable functionality to each row/card of the simple plain list which is direclty not provided by the RecyclerView widget. The View.OnClickListner can be implemented in the ViewHolder class which helps in providing an optimized user experience as compared to the duplicate functionality "baked into" the AdapterView family of widgets. 
       
**5)  RecyclerViewGrid:**
        This project shows the simple plain list in a grid manner by just using the GridLayoutManager(A type of LayoutManager) provided in the recyclerview-v7 library.Through this project we can understand the reusable functionality of the RecyclerView.LayoutManager. 

**6)  RecyclerMultipleViewType:**
        This project shows the MultipleView functionality of the RecyclerView widget. Based on the different types of data source available , RecyclerView is prolific enough to create separate layout in a List/Grid as per coveneince. The RecyclerView.Adapter has the rich funcitonality to provide different views based on the different types of views. 
        
        Through the above projects the basic functionality of the RecyclerView widget can be grasped. 
      
