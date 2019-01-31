import java.util.Scanner;


public class Test {

	static int[] OneDim;
	static int[][] TwoDim;
	static int[][][] ThreeDim;
	static int[][][][] FourDim;
	static int[][][][][] FiveDim;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OneDim = new int[10];
		TwoDim = new int[10][10];
		ThreeDim = new int[10][10][10];
		FourDim = new int[10][10][10][10];
		FiveDim = new int[10][10][10][10][10];
		
		for(int One = 0; One < OneDim.length; One++){
			OneDim[One]=One;
			for(int Two = 0; Two < TwoDim.length; Two++){
				TwoDim[One][Two] = One*Two;
				for(int Three = 0; Three < ThreeDim.length; Three++){
					ThreeDim[One][Two][Three] = One*Two*Three;
					for(int Four = 0; Four < FourDim.length; Four++){
						FourDim[One][Two][Three][Four] = One*Two*Three*Four;
						for(int Five = 0; Five < FiveDim.length; Five++){
							FiveDim[One][Two][Three][Four][Five] = One* Two*Three*Four*Five;
						}
					}
				}
			}
		}
		
		for(int One = 0; One < OneDim.length; One++){
			System.out.print(OneDim[One]);
		}
		for(int One = 0; One < OneDim.length; One++){
			for(int Two = 0; Two < TwoDim.length; Two++){
				System.out.print(TwoDim[One][Two]);
			}
			System.out.print("\n");
		}
		for(int One = 0; One < OneDim.length; One++){
			for(int Two = 0; Two < TwoDim.length; Two++){
				for(int Three = 0; Three < ThreeDim.length; Three++){
					System.out.print(ThreeDim[One][Two][Three]);
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		for(int One = 0; One < OneDim.length; One++){
			for(int Two = 0; Two < TwoDim.length; Two++){
				for(int Three = 0; Three < ThreeDim.length; Three++){
					for(int Four = 0; Four < FourDim.length; Four++){
						System.out.print(FourDim[One][Two][Three][Four]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		for(int One = 0; One < OneDim.length; One++){
			for(int Two = 0; Two < TwoDim.length; Two++){
				for(int Three = 0; Three < ThreeDim.length; Three++){
					for(int Four = 0; Four < FourDim.length; Four++){
						for(int Five = 0; Five < FiveDim.length; Five++){
							System.out.print(FiveDim[One][Two][Three][Four][Five]);
						}
						System.out.print("\n");
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Wieviele Zahlen generieren?");
//		int i = scanner.nextInt();
//			
//
//		
//		
//		int [] array = new int[i];
//		
//		for (int f = 0;f<i; f++){
//			array[f]=f+1;
//			System.out.println(array[f]);
//			
//		}
			
//		scanner.close();

	}
	
	

}
