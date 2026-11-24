package org.xplatform.uikit.components.timer;

import a.c4m0;
import a.d5c;
import a.fnq;
import a.kin0;
import a.n1;
import a.p23;
import a.qem0;
import a.rwj;
import a.sje;
import a.slb;
import a.tvk;
import a.vs10;
import a.vsg0;
import a.wib;
import a.yje;
import a.ys10;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import java.util.Date;
import kotlin.coroutines.e;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class DsTimerWithDescription extends AppCompatTextView {
    public static final /* synthetic */ int o = 0;
    public long i;
    public final sje j;
    public c4m0 k;
    public final boolean l;
    public CharSequence m;
    public boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsTimerWithDescription(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        rwj rwjVar = tvk.f34603a;
        vs10 vs10VarX = ys10.f43147a.x();
        kin0 kin0VarE = qem0.e();
        vs10VarX.getClass();
        this.j = d5c.a(e.c(vs10VarX, kin0VarE));
        this.l = true;
        this.n = true;
        this.m = getText();
    }

    public final void j() {
        c4m0 c4m0Var = this.k;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.k = slb.U(new fnq(new vsg0(new n1(new p23(2, yjeVar, (byte) 3), yjeVar, (byte) 7)), new wib(this, yjeVar, (byte) 28), (byte) 4), this.j);
    }

    public final void k() {
        long j = this.i;
        if (j < 0) {
            c4m0 c4m0Var = this.k;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            j = 0;
        }
        boolean z = true;
        if (this.l && j <= 0) {
            z = false;
        }
        String str = String.format(", %s:%s:%s", Arrays.copyOf(new Object[]{StringsKt.b0(2, String.valueOf(j / 3600000)), StringsKt.b0(2, String.valueOf((j / 60000) % 60)), StringsKt.b0(2, String.valueOf((j / 1000) % 60))}, 3));
        CharSequence charSequence = this.m;
        if (!z || !this.n) {
            str = "";
        }
        setText(((Object) charSequence) + str);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n) {
            j();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4m0 c4m0Var = this.k;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    public final void setGameStartTime(long j) {
        this.i = j - new Date().getTime();
        j();
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.m = charSequence;
    }

    public final void setTimerVisible(boolean z) {
        this.n = z;
        k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTimerWithDescription(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTimerWithDescription(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
