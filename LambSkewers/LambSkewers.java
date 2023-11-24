
public class LambSkewers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu(64, 6);
		int result = menu.total(64, 6);
		System.out.print("양꼬치 : "+menu.getShap()+" 개, 음료수 : "+menu.getDrink()+" 병, "
				+ "\n총 가격 : "+result+"원 입니다.");
		// for(int i=1; i<=n; i++){ n:양꼬치, k:음료수
	    //     answer += 12000;
	    //     if(i%10 == 0){
	    //         k--;
	    //     }
	    // }
	    // for(int j=1; j<=k; j++){
	    //     answer += 2000;
	    // }
		
	}

}


class Menu {
    private int shap;
    private int drink;
    private int[] price = { 12000, 2000 };
    
    Menu(int shap, int drink){
        this.shap = shap;
        this.drink = drink;
    }
    
    public void setShap(int shap){
        this.shap = shap;
    }
    public int getShap(){
        return shap;
    }
    
    public void setDrink(int drink){
        this.drink = drink;
    }
    public int getDrink(){
        return drink;
    }
    
    // 서비스 변수
    public int service(int shap){
        return shap/10;
    }
    
    // 계산 함수
    public int calc(int count, int kprice){
        return count * kprice;
    }
    
    // 총 합계
    public int total(int shap, int drink){
        int result2 = 0;
        int service_p = 0;
        result2 += this.calc(shap, price[0]);
        drink -= this.service(shap);
        if(drink < 0){
            drink = 0;
        }
        result2 += this.calc(drink, price[1]);
        
        return result2;
    }
    
}