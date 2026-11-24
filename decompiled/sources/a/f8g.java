package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f8g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8g f9101a = new f8g(1, i8g.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarMonthPickerDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cyber_calendar_month_picker_dialog, (ViewGroup) null, false);
        int i = R.id.btnCancel;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.btnCancel);
        if (dsButton != null) {
            i = R.id.btnSelect;
            DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.btnSelect);
            if (dsButton2 != null) {
                i = R.id.linearLayout;
                if (((LinearLayout) yum0.f(viewInflate, R.id.linearLayout)) != null) {
                    i = R.id.lottieEmptyView;
                    DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(viewInflate, R.id.lottieEmptyView);
                    if (dSLottieEmptyContainer != null) {
                        i = R.id.monthPicker;
                        CyberCalendarMonthPicker cyberCalendarMonthPicker = (CyberCalendarMonthPicker) yum0.f(viewInflate, R.id.monthPicker);
                        if (cyberCalendarMonthPicker != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.tvTitle;
                            if (((DsPresetTitle) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                                return new i8g(constraintLayout, dsButton, dsButton2, dSLottieEmptyContainer, cyberCalendarMonthPicker);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
