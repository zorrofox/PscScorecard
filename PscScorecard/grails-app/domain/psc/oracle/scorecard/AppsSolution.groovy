package psc.oracle.scorecard

class AppsSolution {
	
	int solutionNo
	String solutionName
	Partner partner
	String product
    Boolean nomoinated
	String industry
	String subIndustry
	Boolean businessApproval
	String overallStatus
	String inPhase
	Date targetReleasedDate
	Person pscBdOwner
	Person csmOwner
	Person pdmOwner
	Person pscProjectLead
	Person pscSa
	String solutionType
	Boolean devSupport
	Boolean trainingSupport
	Boolean solutionValidation
	Boolean marketingSupport
	Boolean pscReviewCommitee
	Boolean partnerTeamInPlace
	Boolean projectPlanInPlace
	Boolean salesKitInPlace
	Boolean gtmiLaunchDefined
	String status
	long pipeline
	String gcmNumber
		

    static constraints = {
		solutionNo min: 1, blan:false
		solutionName blank: false
		partner blank: false
		product blank: false
		industry blank: false, inList: ['Cross','MRD','FSI','GEH','GB','CMU','Commercial']
		subIndustry blank: false
		businessApproval blank: false
		overallStatus blank: false, inList: ['On-going', 'Milestone', 'Completed', 'Initialize', 'Kickoff']
		inPhase blank: false, inList: ['Build', 'Kickoff', 'Mobilize', 'GTMi']
		targetReleasedDate blank: false
		pscBdOwner blank: false
		csmOwner blank: false
		pdmOwner blank: false
		pscProjectLead blank: false
		pscSa blank:false
		solutionType blank:false, inList: ['Development', 'Validation']
		devSupport blank: false
		trainingSupport blank: false
		solutionValidation blank: false
		marketingSupport blank: false
		pscReviewCommitee blank: false
		partnerTeamInPlace blank: false
		projectPlanInPlace blank: false
		salesKitInPlace blank: false
		gtmiLaunchDefined blank: false
		status nullable: true
		pipeline nullable: true
		gcmNumber nullable:true
		
    }
	
	static hasMany = [pscSa: Person]
}
