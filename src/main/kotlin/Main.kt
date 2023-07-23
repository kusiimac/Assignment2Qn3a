/**
 * A person has four options of choosing between; pizza, chicken, pancakes or cake.
 * If they choose pizza, they'll go to pizza hut, if chicken, they'll go to kfc,
 * if pancakes, they'll go to food hub, if cake, they'll go to cakely. Write a program using
 * an if statement that captures the person's choice and prints the selected restaurant
 */
fun main(){
    // This program will print the selected restaurant depending on the person's choice of meal
    println("Enter your meal")
    val meal = readln()
    if(meal == "pizza") {
        print("pizza hut")
    }
    else if (meal == "chicken") {
        print("kfc")
        }
    else if (meal == "pancakes") {
        print("food hub")
    }
    else {
        print("cakely")
    }
}