import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductoViewModel : ViewModel() {
    private val _products = MutableLiveData<MutableList<Producto>>(mutableListOf())
    val products: LiveData<MutableList<Producto>> get() = _products

    fun addProduct(product: Producto) {
        _products.value?.add(product)
        _products.value = _products.value // Trigger LiveData update
    }
}