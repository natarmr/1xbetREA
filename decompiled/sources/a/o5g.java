package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDayFlingRecyclerView;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class o5g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24685a;
    public final CyberCalendarDaySwitcher b;
    public final ConstraintLayout c;
    public final DSLottieEmptyContainer d;
    public final CyberCalendarDayFlingRecyclerView e;

    public o5g(ConstraintLayout constraintLayout, CyberCalendarDaySwitcher cyberCalendarDaySwitcher, ConstraintLayout constraintLayout2, DSLottieEmptyContainer dSLottieEmptyContainer, CyberCalendarDayFlingRecyclerView cyberCalendarDayFlingRecyclerView) {
        this.f24685a = constraintLayout;
        this.b = cyberCalendarDaySwitcher;
        this.c = constraintLayout2;
        this.d = dSLottieEmptyContainer;
        this.e = cyberCalendarDayFlingRecyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24685a;
    }
}
