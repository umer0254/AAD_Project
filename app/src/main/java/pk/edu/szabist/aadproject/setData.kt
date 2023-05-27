package pk.edu.szabist.aadproject

object setData {
    const val score:String=""

    //for setting data

    fun get_maths_Question():ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "Solve for x: 3x + 5 = 17",
            1,
             "x = 4",
        "x = 6",
        "x = 12",
        "x = 4.5",

        1
        )
        var q2 = QuestionData(
            "Calculate: 4 × (6 + 2) ÷ 3",
            2,
            "6",
        "10",
         "12",
         "16",
            2

        )
        var q3 = QuestionData(
            "Find the value of y: 2y + 7 = 15",
            3,
         "y = 4",
        "y = 6",
        "y = 8",
        "y = 9",
        3

        )
        var q4 = QuestionData(
           " Simplify: 2(3x + 4) - 5x",
            4,
        "6x + 8",
        " 3x + 8",
        "6x - 8",
        "3x - 8",
        4

        )
        var q5 = QuestionData(
            "Calculate: 15 ÷ (5 - 2)",
            5,
        "3",
         "5",
        "10",
        "15",
        1
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que

    }
    fun get_books_Question():ArrayList<QuestionData>{
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1= QuestionData(
            "Which author wrote the Harry Potter book series?",
            1,
            "J.R.R. Tolkien",
            "J.K. Rowling",
            "George R.R. Martin",
            "Stephen King",
            2
        )
        var q2= QuestionData(
            "In the novel To Kill a Mockingbird,who is the main character?",
            2,
            "Atticus Finch",
        "Scout Finch",
        "Boo Radley",
        "Tom Robinson",
        2
        )
        var q3= QuestionData(
            "Which author wrote the Harry Potter book series?",
            3,
            "J.R.R. Tolkien",
            "J.K. Rowling",
            "George R.R. Martin",
            "Stephen King",
            2
        )
        var q4= QuestionData(
            "Which author wrote the Harry Potter book series?",
            4,
            "J.R.R. Tolkien",
            "J.K. Rowling",
            "George R.R. Martin",
            "Stephen King",
            2
        )
        var q5= QuestionData(
            "Which author wrote the Harry Potter book series?",
            5,
            "J.R.R. Tolkien",
            "J.K. Rowling",
            "George R.R. Martin",
            "Stephen King",
            2
        )



        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
    fun get_movies_Question ():ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "Who directed the movie Titanic released in 1997?",
            1,
        "Steven Spielberg",
        "James Cameron",
        "Martin Scorsese",
        "Christopher Nolan",
       2

        )
        var q2 = QuestionData(
            "Which actor played the character of Iron Man in the Marvel Cinematic Universe?",
            2,
        "Chris Evans",
        "Chris Hemsworth",
        "Robert Downey Jr.",
        "Mark Ruffalo",
        3


        )
        var q3 = QuestionData(
            "Which film won the Academy Award for Best Picture in 2020?",
            3,
        "Parasite",
        "1917",
        "Joker",
        "The Shape of Water",
        1

        )
        var q4 = QuestionData(
            "Which movie features the character Darth Vader?",
            4,
        "Star Wars: Episode IV - A New Hope",
        "The Matrix",
        "The Lord of the Rings: The Fellowship of the Ring",
        "Jurassic Park",
            1


        )
        var q5= QuestionData(
            "In the movie The Shawshank Redemption, who plays the role of Andy Dufresne?",
            5,
            "Morgan Freeman",
        "Tim Robbins",
        "Tom Hanks",
        "Brad Pitt",
        2

        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
    fun get_gk_Question ():ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "Which planet is known as the Red Planet?",
            1,
         "Venus",
        "Mars",
        "Jupiter",
        "Saturn",
            2
        )
        var q2 = QuestionData(
            "Who painted the famous artwork Mona Lisa?",
        2,
        "Leonardo da Vinci",
        "Vincent van Gogh",
        "Pablo Picasso",
        "Michelangelo",
        1
        )
        var q3 = QuestionData(
        "Which country is famous for its ancient pyramids?",
        3,
        "Greece",
        "Egypt",
        "Italy",
        "China",
            2 )
        var q4 = QuestionData(
            "What is the capital city of Australia?",
            4,
            "Sydney" ,
                    "Melbourne",
        "Canberra",
        "Brisbane",
        3
        )
        var q5 = QuestionData(
            "Which famous scientist developed the theory of relativity?",
            5,
        "Isaac Newton",
        "Albert Einstein",
        "Galileo Galilei",
        "Marie Curie",
        2 )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }}