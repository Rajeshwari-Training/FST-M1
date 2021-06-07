	
fruit_shop = {
	
    "jack": 25,
	
    "papaya": 50,
	
    "orange": 20,
	
    "mango": 100
	
}

key_to_check = input("What are you looking for? ").lower()
if(key_to_check in fruit_shop):
	
    print("Yes, this is available")
	
else:
	
    print("No, this is not available")
