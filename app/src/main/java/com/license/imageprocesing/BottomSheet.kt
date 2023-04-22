package com.license.imageprocesing

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun BottomSheet(
    retake: () -> Unit,
    knn: () -> Unit,
    isoData: () -> Unit,
    kMeans: () -> Unit,
) {
    Column(modifier = Modifier/*.align(Alignment.BottomCenter)*/) {
        TextButton(onClick = retake) {
            Text("RETAKE")
        }
        TextButton(onClick = knn) {
            Text("KNN")
        }
        TextButton(onClick = isoData) {
            Text("ISODATA")
        }
        TextButton(onClick = kMeans) {
            Text("K-MEANS")
        }
    }
}