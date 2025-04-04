import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.worldline.quiz.dataclass.CvDatas
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun leftInfo(icon: ImageVector, contentDescription: String, text: String, color: Color = Color.Black){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Text(
            text = text,
            modifier = Modifier.padding(start = 8.dp)
            .align(Alignment.CenterVertically),
            color = color,
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}