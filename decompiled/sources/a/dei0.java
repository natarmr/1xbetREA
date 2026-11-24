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
public final /* synthetic */ class dei0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dei0 f5953a = new dei0(1, fei0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/SendMailDatePickerViewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.send_mail_date_picker_view, (ViewGroup) null, false);
        int i = R.id.calendarView;
        CalendarView calendarView = (CalendarView) yum0.f(viewInflate, R.id.calendarView);
        if (calendarView != null) {
            i = R.id.divider;
            View viewF = yum0.f(viewInflate, R.id.divider);
            if (viewF != null) {
                i = R.id.llTitle;
                if (((LinearLayout) yum0.f(viewInflate, R.id.llTitle)) != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.subtitle);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.title);
                        if (textView2 != null) {
                            return new fei0((ConstraintLayout) viewInflate, calendarView, viewF, textView, textView2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
