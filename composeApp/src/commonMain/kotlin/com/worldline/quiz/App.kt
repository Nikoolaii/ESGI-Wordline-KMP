package com.worldline.quiz

import androidx.compose.runtime.*
import com.worldline.quiz.dataclass.CvDatas
import com.worldline.quiz.dataclass.SchoolDatas
import com.worldline.quiz.dataclass.ExperiencesDatas
import com.worldline.quiz.vues.cvScreen
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
//    welcomeScreen()
    val cvData = CvDatas(
        firstname = "Nikolaï",
        lastname = "Lemerre",
        address = "12 rue de l'abbé bonpain, apt 93, 59491",
        city= "VILLENEUVE D'ASCQ",
        phone="0752674453",
        mail = "nikolailemerre@gmail.com",
        title = "Développeur web en alternance",
        experience = listOf(
            ExperiencesDatas(date = "09/2023 - Now", company = "Netim", position = "Développeur web en alternance", description = "Mise en place de module CMS en PHP"),
            ExperiencesDatas(date = "09/2022 - 09/2023", company = "NordReprog", position = "Gestionnaire BDD en alternance", description = "Gestion de fichier reprogrammation moteur"),
            ExperiencesDatas(date = "05/2022 - 06/2022", company = "Anetmo", position = "Développeur web en stage", description = "Création d'une application web en PHP")
        ),
        skills = listOf("PHP", "Javascript", "HTML/Css"),
        education = listOf(
            SchoolDatas(date = "09/2021 - 07/2023", school = "Gaston Berger - Lille", "BTS SIO option SLAM"),
            SchoolDatas(date = "09/2023 - 08/2024", school = "ESGI - Lille", "Bachelor Ingénieurie du web"),
            SchoolDatas(date = "09/2024 - Now", school = "ESGI - Lille", "Master Ingénieurie du web")
        ),
    )
    cvScreen(cvData)
}