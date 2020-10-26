package com.example.penjualan.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.penjualan.models.Penjualan;

public class BlankViewFragmentMain extends ViewModel {
    public MutableLiveData<Double> totalHargaMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<String> idPembeliMutableLiveData = new MutableLiveData<>();
    public Penjualan penjualan = new Penjualan();

    public LiveData<Double> getTotalHargaMutableLiveData() {
        return totalHargaMutableLiveData;
    }

    public void calculateTotal(int jumlahBuku, int harga) {
        totalHargaMutableLiveData.setValue((double) jumlahBuku * (double) harga);
    }

    public LiveData<String> getidPembeli() {
        return idPembeliMutableLiveData;
    }

    public void setName(String idPembeli) {
        idPembeliMutableLiveData.setValue(idPembeli);
    }


}