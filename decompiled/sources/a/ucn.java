package a;

import androidx.fragment.app.Fragment;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ucn {
    public final void a(mm40 mm40Var, Fragment fragment, MarketsParams.DuelSubGame duelSubGame, fet fetVar, int i) {
        int i2;
        fetVar.g0(-212537257);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(fragment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(duelSubGame) : fetVar.i(duelSubGame) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tfa0.a(mm40Var, fragment, duelSubGame, fetVar, i2 & 1022);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(this, mm40Var, fragment, duelSubGame, i);
        }
    }
}
