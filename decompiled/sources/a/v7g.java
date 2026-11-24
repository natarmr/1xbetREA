package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.CyberCalendarSwipeScrollView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarDaysOfWeekView;
import org.xplatform.cyber.calendar.impl.presentation.content.month.CyberCalendarMonthView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v7g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v7g f36923a = new v7g(1, z7g.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarMonthFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.calendarGrid;
        CyberCalendarGridView cyberCalendarGridView = (CyberCalendarGridView) yum0.f(view, R.id.calendarGrid);
        if (cyberCalendarGridView != null) {
            i = R.id.daysOfWeekView;
            CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = (CyberCalendarDaysOfWeekView) yum0.f(view, R.id.daysOfWeekView);
            if (cyberCalendarDaysOfWeekView != null) {
                i = R.id.lottieEmptyView;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
                if (dSLottieEmptyContainer != null) {
                    i = R.id.monthView;
                    CyberCalendarMonthView cyberCalendarMonthView = (CyberCalendarMonthView) yum0.f(view, R.id.monthView);
                    if (cyberCalendarMonthView != null) {
                        i = R.id.scrollView;
                        if (((CyberCalendarSwipeScrollView) yum0.f(view, R.id.scrollView)) != null) {
                            return new z7g((ConstraintLayout) view, cyberCalendarGridView, cyberCalendarDaysOfWeekView, dSLottieEmptyContainer, cyberCalendarMonthView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
