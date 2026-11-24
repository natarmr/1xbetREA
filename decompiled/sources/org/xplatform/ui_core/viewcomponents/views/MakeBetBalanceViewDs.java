package org.xplatform.ui_core.viewcomponents.views;

import a.dyb;
import a.fd5;
import a.hny;
import a.ke;
import a.qe;
import a.r3w;
import a.vd7;
import a.yum0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeBetBalanceViewDs extends ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final PathInterpolator q;
    public final vd7 r;
    public ValueAnimator s;

    /* JADX WARN: Illegal instructions before constructor call */
    public MakeBetBalanceViewDs(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
        LayoutInflater.from(context).inflate(R.layout.make_bet_balance_view_ds, this);
        int i2 = R.id.accountInfo;
        DsAccountInfo dsAccountInfo = (DsAccountInfo) yum0.f(this, R.id.accountInfo);
        if (dsAccountInfo != null) {
            i2 = R.id.btnDeposit;
            DsButton dsButton = (DsButton) yum0.f(this, R.id.btnDeposit);
            if (dsButton != null) {
                this.r = new vd7(this, dsAccountInfo, dsButton);
                dsAccountInfo.setButtonIconRes(R.drawable.ic_glyph_chevron_right_small);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setAddDepositClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.O((DsButton) this.r.c, new r3w(function0, (byte) 6));
    }

    public final void setChangeBalanceBtnText(String str) {
        str.getClass();
        ((DsAccountInfo) this.r.d).setButtonText(str);
    }

    public final void setChangeBalanceClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        ((DsAccountInfo) this.r.d).setButtonClickListener(onClickListener);
    }

    public final void setModel(ke keVar) {
        keVar.getClass();
        ((DsAccountInfo) this.r.d).setModel(keVar);
    }

    public final void u() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f, 1.0f);
            valueAnimatorOfFloat.setDuration(1900L);
            valueAnimatorOfFloat.setInterpolator(this.q);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new fd5(this, (byte) 20));
            valueAnimatorOfFloat.start();
            this.s = valueAnimatorOfFloat;
        }
    }

    public final void v() {
        qe qeVar = ((DsAccountInfo) this.r.d).l;
        if (qeVar != null) {
            qeVar.a(true);
        }
    }

    public final void w() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.s;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.s = null;
    }

    public final void x() {
        qe qeVar = ((DsAccountInfo) this.r.d).l;
        if (qeVar != null) {
            qeVar.a(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MakeBetBalanceViewDs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MakeBetBalanceViewDs(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
