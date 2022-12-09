fun main() {
  if( emailReviewer("Thank you for the interest you have expressed in the Junior Android Developer role. After careful review, we have decided to pursue other candidates whose skills and experience are better aligned with our business needs at this time."))
    {
        println("You rejected")
    }
    else
    {
        println("come to interview")
    }


}

fun emailReviewer(email :String):Boolean{
    var toReturn = false
    val mostPopularRejections :List<String> = listOf("Unfortunatly",
                                                     "Thank you for the interest",
                                                    "Thank you for your interest",
                                                    "Thank you for your time",
                                                    "We appreciate your interst in our company"
                                                    )
    for(messages in mostPopularRejections){
        if(messages in email){
            toReturn = true
        }
    }
    
    return toReturn
    
    
}
