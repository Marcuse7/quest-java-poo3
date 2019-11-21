public class Eagle extends Bird {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	public void takeOff() {
		System.out.println(this.getName() + " takes off in the sky.");
		
	}

	public void ascend(int i) {
		this.altitude += i;
		System.out.printf("%s flies upward, altitude: %d%n", this.getName(), altitude );
		
	}

	public void glide() {
		System.out.printf("%s glides into the air.%n", this.getName());
		
	}

	public void descend(int i) {
		if (i > altitude)
			System.out.printf("%s is too high, it can't land.%n", this.getName());
		else {
			this.altitude -= i;
			System.out.printf("%s flies downward, altitude: %d%n", this.getName(), altitude );
		}
			
		
	}

	public void land() {
		if (altitude > 1)
			System.out.printf("%s is too high, it can't land.%n", this.getName());
		else {
			this.altitude = 0 ;
			System.out.printf("%s lands on the ground.%n", this.getName() );
		}
	
	}
    
    
}
