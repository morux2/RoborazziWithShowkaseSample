package com.example.roborazziwithshowkasesample.ui

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(group = "MyUIPreview", device = Devices.PHONE)
annotation class MyUIPreview

@Preview(group = "MyTabletUIPreview", device = Devices.TABLET)
annotation class MyTabletUIPreview

@Preview(group = "MyScreenPreview", device = Devices.PHONE)
@Preview(group = "MyScreenPreview", device = Devices.TABLET)
annotation class MyScreenPreview