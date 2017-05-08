App Name: HeliAndroidUI

Performs all Functionality mentioned in Interaction_Wireframe.pdf
1) Home page of Activity scrolles through the multiple cards of the images
2) Single Tap on any particular card will take through the 1:1 images of particular genre
3) Tap on 'Back' button will return to the home screen
4) Long press will pop up the preview. Can slide left and right to see more images

Activity Classes are defined as follow:
Main Activity: For Home Screen of the app

Sub Activities: The activities that get called on single tap on a card
1) AnimalActivity
2) ArchitectureActivity
3) FoodActivity
4) PosterActivity
5) SceneriesActivity

RecycleView Adapter: A Recycle View Adapter

Recycle View Holder: Holder class for Recycle Adapter

ItemObject: Get/Set methods for Image Name and Image

