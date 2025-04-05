class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector <int> evens;
        vector <int> odd;
        for(int num : nums)
            {
            if(num%2==0){
                evens.push_back(num);
            }
            else
            {
                odd.push_back(num);
            }
            }
            evens.insert(evens.end(),odd.begin(),odd.end());
            return evens;
    }
};