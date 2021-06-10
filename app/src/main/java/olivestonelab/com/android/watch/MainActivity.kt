package olivestonelab.com.android.watch

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : WearableActivity() {

  private lateinit var viewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java)
    // Enables Always-on
    setAmbientEnabled()
  }
}