# TwoActivities

## Goal

Start a second activity by clicking a button and sending data to it.


## Solution

First we need to add a listener to a button we added inside the activity xml:

```
//Finds a button by name
val btnSwitchAcitivty = findViewById<Button>(R.id.btnStartAnotherActivity);
        btnSwitchAcitivty.setOnClickListener {
        // is called everytime the button is pressed
        }
```

Then we need to open the second Activty we created beforehand. We called it activity2.

```
//Inside the listener

// Gets us the Activity we want to switch to            
val intent = Intent(this, Activity2::class.java)

// by using startActivity we can start it
startActivity(intent)      
```

To Pass data to this screen we first create a Bundle(). We put our data inside this bundle like that:

```
val b = Bundle()
b.putSerializable("data","Data from screen 1")
```

This object is then added to the intend before calling startActivity:
```
intent.putExtras(b)
```

Inside the second activity we can get the data back like that:

```
val dataFromMainActivity = intent.getSerializableExtra("data")
```
This data can now be used. For example we can put it inside a textView:

```
val TextOB = findViewById<TextView>(R.id.DataFromParent)

TextOB.text = "Text from Main Screen : " +dataFromMainActivity

```
