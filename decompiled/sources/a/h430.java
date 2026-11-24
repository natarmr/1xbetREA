package a;

import androidx.fragment.app.Fragment;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class h430 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ucn f12415a;

    public h430(ucn ucnVar, fhx fhxVar) {
        this.f12415a = ucnVar;
    }

    public final void a(mm40 mm40Var, Fragment fragment, MarketsParams.DuelSubGame duelSubGame, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(-1878398679);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(fragment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(duelSubGame) : fetVar.i(duelSubGame) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(this) : fetVar.i(this) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.e0(-245941562);
            long j = duelSubGame.f47006a;
            long j2 = duelSubGame.b;
            long j3 = duelSubGame.c;
            boolean z = duelSubGame.d;
            this.f12415a.a(mm40Var2, fragment, new MarketsParams.DuelSubGame(j, j2, j3, duelSubGame.f, duelSubGame.e, z), fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho(this, mm40Var, fragment, duelSubGame, i, (byte) 14);
        }
    }
}
