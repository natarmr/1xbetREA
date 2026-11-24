package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes.dex */
public final class c3f implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3671a;
    public final BetInputView b;
    public final DsButton c;
    public final DsButton d;
    public final DsButton e;
    public final DsButton f;
    public final DsButton g;
    public final Group h;
    public final LinearLayout i;
    public final MakeBetBalanceViewDs j;
    public final TaxExpandableSpoiler k;
    public final TextView l;
    public final TextView m;
    public final TextView n;

    public c3f(ConstraintLayout constraintLayout, BetInputView betInputView, DsButton dsButton, DsButton dsButton2, DsButton dsButton3, DsButton dsButton4, DsButton dsButton5, Group group, LinearLayout linearLayout, MakeBetBalanceViewDs makeBetBalanceViewDs, TaxExpandableSpoiler taxExpandableSpoiler, TextView textView, TextView textView2, TextView textView3) {
        this.f3671a = constraintLayout;
        this.b = betInputView;
        this.c = dsButton;
        this.d = dsButton2;
        this.e = dsButton3;
        this.f = dsButton4;
        this.g = dsButton5;
        this.h = group;
        this.i = linearLayout;
        this.j = makeBetBalanceViewDs;
        this.k = taxExpandableSpoiler;
        this.l = textView;
        this.m = textView2;
        this.n = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3671a;
    }
}
