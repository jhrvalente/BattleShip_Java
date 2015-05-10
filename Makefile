JFLAGS = -g
JC = javac

.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) -cp ${CLASSPATH} $*.java

CLASSES = \
        GameBoard.java \
        GameWindow.java \
        Main.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class