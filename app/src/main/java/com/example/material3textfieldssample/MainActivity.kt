package com.example.material3textfieldssample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.material3textfieldssample.ui.theme.Material3TextfieldsSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3TextfieldsSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        var filledText by remember {
                            mutableStateOf("")
                        }

                        TextField(
                            value = filledText,
                            onValueChange = {
                                filledText = it
                            },
                            enabled = true, // false: user can still select and copy text
                            readOnly = false, // true: user cannot select and copy text
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(text = "Enter your weight")
                            },
                            placeholder = {
                                Text(text = "Your weight")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Person,
                                    contentDescription = "Weight"
                                )
                            },
//                            prefix = {
//                                Text(text = "$")
//                            },
                            suffix = {
                                Text(text = "kg")
                            },
                            supportingText = {
                                // give a little bit more information (like "required")
                                Text(text = "*required")
                            },
//                            supportingText = {
                            // Error case
//                                Text(text = "Please choose a real weight.")
//                            },
//                            isError = true
//                            visualTransformation = PasswordVisualTransformation() // for password input
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next // also Search or Enter possible for keyboard
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("User clicked next on the keyboard")
                                }
                            )
                        )
                        Spacer(Modifier.height(16.dp))

                        var outlinedText by remember {
                            mutableStateOf("")
                        }

                        OutlinedTextField(
                            value = outlinedText,
                            onValueChange = {
                                outlinedText = it
                            },
                            enabled = true, // false: user can still select and copy text
                            readOnly = false, // true: user cannot select and copy text
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(text = "Enter your weight")
                            },
                            placeholder = {
                                Text(text = "Your weight")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Person,
                                    contentDescription = "Weight"
                                )
                            },
//                            prefix = {
//                                Text(text = "$")
//                            },
                            suffix = {
                                Text(text = "kg")
                            },
                            supportingText = {
                                // give a little bit more information (like "required")
                                Text(text = "*required")
                            },
//                            supportingText = {
                            // Error case
//                                Text(text = "Please choose a real weight.")
//                            },
//                            isError = true
//                            visualTransformation = PasswordVisualTransformation() // for password input
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next // also Search or Enter possible for keyboard
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("User clicked next on the keyboard")
                                }
                            )
                        )

                    }
                }
            }
        }
    }
}