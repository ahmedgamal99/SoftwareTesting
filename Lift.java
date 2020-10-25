package Lift;

public class Lift {
	public String input = "";
	public String return_value = "";

	public String Lift(String input) {

		// context variables
		int drst = 0;
		int w = 0;
		int floor = 0;

		// inputs
		int pos = 0;
		int pw = 0;
		int ph = 0;
		int pf = 0;
		int ps = 0;

		Reader read = new Reader(input);

		while(true){


			if (!read.next_input(this)) {

				if(floor == 0){
					
					// t1
					if(this.input.substring(0,4).equals("DrOp")){
						pos = Integer.parseInt(this.input.split("\\(")[1].split("\\)")[0]); // to obtain pos from DrOp(Pos)
						if(drst == 0 && pos >= 0 && pos <= 15){
							drst = 1;
							return_value += "Null, ";
						}

						// next while here
					}

					// t2
					else if(this.input.substring(0,4).equals("DrCl")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pos = Integer.parseInt(args.split(",")[0]);
						pw = Integer.parseInt(args.split(",")[1]);

						if(drst == 1 && pos >= 0 && pos <= 15){
							drst = 0;
							w = pw;
							return_value += "Null, ";
						}

					}


					// t3
					else if(this.input.substring(0,3).equals("Srv")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 1 && w >=15 && w<=250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){
							floor = 1;
							return_value += "Display(" + floor + "), ";
						}
					}

					// t5
					else if(this.input.substring(0,3).equals("Req")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 1 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
							floor = 1;
							return_value += "Display(" + floor + "), ";
						}

					}



				}

				else if (floor == 1){
                                    
                                    //t6
                                    if(this.input.substring(0,3).equals("Req")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 0 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
							floor = 0;
							return_value += "Display(" + floor + "), ";
						}

					}
                                    
                                    //t7
                                    else if(this.input.substring(0,4).equals("DrOp")){
						pos = Integer.parseInt(this.input.split("\\(")[1].split("\\)")[0]); // to obtain pos from DrOp(Pos)
						if(drst == 0 && pos >= 0 && pos <= 15){
							drst = 1;
							return_value += "Null, ";
						}

						// next while here
					}
                                    
                                    //t8
                                    else if(this.input.substring(0,4).equals("DrCl")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pos = Integer.parseInt(args.split(",")[0]);
						pw = Integer.parseInt(args.split(",")[1]);

						if(drst == 1 && pos >= 0 && pos <= 15){
							drst = 0;
							w = pw;
							return_value += "Null, ";
						}

					}
                                    
                                    //t9
                                    else if(this.input.substring(0,3).equals("Srv")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 0 && w >=15 && w<=250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){
							floor = 0;
							return_value += "Display(" + floor + "), ";
						}
                                    }
                                    
                                    
                                    
                                    //t12
                                    else if(this.input.substring(0,3).equals("Req")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 2 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
							floor = 2;
							return_value += "Display(" + floor + "), ";
						}

					}
                                    
                                    //t22
                                    else if(this.input.substring(0,3).equals("Stp")){
						String args = this.input.split("\\(")[1].split("\\)")[0];
						pf = Integer.parseInt(args.split(",")[0]);
						ph = Integer.parseInt(args.split(",")[1]);
						ps = Integer.parseInt(args.split(",")[2]);

						if(drst == 0 && pf == 100 && w >= 15 && w<=250 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
							floor = 100;
							return_value += "Display(" + floor + "), ";
						}

					}
                                    

				}

				else if(floor == 2){


				}


				else if(floor == 100){



				}

			}
			else {
				return return_value;
			}
		}

	}

}

class Reader {

	String[] inputs_arr;
	int num_of_inputs;
	int index;

	public Reader(String inputs) {
		this.inputs_arr = inputs.split(",");
		this.num_of_inputs = inputs_arr.length;
		this.index = 0;
	}

	public boolean next_input(Lift original) {
		if (this.index < this.num_of_inputs) {
			original.input = this.inputs_arr[this.index];
			this.index++;
			return false;
		} else {
			return true;
		}
	}
}