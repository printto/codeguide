# codeguide

## DRY (Don't Repeat Yourself)

DRY is a principle of software development which reduces duplication of the codes
and when you want to edit the code, you won't have to edit many lines of codes.

For example, when you keep repeating your code or you need to use that code many times,
you may refactor that code to be new method or variable instead.

Bad code:
```
double areaOf1Circle = Math.PI*2*2;
double areaOf2Circle = (Math.PI*2*2)*2;
double areaOf3Circle = (Math.PI*2*2)*3;
```

Good code:
```
int r = 2;
double areaOf1Circle = Math.PI*r*r;
double areaOf2Circle = (areaOf1Circle)*2;
double areaOf3Circle = (areaOf1Circle)*3;
```
### Exercise: [Click here](https://github.com/printto/codeguide/blob/master/src/codeguide/DRY.java)
### Reference: [Don't Repeat Yourself](https://en.wikipedia.org/wiki/Don't_repeat_yourself)

## Avoid Almighty Classes, Use Meaningful Names

1 class shouldn’t has too many responsibilities or do many things that not related to each other.

Meaningful name make the code much more understandable and reduce confusion when you come back to edit it or fix it. It save more time than too look through all of the code to understand the responsibilities of the class again.

For example, in ```stopwatch``` project, ```TaskTimer``` shouldn't do anything rather than running the Runnable Object and record the time.

Example code:
```
public static void mesureAndPrint(Runnable r){
		Stopwatch timer = new Stopwatch();
		System.out.println( r );
		timer.start();
		r.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
```
### Exercise: [Click here](https://github.com/printto/codeguide/blob/master/src/codeguide/AvoidAlmightyClass.java)
### Reference: [Avoid Almighty Classes](https://www.codeproject.com/Articles/768052/Golden-Rules-Of-Good-OOP)
