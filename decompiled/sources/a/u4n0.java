package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u4n0 {
    public static final void a(mm40 mm40Var, aev0 aev0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1932354493);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(aev0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            int iOrdinal = aev0Var.f748a.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(1326373212);
                j5n0.u(mm40Var, aev0Var, z, function0, function1, function2, fetVar2, i2 & 524286);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(1566805433, fetVar2, false);
                }
                fetVar2.e0(1326763316);
                int i3 = i2 & 126;
                int i4 = i2 >> 6;
                k5n0.q(mm40Var, aev0Var, function1, function2, fetVar2, i3 | (i4 & 896) | (i4 & 7168));
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rev0(mm40Var, aev0Var, z, function0, function1, function2, i, (byte) 0);
        }
    }

    public static final void b(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1614169455);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 16.0f, 10.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new r2a0((byte) 19, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarP, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 13);
        }
    }

    public static final void c(mm40 mm40Var, zdv0 zdv0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(711055376);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(zdv0Var.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = zdv0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(272161359);
                j5n0.s(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(424419645, fetVar, false);
                }
                fetVar.e0(272295279);
                k5n0.o(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) zdv0Var, i, (byte) 19);
        }
    }

    public static final void d(final qz3 qz3Var, final mm40 mm40Var, final Function1 function1, final Function1 function2, final u12 u12Var, final qge qgeVar, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        Function1 function3;
        int i4;
        fetVar.g0(-205779950);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(qz3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function3 = function2;
            i3 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function2;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.g(u12Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.g(qgeVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.d(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= fetVar.g(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= fetVar.e(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.h(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            o1x o1xVarD = iut0.d(qz3Var.f29561a, qgeVar, fetVar, (i3 >> 15) & 112);
            int i5 = i3 >> 6;
            int i6 = i3 >> 12;
            mz3 mz3VarY = ny9.Y(o1xVarD, qz3Var.c, function1, function3, qgeVar, fetVar, (i6 & 458752) | ((i3 >> 3) & 8064) | (i5 & 57344));
            s7k0 s7k0Var = o1xVarD.r;
            if (s7k0Var instanceof t4e) {
                fetVar.e0(-1470570430);
                nnw0.g(mm40Var, u12Var, true, u1c.M(-374957172, new hgs0(s7k0Var, ugdVar, mz3VarY, u12Var, qgeVar, (byte) 13), fetVar), fetVar, (i5 & 14) | 3456 | (i6 & 112), 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1471259157);
                tj30 tj30VarC = zq8.c(u12Var, true);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
                ugdVar.F(new pbe0(jr8.f16991a, mz3VarY, u12Var, qgeVar), fetVar, Integer.valueOf(i4 & 112));
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.s4n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u4n0.d(qz3Var, mm40Var, function1, function2, u12Var, qgeVar, ugdVar, (fet) obj, x8x.L(i | 1), x8x.L(i2));
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    public static final void e(final pbe0 pbe0Var, mm40 mm40Var, pm80 pm80Var, u12 u12Var, qge qgeVar, float f, a4d a4dVar, boolean z, fet fetVar, final int i, final int i2) {
        int i3;
        qge qgeVar2;
        a4d a4dVar2;
        mm40 mm40Var2;
        float f2;
        final boolean z2;
        final pm80 pm80Var2;
        a4d a4dVar3;
        final qge qgeVar3;
        final u12 u12Var2;
        u12 u12Var3;
        boolean z3;
        int i4;
        pm80 pm80Var3 = pm80Var;
        fetVar.g0(-1375825518);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(pbe0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 2) != 0) {
                i4 = 128;
            } else {
                if ((i & 512) == 0 ? fetVar.g(pm80Var3) : fetVar.i(pm80Var3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
            }
            i5 |= i4;
        }
        if ((i & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 16) == 0) {
                qgeVar2 = qgeVar;
                int i6 = fetVar.g(qgeVar2) ? 131072 : 65536;
                i5 |= i6;
            } else {
                qgeVar2 = qgeVar;
            }
            i5 |= i6;
        } else {
            qgeVar2 = qgeVar;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 64) == 0) {
                a4dVar2 = a4dVar;
                int i7 = fetVar.g(a4dVar2) ? 8388608 : 4194304;
                i5 |= i7;
            } else {
                a4dVar2 = a4dVar;
            }
            i5 |= i7;
        } else {
            a4dVar2 = a4dVar;
        }
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        if (fetVar.U(i5 & 1, (38347923 & i5) != 38347922)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 2) != 0) {
                    pm80Var3 = pbe0Var.b;
                }
                pbe0Var.getClass();
                u12Var3 = pbe0Var.c;
                if ((i2 & 16) != 0) {
                    qgeVar2 = pbe0Var.d;
                }
                pbe0Var.getClass();
                if ((i2 & 64) != 0) {
                    pbe0Var.getClass();
                    a4dVar2 = null;
                }
                pbe0Var.getClass();
                mm40Var2 = jm40.b;
                f2 = 1.0f;
                z3 = true;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                u12Var3 = u12Var;
                f2 = f;
                z3 = z;
            }
            fetVar.s();
            mm40 mm40VarE = mm40Var2.e(new v4n0(pm80Var3, u12Var3, qgeVar2, f2, a4dVar2, z3));
            int i8 = iut0.b;
            mu90 mu90Var = mu90.q;
            int iHashCode = Long.hashCode(fetVar.T);
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            bh90 bh90VarM = fetVar.m();
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, mu90Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            fetVar.r(true);
            u12 u12Var4 = u12Var3;
            pm80Var2 = pm80Var3;
            a4dVar3 = a4dVar2;
            qgeVar3 = qgeVar2;
            u12Var2 = u12Var4;
            z2 = z3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f2 = f;
            z2 = z;
            pm80Var2 = pm80Var3;
            a4dVar3 = a4dVar2;
            qgeVar3 = qgeVar2;
            u12Var2 = u12Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var3 = mm40Var2;
            final float f3 = f2;
            final a4d a4dVar4 = a4dVar3;
            yfe0VarU.d = new Function2() { // from class: a.t4n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u4n0.e(pbe0Var, mm40Var3, pm80Var2, u12Var2, qgeVar3, f3, a4dVar4, z2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(mm40 mm40Var, r6p0 r6p0Var, fet fetVar, int i) {
        r6p0 r6p0Var2 = r6p0Var;
        fet fetVar2 = fetVar;
        r6p0Var2.getClass();
        fetVar2.g0(1851816747);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(r6p0Var2) ? 32 : 16);
        byte b = 18;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TEAM_CARD_DEFAULT_COLUMN_TAG");
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_language, 0, fetVar2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new ofo0(b);
                fetVar2.o0(objP);
            }
            oil oilVarT = ju70.T(pm80VarF, null, (Function2) objP, 6);
            jm40 jm40Var = jm40.b;
            k7x.b(r6p0Var2.b, null, o2e.e0(o7k0.n(jm40Var, 64.0f), "TEAM_CARD_IMAGE_TAG"), oilVarT, oilVarT, null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
            mm40 mm40VarS = o7k0.s(o7k0.g(jm40Var, 24.0f, 0.0f, 2), 64.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            r6p0Var2 = r6p0Var;
            String str = r6p0Var2.c;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, r6p0Var2, i, (byte) 27);
        }
    }

    public static final void g(int i, fet fetVar) {
        byte b;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-373612480);
        if (fetVar2.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundGroup(), jd8.n), xfn.a(fetVar2).d, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            b = 1;
            v8q0.a(Separators.POUND, zhg0Var.a(0.05f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 6, 24960, 109560);
            mm40 mm40VarA = zhg0Var.a(0.52f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(rsm0.w(R.string.name_title, 0, fetVar), s5x0.L(o7k0.s(jm40Var, 128.0f), 8.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            v8q0.a(rsm0.w(R.string.age, 0, fetVar), zhg0Var.a(1.0f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar.r(true);
            v8q0.a(rsm0.w(R.string.games_header, 0, fetVar), zhg0Var.a(0.19f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarA2 = zhg0Var.a(0.24f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            thg0 thg0VarA3 = shg0.a(uc9.g, yx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            j0x.a(jpm0.t(R.drawable.ic_status_green_check_circle, 6, fetVar2), o7k0.n(jm40Var, 16.0f), 0.0f, fetVar2, 120);
            j0x.a(jpm0.t(R.drawable.ic_yellow_card, 6, fetVar2), o7k0.n(jm40Var, 16.0f), 0.0f, fetVar2, 120);
            j0x.a(jpm0.t(R.drawable.ic_red_card, 6, fetVar2), o7k0.n(jm40Var, 16.0f), 0.0f, fetVar2, 120);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i, b);
        }
    }

    public static final void h(mm40 mm40Var, l9q0 l9q0Var, Function1 function1, fet fetVar, int i) {
        l9q0Var.getClass();
        function1.getClass();
        fetVar.g0(-1130148614);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l9q0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            c6q0 c6q0Var = l9q0Var.b;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b8q0(function1, l9q0Var, b);
                fetVar.o0(objP);
            }
            wvb.t(mm40Var, c6q0Var, 0, null, (Function1) objP, fetVar, i2 & 14, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, l9q0Var, function1, i, (byte) 15);
        }
    }

    public static final void i(String str, wnq0 wnq0Var, String str2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-185582607);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(wnq0Var) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(jm40Var, 52.0f), 1.0f), "TWENTY_ONE_DOTA_GAME_INFO_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            k7x.a(str2, null, o7k0.e(jm40Var, 36.0f), null, null, fetVar2, ((i2 >> 6) & 14) | 48, 2040);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(str, o2e.e0(new ecu0(gqw0.k), "TWENTY_ONE_DOTA_TIMER_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, i2 & 14, 0, 131064);
            fetVar2 = fetVar;
            if (wnq0Var.f39460a) {
                fetVar2.e0(-1764720006);
                q5x.f(wnq0Var, s5x0.L(jm40Var, 8.0f, 0.0f, 2), fetVar2, (i2 >> 3) & 14);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1764553753);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(str, wnq0Var, str2, i, (byte) 13);
        }
    }

    public static final void j(mm40 mm40Var, cev0 cev0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1731428609);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cev0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (!fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.X();
        } else if (cev0Var instanceof aev0) {
            fetVar.e0(-1567197021);
            a(mm40Var, (aev0) cev0Var, z, function0, function1, function2, fetVar, i2 & 524286);
            fetVar.r(false);
        } else {
            if (!(cev0Var instanceof bev0)) {
                throw b1j.f(1750559017, fetVar, false);
            }
            fetVar.e0(-1566814977);
            c(mm40Var, ((bev0) cev0Var).f2470a, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgh0(mm40Var, cev0Var, z, function0, function1, function2, i);
        }
    }

    public static final void k(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        DsAccordion dsAccordion = ((c3s0) yfu0Var).c;
        dsAccordion.setExpanded(!((a8s0) cpVar.u()).f443a);
        dsAccordion.jumpDrawablesToCurrentState();
        ((c3s0) yfu0Var).b.setTextColor(m5d.b(((a8s0) cpVar.u()).f443a ? R.attr.uikitPrimary : R.attr.uikitSecondary, cpVar.w));
    }

    public static final boolean l(String str, String str2) {
        str.getClass();
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return Intrinsics.d(StringsKt.u0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String m(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? ntm0.b(CollectionsKt.b0(collection, ",\n", Separators.RETURN, Separators.RETURN, null, 56)).concat("},") : " }";
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final wbf o(riu0 riu0Var) {
        return riu0Var instanceof wmv ? ((wmv) riu0Var).o() : vbf.b;
    }

    public static final miu0 p(riu0 riu0Var) {
        return riu0Var instanceof wmv ? ((wmv) riu0Var).n() : dzj.b;
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final String s(Collection collection) {
        return ntm0.b(CollectionsKt.b0(collection, Separators.COMMA, null, null, null, 62)).concat(ntm0.b(" }"));
    }

    public static final String t(Collection collection) {
        return ntm0.b(CollectionsKt.b0(collection, Separators.COMMA, null, null, null, 62)).concat(ntm0.b("},"));
    }

    public static final tek u(xj xjVar) {
        xjVar.getClass();
        tek tekVar = (tek) w8y.d.get(xjVar);
        return tekVar == null ? uek.f(xjVar) : tekVar;
    }

    public static final oas v(j380 j380Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Long l;
        List list;
        List list2;
        List list3;
        c680 c680Var;
        Integer numValueOf = null;
        Long l2 = (j380Var == null || (list3 = j380Var.c) == null || (c680Var = (c680) CollectionsKt.firstOrNull(list3)) == null) ? null : c680Var.f3806a;
        String str = j380Var != null ? j380Var.f15818a : null;
        if (j380Var == null || (list2 = j380Var.c) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Long l3 = ((c680) it.next()).f3806a;
                arrayList.add(Long.valueOf(l3 != null ? l3.longValue() : 0L));
            }
        }
        if (j380Var == null || (list = j380Var.c) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = ((c680) it2.next()).c;
                arrayList2.add(str2 != null ? StringsKt.p0(str2, Separators.SLASH, str2) : "");
            }
        }
        if (j380Var != null && (l = j380Var.b) != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        }
        return new oas(l2, str, arrayList, arrayList2, numValueOf);
    }

    public static final wmr0 w(g2y g2yVar, j0y j0yVar) {
        g2yVar.getClass();
        Long l = j0yVar.f15703a;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = j0yVar.b;
        String str2 = str == null ? "" : str;
        Long l2 = g2yVar.b;
        Long l3 = g2yVar.f10584a;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        long jLongValue4 = l3 != null ? l3.longValue() : 0L;
        w0w w0wVarF = nkb.F(g2yVar.r);
        String str3 = g2yVar.k;
        String str4 = str3 == null ? "" : str3;
        Long l4 = g2yVar.s;
        long jLongValue5 = l4 != null ? l4.longValue() : 0L;
        String str5 = g2yVar.u;
        if (str5 == null) {
            str5 = "";
        }
        List listC = kotlin.collections.a.c(str5);
        String str6 = g2yVar.l;
        String str7 = str6 == null ? "" : str6;
        Long l5 = g2yVar.t;
        long jLongValue6 = l5 != null ? l5.longValue() : 0L;
        String str8 = g2yVar.v;
        if (str8 == null) {
            str8 = "";
        }
        List listC2 = kotlin.collections.a.c(str8);
        String str9 = g2yVar.h;
        String str10 = str9 == null ? "" : str9;
        Long l6 = g2yVar.i;
        long jLongValue7 = l6 != null ? l6.longValue() : 0L;
        List list = g2yVar.p;
        String strB0 = list != null ? CollectionsKt.b0(list, null, null, null, null, 63) : null;
        String str11 = strB0 == null ? "" : strB0;
        String str12 = g2yVar.c;
        String str13 = str12 == null ? "" : str12;
        String str14 = g2yVar.n;
        String str15 = str14 == null ? "" : str14;
        iun iunVar = iun.f15405a;
        return new wmr0(jLongValue, str2, jLongValue2, jLongValue3, jLongValue4, w0wVarF, str4, jLongValue5, listC, str7, jLongValue6, listC2, str10, jLongValue7, str11, 0, 0.0d, str13, str15, iunVar, iunVar);
    }

    public static void x(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object y(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        jf4.n(axq.n(b1j.n("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
