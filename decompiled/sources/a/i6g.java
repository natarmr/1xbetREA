package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.CyberCalendarSwipeScrollView;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarWeekView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i6g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6g f14238a = new i6g(1, m6g.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDaysOfWeekFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.calendarGrid;
        CyberCalendarGridView cyberCalendarGridView = (CyberCalendarGridView) yum0.f(view, R.id.calendarGrid);
        if (cyberCalendarGridView != null) {
            i = R.id.calendarPeriodView;
            CyberCalendarPeriodView cyberCalendarPeriodView = (CyberCalendarPeriodView) yum0.f(view, R.id.calendarPeriodView);
            if (cyberCalendarPeriodView != null) {
                i = R.id.lottieEmptyView;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
                if (dSLottieEmptyContainer != null) {
                    i = R.id.scrollView;
                    if (((CyberCalendarSwipeScrollView) yum0.f(view, R.id.scrollView)) != null) {
                        i = R.id.weekView;
                        CyberCalendarWeekView cyberCalendarWeekView = (CyberCalendarWeekView) yum0.f(view, R.id.weekView);
                        if (cyberCalendarWeekView != null) {
                            return new m6g((ConstraintLayout) view, cyberCalendarGridView, cyberCalendarPeriodView, dSLottieEmptyContainer, cyberCalendarWeekView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
