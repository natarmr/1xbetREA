package a;

import kotlin.Pair;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lic extends i3t0 {
    public final eyg0 o;
    public final s64 p;
    public final qu q;
    public final ChooseSubGameParams r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lic(ctf0 ctf0Var, mne mneVar, ntt nttVar, eyg0 eyg0Var, oif0 oif0Var, s64 s64Var, qu quVar, ChooseSubGameParams chooseSubGameParams) {
        super(null, new yw9(nttVar, oif0Var, (byte) 13), new ep4(ctf0Var, (byte) 19), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = eyg0Var;
        this.p = s64Var;
        this.q = quVar;
        this.r = chooseSubGameParams;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        bic bicVar = (bic) obj;
        bicVar.getClass();
        super.x(bicVar);
        if (!(bicVar instanceof aic)) {
            if (bicVar.equals(zhc.f44386a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        long j = ((aic) bicVar).f917a;
        ChooseSubGameParams chooseSubGameParams = this.r;
        this.q.f29324a.a("bet_player_type_choose", xp20.f(new Pair("sport_id", Long.valueOf(chooseSubGameParams.b)), new Pair("option", Long.valueOf(j))));
        this.p.f31684a.a(tx3.l0(new k1p[]{new i1p((byte) 2, chooseSubGameParams.b), new i1p((byte) 0, j)}), 11352L);
        ((b8h0) this.o.b).f2157a.b.o(null, Long.valueOf(j));
        G(iic.f14822a);
    }
}
