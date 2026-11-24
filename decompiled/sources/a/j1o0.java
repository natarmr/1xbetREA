package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;

/* JADX INFO: loaded from: classes4.dex */
public final class j1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DicePokerView f15746a;
    public final DicePokerView b;

    public j1o0(DicePokerView dicePokerView, DicePokerView dicePokerView2) {
        this.f15746a = dicePokerView;
        this.b = dicePokerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15746a;
    }
}
