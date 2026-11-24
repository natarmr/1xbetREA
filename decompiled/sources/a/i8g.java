package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class i8g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14336a;
    public final DsButton b;
    public final DsButton c;
    public final DSLottieEmptyContainer d;
    public final CyberCalendarMonthPicker e;

    public i8g(ConstraintLayout constraintLayout, DsButton dsButton, DsButton dsButton2, DSLottieEmptyContainer dSLottieEmptyContainer, CyberCalendarMonthPicker cyberCalendarMonthPicker) {
        this.f14336a = constraintLayout;
        this.b = dsButton;
        this.c = dsButton2;
        this.d = dSLottieEmptyContainer;
        this.e = cyberCalendarMonthPicker;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14336a;
    }
}
