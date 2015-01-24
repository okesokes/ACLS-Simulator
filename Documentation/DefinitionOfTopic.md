
**Topic:** ACLS simulator is very experimental piece of software that simulates situations where the patient is in cardiac arrest from perspective of EMS personnel.

At first, the program initializes status of patient, and the user must analyze it properly and choose and follow the correct treatment algorithms to revive the patient successfully. The program prints prognosis of patient after the situation has ended (in either the patient being revived successfully or death of patient). Prognosis contains *very rough* estimation of long term prognosis in terms of damage caused to CNS by hypoxia/anoxia. For example, the patient can be successfully revived even after severely delayed ROSC (return of spontaneous circulation), but the long term prognosis can still be hopeless because of fatal damage of CNS caused by lack of oxygen supply to neural cells.

**Users:**
 - 

**Functionality of every user:**
 - functionality of the whole program

**Functionality:**
 - real-time simulation of status of patient including
	- circulation
		- heart BPM (beats per minute)
		- blood pressure
		- heart state
			- rhythm (SC/VF/VT/TA/BRA/PEA/ASY)
	- ventilation
		- breathing frequency (BF)
	- CNS (central nervous system) status
		- level of cerebral perfusion & oxygenation
		- cumulative cerebral damage caused by hypoxia/anoxia
	(- pH)
		(- effects of pH control during lack of spontaneus circulation)

- treatment of patient from perspective of EMS personnel
	- options based on treatment algorithms of heart state only
	- ATTN: possibility to diagnose and treat underlying cause of cardiac arrest is planned but might not be implemented, depending on schedule

- prognosis after situation has ended
	- immediate results (current state of patient)
	- long term prognosis (mainly determined by cerebral damage)
