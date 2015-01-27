
*Advanced Cardiac Life Support Simulator* is very experimental piece of software that simulates situations where the patient is in cardiac arrest from perspective of EMS personnel.

At first, the program initializes status of patient, and the user must analyze it properly and choose and follow the correct treatment algorithms (based on e.g. heart state) to revive the patient successfully. The program prints prognosis of patient after the situation has ended (in either the patient being revived successfully or death of patient). Prognosis contains *very rough* estimation of long term prognosis in terms of damage caused to CNS by hypoxia/anoxia. For example, the patient can be successfully revived even after severely delayed ROSC (return of spontaneous circulation), but the long term prognosis can still be hopeless because of fatal damage of CNS caused by lack of oxygen supply to neural cells.

**Users:**
 - 

**Functionality of every user:**
 - functionality of the whole program

**Planned functionality:**
 - real-time simulation of status of patient including:
	- circulation
		- heart BPM (beats per minute)
		- blood pressure
			- systolic pressure
			- diastolic pressure
			- pulse pressure
			- perfusion pressure (/ main arterial pressure)
		- heart state
			- rhythm patterns - VF/VT/ST/SB/PEA/ASY (might implement more rhythms in future)
				- VF = Ventricular Fibrillation
				- VT = Ventricular Tachycardia
				- ST = Sinus Tachycardia
				- SB = Sinus Bradycardia
				- PEA = Pulseless Electrical Activity
				- ASY = Asystole
		- effect of body temperature
			- too cold heart won't start beating
			- chest compressions applied to severely hypothermic patient (core temp < 30°C) can trigger VF
			- on the other hand, hypothermia protects CNS from damage caused by hypoxia/anoxia
	- respiration
		- frequency of breathing (BF)
		- (quality of breathing)
			- normal breathing
			- agonal breathing (agonal)
			- respiratory arrest
	- CNS (central nervous system) status
		- level of cerebral perfusion & oxygenation
		- cumulative cerebral damage caused by hypoxia/anoxia
		- effect of body temperature in tolerance of hypoxia
	- (pH)
		- (possibly effects of acidosis control during lack of spontaneus circulation in future)

- treatment of patient from perspective of EMS personnel
	- options based on treatment algorithms
		- control of circulation and ventilation
			- ACLS
				- advanced CPR (cardiopulmonary resuscitation)
					- mechanical ventilation
						- masks (e.g. larynx mask)
						- intubation
						- emergency tracheosthomy
					- chest compressions
						- (semi-)realistic efficiency monitoring
							- frequency monitoring
							- stagnation of blood pressure and perfusion during breaks in chest compressions
					- defibrillation
						- automatic defibrillator simulation (incl. recognition of rhythm pattern)
						- biphasic 150/200 J
						- (possibly option to choose manual defibrillator instead of automatic one in future)
					- iv. drug administration
						- epinephrine/adrenaline bolus injections
						- amiodarone
						- (possibly control of acidosis and buffering via sodium bicarbonate or TBM in future)
	- (*ATTN:* possibility to diagnose and treat underlying cause of cardiac arrest is planned but might not be implemented, depending on schedule)

- debriefing (prognosis)
	- immediate results (current state of patient)
	- long term prognosis (mainly determined by cerebral damage)
