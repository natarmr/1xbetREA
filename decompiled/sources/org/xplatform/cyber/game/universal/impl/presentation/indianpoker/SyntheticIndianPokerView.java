package org.xplatform.cyber.game.universal.impl.presentation.indianpoker;

import a.a6o0;
import a.a7n0;
import a.a8z;
import a.b6o0;
import a.c4m0;
import a.c6o0;
import a.doe;
import a.fnq;
import a.m5x;
import a.maz;
import a.q3d;
import a.r710;
import a.sac;
import a.tri0;
import a.vne;
import a.vsg0;
import a.wez;
import a.wnq0;
import a.yje;
import a.ywm0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SyntheticIndianPokerView extends ConstraintLayout {
    public static final r710 w = new r710(-3000, 3000);
    public final a8z q;
    public final a8z r;
    public final List s;
    public final List t;
    public c4m0 u;
    public Long v;

    /* JADX WARN: Illegal instructions before constructor call */
    public SyntheticIndianPokerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        wez wezVar = wez.b;
        this.q = maz.a(wezVar, new ywm0(this, this, (byte) 3));
        this.r = maz.a(wezVar, new a7n0((byte) 23));
        List listJ = q3d.j(getBinding().c, getBinding().e, getBinding().d);
        this.s = listJ;
        this.t = q3d.j(getBinding().g, getBinding().i, getBinding().h);
        Context context2 = getRootView().getContext();
        context2.getClass();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setLayoutDirection(1);
            }
            Iterator it2 = this.t.iterator();
            while (it2.hasNext()) {
                ((ImageView) it2.next()).setLayoutDirection(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c6o0 getBinding() {
        return (c6o0) this.q.getValue();
    }

    private final vne getScope() {
        return (vne) this.r.getValue();
    }

    private final void setTimerVisibility(boolean z) {
        getBinding().j.setVisibility(z ? 0 : 8);
    }

    public final void setFirstPlayerCards(List<Integer> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((ImageView) this.s.get(i)).setImageResource(((Number) obj).intValue());
            i = i2;
        }
    }

    public final void setFirstPlayerCombination(m5x m5xVar) {
        m5xVar.getClass();
        getBinding().k.setText(m5xVar.f21237a);
        ImageView imageView = getBinding().b;
        Context context = getContext();
        context.getClass();
        imageView.setBackground(context.getDrawable(m5xVar.b));
    }

    public final void setMatchStatus(String str) {
        str.getClass();
        getBinding().m.setText(str);
    }

    public final void setSecondPlayerCards(List<Integer> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((ImageView) this.t.get(i)).setImageResource(((Number) obj).intValue());
            i = i2;
        }
    }

    public final void setSecondPlayerCombination(m5x m5xVar) {
        m5xVar.getClass();
        getBinding().l.setText(m5xVar.f21237a);
        ImageView imageView = getBinding().f;
        Context context = getContext();
        context.getClass();
        imageView.setBackground(context.getDrawable(m5xVar.b));
    }

    public final void v(wnq0 wnq0Var) {
        long jLongValue;
        vsg0 vsg0VarM;
        boolean z = wnq0Var.f39460a;
        setTimerVisibility(z);
        boolean z2 = wnq0Var.c;
        yje yjeVar = null;
        Long l = z2 ? wnq0Var.e : null;
        if (l != null) {
            jLongValue = l.longValue() - System.currentTimeMillis();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
        } else {
            jLongValue = wnq0Var.b;
        }
        int i = wnq0Var.d;
        Long l2 = this.v;
        Long lValueOf = l2 != null ? Long.valueOf(l2.longValue() - jLongValue) : null;
        if (lValueOf != null) {
            r710 r710Var = w;
            long j = r710Var.f24763a;
            long j2 = r710Var.b;
            long jLongValue2 = lValueOf.longValue();
            if (j <= jLongValue2 && jLongValue2 <= j2) {
                return;
            }
        }
        if (z) {
            c4m0 c4m0Var = this.u;
            Long l3 = (c4m0Var == null || !c4m0Var.isActive()) ? null : 500L;
            c4m0 c4m0Var2 = this.u;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            if (z2) {
                vsg0VarM = l != null ? sac.M(l.longValue()) : sac.L(6, jLongValue, 0L);
            } else {
                vsg0VarM = new vsg0(new doe(jLongValue, i, null));
            }
            byte b = 0;
            this.u = sac.T(new fnq(new fnq(vsg0VarM, new a6o0(l3, yjeVar, b)), new b6o0(this, yjeVar, b), (byte) 4), getScope(), new tri0(2, yjeVar, (byte) 20));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticIndianPokerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticIndianPokerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
