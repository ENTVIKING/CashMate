package com.ent.cashmate.Bussines.Domain;

import android.graphics.Typeface;

import com.ent.cashmate.R;
import com.ent.cashmate.Ui.Activity.MainActivity;

public class Constants {

    public static final int DelayTimeSplash = 2500;
    public static final int DelayFast = 500;
    public static final int DelayMoreFast = 300;
    public static final int DelayTime = 1500;
    public static final int DelayTimeDialogAnimation = 500;

    public static int[] TypeImageAlertDialog = new int[]{
            R.drawable.ic_baseline_info_black_24,  //0 info
            R.drawable.ic_baseline_info_yellow_24, //1 info
            R.drawable.ic_baseline_warning_24,     //2 error
            R.drawable.ic_baseline_check_circle_24 //3 success
    };

    public static int[] TypeButtonStyleAlertDialog = new int[]{
            R.drawable.shape_background_button_dialog_cancel,
            R.drawable.shape_background_button_dialog_yellow,
            R.drawable.shape_background_button_dialog_red,
            R.drawable.shape_background_button_dialog_confirm,
            R.drawable.shape_background_button_dialog_confirm_light

    };

    public static String[] PriceTypeHeader = new String[]{

            "خرید",
            "اجاره",
            "ماشین",
            "حوراک",
            "رفت و آمد",
            "سرگرمی",
            "قبوض"

    };

    public static int[] PriceTypeHeaderPicture = new int[]{

            R.drawable.icons8_shopee_64,
            R.drawable.icons8_rent_64,
            R.drawable.icons8_car_64,
            R.drawable.icons8_ingredients_64,
            R.drawable.icons8_traveler_64,
            R.drawable.icons8_entertainment_64,
            R.drawable.icons8_cash_receipt_64

    };

    public static String[] ByPriceTypeItem = new String[]{

            "کارت شارژ",
            "اینترنت",
            "هدیه",
            "لباس",
            "دارو",
            "کتاب",
            "کالا"

    };

    public static String[] RentPriceTypeItem = new String[]{

            "خانه",
            "مغازه",
            "شرکت"

    };
    public static String[] CarPriceTypeItem = new String[]{

            "بنزین",
            "بیمه",
            "جریمه",
            "تعمیرگاه"

    };
    public static String[] FoodPriceTypeItem = new String[]{

            "رستوران",
            "کافی شاپ",
            "آنلاین شاپینگ"

    };
    public static String[] CommutingPriceTypeItem = new String[]{

            "اتوبوس",
            "تاکسی",
            "مترو"
    };
    public static String[] EntertainmentPriceTypeItem = new String[]{

            "شهربازی",
            "کنسرت",
            "سینما"

    };

    public static String[] CashReceiptPriceTypeItem = new String[]{

            "تلفن همراه",
            "تلفن ثابت"

    };


}
