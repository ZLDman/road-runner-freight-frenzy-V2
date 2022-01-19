package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/*
 * Simple mecanum drive hardware implementation for REV hardware.
 */
@Config
public class Robot2 {

    public DcMotor extend;
    public DcMotor lift;
    public CRServo s;



    public Robot2(HardwareMap hardwareMap) {
        lift = hardwareMap.get(DcMotor.class, "lift");
        extend = hardwareMap.get(DcMotor.class, "extend");
        s = hardwareMap.get(CRServo.class,"s");
        lift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        extend.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    void setLiftSpeed(double s){
        lift.setPower(s);
    }

    void setRotateSpeed(double s){
        extend.setPower(s);
    }
}
