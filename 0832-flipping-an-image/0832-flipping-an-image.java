class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int temp=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                temp=image[i][j];
                image[i][j]=image[i][c-j-1];
                image[i][c-j-1]=temp;

            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
       // System.out.println(image);
        return image;
        
    }
}