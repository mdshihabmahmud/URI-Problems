#include <stdio.h>

int main(){
    
    int k, n, m, x, y, i;
    
    while(1){
             scanf("%d", &k);
             if(k == 0) break;
             
             scanf("%d %d", &n, &m);
             
             for(i = 0; i < k; i++){
                   scanf("%d %d", &x, &y);
                   if(x == n || y == m) printf("divisan");
                   else if(x > n && y > m) printf("NEn");
                   else if(x > n && y < m) printf("SEn");
                   else if(x < n && y > m) printf("NOn");
                   else if(x < n && y < m) printf("SOn");
             }
    }
    return 0;
}
