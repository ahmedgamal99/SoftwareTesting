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


                    // t3 and t16
                    else if(this.input.substring(0,3).equals("Srv")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w >=15 && w<=250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){
                            if(pf == 1){
                                floor = 1; // t3
                                return_value += "Display(" + floor + "), ";
                            }
                            else if (pf == 2){
                                floor = 2; // t16
                                return_value += "Display(" + floor + "), ";
                            }
                        }



                    }


                    // t5 and t17
                    else if(this.input.substring(0,3).equals("Req")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){

                            if(pf == 1){ // t5
                                floor = 1;
                                return_value += "Display(" + floor + "), ";
                            }
                            else if(pf == 2){ // t17
                                floor = 2;
                                return_value += "Display(" + floor + "), ";
                            }


                        }

                    }

                    // t19
                    else if(this.input.substring(0,3).equals("Stp")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && pf == 100 && w >= 15 && w <= 250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){
                            floor = 100;
                            return_value += "Display(" + floor + "), ";

                        }

                    }

                }

                else if (floor == 1){

                    // t7
                    if(this.input.substring(0,4).equals("DrOp")){
                        pos = Integer.parseInt(this.input.split("\\(")[1].split("\\)")[0]); // to obtain pos from DrOp(Pos)
                        if(drst == 0 && pos >= 0 && pos <= 15){
                            drst = 1;
                            return_value += "Null, ";
                        }

                    }

                    // t8
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

                    // t4 and t9
                    else if(this.input.substring(0,3).equals("Srv")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w >=15 && w<=250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){

                            if(pf == 0){
                                floor = 0;
                                return_value += "Display(" + floor + "), ";
                            }
                            else if(pf == 2){
                                floor = 2;
                                return_value += "Display(" + floor + "), ";
                            }

                        }
                    }


                    //t6 and t12
                    else if(this.input.substring(0,3).equals("Req")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
                            if(pf == 0){
                                floor = 0;
                                return_value += "Display(" + floor + "), ";
                            }
                            if(pf == 2){
                                floor = 2;
                                return_value += "Display(" + floor + "), ";
                            }

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

                    // t13
                    if(this.input.substring(0,4).equals("DrOp")){
                        pos = Integer.parseInt(this.input.split("\\(")[1].split("\\)")[0]); // to obtain pos from DrOp(Pos)
                        if(drst == 0 && pos >= 0 && pos <= 15){
                            drst = 1;
                            return_value += "Null, ";
                        }
                    }

                    // t14
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

                    // t10 and t15
                    else if(this.input.substring(0,3).equals("Srv")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w >=15 && w<=250 && ph >= 10 && ph <= 35 && ps >= 0 && ps <= 25){
                            if(pf == 1){ // t10
                                floor = 1;
                                return_value += "Display(" + floor + "), ";
                            }
                            else if(pf == 0){ // t15
                                floor = 0;
                                return_value += "Display(" + floor + "), ";
                            }

                        }
                    }


                    // t11 and t18
                    else if(this.input.substring(0,3).equals("Req")){
                        String args = this.input.split("\\(")[1].split("\\)")[0];
                        pf = Integer.parseInt(args.split(",")[0]);
                        ph = Integer.parseInt(args.split(",")[1]);
                        ps = Integer.parseInt(args.split(",")[2]);

                        if(drst == 0 && w == 0 && ph >=10 && ph <= 35 && ps >=0 && ps <=25){
                            if(pf == 1){
                                floor = 1;
                                return_value += "Display(" + floor + "), ";
                            }
                            if(pf == 0){
                                floor = 0;
                                return_value += "Display(" + floor + "), ";
                            }

                        }

                    }

                    // t23
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

                else if(floor == 100){
                    // t20, t21 and t24
                    if(this.input.substring(0,3).equals("Srv")){
                        pf = Integer.parseInt(this.input.split("\\(")[1].split("\\)")[0]);

                        if(drst == 0){
                            if(pf == 0){ // t20
                                floor = 0;
                                return_value += "Display(" + floor + "), ";
                            }
                            if(pf == 1){ // t21
                                floor = 1;
                                return_value += "Display(" + floor + "), ";
                            }
                            if(pf == 2){ // t24
                                floor = 2;
                                return_value += "Display(" + floor + "), ";

                            }

                        }

                    }

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
        this.inputs_arr = inputs.split(" ");
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