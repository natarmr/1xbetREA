package a;

import kotlin.Pair;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final class ncl0 extends w3k implements bvs, ca30, ea30 {
    public final qud A;
    public final r1u B;
    public final a6u C;
    public final nc0 D;
    public final qv2 E;
    public final h3c F;
    public final r9u G;
    public final ocl H;
    public final drm0 I;
    public final yox J;
    public final n0o0 K;
    public final n0o0 L;
    public final n0o0 M;
    public final p7m0 N;
    public final p7m0 O;
    public final n0o0 P;
    public final p7m0 Q;
    public final p7m0 R;
    public final p7m0 S;
    public final n0o0 T;
    public final p7m0 U;
    public c4m0 V;
    public c4m0 W;
    public Pair X;
    public c4m0 Y;
    public final vzg0 c;
    public final luu d;
    public final tzi e;
    public final daf f;
    public final hcp0 g;
    public final ctf0 h;
    public final i1w0 i;
    public final frs j;
    public final yfm0 k;
    public final zie0 l;
    public final duj m;
    public final zsr n;
    public final mne o;
    public final m1e p;
    public final dvt q;
    public final fwt r;
    public final nqs s;
    public final f3j t;
    public final ivn u;
    public final j9u v;
    public final weu w;
    public final dvt x;
    public final lhf0 y;
    public final owp0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncl0(vzg0 vzg0Var, luu luuVar, wyu wyuVar, uyu uyuVar, tzi tziVar, daf dafVar, hcp0 hcp0Var, lbu lbuVar, ctf0 ctf0Var, i1w0 i1w0Var, frs frsVar, yfm0 yfm0Var, zie0 zie0Var, duj dujVar, zsr zsrVar, mne mneVar, m1e m1eVar, dvt dvtVar, fwt fwtVar, nqs nqsVar, f3j f3jVar, ivn ivnVar, j9u j9uVar, kut kutVar, rpt rptVar, weu weuVar, qbu qbuVar, svu svuVar, dvt dvtVar2, lhf0 lhf0Var, pru pruVar, owp0 owp0Var, qud qudVar, r1u r1uVar, a6u a6uVar, nc0 nc0Var, qv2 qv2Var, h3c h3cVar, r9u r9uVar, ocl oclVar, drm0 drm0Var, yox yoxVar) {
        super(vzg0Var, q3d.j(nqsVar, f3jVar));
        vs10 vs10Var = mneVar.c;
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        this.c = vzg0Var;
        this.d = luuVar;
        this.e = tziVar;
        this.f = dafVar;
        this.g = hcp0Var;
        this.h = ctf0Var;
        this.i = i1w0Var;
        this.j = frsVar;
        this.k = yfm0Var;
        this.l = zie0Var;
        this.m = dujVar;
        this.n = zsrVar;
        this.o = mneVar;
        this.p = m1eVar;
        this.q = dvtVar;
        this.r = fwtVar;
        this.s = nqsVar;
        this.t = f3jVar;
        this.u = ivnVar;
        this.v = j9uVar;
        this.w = weuVar;
        this.x = dvtVar2;
        this.y = lhf0Var;
        this.z = owp0Var;
        this.A = qudVar;
        this.B = r1uVar;
        this.C = a6uVar;
        this.D = nc0Var;
        this.E = qv2Var;
        this.F = h3cVar;
        this.G = r9uVar;
        this.H = oclVar;
        this.I = drm0Var;
        this.J = yoxVar;
        this.K = maz.b(new p2e0(pruVar, (byte) 5));
        this.L = maz.b(new goi0(lbuVar, (byte) 15));
        this.M = maz.b(new aa30(this, b));
        xqs xqsVar = (xqs) vzg0Var.a("KEY_TAB_TYPE");
        if (xqsVar == null) {
            xqsVar = frsVar.g != GameBroadcastType.c ? xqs.b : xqs.f41338a;
        }
        Integer num = (Integer) vzg0Var.a("KEY_BROADCAST_POSITION");
        int iIntValue = num != null ? num.intValue() : 0;
        CardIdentity cardIdentity = (CardIdentity) vzg0Var.a("KEY_INFO_CARD_IDENTITY");
        this.N = q7m0.a(new wqs(xqsVar, iIntValue, cardIdentity == null ? new CardIdentity(dja.COMMON, -1) : cardIdentity));
        y930 y930Var = y930.b;
        iun iunVar = iun.f15405a;
        this.O = q7m0.a(new yqs(null, null, null, null, y930Var, iunVar));
        byte b4 = 3;
        this.P = maz.b(new aa30(this, b4));
        yje yjeVar = null;
        this.Q = q7m0.a(null);
        this.R = q7m0.a(ual0.f35335a);
        this.S = q7m0.a(new tcs(!h97.A(wyuVar, uaq0.f35345a), frsVar.b, null, "", "", (Integer) vzg0Var.a("KEY_BACKGROUND_HEIGHT"), (Integer) vzg0Var.a("KEY_BACKGROUND_WIDTH")));
        byte b5 = 6;
        this.T = maz.b(new fzk0(b5));
        this.U = q7m0.a(iunVar);
        byte b6 = 4;
        sac.T(new fnq(uyuVar.f36509a.h(), new zbl0(this, yjeVar, (byte) 10), b6), jiu0.a(this), jcl0.h);
        sac.T(new fnq(svuVar.h(), new zbl0(this, yjeVar, (byte) 8), b6), jiu0.a(this), icl0.h);
        byte b7 = 7;
        sac.T(new fnq(qbuVar.a(), new zbl0(this, yjeVar, b7), b6), jiu0.a(this), hcl0.h);
        D(true);
        qjj.W(jiu0.a(this), vs10Var, null, new bcl0(this, yjeVar, b), 2);
        qjj.W(jiu0.a(this), vs10Var, null, new bcl0(this, yjeVar, b7), 2);
        qjj.W(jiu0.a(this), vs10Var, null, new bcl0(this, yjeVar, b3), 2);
        qjj.W(jiu0.a(this), mneVar.b, null, new bcl0(this, yjeVar, b5), 2);
        sac.T(new fnq(new qaf0(kutVar.a(), (byte) 9), new zbl0(this, yjeVar, b2), b6), jiu0.a(this), acl0.h);
        sac.T(new fnq(rptVar.b(), new bcl0(this, yjeVar, b2), b6), jiu0.a(this), ccl0.h);
        qjj.W(jiu0.a(this), vs10Var, null, new bcl0(this, yjeVar, b4), 2);
        qjj.W(jiu0.a(this), vs10Var, null, new bcl0(this, yjeVar, (byte) 5), 2);
    }

    public final void A(long j, long j2, long j3, boolean z, boolean z2) {
        Pair pair = this.X;
        e3c.n(pair != null ? (bby) pair.b : null);
        this.X = new Pair(Long.valueOf(j), qjj.W(jiu0.a(this), this.o.f22085a, null, new nor(this, j, j2, z, j3, z2, null), 2));
    }

    public final void B(GameBroadcastType gameBroadcastType) {
        String str;
        int iOrdinal = gameBroadcastType.ordinal();
        if (iOrdinal == 0) {
            str = "video";
        } else if (iOrdinal != 1) {
            return;
        } else {
            str = "1xzone";
        }
        long j = ((zqs) ((p7m0) w()).getValue()).c;
        lhf0 lhf0Var = this.y;
        lhf0Var.getClass();
        ((bn6) lhf0Var.b).b.a("bet_gameview_stream_call", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("option", str)));
        ((je) lhf0Var.d).f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(str, (byte) 0)}), 3180L);
    }

    public final void C(xqs xqsVar) {
        p7m0 p7m0Var;
        Object value;
        wqs wqsVarA;
        do {
            p7m0Var = this.N;
            value = p7m0Var.getValue();
            wqsVarA = wqs.a((wqs) value, xqsVar, 0, null, 6);
            this.c.e("KEY_TAB_TYPE", wqsVarA.f39607a);
        } while (!p7m0Var.m(value, wqsVarA));
    }

    public final void D(boolean z) {
        qjj.W(jiu0.a(this), null, null, new a220((Object) this, z, (yje) null, (byte) 27), 3);
    }

    @Override // a.bvs
    public final void a() {
        if (bww.Q(((yqs) this.O.getValue()).e)) {
            p7m0 p7m0Var = this.R;
            p7m0Var.getClass();
            p7m0Var.o(null, tal0.f33618a);
        } else {
            long j = ((zqs) ((p7m0) w()).getValue()).c;
            boolean z = ((zqs) ((p7m0) w()).getValue()).f;
            lhf0 lhf0Var = this.y;
            ((bn6) lhf0Var.b).c(j, false, z);
            ((je) lhf0Var.d).e(j, false, z);
            this.t.a();
        }
    }

    @Override // a.bvs
    public final void g() {
        this.t.g();
    }

    @Override // a.bvs
    public final void p() {
        this.t.p();
    }

    @Override // a.w3k, a.diu0
    public final void v() {
        c4m0 c4m0Var = this.V;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        super.v();
    }

    public final qz40 w() {
        return (qz40) this.P.getValue();
    }

    public final sff0 x() {
        return (sff0) this.K.getValue();
    }

    public final void y(long j, boolean z, long j2, long j3, long j4, vzj0 vzj0Var, String str) {
        p7m0 p7m0Var;
        Object value;
        zqs zqsVarA;
        Object value2;
        Object value3;
        Object obj = null;
        if (!((zqs) ((p7m0) w()).getValue()).f44821a) {
            val0 val0Var = new val0(j, j, j3, this.j.f10034a, z);
            p7m0 p7m0Var2 = this.R;
            p7m0Var2.getClass();
            p7m0Var2.o(null, val0Var);
        }
        qz40 qz40VarW = w();
        do {
            p7m0Var = (p7m0) qz40VarW;
            value = p7m0Var.getValue();
            zqsVarA = zqs.a((zqs) value, true, j, j3, j4, z, false, 0L, vzj0Var, 464);
            Long lValueOf = Long.valueOf(zqsVarA.b);
            vzg0 vzg0Var = this.c;
            vzg0Var.e("KEY_GAME_ID", lValueOf);
            vzg0Var.e("KEY_CHAMP_ID", Long.valueOf(zqsVarA.d));
            vzg0Var.e("KEY_LIVE", Boolean.valueOf(zqsVarA.f));
            vzg0Var.e("KEY_SHOW_BETTING", Boolean.valueOf(zqsVarA.f44821a));
        } while (!p7m0Var.m(value, zqsVarA));
        for (Object obj2 : this.d.f20692a.a()) {
            if (((lok0) obj2).f20396a == j2) {
                obj = obj2;
                break;
            }
        }
        lok0 lok0Var = (lok0) obj;
        p7m0 p7m0Var3 = this.S;
        if (lok0Var == null || j2 == -1) {
            do {
                value2 = p7m0Var3.getValue();
            } while (!p7m0Var3.m(value2, tcs.a((tcs) value2, false, j3, null, null, str, null, null, 109)));
        } else {
            do {
                value3 = p7m0Var3.getValue();
            } while (!p7m0Var3.m(value3, tcs.a((tcs) value3, false, 0L, Integer.valueOf(lok0Var.f20396a), lok0Var.u, str, null, null, 99)));
        }
    }

    public final void z(u3z u3zVar) {
        this.X = new Pair(Long.valueOf(u3zVar.f35019a), qjj.W(jiu0.a(this), this.o.f22085a, null, new wbl0(this, u3zVar, null, (byte) 0), 2));
    }
}
