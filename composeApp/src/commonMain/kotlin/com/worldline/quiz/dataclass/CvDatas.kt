package com.worldline.quiz.dataclass

data class CvDatas(
    val firstname: String,
    val lastname: String,
    val address: String,
    val mail: String,
    val title: String,
    val experience: List<ExperiencesDatas> = emptyList(),
    val education: List<SchoolDatas> = emptyList(),
    val skills: List<String> = emptyList(),
    val city: String,
    val phone: String
) {
    val fullname: String
        get() = "$firstname $lastname"
}

