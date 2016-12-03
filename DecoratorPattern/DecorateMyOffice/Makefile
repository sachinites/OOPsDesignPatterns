exe: Main.o Office.o
	g++ -g Main.o Office.o -o exe
Office.o: Office.cpp
	g++ -g -c Office.cpp -o Office.o
Main.o: Main.cpp
	g++ -g -c Main.cpp -o Main.o
clean:
	rm *.o
	rm exe
