//
//  MainViewController.swift
//  CautionFPX
//
//  Created by Larry Frayer on 11/31/20.
//

import UIKit
import CoreMotion

class MainViewController: UIViewController {
    var motionManager = CMMotionManager()

    override func viewDidLoad() {
        super.viewDidLoad()
        title = "Home Screen"
        


        func viewWillAppear(_ animated: Bool) { // copy all this
        motionManager.accelerometerUpdateInterval = 0.1
            
        motionManager.startAccelerometerUpdates(to: OperationQueue.current!) {
            (data, error) in
            if let codeData = data
            {
                if codeData.acceleration.x > 9 { // The more you move your phone, the higher
                    //the numbers go, which will indicate trouble
                    print("Trouble! Send help!")
                    }
            }
        }
    

        
       
            
        }

        
        

        

    
            
            
            


        // Do any additional setup after loading the view.
    }
    



}
