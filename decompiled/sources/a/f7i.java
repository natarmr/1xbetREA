package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.ufc.api.fighter.FighterParams;

/* JADX INFO: loaded from: classes3.dex */
public final class f7i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9059a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f7i(Object obj, int i, byte b) {
        this.f9059a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        db dbVar = (db) this.c;
        i1w0 i1w0Var = (i1w0) dbVar.K;
        sue sueVar = (sue) dbVar.C;
        j1q0 j1q0Var = (j1q0) dbVar.A;
        au0 au0Var = (au0) dbVar.l;
        pru pruVar = (pru) dbVar.d;
        k7u k7uVar = (k7u) dbVar.i;
        knf0 knf0Var = (knf0) dbVar.h;
        btt0 btt0Var = (btt0) dbVar.f;
        wdd0 wdd0Var = (wdd0) dbVar.t;
        gst0 gst0Var = (gst0) dbVar.v;
        kt2 kt2Var = (kt2) dbVar.r;
        gii0 gii0Var = (gii0) dbVar.g;
        fme fmeVar = (fme) dbVar.F;
        wsf0 wsf0Var = (wsf0) dbVar.s;
        wsf0 wsf0Var2 = (wsf0) dbVar.j;
        boolean z = this.b;
        if (z) {
            if (!z) {
                c99.h(z ? 1 : 0);
                return null;
            }
            cu cuVar = new cu(btt0Var, new xex(gii0Var, (byte) 12), knf0Var);
            k7uVar.getClass();
            return new htt(cuVar, k7uVar);
        }
        BetHistoryScreenModel betHistoryScreenModel = (BetHistoryScreenModel) dbVar.b;
        mne mneVarH = ((psc) ((cad) dbVar.e).b).h();
        x1x.x(mneVarH);
        htt httVar = (htt) ((n5d0) dbVar.U).get();
        g45 g45Var = (g45) wsf0Var2.b;
        jrt jrtVar = new jrt(g45Var.Q(), wsf0Var2.b(), g45Var.G(), new bsu(), wsf0Var2.g(), g45Var.q());
        duj dujVar = (duj) dbVar.k;
        ctf0 ctf0Var = (ctf0) dbVar.c;
        p37 p37Var = new p37(new q37(new b4j(kt2Var, (byte) 1), au0Var, (s64) dbVar.m, new ih5(kt2Var, (byte) 2), (l7k) dbVar.n, new qu(kt2Var, (byte) 4), (s64) dbVar.o, (ix0) dbVar.p, (byte) 1));
        art artVar = new art();
        luu luuVarW = ((daf) ((ugf0) dbVar.q).f35622a).w();
        x1x.x(luuVarW);
        b8u b8uVarY = ((g45) wsf0Var2.b).Y();
        r9u r9uVar = (r9u) dbVar.P;
        rrc rrcVarK = ((mii0) wsf0Var.b).k();
        fvt0 fvt0VarI = ((mii0) wsf0Var.b).i();
        iqi iqiVar = new iqi(dbVar.r(), gst0Var);
        h03 h03VarH = ((mii0) wsf0Var.b).h();
        nsc nscVarJ = ((mii0) wsf0Var.b).j();
        vpt vptVarE = wdd0Var.e();
        x1x.x(vptVarE);
        hru hruVar = (hru) dbVar.w;
        ntu ntuVar = new ntu(j1q0Var, (byte) 1);
        yiu yiuVar = new yiu(j1q0Var, (byte) 0);
        upt uptVarD = wdd0Var.d();
        x1x.x(uptVarD);
        k9u k9uVarF = wdd0Var.f();
        x1x.x(k9uVarF);
        lsn lsnVar = new lsn(dbVar.r());
        ocl oclVarA0 = ((iip) dbVar.x).a0();
        x1x.x(oclVarA0);
        k7u k7uVar2 = (k7u) dbVar.i;
        b8u b8uVar = (b8u) dbVar.y;
        o470 o470VarW = ((daf) ((onv) dbVar.z).f25567a).W();
        ot otVarB = wsf0Var2.b();
        gbi gbiVarJ = sueVar.j();
        x1x.x(gbiVarJ);
        m1e m1eVar = (m1e) dbVar.D;
        jru jruVar = new jru(new zas0(fmeVar), (byte) 11);
        obe obeVar = new obe(new zas0(fmeVar));
        pmi0 pmi0Var = new pmi0(new zas0(fmeVar));
        g45 g45Var2 = (g45) wsf0Var2.b;
        jrt jrtVar2 = new jrt(g45Var2.Q(), wsf0Var2.b(), g45Var2.G(), new bsu(), wsf0Var2.g(), g45Var2.q());
        znt zntVarN = sueVar.n();
        x1x.x(zntVarN);
        return new fm7(betHistoryScreenModel, mneVarH, pruVar, httVar, jrtVar, dujVar, ctf0Var, p37Var, artVar, luuVarW, b8uVarY, r9uVar, rrcVarK, fvt0VarI, iqiVar, h03VarH, nscVarJ, vptVarE, hruVar, ntuVar, yiuVar, uptVarD, k9uVarF, lsnVar, oclVarA0, k7uVar2, b8uVar, o470VarW, otVarB, gbiVarJ, m1eVar, jruVar, obeVar, pmi0Var, jrtVar2, zntVarN, (o470) dbVar.G, ((g45) wsf0Var2.b).G(), ((mii0) wsf0Var.b).l(), new chf0((Object) new r7v(new es(new ehf0(gii0Var, (byte) 9), btt0Var, knf0Var)), (Object) new x1u(gst0Var, (byte) 1), (byte) 16), new nj7(new b4j(kt2Var, (byte) 1), au0Var), new z7u((edo) dbVar.H, (byte) 1), new jtj(new nvu((tgk) dbVar.I, new ani0(gii0Var, (byte) 9), (us3) dbVar.J, (q7d0) dbVar.B, (btt0) dbVar.f), k7uVar), new ryu(new owp0(fmeVar)), new f47(i1w0Var, (v88) dbVar.L, (ouu) dbVar.E, pruVar, (jh70) dbVar.M, (y3v) dbVar.N, (org.xplatform.toto_bet.core.navigation.a) dbVar.u, (s2m0) dbVar.O, (peg0) dbVar.Q, (evz) dbVar.R, (r9u) dbVar.P), new a3u((sjl0) dbVar.S, (byte) 1), new n660(new jw20((Object) dbVar.r(), (byte) 28), ((g45) wsf0Var2.b).q(), wsf0Var2.a(), wsf0Var2.b()), new x1u(gst0Var, (byte) 1), (ocl) dbVar.T, i1w0Var);
    }

    private final Object b() {
        sdi sdiVar = (sdi) this.c;
        boolean z = this.b;
        if (!z) {
            return new rdi(this);
        }
        if (z) {
            return new zkg(new xr(sdiVar.r, (byte) 25), new r34((byte) 2), sdiVar.s);
        }
        c99.h(z ? 1 : 0);
        return null;
    }

    private final Object c() {
        boolean z = this.b;
        if (!z) {
            return new qei(this);
        }
        if (z) {
            return new t2g(new s2g());
        }
        c99.h(z ? 1 : 0);
        return null;
    }

    private final Object d() {
        o3c o3cVar = (o3c) this.c;
        boolean z = this.b;
        if (!z) {
            return new bfi(this);
        }
        if (!z) {
            c99.h(z ? 1 : 0);
            return null;
        }
        c5k c5kVar = new c5k((gii0) o3cVar.b, (byte) 27);
        knf0 knf0Var = (knf0) o3cVar.c;
        mne mneVarH = ((psc) ((cad) o3cVar.d).b).h();
        x1x.x(mneVarH);
        return new axh(c5kVar, knf0Var, mneVarH);
    }

    private final Object e() {
        v9i v9iVar = (v9i) this.c;
        je jeVar = (je) v9iVar.o;
        b4j b4jVar = (b4j) v9iVar.n;
        cad cadVar = (cad) v9iVar.c;
        lrc lrcVar = (lrc) v9iVar.l;
        wsf0 wsf0Var = (wsf0) v9iVar.t;
        boolean z = this.b;
        if (!z) {
            oeg0 oeg0Var = (oeg0) v9iVar.g;
            duj dujVar = (duj) v9iVar.r;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new e6j(oeg0Var, dujVar, mneVarH, v9iVar.e, ((g45) wsf0Var.b).G(), v9iVar.b, new ali(new nmt(v9iVar.c()), new crt(v9iVar.c()), new crt(v9iVar.c()), lrcVar.w()), new edu((Object) ((g45) wsf0Var.b).G(), (Object) new b8u(v9iVar.c()), (byte) 2), new crt(v9iVar.c()), lrcVar.x(), (peg0) v9iVar.m, b4jVar, jeVar, (es) v9iVar.p, (wyb) v9iVar.q, (qoc) v9iVar.s, ((g45) wsf0Var.b).E(), wsf0Var.s(), ((mci) lrcVar.b).l(), (bzt) v9iVar.d, (pru) v9iVar.u, new kc60((gst0) v9iVar.k));
        }
        if (!z) {
            c99.h(z ? 1 : 0);
            return null;
        }
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        ctf0 ctf0Var = v9iVar.e;
        ctf0Var.getClass();
        c1j c1jVar = new c1j(new bmh((byte) 17), cvm0.p(mneVarH2.c, mneVarH2.f22085a), new ep4(ctf0Var, (byte) 24), null);
        c1jVar.o = b4jVar;
        c1jVar.p = jeVar;
        return c1jVar;
    }

    private final Object f() {
        boolean z = this.b;
        if (!z) {
            return new ggi(this);
        }
        if (z) {
            return new hgi(this);
        }
        c99.h(z ? 1 : 0);
        return null;
    }

    private final Object g() {
        boolean z = this.b;
        if (!z) {
            return new rgi(this);
        }
        if (z) {
            return new sgi(this);
        }
        c99.h(z ? 1 : 0);
        return null;
    }

    private final Object h() {
        boolean z = this.b;
        if (!z) {
            return new hkp((gkp) ((n5d0) ((xex) this.c).f40764a).get());
        }
        if (z) {
            return new gkp();
        }
        c99.h(z ? 1 : 0);
        return null;
    }

    private final Object i() {
        gud gudVar = (gud) this.c;
        boolean z = this.b;
        if (z) {
            if (z) {
                return new bwp();
            }
            c99.h(z ? 1 : 0);
            return null;
        }
        FighterParams fighterParams = (FighterParams) gudVar.f11923a;
        g2v g2vVar = (g2v) gudVar.b;
        ctf0 ctf0Var = (ctf0) gudVar.c;
        mne mneVarH = ((psc) ((cad) gudVar.d).b).h();
        x1x.x(mneVarH);
        gii0 gii0Var = (gii0) gudVar.e;
        n4u n4uVar = new n4u(new nmo(new hsj(gii0Var, (byte) 8)), (byte) 7);
        knf0 knf0Var = (knf0) gudVar.f;
        a6u a6uVar = new a6u((Object) n4uVar, (Object) new f4u(new wti(knf0Var, new zri(gii0Var, (byte) 13)), (byte) 9), (Object) new zri(new pmi(knf0Var, new iqi(gii0Var, (byte) 11), new o8o((byte) 1), new jtj(new fhj(gii0Var, (byte) 12), (bwp) ((n5d0) gudVar.v).get())), (uzc) gudVar.g), (Object) ((gbi) ((lsn) gudVar.h).f20589a).k(), gudVar.i, (byte) 4);
        rtu rtuVar = new rtu(new rou((b3c0) gudVar.j, (byte) 0), new x4v((gst0) gudVar.k, (byte) 0));
        i1w0 i1w0Var = (i1w0) gudVar.l;
        pru pruVar = (pru) gudVar.u;
        y78 y78Var = (y78) gudVar.m;
        lbu lbuVar = (lbu) gudVar.n;
        luu luuVarW = ((daf) ((ugf0) gudVar.o).f35622a).w();
        x1x.x(luuVarW);
        r9u r9uVarC = ((xzp) ((epi0) gudVar.p).b).C();
        hjd hjdVarA = ((itr) gudVar.q).a();
        x1x.x(hjdVarA);
        m1e m1eVar = (m1e) gudVar.r;
        uxs0 uxs0Var = new uxs0((byte) 1);
        kys0 kys0Var = (kys0) gudVar.s;
        j3c j3cVarV = ((iip) gudVar.t).V();
        x1x.x(j3cVarV);
        return new typ(fighterParams, g2vVar, ctf0Var, mneVarH, a6uVar, rtuVar, i1w0Var, pruVar, y78Var, lbuVar, luuVarW, r9uVarC, hjdVarA, m1eVar, uxs0Var, kys0Var, j3cVarV);
    }

    private final Object j() {
        t7i t7iVar = (t7i) this.c;
        vqc vqcVar = (vqc) t7iVar.d;
        ort ortVar = (ort) t7iVar.n;
        cad cadVar = (cad) t7iVar.i;
        drm0 drm0Var = (drm0) t7iVar.t;
        rmd0 rmd0Var = (rmd0) t7iVar.s;
        wsf0 wsf0Var = (wsf0) t7iVar.j;
        boolean z = this.b;
        if (z) {
            if (!z) {
                c99.h(z ? 1 : 0);
                return null;
            }
            btt0 btt0Var = (btt0) t7iVar.f33467a;
            a7q a7qVar = new a7q((gii0) t7iVar.l, (byte) 0);
            q6q q6qVar = (q6q) t7iVar.f;
            dev devVar = (dev) t7iVar.g;
            knf0 knf0Var = (knf0) t7iVar.m;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new h7q(btt0Var, a7qVar, q6qVar, devVar, knf0Var, mneVarH);
        }
        qdq qdqVar = new qdq((h7q) ((n5d0) t7iVar.k).get(), (byte) 1);
        h7q h7qVar = (h7q) ((n5d0) t7iVar.k).get();
        g45 g45Var = (g45) wsf0Var.b;
        w5z w5zVar = new w5z(h7qVar, ortVar, g45Var.y(), g45Var.E(), ((cih) vqcVar.b).a());
        mii0 mii0Var = (mii0) t7iVar.o;
        v88 v88Var = (v88) t7iVar.r;
        m1e m1eVar = t7iVar.e;
        i1w0 i1w0Var = (i1w0) t7iVar.p;
        sa10 sa10Var = (sa10) t7iVar.q;
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        jtj jtjVar = new jtj((h7q) ((n5d0) t7iVar.k).get(), ((cih) vqcVar.b).a());
        ctf0 ctf0Var = t7iVar.c;
        neu neuVar = new neu((h7q) ((n5d0) t7iVar.k).get(), (byte) 1);
        dyt dytVar = new dyt((h7q) ((n5d0) t7iVar.k).get(), (byte) 1);
        v6q v6qVar = new v6q((h7q) ((n5d0) t7iVar.k).get(), (byte) 1);
        neu neuVar2 = new neu((h7q) ((n5d0) t7iVar.k).get(), (byte) 2);
        w4p0 w4p0Var = new w4p0((h7q) ((n5d0) t7iVar.k).get());
        c5k c5kVar = new c5k(new m1u((h7q) ((n5d0) t7iVar.k).get(), (byte) 0), new neu((h7q) ((n5d0) t7iVar.k).get(), (byte) 1));
        gr00 gr00Var = new gr00(new meu((h7q) ((n5d0) t7iVar.k).get(), (byte) 0), new qdq((h7q) ((n5d0) t7iVar.k).get(), (byte) 0), new neu((h7q) ((n5d0) t7iVar.k).get(), (byte) 0), new meu((h7q) ((n5d0) t7iVar.k).get(), (byte) 2), new m1u((h7q) ((n5d0) t7iVar.k).get(), (byte) 1));
        yuu yuuVar = new yuu((h7q) ((n5d0) t7iVar.k).get(), new qdq((h7q) ((n5d0) t7iVar.k).get(), (byte) 0), new vvt((byte) 29), new neu((h7q) ((n5d0) t7iVar.k).get(), (byte) 0));
        meu meuVar = new meu((h7q) ((n5d0) t7iVar.k).get(), (byte) 1);
        dyt dytVar2 = new dyt((h7q) ((n5d0) t7iVar.k).get(), (byte) 0);
        yk50 yk50VarD = rmd0Var.d();
        x1x.x(yk50VarD);
        vpu vpuVarG = rmd0Var.g();
        x1x.x(vpuVarG);
        oif0 oif0VarB = rmd0Var.b();
        x1x.x(oif0VarB);
        vpu vpuVarA = rmd0Var.a();
        x1x.x(vpuVarA);
        return new r8q(qdqVar, w5zVar, ortVar, mii0Var, v88Var, m1eVar, i1w0Var, sa10Var, mneVarH2, jtjVar, ctf0Var, neuVar, dytVar, v6qVar, neuVar2, w4p0Var, c5kVar, gr00Var, yuuVar, meuVar, dytVar2, yk50VarD, vpuVarG, oif0VarB, vpuVarA, ((ali) drm0Var.f6568a).j(), ((o2j0) t7iVar.u).a(), ((g45) wsf0Var.b).l(), ((g45) wsf0Var.b).y(), wsf0Var.b(), ((g45) wsf0Var.b).H(), t7iVar.h, wsf0Var.a(), wsf0Var.s(), ((g45) wsf0Var.b).Y(), ((ali) drm0Var.f6568a).A(), ((ali) drm0Var.f6568a).a(), (pmi) t7iVar.v, ((g45) wsf0Var.b).g(), ((d1p) t7iVar.w).D(), (rou) t7iVar.x, (pru) t7iVar.b);
    }

    private final Object k() {
        esg0 esg0Var = (esg0) this.c;
        cad cadVar = (cad) esg0Var.f8326a;
        gii0 gii0Var = (gii0) esg0Var.b;
        boolean z = this.b;
        if (!z) {
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new ghv(mneVarH, new zrc((q2m0) ((n5d0) esg0Var.e).get(), (byte) 1), new e1u((q2m0) ((n5d0) esg0Var.e).get()));
        }
        if (!z) {
            c99.h(z ? 1 : 0);
            return null;
        }
        trm0 trm0Var = new trm0(gii0Var, (byte) 5);
        n7e0 n7e0Var = new n7e0(gii0Var, (byte) 1);
        l2m0 l2m0Var = (l2m0) esg0Var.c;
        knf0 knf0Var = (knf0) esg0Var.d;
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new q2m0(trm0Var, n7e0Var, l2m0Var, knf0Var, mneVarH2);
    }

    private final Object l() {
        h6i h6iVar = (h6i) this.c;
        pmi0 pmi0Var = (pmi0) h6iVar.i;
        boolean z = this.b;
        if (z) {
            if (!z) {
                c99.h(z ? 1 : 0);
                return null;
            }
            auv auvVar = new auv();
            auvVar.f1497a = roj0.b(1, 0, null, 6);
            return auvVar;
        }
        String str = (String) h6iVar.d;
        long jLongValue = ((Long) h6iVar.b).longValue();
        ctf0 ctf0Var = (ctf0) h6iVar.f12530a;
        mne mneVarH = ((psc) ((cad) h6iVar.f).b).h();
        x1x.x(mneVarH);
        i1w0 i1w0Var = (i1w0) h6iVar.g;
        ocl oclVar = (ocl) h6iVar.h;
        m1e m1eVar = (m1e) h6iVar.e;
        nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
        x1x.x(nfm0VarA);
        jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
        f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
        nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
        x1x.x(nfm0VarA2);
        return new vuv(str, jLongValue, ctf0Var, mneVarH, i1w0Var, oclVar, m1eVar, jwuVar, f7uVarS, new weu(nfm0VarA2, (byte) 0), new qzt((pru) h6iVar.j, (byte) 0), ((daf) pmi0Var.f27236a).r(), (uyu) h6iVar.k, (wyu) h6iVar.l, new xeu(h6iVar.f()), new xeu(h6iVar.f()), new xeu(h6iVar.f()), (r9u) h6iVar.o);
    }

    private final Object m() {
        mdi mdiVar = (mdi) this.c;
        k7u k7uVar = (k7u) mdiVar.w;
        knf0 knf0Var = (knf0) mdiVar.i;
        btt0 btt0Var = (btt0) mdiVar.h;
        gii0 gii0Var = (gii0) mdiVar.g;
        boolean z = this.b;
        if (!z) {
            return new pii(this);
        }
        if (!z) {
            c99.h(z ? 1 : 0);
            return null;
        }
        mii0 mii0VarF = mdiVar.f();
        pru pruVar = mdiVar.e;
        ywu ywuVar = new ywu(new fck0(gii0Var, (byte) 9), knf0Var, btt0Var);
        es esVar = new es(new ehf0(gii0Var, (byte) 9), btt0Var, knf0Var);
        abu abuVar = new abu(new ieu(gii0Var, (byte) 27), btt0Var);
        wgu wguVar = (wgu) mdiVar.R;
        htt httVar = new htt(new cu(btt0Var, new xex(gii0Var, (byte) 12), knf0Var), k7uVar);
        nr nrVar = new nr(new chf0(gii0Var, (byte) 5), knf0Var, btt0Var);
        k7uVar.getClass();
        wguVar.getClass();
        return new mfu(mii0VarF, k7uVar, pruVar, ywuVar, esVar, nrVar, abuVar, wguVar, httVar);
    }

    @Override // a.o5d0
    public final Object get() {
        Object as6Var;
        byte b = this.f9059a;
        byte b2 = 6;
        Object obj = this.c;
        boolean z = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                g7i g7iVar = (g7i) obj;
                nr00 nr00Var = (nr00) g7iVar.F;
                kt2 kt2Var = (kt2) g7iVar.u;
                pru pruVar = g7iVar.d;
                grj grjVar = (grj) g7iVar.q;
                cad cadVar = g7iVar.f10814a;
                ytt yttVar = (ytt) g7iVar.n;
                ehf0 ehf0Var = (ehf0) g7iVar.x;
                gst0 gst0Var = g7iVar.b;
                if (z) {
                    if (z) {
                        return new pw70((oeg0) g7iVar.j, new jdk0(), yttVar);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                fs80 fs80Var = (fs80) g7iVar.h;
                q91 q91Var = (q91) g7iVar.i;
                oeg0 oeg0Var = (oeg0) g7iVar.j;
                ctf0 ctf0Var = (ctf0) g7iVar.k;
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                m1e m1eVar = g7iVar.g;
                s91 s91Var = (s91) g7iVar.l;
                g2v g2vVar = (g2v) g7iVar.m;
                pw70 pw70Var = (pw70) g7iVar.K.get();
                oeg0 oeg0Var2 = (oeg0) g7iVar.j;
                h03 h03Var = (h03) g7iVar.o;
                pw70 pw70Var2 = (pw70) g7iVar.K.get();
                uzc0 uzc0Var = (uzc0) g7iVar.p;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                nc0 nc0Var = new nc0(oeg0Var2, h03Var, pw70Var2, uzc0Var, mneVarH2, grjVar, (jlx) g7iVar.r, pruVar, (qyg0) g7iVar.s, (pyg0) g7iVar.t, (ctf0) g7iVar.k);
                r7v r7vVar = new r7v((s91) g7iVar.l);
                duj dujVar = g7iVar.f;
                oeg0 oeg0Var3 = (oeg0) g7iVar.j;
                ctf0 ctf0Var2 = (ctf0) g7iVar.k;
                ih5 ih5Var = new ih5(kt2Var, (byte) 2);
                l7k l7kVar = (l7k) g7iVar.v;
                gg5 gg5Var = (gg5) g7iVar.w;
                v88 v88Var = g7iVar.e;
                ih5 ih5Var2 = new ih5(kt2Var, (byte) 0);
                wsf0 wsf0Var = g7iVar.c;
                g45 g45Var = (g45) wsf0Var.b;
                kb0 kb0Var = new kb0(dujVar, oeg0Var3, ctf0Var2, ih5Var, l7kVar, gg5Var, v88Var, ih5Var2, g45Var.y(), g45Var.Q(), g45Var.Y(), new iqt(gst0Var), g45Var.G(), wsf0Var.s(), ((i7i) ehf0Var.b).e());
                s31 s31Var = (s31) g7iVar.y;
                u58 u58Var = new u58(kt2Var, (byte) 3);
                cyu cyuVar = (cyu) g7iVar.z;
                s64 s64Var = (s64) g7iVar.A;
                cmt cmtVar = (cmt) g7iVar.B;
                gg5 gg5Var2 = (gg5) g7iVar.C;
                ix0 ix0Var = (ix0) g7iVar.D;
                eyg0 eyg0VarI = ((rrc) ((wsf0) g7iVar.E).b).I();
                erc ercVarW = ((kki) nr00Var.f23980a).w();
                iqt iqtVar = new iqt(gst0Var);
                g5k g5kVar = new g5k(((kki) nr00Var.f23980a).r());
                pyt pytVar = (pyt) g7iVar.G;
                i7i i7iVar = (i7i) ehf0Var.b;
                return new eh0(fs80Var, q91Var, oeg0Var, ctf0Var, mneVarH, m1eVar, s91Var, g2vVar, pw70Var, nc0Var, r7vVar, kb0Var, s31Var, u58Var, cyuVar, s64Var, cmtVar, gg5Var2, ix0Var, pruVar, yttVar, eyg0VarI, ercVarW, iqtVar, g5kVar, pytVar, new swt(new lhf0((khf0) i7iVar.r, (knf0) i7iVar.i, (mne) i7iVar.l), (j1q0) i7iVar.s), new lbu((x0u) g7iVar.H, new xsu(new fvt0(new yzn0((gii0) ((i7i) ehf0Var.b).m, (byte) 5))), (byte) 11), grjVar, new jqt(gst0Var), (xmt) g7iVar.I, (dmt) g7iVar.J);
            case 1:
                t7i t7iVar = (t7i) obj;
                v88 v88Var2 = (v88) t7iVar.r;
                duj dujVar2 = t7iVar.h;
                ytt yttVar2 = (ytt) t7iVar.g;
                wsf0 wsf0Var2 = (wsf0) t7iVar.j;
                gst0 gst0Var2 = (gst0) t7iVar.d;
                kt2 kt2Var2 = (kt2) t7iVar.m;
                ehf0 ehf0Var2 = (ehf0) t7iVar.f33467a;
                if (z) {
                    if (z) {
                        return new pw70((oeg0) t7iVar.f, new jdk0(), yttVar2);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                mne mneVarH3 = ((psc) ((cad) t7iVar.i).b).h();
                x1x.x(mneVarH3);
                pou pouVar = new pou(((i7i) ehf0Var2.b).c());
                x860 x860Var = (x860) t7iVar.l;
                oeg0 oeg0Var4 = (oeg0) t7iVar.f;
                pw70 pw70Var3 = (pw70) ((n5d0) t7iVar.k).get();
                wdu wduVarO = ((i7i) ehf0Var2.b).o();
                cmt cmtVar2 = new cmt((n31) ((i7i) ehf0Var2.b).E.get());
                yo4 yo4Var = new yo4(kt2Var2, (byte) 3);
                m1e m1eVar2 = t7iVar.e;
                s91 s91Var2 = (s91) t7iVar.n;
                ctf0 ctf0Var3 = t7iVar.c;
                xr xrVarM = ((i7i) ehf0Var2.b).m();
                iqt iqtVar2 = new iqt(gst0Var2);
                x20 x20Var = (x20) t7iVar.o;
                oeg0 oeg0Var5 = (oeg0) t7iVar.f;
                ctf0 ctf0Var4 = t7iVar.c;
                ih5 ih5Var3 = new ih5(kt2Var2, (byte) 2);
                l7k l7kVar2 = (l7k) t7iVar.p;
                gg5 gg5Var3 = (gg5) t7iVar.q;
                ih5 ih5Var4 = new ih5(kt2Var2, (byte) 0);
                g45 g45Var2 = (g45) wsf0Var2.b;
                return new n21(mneVarH3, pouVar, x860Var, oeg0Var4, dujVar2, pw70Var3, wduVarO, cmtVar2, yo4Var, m1eVar2, s91Var2, ctf0Var3, xrVarM, iqtVar2, x20Var, new kb0(dujVar2, oeg0Var5, ctf0Var4, ih5Var3, l7kVar2, gg5Var3, v88Var2, ih5Var4, g45Var2.y(), g45Var2.Q(), g45Var2.Y(), new iqt(gst0Var2), g45Var2.G(), wsf0Var2.s(), ((i7i) ehf0Var2.b).e()), v88Var2, (pru) t7iVar.b, ((g45) wsf0Var2.b).u(), new jqt(gst0Var2), (dmt) t7iVar.s, new abu(((g45) wsf0Var2.b).u(), new a7q(((i7i) ehf0Var2.b).c()), (byte) 2), new u58(kt2Var2, (byte) 3), new r7v((s91) t7iVar.n), (s64) t7iVar.t, (cmt) t7iVar.u, (bzt) t7iVar.v, ((rrc) ((wsf0) t7iVar.w).b).I(), (r9u) t7iVar.x, ((i7i) ehf0Var2.b).f(), yttVar2);
            case 2:
                u7i u7iVar = (u7i) obj;
                pru pruVar2 = u7iVar.H;
                uzc0 uzc0Var2 = u7iVar.z;
                duj dujVar3 = u7iVar.s;
                poq0 poq0Var = u7iVar.h;
                ytt yttVar3 = u7iVar.q;
                lrc lrcVar = u7iVar.f;
                gst0 gst0Var3 = u7iVar.b;
                kt2 kt2Var3 = u7iVar.k;
                ehf0 ehf0Var3 = u7iVar.g;
                wsf0 wsf0Var3 = u7iVar.e;
                if (z) {
                    if (z) {
                        return new pw70(u7iVar.p, new jdk0(), yttVar3);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                mne mneVarH4 = ((psc) u7iVar.f35184a.b).h();
                x1x.x(mneVarH4);
                iqt iqtVar3 = new iqt(gst0Var3);
                ntu ntuVar = u7iVar.c;
                m1e m1eVar3 = u7iVar.d;
                q0u q0uVarU = ((g45) wsf0Var3.b).u();
                g3j g3jVarG = ((mci) lrcVar.b).g();
                i7i i7iVar2 = (i7i) ehf0Var3.b;
                wti wtiVar = new wti((Object) new cu(new ocl((h0q0) i7iVar2.x), i7iVar2.k(), ((g45) ((wsf0) i7iVar2.v).b).E(), (byte) 22), i7iVar2.y, (byte) 18);
                khf0 khf0VarG = ((g45) wsf0Var3.b).G();
                trm0 trm0VarS = wsf0Var3.s();
                b8u b8uVarY = ((g45) wsf0Var3.b).Y();
                o470 o470VarE = poq0Var.f27342a.e();
                xmt xmtVar = u7iVar.i;
                pyt pytVar2 = u7iVar.j;
                pwi pwiVarC = poq0Var.f27342a.c();
                vd1 vd1Var = new vd1(kt2Var3, (byte) 0);
                ix0 ix0Var2 = u7iVar.l;
                s91 s91Var3 = u7iVar.m;
                erc ercVarW2 = ((kki) u7iVar.n.f23980a).w();
                jqt jqtVar = new jqt(gst0Var3);
                hru hruVar = new hru(new op1((byte) 0));
                i7i i7iVar3 = (i7i) ehf0Var3.b;
                edu eduVar = new edu(i7iVar3.c(), (gst0) i7iVar3.t);
                zr1 zr1Var = u7iVar.o;
                pw70 pw70Var4 = (pw70) u7iVar.N.get();
                dmt dmtVar = u7iVar.r;
                qu quVar = new qu(kt2Var3, (byte) 1);
                oeg0 oeg0Var6 = u7iVar.p;
                ctf0 ctf0Var5 = u7iVar.t;
                ih5 ih5Var5 = new ih5(kt2Var3, (byte) 2);
                l7k l7kVar3 = u7iVar.u;
                gg5 gg5Var4 = u7iVar.v;
                v88 v88Var3 = u7iVar.w;
                ih5 ih5Var6 = new ih5(kt2Var3, (byte) 0);
                g45 g45Var3 = (g45) wsf0Var3.b;
                kb0 kb0Var2 = new kb0(dujVar3, oeg0Var6, ctf0Var5, ih5Var5, l7kVar3, gg5Var4, v88Var3, ih5Var6, g45Var3.y(), g45Var3.Q(), g45Var3.Y(), new iqt(gst0Var3), g45Var3.G(), wsf0Var3.s(), ((i7i) ehf0Var3.b).e());
                dn0 dn0VarG = ((i7i) ehf0Var3.b).g();
                x1x.x(dn0VarG);
                return new mh1(mneVarH4, iqtVar3, ntuVar, m1eVar3, q0uVarU, g3jVarG, wtiVar, khf0VarG, trm0VarS, b8uVarY, o470VarE, xmtVar, pytVar2, pwiVarC, vd1Var, ix0Var2, s91Var3, ercVarW2, jqtVar, hruVar, eduVar, zr1Var, pw70Var4, dmtVar, quVar, kb0Var2, new moc(dn0VarG, false), new roq0(), ((h6i) u7iVar.x.f24171a).e(), u7iVar.t, yttVar3, new jh70(), u7iVar.y, uzc0Var2, u7iVar.A, u7iVar.B, dujVar3, new u58(kt2Var3, (byte) 3), new bzt(u7iVar.C), u7iVar.D, u7iVar.E, u7iVar.p, new jc0(u7iVar.p, u7iVar.F, uzc0Var2, u7iVar.G, pruVar2, u7iVar.t), lrcVar.x(), ((mci) lrcVar.b).h(), u7iVar.I, u7iVar.J, u7iVar.K, pruVar2, u7iVar.L, u7iVar.M);
            case 3:
                daf dafVar = (daf) obj;
                cad cadVar2 = (cad) dafVar.d;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    mne mneVarH5 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH5);
                    return new j9s0(mneVarH5, (btt0) dafVar.e, new zas0((gii0) dafVar.f, (byte) 0), (r9s0) dafVar.g, (knf0) dafVar.h);
                }
                long jLongValue = ((Long) dafVar.b).longValue();
                String str = (String) dafVar.c;
                u8u u8uVar = new u8u((j9s0) ((n5d0) dafVar.l).get(), (gst0) dafVar.i);
                x0u x0uVar = (x0u) dafVar.j;
                nou nouVarE = ((g45) ((wsf0) dafVar.k).b).E();
                mne mneVarH6 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH6);
                return new gl1(jLongValue, str, u8uVar, x0uVar, nouVarE, mneVarH6);
            case 4:
                w7i w7iVar = (w7i) obj;
                wsf0 wsf0Var4 = w7iVar.q;
                iqt iqtVar4 = w7iVar.i;
                duj dujVar4 = w7iVar.c;
                ytt yttVar4 = w7iVar.e;
                kt2 kt2Var4 = w7iVar.n;
                d1p d1pVar = w7iVar.o;
                ehf0 ehf0Var4 = w7iVar.f38673a;
                if (z) {
                    if (z) {
                        return new pw70(w7iVar.d, new jdk0(), yttVar4);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                wdu wduVarA = ((i7i) ehf0Var4.b).a();
                m1e m1eVar4 = w7iVar.b;
                i7i i7iVar4 = (i7i) ehf0Var4.b;
                zpu zpuVar = new zpu(i7iVar4.u(), (pmi) i7iVar4.y, b2);
                pw70 pw70Var5 = (pw70) w7iVar.B.get();
                xr xrVarM2 = ((i7i) ehf0Var4.b).m();
                ali aliVarF = ((i7i) ehf0Var4.b).f();
                soc socVarW = ((i7i) ehf0Var4.b).w();
                s91 s91Var4 = w7iVar.f;
                kc60 kc60Var = w7iVar.g;
                gto0 gto0VarS = ((i7i) ehf0Var4.b).s();
                oeg0 oeg0Var7 = w7iVar.d;
                ctf0 ctf0Var6 = w7iVar.h;
                long jLongValue2 = w7iVar.j.longValue();
                String str2 = w7iVar.k;
                s9s0 s9s0Var = w7iVar.l;
                boolean zBooleanValue = w7iVar.m.booleanValue();
                oeg0 oeg0Var8 = w7iVar.d;
                ctf0 ctf0Var7 = w7iVar.h;
                ih5 ih5Var7 = new ih5(kt2Var4, (byte) 2);
                l7k l7kVarC = d1pVar.C();
                gg5 gg5VarL = d1pVar.L();
                v88 v88Var4 = w7iVar.p;
                ih5 ih5Var8 = new ih5(kt2Var4, (byte) 0);
                g45 g45Var4 = (g45) wsf0Var4.b;
                kb0 kb0Var3 = new kb0(dujVar4, oeg0Var8, ctf0Var7, ih5Var7, l7kVarC, gg5VarL, v88Var4, ih5Var8, g45Var4.y(), g45Var4.Q(), g45Var4.Y(), iqtVar4, g45Var4.G(), wsf0Var4.s(), ((i7i) ehf0Var4.b).e());
                ieu ieuVar = new ieu((Object) ((i7i) ehf0Var4.b).u(), (Object) w7iVar.r, (byte) 13);
                qu quVar2 = new qu(kt2Var4, (byte) 1);
                u58 u58Var2 = new u58(kt2Var4, (byte) 3);
                ix0 ix0VarF0 = d1pVar.f0();
                zr1 zr1VarO = d1pVar.O();
                m0u m0uVarT = ((g45) wsf0Var4.b).t();
                eyg0 eyg0VarI2 = ((rrc) w7iVar.s.b).I();
                mne mneVarH7 = ((psc) w7iVar.t.b).h();
                x1x.x(mneVarH7);
                return new uv1(wduVarA, m1eVar4, zpuVar, dujVar4, pw70Var5, xrVarM2, aliVarF, socVarW, s91Var4, kc60Var, gto0VarS, yttVar4, oeg0Var7, ctf0Var6, iqtVar4, jLongValue2, str2, s9s0Var, zBooleanValue, kb0Var3, ieuVar, quVar2, u58Var2, ix0VarF0, zr1VarO, m0uVarT, eyg0VarI2, mneVarH7, w7iVar.u, w7iVar.v, w7iVar.w, w7iVar.x, d1pVar.D0());
            case 5:
                if (!z) {
                    return new c8i(this);
                }
                if (z) {
                    return new d8i(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 6:
                v7i v7iVar = (v7i) obj;
                pru pruVar3 = (pru) v7iVar.j;
                ehf0 ehf0Var5 = (ehf0) v7iVar.f36925a;
                if (z) {
                    if (z) {
                        return new pw70((oeg0) v7iVar.f, new jdk0(), (ytt) v7iVar.l);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                f7u f7uVar = new f7u(((i7i) ehf0Var5.b).c(), (j1q0) v7iVar.i, (ntu) v7iVar.b, pruVar3);
                ctf0 ctf0Var8 = (ctf0) v7iVar.c;
                iqt iqtVar5 = (iqt) v7iVar.k;
                m1e m1eVar5 = (m1e) v7iVar.d;
                vw3 vw3Var = (vw3) v7iVar.e;
                pw70 pw70Var6 = (pw70) ((n5d0) v7iVar.n).get();
                xex xexVarB = ((i7i) ehf0Var5.b).b();
                zn00 zn00VarV = ((i7i) ehf0Var5.b).v();
                ali aliVarF2 = ((i7i) ehf0Var5.b).f();
                oeg0 oeg0Var9 = (oeg0) v7iVar.f;
                duj dujVar5 = (duj) v7iVar.g;
                mne mneVarH8 = ((psc) ((cad) v7iVar.h).b).h();
                x1x.x(mneVarH8);
                return new g85(f7uVar, ctf0Var8, iqtVar5, m1eVar5, vw3Var, pw70Var6, xexVarB, zn00VarV, aliVarF2, oeg0Var9, dujVar5, mneVarH8, new kc60((gst0) v7iVar.m), pruVar3);
            case 7:
                f6i f6iVar = (f6i) obj;
                zlt0 zlt0Var = (zlt0) f6iVar.k;
                vby vbyVar = (vby) f6iVar.s;
                rrc rrcVar = (rrc) f6iVar.r;
                ave aveVar = (ave) f6iVar.i;
                m0f m0fVar = (m0f) f6iVar.h;
                lye lyeVar = (lye) f6iVar.g;
                if (!z) {
                    return new me6(((Integer) f6iVar.e).intValue(), new iqt((gst0) f6iVar.f), new ipc(new oif0(lyeVar, m0fVar, aveVar)), ((g45) ((wsf0) f6iVar.j).b).G(), zlt0Var, (mne) f6iVar.b, (duj) f6iVar.l, new dgu(new ert(f6iVar.b()), new j9c(f6iVar.b()), new rq(f6iVar.b(), new chf0(rrcVar, vbyVar)), new ni9(f6iVar.b())), new hst(new oif0(lyeVar, m0fVar, aveVar)), new hsj(f6iVar.b(), new ni9(f6iVar.b())), new rq(f6iVar.b(), new chf0(rrcVar, vbyVar)), new tqc(f6iVar.b()), (ctf0) f6iVar.c, new j9c(f6iVar.b()), new lsn(f6iVar.a()), new lef0(f6iVar.a()), new pv00(f6iVar.a()), new nmo(f6iVar.a()), new phf0(new edu((Object) new oif0(lyeVar, m0fVar, aveVar), (Object) new chf0(rrcVar, vbyVar), (byte) 22), (pru) f6iVar.t, zlt0Var), new tqc(f6iVar.b()), new j9c(f6iVar.b()), new hru(new ni9(f6iVar.b())));
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                oe6 oe6Var = new oe6();
                oe6Var.f25109a = new ArrayList();
                return oe6Var;
            case 8:
                g7i g7iVar2 = (g7i) obj;
                r9u r9uVar = (r9u) g7iVar2.E;
                drm0 drm0Var = (drm0) g7iVar2.D;
                wsf0 wsf0Var5 = g7iVar2.c;
                ort ortVar = (ort) g7iVar2.u;
                duj dujVar6 = g7iVar2.f;
                cad cadVar3 = g7iVar2.f10814a;
                v88 v88Var5 = g7iVar2.e;
                au0 au0Var = (au0) g7iVar2.A;
                bn6 bn6Var = (bn6) g7iVar2.z;
                buo0 buo0Var = (buo0) g7iVar2.y;
                lbu lbuVar = (lbu) g7iVar2.s;
                gst0 gst0Var4 = g7iVar2.b;
                j1q0 j1q0Var = (j1q0) g7iVar2.q;
                peg0 peg0Var = (peg0) g7iVar2.p;
                pru pruVar4 = g7iVar2.d;
                vqc vqcVar = (vqc) g7iVar2.m;
                rmd0 rmd0Var = (rmd0) g7iVar2.r;
                if (!z) {
                    drt drtVar = new drt(new f8u(g7iVar2.c()));
                    yk50 yk50Var = new yk50(new f8u(g7iVar2.c()), (byte) 22);
                    lhf0 lhf0VarA = g7iVar2.a();
                    f8u f8uVar = new f8u(g7iVar2.c());
                    qtt qttVar = new qtt(g7iVar2.b());
                    usu usuVar = new usu(g7iVar2.b());
                    dsi0 dsi0Var = new dsi0(g7iVar2.b());
                    epi0 epi0Var = new epi0(g7iVar2.b(), (byte) 29);
                    h03 h03Var2 = new h03(g7iVar2.b(), (byte) 26);
                    uii uiiVar = new uii(g7iVar2.b(), ((cih) vqcVar.b).a(), (zfo) g7iVar2.n, (edo) g7iVar2.o, peg0Var, (j1q0) g7iVar2.q);
                    yiu yiuVar = new yiu(j1q0Var, (byte) 0);
                    yfu yfuVar = new yfu(g7iVar2.b());
                    dsi0 dsi0Var2 = new dsi0(g7iVar2.b());
                    x4u x4uVar = new x4u(g7iVar2.b());
                    qtt qttVar2 = new qtt(g7iVar2.b());
                    oif0 oif0VarB = rmd0Var.b();
                    x1x.x(oif0VarB);
                    yk50 yk50VarD = rmd0Var.d();
                    x1x.x(yk50VarD);
                    vn7 vn7Var = new vn7(((cih) vqcVar.b).a());
                    r4v r4vVar = new r4v(gst0Var4, (byte) 0);
                    vpu vpuVarG = rmd0Var.g();
                    x1x.x(vpuVarG);
                    vpu vpuVarA = rmd0Var.a();
                    x1x.x(vpuVarA);
                    pwi pwiVarD = g7iVar2.d();
                    ctf0 ctf0Var9 = (ctf0) ((zix) g7iVar2.J).f44459a;
                    sa10 sa10Var = (sa10) g7iVar2.B;
                    mne mneVarH9 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH9);
                    return new po6(drtVar, yk50Var, lhf0VarA, f8uVar, qttVar, usuVar, dsi0Var, epi0Var, h03Var2, uiiVar, yiuVar, yfuVar, dsi0Var2, x4uVar, qttVar2, oif0VarB, yk50VarD, vn7Var, r4vVar, vpuVarG, vpuVarA, lbuVar, pwiVarD, buo0Var, pruVar4, bn6Var, au0Var, v88Var5, ctf0Var9, sa10Var, mneVarH9, (i1w0) g7iVar2.C, dujVar6, g7iVar2.g, ortVar, ((g45) wsf0Var5.b).q(), ((ali) drm0Var.f6568a).j(), new lk5(pruVar4, r9uVar, (byte) 3));
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                drt drtVar2 = new drt(new f8u(g7iVar2.c()));
                yk50 yk50Var2 = new yk50(new f8u(g7iVar2.c()), (byte) 22);
                lhf0 lhf0VarA2 = g7iVar2.a();
                f8u f8uVar2 = new f8u(g7iVar2.c());
                qtt qttVar3 = new qtt(g7iVar2.b());
                usu usuVar2 = new usu(g7iVar2.b());
                dsi0 dsi0Var3 = new dsi0(g7iVar2.b());
                epi0 epi0Var2 = new epi0(g7iVar2.b(), (byte) 29);
                h03 h03Var3 = new h03(g7iVar2.b(), (byte) 26);
                uii uiiVar2 = new uii(g7iVar2.b(), ((cih) vqcVar.b).a(), (zfo) g7iVar2.n, (edo) g7iVar2.o, peg0Var, (j1q0) g7iVar2.q);
                yiu yiuVar2 = new yiu(j1q0Var, (byte) 0);
                yfu yfuVar2 = new yfu(g7iVar2.b());
                dsi0 dsi0Var4 = new dsi0(g7iVar2.b());
                x4u x4uVar2 = new x4u(g7iVar2.b());
                qtt qttVar4 = new qtt(g7iVar2.b());
                oif0 oif0VarB2 = rmd0Var.b();
                x1x.x(oif0VarB2);
                yk50 yk50VarD2 = rmd0Var.d();
                x1x.x(yk50VarD2);
                vn7 vn7Var2 = new vn7(((cih) vqcVar.b).a());
                r4v r4vVar2 = new r4v(gst0Var4, (byte) 0);
                vpu vpuVarG2 = rmd0Var.g();
                x1x.x(vpuVarG2);
                vpu vpuVarA2 = rmd0Var.a();
                x1x.x(vpuVarA2);
                pwi pwiVarD2 = g7iVar2.d();
                ctf0 ctf0Var10 = (ctf0) ((zix) g7iVar2.J).f44459a;
                mne mneVarH10 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH10);
                return new vp6(drtVar2, yk50Var2, lhf0VarA2, f8uVar2, qttVar3, usuVar2, dsi0Var3, epi0Var2, h03Var3, uiiVar2, yiuVar2, yfuVar2, dsi0Var4, x4uVar2, qttVar4, oif0VarB2, yk50VarD2, vn7Var2, r4vVar2, vpuVarG2, vpuVarA2, lbuVar, pwiVarD2, buo0Var, pruVar4, bn6Var, au0Var, v88Var5, ctf0Var10, mneVarH10, (i1w0) g7iVar2.C, dujVar6, g7iVar2.g, ortVar, ((g45) wsf0Var5.b).q(), ((ali) drm0Var.f6568a).j(), new lk5(pruVar4, r9uVar, (byte) 3), (ocl) g7iVar2.F);
            case 9:
                v9i v9iVar = (v9i) obj;
                duj dujVar7 = (duj) v9iVar.r;
                cad cadVar4 = (cad) v9iVar.c;
                au0 au0Var2 = (au0) v9iVar.p;
                bn6 bn6Var2 = (bn6) v9iVar.o;
                poq0 poq0Var2 = (poq0) v9iVar.n;
                zfo zfoVar = (zfo) v9iVar.l;
                b3c0 b3c0Var = (b3c0) v9iVar.j;
                vqc vqcVar2 = (vqc) v9iVar.i;
                wsf0 wsf0Var6 = (wsf0) v9iVar.t;
                iw20 iw20Var = (iw20) v9iVar.m;
                gst0 gst0Var5 = (gst0) v9iVar.k;
                if (!z) {
                    f7u f7uVar2 = new f7u(v9iVar.b(), ((cih) vqcVar2.b).a(), b3c0Var, gst0Var5);
                    gdu gduVar = new gdu(v9iVar.b());
                    b8u b8uVar = new b8u(v9iVar.b());
                    edu eduVar2 = new edu(v9iVar.b(), zfoVar);
                    f8u f8uVar3 = new f8u(v9iVar.b());
                    nt ntVar = new nt(v9iVar.b());
                    yk50 yk50Var3 = new yk50(new f8u(v9iVar.b()), (byte) 22);
                    r4v r4vVar3 = new r4v(gst0Var5, (byte) 0);
                    lbu lbuVarD = ((uii) iw20Var.f15470a).D();
                    wsf0 wsf0Var7 = new wsf0(v9iVar.b(), (byte) 27);
                    lhf0 lhf0VarA3 = v9iVar.a();
                    drt drtVar3 = new drt(new gl5((byte) 23), new f8u(v9iVar.b()));
                    pru pruVarR = ((uii) iw20Var.f15470a).r();
                    mne mneVarH11 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH11);
                    as6Var = new as6(f7uVar2, gduVar, b8uVar, eduVar2, f8uVar3, ntVar, yk50Var3, r4vVar3, lbuVarD, wsf0Var7, lhf0VarA3, drtVar3, pruVarR, poq0Var2, bn6Var2, au0Var2, mneVarH11, (i1w0) v9iVar.q, dujVar7, (sa10) v9iVar.s, v9iVar.e, v9iVar.b, ((g45) wsf0Var6.b).g(), ((g45) wsf0Var6.b).l(), (r9u) v9iVar.d);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    f7u f7uVar3 = new f7u(v9iVar.b(), ((cih) vqcVar2.b).a(), b3c0Var, gst0Var5);
                    gdu gduVar2 = new gdu(v9iVar.b());
                    b8u b8uVar2 = new b8u(v9iVar.b());
                    edu eduVar3 = new edu(v9iVar.b(), zfoVar);
                    nt ntVar2 = new nt(v9iVar.b());
                    yk50 yk50Var4 = new yk50(new f8u(v9iVar.b()), (byte) 22);
                    r4v r4vVar4 = new r4v(gst0Var5, (byte) 0);
                    lbu lbuVarD2 = ((uii) iw20Var.f15470a).D();
                    wsf0 wsf0Var8 = new wsf0(v9iVar.b(), (byte) 27);
                    lhf0 lhf0VarA4 = v9iVar.a();
                    drt drtVar4 = new drt(new gl5((byte) 23), new f8u(v9iVar.b()));
                    mne mneVarH12 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH12);
                    as6Var = new wr6(f7uVar3, gduVar2, b8uVar2, eduVar3, ntVar2, yk50Var4, r4vVar4, lbuVarD2, wsf0Var8, lhf0VarA4, drtVar4, poq0Var2, bn6Var2, au0Var2, mneVarH12, (i1w0) v9iVar.q, dujVar7, v9iVar.e, v9iVar.b, ((g45) wsf0Var6.b).g(), ((g45) wsf0Var6.b).l(), (r9u) v9iVar.d, (ocl) v9iVar.u, new f8u(v9iVar.b()), ((uii) iw20Var.f15470a).r());
                }
                return as6Var;
            case 10:
                return a();
            case 11:
                bai baiVar = (bai) obj;
                if (z) {
                    if (z) {
                        return new xp7(baiVar.j, baiVar.k);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                mne mneVarH13 = ((psc) baiVar.b.b).h();
                x1x.x(mneVarH13);
                oeg0 oeg0Var10 = baiVar.c;
                qv2 qv2Var = baiVar.d;
                zfm0 zfm0VarZ = ((daf) baiVar.e.f30839a).Z();
                gle0 gle0Var = baiVar.f;
                atz atzVar = baiVar.g;
                oeg0Var10.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = oeg0Var10;
                gr00Var.b = qv2Var;
                gr00Var.c = zfm0VarZ;
                gr00Var.d = gle0Var;
                gr00Var.e = atzVar;
                return new hq7(mneVarH13, gr00Var, baiVar.h, baiVar.i, (xp7) baiVar.r.get(), baiVar.l, (sbx0) baiVar.m.f10231a, baiVar.n, baiVar.o, baiVar.p, baiVar.q);
            case 12:
                v7i v7iVar2 = (v7i) obj;
                b3c0 b3c0Var2 = (b3c0) v7iVar2.i;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    hc8 hc8Var = new hc8();
                    hc8Var.f12808a = new ic8(iun.f15405a, "", "");
                    return hc8Var;
                }
                kki kkiVar = new kki(new uyn(v7iVar2.a()), new stt(v7iVar2.a()), new rpt((pv00) v7iVar2.l), new hnu(v7iVar2.a()), new rou(b3c0Var2, (byte) 0), (byte) 27);
                yuu yuuVar = new yuu((Object) new stt(v7iVar2.a()), (Object) new rou(b3c0Var2, (byte) 0), (Object) new eqx(b3c0Var2, (byte) 1), (byte) 21);
                b4j b4jVar = (b4j) v7iVar2.f36925a;
                x20 x20Var2 = (x20) v7iVar2.m;
                bzt bztVar = (bzt) v7iVar2.k;
                m1e m1eVar6 = (m1e) v7iVar2.d;
                duj dujVar8 = (duj) v7iVar2.g;
                mne mneVarH14 = ((psc) ((cad) v7iVar2.h).b).h();
                x1x.x(mneVarH14);
                return new ld8(kkiVar, yuuVar, b4jVar, x20Var2, bztVar, m1eVar6, dujVar8, mneVarH14, (ctf0) v7iVar2.c, (i1w0) v7iVar2.b);
            case 13:
                o9i o9iVar = (o9i) obj;
                if (!z) {
                    return new oai(this);
                }
                if (z) {
                    return new pw70((oeg0) o9iVar.p, new jdk0(), (ytt) o9iVar.q);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 14:
                rai raiVar = (rai) obj;
                if (!z) {
                    return new qai(this);
                }
                if (z) {
                    return new pw70(raiVar.d, new jdk0(), ((vqc) raiVar.f.f23980a).o());
                }
                c99.h(z ? 1 : 0);
                return null;
            case 15:
                zai zaiVar = (zai) obj;
                if (z) {
                    if (z) {
                        return new yai(this);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                ctf0 ctf0Var11 = zaiVar.f44069a;
                i1w0 i1w0Var = zaiVar.b;
                mne mneVarH15 = ((psc) zaiVar.c.b).h();
                x1x.x(mneVarH15);
                return new ds10(ctf0Var11, i1w0Var, mneVarH15, ((uii) zaiVar.d.f15470a).r(), new j910(zaiVar.e, zaiVar.f, b3));
            case 16:
                return b();
            case 17:
                if (!z) {
                    return new jei(this);
                }
                if (z) {
                    return new rch(new op1((byte) 1));
                }
                c99.h(z ? 1 : 0);
                return null;
            case 18:
                return c();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return j();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return k();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return l();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return m();
            default:
                if (!z) {
                    return new vii(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                xbt xbtVar = new xbt();
                roj0.b(1, 0, null, 6);
                q7m0.a(xun.f41520a);
                return xbtVar;
        }
    }
}
