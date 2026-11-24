package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes5.dex */
public final class o520 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24667a;
    public final MakeBetBalanceViewDs b;
    public final TextView c;
    public final BetInputView d;
    public final BetInputView e;
    public final TaxExpandableSpoiler f;

    public o520(ConstraintLayout constraintLayout, MakeBetBalanceViewDs makeBetBalanceViewDs, TextView textView, BetInputView betInputView, BetInputView betInputView2, TaxExpandableSpoiler taxExpandableSpoiler) {
        this.f24667a = constraintLayout;
        this.b = makeBetBalanceViewDs;
        this.c = textView;
        this.d = betInputView;
        this.e = betInputView2;
        this.f = taxExpandableSpoiler;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24667a;
    }
}
