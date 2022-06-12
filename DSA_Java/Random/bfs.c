#include <stdio.h>
int visited[7]= {0,0,0,0,0,0,0};

int A[7][7]={
       //0 1 2 3 4 5 6
        {0,1,1,1,0,0,0},
        {1,0,1,0,0,0,0},
        {1,1,0,1,1,0,0},
        {1,0,1,0,1,0,0},
        {0,0,1,1,0,1,1},
        {0,0,0,0,1,0,0}, 
        {0,0,0,0,1,0,0}    
};

void dfs (int i){
    int j;
    printf(" --> ");
    printf("%d",i);
    visited[i]=1;
    for(int j=0; j<7; j++){
        if (A[i][j]==1 && !visited[j]){
            dfs(j);
        }
    }
}

int main() {

    printf("Path is: ");
    dfs(1);
    
    return 0;
}
