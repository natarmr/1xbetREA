package a;

import android.javax.sip.message.Response;
import org.xbet.client1.R;
import org.xplatform.playersduel.impl.presentation.players_duel.screen.PlayersDuelParams;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes5.dex */
public final class y2a0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayersDuelParams f41895a;
    public final n0o0 b;
    public final n0o0 c;
    public final mdm d;

    public y2a0(PlayersDuelParams playersDuelParams, p2a0 p2a0Var, ocl oclVar) {
        this.f41895a = playersDuelParams;
        this.b = maz.b(new yw9(p2a0Var.d, new er90((byte) 8), (byte) 20));
        this.c = maz.b(new yw9(p2a0Var.e, new er90((byte) 9), (byte) 20));
        this.d = ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        gmm dmmVar;
        p2a0 p2a0Var = (p2a0) obj;
        p2a0Var.getClass();
        n0o0 n0o0Var = this.b;
        ((fee) n0o0Var.getValue()).d(p2a0Var.d);
        n0o0 n0o0Var2 = this.c;
        ((fee) n0o0Var2.getValue()).d(p2a0Var.e);
        String str = p2a0Var.f26240a.c;
        String str2 = str == null ? "" : str;
        boolean z = p2a0Var.c;
        boolean z2 = p2a0Var.b;
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        plm plmVar = new plm(str2, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        if (z) {
            dmmVar = new dmm(new ta50(new wkm(1, z2 ? R.drawable.ic_quick_bet_active : R.drawable.ic_quick_bet, true, ra50.f30118a, z2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary())));
        } else {
            dmmVar = fmm.f9790a;
        }
        imm immVar = new imm(ilmVar, plmVar, dmmVar, s6t0.b().f33626a.getBackgroundContent(), false, null);
        if (p2a0Var.f) {
            return new w2a0(this.d, immVar);
        }
        a4x a4xVar = (a4x) ((fee) n0o0Var.getValue()).b();
        a4x a4xVar2 = (a4x) ((fee) n0o0Var2.getValue()).b();
        PlayersDuelParams playersDuelParams = this.f41895a;
        return new v2a0(immVar, a4xVar, a4xVar2, new MarketsParams.DuelSubGame(playersDuelParams.d, playersDuelParams.f46826a, playersDuelParams.b, new vq2(), str == null ? "" : str, playersDuelParams.c));
    }
}
