package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes3.dex */
public final class xyj0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41709a;
    public final MakeBetBalanceViewDs b;
    public final BetInputView c;
    public final CoordinatorLayout d;
    public final TaxExpandableSpoiler e;
    public final TextView f;

    public xyj0(ConstraintLayout constraintLayout, MakeBetBalanceViewDs makeBetBalanceViewDs, BetInputView betInputView, CoordinatorLayout coordinatorLayout, TaxExpandableSpoiler taxExpandableSpoiler, TextView textView) {
        this.f41709a = constraintLayout;
        this.b = makeBetBalanceViewDs;
        this.c = betInputView;
        this.d = coordinatorLayout;
        this.e = taxExpandableSpoiler;
        this.f = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41709a;
    }
}
