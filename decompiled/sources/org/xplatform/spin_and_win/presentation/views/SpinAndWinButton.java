package org.xplatform.spin_and_win.presentation.views;

import a.a8z;
import a.ay5;
import a.maz;
import a.p3u0;
import a.pn40;
import a.sue0;
import a.tlb;
import a.wez;
import a.wm6;
import a.yxk0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class SpinAndWinButton extends ay5 {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46981a;
    public yxk0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpinAndWinButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        this.f46981a = maz.a(wez.b, new sue0(this, this, (byte) 21));
        this.b = yxk0.g;
    }

    private final wm6 getViewBinding() {
        Object value = this.f46981a.getValue();
        value.getClass();
        return (wm6) value;
    }

    public final void b() {
        getViewBinding().f.setGuidelinePercent(1.0f);
        getViewBinding().c.setText((CharSequence) null);
    }

    public final void c() {
        getViewBinding().b.setVisibility(0);
        getViewBinding().d.setVisibility(0);
    }

    public final void d() {
        getViewBinding().b.setAlpha(0.5f);
    }

    public final void e(int i, int i2, yxk0 yxk0Var) {
        getViewBinding().b.setImageResource(i);
        getViewBinding().d.setImageResource(i2);
        getViewBinding().e.setText("x" + tlb.l0(yxk0Var));
        this.b = yxk0Var;
    }

    @Override // a.ay5
    public int getLayoutView() {
        return R.layout.bet_button_spin_and_win;
    }

    public final yxk0 getType() {
        return this.b;
    }

    public final void setDefaultState(boolean z) {
        getViewBinding().b.setVisibility(0);
        getViewBinding().d.setVisibility(4);
        if (z) {
            d();
        } else {
            getViewBinding().b.setAlpha(1.0f);
        }
    }

    public final void setSum(double d) {
        if (d == 0.0d) {
            return;
        }
        getViewBinding().f.setGuidelinePercent(0.5f);
        TextView textView = getViewBinding().c;
        pn40 pn40Var = pn40.f27267a;
        textView.setText(pn40.c(d, p3u0.g));
    }

    public final void setType(yxk0 yxk0Var) {
        yxk0Var.getClass();
        this.b = yxk0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinAndWinButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinAndWinButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
