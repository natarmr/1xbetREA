package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarWeekView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class m6g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21268a;
    public final CyberCalendarGridView b;
    public final CyberCalendarPeriodView c;
    public final DSLottieEmptyContainer d;
    public final CyberCalendarWeekView e;

    public m6g(ConstraintLayout constraintLayout, CyberCalendarGridView cyberCalendarGridView, CyberCalendarPeriodView cyberCalendarPeriodView, DSLottieEmptyContainer dSLottieEmptyContainer, CyberCalendarWeekView cyberCalendarWeekView) {
        this.f21268a = constraintLayout;
        this.b = cyberCalendarGridView;
        this.c = cyberCalendarPeriodView;
        this.d = dSLottieEmptyContainer;
        this.e = cyberCalendarWeekView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21268a;
    }
}
