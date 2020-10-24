/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initiator;

/**
 *
 * @author ahmedgamal
 */
public class Initiator {
    /*
    	DrOp(Pos) (Open Door)
	DrCl(Pos, Pw) (Close door)
	Srv(Pf, Ph, Ps) (Service lift from one floor to another)
	Req(Pf, Ph, Ps) (Request lift from a floor)
	Stp(Pf, Ph, Ps) (Emergency stop)
    */
    
    private static int DrSt; // Door State
    private static int w; // Weight of lift contents
    private static int Floor; // Current Floor (0,1,2,100)
    
    private static int DrOP_Pos; // Position of lift. This is the percentage of the lift that is not aligned with the doorframe
    private static int DrCl_Pos; // Position of lift. This is the percentage of the lift that is not aligned with the doorframe
    private static int DrCl_Pw; // Current weight of lift contents
    private static int Srv_Pf; // Requested floor {0,1,2} (Service lift from one floor to another)
    private static int Srv_Ph; // Lift temperature
    private static int Srv_Ps; // Lift smoke level
    private static int Req_Pf; // Requested floor (Request lift from a floor)
    private static int Req_Ph; // Lift temperature
    private static int Req_ps; // Lift smoke level
    private static int Stp_Pf; // Requested floor (Emergency stop) {0,1,2,100} 
    private static int Stp_Ph; // Lift temperature (Emergency stop)
    private static int Stp_Ps; // Lift smoke level (Emergency stop)
    
    public static void main(String[] args) {
        
    }
    
}
