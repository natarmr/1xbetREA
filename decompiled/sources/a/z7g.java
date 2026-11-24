package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarDaysOfWeekView;
import org.xplatform.cyber.calendar.impl.presentation.content.month.CyberCalendarMonthView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class z7g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43918a;
    public final CyberCalendarGridView b;
    public final CyberCalendarDaysOfWeekView c;
    public final DSLottieEmptyContainer d;
    public final CyberCalendarMonthView e;

    public z7g(ConstraintLayout constraintLayout, CyberCalendarGridView cyberCalendarGridView, CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView, DSLottieEmptyContainer dSLottieEmptyContainer, CyberCalendarMonthView cyberCalendarMonthView) {
        this.f43918a = constraintLayout;
        this.b = cyberCalendarGridView;
        this.c = cyberCalendarDaysOfWeekView;
        this.d = dSLottieEmptyContainer;
        this.e = cyberCalendarMonthView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43918a;
    }
}
