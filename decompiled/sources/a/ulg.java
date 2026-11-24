package a;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$esportsGamesScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ulg extends x2t0 implements alg {
    public static final /* synthetic */ int s = 0;
    public final hzg h;
    public final pru i;
    public final ih5 j;
    public final zr1 k;
    public final zg l;
    public final gg5 m;
    public final oeg0 n;
    public final ivn o;
    public final fvt0 p;
    public final nv20 q;
    public final ctf0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg(hzg hzgVar, pru pruVar, luu luuVar, ih5 ih5Var, zr1 zr1Var, zg zgVar, gg5 gg5Var, oeg0 oeg0Var, ivn ivnVar, fvt0 fvt0Var, nv20 nv20Var, ctf0 ctf0Var) {
        super(new rlg(luuVar, (byte) 0));
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.h = hzgVar;
        this.i = pruVar;
        this.j = ih5Var;
        this.k = zr1Var;
        this.l = zgVar;
        this.m = gg5Var;
        this.n = oeg0Var;
        this.o = ivnVar;
        this.p = fvt0Var;
        this.q = nv20Var;
        this.r = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // a.j3t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object a(qlg qlgVar, zje zjeVar) {
        slg slgVar;
        Object next;
        Object value;
        wlg wlgVar;
        Object value2;
        wlg wlgVar2;
        Object value3;
        wlg wlgVar3;
        blg blgVar;
        qlg qlgVar2 = qlgVar;
        if (zjeVar instanceof slg) {
            slgVar = (slg) zjeVar;
            int i = slgVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                slgVar.l = i - Integer.MIN_VALUE;
            } else {
                slgVar = new slg(this, zjeVar);
            }
        } else {
            slgVar = new slg(this, zjeVar);
        }
        Object obj = slgVar.j;
        wne wneVar = wne.f39444a;
        int i2 = slgVar.l;
        Object obj2 = null;
        final boolean z = true;
        if (i2 == 0) {
            z1x.P(obj);
            slgVar.i = qlgVar2;
            slgVar.l = 1;
            if (x2t0.f(this, qlgVar2, slgVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qlgVar2 = slgVar.i;
            z1x.P(obj);
        }
        boolean z2 = qlgVar2 instanceof blg;
        ocj ocjVar = this.b;
        if (z2) {
            ocjVar.getClass();
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                wlgVar3 = (wlg) value3;
                wlgVar3.getClass();
                blgVar = (blg) qlgVar2;
            } while (!p7m0Var.m(value3, wlg.a(wlgVar3, blgVar.b, null, null, blgVar.f2793a, 22)));
        } else if (qlgVar2 instanceof clg) {
            ocjVar.getClass();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                wlgVar2 = (wlg) value2;
                wlgVar2.getClass();
            } while (!p7m0Var2.m(value2, wlg.a(wlgVar2, null, null, ((clg) qlgVar2).f4557a, null, 27)));
        } else if (qlgVar2 instanceof dlg) {
            ocjVar.getClass();
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                wlgVar = (wlg) value;
                wlgVar.getClass();
            } while (!p7m0Var3.m(value, wlg.a(wlgVar, null, ((dlg) qlgVar2).f6279a, null, null, 29)));
        } else {
            boolean z3 = qlgVar2 instanceof jlg;
            hzg hzgVar = this.h;
            if (z3) {
                long j = ((jlg) qlgVar2).f16715a;
                Iterator it = ((wlg) d()).c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((xah) next).g != j);
                xah xahVar = (xah) next;
                if (xahVar != null) {
                    for (Object obj3 : ((wlg) d()).e) {
                        lok0 lok0Var = (lok0) obj3;
                        if (lok0Var.f20396a == xahVar.h && lok0Var.t.contains(1)) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    lok0 lok0Var2 = (lok0) obj2;
                    if (this.i.a().c.p.contains(Long.valueOf(xahVar.g))) {
                        ((uzg) hzgVar).g();
                    } else if (lok0Var2 != null) {
                        long j2 = lok0Var2.f20396a;
                        long j3 = lok0Var2.f;
                        long j4 = lok0Var2.g;
                        boolean z4 = xahVar.n;
                        this.j.k(j2, r1g.POPULAR_TOP, j3, j4, z4);
                        this.k.l(j2, j3, j4, "popular_top", z4);
                        ((uzg) hzgVar).o(j2, lok0Var2.b);
                    } else {
                        long j5 = xahVar.g;
                        long j6 = xahVar.i;
                        long j7 = xahVar.k;
                        boolean z5 = xahVar.n;
                        this.j.k(j5, r1g.POPULAR_TOP, j6, j7, z5);
                        this.k.l(j5, j6, j7, "popular_top", z5);
                        long j8 = xahVar.k;
                        long j9 = xahVar.g;
                        String str = xahVar.f;
                        byte b = CyberGamesPage.Real.INSTANCE.f46556a;
                        k1g k1gVar = k1g.OPEN_REGULAR;
                        ((uzg) hzgVar).f(str, j8, j9, b);
                    }
                }
            } else if (qlgVar2 instanceof llg) {
                long j10 = ((llg) qlgVar2).f20246a;
                for (Object obj4 : ((wlg) d()).c) {
                    if (((xah) obj4).g == j10) {
                        obj2 = obj4;
                        break;
                    }
                }
                xah xahVar2 = (xah) obj2;
                if (xahVar2 != null) {
                    this.j.b(xahVar2.i, xahVar2.k, xahVar2.g, r1g.POPULAR_NEW_TOP, xahVar2.n, xahVar2.m);
                    this.k.d(xahVar2.i, xahVar2.k, xahVar2.g, "popular_new_top", xahVar2.n, xahVar2.m);
                    this.n.c().d(new v4f(this, xahVar2, (byte) 21));
                }
            } else if (qlgVar2 instanceof klg) {
                long j11 = ((klg) qlgVar2).f18485a;
                for (Object obj5 : ((wlg) d()).c) {
                    if (((xah) obj5).g == j11) {
                        obj2 = obj5;
                        break;
                    }
                }
                xah xahVar3 = (xah) obj2;
                if (xahVar3 != null) {
                    long j12 = xahVar3.i;
                    long j13 = xahVar3.k;
                    r1g r1gVar = r1g.POPULAR_NEW_TOP;
                    long j14 = xahVar3.g;
                    Long lValueOf = Long.valueOf(j14);
                    boolean z6 = xahVar3.n;
                    this.j.l(j12, j13, r1gVar, lValueOf, Boolean.valueOf(z6));
                    this.k.m(xahVar3.i, xahVar3.k, "popular_new_top", Long.valueOf(j14), Boolean.valueOf(z6));
                    ((uzg) hzgVar).c(xahVar3.k, CyberGamesPage.Real.INSTANCE, k1g.OPEN_REGULAR);
                }
            } else if (qlgVar2 instanceof mlg) {
                int i3 = ((mlg) qlgVar2).f21988a;
                for (Object obj6 : ((wlg) d()).b) {
                    if (((ypl0) obj6).f43037a == i3) {
                        obj2 = obj6;
                        break;
                    }
                }
                ypl0 ypl0Var = (ypl0) obj2;
                if (ypl0Var != null) {
                    long j15 = ypl0Var.f43037a;
                    CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
                    Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(j15, real);
                    long jLongValue = ((Number) pairC.f46059a).longValue();
                    long jLongValue2 = ((Number) pairC.b).longValue();
                    this.j.l(jLongValue, jLongValue2, r1g.POPULAR_NEW_TOP, null, null);
                    this.k.m(jLongValue, jLongValue2, "popular_new_top", null, null);
                    ((uzg) hzgVar).c(j15, real, k1g.OPEN_REGULAR);
                }
            } else {
                boolean zD = Intrinsics.d(qlgVar2, ilg.f14977a);
                gg5 gg5Var = this.m;
                zg zgVar = this.l;
                if (zD) {
                    i8i.D("option", "cybersport_popular_live", zgVar.f44322a, "popular_top_all_click");
                    gg5Var.t(y1p.CYBERSPORT_POPULAR_LIVE);
                    final byte b2 = CyberGamesPage.Real.INSTANCE.f46556a;
                    final uzg uzgVar = (uzg) hzgVar;
                    uzgVar.f36533a.c().d(new Function1() { // from class: a.izg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            k0w0 k0w0Var = (k0w0) obj7;
                            k0w0Var.getClass();
                            k0w0Var.h(new CyberGamesScreenFactoryImpl$esportsGamesScreen$1(uzgVar.b, new EsportsGamesScreenParams.BestGames(b2, z)));
                            return Unit.f46060a;
                        }
                    });
                } else {
                    final boolean z7 = false;
                    if (Intrinsics.d(qlgVar2, glg.f11489a)) {
                        i8i.D("option", "cybersport_popular_line", zgVar.f44322a, "popular_top_all_click");
                        gg5Var.t(y1p.CYBERSPORT_POPULAR_LINE);
                        final byte b3 = CyberGamesPage.Real.INSTANCE.f46556a;
                        final uzg uzgVar2 = (uzg) hzgVar;
                        uzgVar2.f36533a.c().d(new Function1() { // from class: a.izg
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                k0w0 k0w0Var = (k0w0) obj7;
                                k0w0Var.getClass();
                                k0w0Var.h(new CyberGamesScreenFactoryImpl$esportsGamesScreen$1(uzgVar2.b, new EsportsGamesScreenParams.BestGames(b3, z7)));
                                return Unit.f46060a;
                            }
                        });
                    } else if (Intrinsics.d(qlgVar2, hlg.f13259a)) {
                        i8i.D("option", "cybersport_tournaments_live", zgVar.f44322a, "popular_top_all_click");
                        gg5Var.t(y1p.CYBERSPORT_TOURNAMENTS_LIVE);
                        ((uzg) hzgVar).k(CyberGamesPage.Real.INSTANCE.f46556a, 40L, iun.f15405a, true);
                    } else if (Intrinsics.d(qlgVar2, flg.f9735a)) {
                        i8i.D("option", "cybersport_tournaments_line", zgVar.f44322a, "popular_top_all_click");
                        gg5Var.t(y1p.CYBERSPORT_TOURNAMENTS_LINE);
                        ((uzg) hzgVar).k(CyberGamesPage.Real.INSTANCE.f46556a, 40L, iun.f15405a, false);
                    } else if (Intrinsics.d(qlgVar2, elg.f7995a)) {
                        i8i.D("option", "cybersport_disciplines", zgVar.f44322a, "popular_top_all_click");
                        gg5Var.t(y1p.CYBERSPORT_DISCIPLINES);
                        CyberGamesPage.Real real2 = CyberGamesPage.Real.INSTANCE;
                        uzg uzgVar3 = (uzg) hzgVar;
                        uzgVar3.getClass();
                        real2.getClass();
                        uzgVar3.f36533a.c().d(new v4f(uzgVar3, real2, (byte) 24));
                    } else if (qlgVar2 instanceof nlg) {
                        ((uzg) hzgVar).d(CyberGamesPage.Real.INSTANCE.f46556a, kotlin.collections.a.c(Long.valueOf(((nlg) qlgVar2).f23725a)), false);
                    } else {
                        if (!(qlgVar2 instanceof olg)) {
                            t9f.b();
                            return null;
                        }
                        ((uzg) hzgVar).d(CyberGamesPage.Real.INSTANCE.f46556a, kotlin.collections.a.c(Long.valueOf(((olg) qlgVar2).f25453a)), true);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r12 == r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.xah r12, a.zje r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a.tlg
            if (r0 == 0) goto L14
            r0 = r13
            a.tlg r0 = (a.tlg) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.tlg r0 = new a.tlg
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.i
            a.wne r0 = a.wne.f39444a
            int r1 = r6.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L28
            if (r1 != r2) goto L30
        L28:
            a.z1x.P(r13)     // Catch: java.lang.Throwable -> L2d
            goto L9a
        L2d:
            r0 = move-exception
            r12 = r0
            goto L8f
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L37:
            a.z1x.P(r13)
            long r4 = r12.g     // Catch: java.lang.Throwable -> L2d
            r13 = r2
            r1 = r3
            long r2 = r12.i     // Catch: java.lang.Throwable -> L2d
            long r7 = r12.k     // Catch: java.lang.Throwable -> L2d
            java.lang.Long r9 = new java.lang.Long     // Catch: java.lang.Throwable -> L2d
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L2d
            r7 = r4
            boolean r4 = r12.n     // Catch: java.lang.Throwable -> L2d
            boolean r12 = r12.m     // Catch: java.lang.Throwable -> L2d
            if (r12 == 0) goto L6e
            a.nv20 r12 = r11.q     // Catch: java.lang.Throwable -> L2d
            r6.k = r1     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            a.qgb r13 = new a.qgb     // Catch: java.lang.Throwable -> L2d
            long r1 = r9.longValue()     // Catch: java.lang.Throwable -> L2d
            r13.<init>(r7, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r12.f24171a     // Catch: java.lang.Throwable -> L2d
            a.khf0 r12 = (a.khf0) r12     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r12.D(r13, r6)     // Catch: java.lang.Throwable -> L2d
            if (r12 != r0) goto L69
            goto L6b
        L69:
            kotlin.Unit r12 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L2d
        L6b:
            if (r12 != r0) goto L9a
            goto L8e
        L6e:
            a.fvt0 r12 = r11.p     // Catch: java.lang.Throwable -> L2d
            r6.k = r13     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            a.qgb r5 = new a.qgb     // Catch: java.lang.Throwable -> L2d
            long r9 = r9.longValue()     // Catch: java.lang.Throwable -> L2d
            r5.<init>(r7, r9)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r12.f10231a     // Catch: java.lang.Throwable -> L2d
            r1 = r12
            a.nr r1 = (a.nr) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r1.u(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            if (r12 != r0) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r12 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L2d
        L8c:
            if (r12 != r0) goto L9a
        L8e:
            return r0
        L8f:
            a.hfg r13 = new a.hfg
            r0 = 7
            r13.<init>(r11, r0)
            a.ivn r11 = r11.o
            r11.f(r12, r13)
        L9a:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ulg.j(a.xah, a.zje):java.lang.Object");
    }
}
