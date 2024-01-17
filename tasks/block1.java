public class block1
{
	public static void main(String[] args) {

		// int taskNum = 10; //выбор выполняемого задания

		// switch (taskNum) {
		// 	case (1):
			
				int a = 5;
				int b = 3;
				int c = 8;
				System.out.println(convert(a));
				System.out.println(convert(b));
				System.out.println(convert(c));
				// break;

			// case (2):

				int time_in_minutes = 24;
				int intensity = 2;
				System.out.println(fitCalc(time_in_minutes,intensity));
				// break;

			// case (3):

				int boxes_amount = 3;
				int bags_amount = 4;
				int barrels_amount = 2;
				System.out.println(containers(boxes_amount,bags_amount,barrels_amount));
				boxes_amount = 5;
				bags_amount = 0;
				barrels_amount = 2;
				System.out.println(containers(boxes_amount,bags_amount,barrels_amount));
				// break;

			// case (4):

				int X = 5, Y = 5, Z = 5;
				System.out.println(Integer.toString(X)+" "+Integer.toString(Y)+" "+Integer.toString(Z));
				System.out.println(triangleType(X,Y,Z));

				X = 5; Y = 4; Z = 5;
				System.out.println(Integer.toString(X)+" "+Integer.toString(Y)+" "+Integer.toString(Z));
				System.out.println(triangleType(X,Y,Z));

				X = 3; Y = 4; Z = 5;
				System.out.println(Integer.toString(X)+" "+Integer.toString(Y)+" "+Integer.toString(Z));
				System.out.println(triangleType(X,Y,Z));

				X = 5; Y = 1; Z = 1;
				System.out.println(Integer.toString(X)+" "+Integer.toString(Y)+" "+Integer.toString(Z));
				System.out.println(triangleType(X,Y,Z));
				// break;

			// case (5):
			
				a = 8; b = 4;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ternaryEvaluation(a,b));
				
				a=1;b=11;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ternaryEvaluation(a,b));
				
				a=5;b=9;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ternaryEvaluation(a,b));
				// break;

			// case (6):

				float n = (float) 22.0;
				float w = (float) 1.4;
				float h = (float) 2.0;
				System.out.println(Double.toString(n)+" "+Double.toString(w)+" "+Double.toString(h));
				System.out.println(howManyItems(n,w,h));
				
				n = (float) 45.0;
				w = (float) 1.8;
				h = (float) 1.9;
				System.out.println(Double.toString(n)+" "+Double.toString(w)+" "+Double.toString(h));
				System.out.println(howManyItems(n,w,h));
				
				n = (float) 100.0;
				w = (float) 2.0;
				h = (float) 2.0;
				System.out.println(Double.toString(n)+" "+Double.toString(w)+" "+Double.toString(h));
				System.out.println(howManyItems(n,w,h));
				// break;

			// case (7):

				Integer n7 = 3;
				System.out.println(Integer.toString(n7));
				System.out.println(factorial(n7));
				
				n7 = 5;
				System.out.println(Integer.toString(n7));
				System.out.println(factorial(n7));
				
				n7 = 7;
				System.out.println(Integer.toString(n7));
				System.out.println(factorial(n7));
				// break;

			// case (8):
			
				a = 48; b = 18;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(gcd(a,b));
				
				a=52;b=8;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(gcd(a,b));
				
				a=259;b=28;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(gcd(a,b));
				// break;

			// case (9):

				a = 70; b = 1500;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ticketSaler(a,b));
				
				a=24;b=950;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ticketSaler(a,b));
				
				a=53;b=1250;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(ticketSaler(a,b));
				// break;

			// case (10):

				a = 5; b = 2;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(tables(a,b));
				
				a=31;b=20;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(tables(a,b));
				
				a=123;b=58;
				System.out.println(Integer.toString(a)+" "+Integer.toString(b));
				System.out.println(tables(a,b));
				// break;

		// 	default:
		// 		System.out.println("ERROR");
		// 		break;
		// }
	}

	public static float convert(int x){ //1
		return x*3.785f;
	}

	public static int fitCalc(int x, int y){ //2
		return x*y;
	}

	public static int containers(int boxes,int bags, int barrels){ //3
		return boxes*20 + bags*50 + barrels*100;
	}

	public static String triangleType(int x, int y, int z){//4
		if ((x >= y+z) || (y >= x + z) || (z >= x + y)){
			return (String)"не является треугольником / not a triangle";
		}
		else if ((x==y) && (y==z) && (z==x)){
			return (String)"равносторонний / equilateral";
		}
		else if ((x==y) || (y==z) || (z==x)) {
			return (String)"равнобедренный / isosceles";
		}
		else {
			return (String)"разносторонний / different-sided";
		}
	}

	public static int ternaryEvaluation(Integer A, Integer B){ //5
		return (int) (A>B ? A : B);
	}

	public static int howManyItems(float n, float w, float h){ //6
		int res = Double.valueOf((n/2)/(h*w)).intValue();
		return res;
	}

	public static int factorial(int N){ //7
        int res = 1;
		for(int i=1;i<=N;i++){
            res*=i;
        }
        return res;
	}

	public static int gcd(int a, int b){ //8
		while (a != b) { //алгоритм Евклида 
            if(a>b){
                a = a-b;
            } else {
                b = b - a;
            }
        }
        return a;
	}

	public static Double ticketSaler(int a, int b){ //9
        return a*b*0.72;
	}

	public static int tables(int a, int b){ //10
        int res = 0;
        res = a - b*2;
        if (res<0){
            return 0;
        }
        int needed_tables = 0;
        for (int i=res;i>0;){
            i-=2;
            needed_tables+=1;
        }
        return needed_tables;
	}


}

/* LocalDateTime dateTimeA = parseTimestamp(timestampA);
        LocalDateTime dateTimeB = convertToCity(dateTimeA, cityA, cityB);
        
        return formatTimestamp(dateTimeB);
    }
    
    public static LocalDateTime parseTimestamp(String timestamp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm");
        return LocalDateTime.parse(timestamp, formatter);
    }
    
    public static LocalDateTime convertToCity(LocalDateTime dateTime, String cityA, String cityB) {
        int difference = getCityOffset(cityB) - getCityOffset(cityA);
        return dateTime.plus(difference, ChronoUnit.HOURS);
    }
    
    public static int getCityOffset(String city) {
        Map<String, Integer> cityOffsets = createCityOffsets();
        return cityOffsets.get(city);
    }
    
    public static Map<String, Integer> createCityOffsets() {
        Map<String, Integer> cityOffsets = new HashMap<>();
        cityOffsets.put("Los Angeles", -8);
        cityOffsets.put("New York", -5);
        cityOffsets.put("Caracas", -4*60+30);
        cityOffsets.put("Buenos Aires", -3);
        cityOffsets.put("London", 0);
        cityOffsets.put("Rome", 1);
        cityOffsets.put("Moscow", 3);
        cityOffsets.put("Tehran", 3*60+30);
        cityOffsets.put("New Delhi", 5*60+30);
        cityOffsets.put("Beijing", 8);
        cityOffsets.put("Canberra", 10);
        return cityOffsets;
    }
    
    public static String formatTimestamp(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm");
        return dateTime.format(formatter);
 */