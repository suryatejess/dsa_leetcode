class Solution(object):
    def minMovesToSeat(self, seats, students):
        '''
        len(seats[]) = n
        len(students[]) = n      
        [1,4,5,9]  --> [1,2,3,6]   
        '''
        output = 0
        seats.sort()
        students.sort()

        for i in range(len(seats)):
            output += abs(students[i] - seats[i])
        
        return output
