package a;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f43825a;

    static {
        zcl zclVar = qmk.f28987a;
        f43825a = xp20.f(new Pair(6, new ycl(400.0f)), new Pair(7, new ycl(468.0f)), new Pair(8, new ycl(536.0f)), new Pair(9, new ycl(560.0f)));
    }

    public static final void a(int i, long j, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1037196297);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.f(j) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = twn.j(w6kVar.r0(i), fetVar);
            }
            mm40 mm40VarS = o7k0.s(o7k0.c(jm40.b, 1.0f), ((ycl) objP).f42389a);
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new cjl(function0, (byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarP = ffb0.P(mm40VarS, (Function1) objP2);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(s5x0.L(mm40VarP, 0.0f, 8.0f, 1), j, vgg0.a(360.0f)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tam(i, j, function0, i2);
        }
    }

    public static final void b(boolean z, s4i s4iVar, qao0 qao0Var, fet fetVar, int i) {
        int i2;
        s4i s4iVar2 = s4iVar;
        qao0 qao0Var2 = qao0Var;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar2.g0(181264780);
        if ((i & 6) == 0) {
            i2 = (fetVar2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(s4iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(qao0Var2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            String str = "DS_TAB_TAG" + s4iVar2.f31606a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, str);
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new z((byte) 27, z);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.e0(1285479042);
                mm40 mm40VarY = o7k0.y(mm40VarA, null, 3);
                thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), shdVar2);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                long j = qao0Var2.c;
                int i3 = i2;
                long j2 = qao0Var2.e;
                zcl zclVar = qmk.f28987a;
                c(o7k0.p(jm40Var, 48.0f, 28.0f), s4iVar, j, j2, qao0Var2, fetVar2, (i3 & 112) | ((i3 << 6) & 57344), 0);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                String str2 = s4iVar.f31606a;
                n05 n05Var = new n05(qmk.p, qmk.q, qmk.n);
                long j3 = qao0Var2.f28407a;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str2, mm40VarN, j3, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
                s4iVar2 = s4iVar;
                qao0Var2 = qao0Var;
            } else {
                int i4 = i2;
                fetVar2.e0(1286505080);
                mm40 mm40VarE = mm40VarA.e(o7k0.c);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                qao0Var2 = qao0Var;
                int i5 = (i4 & 112) | ((i4 << 6) & 57344);
                s4iVar2 = s4iVar;
                c(null, s4iVar2, qao0Var2.d, qao0Var2.g, qao0Var2, fetVar2, i5, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(z, s4iVar2, qao0Var2, i);
        }
    }

    public static final void c(mm40 mm40Var, s4i s4iVar, long j, long j2, qao0 qao0Var, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        s4i s4iVar2;
        qao0 qao0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-942546835);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(s4iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar2.g(qao0Var) ? 16384 : 8192;
        }
        int i5 = i3;
        if (fetVar2.U(i5 & 1, (i5 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            if (s4iVar.b == 0) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new v5n(mm40Var2, s4iVar, j, j2, qao0Var, i, i2, (byte) 0);
                    return;
                }
                return;
            }
            mm40 mm40Var3 = mm40Var2;
            s4iVar2 = s4iVar;
            qao0Var2 = qao0Var;
            mm40 mm40VarY = o7k0.y(mm40Var3, null, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(s4iVar2.b, 0, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 24.0f), "TAB_ICON_TAG"), j, fetVar2, 56 | ((i5 << 3) & 7168), 0);
            fetVar2 = fetVar;
            m(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.i), 8.0f, 4.0f), s4iVar2.c, j2, qao0Var2.h, fetVar2, (i5 >> 3) & 896);
            fetVar2.r(true);
            mm40Var2 = mm40Var3;
        } else {
            s4iVar2 = s4iVar;
            qao0Var2 = qao0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new v5n(mm40Var2, s4iVar2, j, j2, qao0Var2, i, i2, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, s4i s4iVar, boolean z, qao0 qao0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(630224705);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s4iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(qao0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            mm40 mm40VarW = y860.W(mm40VarC, (gy40) objP, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(z, s4iVar, qao0Var, fetVar, ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) s4iVar, z, (Object) qao0Var, (Object) function0, i, (byte) 17);
        }
    }

    public static final void e(s4i s4iVar, boolean z, boolean z2, qao0 qao0Var, boolean z3, fet fetVar, int i) {
        int i2;
        float f;
        shd shdVar;
        boolean z4;
        jm40 jm40Var;
        boolean z5;
        fet fetVar2 = fetVar;
        fetVar2.g0(1271774150);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(s4iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(qao0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z3) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z3) {
                f = Float.NaN;
            } else {
                zcl zclVar = qmk.f28987a;
                f = 60.0f;
            }
            int i3 = z3 ? 1 : 2;
            zcl zclVar2 = qmk.f28987a;
            char c = z3 ? (char) 0 : (char) 0;
            float f2 = (!z3 || z2) ? 24.0f : 14.0f;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.w(z3 ? o7k0.d(jm40Var2, 1.0f) : o7k0.s(jm40Var2, f), null, false, 3), 0.0f, 2.0f, 0.0f, 8.0f, 5);
            String str = s4iVar.f31606a;
            int i4 = s4iVar.b;
            mm40 mm40VarE0 = o2e.e0(mm40VarN, "DS_TAB_TAG" + str);
            boolean z6 = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z6 || objP == ukd.f35823a) {
                objP = new z((byte) 26, z);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            if (z2 || i4 == 0) {
                shdVar = shdVar3;
                z4 = true;
                jm40Var = jm40Var2;
                z5 = false;
                fetVar2.e0(989029926);
                fetVar2.r(false);
            } else {
                fetVar2.e0(988013188);
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 8.0f, 4.0f, 8.0f, 0.0f, 8);
                jm40Var = jm40Var2;
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar2);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar5);
                mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 24.0f), "TAB_ICON_TAG");
                shdVar = shdVar3;
                dww.c(a8k0.F(i4, 0, fetVar2), null, mm40VarE1, z ? qao0Var.c : qao0Var.d, fetVar2, 56, 0);
                fetVar2 = fetVar;
                m(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.i), 8.0f, 4.0f), s4iVar.c, qao0Var.g, qao0Var.h, fetVar2, 0);
                z4 = true;
                fetVar2.r(true);
                z5 = false;
                fetVar2.r(false);
            }
            jm40 jm40Var3 = jm40Var;
            mm40 mm40VarE = o7k0.e(s5x0.L(s5x0.N(jm40Var3, 0.0f, 6.0f, 0.0f, 0.0f, 13), c, 0.0f, 2), f2);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar2);
            jpm0.o(fetVar2, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar2, shdVar4, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC2, shdVar5, 1.0f, z5);
            boolean z8 = z5;
            String str2 = s4iVar.f31606a;
            long j = z ? qao0Var.f28407a : qao0Var.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, x7zVarI, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, i3, 0, null, g1t0.e(), fetVar, 0, 384, 109560);
            fetVar2 = fetVar;
            if (z2) {
                fetVar2.e0(-1258095067);
                m(s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14), s4iVar.c, qao0Var.g, qao0Var.h, fetVar2, 0);
                fetVar2.r(z8);
            } else {
                fetVar2.e0(-1257821182);
                fetVar2.r(z8);
            }
            fetVar2.r(z4);
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5n(s4iVar, z, z2, qao0Var, z3, i);
        }
    }

    public static final void f(int i, int i2, int i3, long j, fet fetVar, mm40 mm40Var) {
        int i4;
        mm40 mm40Var2;
        fet fetVar2;
        fetVar.g0(-1961470834);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.e(i2) ? 2048 : 1024;
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zG = fetVar.g(w6kVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = Integer.valueOf(si30.b(w6kVar.w0(12.0f)));
                fetVar.o0(objP2);
            }
            int iIntValue = ((Number) objP2).intValue();
            l7m0 l7m0VarB = d43.b(i, ro4.m0(300, 0, ihn.f14788a, 2), null, null, fetVar, 0, 28);
            fetVar2 = fetVar;
            int i5 = i4 & 7168;
            boolean zE = fetVar2.e(cgk0Var.l()) | (i5 == 2048) | fetVar2.e(iIntValue);
            Object objP3 = fetVar2.P();
            if (zE || objP3 == cl5Var) {
                objP3 = Integer.valueOf(Math.max(0, (cgk0Var.l() > 0 ? cgk0Var.l() / i2 : 0) - iIntValue));
                fetVar2.o0(objP3);
            }
            int iIntValue2 = ((Number) objP3).intValue();
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new nw6(cgk0Var, (byte) 14);
                fetVar2.o0(objP4);
            }
            mm40Var2 = mm40Var;
            mm40 mm40VarY = fre0.Y(mm40Var2, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (iIntValue2 > 0) {
                fetVar2.e0(-539781485);
                boolean zG2 = (i5 == 2048) | fetVar2.g(l7m0VarB) | fetVar2.e(iIntValue2);
                Object objP5 = fetVar2.P();
                if (zG2 || objP5 == cl5Var) {
                    xc6 xc6Var = new xc6((byte) 2, i2, iIntValue2, cgk0Var, l7m0VarB);
                    fetVar2.o0(xc6Var);
                    objP5 = xc6Var;
                }
                mm40 mm40VarS = o7k0.s(ffb0.P(jm40.b, (Function1) objP5), w6kVar.r0(iIntValue2));
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar2, i120.Q(s5x0.N(o7k0.e(mm40VarS, 4.0f), 0.0f, 1.0f, 0.0f, 0.0f, 13), j, vgg0.b(360.0f, 360.0f, 0.0f, 0.0f)));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-538913702);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5n(mm40Var2, j, i, i2, i3);
        }
    }

    public static final void g(final int i, long j, fet fetVar, mm40 mm40Var) {
        int i2;
        final long j2;
        fet fetVar2;
        final mm40 mm40Var2;
        fetVar.g0(217667928);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            j2 = j;
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            jcb.v(mm40Var2, 1.0f, j2, fetVar2, (i3 & 14) | ((i3 << 3) & 896), 0);
        } else {
            j2 = j;
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.t5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z5n.g(x8x.L(i | 1), j2, (fet) obj, mm40Var2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:104:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x0190  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:129:0x0237  */
    /* JADX WARN: Code duplicated, block: B:131:0x024d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0263  */
    /* JADX WARN: Code duplicated, block: B:135:0x0267  */
    /* JADX WARN: Code duplicated, block: B:137:0x0273  */
    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:142:0x029b  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02db  */
    /* JADX WARN: Code duplicated, block: B:152:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:154:0x0303  */
    /* JADX WARN: Code duplicated, block: B:157:0x0334  */
    /* JADX WARN: Code duplicated, block: B:159:0x034a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0373 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0375 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0377  */
    /* JADX WARN: Code duplicated, block: B:166:0x037d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0385  */
    /* JADX WARN: Code duplicated, block: B:170:0x038d  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:176:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:180:0x040b  */
    /* JADX WARN: Code duplicated, block: B:183:0x042c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0435  */
    /* JADX WARN: Code duplicated, block: B:188:0x0444  */
    /* JADX WARN: Code duplicated, block: B:189:0x0456 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x013f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0146  */
    public static final void h(final int i, final a4x a4xVar, final aoo0 aoo0Var, r4i r4iVar, ulb ulbVar, boolean z, final Function1 function1, fet fetVar, final int i2, final int i3) {
        int i4;
        r4i r4iVar2;
        int i5;
        boolean zI;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Function1 function2;
        boolean z3;
        aoo0 aoo0Var2;
        int i9;
        final ulb ulbVar2;
        final r4i r4iVar3;
        final boolean z4;
        yfe0 yfe0VarU;
        Function2 function3;
        final r4i r4iVar4;
        ulb ulbVar3;
        ulb ulbVar4;
        final ulb ulbVar5;
        final boolean z5;
        int size;
        r4i r4iVar5;
        boolean z6;
        float fB;
        ycl yclVar;
        boolean z7;
        qao0 qao0Var;
        y3d y3dVar;
        long primary;
        y3d y3dVar2;
        long jM130getWhite600d7_KjU;
        y3d y3dVar3;
        long primary2;
        y3d y3dVar4;
        long jM130getWhite600d7_KjU2;
        zfn zfnVar;
        y3d y3dVar5;
        long jM70getBlack200d7_KjU;
        int iD;
        int iOrdinal;
        int i10;
        qao0 qao0Var2;
        boolean z8;
        boolean z9;
        fet fetVar2;
        y3d y3dVar6;
        long primary3;
        y3d y3dVar7;
        long secondary;
        y3d y3dVar8;
        long primary4;
        y3d y3dVar9;
        long secondary2;
        zfn zfnVar2;
        y3d y3dVar10;
        long backgroundContent;
        int i11;
        a4xVar.getClass();
        aoo0Var.getClass();
        function1.getClass();
        fetVar.g0(2090930002);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.e(aoo0Var.ordinal()) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 == 0) {
            if ((i2 & 3072) == 0) {
                r4iVar2 = r4iVar;
                i4 |= fetVar.g(r4iVar2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if ((32768 & i2) == 0) {
                    zI = fetVar.g(ulbVar);
                } else {
                    zI = fetVar.i(ulbVar);
                }
                if (zI) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    z2 = z;
                    if (fetVar.h(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((1572864 & i2) == 0) {
                    function2 = function1;
                    if (fetVar.i(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    function2 = function1;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i4 & 1, z3)) {
                    if (i12 != 0) {
                        r4iVar4 = new r4i(null, null, null, null, null, 63);
                    } else {
                        r4iVar4 = r4iVar2;
                    }
                    ulbVar3 = b6n.f2063a;
                    if (i5 != 0) {
                        ulbVar4 = ulbVar3;
                    } else {
                        ulbVar3 = ulbVar;
                        ulbVar4 = ulbVar3;
                    }
                    ulbVar5 = ulbVar3;
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    size = a4xVar.size();
                    if (size < 2) {
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            return;
                        }
                        final byte b = 0;
                        final Function1 function4 = function2;
                        function3 = new Function2() { // from class: a.p5n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function4, (fet) obj, x8x.L(i2 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function4, (fet) obj, x8x.L(i2 | 1), i3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                    } else {
                        i9 = i;
                        r4iVar5 = r4iVar4;
                        z6 = z5;
                        fetVar.e0(-1065207822);
                        fB = bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a());
                        if (size > 5) {
                            if (size < 10) {
                                yclVar = (ycl) f43825a.get(Integer.valueOf(size));
                                if (yclVar != null) {
                                    if (ycl.a(fB, yclVar.f42389a) < 0) {
                                        z7 = false;
                                    }
                                    fetVar.r(false);
                                } else {
                                    fetVar.r(false);
                                    z7 = true;
                                }
                            }
                            z7 = true;
                            fetVar.r(false);
                        } else {
                            z7 = false;
                            fetVar.r(false);
                        }
                        if (Intrinsics.d(ulbVar5, ulbVar4)) {
                            fetVar.e0(-483816410);
                            y3dVar6 = r4iVar5.f29836a;
                            if (y3dVar6 == null) {
                                fetVar.e0(-483814214);
                                primary3 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483815392);
                                fetVar.r(false);
                                primary3 = y3dVar6.f41946a;
                            }
                            long j = primary3;
                            y3dVar7 = r4iVar5.d;
                            if (y3dVar7 == null) {
                                fetVar.e0(-483811748);
                                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483812988);
                                fetVar.r(false);
                                secondary = y3dVar7.f41946a;
                            }
                            long j2 = secondary;
                            y3dVar8 = r4iVar5.b;
                            if (y3dVar8 == null) {
                                fetVar.e0(-483809414);
                                primary4 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483810561);
                                fetVar.r(false);
                                primary4 = y3dVar8.f41946a;
                            }
                            long j3 = primary4;
                            y3dVar9 = r4iVar5.c;
                            if (y3dVar9 == null) {
                                fetVar.e0(-483807012);
                                secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483808221);
                                fetVar.r(false);
                                secondary2 = y3dVar9.f41946a;
                            }
                            long j4 = secondary2;
                            fetVar.e0(-483804291);
                            zfnVar2 = zaq0.b;
                            long background = ((ThemeColors) fetVar.k(zfnVar2)).getBackground();
                            fetVar.r(false);
                            long separator60 = ((ThemeColors) fetVar.k(zfnVar2)).getSeparator60();
                            y3dVar10 = r4iVar5.e;
                            if (y3dVar10 == null) {
                                fetVar.e0(-483799900);
                                backgroundContent = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483801016);
                                fetVar.r(false);
                                backgroundContent = y3dVar10.f41946a;
                            }
                            qao0Var = new qao0(j, j2, j3, j4, background, separator60, backgroundContent, null);
                            fetVar.r(false);
                        } else {
                            if (ulbVar5 instanceof a6n) {
                                throw b1j.f(-483817120, fetVar, false);
                            }
                            fetVar.e0(-483796263);
                            y3dVar = r4iVar5.f29836a;
                            if (y3dVar == null) {
                                fetVar.e0(-483794086);
                                primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483795264);
                                fetVar.r(false);
                                primary = y3dVar.f41946a;
                            }
                            long j5 = primary;
                            y3dVar2 = r4iVar5.d;
                            if (y3dVar2 == null) {
                                fetVar.e0(-483791430);
                                jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483792856);
                                fetVar.r(false);
                                jM130getWhite600d7_KjU = y3dVar2.f41946a;
                            }
                            long j6 = jM130getWhite600d7_KjU;
                            y3dVar3 = r4iVar5.b;
                            if (y3dVar3 == null) {
                                fetVar.e0(-483789158);
                                primary2 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483790305);
                                fetVar.r(false);
                                primary2 = y3dVar3.f41946a;
                            }
                            long j7 = primary2;
                            y3dVar4 = r4iVar5.c;
                            if (y3dVar4 == null) {
                                fetVar.e0(-483786566);
                                jM130getWhite600d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483787961);
                                fetVar.r(false);
                                jM130getWhite600d7_KjU2 = y3dVar4.f41946a;
                            }
                            long j8 = jM130getWhite600d7_KjU2;
                            fetVar.e0(-483783908);
                            long primary20 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary20();
                            fetVar.r(false);
                            zfnVar = m8m0.f21378a;
                            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
                            y3dVar5 = r4iVar5.e;
                            if (y3dVar5 == null) {
                                fetVar.e0(-483779302);
                                jM70getBlack200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m70getBlack200d7_KjU();
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-483780604);
                                fetVar.r(false);
                                jM70getBlack200d7_KjU = y3dVar5.f41946a;
                            }
                            qao0Var = new qao0(j5, j6, j7, j8, primary20, jM125getWhite100d7_KjU, jM70getBlack200d7_KjU, npe.f23909a);
                            fetVar.r(false);
                        }
                        iD = l1e0.d(i9, 0, a4xVar.size() - 1);
                        iOrdinal = aoo0Var.ordinal();
                        if (iOrdinal == 0) {
                            i10 = i4;
                            qao0Var2 = qao0Var;
                            fetVar.e0(985623942);
                            aoo0Var2 = aoo0Var;
                            z8 = z7;
                            if (aoo0Var2 == aoo0.d) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z8) {
                                fetVar.e0(985713749);
                                int i13 = (i10 << 6) & 7168;
                                int i14 = i10 >> 3;
                                l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i14) | i13 | (i14 & 458752));
                                fetVar.r(false);
                            } else {
                                fetVar.e0(986063770);
                                int i15 = (i10 << 6) & 7168;
                                int i16 = i10 >> 3;
                                j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i16) | i15 | (i16 & 458752));
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw b1j.f(-660944770, fetVar, false);
                            }
                            i10 = i4;
                            qao0Var2 = qao0Var;
                            fetVar.e0(985623942);
                            aoo0Var2 = aoo0Var;
                            z8 = z7;
                            if (aoo0Var2 == aoo0.d) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z8) {
                                fetVar.e0(985713749);
                                int i17 = (i10 << 6) & 7168;
                                int i18 = i10 >> 3;
                                l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i18) | i17 | (i18 & 458752));
                                fetVar.r(false);
                            } else {
                                fetVar.e0(986063770);
                                int i19 = (i10 << 6) & 7168;
                                int i110 = i10 >> 3;
                                j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i110) | i19 | (i110 & 458752));
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        } else {
                            fetVar.e0(986468103);
                            if (z7) {
                                fetVar.e0(986489121);
                                int i20 = (i4 >> 3) & 14;
                                int i21 = i4 >> 6;
                                k(a4xVar, iD, qao0Var, z6, function1, fetVar, i20 | (i21 & 7168) | (i21 & 57344));
                                z6 = z6;
                                fetVar2 = fetVar;
                                fetVar2.r(false);
                            } else {
                                int i22 = i4;
                                fetVar.e0(986795494);
                                int i23 = (i22 >> 3) & 14;
                                int i24 = i22 >> 6;
                                i(a4xVar, iD, qao0Var, z6, function1, fetVar, (i24 & 57344) | i23 | (i24 & 7168));
                                z6 = z6;
                                fetVar2 = fetVar;
                                fetVar2.r(false);
                            }
                            fetVar2.r(false);
                            aoo0Var2 = aoo0Var;
                        }
                        z4 = z6;
                        r4iVar3 = r4iVar5;
                        ulbVar2 = ulbVar5;
                    }
                    yfe0VarU.d = function3;
                }
                aoo0Var2 = aoo0Var;
                i9 = i;
                fetVar.X();
                ulbVar2 = ulbVar;
                r4iVar3 = r4iVar2;
                z4 = z2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b2 = 1;
                    final int i25 = i9;
                    final aoo0 aoo0Var3 = aoo0Var2;
                    function3 = new Function2() { // from class: a.p5n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b2) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i25, a4xVar, aoo0Var3, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i25, a4xVar, aoo0Var3, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    yfe0VarU.d = function3;
                }
            }
            i4 |= 196608;
            z2 = z;
            if ((1572864 & i2) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                function2 = function1;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i12 != 0) {
                    r4iVar4 = new r4i(null, null, null, null, null, 63);
                } else {
                    r4iVar4 = r4iVar2;
                }
                ulbVar3 = b6n.f2063a;
                if (i5 != 0) {
                    ulbVar4 = ulbVar3;
                } else {
                    ulbVar3 = ulbVar;
                    ulbVar4 = ulbVar3;
                }
                ulbVar5 = ulbVar3;
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                size = a4xVar.size();
                if (size < 2) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        return;
                    }
                    final byte b3 = 0;
                    final Function1 function5 = function2;
                    function3 = new Function2() { // from class: a.p5n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function5, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function5, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                } else {
                    i9 = i;
                    r4iVar5 = r4iVar4;
                    z6 = z5;
                    fetVar.e0(-1065207822);
                    fB = bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a());
                    if (size > 5) {
                        if (size < 10) {
                            yclVar = (ycl) f43825a.get(Integer.valueOf(size));
                            if (yclVar != null) {
                                if (ycl.a(fB, yclVar.f42389a) < 0) {
                                    z7 = false;
                                }
                                fetVar.r(false);
                            } else {
                                fetVar.r(false);
                                z7 = true;
                            }
                        }
                        z7 = true;
                        fetVar.r(false);
                    } else {
                        z7 = false;
                        fetVar.r(false);
                    }
                    if (Intrinsics.d(ulbVar5, ulbVar4)) {
                        fetVar.e0(-483816410);
                        y3dVar6 = r4iVar5.f29836a;
                        if (y3dVar6 == null) {
                            fetVar.e0(-483814214);
                            primary3 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483815392);
                            fetVar.r(false);
                            primary3 = y3dVar6.f41946a;
                        }
                        long j9 = primary3;
                        y3dVar7 = r4iVar5.d;
                        if (y3dVar7 == null) {
                            fetVar.e0(-483811748);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483812988);
                            fetVar.r(false);
                            secondary = y3dVar7.f41946a;
                        }
                        long j10 = secondary;
                        y3dVar8 = r4iVar5.b;
                        if (y3dVar8 == null) {
                            fetVar.e0(-483809414);
                            primary4 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483810561);
                            fetVar.r(false);
                            primary4 = y3dVar8.f41946a;
                        }
                        long j11 = primary4;
                        y3dVar9 = r4iVar5.c;
                        if (y3dVar9 == null) {
                            fetVar.e0(-483807012);
                            secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483808221);
                            fetVar.r(false);
                            secondary2 = y3dVar9.f41946a;
                        }
                        long j12 = secondary2;
                        fetVar.e0(-483804291);
                        zfnVar2 = zaq0.b;
                        long background2 = ((ThemeColors) fetVar.k(zfnVar2)).getBackground();
                        fetVar.r(false);
                        long separator61 = ((ThemeColors) fetVar.k(zfnVar2)).getSeparator60();
                        y3dVar10 = r4iVar5.e;
                        if (y3dVar10 == null) {
                            fetVar.e0(-483799900);
                            backgroundContent = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483801016);
                            fetVar.r(false);
                            backgroundContent = y3dVar10.f41946a;
                        }
                        qao0Var = new qao0(j9, j10, j11, j12, background2, separator61, backgroundContent, null);
                        fetVar.r(false);
                    } else {
                        if (ulbVar5 instanceof a6n) {
                            throw b1j.f(-483817120, fetVar, false);
                        }
                        fetVar.e0(-483796263);
                        y3dVar = r4iVar5.f29836a;
                        if (y3dVar == null) {
                            fetVar.e0(-483794086);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483795264);
                            fetVar.r(false);
                            primary = y3dVar.f41946a;
                        }
                        long j13 = primary;
                        y3dVar2 = r4iVar5.d;
                        if (y3dVar2 == null) {
                            fetVar.e0(-483791430);
                            jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483792856);
                            fetVar.r(false);
                            jM130getWhite600d7_KjU = y3dVar2.f41946a;
                        }
                        long j14 = jM130getWhite600d7_KjU;
                        y3dVar3 = r4iVar5.b;
                        if (y3dVar3 == null) {
                            fetVar.e0(-483789158);
                            primary2 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483790305);
                            fetVar.r(false);
                            primary2 = y3dVar3.f41946a;
                        }
                        long j15 = primary2;
                        y3dVar4 = r4iVar5.c;
                        if (y3dVar4 == null) {
                            fetVar.e0(-483786566);
                            jM130getWhite600d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483787961);
                            fetVar.r(false);
                            jM130getWhite600d7_KjU2 = y3dVar4.f41946a;
                        }
                        long j16 = jM130getWhite600d7_KjU2;
                        fetVar.e0(-483783908);
                        long primary21 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary20();
                        fetVar.r(false);
                        zfnVar = m8m0.f21378a;
                        long jM125getWhite100d7_KjU2 = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
                        y3dVar5 = r4iVar5.e;
                        if (y3dVar5 == null) {
                            fetVar.e0(-483779302);
                            jM70getBlack200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m70getBlack200d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483780604);
                            fetVar.r(false);
                            jM70getBlack200d7_KjU = y3dVar5.f41946a;
                        }
                        qao0Var = new qao0(j13, j14, j15, j16, primary21, jM125getWhite100d7_KjU2, jM70getBlack200d7_KjU, npe.f23909a);
                        fetVar.r(false);
                    }
                    iD = l1e0.d(i9, 0, a4xVar.size() - 1);
                    iOrdinal = aoo0Var.ordinal();
                    if (iOrdinal == 0) {
                        i10 = i4;
                        qao0Var2 = qao0Var;
                        fetVar.e0(985623942);
                        aoo0Var2 = aoo0Var;
                        z8 = z7;
                        if (aoo0Var2 == aoo0.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8) {
                            fetVar.e0(985713749);
                            int i111 = (i10 << 6) & 7168;
                            int i112 = i10 >> 3;
                            l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i112) | i111 | (i112 & 458752));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(986063770);
                            int i113 = (i10 << 6) & 7168;
                            int i114 = i10 >> 3;
                            j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i114) | i113 | (i114 & 458752));
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw b1j.f(-660944770, fetVar, false);
                        }
                        i10 = i4;
                        qao0Var2 = qao0Var;
                        fetVar.e0(985623942);
                        aoo0Var2 = aoo0Var;
                        z8 = z7;
                        if (aoo0Var2 == aoo0.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8) {
                            fetVar.e0(985713749);
                            int i115 = (i10 << 6) & 7168;
                            int i116 = i10 >> 3;
                            l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i116) | i115 | (i116 & 458752));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(986063770);
                            int i117 = (i10 << 6) & 7168;
                            int i118 = i10 >> 3;
                            j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i118) | i117 | (i118 & 458752));
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else {
                        fetVar.e0(986468103);
                        if (z7) {
                            fetVar.e0(986489121);
                            int i26 = (i4 >> 3) & 14;
                            int i27 = i4 >> 6;
                            k(a4xVar, iD, qao0Var, z6, function1, fetVar, i26 | (i27 & 7168) | (i27 & 57344));
                            z6 = z6;
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            int i28 = i4;
                            fetVar.e0(986795494);
                            int i29 = (i28 >> 3) & 14;
                            int i210 = i28 >> 6;
                            i(a4xVar, iD, qao0Var, z6, function1, fetVar, (i210 & 57344) | i29 | (i210 & 7168));
                            z6 = z6;
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                        aoo0Var2 = aoo0Var;
                    }
                    z4 = z6;
                    r4iVar3 = r4iVar5;
                    ulbVar2 = ulbVar5;
                }
                yfe0VarU.d = function3;
            }
            aoo0Var2 = aoo0Var;
            i9 = i;
            fetVar.X();
            ulbVar2 = ulbVar;
            r4iVar3 = r4iVar2;
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final byte b4 = 1;
                final int i211 = i9;
                final aoo0 aoo0Var4 = aoo0Var2;
                function3 = new Function2() { // from class: a.p5n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                z5n.h(i211, a4xVar, aoo0Var4, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                z5n.h(i211, a4xVar, aoo0Var4, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0VarU.d = function3;
            }
        }
        i4 |= 3072;
        r4iVar2 = r4iVar;
        i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                zI = fetVar.g(ulbVar);
            } else {
                zI = fetVar.i(ulbVar);
            }
            if (zI) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                if (fetVar.h(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((1572864 & i2) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                function2 = function1;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i12 != 0) {
                    r4iVar4 = new r4i(null, null, null, null, null, 63);
                } else {
                    r4iVar4 = r4iVar2;
                }
                ulbVar3 = b6n.f2063a;
                if (i5 != 0) {
                    ulbVar4 = ulbVar3;
                } else {
                    ulbVar3 = ulbVar;
                    ulbVar4 = ulbVar3;
                }
                ulbVar5 = ulbVar3;
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                size = a4xVar.size();
                if (size < 2) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        return;
                    }
                    final byte b5 = 0;
                    final Function1 function6 = function2;
                    function3 = new Function2() { // from class: a.p5n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function6, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function6, (fet) obj, x8x.L(i2 | 1), i3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                } else {
                    i9 = i;
                    r4iVar5 = r4iVar4;
                    z6 = z5;
                    fetVar.e0(-1065207822);
                    fB = bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a());
                    if (size > 5) {
                        if (size < 10) {
                            yclVar = (ycl) f43825a.get(Integer.valueOf(size));
                            if (yclVar != null) {
                                if (ycl.a(fB, yclVar.f42389a) < 0) {
                                    z7 = false;
                                }
                                fetVar.r(false);
                            } else {
                                fetVar.r(false);
                                z7 = true;
                            }
                        }
                        z7 = true;
                        fetVar.r(false);
                    } else {
                        z7 = false;
                        fetVar.r(false);
                    }
                    if (Intrinsics.d(ulbVar5, ulbVar4)) {
                        fetVar.e0(-483816410);
                        y3dVar6 = r4iVar5.f29836a;
                        if (y3dVar6 == null) {
                            fetVar.e0(-483814214);
                            primary3 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483815392);
                            fetVar.r(false);
                            primary3 = y3dVar6.f41946a;
                        }
                        long j17 = primary3;
                        y3dVar7 = r4iVar5.d;
                        if (y3dVar7 == null) {
                            fetVar.e0(-483811748);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483812988);
                            fetVar.r(false);
                            secondary = y3dVar7.f41946a;
                        }
                        long j18 = secondary;
                        y3dVar8 = r4iVar5.b;
                        if (y3dVar8 == null) {
                            fetVar.e0(-483809414);
                            primary4 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483810561);
                            fetVar.r(false);
                            primary4 = y3dVar8.f41946a;
                        }
                        long j19 = primary4;
                        y3dVar9 = r4iVar5.c;
                        if (y3dVar9 == null) {
                            fetVar.e0(-483807012);
                            secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483808221);
                            fetVar.r(false);
                            secondary2 = y3dVar9.f41946a;
                        }
                        long j110 = secondary2;
                        fetVar.e0(-483804291);
                        zfnVar2 = zaq0.b;
                        long background3 = ((ThemeColors) fetVar.k(zfnVar2)).getBackground();
                        fetVar.r(false);
                        long separator62 = ((ThemeColors) fetVar.k(zfnVar2)).getSeparator60();
                        y3dVar10 = r4iVar5.e;
                        if (y3dVar10 == null) {
                            fetVar.e0(-483799900);
                            backgroundContent = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483801016);
                            fetVar.r(false);
                            backgroundContent = y3dVar10.f41946a;
                        }
                        qao0Var = new qao0(j17, j18, j19, j110, background3, separator62, backgroundContent, null);
                        fetVar.r(false);
                    } else {
                        if (ulbVar5 instanceof a6n) {
                            throw b1j.f(-483817120, fetVar, false);
                        }
                        fetVar.e0(-483796263);
                        y3dVar = r4iVar5.f29836a;
                        if (y3dVar == null) {
                            fetVar.e0(-483794086);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483795264);
                            fetVar.r(false);
                            primary = y3dVar.f41946a;
                        }
                        long j111 = primary;
                        y3dVar2 = r4iVar5.d;
                        if (y3dVar2 == null) {
                            fetVar.e0(-483791430);
                            jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483792856);
                            fetVar.r(false);
                            jM130getWhite600d7_KjU = y3dVar2.f41946a;
                        }
                        long j112 = jM130getWhite600d7_KjU;
                        y3dVar3 = r4iVar5.b;
                        if (y3dVar3 == null) {
                            fetVar.e0(-483789158);
                            primary2 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483790305);
                            fetVar.r(false);
                            primary2 = y3dVar3.f41946a;
                        }
                        long j113 = primary2;
                        y3dVar4 = r4iVar5.c;
                        if (y3dVar4 == null) {
                            fetVar.e0(-483786566);
                            jM130getWhite600d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483787961);
                            fetVar.r(false);
                            jM130getWhite600d7_KjU2 = y3dVar4.f41946a;
                        }
                        long j114 = jM130getWhite600d7_KjU2;
                        fetVar.e0(-483783908);
                        long primary22 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary20();
                        fetVar.r(false);
                        zfnVar = m8m0.f21378a;
                        long jM125getWhite100d7_KjU3 = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
                        y3dVar5 = r4iVar5.e;
                        if (y3dVar5 == null) {
                            fetVar.e0(-483779302);
                            jM70getBlack200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m70getBlack200d7_KjU();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-483780604);
                            fetVar.r(false);
                            jM70getBlack200d7_KjU = y3dVar5.f41946a;
                        }
                        qao0Var = new qao0(j111, j112, j113, j114, primary22, jM125getWhite100d7_KjU3, jM70getBlack200d7_KjU, npe.f23909a);
                        fetVar.r(false);
                    }
                    iD = l1e0.d(i9, 0, a4xVar.size() - 1);
                    iOrdinal = aoo0Var.ordinal();
                    if (iOrdinal == 0) {
                        i10 = i4;
                        qao0Var2 = qao0Var;
                        fetVar.e0(985623942);
                        aoo0Var2 = aoo0Var;
                        z8 = z7;
                        if (aoo0Var2 == aoo0.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8) {
                            fetVar.e0(985713749);
                            int i119 = (i10 << 6) & 7168;
                            int i1110 = i10 >> 3;
                            l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i1110) | i119 | (i1110 & 458752));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(986063770);
                            int i1111 = (i10 << 6) & 7168;
                            int i1112 = i10 >> 3;
                            j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i1112) | i1111 | (i1112 & 458752));
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw b1j.f(-660944770, fetVar, false);
                        }
                        i10 = i4;
                        qao0Var2 = qao0Var;
                        fetVar.e0(985623942);
                        aoo0Var2 = aoo0Var;
                        z8 = z7;
                        if (aoo0Var2 == aoo0.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8) {
                            fetVar.e0(985713749);
                            int i1113 = (i10 << 6) & 7168;
                            int i1114 = i10 >> 3;
                            l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i1114) | i1113 | (i1114 & 458752));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(986063770);
                            int i1115 = (i10 << 6) & 7168;
                            int i1116 = i10 >> 3;
                            j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i1116) | i1115 | (i1116 & 458752));
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else {
                        fetVar.e0(986468103);
                        if (z7) {
                            fetVar.e0(986489121);
                            int i212 = (i4 >> 3) & 14;
                            int i213 = i4 >> 6;
                            k(a4xVar, iD, qao0Var, z6, function1, fetVar, i212 | (i213 & 7168) | (i213 & 57344));
                            z6 = z6;
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            int i214 = i4;
                            fetVar.e0(986795494);
                            int i215 = (i214 >> 3) & 14;
                            int i216 = i214 >> 6;
                            i(a4xVar, iD, qao0Var, z6, function1, fetVar, (i216 & 57344) | i215 | (i216 & 7168));
                            z6 = z6;
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                        aoo0Var2 = aoo0Var;
                    }
                    z4 = z6;
                    r4iVar3 = r4iVar5;
                    ulbVar2 = ulbVar5;
                }
                yfe0VarU.d = function3;
            }
            aoo0Var2 = aoo0Var;
            i9 = i;
            fetVar.X();
            ulbVar2 = ulbVar;
            r4iVar3 = r4iVar2;
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final byte b6 = 1;
                final int i217 = i9;
                final aoo0 aoo0Var5 = aoo0Var2;
                function3 = new Function2() { // from class: a.p5n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                z5n.h(i217, a4xVar, aoo0Var5, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                z5n.h(i217, a4xVar, aoo0Var5, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0VarU.d = function3;
            }
        }
        i4 |= 196608;
        z2 = z;
        if ((1572864 & i2) == 0) {
            function2 = function1;
            if (fetVar.i(function2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        } else {
            function2 = function1;
        }
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i12 != 0) {
                r4iVar4 = new r4i(null, null, null, null, null, 63);
            } else {
                r4iVar4 = r4iVar2;
            }
            ulbVar3 = b6n.f2063a;
            if (i5 != 0) {
                ulbVar4 = ulbVar3;
            } else {
                ulbVar3 = ulbVar;
                ulbVar4 = ulbVar3;
            }
            ulbVar5 = ulbVar3;
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            size = a4xVar.size();
            if (size < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    return;
                }
                final byte b7 = 0;
                final Function1 function7 = function2;
                function3 = new Function2() { // from class: a.p5n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b7) {
                            case 0:
                                ((Integer) obj2).getClass();
                                z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function7, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                z5n.h(i, a4xVar, aoo0Var, r4iVar4, ulbVar5, z5, function7, (fet) obj, x8x.L(i2 | 1), i3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                i9 = i;
                r4iVar5 = r4iVar4;
                z6 = z5;
                fetVar.e0(-1065207822);
                fB = bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a());
                if (size > 5) {
                    if (size < 10) {
                        yclVar = (ycl) f43825a.get(Integer.valueOf(size));
                        if (yclVar != null) {
                            if (ycl.a(fB, yclVar.f42389a) < 0) {
                                z7 = false;
                            }
                            fetVar.r(false);
                        } else {
                            fetVar.r(false);
                            z7 = true;
                        }
                    }
                    z7 = true;
                    fetVar.r(false);
                } else {
                    z7 = false;
                    fetVar.r(false);
                }
                if (Intrinsics.d(ulbVar5, ulbVar4)) {
                    fetVar.e0(-483816410);
                    y3dVar6 = r4iVar5.f29836a;
                    if (y3dVar6 == null) {
                        fetVar.e0(-483814214);
                        primary3 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483815392);
                        fetVar.r(false);
                        primary3 = y3dVar6.f41946a;
                    }
                    long j115 = primary3;
                    y3dVar7 = r4iVar5.d;
                    if (y3dVar7 == null) {
                        fetVar.e0(-483811748);
                        secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483812988);
                        fetVar.r(false);
                        secondary = y3dVar7.f41946a;
                    }
                    long j116 = secondary;
                    y3dVar8 = r4iVar5.b;
                    if (y3dVar8 == null) {
                        fetVar.e0(-483809414);
                        primary4 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483810561);
                        fetVar.r(false);
                        primary4 = y3dVar8.f41946a;
                    }
                    long j117 = primary4;
                    y3dVar9 = r4iVar5.c;
                    if (y3dVar9 == null) {
                        fetVar.e0(-483807012);
                        secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483808221);
                        fetVar.r(false);
                        secondary2 = y3dVar9.f41946a;
                    }
                    long j118 = secondary2;
                    fetVar.e0(-483804291);
                    zfnVar2 = zaq0.b;
                    long background4 = ((ThemeColors) fetVar.k(zfnVar2)).getBackground();
                    fetVar.r(false);
                    long separator63 = ((ThemeColors) fetVar.k(zfnVar2)).getSeparator60();
                    y3dVar10 = r4iVar5.e;
                    if (y3dVar10 == null) {
                        fetVar.e0(-483799900);
                        backgroundContent = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483801016);
                        fetVar.r(false);
                        backgroundContent = y3dVar10.f41946a;
                    }
                    qao0Var = new qao0(j115, j116, j117, j118, background4, separator63, backgroundContent, null);
                    fetVar.r(false);
                } else {
                    if (ulbVar5 instanceof a6n) {
                        throw b1j.f(-483817120, fetVar, false);
                    }
                    fetVar.e0(-483796263);
                    y3dVar = r4iVar5.f29836a;
                    if (y3dVar == null) {
                        fetVar.e0(-483794086);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483795264);
                        fetVar.r(false);
                        primary = y3dVar.f41946a;
                    }
                    long j119 = primary;
                    y3dVar2 = r4iVar5.d;
                    if (y3dVar2 == null) {
                        fetVar.e0(-483791430);
                        jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483792856);
                        fetVar.r(false);
                        jM130getWhite600d7_KjU = y3dVar2.f41946a;
                    }
                    long j1110 = jM130getWhite600d7_KjU;
                    y3dVar3 = r4iVar5.b;
                    if (y3dVar3 == null) {
                        fetVar.e0(-483789158);
                        primary2 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483790305);
                        fetVar.r(false);
                        primary2 = y3dVar3.f41946a;
                    }
                    long j1111 = primary2;
                    y3dVar4 = r4iVar5.c;
                    if (y3dVar4 == null) {
                        fetVar.e0(-483786566);
                        jM130getWhite600d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483787961);
                        fetVar.r(false);
                        jM130getWhite600d7_KjU2 = y3dVar4.f41946a;
                    }
                    long j1112 = jM130getWhite600d7_KjU2;
                    fetVar.e0(-483783908);
                    long primary23 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary20();
                    fetVar.r(false);
                    zfnVar = m8m0.f21378a;
                    long jM125getWhite100d7_KjU4 = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
                    y3dVar5 = r4iVar5.e;
                    if (y3dVar5 == null) {
                        fetVar.e0(-483779302);
                        jM70getBlack200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m70getBlack200d7_KjU();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-483780604);
                        fetVar.r(false);
                        jM70getBlack200d7_KjU = y3dVar5.f41946a;
                    }
                    qao0Var = new qao0(j119, j1110, j1111, j1112, primary23, jM125getWhite100d7_KjU4, jM70getBlack200d7_KjU, npe.f23909a);
                    fetVar.r(false);
                }
                iD = l1e0.d(i9, 0, a4xVar.size() - 1);
                iOrdinal = aoo0Var.ordinal();
                if (iOrdinal == 0) {
                    i10 = i4;
                    qao0Var2 = qao0Var;
                    fetVar.e0(985623942);
                    aoo0Var2 = aoo0Var;
                    z8 = z7;
                    if (aoo0Var2 == aoo0.d) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z8) {
                        fetVar.e0(985713749);
                        int i1117 = (i10 << 6) & 7168;
                        int i1118 = i10 >> 3;
                        l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i1118) | i1117 | (i1118 & 458752));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(986063770);
                        int i1119 = (i10 << 6) & 7168;
                        int i11110 = i10 >> 3;
                        j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i11110) | i1119 | (i11110 & 458752));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw b1j.f(-660944770, fetVar, false);
                    }
                    i10 = i4;
                    qao0Var2 = qao0Var;
                    fetVar.e0(985623942);
                    aoo0Var2 = aoo0Var;
                    z8 = z7;
                    if (aoo0Var2 == aoo0.d) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z8) {
                        fetVar.e0(985713749);
                        int i11111 = (i10 << 6) & 7168;
                        int i11112 = i10 >> 3;
                        l(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i11112) | i11111 | (i11112 & 458752));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(986063770);
                        int i11113 = (i10 << 6) & 7168;
                        int i11114 = i10 >> 3;
                        j(iD, z9, qao0Var2, a4xVar, z6, function1, fetVar, (57344 & i11114) | i11113 | (i11114 & 458752));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.e0(986468103);
                    if (z7) {
                        fetVar.e0(986489121);
                        int i218 = (i4 >> 3) & 14;
                        int i219 = i4 >> 6;
                        k(a4xVar, iD, qao0Var, z6, function1, fetVar, i218 | (i219 & 7168) | (i219 & 57344));
                        z6 = z6;
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        int i2110 = i4;
                        fetVar.e0(986795494);
                        int i2111 = (i2110 >> 3) & 14;
                        int i2112 = i2110 >> 6;
                        i(a4xVar, iD, qao0Var, z6, function1, fetVar, (i2112 & 57344) | i2111 | (i2112 & 7168));
                        z6 = z6;
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                    aoo0Var2 = aoo0Var;
                }
                z4 = z6;
                r4iVar3 = r4iVar5;
                ulbVar2 = ulbVar5;
            }
            yfe0VarU.d = function3;
        }
        aoo0Var2 = aoo0Var;
        i9 = i;
        fetVar.X();
        ulbVar2 = ulbVar;
        r4iVar3 = r4iVar2;
        z4 = z2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b8 = 1;
            final int i2113 = i9;
            final aoo0 aoo0Var6 = aoo0Var2;
            function3 = new Function2() { // from class: a.p5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            z5n.h(i2113, a4xVar, aoo0Var6, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            z5n.h(i2113, a4xVar, aoo0Var6, r4iVar3, ulbVar2, z4, function1, (fet) obj, x8x.L(i2 | 1), i3);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static final void i(a4x a4xVar, int i, qao0 qao0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        float f;
        List listJ;
        qao0 qao0Var2 = qao0Var;
        fetVar.g0(1672984213);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qao0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            int size = a4xVar.size();
            float f2 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            boolean zD = fetVar.d(f2);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zD || objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(f2 - 16.0f, fetVar);
            }
            float f3 = ((ycl) objP).f42389a;
            boolean zE = ((i4 & 112) == 32) | fetVar.e(size) | fetVar.d(f3);
            Object objP2 = fetVar.P();
            if (zE || objP2 == obj) {
                float fW0 = w6kVar.w0(f3);
                if (size == 2) {
                    int i5 = (int) (fW0 / 2.0f);
                    listJ = q3d.j(Integer.valueOf(i5), Integer.valueOf(i5));
                } else {
                    if (ycl.a(f3, 360.0f) < 0) {
                        zcl zclVar2 = qmk.f28987a;
                        f = 120.0f;
                    } else if (ycl.a(f3, 480.0f) >= 0) {
                        zcl zclVar3 = qmk.f28987a;
                        f = 256.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f = 168.0f;
                    }
                    float fW1 = w6kVar.w0(f);
                    float fW2 = w6kVar.w0(40.0f);
                    float fMax = Math.max(fW0 / size, fW1);
                    float fMax2 = Math.max((fW0 - fMax) / (size - 1), fW2);
                    ArrayList arrayList = new ArrayList(size);
                    int iC = 0;
                    while (iC < size) {
                        iC = w6x.c(iC == i ? (int) fMax : (int) fMax2, iC, 1, arrayList);
                    }
                    listJ = arrayList;
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                Iterator it = listJ.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    lc00VarB.add(Integer.valueOf(i6));
                    i6 += iIntValue;
                }
                objP2 = new Pair(listJ, kotlin.collections.a.a(lc00VarB));
                fetVar.o0(objP2);
            }
            Pair pair = (Pair) objP2;
            List list = (List) pair.f46059a;
            int iIntValue2 = ((Number) ((List) pair.b).get(i)).intValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var = (t33) objP3;
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(t33Var) | fetVar.e(iIntValue2);
            Object objP4 = fetVar.P();
            yje yjeVar = null;
            if (zI || objP4 == obj) {
                objP4 = new w5n(t33Var, iIntValue2, yjeVar, (byte) 0);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, unit, (Function2) objP4);
            Integer numValueOf = Integer.valueOf(iIntValue2);
            boolean zI2 = fetVar.i(t33Var) | fetVar.e(iIntValue2);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj) {
                objP5 = new w5n(t33Var, iIntValue2, yjeVar, (byte) 1);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP5);
            int iIntValue3 = ((Number) list.get(i)).intValue();
            zcl zclVar5 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(i120.Q(o7k0.e(jm40Var, 52.0f), qao0Var2.g, jd8.n), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf2, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            long j = qao0Var2.e;
            boolean zI3 = fetVar.i(t33Var);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new fu7(t33Var, (byte) 9);
                fetVar.o0(objP6);
            }
            Object obj2 = obj;
            a(iIntValue3, j, (Function0) objP6, fetVar, 0);
            n0q n0qVar = o7k0.c;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, 1781344112, a4xVar);
            int i7 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                s4i s4iVar = (s4i) next;
                boolean z3 = i7 == i;
                mm40 mm40VarS = o7k0.s(jm40Var, w6kVar.r0(((Number) list.get(i7)).intValue()));
                boolean zE2 = fetVar.e(i7);
                Object objP7 = fetVar.P();
                Object obj3 = obj2;
                if (zE2 || objP7 == obj3) {
                    objP7 = new re1(function1, i7, (byte) 8);
                    fetVar.o0(objP7);
                }
                d(mm40VarS, s4iVar, z3, qao0Var, (Function0) objP7, fetVar, (i4 << 3) & 7168);
                i7 = i8;
                obj2 = obj3;
            }
            qao0Var2 = qao0Var;
            function2 = function1;
            fetVar.r(false);
            fetVar.r(true);
            if (z) {
                fetVar.e0(-650517142);
                g(0, qao0Var2.f, fetVar, o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f));
                fetVar.r(false);
            } else {
                fetVar.e0(-650304761);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5n(a4xVar, i, qao0Var2, z, function2, i2, (byte) 1);
        }
    }

    public static final void j(int i, boolean z, qao0 qao0Var, a4x a4xVar, boolean z2, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z3;
        qao0 qao0Var2;
        float f;
        int i4 = i;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.h;
        fetVar2.g0(-1077870820);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.e(i4) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= fetVar2.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(qao0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        int i5 = i3;
        if (fetVar2.U(i5 & 1, (i5 & 74899) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), qao0Var.g, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            mm40 mm40VarN2 = s5x0.N(s5x0.L(o7k0.d(jm40Var, 1.0f), 2.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC1, shdVar, 652825712, a4xVar);
            int i6 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    q3d.p();
                    throw null;
                }
                s4i s4iVar = (s4i) next;
                x7z x7zVar = new x7z(1.0f, true);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar2);
                }
                gy40 gy40Var = (gy40) objP;
                boolean zE = fetVar2.e(i6);
                Object objP2 = fetVar2.P();
                if (zE || objP2 == cl5Var) {
                    objP2 = new re1(function2, i6, (byte) 6);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarW = y860.W(x7zVar, gy40Var, null, false, null, (Function0) objP2, 28);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                int i8 = i5 << 3;
                jm40 jm40Var2 = jm40Var;
                e(s4iVar, i6 == i4, z3, qao0Var, true, fetVar, (i8 & 7168) | (i8 & 896) | 24576);
                fetVar2 = fetVar;
                fetVar2.r(true);
                i4 = i;
                z3 = z;
                jm40Var = jm40Var2;
                i6 = i7;
                function2 = function1;
            }
            qao0Var2 = qao0Var;
            jm40 jm40Var3 = jm40Var;
            fetVar2.r(false);
            fetVar2.r(true);
            jr8 jr8Var = jr8.f16991a;
            if (z2) {
                fetVar2.e0(-14933713);
                f = 1.0f;
                g(0, qao0Var2.f, fetVar2, jr8Var.b(o7k0.d(jm40Var3, 1.0f), zx7Var));
                fetVar2.r(false);
            } else {
                f = 1.0f;
                fetVar2.e0(-14721332);
                fetVar2.r(false);
            }
            f(i, a4xVar.size(), (i5 << 6) & 896, qao0Var2.f28407a, fetVar2, jr8Var.b(o7k0.d(jm40Var3, f), zx7Var));
            fetVar2.r(true);
        } else {
            qao0Var2 = qao0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5n(i, z, qao0Var2, a4xVar, z2, function1, i2, (byte) 0);
        }
    }

    public static final void k(a4x a4xVar, int i, qao0 qao0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        float f;
        float f2;
        float f3;
        t33 t33Var;
        t33 t33Var2;
        float f4;
        t33 t33Var3;
        rah0 rah0Var;
        boolean z2;
        qao0 qao0Var2 = qao0Var;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(880786660);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qao0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            rah0 rah0VarT = wha0.T(fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            float f5 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            zcl zclVar = qmk.f28987a;
            boolean zD = fetVar.d(f5);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj) {
                if (ycl.a(f5, 392.0f) < 0) {
                    f = 128.0f;
                } else {
                    f = ycl.a(f5, 480.0f) >= 0 ? 256.0f : 164.0f;
                }
                objP2 = twn.j(f, fetVar);
            }
            float f6 = ((ycl) objP2).f42389a;
            int i4 = i3;
            float fW0 = w6kVar.w0(52.0f);
            float fW1 = w6kVar.w0(f6);
            float fW2 = w6kVar.w0(8.0f);
            boolean zE = fetVar.e(a4xVar.size()) | ((i4 & 112) == 32) | fetVar.d(fW1) | fetVar.d(fW0);
            Object objP3 = fetVar.P();
            if (zE || objP3 == obj) {
                int size = a4xVar.size();
                f2 = 0.0f;
                ArrayList arrayList = new ArrayList(size);
                f3 = fW1;
                float f7 = 0.0f;
                int i5 = 0;
                while (i5 < size) {
                    float f8 = i5 == i ? f3 : fW0;
                    int i6 = size;
                    float f9 = fW0;
                    Pair pair = new Pair(Float.valueOf(f7), Float.valueOf(f8));
                    f7 += f8;
                    arrayList.add(pair);
                    i5++;
                    size = i6;
                    fW0 = f9;
                }
                fetVar.o0(arrayList);
                objP3 = arrayList;
            } else {
                f3 = fW1;
                f2 = 0.0f;
            }
            List list = (List) objP3;
            Pair pair2 = (Pair) CollectionsKt.W(i, list);
            float fFloatValue = pair2 != null ? ((Number) pair2.f46059a).floatValue() : f2;
            Pair pair3 = (Pair) CollectionsKt.W(i, list);
            float fFloatValue2 = pair3 != null ? ((Number) pair3.b).floatValue() : f3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = xf0.c(f2);
                fetVar.o0(objP4);
            }
            t33 t33Var4 = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = xf0.c(f2);
                fetVar.o0(objP5);
            }
            t33 t33Var5 = (t33) objP5;
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(t33Var5) | fetVar.d(fFloatValue2) | fetVar.i(t33Var4) | fetVar.d(fFloatValue);
            float f10 = fFloatValue;
            Object objP6 = fetVar.P();
            if (zI || objP6 == obj) {
                objP6 = new x5n(t33Var5, fFloatValue2, t33Var4, f10, (yje) null);
                t33Var = t33Var5;
                t33Var2 = t33Var4;
                fetVar.o0(objP6);
            } else {
                t33Var = t33Var5;
                t33Var2 = t33Var4;
            }
            m0x0.t(fetVar, unit, (Function2) objP6);
            Integer numValueOf = Integer.valueOf(i);
            boolean zD2 = fetVar.d(f10) | fetVar.d(fFloatValue2) | fetVar.g(rah0VarT) | fetVar.d(fW2) | fetVar.i(vneVar) | fetVar.i(t33Var2) | fetVar.i(t33Var);
            Object objP7 = fetVar.P();
            if (zD2 || objP7 == obj) {
                f4 = fW2;
                t33Var3 = t33Var;
                objP7 = new y5n(f10, fFloatValue2, rah0VarT, f4, vneVar, t33Var2, t33Var3, null);
                rah0Var = rah0VarT;
                fetVar.o0(objP7);
            } else {
                f4 = fW2;
                t33Var3 = t33Var;
                rah0Var = rah0VarT;
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP7);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 52.0f), qao0Var2.g, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            float fFloatValue3 = (((Number) t33Var2.d()).floatValue() + f4) - rah0Var.f30133a.l();
            float fS0 = w6kVar.s0(((Number) t33Var3.d()).floatValue());
            if (ycl.a(fS0, f2) > 0) {
                fetVar.e0(-1888142173);
                boolean zD3 = fetVar.d(fFloatValue3);
                Object objP8 = fetVar.P();
                if (zD3 || objP8 == obj) {
                    objP8 = new f54(fFloatValue3, (byte) 19);
                    fetVar.o0(objP8);
                }
                mm40 mm40VarL = s5x0.L(o7k0.c(o7k0.s(ffb0.P(jm40Var, (Function1) objP8), fS0), 1.0f), 0.0f, 8.0f, 1);
                qao0Var2 = qao0Var;
                z2 = false;
                zq8.a(0, fetVar, i120.Q(mm40VarL, qao0Var2.e, vgg0.a(360.0f)));
                fetVar.r(false);
            } else {
                qao0Var2 = qao0Var;
                z2 = false;
                fetVar.e0(-1887679932);
                fetVar.r(false);
            }
            mm40 mm40VarL2 = s5x0.L(wha0.P(o7k0.c, rah0Var, z2, 14), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar4);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar, 1178041783, a4xVar);
            int i7 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                s4i s4iVar = (s4i) next;
                boolean z4 = i7 == i;
                Iterator it = itO;
                mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, z4 ? f6 : 52.0f), 1.0f);
                Object objP9 = fetVar.P();
                if (objP9 == obj) {
                    objP9 = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP9;
                boolean zE2 = fetVar.e(i7);
                Object objP10 = fetVar.P();
                if (zE2 || objP10 == obj) {
                    objP10 = new re1(function1, i7, (byte) 5);
                    fetVar.o0(objP10);
                }
                mm40 mm40VarW = y860.W(mm40VarC, gy40Var, null, false, null, (Function0) objP10, 28);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                Object obj2 = obj;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarW);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar);
                b(z4, s4iVar, qao0Var2, fetVar, i4 & 896);
                fetVar.r(true);
                itO = it;
                obj = obj2;
                i7 = i8;
            }
            function2 = function1;
            fetVar.r(false);
            fetVar.r(true);
            if (z) {
                fetVar.e0(-1886558073);
                g(0, qao0Var2.f, fetVar, jr8.f16991a.b(o7k0.d(jm40Var, 1.0f), gqw0.h));
                fetVar.r(false);
            } else {
                fetVar.e0(-1886345692);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5n(a4xVar, i, qao0Var2, z, function2, i2, (byte) 0);
        }
    }

    public static final void l(int i, boolean z, qao0 qao0Var, a4x a4xVar, boolean z2, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z3;
        fetVar.g0(1401098733);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= fetVar.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qao0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        byte b = 1;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long j = qao0Var.g;
            long j2 = qao0Var.f28407a;
            zcl zclVar = qmk.f28987a;
            hxm0.b(8.0f, 64.0f, i, (i4 & 14) | 819462144, j, j2, u1c.M(-360593596, new z30(i, qao0Var, b), fetVar), u1c.M(1629828303, new jv1(z2, (Object) qao0Var, (byte) 20), fetVar), u1c.M(-761475315, new rn1(a4xVar, function1, i, z3, qao0Var), fetVar), fetVar, null, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5n(i, z, qao0Var, a4xVar, z2, function1, i2, (byte) 1);
        }
    }

    public static final void m(mm40 mm40Var, Integer num, long j, ope opeVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1962824441);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (num == null || num.intValue() <= 0) {
            fetVar.e0(1477339963);
            fetVar.r(false);
        } else {
            fetVar.e0(1476994003);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 18.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            tdc.e(new rpe(num.intValue()), opeVar == null ? new hpe(j) : opeVar, jm40.b, fetVar, 384, 0);
            fetVar.r(true);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(mm40Var, num, j, opeVar, i);
        }
    }
}
