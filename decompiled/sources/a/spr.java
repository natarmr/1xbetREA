package a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class spr extends i3t0 {
    public static final /* synthetic */ int j0 = 0;
    public final r1u A;
    public final qud B;
    public final zsr C;
    public final m1e D;
    public final tzi E;
    public final wdu F;
    public final daf G;
    public final pwi H;
    public final owp0 I;
    public final luu J;
    public final weu K;
    public final yfm0 L;
    public final zie0 M;
    public final j1u N;
    public final ocl O;
    public final a6u P;
    public final nc0 Q;
    public final jru R;
    public final aqp S;
    public final owp0 T;
    public final poq0 U;
    public final qv2 V;
    public final h3c W;
    public final vmr X;
    public final drm0 Y;
    public final nvu Z;
    public final String a0;
    public final String b0;
    public final n0o0 c0;
    public c4m0 d0;
    public c4m0 e0;
    public c4m0 f0;
    public c4m0 g0;
    public c4m0 h0;
    public c4m0 i0;
    public final vzg0 o;
    public final SportGameAdvancedScreenParams p;
    public final mne q;
    public final oeg0 r;
    public final rl70 s;
    public final ivn t;
    public final hcp0 u;
    public final rbu v;
    public final x4u w;
    public final yk50 x;
    public final vpu y;
    public final vpu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public spr(vzg0 vzg0Var, SportGameAdvancedScreenParams sportGameAdvancedScreenParams, mne mneVar, oeg0 oeg0Var, rl70 rl70Var, String str, ivn ivnVar, hcp0 hcp0Var, rbu rbuVar, x4u x4uVar, reu reuVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, r1u r1uVar, uyu uyuVar, svu svuVar, qud qudVar, qbu qbuVar, fwt fwtVar, dvt dvtVar, dvt dvtVar2, n4u n4uVar, kut kutVar, uyn uynVar, a5v a5vVar, a5v a5vVar2, zsr zsrVar, m1e m1eVar, tzi tziVar, wdu wduVar, daf dafVar, pwi pwiVar, owp0 owp0Var, luu luuVar, ctf0 ctf0Var, weu weuVar, yfm0 yfm0Var, zie0 zie0Var, s1u s1uVar, j1u j1uVar, ocl oclVar, drm0 drm0Var, rpt rptVar, ani0 ani0Var, a6u a6uVar, nc0 nc0Var, jru jruVar, aqp aqpVar, pru pruVar, lbu lbuVar, wyu wyuVar, owp0 owp0Var2, poq0 poq0Var, qv2 qv2Var, h3c h3cVar, vmr vmrVar, r9u r9uVar, drm0 drm0Var2, ocl oclVar2, nvu nvuVar) {
        Object value;
        Object value2;
        oeg0Var.getClass();
        str.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.f22085a);
        yje yjeVar = null;
        super(new co0((Object) sportGameAdvancedScreenParams, (Object) vzg0Var, (Object) lbuVar, (Object) wyuVar, (Object) r9uVar, (Object) str, (byte) 4), g090VarP, new bcn(ctf0Var, (byte) 16), (yzn0) null);
        this.o = vzg0Var;
        this.p = sportGameAdvancedScreenParams;
        this.q = mneVar;
        this.r = oeg0Var;
        this.s = rl70Var;
        this.t = ivnVar;
        this.u = hcp0Var;
        this.v = rbuVar;
        this.w = x4uVar;
        this.x = yk50Var;
        this.y = vpuVar;
        this.z = vpuVar2;
        this.A = r1uVar;
        this.B = qudVar;
        this.C = zsrVar;
        this.D = m1eVar;
        this.E = tziVar;
        this.F = wduVar;
        this.G = dafVar;
        this.H = pwiVar;
        this.I = owp0Var;
        this.J = luuVar;
        this.K = weuVar;
        this.L = yfm0Var;
        this.M = zie0Var;
        this.N = j1uVar;
        this.O = oclVar;
        this.P = a6uVar;
        this.Q = nc0Var;
        this.R = jruVar;
        this.S = aqpVar;
        this.T = owp0Var2;
        this.U = poq0Var;
        this.V = qv2Var;
        this.W = h3cVar;
        this.X = vmrVar;
        this.Y = drm0Var2;
        this.Z = nvuVar;
        long j = sportGameAdvancedScreenParams.c;
        this.a0 = h97.h(j, "KEY_GAME_ID");
        this.b0 = h97.h(j, "KEY_GAME_TYPE");
        this.c0 = maz.b(new hc0(pruVar, (byte) 21));
        if (((qnr) D()).Y) {
            p7m0 p7m0Var = ((ik6) drm0Var.f6568a).f14910a.f13193a;
            do {
                value2 = p7m0Var.getValue();
                ((Boolean) value2).getClass();
            } while (!p7m0Var.m(value2, Boolean.TRUE));
        }
        Boolean bool = (Boolean) vzg0Var.a("KEY_BET_BUILDER_AVAILABILITY");
        if (bool != null) {
            p7m0 p7m0Var2 = ((tdl0) ani0Var.f1155a).n.f23420a;
            do {
                value = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value, bool));
        }
        sac.V(jiu0.a(this), eor.f8149a, null, vs10Var, new Cfor(this, yjeVar, (byte) 0), 10);
        byte b = 8;
        byte b2 = 2;
        qjj.W(jiu0.a(this), vs10Var, null, new Cfor(this, yjeVar, b), 2);
        byte b3 = 4;
        sac.T(new fnq(s1uVar.a(), new lor(this, yjeVar, (byte) 11), (byte) 4), jiu0.a(this), opr.h);
        byte b4 = 9;
        qjj.W(jiu0.a(this), vs10Var, null, new Cfor(this, yjeVar, b4), 2);
        byte b5 = 7;
        qjj.W(jiu0.a(this), vs10Var, null, new Cfor(this, yjeVar, b5), 2);
        sac.T(new fnq(reuVar.b(), new lor(this, yjeVar, b4), (byte) 4), d5c.S(jiu0.a(this), vs10Var), kpr.h);
        sac.T(new fnq(uyuVar.f36509a.h(), new cin(this, yjeVar, b), (byte) 4), jiu0.a(this), npr.h);
        sac.T(new fnq(svuVar.h(), new lor(this, yjeVar, b), (byte) 4), jiu0.a(this), ipr.h);
        sac.T(new fnq(qbuVar.a(), new lor(this, yjeVar, b5), (byte) 4), jiu0.a(this), fpr.h);
        sac.T(new fnq(fwtVar.a(), new lor(this, yjeVar, b3), (byte) 4), jiu0.a(this), zor.h);
        sac.T(new fnq(dvtVar.a(), new lor(this, yjeVar, (byte) 10), (byte) 4), jiu0.a(this), mpr.h);
        byte b6 = 3;
        sac.T(new fnq(dvtVar2.a(), new lor(this, yjeVar, b6), (byte) 4), jiu0.a(this), xor.h);
        sac.T(new fnq(n4uVar.b(), new lor(this, yjeVar, (byte) 6), (byte) 4), jiu0.a(this), cpr.h);
        sac.T(new fnq(kutVar.a(), new lor(this, yjeVar, b2), (byte) 4), jiu0.a(this), sor.h);
        sac.T(new fnq(new i89(((btr) uynVar.f36498a).e.f1445a, (byte) 24), new fhq(this, yjeVar, b2), (byte) 4), jiu0.a(this), tor.h);
        sac.T(new fnq(a5vVar.f291a.f3196a.f21156a, new Cfor(this, yjeVar, b3), (byte) 4), jiu0.a(this), uor.h);
        byte b7 = 5;
        sac.T(new fnq(a5vVar2.f291a.f3196a.b, new Cfor(this, yjeVar, b7), (byte) 4), jiu0.a(this), vor.h);
        sac.T(new fnq(oclVar2.e(udl0.ADVANCED), new lor(this, yjeVar, b7), (byte) 4), jiu0.a(this), apr.h);
        sac.T(new fnq(i120.W(((ik6) oclVar.f25032a).f14910a.f13193a), new Cfor(this, yjeVar, b6), (byte) 4), jiu0.a(this), por.h);
        sac.T(new fnq(new i89(((tdl0) rptVar.f30901a).n.f23420a, (byte) 22), new Cfor(this, yjeVar, b2), (byte) 4), jiu0.a(this), oor.h);
    }

    public final sff0 M() {
        return (sff0) this.c0.getValue();
    }

    public final void N(l9s l9sVar) {
        boolean z;
        Object next;
        byte b = 0;
        if (l9sVar instanceof k9s) {
            z = ((k9s) l9sVar).W;
        } else {
            if (!(l9sVar instanceof j9s)) {
                t9f.b();
                return;
            }
            z = false;
        }
        H(new q2n((Object) l9sVar, z, (Object) this, (byte) 4));
        Iterator it = this.J.f20692a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != l9sVar.k());
        lok0 lok0Var = (lok0) next;
        if (lok0Var == null || l9sVar.k() == -1) {
            return;
        }
        H(new ynr(lok0Var, b));
    }

    public final void O() {
        qnr qnrVar = (qnr) D();
        long j = qnrVar.f29044a;
        long j2 = qnrVar.e;
        t3z t3zVar = qnrVar.i;
        u3z u3zVar = new u3z(j, t3zVar, j2);
        yje yjeVar = null;
        if (((qnr) D()).Y) {
            Long l = ((qnr) D()).g;
            c4m0 c4m0Var = this.f0;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            c4m0 c4m0Var2 = this.g0;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.f0 = qjj.W(jiu0.a(this), this.q.c, null, new mor(this, u3zVar, l, yjeVar, (byte) 0), 2);
            return;
        }
        if (j == ((qnr) D()).f) {
            P(u3zVar, ((qnr) D()).g);
            return;
        }
        if (((qnr) D()).f == 0) {
            P(u3zVar, ((qnr) D()).g);
        } else if (((qnr) D()).f != -746) {
            R(((qnr) D()).f, j, j2, t3zVar == t3z.c, M().D0);
        } else {
            Q(j2, j);
            P(u3zVar, null);
        }
    }

    public final void P(u3z u3zVar, Long l) {
        c4m0 c4m0Var = this.f0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.g0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.f0 = qjj.W(jiu0.a(this), this.q.c, null, new mor(this, u3zVar, l, yjeVar, (byte) 1), 2);
    }

    public final void Q(long j, long j2) {
        c4m0 c4m0Var = this.e0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.e0 = qjj.W(jiu0.a(this), this.q.c, null, new tr(this, j, j2, null, (byte) 5), 2);
    }

    public final void R(long j, long j2, long j3, boolean z, boolean z2) {
        c4m0 c4m0Var = this.g0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.f0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.g0 = qjj.W(jiu0.a(this), this.q.c, null, new nor(this, j, z, j2, j3, z2, null, (byte) 0), 2);
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.d0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        final umr umrVar = (umr) obj;
        umrVar.getClass();
        boolean z = umrVar instanceof jmr;
        final byte b = 0;
        oeg0 oeg0Var = this.r;
        vmr vmrVar = this.X;
        if (!z) {
            if (umrVar.equals(lmr.c)) {
                vmrVar.f37684a.q("game_menu");
                vmrVar.b.r("game_menu");
                qnr qnrVar = (qnr) D();
                long j = qnrVar.f29044a;
                String str = qnrVar.b;
                xvm0 xvm0Var = qnrVar.N;
                long id = xvm0Var != null ? xvm0Var.getId() : qnrVar.f;
                Long l = qnrVar.c;
                G(new mnr(new ActionMenuDialogParams(j, id, str, l != null ? l.longValue() : -1L, qnrVar.d, qnrVar.e, qnrVar.s, qnrVar.r && qnrVar.q, qnrVar.t, qnrVar.u, qnrVar.v, qnrVar.D, qnrVar.j, qnrVar.E)));
                return;
            }
            yje yjeVar = null;
            if (umrVar.equals(lmr.d)) {
                vmrVar.f37684a.q("one_click");
                vmrVar.b.r("one_click");
                if (this.x.g()) {
                    sac.V(jiu0.a(this), ppr.f27384a, null, null, new Cfor(this, yjeVar, (byte) 10), 14);
                    return;
                } else {
                    oeg0Var.c().d(new znr(this, b));
                    return;
                }
            }
            if (umrVar.equals(lmr.e)) {
                c4m0 c4m0Var = this.d0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.d0 = sac.T(new fnq(this.D.b(), new Cfor(this, yjeVar, (byte) 6), (byte) 4), jiu0.a(this), bpr.h);
                    return;
                }
                return;
            }
            if (umrVar.equals(lmr.f)) {
                c4m0 c4m0Var2 = this.f0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                c4m0 c4m0Var3 = this.h0;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = this.e0;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                c4m0 c4m0Var5 = this.i0;
                if (c4m0Var5 != null) {
                    c4m0Var5.cancel(null);
                }
                c4m0 c4m0Var6 = this.d0;
                if (c4m0Var6 != null) {
                    c4m0Var6.cancel(null);
                    return;
                }
                return;
            }
            if (umrVar.equals(lmr.b)) {
                E();
                return;
            }
            boolean z2 = umrVar instanceof kmr;
            zsr zsrVar = this.C;
            SportGameAdvancedScreenParams sportGameAdvancedScreenParams = this.p;
            if (z2) {
                if (((qnr) D()).I) {
                    return;
                }
                long j2 = sportGameAdvancedScreenParams.f46985a;
                h97.x("sport_id", Long.valueOf(j2), vmrVar.f37684a.b, "bet_gameview_point_swap");
                vmrVar.b.f16351a.a(cui0.b(new i1p((byte) 2, j2)), 3177L);
                H(new Function2() { // from class: a.aor
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        boolean z3;
                        boolean z4;
                        byte b2 = b;
                        spr sprVar = this;
                        umr umrVar2 = umrVar;
                        switch (b2) {
                            case 0:
                                qnr qnrVar2 = (qnr) obj3;
                                ((oyg0) obj2).getClass();
                                qnrVar2.getClass();
                                dja djaVar = ((kmr) umrVar2).f18555a;
                                boolean z5 = false;
                                if (qnrVar2.z) {
                                    z3 = djaVar == dja.BROADCASTING_VIDEO;
                                } else {
                                    z3 = qnrVar2.B;
                                }
                                if (qnrVar2.A) {
                                    if (djaVar == dja.BROADCASTING_ZONE) {
                                        z4 = true;
                                    }
                                    qnr qnrVarA = qnr.a(qnrVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, z3, z4, false, false, false, false, false, null, null, false, false, null, null, null, djaVar, null, null, null, null, null, false, null, false, -503316481, 523775);
                                    sprVar.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA.P);
                                    return qnrVarA;
                                }
                                z5 = qnrVar2.C;
                                z4 = z5;
                                qnr qnrVarA2 = qnr.a(qnrVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, z3, z4, false, false, false, false, false, null, null, false, false, null, null, null, djaVar, null, null, null, null, null, false, null, false, -503316481, 523775);
                                sprVar.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA2.P);
                                return qnrVarA2;
                            default:
                                qnr qnrVar3 = (qnr) obj3;
                                ((oyg0) obj2).getClass();
                                qnrVar3.getClass();
                                qnr qnrVarA3 = qnr.a(qnrVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, ((mmr) umrVar2).f22055a, null, false, -1, 491519);
                                sprVar.o.e("KEY_EXPANDED_CARD_SECTION", Boolean.valueOf(qnrVarA3.V));
                                return qnrVarA3;
                        }
                    }
                });
                qnr qnrVar2 = (qnr) D();
                boolean z3 = qnrVar2.z;
                boolean z4 = qnrVar2.A;
                dja djaVar = ((kmr) umrVar).f18555a;
                b = (djaVar == dja.BROADCASTING_VIDEO || djaVar == dja.BROADCASTING_ZONE) ? (byte) 1 : (byte) 0;
                if ((z4 || z3) && b != 0) {
                    zsrVar.a();
                    return;
                }
                return;
            }
            if (umrVar instanceof qmr) {
                zsrVar.a();
                int iOrdinal = ((qmr) umrVar).f28998a.ordinal();
                if (iOrdinal == 4) {
                    long j3 = sportGameAdvancedScreenParams.f46985a;
                    vmrVar.f37684a.b(null, j3);
                    vmrVar.b.a(null, j3);
                    H(new nuq((byte) 11));
                    return;
                }
                if (iOrdinal != 5) {
                    return;
                }
                long j4 = sportGameAdvancedScreenParams.f46985a;
                vmrVar.f37684a.n(j4);
                vmrVar.b.s(j4);
                H(new nuq((byte) 12));
                return;
            }
            if (umrVar instanceof nmr) {
                nmr nmrVar = (nmr) umrVar;
                oeg0Var.c().d(new sl1((Object) this, nmrVar.f23785a, nmrVar.b, (byte) 8));
                return;
            }
            if (umrVar instanceof pmr) {
                pmr pmrVar = (pmr) umrVar;
                G(new lnr(pmrVar.f27250a, pmrVar.b));
                return;
            }
            if (umrVar instanceof mmr) {
                final byte b2 = 1;
                H(new Function2() { // from class: a.aor
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        boolean z5;
                        boolean z6;
                        byte b3 = b2;
                        spr sprVar = this;
                        umr umrVar2 = umrVar;
                        switch (b3) {
                            case 0:
                                qnr qnrVar3 = (qnr) obj3;
                                ((oyg0) obj2).getClass();
                                qnrVar3.getClass();
                                dja djaVar2 = ((kmr) umrVar2).f18555a;
                                boolean z7 = false;
                                if (qnrVar3.z) {
                                    z5 = djaVar2 == dja.BROADCASTING_VIDEO;
                                } else {
                                    z5 = qnrVar3.B;
                                }
                                if (qnrVar3.A) {
                                    if (djaVar2 == dja.BROADCASTING_ZONE) {
                                        z6 = true;
                                    }
                                    qnr qnrVarA2 = qnr.a(qnrVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, z5, z6, false, false, false, false, false, null, null, false, false, null, null, null, djaVar2, null, null, null, null, null, false, null, false, -503316481, 523775);
                                    sprVar.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA2.P);
                                    return qnrVarA2;
                                }
                                z7 = qnrVar3.C;
                                z6 = z7;
                                qnr qnrVarA3 = qnr.a(qnrVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, z5, z6, false, false, false, false, false, null, null, false, false, null, null, null, djaVar2, null, null, null, null, null, false, null, false, -503316481, 523775);
                                sprVar.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA3.P);
                                return qnrVarA3;
                            default:
                                qnr qnrVar4 = (qnr) obj3;
                                ((oyg0) obj2).getClass();
                                qnrVar4.getClass();
                                qnr qnrVarA4 = qnr.a(qnrVar4, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, ((mmr) umrVar2).f22055a, null, false, -1, 491519);
                                sprVar.o.e("KEY_EXPANDED_CARD_SECTION", Boolean.valueOf(qnrVarA4.V));
                                return qnrVarA4;
                        }
                    }
                });
                return;
            }
            if (umrVar instanceof smr) {
                oeg0Var.c().d(new f5p(this, umrVar, (byte) 25));
                return;
            }
            if (umrVar instanceof omr) {
                String str2 = ((omr) umrVar).f25516a;
                if (str2.length() == 0) {
                    return;
                }
                oeg0Var.c().d(new f5p(this, str2, (byte) 24));
                return;
            }
            if (umrVar.equals(lmr.f20311a)) {
                if (this.U.f27342a.d().r(fk60.GAME_SCREEN)) {
                    G(nnr.f23836a);
                    return;
                }
                return;
            } else if (umrVar instanceof rmr) {
                sac.V(jiu0.a(this), null, null, this.q.f22085a, new cbq(this, ((rmr) umrVar).f30755a, yjeVar, (byte) 9), 11);
                return;
            } else if (umrVar instanceof tmr) {
                this.Y.i(udl0.ADVANCED, ((tmr) umrVar).f34207a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (((qnr) D()).V) {
            H(new xnr(this, (byte) 0));
            return;
        }
        long j5 = ((qnr) D()).e;
        boolean z5 = ((jmr) umrVar).f16779a;
        boolean z6 = ((qnr) D()).d;
        vmrVar.f37684a.c(j5, z5, z6);
        vmrVar.b.e(j5, z5, z6);
        i1w0 i1w0VarC = oeg0Var.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
