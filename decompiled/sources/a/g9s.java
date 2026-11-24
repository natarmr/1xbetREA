package a;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class g9s extends i3t0 {
    public static final /* synthetic */ int n0 = 0;
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
    public final luu X;
    public final qv2 Y;
    public final h3c Z;
    public final je a0;
    public final bn6 b0;
    public final drm0 c0;
    public final ntt d0;
    public final String e0;
    public final String f0;
    public final n0o0 g0;
    public bby h0;
    public c4m0 i0;
    public c4m0 j0;
    public bby k0;
    public bby l0;
    public bby m0;
    public final vzg0 o;
    public final SportGameDashboardScreenParams p;
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
    public g9s(vzg0 vzg0Var, SportGameDashboardScreenParams sportGameDashboardScreenParams, mne mneVar, i1w0 i1w0Var, rl70 rl70Var, ivn ivnVar, hcp0 hcp0Var, rbu rbuVar, hnu hnuVar, reu reuVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, r1u r1uVar, svu svuVar, qud qudVar, qbu qbuVar, fwt fwtVar, dvt dvtVar, dvt dvtVar2, n4u n4uVar, kut kutVar, uyn uynVar, a5v a5vVar, a5v a5vVar2, m1e m1eVar, tzi tziVar, daf dafVar, owp0 owp0Var, ctf0 ctf0Var, weu weuVar, yfm0 yfm0Var, zie0 zie0Var, s1u s1uVar, j1u j1uVar, a6u a6uVar, nc0 nc0Var, jru jruVar, aqp aqpVar, pru pruVar, lbu lbuVar, wyu wyuVar, owp0 owp0Var2, zsr zsrVar, uyu uyuVar, luu luuVar, qv2 qv2Var, h3c h3cVar, je jeVar, bn6 bn6Var, r9u r9uVar, drm0 drm0Var, ocl oclVar, abu abuVar, ntt nttVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        yje yjeVar = null;
        super(new ng0((Object) sportGameDashboardScreenParams, (Object) vzg0Var, (Object) lbuVar, (Object) wyuVar, (Object) r9uVar, (byte) 9), cvm0.p(rwjVar, vs10Var), new og0((byte) 3, pruVar, ctf0Var), (yzn0) null);
        this.o = vzg0Var;
        this.p = sportGameDashboardScreenParams;
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
        this.X = luuVar;
        this.Y = qv2Var;
        this.Z = h3cVar;
        this.a0 = jeVar;
        this.b0 = bn6Var;
        this.c0 = drm0Var;
        this.d0 = nttVar;
        long j = sportGameDashboardScreenParams.c;
        this.e0 = h97.h(j, "KEY_GAME_ID");
        this.f0 = h97.h(j, "KEY_GAME_TYPE");
        this.g0 = maz.b(new hc0(pruVar, (byte) 22));
        byte b = 0;
        sac.V(jiu0.a(this), f8s.f9122a, null, vs10Var, new g8s(this, yjeVar, b), 10);
        byte b2 = 4;
        byte b3 = 2;
        qjj.W(jiu0.a(this), vs10Var, null, new g8s(this, yjeVar, b2), 2);
        byte b4 = 1;
        i3t0.K(this, null, c9s.f3977a, new p8s(this, yjeVar, (byte) 9), 1);
        byte b5 = 5;
        qjj.W(jiu0.a(this), vs10Var, null, new g8s(this, yjeVar, b5), 2);
        i3t0.K(this, null, w8s.f38738a, new p8s(this, yjeVar, b5), 1);
        i3t0.K(this, null, z8s.f43984a, new p8s(this, yjeVar, (byte) 7), 1);
        sac.T(new fnq(uyuVar.f36509a.h(), new n8s(this, yjeVar, (byte) 10), (byte) 4), jiu0.a(this), b9s.h);
        byte b6 = 6;
        i3t0.K(this, null, y8s.f42209a, new p8s(this, yjeVar, b6), 1);
        i3t0.K(this, null, u8s.f35246a, new p8s(this, yjeVar, b2), 1);
        i3t0.K(this, null, o8s.f24846a, new p8s(this, yjeVar, b), 1);
        i3t0.K(this, null, a9s.f493a, new p8s(this, yjeVar, (byte) 8), 1);
        i3t0.L(this, new fnq(dvtVar2.a(), new n8s(this, yjeVar, b3), (byte) 4), null, null, 3);
        i3t0.K(this, null, s8s.f31817a, new p8s(this, yjeVar, b3), 1);
        i3t0.L(this, new fnq(kutVar.a(), new n8s(this, yjeVar, b), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(new i89(((btr) uynVar.f36498a).e.f1445a, (byte) 26), new n8s(this, yjeVar, b4), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(a5vVar.f291a.f3196a.f21156a, new g8s(this, yjeVar, b4), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(a5vVar2.f291a.f3196a.b, new g8s(this, yjeVar, b3), (byte) 4), null, null, 3);
        sac.T(new fnq(oclVar.e(udl0.DASHBOARD), new n8s(this, yjeVar, b2), (byte) 4), jiu0.a(this), q8s.h);
        sac.T(new fnq(abuVar.o(), new g8s(this, yjeVar, b6), (byte) 4), jiu0.a(this), d9s.h);
    }

    public final sff0 M() {
        return (sff0) this.g0.getValue();
    }

    public final void N(k9s k9sVar) {
        Object next;
        long j = k9sVar.H;
        H(new c8s(k9sVar, this, (byte) 0));
        Iterator it = this.X.f20692a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != j);
        lok0 lok0Var = (lok0) next;
        if (lok0Var == null || j == -1) {
            return;
        }
        H(new ynr(lok0Var, (byte) 2));
    }

    public final void O(u3z u3zVar, Long l) {
        c4m0 c4m0Var = this.i0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.j0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.i0 = qjj.W(jiu0.a(this), this.q.c, null, new atj(this, u3zVar, l, yjeVar, (byte) 10), 2);
    }

    public final void P(long j, long j2) {
        bby bbyVar = this.m0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.m0 = sac.V(jiu0.a(this), k8s.f17886a, null, this.q.c, new tr(this, j, j2, null, (byte) 7), 10);
    }

    public final void Q(long j, long j2, long j3, boolean z, boolean z2) {
        c4m0 c4m0Var = this.j0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.i0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.j0 = qjj.W(jiu0.a(this), this.q.c, null, new nor(this, j, z, j2, j3, z2, null, (byte) 2), 2);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        final v6s v6sVar = (v6s) obj;
        v6sVar.getClass();
        boolean z = v6sVar instanceof j6s;
        final byte b = 0;
        je jeVar = this.a0;
        bn6 bn6Var = this.b0;
        i1w0 i1w0Var = this.r;
        if (!z) {
            final byte b2 = 1;
            if (v6sVar.equals(n6s.b)) {
                r7s r7sVar = (r7s) D();
                r7sVar.getClass();
                long j = r7sVar.f29992a;
                String str = r7sVar.b;
                xvm0 xvm0Var = r7sVar.P;
                long id = xvm0Var != null ? xvm0Var.getId() : r7sVar.f;
                Long l = r7sVar.c;
                G(new n7s(new ActionMenuDialogParams(j, id, str, l != null ? l.longValue() : -1L, r7sVar.d, r7sVar.e, r7sVar.t, r7sVar.s && r7sVar.r, r7sVar.u, r7sVar.v, r7sVar.w, r7sVar.G, "", r7sVar.H)));
                return;
            }
            byte b3 = 7;
            yje yjeVar = null;
            if (v6sVar.equals(n6s.c)) {
                if (this.y.g()) {
                    sac.V(jiu0.a(this), e9s.f7437a, null, null, new g8s(this, yjeVar, b3), 14);
                    return;
                } else {
                    i1w0Var.d(new b8s(this, b));
                    return;
                }
            }
            if (v6sVar.equals(n6s.d)) {
                bby bbyVar = this.h0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.h0 = i3t0.K(this, null, r8s.f30043a, new p8s(this, yjeVar, b2), 1);
                    return;
                }
                return;
            }
            if (v6sVar.equals(n6s.e)) {
                c4m0 c4m0Var = this.i0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar2 = this.k0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                bby bbyVar3 = this.m0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                bby bbyVar4 = this.l0;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                bby bbyVar5 = this.h0;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                    return;
                }
                return;
            }
            if (v6sVar.equals(n6s.f23009a)) {
                E();
                return;
            }
            if (v6sVar instanceof m6s) {
                m6s m6sVar = (m6s) v6sVar;
                i1w0Var.d(new sl1((Object) this, m6sVar.f21287a, m6sVar.b, (byte) 10));
                return;
            }
            if (v6sVar instanceof t6s) {
                i1w0Var.d(new f3s(this, v6sVar, (byte) 2));
                return;
            }
            if (v6sVar instanceof p6s) {
                String str2 = ((p6s) v6sVar).f26472a;
                if (str2.length() == 0) {
                    return;
                }
                i1w0Var.d(new f3s(this, str2, (byte) 3));
                return;
            }
            if (v6sVar instanceof l6s) {
                H(new Function2() { // from class: a.e8s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b;
                        g9s g9sVar = this;
                        v6s v6sVar2 = v6sVar;
                        switch (b4) {
                            case 0:
                                r7s r7sVar2 = (r7s) obj3;
                                ((oyg0) obj2).getClass();
                                r7sVar2.getClass();
                                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(r7sVar2.j);
                                l6s l6sVar = (l6s) v6sVar2;
                                boolean z2 = l6sVar.f19523a;
                                jaj jajVar = l6sVar.b;
                                if (z2) {
                                    linkedHashSetO0.add(jajVar);
                                } else {
                                    linkedHashSetO0.remove(jajVar);
                                }
                                r7s r7sVarA = r7s.a(r7sVar2, 0L, null, null, false, 0L, 0L, null, linkedHashSetO0, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -513, 1048575);
                                g9sVar.o.e(jajVar.f16191a, Boolean.valueOf(z2));
                                return r7sVarA;
                            default:
                                r7s r7sVar3 = (r7s) obj3;
                                ((oyg0) obj2).getClass();
                                r7sVar3.getClass();
                                r7s r7sVarA2 = r7s.a(r7sVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, Integer.valueOf(((k6s) v6sVar2).f17786a), false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, 134217727, 1048575);
                                g9sVar.o.e("KEY_BROADCASTING_INDEX", r7sVarA2.F);
                                return r7sVarA2;
                        }
                    }
                });
                return;
            }
            if (v6sVar instanceof o6s) {
                py20 py20Var = ((o6s) v6sVar).f24753a;
                if (py20Var == py20.f27786a) {
                    this.d0.c(false);
                }
                H(new gup((Object) py20Var, (Object) this, (byte) 26));
                return;
            }
            if (v6sVar instanceof k6s) {
                H(new Function2() { // from class: a.e8s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b2;
                        g9s g9sVar = this;
                        v6s v6sVar2 = v6sVar;
                        switch (b4) {
                            case 0:
                                r7s r7sVar2 = (r7s) obj3;
                                ((oyg0) obj2).getClass();
                                r7sVar2.getClass();
                                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(r7sVar2.j);
                                l6s l6sVar = (l6s) v6sVar2;
                                boolean z2 = l6sVar.f19523a;
                                jaj jajVar = l6sVar.b;
                                if (z2) {
                                    linkedHashSetO0.add(jajVar);
                                } else {
                                    linkedHashSetO0.remove(jajVar);
                                }
                                r7s r7sVarA = r7s.a(r7sVar2, 0L, null, null, false, 0L, 0L, null, linkedHashSetO0, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -513, 1048575);
                                g9sVar.o.e(jajVar.f16191a, Boolean.valueOf(z2));
                                return r7sVarA;
                            default:
                                r7s r7sVar3 = (r7s) obj3;
                                ((oyg0) obj2).getClass();
                                r7sVar3.getClass();
                                r7s r7sVarA2 = r7s.a(r7sVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, Integer.valueOf(((k6s) v6sVar2).f17786a), false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, 134217727, 1048575);
                                g9sVar.o.e("KEY_BROADCASTING_INDEX", r7sVarA2.F);
                                return r7sVarA2;
                        }
                    }
                });
                return;
            }
            boolean z2 = v6sVar instanceof q6s;
            zsr zsrVar = this.W;
            SportGameDashboardScreenParams sportGameDashboardScreenParams = this.p;
            if (z2) {
                bn6Var.b(null, sportGameDashboardScreenParams.f47002a);
                jeVar.a(null, sportGameDashboardScreenParams.f47002a);
                zsrVar.a();
                H(new t4s((byte) 6));
                return;
            }
            if (v6sVar instanceof r6s) {
                bn6Var.n(sportGameDashboardScreenParams.f47002a);
                jeVar.s(sportGameDashboardScreenParams.f47002a);
                zsrVar.a();
                H(new t4s(b3));
                return;
            }
            if (v6sVar instanceof i6s) {
                H(new jar(v6sVar, (byte) 8));
                return;
            }
            if (v6sVar instanceof s6s) {
                sac.V(jiu0.a(this), null, null, this.q.f22085a, new cbq(this, ((s6s) v6sVar).f31719a, yjeVar, (byte) 14), 11);
                return;
            } else if (v6sVar instanceof u6s) {
                this.c0.i(udl0.DASHBOARD, ((u6s) v6sVar).f35153a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        long j2 = ((r7s) D()).e;
        boolean z3 = ((j6s) v6sVar).f16003a;
        bn6Var.c(j2, z3, ((r7s) D()).d);
        jeVar.e(((r7s) D()).e, z3, ((r7s) D()).d);
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
