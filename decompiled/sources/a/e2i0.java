package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2i0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2i0 f7088a = new e2i0(1, g2i0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/feed/impl/databinding/SelectDateTimeDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.select_date_time_dialog, (ViewGroup) null, false);
        int i = R.id.datePicker;
        NumberPicker numberPicker = (NumberPicker) yum0.f(viewInflate, R.id.datePicker);
        if (numberPicker != null) {
            i = R.id.datePickerGuideLine;
            if (((Guideline) yum0.f(viewInflate, R.id.datePickerGuideLine)) != null) {
                i = R.id.hoursPicker;
                NumberPicker numberPicker2 = (NumberPicker) yum0.f(viewInflate, R.id.hoursPicker);
                if (numberPicker2 != null) {
                    i = R.id.minutesPicker;
                    NumberPicker numberPicker3 = (NumberPicker) yum0.f(viewInflate, R.id.minutesPicker);
                    if (numberPicker3 != null) {
                        i = R.id.subTitle;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.subTitle);
                        if (textView != null) {
                            i = R.id.timeFramePicker;
                            NumberPicker numberPicker4 = (NumberPicker) yum0.f(viewInflate, R.id.timeFramePicker);
                            if (numberPicker4 != null) {
                                return new g2i0((ConstraintLayout) viewInflate, numberPicker, numberPicker2, numberPicker3, textView, numberPicker4);
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
