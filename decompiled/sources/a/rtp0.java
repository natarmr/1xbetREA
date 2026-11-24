package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.rating.impl.rating_history.screen.RatingHistoryScreen;
import org.xplatform.statistic.team.impl.team_completed_match.presentation.screen.CompletedMatchesTeamScreen;
import org.xplatform.statistic.team.impl.team_future_match.presentation.screen.FeatureMatchTeamScreen;
import org.xplatform.statistic.team.impl.team_rating_chart.presentation.screen.TeamRatingChartScreen;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;
import org.xplatform.statistic.team.impl.team_transfer.presentation.screen.TeamTransfersScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class rtp0 extends i3t0 {
    public static final /* synthetic */ int N = 0;
    public final cge0 A;
    public final g9m0 B;
    public final yo4 C;
    public final TypeParam D;
    public final String E;
    public final long F;
    public final int G;
    public final int H;
    public bby I;
    public bby J;
    public c4m0 K;
    public final c4m0 L;
    public bby M;
    public final i1w0 o;
    public final mne p;
    public final fhj q;
    public final wyu r;
    public final qzt s;
    public final duj t;
    public final f7u u;
    public final jwu v;
    public final lyu w;
    public final u58 x;
    public final juu y;
    public final zr1 z;

    public rtp0(i1w0 i1w0Var, mne mneVar, fhj fhjVar, ocl oclVar, wyu wyuVar, weu weuVar, qzt qztVar, uyu uyuVar, ctf0 ctf0Var, m1e m1eVar, duj dujVar, f7u f7uVar, jwu jwuVar, lyu lyuVar, u58 u58Var, juu juuVar, zr1 zr1Var, cge0 cge0Var, g9m0 g9m0Var, r9u r9uVar, yo4 yo4Var, TypeParam typeParam, String str, long j, int i, int i2) {
        i1w0Var.getClass();
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        sla0 sla0Var = new sla0(qztVar, weuVar, str, fhjVar, j, wyuVar, (byte) 2);
        tla0 tla0Var = new tla0(oclVar, ctf0Var, r9uVar, (byte) 7);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, sla0Var, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = i1w0Var;
        this.p = mneVar;
        this.q = fhjVar;
        this.r = wyuVar;
        this.s = qztVar;
        this.t = dujVar;
        this.u = f7uVar;
        this.v = jwuVar;
        this.w = lyuVar;
        this.x = u58Var;
        this.y = juuVar;
        this.z = zr1Var;
        this.A = cge0Var;
        this.B = g9m0Var;
        this.C = yo4Var;
        this.D = typeParam;
        this.E = str;
        this.F = j;
        this.G = i;
        this.H = i2;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new ntp0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), qtp0.h);
        c4m0 c4m0Var = this.L;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.L = sac.T(new fnq(m1eVar.b(), new ltp0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new ntp0(this, yjeVar, (byte) 0));
        }
        P();
    }

    public final String M(String str) {
        Object next;
        Iterator it = ((gsp0) D()).d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!str.equals(((esp0) next).f8341a));
        esp0 esp0Var = (esp0) next;
        String str2 = esp0Var != null ? esp0Var.f8341a : null;
        return str2 == null ? "" : str2;
    }

    public final String N(String str) {
        Object next;
        Iterator it = ((gsp0) D()).d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!str.equals(((esp0) next).f8341a));
        esp0 esp0Var = (esp0) next;
        String str2 = esp0Var != null ? esp0Var.c : null;
        return str2 == null ? "" : str2;
    }

    public final void O() {
        Object value;
        bby bbyVar = this.I;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, gsp0.a((gsp0) value, null, null, null, null, true, false, false, false, 143)));
            this.I = i3t0.K(this, null, new nop0((Object) this, (byte) 4), new gv60((Object) this, (yje) null, (byte) 19), 1);
        }
    }

    public final void P() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.J;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.J) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((gsp0) D()).h;
        byte b2 = 0;
        mne mneVar = this.p;
        this.J = z ? sac.X(jiu0.a(this), 30L, mneVar.b, ktp0.f18878a, new ltp0(this, yjeVar, b2)) : sac.V(jiu0.a(this), mtp0.f22381a, null, mneVar.b, new ltp0(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.K;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.K) != null) {
            c4m0Var.cancel(null);
        }
        this.K = sac.T(new fnq(this.u.n(this.E), new otp0(this, this.s.a(), yjeVar, b2), (byte) 4), jiu0.a(this), ptp0.h);
        O();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ifp0 ifp0Var;
        int i;
        String str;
        yrp0 yrp0Var = (yrp0) obj;
        yrp0Var.getClass();
        super.x(yrp0Var);
        boolean zEquals = yrp0Var.equals(vrp0.f37912a);
        final byte b = 0;
        i1w0 i1w0Var = this.o;
        if (!zEquals) {
            if (yrp0Var.equals(xrp0.f41380a)) {
                O();
                return;
            }
            if (!(yrp0Var instanceof wrp0)) {
                t9f.b();
                return;
            }
            int size = ((gsp0) D()).d.size();
            wrp0 wrp0Var = (wrp0) yrp0Var;
            int i2 = wrp0Var.b;
            if (size > i2) {
                ctp0 ctp0Var = wrp0Var.f39656a;
                final String str2 = ((esp0) ((gsp0) D()).d.get(i2)).c;
                this.x.i(ctp0Var.b);
                juu juuVar = this.y;
                int i3 = juuVar.f17177a.f11635a.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0);
                int i4 = this.H;
                if (i3 != 0 && !ctp0Var.equals(zsp0.c)) {
                    int i5 = juuVar.f17177a.f11635a.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0);
                    String strValueOf = String.valueOf(i4);
                    if (ctp0Var.equals(hsp0.c)) {
                        str = "stadium";
                    } else if (ctp0Var.equals(nsp0.c)) {
                        str = "future_matches";
                    } else if (ctp0Var.equals(osp0.c)) {
                        str = "finished_matches";
                    } else if (ctp0Var.equals(qsp0.c)) {
                        str = "team_transitions";
                    } else if (ctp0Var.equals(tsp0.c)) {
                        str = "rating";
                    } else if (ctp0Var.equals(usp0.c)) {
                        str = "rating_history";
                    } else {
                        str = ctp0Var.equals(xsp0.c) ? "team_list" : "";
                    }
                    this.z.t(i5, strValueOf, str);
                }
                if (ctp0Var instanceof xsp0) {
                    ifp0Var = ifp0.TEAM_LIST;
                    i1w0Var.d(new Function1(this) { // from class: a.jtp0
                        public final /* synthetic */ rtp0 b;

                        {
                            this.b = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:13:0x0038  */
                        /* JADX WARN: Code duplicated, block: B:15:0x003c  */
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
                              (r3v4 java.lang.Object) from 0x0034: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:10:0x0033, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]
                              (r3v4 java.lang.Object) from 0x0028: CHECK_CAST (a.esp0) (r3v4 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r7) {
                            /*
                                r6 = this;
                                byte r0 = r3
                                java.lang.String r1 = r2
                                a.rtp0 r6 = r6.b
                                a.k0w0 r7 = (a.k0w0) r7
                                switch(r0) {
                                    case 0: goto L4e;
                                    default: goto Lb;
                                }
                            Lb:
                                r7.getClass()
                                a.cge0 r0 = r6.A
                                java.lang.Object r2 = r6.D()
                                a.gsp0 r2 = (a.gsp0) r2
                                java.util.List r2 = r2.d
                                java.util.Iterator r2 = r2.iterator()
                            L1c:
                                boolean r3 = r2.hasNext()
                                r4 = 0
                                if (r3 == 0) goto L33
                                java.lang.Object r3 = r2.next()
                                r5 = r3
                                a.esp0 r5 = (a.esp0) r5
                                java.lang.String r5 = r5.f8341a
                                boolean r5 = r1.equals(r5)
                                if (r5 == 0) goto L1c
                                goto L34
                            L33:
                                r3 = r4
                            L34:
                                a.esp0 r3 = (a.esp0) r3
                                if (r3 == 0) goto L3a
                                java.lang.String r4 = r3.e
                            L3a:
                                if (r4 != 0) goto L3e
                                java.lang.String r4 = ""
                            L3e:
                                long r1 = r6.F
                                r0.getClass()
                                r6 = 1
                                org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen r6 = a.cge0.g(r4, r1, r6)
                                r7.h(r6)
                                kotlin.Unit r6 = kotlin.Unit.f46060a
                                return r6
                            L4e:
                                r7.getClass()
                                org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen r0 = new org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen
                                java.lang.String r1 = r6.N(r1)
                                org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam r6 = r6.D
                                java.lang.String r6 = org.xplatform.statistic.team.impl.team_statistic.domain.models.c.a(r6)
                                r0.<init>(r1, r6)
                                r7.h(r0)
                                kotlin.Unit r6 = kotlin.Unit.f46060a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: a.jtp0.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                } else if (ctp0Var instanceof hsp0) {
                    ifp0Var = ifp0.STADIUM;
                    final byte b2 = 1;
                    i1w0Var.d(new Function1(this) { // from class: a.jtp0
                        public final /* synthetic */ rtp0 b;

                        {
                            this.b = this;
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
                              (r3v4 java.lang.Object) from 0x0034: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:10:0x0033, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]
                              (r3v4 java.lang.Object) from 0x0028: CHECK_CAST (a.esp0) (r3v4 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r7) {
                            /*
                                r6 = this;
                                byte r0 = r3
                                java.lang.String r1 = r2
                                a.rtp0 r6 = r6.b
                                a.k0w0 r7 = (a.k0w0) r7
                                switch(r0) {
                                    case 0: goto L4e;
                                    default: goto Lb;
                                }
                            Lb:
                                r7.getClass()
                                a.cge0 r0 = r6.A
                                java.lang.Object r2 = r6.D()
                                a.gsp0 r2 = (a.gsp0) r2
                                java.util.List r2 = r2.d
                                java.util.Iterator r2 = r2.iterator()
                            L1c:
                                boolean r3 = r2.hasNext()
                                r4 = 0
                                if (r3 == 0) goto L33
                                java.lang.Object r3 = r2.next()
                                r5 = r3
                                a.esp0 r5 = (a.esp0) r5
                                java.lang.String r5 = r5.f8341a
                                boolean r5 = r1.equals(r5)
                                if (r5 == 0) goto L1c
                                goto L34
                            L33:
                                r3 = r4
                            L34:
                                a.esp0 r3 = (a.esp0) r3
                                if (r3 == 0) goto L3a
                                java.lang.String r4 = r3.e
                            L3a:
                                if (r4 != 0) goto L3e
                                java.lang.String r4 = ""
                            L3e:
                                long r1 = r6.F
                                r0.getClass()
                                r6 = 1
                                org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen r6 = a.cge0.g(r4, r1, r6)
                                r7.h(r6)
                                kotlin.Unit r6 = kotlin.Unit.f46060a
                                return r6
                            L4e:
                                r7.getClass()
                                org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen r0 = new org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen
                                java.lang.String r1 = r6.N(r1)
                                org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam r6 = r6.D
                                java.lang.String r6 = org.xplatform.statistic.team.impl.team_statistic.domain.models.c.a(r6)
                                r0.<init>(r1, r6)
                                r7.h(r0)
                                kotlin.Unit r6 = kotlin.Unit.f46060a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: a.jtp0.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                } else {
                    Object obj2 = null;
                    if (ctp0Var instanceof qsp0) {
                        ifp0Var = ifp0.TEAM_TRANSITIONS;
                        for (Object obj3 : ((gsp0) D()).d) {
                            if (str2.equals(((esp0) obj3).f8341a)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        esp0 esp0Var = (esp0) obj2;
                        if (esp0Var != null) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                            FragmentScreen teamTransfersScreen = new TeamTransfersScreen(esp0Var.c);
                            if (teamTransfersScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) teamTransfersScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(teamTransfersScreen)));
                            }
                            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                            while (true) {
                                paw pawVar = (paw) listIteratorO;
                                if (!pawVar.hasNext()) {
                                    break;
                                } else {
                                    i1w0Var.a((oe50) pawVar.next());
                                }
                            }
                        }
                    } else if (ctp0Var instanceof osp0) {
                        ifp0Var = ifp0.FINISHED_MATCHES;
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.h(new CompletedMatchesTeamScreen(M(str2)));
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (!pawVar2.hasNext()) {
                                break;
                            } else {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else if (ctp0Var instanceof nsp0) {
                        ifp0Var = ifp0.FUTURE_MATCHES;
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI2.h(new FeatureMatchTeamScreen(M(str2)));
                        ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO3;
                            if (!pawVar3.hasNext()) {
                                break;
                            } else {
                                i1w0Var.a((oe50) pawVar3.next());
                            }
                        }
                    } else if (ctp0Var instanceof tsp0) {
                        ifp0Var = ifp0.RATING;
                        k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI3.h(new TeamRatingChartScreen(N(str2)));
                        ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO4;
                            if (!pawVar4.hasNext()) {
                                break;
                            } else {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else if (ctp0Var instanceof usp0) {
                        ifp0Var = ifp0.RATING_HISTORY;
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                        this.B.getClass();
                        FragmentScreen ratingHistoryScreen = new RatingHistoryScreen(str2);
                        if (ratingHistoryScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) ratingHistoryScreen)));
                        } else {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(ratingHistoryScreen)));
                        }
                        ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO5;
                            if (!pawVar5.hasNext()) {
                                break;
                            } else {
                                i1w0Var.a((oe50) pawVar5.next());
                            }
                        }
                    } else {
                        if (!(ctp0Var instanceof zsp0)) {
                            t9f.b();
                            return;
                        }
                        ifp0Var = null;
                    }
                }
                if (ifp0Var == null || (i = this.G) == -1) {
                    return;
                }
                this.C.v(i, i4, ifp0Var);
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ3, 0);
        while (true) {
            paw pawVar6 = (paw) listIteratorP;
            if (!pawVar6.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar6.next());
            }
        }
    }
}
