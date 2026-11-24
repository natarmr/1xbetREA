package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final class bd20 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2380a;
    public final MakeBetBalanceViewDs b;
    public final BetInputView c;
    public final DsButton d;
    public final DsButton e;
    public final DsButton f;
    public final DsButton g;
    public final Group h;
    public final Group i;
    public final TaxExpandableSpoiler j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public bd20(ConstraintLayout constraintLayout, MakeBetBalanceViewDs makeBetBalanceViewDs, BetInputView betInputView, DsButton dsButton, DsButton dsButton2, DsButton dsButton3, DsButton dsButton4, Group group, Group group2, TaxExpandableSpoiler taxExpandableSpoiler, TextView textView, TextView textView2, TextView textView3) {
        this.f2380a = constraintLayout;
        this.b = makeBetBalanceViewDs;
        this.c = betInputView;
        this.d = dsButton;
        this.e = dsButton2;
        this.f = dsButton3;
        this.g = dsButton4;
        this.h = group;
        this.i = group2;
        this.j = taxExpandableSpoiler;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2380a;
    }
}
