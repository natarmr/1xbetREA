package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class yks extends i3t0 {
    public static final /* synthetic */ int m0 = 0;
    public final vpu A;
    public final r1u B;
    public final svu C;
    public final qud D;
    public final qbu E;
    public final fwt F;
    public final dvt G;
    public final n4u H;
    public final m1e I;
    public final tzi J;
    public final daf K;
    public final owp0 L;
    public final weu M;
    public final yfm0 N;
    public final zie0 O;
    public final s1u P;
    public final j1u Q;
    public final a6u R;
    public final nc0 S;
    public final jru T;
    public final aqp U;
    public final owp0 V;
    public final zsr W;
    public final qv2 X;
    public final h3c Y;
    public final je Z;
    public final bn6 a0;
    public final drm0 b0;
    public final yox c0;
    public final String d0;
    public final String e0;
    public final n0o0 f0;
    public bby g0;
    public c4m0 h0;
    public c4m0 i0;
    public bby j0;
    public bby k0;
    public bby l0;
    public final vzg0 o;
    public final SportGameLiteScreenParams p;
    public final mne q;
    public final i1w0 r;
    public final rl70 s;
    public final ivn t;
    public final hcp0 u;
    public final rbu v;
    public final hnu w;
    public final reu x;
    public final yk50 y;
    public final vpu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public yks(vzg0 vzg0Var, SportGameLiteScreenParams sportGameLiteScreenParams, mne mneVar, i1w0 i1w0Var, rl70 rl70Var, ivn ivnVar, hcp0 hcp0Var, rbu rbuVar, hnu hnuVar, reu reuVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, r1u r1uVar, svu svuVar, qud qudVar, qbu qbuVar, fwt fwtVar, dvt dvtVar, dvt dvtVar2, n4u n4uVar, kut kutVar, uyn uynVar, a5v a5vVar, a5v a5vVar2, m1e m1eVar, tzi tziVar, daf dafVar, owp0 owp0Var, ctf0 ctf0Var, weu weuVar, yfm0 yfm0Var, zie0 zie0Var, s1u s1uVar, j1u j1uVar, a6u a6uVar, nc0 nc0Var, jru jruVar, aqp aqpVar, pru pruVar, lbu lbuVar, owp0 owp0Var2, zsr zsrVar, qv2 qv2Var, h3c h3cVar, je jeVar, bn6 bn6Var, r9u r9uVar, drm0 drm0Var, ocl oclVar, yox yoxVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        byte b = 4;
        yje yjeVar = null;
        super(new mr0(sportGameLiteScreenParams, vzg0Var, lbuVar, r9uVar, (byte) 14), cvm0.p(rwjVar, vs10Var), new og0(b, pruVar, ctf0Var), (yzn0) null);
        this.o = vzg0Var;
        this.p = sportGameLiteScreenParams;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = rl70Var;
        this.t = ivnVar;
        this.u = hcp0Var;
        this.v = rbuVar;
        this.w = hnuVar;
        this.x = reuVar;
        this.y = yk50Var;
        this.z = vpuVar;
        this.A = vpuVar2;
        this.B = r1uVar;
        this.C = svuVar;
        this.D = qudVar;
        this.E = qbuVar;
        this.F = fwtVar;
        this.G = dvtVar;
        this.H = n4uVar;
        this.I = m1eVar;
        this.J = tziVar;
        this.K = dafVar;
        this.L = owp0Var;
        this.M = weuVar;
        this.N = yfm0Var;
        this.O = zie0Var;
        this.P = s1uVar;
        this.Q = j1uVar;
        this.R = a6uVar;
        this.S = nc0Var;
        this.T = jruVar;
        this.U = aqpVar;
        this.V = owp0Var2;
        this.W = zsrVar;
        this.X = qv2Var;
        this.Y = h3cVar;
        this.Z = jeVar;
        this.a0 = bn6Var;
        this.b0 = drm0Var;
        this.c0 = yoxVar;
        long j = sportGameLiteScreenParams.c;
        this.d0 = h97.h(j, "KEY_GAME_ID");
        this.e0 = h97.h(j, "KEY_GAME_TYPE");
        this.f0 = maz.b(new hc0(pruVar, (byte) 23));
        byte b2 = 0;
        sac.V(jiu0.a(this), xjs.f41002a, null, vs10Var, new yjs(this, yjeVar, b2), 10);
        byte b3 = 2;
        qjj.W(jiu0.a(this), vs10Var, null, new yjs(this, yjeVar, b), 2);
        byte b4 = 1;
        i3t0.K(this, null, vks.f37589a, new jks(this, yjeVar, (byte) 9), 1);
        byte b5 = 5;
        qjj.W(jiu0.a(this), vs10Var, null, new yjs(this, yjeVar, b5), 2);
        i3t0.K(this, null, qks.f28900a, new jks(this, yjeVar, b5), 1);
        i3t0.K(this, null, tks.f34111a, new jks(this, yjeVar, (byte) 7), 1);
        i3t0.K(this, null, sks.f32367a, new jks(this, yjeVar, (byte) 6), 1);
        i3t0.K(this, null, oks.f25420a, new jks(this, yjeVar, b), 1);
        i3t0.K(this, null, iks.f14943a, new jks(this, yjeVar, b2), 1);
        i3t0.K(this, null, uks.f35843a, new jks(this, yjeVar, (byte) 8), 1);
        i3t0.L(this, new fnq(dvtVar2.a(), new gks(this, yjeVar, b3), (byte) 4), null, null, 3);
        i3t0.K(this, null, mks.f21957a, new jks(this, yjeVar, b3), 1);
        i3t0.L(this, new fnq(kutVar.a(), new gks(this, yjeVar, b2), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(new i89(((btr) uynVar.f36498a).e.f1445a, (byte) 27), new gks(this, yjeVar, b4), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(a5vVar.f291a.f3196a.f21156a, new yjs(this, yjeVar, b4), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(a5vVar2.f291a.f3196a.b, new yjs(this, yjeVar, b3), (byte) 4), null, null, 3);
        sac.T(new fnq(oclVar.e(udl0.LITE), new gks(this, yjeVar, b), (byte) 4), jiu0.a(this), kks.h);
    }

    public final sff0 M() {
        return (sff0) this.f0.getValue();
    }

    public final void N(u3z u3zVar, Long l) {
        c4m0 c4m0Var = this.h0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.i0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.h0 = qjj.W(jiu0.a(this), this.q.c, null, new atj(this, u3zVar, l, yjeVar, (byte) 11), 2);
    }

    public final void O(long j, long j2) {
        bby bbyVar = this.l0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.l0 = sac.V(jiu0.a(this), dks.f6248a, null, this.q.c, new tr(this, j, j2, null, (byte) 8), 10);
    }

    public final void P(long j, long j2, long j3, boolean z, boolean z2) {
        c4m0 c4m0Var = this.i0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.h0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.i0 = qjj.W(jiu0.a(this), this.q.c, null, new nor(this, j, z, j2, j3, z2, null, (byte) 3), 2);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        final sis sisVar = (sis) obj;
        sisVar.getClass();
        boolean z = sisVar instanceof his;
        i1w0 i1w0Var = this.r;
        if (!z) {
            final byte b = 1;
            if (sisVar.equals(mis.b)) {
                njs njsVar = (njs) D();
                njsVar.getClass();
                long j = njsVar.f23650a;
                String str = njsVar.b;
                xvm0 xvm0Var = njsVar.M;
                long id = xvm0Var != null ? xvm0Var.getId() : njsVar.f;
                Long l = njsVar.c;
                G(new jjs(new ActionMenuDialogParams(j, id, str, l != null ? l.longValue() : -1L, njsVar.d, njsVar.e, njsVar.u, njsVar.t && njsVar.s, njsVar.v, njsVar.w, njsVar.x, njsVar.F, "", njsVar.G)));
                return;
            }
            byte b2 = 6;
            yje yjeVar = null;
            if (sisVar.equals(mis.c)) {
                if (this.y.g()) {
                    sac.V(jiu0.a(this), wks.f39322a, null, null, new yjs(this, yjeVar, b2), 14);
                    return;
                } else {
                    i1w0Var.d(new vjs(this, b));
                    return;
                }
            }
            if (sisVar.equals(mis.d)) {
                bby bbyVar = this.g0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.g0 = i3t0.K(this, null, lks.f20215a, new jks(this, yjeVar, b), 1);
                    return;
                }
                return;
            }
            if (sisVar.equals(mis.e)) {
                c4m0 c4m0Var = this.h0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar2 = this.j0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                bby bbyVar3 = this.l0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                bby bbyVar4 = this.k0;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                bby bbyVar5 = this.g0;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                    return;
                }
                return;
            }
            if (sisVar.equals(mis.f21860a)) {
                E();
                return;
            }
            if (sisVar instanceof lis) {
                lis lisVar = (lis) sisVar;
                i1w0Var.d(new sl1((Object) this, lisVar.f20120a, lisVar.b, (byte) 11));
                return;
            }
            if (sisVar instanceof qis) {
                i1w0Var.d(new f3s(this, sisVar, b2));
                return;
            }
            if (sisVar instanceof nis) {
                String str2 = ((nis) sisVar).f23604a;
                if (str2.length() == 0) {
                    return;
                }
                i1w0Var.d(new f3s(this, str2, (byte) 7));
                return;
            }
            if (sisVar instanceof ois) {
                if (((ois) sisVar).f25326a == tf50.b) {
                    this.c0.p(((njs) D()).f23650a, ((njs) D()).k == o49.b ? v39.ZONE : v39.VIDEO);
                    this.W.a();
                }
                final byte b3 = 0;
                H(new Function2() { // from class: a.wjs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        yks yksVar = this;
                        sis sisVar2 = sisVar;
                        switch (b4) {
                            case 0:
                                njs njsVar2 = (njs) obj3;
                                ((oyg0) obj2).getClass();
                                njsVar2.getClass();
                                njs njsVarA = njs.a(njsVar2, 0L, null, null, false, 0L, 0L, null, ((ois) sisVar2).f25326a, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -513, 65535);
                                yksVar.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA.j);
                                return njsVarA;
                            default:
                                njs njsVar3 = (njs) obj3;
                                ((oyg0) obj2).getClass();
                                njsVar3.getClass();
                                kis kisVar = (kis) sisVar2;
                                boolean z2 = kisVar.f18351a;
                                ch00 ch00Var = kisVar.b;
                                List list = njsVar3.l;
                                List listC = kotlin.collections.a.c(ch00Var);
                                njs njsVarA2 = njs.a(njsVar3, 0L, null, null, false, 0L, 0L, null, null, null, z2 ? CollectionsKt.q0(list, listC) : CollectionsKt.n0(list, listC), null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -2049, 65535);
                                yksVar.o.e(ch00Var.f4340a, Boolean.valueOf(z2));
                                return njsVarA2;
                        }
                    }
                });
                return;
            }
            if (sisVar instanceof kis) {
                H(new Function2() { // from class: a.wjs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b;
                        yks yksVar = this;
                        sis sisVar2 = sisVar;
                        switch (b4) {
                            case 0:
                                njs njsVar2 = (njs) obj3;
                                ((oyg0) obj2).getClass();
                                njsVar2.getClass();
                                njs njsVarA = njs.a(njsVar2, 0L, null, null, false, 0L, 0L, null, ((ois) sisVar2).f25326a, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -513, 65535);
                                yksVar.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA.j);
                                return njsVarA;
                            default:
                                njs njsVar3 = (njs) obj3;
                                ((oyg0) obj2).getClass();
                                njsVar3.getClass();
                                kis kisVar = (kis) sisVar2;
                                boolean z2 = kisVar.f18351a;
                                ch00 ch00Var = kisVar.b;
                                List list = njsVar3.l;
                                List listC = kotlin.collections.a.c(ch00Var);
                                njs njsVarA2 = njs.a(njsVar3, 0L, null, null, false, 0L, 0L, null, null, null, z2 ? CollectionsKt.q0(list, listC) : CollectionsKt.n0(list, listC), null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -2049, 65535);
                                yksVar.o.e(ch00Var.f4340a, Boolean.valueOf(z2));
                                return njsVarA2;
                        }
                    }
                });
                return;
            }
            if (sisVar instanceof iis) {
                H(new sjs(((iis) sisVar).f14842a, this, (byte) 0));
                return;
            }
            byte b4 = 0;
            if (sisVar instanceof jis) {
                H(new sjs(((jis) sisVar).f16590a, this, b4));
                return;
            }
            if (sisVar instanceof pis) {
                sac.V(jiu0.a(this), null, null, this.q.f22085a, new cbq(this, ((pis) sisVar).f27058a, yjeVar, (byte) 15), 11);
                return;
            } else if (sisVar instanceof ris) {
                this.b0.i(udl0.LITE, ((ris) sisVar).f30559a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        long j2 = ((njs) D()).e;
        boolean z2 = ((his) sisVar).f13130a;
        this.a0.c(j2, z2, ((njs) D()).d);
        this.Z.e(((njs) D()).e, z2, ((njs) D()).d);
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
