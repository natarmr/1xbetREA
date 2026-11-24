package org.xplatform.cyber.game.universal.impl.presentation.victoryformula;

import a.a8z;
import a.maz;
import a.tkz;
import a.u8o0;
import a.wez;
import a.ywm0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class VictoryFormulaView extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: Illegal instructions before constructor call */
    public VictoryFormulaView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new ywm0(this, this, (byte) 24));
    }

    private final u8o0 getBinding() {
        return (u8o0) this.q.getValue();
    }

    public final void setFirstPlayerFirstNumber(String str) {
        str.getClass();
        getBinding().o.setText(str);
    }

    public final void setFirstPlayerFormula(String str) {
        str.getClass();
        getBinding().n.setText(str);
    }

    public final void setFirstPlayerSecondNumber(String str) {
        str.getClass();
        getBinding().p.setText(str);
    }

    public final void setFirstPlayerThirdNumber(String str) {
        str.getClass();
        getBinding().q.setText(str);
    }

    public final void setFirstPlayerTotalScore(String str) {
        str.getClass();
        getBinding().r.setText(str);
    }

    public final void setSecondPlayerFirstNumber(String str) {
        str.getClass();
        getBinding().t.setText(str);
    }

    public final void setSecondPlayerFormula(String str) {
        str.getClass();
        getBinding().s.setText(str);
    }

    public final void setSecondPlayerSecondNumber(String str) {
        str.getClass();
        getBinding().u.setText(str);
    }

    public final void setSecondPlayerThirdNumber(String str) {
        str.getClass();
        getBinding().v.setText(str);
    }

    public final void setSecondPlayerTotalScore(String str) {
        str.getClass();
        getBinding().w.setText(str);
    }

    public final void setWinnerText(String str) {
        str.getClass();
        getBinding().m.setVisibility(str.length() > 0 ? 4 : 0);
        getBinding().x.setVisibility(str.length() != 0 ? 0 : 4);
        getBinding().x.setText(str);
    }

    public final void u(long j, tkz tkzVar, Long l) {
        SyntheticTimerView.b(getBinding().m, j, tkzVar, l, 4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VictoryFormulaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VictoryFormulaView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
