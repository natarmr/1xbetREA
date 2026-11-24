package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes4.dex */
public final class m6q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f21284a;
    public final BetInputView b;
    public final MakeBetBalanceViewDs c;
    public final TextView d;
    public final TaxExpandableSpoiler e;

    public m6q(LinearLayout linearLayout, BetInputView betInputView, MakeBetBalanceViewDs makeBetBalanceViewDs, TextView textView, TaxExpandableSpoiler taxExpandableSpoiler) {
        this.f21284a = linearLayout;
        this.b = betInputView;
        this.c = makeBetBalanceViewDs;
        this.d = textView;
        this.e = taxExpandableSpoiler;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21284a;
    }
}
