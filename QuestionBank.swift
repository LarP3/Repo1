//
//  QuestionBank.swift
//  CautionFPX
//
//  Created by Larry Frayer on 11/5/20.
//

import Foundation

class QuestionBank{
    var questions = [Question]()
    
    init() {
        
        questions.append (Question (questiontext: "Have I fallen in the past year?", answer: false))
        questions.append (Question (questiontext: "Am I worried about falling?", answer: false))
        questions.append (Question (questiontext: "Do you fall easily?", answer: true))
        questions.append (Question (questiontext: "I am on medication?", answer: true))
        questions.append (Question (questiontext: "I get Dizzy on elevators?", answer: false))


        questions.append (Question (questiontext: "I have experienced middle-ear syndrome?", answer: false))
        questions.append (Question (questiontext: "Do I take 4 or more different medicines every day?", answer: false))
        questions.append (Question (questiontext: "After taking my pills, do I feel light-headed or more tired than usual?", answer: false))
        questions.append (Question (questiontext: "Do I take any medicine to help me sleep or improve my mood?", answer: false))
        questions.append (Question (questiontext: "Do I need to push with my hands to stand up from a chair?", answer: false))
        questions.append (Question (questiontext: "Do I practice less than 30 minutes of physical activity8*, twice a week? *walking, mowing the lawn, sweeping, gardening, brisk walk, biking, dancing, swimming, and moderately strenuous tasks.", answer: false))
        questions.append (Question (questiontext: "Do I drink alcohol daily?", answer: false))
        questions.append (Question (questiontext: "Do I have hearing problems or have vertigo?", answer: false))
        questions.append (Question (questiontext: "Do I have vision impairments or havent had an eye examination in more than two years?", answer: false))
        questions.append (Question (questiontext: "Do i often feel unsteady when I am walking?", answer: false))
        questions.append (Question (questiontext: "Do I steady myself by holding onto furniture when walking at home?", answer: false))
        questions.append (Question (questiontext: "Do I have some trouble stepping up onto a curb?", answer: false))
        questions.append (Question (questiontext: "Am I having touble getting to the bathroom on time?", answer: false))
        questions.append (Question (questiontext: "Have I lost some feeling in my feet?", answer: false))
        questions.append (Question (questiontext: "Do I often feel sad or depressed?", answer: false))
        
    }
}

