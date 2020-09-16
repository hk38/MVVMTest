package lit.amida.mvvmtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {

    var liveDataText: MutableLiveData<String> = MutableLiveData()

    fun fetchText() {
        liveDataText.value = TestModel().fetchText()
    }
}