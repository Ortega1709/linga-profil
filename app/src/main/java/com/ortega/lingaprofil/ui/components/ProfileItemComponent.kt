package com.ortega.lingaprofil.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortega.lingaprofil.R
import com.ortega.lingaprofil.ui.theme.LingaProfilTheme

@Composable
fun ProfileItemComponent(onClickItem: ()->Unit) {

    ListItem(
        modifier = Modifier.clickable { onClickItem() },
        leadingContent = {
            ImageProfileComponent(image = "", name = stringResource(id = R.string.example_name))
        },
        headlineContent = {
            Text(
                text = stringResource(id = R.string.example_name),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        },

        overlineContent = {
            Text(
                text = stringResource(id = R.string.example_profession),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    )

    Divider(
        modifier = Modifier.height(height = .5.dp)
    )

}
