package a;

import a.m1r;
import a.ufx;
import a.w62;
import a.xm;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class atk extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final nv20 A;
    public final ivn B;
    public final oeg0 C;
    public bby D;
    public bby E;
    public bby F;
    public long G;
    public final n0o0 H;
    public final n0o0 I;
    public final DisciplineDetailsParams o;
    public final hzg p;
    public final mne q;
    public final hjd r;
    public final ctf0 s;
    public final duj t;
    public final pmi0 u;
    public final ugf0 v;
    public final luu w;
    public final ih5 x;
    public final zr1 y;
    public final fvt0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public atk(vzg0 vzg0Var, v5u v5uVar, q5u q5uVar, DisciplineDetailsParams disciplineDetailsParams, pru pruVar, hzg hzgVar, mne mneVar, g2v g2vVar, y78 y78Var, hjd hjdVar, ctf0 ctf0Var, duj dujVar, pmi0 pmi0Var, ugf0 ugf0Var, svu svuVar, r9u r9uVar, lbu lbuVar, luu luuVar, ih5 ih5Var, zr1 zr1Var, fvt0 fvt0Var, nv20 nv20Var, ivn ivnVar, oeg0 oeg0Var) {
        ctf0Var.getClass();
        r9uVar.getClass();
        oeg0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        byte b = 2;
        super(new co0((Parcelable) disciplineDetailsParams, pruVar, luuVar, svuVar, lbuVar, r9uVar, (byte) 3), cvm0.p(rwjVar, rwjVar), new mlb(ctf0Var, g2vVar, y78Var, b), (yzn0) null);
        this.o = disciplineDetailsParams;
        this.p = hzgVar;
        this.q = mneVar;
        this.r = hjdVar;
        this.s = ctf0Var;
        this.t = dujVar;
        this.u = pmi0Var;
        this.v = ugf0Var;
        this.w = luuVar;
        this.x = ih5Var;
        this.y = zr1Var;
        this.z = fvt0Var;
        this.A = nv20Var;
        this.B = ivnVar;
        this.C = oeg0Var;
        this.H = maz.b(new lrk(v5uVar, this, b));
        this.I = maz.b(new lrk(q5uVar, this, (byte) 3));
        qjj.W(jiu0.a(this), null, null, new vsk(this, null), 3);
        i3t0.K(this, null, null, new pn(this, null, (byte) 24), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[EDGE_INSN: B:27:0x0075->B:28:0x0076 BREAK  A[LOOP:0: B:22:0x0064->B:52:?]] */
    public final void M() {
        kuk kukVar;
        j0g0 j0g0Var;
        kuk kukVar2;
        this.y.e(org.xplatform.cyber.section.api.domain.entity.d.e(((ksk) D()).f18817a.b.f46556a));
        boolean zD = Intrinsics.d(((ksk) D()).f18817a.b, CyberGamesPage.Real.INSTANCE);
        boolean z = true;
        n0o0 n0o0Var = this.I;
        if (!zD) {
            j0g0 j0g0Var2 = (j0g0) ((ise0) n0o0Var.getValue()).f15299a.f40549a.getValue();
            if (j0g0Var2 != null) {
                Object obj = j0g0Var2.f15681a;
                if (obj instanceof g0g0) {
                    obj = null;
                }
                kukVar = (kuk) obj;
            } else {
                kukVar = null;
            }
            if (kukVar != null && (j0g0Var = kukVar.f18914a) != null) {
                Object obj2 = j0g0Var.f15681a;
                List list = (List) (obj2 instanceof g0g0 ? null : obj2);
                if (list == null || !(!list.isEmpty())) {
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
        } else {
            j0g0 j0g0Var3 = (j0g0) ((ise0) n0o0Var.getValue()).f15299a.f40549a.getValue();
            if (j0g0Var3 != null) {
                Object obj3 = j0g0Var3.f15681a;
                if (obj3 instanceof g0g0) {
                    obj3 = null;
                }
                kukVar2 = (kuk) obj3;
            } else {
                kukVar2 = null;
            }
            if (kukVar2 == null) {
                z = false;
                break;
            }
            Object obj4 = kukVar2.j;
            e0g0 e0g0Var = j0g0.b;
            List list2 = (List) (obj4 instanceof g0g0 ? null : obj4);
            if (list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (!((xah) it.next()).n);
            } else {
                z = false;
                break;
            }
        }
        ((uzg) this.p).k(((ksk) D()).f18817a.b.f46556a, ((ksk) D()).f18817a.f46554a, iun.f15405a, z);
    }

    public final void N() {
        CyberGamesPage cyberGamesPage = ((ksk) D()).f18817a.b;
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ((uzg) this.p).e(((ksk) D()).f18817a.b.f46556a, Intrinsics.d(cyberGamesPage, real) ? 40L : ((ksk) D()).f18817a.f46554a, Intrinsics.d(((ksk) D()).f18817a.b, real) ? ((ksk) D()).f18817a.f46554a : -1L, false);
    }

    public final void O() {
        CyberGamesPage cyberGamesPage = ((ksk) D()).f18817a.b;
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ((uzg) this.p).e(((ksk) D()).f18817a.b.f46556a, Intrinsics.d(cyberGamesPage, real) ? 40L : ((ksk) D()).f18817a.f46554a, Intrinsics.d(((ksk) D()).f18817a.b, real) ? ((ksk) D()).f18817a.f46554a : -1L, true);
    }

    public final void P() {
        DisciplineDetailsParams disciplineDetailsParams = this.o;
        long j = disciplineDetailsParams.f46554a;
        kt2 kt2Var = this.x.f14765a;
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", 40L);
        if (j != -1) {
            jo20Var.put("sub_sport_id", Long.valueOf(j));
        }
        kt2Var.a("cyber_teams_all_call", jo20Var.b());
        long j2 = disciplineDetailsParams.f46554a;
        s1p s1pVar = this.y.f44833a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, 40L));
        if (j2 != -1) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        s1pVar.a(cui0.a(yni0Var), 12023L);
        final CyberActiveTeamsParams cyberActiveTeamsParams = new CyberActiveTeamsParams(((ksk) D()).f18817a.f46554a);
        uzg uzgVar = (uzg) this.p;
        uzgVar.getClass();
        i1w0 i1w0VarC = uzgVar.f36533a.c();
        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
        final vqc vqcVar = uzgVar.b;
        k0w0VarI.h(new FragmentScreen(vqcVar, cyberActiveTeamsParams) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$activeTeamsListScreen$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CyberActiveTeamsParams f46585a;

            {
                this.f46585a = cyberActiveTeamsParams;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                xm.Q1.getClass();
                xm xmVar = new xm();
                xmVar.O1.J(xmVar, xm.R1[0], this.f46585a);
                return xmVar;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                return ufx.C(this);
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        });
        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void Q() {
        itk itkVar;
        j0g0 j0g0Var = ((ksk) D()).c;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            jtk jtkVar = (jtk) obj;
            if (jtkVar == null || (itkVar = jtkVar.c) == null) {
                return;
            }
            i1g i1gVar = i1g.DISCIPLINES;
            this.y.f("calendar");
            this.x.h("calendar");
            ((uzg) this.p).b(new CyberCalendarParams(itkVar.c, itkVar.d, itkVar.b, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    public final void R(wok wokVar) {
        List listW;
        List listW2;
        boolean z = wokVar instanceof uok;
        hjd hjdVar = this.r;
        if (z) {
            j0g0 j0g0Var = ((ksk) D()).d;
            if (j0g0Var != null) {
                Object obj = j0g0Var.f15681a;
                kuk kukVar = (kuk) (obj instanceof g0g0 ? null : obj);
                if (kukVar != null) {
                    listW2 = hic.w(kukVar);
                } else {
                    listW2 = iun.f15405a;
                }
            } else {
                listW2 = iun.f15405a;
            }
            i3t0.B(this, hjdVar, new vid[]{new did(listW2), ((uok) wokVar).f36020a});
            return;
        }
        if (!(wokVar instanceof vok)) {
            t9f.b();
            return;
        }
        j0g0 j0g0Var2 = ((ksk) D()).d;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            kuk kukVar2 = (kuk) (obj2 instanceof g0g0 ? null : obj2);
            if (kukVar2 != null) {
                listW = hic.w(kukVar2);
            } else {
                listW = iun.f15405a;
            }
        } else {
            listW = iun.f15405a;
        }
        i3t0.B(this, hjdVar, new vid[]{new did(listW), ebc.n0(((vok) wokVar).f37771a)});
    }

    public final void S(boolean z) {
        i1g i1gVar = i1g.DISCIPLINES;
        this.y.f("leaderboard");
        this.x.h("leaderboard");
        long j = ((ksk) D()).f18817a.f46554a;
        ggz ggzVar = (z || this.o.f46554a != 46) ? ggz.f11273a : ggz.b;
        uzg uzgVar = (uzg) this.p;
        uzgVar.getClass();
        uzgVar.f36533a.c().d(new mz0((Object) uzgVar, j, (Object) ggzVar, (byte) 11));
    }

    public final void T() {
        i1g i1gVar = i1g.DISCIPLINES;
        this.y.f("results_match");
        this.x.h("results_match");
        boolean zD = Intrinsics.d(((ksk) D()).f18817a.b, CyberGamesPage.Real.INSTANCE);
        hzg hzgVar = this.p;
        if (zD) {
            final long j = ((ksk) D()).f18817a.f46554a;
            final byte b = ((ksk) D()).f18817a.b.f46556a;
            final uzg uzgVar = (uzg) hzgVar;
            final long j2 = 40;
            uzgVar.f36533a.c().d(new Function1(uzgVar, j2, j, b) { // from class: a.ozg

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f26099a;
                public final /* synthetic */ long b;
                public final /* synthetic */ byte c;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f26099a = j2;
                    this.b = j;
                    this.c = b;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    k0w0 k0w0Var = (k0w0) obj;
                    k0w0Var.getClass();
                    final List listC = kotlin.collections.a.c(Long.valueOf(this.f26099a));
                    listC.getClass();
                    final byte b2 = this.c;
                    final long j3 = this.b;
                    k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getChampsCyberScreen$1
                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            ChampsResultsParams champsResultsParams = new ChampsResultsParams(b2, j3, listC, true);
                            w62.Q1.getClass();
                            w62 w62Var = new w62();
                            w62Var.K1.J(w62Var, w62.R1[0], champsResultsParams);
                            return w62Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    });
                    return Unit.f46060a;
                }
            });
            return;
        }
        final long j3 = ((ksk) D()).f18817a.f46554a;
        final byte b2 = ((ksk) D()).f18817a.b.f46556a;
        final uzg uzgVar2 = (uzg) hzgVar;
        final long j4 = 0;
        uzgVar2.f36533a.c().d(new Function1(uzgVar2, j3, j4, b2) { // from class: a.ozg

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f26099a;
            public final /* synthetic */ long b;
            public final /* synthetic */ byte c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f26099a = j3;
                this.b = j4;
                this.c = b2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                final List listC = kotlin.collections.a.c(Long.valueOf(this.f26099a));
                listC.getClass();
                final int b3 = this.c;
                final long j5 = this.b;
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getChampsCyberScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        ChampsResultsParams champsResultsParams = new ChampsResultsParams(b3, j5, listC, true);
                        w62.Q1.getClass();
                        w62 w62Var = new w62();
                        w62Var.K1.J(w62Var, w62.R1[0], champsResultsParams);
                        return w62Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            }
        });
    }

    public final void U(boolean z) {
        this.y.e(org.xplatform.cyber.section.api.domain.entity.d.e(((ksk) D()).f18817a.b.f46556a));
        long j = ((ksk) D()).f18817a.f46554a;
        ((uzg) this.p).k(((ksk) D()).f18817a.b.f46556a, j, iun.f15405a, z);
    }

    public final void V() {
        i1g i1gVar = i1g.DISCIPLINES;
        this.y.f("transfers");
        this.x.h("transfers");
        long j = ((ksk) D()).f18817a.f46554a;
        uzg uzgVar = (uzg) this.p;
        uzgVar.f36533a.c().d(new pzg(uzgVar, j, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(a.npn r6, boolean r7, a.zje r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a.zsk
            if (r0 == 0) goto L13
            r0 = r8
            a.zsk r0 = (a.zsk) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.zsk r0 = new a.zsk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2c
        L26:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r6 = move-exception
            goto L4e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r8)
            if (r7 != 0) goto L43
            a.fvt0 r7 = r5.z     // Catch: java.lang.Throwable -> L2a
            r0.k = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.w(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L59
            goto L4d
        L43:
            a.nv20 r7 = r5.A     // Catch: java.lang.Throwable -> L2a
            r0.k = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.c(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L59
        L4d:
            return r1
        L4e:
            a.usk r7 = new a.usk
            r8 = 0
            r7.<init>(r5, r8)
            a.ivn r5 = r5.B
            r5.f(r6, r7)
        L59:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.atk.W(a.npn, boolean, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ipk ipkVar = (ipk) obj;
        ipkVar.getClass();
        super.x(ipkVar);
        boolean z = ipkVar instanceof ook;
        mne mneVar = this.q;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            if (!(ipkVar instanceof hpk)) {
                t9f.b();
                return;
            }
            hpk hpkVar = (hpk) ipkVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.G;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.F;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.F = sac.V(jiu0.a(this), new usk(this, b), null, mneVar.f22085a, new e9g(hpkVar, this, yjeVar, (byte) 27), 10);
                this.G = jCurrentTimeMillis;
                return;
            }
            return;
        }
        ook ookVar = (ook) ipkVar;
        if (ookVar.equals(lok.f20395a)) {
            E();
            return;
        }
        if (ookVar.equals(mok.f22138a)) {
            bby bbyVar2 = this.D;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.E;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
                return;
            }
            return;
        }
        if (!ookVar.equals(nok.f23870a)) {
            t9f.b();
            return;
        }
        bby bbyVar4 = this.D;
        if (bbyVar4 != null) {
            bbyVar4.cancel(null);
        }
        this.D = sac.V(jiu0.a(this), xsk.f41420a, null, mneVar.f22085a, new wsk(this, yjeVar, (byte) 2), 10);
        bby bbyVar5 = this.E;
        if (bbyVar5 == null || !bbyVar5.isActive()) {
            this.E = i3t0.F(this, this.r, mneVar.f22085a, null, new svj((byte) 21), 118);
        }
    }
}
