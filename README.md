	•	“This JAR is an SDK” → use this to write plugins for our system
	•	“This JAR is a plugin” → drop this into the system, it’ll be picked up and run
	•	“This JAR is a library” → use this to get helper functions, but don’t extend it or plug it in	

    •	SDK = JAR that defines the pluggable API
	•	Plugin = JAR that implements the SDK’s API
	•	Core = JAR that loads plugins using the SDK’s API
	•	JARs contain compiled .class files — not source code.
	•	Plugin devs don’t need source of SDK — they just need the compiled interfaces.

So yes, SDKs are distributed as compiled JARs — and that’s perfectly fine.


You could call an SDK “an interface-only JAR” — but the term SDK adds:
•	Intent (“this is for others to build on”)
•	Structure (interfaces + maybe annotations + docs + samples)
•	Expectation (versioning, backward compatibility, etc.)


Just seeing that “SDK” is a semantic/architectural label applied to a JAR that plays a specific role in a modular system.
