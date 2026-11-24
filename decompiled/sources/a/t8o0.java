package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.victoryformula.VictoryFormulaView;

/* JADX INFO: loaded from: classes4.dex */
public final class t8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VictoryFormulaView f33521a;
    public final VictoryFormulaView b;

    public t8o0(VictoryFormulaView victoryFormulaView, VictoryFormulaView victoryFormulaView2) {
        this.f33521a = victoryFormulaView;
        this.b = victoryFormulaView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33521a;
    }
}
