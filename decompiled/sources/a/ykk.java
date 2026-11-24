package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ykk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42793a;
    public final /* synthetic */ DicePokerView b;
    public final /* synthetic */ jkk c;

    public /* synthetic */ ykk(DicePokerView dicePokerView, jkk jkkVar, byte b) {
        this.f42793a = b;
        this.b = dicePokerView;
        this.c = jkkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42793a;
        jkk jkkVar = this.c;
        DicePokerView dicePokerView = this.b;
        switch (b) {
            case 0:
                int i = DicePokerView.t;
                DicePokerView.x(jkkVar.f16673a, dicePokerView.r);
                break;
            default:
                int i2 = DicePokerView.t;
                DicePokerView.x(jkkVar.f16673a, dicePokerView.s);
                break;
        }
        return Unit.f46060a;
    }
}
