import sys

def main():
	with open('out.txt', 'w') as f:
		f.write(sys.argv[1])

if __name__ == "__main__":
	main()