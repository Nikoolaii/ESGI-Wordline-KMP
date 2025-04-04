package com.worldline.quiz.vues

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import com.worldline.quiz.components.sectionTitle
import com.worldline.quiz.dataclass.CvDatas
import leftInfo
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import wordlinequiz.composeapp.generated.resources.Res
import wordlinequiz.composeapp.generated.resources.pdp

@Composable
@Preview
fun cvScreen(data : CvDatas){
    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        Column(
            modifier = Modifier
                .weight(0.40f)
                .fillMaxHeight()
                .background(Color(0xFF84A98C))
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(15.dp)),
        ) {
            Image(
                painter = painterResource(Res.drawable.pdp),
                contentDescription = "Image arrondie",
                modifier = Modifier
                    .size(120.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Gray)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(26.dp))
            leftInfo(Icons.Filled.Email, "Email", data.mail, color = Color.White)
            leftInfo(Icons.Filled.LocationOn, "Address", data.address, color = Color.White)
            leftInfo(Icons.Filled.LocationOn, "City", data.city, color = Color.White)
            leftInfo(Icons.Filled.Phone, "Phone", data.phone, color = Color.White)
        }


        Column(
            modifier = Modifier
                .weight(0.60f)
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            Text(data.fullname, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))

            Text(data.title, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(16.dp))

            sectionTitle("Experience")
            for (experience in data.experience) {
                Column(modifier = Modifier
                    .padding(bottom = 4.dp)
                    .padding(start = 4.dp)
                ){
                    Text(text = experience.position, fontSize = 14.sp)
                    Text(text = experience.date + " - " + experience.company, fontSize = 12.sp)
                    Text(text = experience.description, fontSize = 12.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            sectionTitle("Education")
            for (education in data.education) {
                Column(modifier = Modifier
                    .padding(bottom = 4.dp)
                    .padding(start = 4.dp)
                ){
                    Text(text = education.degree, fontSize = 14.sp)
                    Text(text = education.date , fontSize = 12.sp)
                    Text(text = education.school, fontSize = 12.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            sectionTitle("Skills")
            for (skill in data.skills) {
                Text(text = skill, modifier = Modifier
                    .padding(bottom = 2.dp)
                    .padding(start = 4.dp),
                    fontSize = 14.sp)
            }
        }
    }
}