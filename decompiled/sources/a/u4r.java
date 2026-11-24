package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes6.dex */
public final class u4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35065a;
    public final MakeBetBalanceViewDs b;
    public final TaxExpandableSpoiler c;
    public final ConstraintLayout d;
    public final BetInputView e;

    public u4r(ConstraintLayout constraintLayout, MakeBetBalanceViewDs makeBetBalanceViewDs, TaxExpandableSpoiler taxExpandableSpoiler, ConstraintLayout constraintLayout2, BetInputView betInputView) {
        this.f35065a = constraintLayout;
        this.b = makeBetBalanceViewDs;
        this.c = taxExpandableSpoiler;
        this.d = constraintLayout2;
        this.e = betInputView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35065a;
    }
}
