package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDayFlingRecyclerView;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j5g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5g f15931a = new j5g(1, o5g.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDayFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.calendarSwitcher;
        CyberCalendarDaySwitcher cyberCalendarDaySwitcher = (CyberCalendarDaySwitcher) yum0.f(view, R.id.calendarSwitcher);
        if (cyberCalendarDaySwitcher != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.lottieEmptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.recyclerView;
                CyberCalendarDayFlingRecyclerView cyberCalendarDayFlingRecyclerView = (CyberCalendarDayFlingRecyclerView) yum0.f(view, R.id.recyclerView);
                if (cyberCalendarDayFlingRecyclerView != null) {
                    return new o5g(constraintLayout, cyberCalendarDaySwitcher, constraintLayout, dSLottieEmptyContainer, cyberCalendarDayFlingRecyclerView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
