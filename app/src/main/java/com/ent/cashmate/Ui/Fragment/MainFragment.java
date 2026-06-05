package com.ent.cashmate.Ui.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.ent.cashmate.InfraStructure.Utility;
import com.ent.cashmate.R;

public class MainFragment extends Fragment implements View.OnClickListener {

    private NavController navController;

    private CardView cvInvoiceList, cvAddInvoiceList;
    private ImageView imgInvoiceListMore, imgAddInvoiceListMore;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        navController = Navigation.findNavController(view);

        cvInvoiceList = view.findViewById(R.id.cv_show_invoices);
        cvAddInvoiceList = view.findViewById(R.id.cv_add_invoices);

        imgInvoiceListMore = view.findViewById(R.id.ArrowImg);
        imgAddInvoiceListMore = view.findViewById(R.id.ArrowImg2);

        cvInvoiceList.setOnClickListener(this);
        cvAddInvoiceList.setOnClickListener(this);
        imgInvoiceListMore.setOnClickListener(this);
        imgAddInvoiceListMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.ArrowImg) {
            Utility.RotateImage(imgAddInvoiceListMore);
            new Handler(Looper.getMainLooper()).postDelayed(() -> {

                navController.navigate(R.id.action_mainFragment_to_addInvoicesFragment);
            }, 500);

        } else if (v.getId() == R.id.ArrowImg2) {
            Utility.RotateImage(imgInvoiceListMore);
            new Handler(Looper.getMainLooper()).postDelayed(() -> {

                navController.navigate(R.id.action_mainFragment_to_listInvoicesFragment);
            }, 500);

        } else if (v.getId() == R.id.cv_show_invoices) {
            new Handler(Looper.getMainLooper()).postDelayed(() -> {

                navController.navigate(R.id.action_mainFragment_to_listInvoicesFragment);
            }, 500);

        } else if (v.getId() == R.id.cv_add_invoices) {
            new Handler(Looper.getMainLooper()).postDelayed(() -> {

                navController.navigate(R.id.action_mainFragment_to_addInvoicesFragment);
            }, 500);
        }
    }
}
