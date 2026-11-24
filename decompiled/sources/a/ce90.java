package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ce90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ce90 f4201a = new ce90(1, cej.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/ui_core/databinding/DatePickerViewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.date_picker_view, (ViewGroup) null, false);
        int i = R.id.calendarView;
        CalendarView calendarView = (CalendarView) yum0.f(viewInflate, R.id.calendarView);
        if (calendarView != null) {
            i = R.id.divider;
            View viewF = yum0.f(viewInflate, R.id.divider);
            if (viewF != null) {
                i = R.id.ll_title;
                if (((LinearLayout) yum0.f(viewInflate, R.id.ll_title)) != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.subtitle);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.title);
                        if (textView2 != null) {
                            return new cej((ConstraintLayout) viewInflate, calendarView, viewF, textView, textView2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
