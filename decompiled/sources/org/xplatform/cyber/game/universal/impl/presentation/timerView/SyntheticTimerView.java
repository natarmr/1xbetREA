package org.xplatform.cyber.game.universal.impl.presentation.timerView;

import a.a6o0;
import a.a8z;
import a.b6o0;
import a.c4m0;
import a.doe;
import a.fnq;
import a.maz;
import a.r710;
import a.sac;
import a.slb;
import a.tkz;
import a.ulb;
import a.vsg0;
import a.wez;
import a.x5o0;
import a.yje;
import a.ywm0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class SyntheticTimerView extends FrameLayout {
    public static final r710 d = new r710(-3000, 3000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46541a;
    public c4m0 b;
    public Long c;

    /* JADX WARN: Illegal instructions before constructor call */
    public SyntheticTimerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46541a = maz.a(wez.b, new ywm0(this, this, (byte) 5));
        String string = context.getResources().getString(R.string.move_in_time);
        string.getClass();
        setTimerDescription(string);
        setLayoutDirection(3);
    }

    public static void b(SyntheticTimerView syntheticTimerView, long j, tkz tkzVar, Long l, int i) {
        long jLongValue;
        vsg0 vsg0VarM;
        byte b = 1;
        boolean z = (i & 4) == 0;
        yje yjeVar = null;
        Long l2 = (i & 8) != 0 ? null : l;
        syntheticTimerView.getClass();
        if (z) {
            l2 = null;
        }
        if (l2 != null) {
            jLongValue = l2.longValue() - System.currentTimeMillis();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
        } else {
            jLongValue = j;
        }
        Long l3 = syntheticTimerView.c;
        Long lValueOf = l3 != null ? Long.valueOf(l3.longValue() - jLongValue) : null;
        if (lValueOf != null) {
            r710 r710Var = d;
            long j2 = r710Var.f24763a;
            long j3 = r710Var.b;
            long jLongValue2 = lValueOf.longValue();
            if (j2 <= jLongValue2 && jLongValue2 <= j3) {
                return;
            }
        }
        c4m0 c4m0Var = syntheticTimerView.b;
        Long l4 = (c4m0Var == null || !c4m0Var.isActive()) ? null : 500L;
        c4m0 c4m0Var2 = syntheticTimerView.b;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        if (z) {
            vsg0VarM = new vsg0(new doe(jLongValue, 1, null));
        } else {
            vsg0VarM = l2 != null ? sac.M(l2.longValue()) : sac.L(6, jLongValue, 0L);
        }
        syntheticTimerView.b = slb.U(ulb.H(new fnq(new fnq(vsg0VarM, new a6o0(l4, yjeVar, b)), new b6o0(syntheticTimerView, yjeVar, b), (byte) 4)), tkzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x5o0 getBinding() {
        return (x5o0) this.f46541a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4m0 c4m0Var = this.b;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    public final void setTimerDescription(String str) {
        str.getClass();
        getBinding().c.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticTimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
