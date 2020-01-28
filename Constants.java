package frc.robot;



public final class Constants {
    public static final class motorIDConst{
       public static final int leftDeviceID = 4;
       public static final int rightDeviceID = 2;
       public static final int leftFDeviceID = 3;
       public static final int rightFDeviceID = 8;
       public static final int intakeID = 10;
	   
    }
	public static final class encoderConstants{
		public final Encoder m_shooterEncoder = new Encoder(0, 1,true);
		public final SimpleMotorFeedforward m_shooterFeedforward = new SimpleMotorFeedforward(0.05, 0.24);
		
	}
}