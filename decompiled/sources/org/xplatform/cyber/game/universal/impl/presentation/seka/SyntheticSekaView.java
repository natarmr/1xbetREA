package org.xplatform.cyber.game.universal.impl.presentation.seka;

import a.a8z;
import a.maz;
import a.pxh0;
import a.q3d;
import a.t9f;
import a.tkz;
import a.txh0;
import a.uxh0;
import a.vxh0;
import a.w7o0;
import a.wez;
import a.ywm0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class SyntheticSekaView extends ConstraintLayout {
    public final a8z q;
    public final List r;
    public final List s;

    /* JADX WARN: Illegal instructions before constructor call */
    public SyntheticSekaView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new ywm0(this, this, (byte) 4));
        List listJ = q3d.j(getBinding().b, getBinding().d, getBinding().c);
        this.r = listJ;
        this.s = q3d.j(getBinding().e, getBinding().g, getBinding().f);
        Context context2 = getRootView().getContext();
        context2.getClass();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setLayoutDirection(1);
            }
            Iterator it2 = this.s.iterator();
            while (it2.hasNext()) {
                ((ImageView) it2.next()).setLayoutDirection(1);
            }
        }
    }

    private final w7o0 getBinding() {
        return (w7o0) this.q.getValue();
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
            ((ImageView) this.r.get(i)).setImageResource(((Number) obj).intValue());
            i = i2;
        }
    }

    public final void setFirstPlayerCardsSum(pxh0 pxh0Var) {
        pxh0Var.getClass();
        getBinding().i.setText(pxh0Var.f27754a);
        TextView textView = getBinding().i;
        Context context = getContext();
        context.getClass();
        textView.setBackground(context.getDrawable(pxh0Var.b));
    }

    public final void setMatchStatus(vxh0 vxh0Var) {
        vxh0Var.getClass();
        if (vxh0Var instanceof txh0) {
            getBinding().h.setVisibility(8);
            getBinding().k.setVisibility(0);
            getBinding().k.setText(((txh0) vxh0Var).f34700a);
        } else {
            if (!(vxh0Var instanceof uxh0)) {
                t9f.b();
                return;
            }
            getBinding().h.setVisibility(0);
            getBinding().k.setVisibility(8);
            getBinding().h.setTimerDescription(((uxh0) vxh0Var).f36442a);
        }
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
            ((ImageView) this.s.get(i)).setImageResource(((Number) obj).intValue());
            i = i2;
        }
    }

    public final void setSecondPlayerCardsSum(pxh0 pxh0Var) {
        pxh0Var.getClass();
        getBinding().j.setText(pxh0Var.f27754a);
        TextView textView = getBinding().j;
        Context context = getContext();
        context.getClass();
        textView.setBackground(context.getDrawable(pxh0Var.b));
    }

    public final void u(long j, tkz tkzVar, Long l) {
        SyntheticTimerView.b(getBinding().h, j, tkzVar, l, 4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticSekaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticSekaView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
