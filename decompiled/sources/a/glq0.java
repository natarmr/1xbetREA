package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.themesettings.impl.presentation.timepicker.DisallowInterceptView;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class glq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final glq0 f11506a = new glq0(1, iq8.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/themesettings/impl/databinding/BottomSheetTimePickerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_time_picker, (ViewGroup) null, false);
        int i = R.id.disallowInterceptView;
        View viewF = yum0.f(viewInflate, R.id.disallowInterceptView);
        if (viewF != null) {
            int i2 = R.id.divider_number_bottom;
            View viewF2 = yum0.f(viewF, R.id.divider_number_bottom);
            if (viewF2 != null) {
                i2 = R.id.divider_number_top;
                View viewF3 = yum0.f(viewF, R.id.divider_number_top);
                if (viewF3 != null) {
                    i2 = R.id.hours_picker;
                    NumberPicker numberPicker = (NumberPicker) yum0.f(viewF, R.id.hours_picker);
                    if (numberPicker != null) {
                        i2 = R.id.linearLayoutCompat;
                        if (((LinearLayout) yum0.f(viewF, R.id.linearLayoutCompat)) != null) {
                            i2 = R.id.minutes_picker;
                            NumberPicker numberPicker2 = (NumberPicker) yum0.f(viewF, R.id.minutes_picker);
                            if (numberPicker2 != null) {
                                DisallowInterceptView disallowInterceptView = (DisallowInterceptView) viewF;
                                i2 = R.id.time_frame_picker;
                                NumberPicker numberPicker3 = (NumberPicker) yum0.f(viewF, R.id.time_frame_picker);
                                if (numberPicker3 != null) {
                                    i2 = R.id.tv_time_divider_24;
                                    if (((TextView) yum0.f(viewF, R.id.tv_time_divider_24)) != null) {
                                        i2 = R.id.view_selected_value_area;
                                        View viewF4 = yum0.f(viewF, R.id.view_selected_value_area);
                                        if (viewF4 != null) {
                                            iab iabVar = new iab(disallowInterceptView, viewF2, viewF3, numberPicker, numberPicker2, numberPicker3, viewF4, (byte) 7);
                                            i = R.id.timePickerButtons;
                                            DsPresetTwoButtons dsPresetTwoButtons = (DsPresetTwoButtons) yum0.f(viewInflate, R.id.timePickerButtons);
                                            if (dsPresetTwoButtons != null) {
                                                return new iq8((LinearLayout) viewInflate, iabVar, dsPresetTwoButtons);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
            return null;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
