﻿using System;
//C# rock, paper, scissors game, sourced from internet
namespace Hello_World
{
    class Program
    {
        static void Main(string[] args)
        {
            string inputPlayer, inputCpu;
            int randomInt;

            bool playAgain = true;// sentinel

            while (playAgain)
            {

                int scorePlayer = 0;
                int scoreCpu = 0;

                while (scorePlayer < 3 && scoreCpu < 3)
                {


                    Console.Write("Choose between ROCK, PAPER and Scissors:   ");
                    inputPlayer = Console.ReadLine();
                    inputPlayer = inputPlayer.ToUpper();


                    Random rnd = new Random();

                    randomInt = rnd.Next(1, 4);

                    switch (randomInt)
                    {
                        case 1:
                            inputCpu = "ROCK";
                            Console.WriteLine("Computer chose ROCK");
                            if (inputPlayer == "ROCK")
                            {
                                Console.WriteLine("DRAW!!\n\n");
                            }
                            else if (inputPlayer == "PAPER")
                            {
                                Console.WriteLine("PLAYER WINS!!\n\n");
                                scorePlayer++;
                            }
                            else if (inputPlayer == "SCISSORS")
                            {
                                Console.WriteLine("CPU WINS!!\n\n");
                                scoreCpu++;
                            }
                            break;
                        case 2:
                            inputCpu = "PAPER";
                            Console.Write("Computer chose PAPER");
                            if (inputPlayer == "PAPER")
                            {
                                Console.WriteLine("DRAW!!\n\n");
                            }
                            else if (inputPlayer == "ROCK")
                            {
                                Console.WriteLine("CPU WINS!!\n\n");
                                scoreCpu++;
                            }
                            else if (inputPlayer == "SCISSORS")
                            {
                                Console.WriteLine("PLAYER WINS!!\n\n");
                                scorePlayer++;
                            }
                            break;
                        case 3:
                            inputCpu = "SCISSORS";
                            Console.WriteLine("CPU chose SCISSORS");
                            if (inputPlayer == "SCISSORS")
                            {
                                Console.WriteLine("DRAW!!\n\n");
                            }
                            else if (inputPlayer == "ROCK")
                            {
                                Console.WriteLine("PLAYER WINS!!\n\n");
                                scorePlayer++;
                            }
                            else if (inputPlayer == "PAPER")
                            {
                                Console.WriteLine("CPU WINS!!\n\n");
                                scoreCpu++;
                            }
                            break;
                        default:
                            Console.WriteLine("Invalid entry");
                            break;
                    }
                    Console.WriteLine("\n\nSCORES: \tPLAYER:\t{0}\tCPU:\t{1}", scorePlayer, scoreCpu);
                }
                if (scorePlayer == 3)
                {
                    Console.WriteLine("Player WON!");
                }
                else if (scoreCpu == 3)
                {
                    Console.WriteLine("CPU WON");
                }
                else if (scoreCpu == 3)
                {
                    Console.WriteLine("Do you want to play again?(y/n");
                    string loop = Console.ReadLine();
                    if (loop == "y")
                    {
                        playAgain = true;
                        Console.Clear();
                    }
                    else if (loop == "n")
                    {
                        playAgain = false;
                    }
                    else
                    {
                        Console.Clear();
                    }
                }
            }
        }
    }
}
    
