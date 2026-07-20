class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int>a;
        vector<int>b;
        
        
        for(int i=0;i<m;i++){
            a.push_back(nums1[i]);
        }
        for(int i=0;i<n;i++){
            b.push_back(nums2[i]);
        }
        a.insert(a.end(), b.begin(), b.end());;
        sort(a.begin(),a.end());
        for(int j=0;j<nums1.size();j++){
            nums1[j]=a[j];
        }

    }
};