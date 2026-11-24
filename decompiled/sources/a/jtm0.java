package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jtm0 {
    public static final void a(mm40 mm40Var, woh wohVar, l7m0 l7m0Var, float f, lh80 lh80Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        g4m g4mVar = wohVar.b;
        fetVar2.g0(-1747087505);
        int i2 = i | (fetVar2.g(wohVar) ? 32 : 16) | (fetVar2.g(l7m0Var) ? 256 : 128) | (fetVar2.d(f) ? 2048 : 1024) | (fetVar2.g(lh80Var) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40Var2 = mm40Var;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40Var2, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ktt0.d(s5x0.L(jm40Var, 8.0f, 0.0f, 2), wohVar.f39497a, fetVar2, 0);
            if (g4mVar.f10673a.isEmpty()) {
                fetVar2.e0(139951561);
                fetVar2.r(false);
            } else {
                fetVar2.e0(139741102);
                jeb.q(o7k0.d(jm40Var, 1.0f), g4mVar, s5x0.t(8.0f, 0.0f, 2), fetVar2, 6, 0);
                fetVar2.r(false);
            }
            if (((Collection) l7m0Var.getValue()).isEmpty()) {
                fetVar2.e0(140253129);
                fetVar2.r(false);
            } else {
                fetVar2.e0(140008074);
                int i3 = i2 >> 3;
                nnw0.B(o7k0.d(jm40Var, 1.0f), (a4x) l7m0Var.getValue(), f, lh80Var, fetVar2, (i3 & 896) | 6 | (i3 & 7168));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new en80(mm40Var2, wohVar, l7m0Var, f, lh80Var, i, (byte) 4);
        }
    }

    public static final void b(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1352331233);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            v8q0.a(str, ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, i2 & 14, 24960, 110588);
            fetVar2 = fetVar;
            str3 = str2;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1064608189, new f5n0(str3, (byte) 4), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 21, i, str, str3);
        }
    }

    public static final void c(int i, fet fetVar) {
        fetVar.g0(-1379700868);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 14.0f), vgg0.a(360.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 13);
        }
    }

    public static final void d(final mm40 mm40Var, final ywv0 ywv0Var, final l7m0 l7m0Var, final int i, final float f, final int i2, final boolean z, final Function2 function2, final Function2 function3, final ugd ugdVar, final Function2 function4, fet fetVar, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        mm40Var.getClass();
        ywv0Var.getClass();
        l7m0Var.getClass();
        fetVar.g0(1480617222);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(ywv0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 = i;
            i4 |= fetVar.e(i5) ? 2048 : 1024;
        } else {
            i5 = i;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.d(f) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 = i2;
            i4 |= fetVar.e(i6) ? 131072 : 65536;
        } else {
            i6 = i2;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= fetVar.i(ugdVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i4 & 1, ((i4 & 306783379) == 306783378 && ((fetVar.i(function4) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(i5), fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(Integer.valueOf(i6), fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(new ycl(f), fetVar);
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 3670016) == 1048576);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                i7 = 4;
                c = 2;
                objP = new xuv0(ywv0Var, pz40VarF, pz40VarF2, pz40VarF3, z, l7m0Var, ywv0Var.e);
                fetVar.o0(objP);
            } else {
                i7 = 4;
                c = 2;
            }
            xuv0 xuv0Var = (xuv0) objP;
            Function2 function5 = function2 == null ? dwi0.i : function2;
            Function2 function6 = function3 == null ? dwi0.j : function3;
            Function2 function7 = function4 == null ? dwi0.k : function4;
            Function2[] function2Arr = new Function2[i7];
            function2Arr[0] = function5;
            function2Arr[1] = function6;
            function2Arr[c] = ugdVar;
            function2Arr[3] = function7;
            ugd ugdVarE = l7x.E(q3d.j(function2Arr));
            boolean zG = fetVar.g(xuv0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new tv40(xuv0Var);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v(0, ugdVarE, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.wuv0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jtm0.d(mm40Var, ywv0Var, l7m0Var, i, f, i2, z, function2, function3, ugdVar, function4, (fet) obj2, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(gxo0 gxo0Var, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(1582972141);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(gxo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            b34.h(!z, null, kzn.d(ro4.m0(300, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(300, 0, null, 6), 2), null, u1c.M(-631217387, new gcn0(gxo0Var, (byte) 6), fetVar), fetVar, 200064, 18);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(gxo0Var, z, i, (byte) 9);
        }
    }

    public static final void f(mm40 mm40Var, gxo0 gxo0Var, fet fetVar, int i) {
        gxo0Var.getClass();
        fetVar.g0(-1150521702);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(gxo0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new fno0((byte) 5);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            byte b = 14;
            if (zG || objP2 == obj) {
                objP2 = new zhl0(pz40Var, b);
                fetVar.o0(objP2);
            }
            int i3 = (i2 >> 3) & 14;
            qsm0.f(gxo0Var, zBooleanValue, (Function0) objP2, fetVar, i3);
            e(gxo0Var, ((Boolean) pz40Var.getValue()).booleanValue(), fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, gxo0Var, i, (byte) 23);
        }
    }

    public static final void g(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        str2.getClass();
        fetVar2.g0(669606285);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, 8.0f, 2.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "FifaTeamLogoTestTag"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, (i2 & 14) | 36912, 0, 32736);
            long j = qmk.q;
            str3 = str2;
            v8q0.a(str3, o2e.e0(jm40Var, "FifaTeamNameTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | 48, 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 22, i, str, str3);
        }
    }

    public static final void h(mm40 mm40Var, woh wohVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(608447900);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(wohVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            nnw0.g(o7k0.d(mm40Var, 1.0f), null, false, u1c.M(1828001394, new wis0(wohVar, s5x0.t(8.0f, 0.0f, 2), b), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uoh(mm40Var, wohVar, i, b);
        }
    }

    public static final void i(mm40 mm40Var, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-2108333841);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new jxr0(pz40Var, (byte) 11);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new jxr0(pz40Var, (byte) 12);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            zcl zclVar = qmk.f28987a;
            z1x.m(s5x0.L(mm40Var, 12.0f, 0.0f, 2), new qw3(8.0f, true, new jf4((byte) 14)), null, u1c.M(-1768257052, new e280(l7m0VarY2, function1, pz40Var, b), fetVar), u1c.M(521219365, new qjr0(l7m0VarY, (byte) 8), fetVar), null, fetVar, 27648, 36);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ugv(mm40Var, pz40Var, function1, i, (byte) 4);
        }
    }

    public static final int j(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final int k(j9o0 j9o0Var) {
        if (j9o0Var instanceof e9o0) {
            return ((e9o0) j9o0Var).b;
        }
        if (j9o0Var instanceof f9o0) {
            return ((f9o0) j9o0Var).f9164a;
        }
        if (j9o0Var.equals(g9o0.f10925a)) {
            return R.attr.uikitBackground;
        }
        if (j9o0Var.equals(h9o0.f12688a)) {
            return R.attr.uikitBackgroundContent;
        }
        if (j9o0Var.equals(i9o0.f14396a)) {
            return 0;
        }
        t9f.b();
        return 0;
    }

    public static final int l(j9o0 j9o0Var) {
        j9o0Var.getClass();
        if ((j9o0Var instanceof f9o0) || Intrinsics.d(j9o0Var, g9o0.f10925a) || Intrinsics.d(j9o0Var, h9o0.f12688a)) {
            return R.attr.uikitBackgroundContent;
        }
        if (j9o0Var instanceof e9o0) {
            return ((e9o0) j9o0Var).f7431a;
        }
        if (Intrinsics.d(j9o0Var, i9o0.f14396a)) {
            return 0;
        }
        t9f.b();
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final feu0 m(String str) {
        switch (str.hashCode()) {
            case -1807365088:
                if (str.equals("SumSum")) {
                    return feu0.f9423a;
                }
                break;
            case -1223770405:
                if (str.equals("MultSum")) {
                    return feu0.c;
                }
                break;
            case -193921541:
                if (str.equals("SumMult")) {
                    return feu0.b;
                }
                break;
            case 717644448:
                if (str.equals("MultMult")) {
                    return feu0.d;
                }
                break;
        }
        return feu0.e;
    }

    public static final boolean n(suk0 suk0Var) {
        return ((suk0Var instanceof muk0) || (suk0Var instanceof nuk0)) ? false : true;
    }

    public static boolean o(byte b) {
        return b > -65;
    }

    public static String p(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, iIndexOf);
            sb.append(q(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(q(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String q(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
            StringBuilder sbT = kng0.t(Separators.LESS_THAN, str, " threw ");
            sbT.append(e.getClass().getName());
            sbT.append(Separators.GREATER_THAN);
            return sbT.toString();
        }
    }

    public static final Object r(vby vbyVar, String str, edy edyVar, jiy jiyVar) {
        vbyVar.getClass();
        str.getClass();
        return new ody(vbyVar, edyVar, str, jiyVar.getDescriptor()).w(jiyVar);
    }

    public static final apq0 s(ypr0 ypr0Var, String str) {
        str.getClass();
        return new apq0(kng0.l(vzb.Y(ypr0Var.d), Separators.SP, str), vzb.Y(String.valueOf(ypr0Var.e)), vzb.Y(ypr0Var.f), vzb.Y(String.valueOf(ypr0Var.g)));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01db  */
    /* JADX WARN: Code duplicated, block: B:71:0x01df  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x027e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0288  */
    /* JADX WARN: Code duplicated, block: B:82:0x0298  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f7  */
    public static final a4x t(ArrayList arrayList, ulr0 ulr0Var, Map map, ctf0 ctf0Var) {
        ecb ecbVar;
        String string;
        String str;
        Object next;
        Object next2;
        Object next3;
        qkr0 qkr0Var;
        int i;
        cop0 cop0Var;
        String strA;
        int i2;
        long j;
        ce80 ce80Var;
        StringBuilder sb;
        Iterator it;
        int i3;
        String string2;
        Object next4;
        int i4;
        ee80 de80Var;
        int i5;
        map.getClass();
        ctf0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Long lValueOf = Long.valueOf(((ujr0) obj).c);
            Object arrayList2 = linkedHashMap.get(lValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ujr0 ujr0Var = (ujr0) CollectionsKt.firstOrNull((List) entry.getValue());
            String str2 = "";
            if (ujr0Var != null) {
                String str3 = ujr0Var.d;
                ecbVar = new ecb(str3, str3, rcb.d0(new ocb(ujr0Var.e), new ncb(ujr0Var.f), ujr0Var.g));
            } else {
                ecbVar = new ecb("", "", "");
            }
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                ujr0 ujr0Var2 = (ujr0) it3.next();
                Set set = (Set) map.get(Integer.valueOf(ujr0Var2.k));
                if (set == null) {
                    set = xun.f41520a;
                }
                set.getClass();
                int i6 = ujr0Var2.k;
                double d = ujr0Var2.p;
                List list = ujr0Var2.o;
                String strValueOf = String.valueOf(i6);
                String strValueOf2 = String.valueOf(ujr0Var2.f35797a);
                String str4 = str2;
                ecb ecbVar2 = ecbVar;
                long j2 = ujr0Var2.j;
                if (j2 != 0) {
                    bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j2, ".svg", bzuVarD);
                    string = ((StringBuilder) bzuVarD.b).toString();
                } else {
                    string = str4;
                }
                int i7 = ulr0Var == ulr0.TOTO_CYBER_FOOTBALL ? R.drawable.ic_cyber_sport : R.drawable.sport_new;
                rdj rdjVar = rdj.f30294a;
                lsm0 lsm0Var = ctf0Var.b;
                xm6 xm6Var = new xm6(i7, strValueOf2, string, rdj.g(new znq0(ujr0Var2.b), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56), ujr0Var2.n);
                String str5 = ujr0Var2.l;
                String str6 = ujr0Var2.m;
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        int i8 = ((qkr0) next).f28899a;
                        md80 md80Var = md80.P1;
                        str = str5;
                        if (i8 != 1) {
                            str5 = str;
                        }
                    } else {
                        str = str5;
                        next = null;
                    }
                }
                qkr0 qkr0Var2 = (qkr0) next;
                String strI = f140.i(qkr0Var2 != null ? qkr0Var2.b : 0, Separators.PERCENT);
                Iterator it5 = list.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        int i9 = ((qkr0) next2).f28899a;
                        md80 md80Var2 = md80.P1;
                        Iterator it6 = it5;
                        if (i9 != 2) {
                            it5 = it6;
                        }
                    } else {
                        next2 = null;
                    }
                }
                qkr0 qkr0Var3 = (qkr0) next2;
                String strI2 = f140.i(qkr0Var3 != null ? qkr0Var3.b : 0, Separators.PERCENT);
                Iterator it7 = list.iterator();
                do {
                    if (it7.hasNext()) {
                        next3 = it7.next();
                        i5 = ((qkr0) next3).f28899a;
                        md80 md80Var3 = md80.P1;
                    } else {
                        next3 = null;
                    }
                    qkr0Var = (qkr0) next3;
                    if (qkr0Var != null) {
                        i = qkr0Var.b;
                    } else {
                        i = 0;
                    }
                    cop0Var = new cop0(str, str6, strI, strI2, f140.i(i, Separators.PERCENT));
                    strA = lsm0Var.a(R.string.total_v2, Arrays.copyOf(new Object[]{String.valueOf(d)}, 1));
                    if (d <= 0.0d) {
                        strA = null;
                    }
                    if (strA == null) {
                        strA = str4;
                    }
                    i2 = ujr0Var2.k;
                    j = ujr0Var2.j;
                    switch (ulr0Var.ordinal()) {
                        case 0:
                            jf4.o("Unknown toto type");
                            return null;
                        case 1:
                        case 3:
                        case 6:
                        case 7:
                            String strA2 = lsm0Var.a(R.string.P1, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var4 = md80.P1;
                            qd80 qd80Var = new qd80(i2, strA2, md80Var4, set.contains(md80Var4));
                            String strA3 = lsm0Var.a(R.string.X, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var5 = md80.X;
                            qd80 qd80Var2 = new qd80(i2, strA3, md80Var5, set.contains(md80Var5));
                            String strA4 = lsm0Var.a(R.string.P2, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var6 = md80.P2;
                            ce80Var = new ce80(dyb.g0(qd80Var, qd80Var2, new qd80(i2, strA4, md80Var6, set.contains(md80Var6))));
                            de80Var = ce80Var;
                            arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                            str2 = str4;
                            it2 = it2;
                            it3 = it3;
                            ecbVar = ecbVar2;
                            break;
                        case 2:
                        case 4:
                            strA = strA;
                            if (set.isEmpty()) {
                                string2 = lsm0Var.a(R.string.toto_select_outcome, Arrays.copyOf(new Object[0], 0));
                            } else {
                                sb = new StringBuilder();
                                it = set.iterator();
                                i3 = 0;
                                while (it.hasNext()) {
                                    next4 = it.next();
                                    i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    Iterator it8 = it;
                                    sb.append(lsm0Var.a(qxw.C((md80) next4), Arrays.copyOf(new Object[0], 0)));
                                    if (i3 != set.size() - 1) {
                                        sb.append(Separators.SP);
                                    }
                                    i3 = i4;
                                    it = it8;
                                }
                                string2 = sb.toString();
                            }
                            de80Var = new de80(i2, j, string2, !set.isEmpty());
                            arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                            str2 = str4;
                            it2 = it2;
                            it3 = it3;
                            ecbVar = ecbVar2;
                            break;
                        case 5:
                        case 8:
                        case 9:
                            String strA5 = lsm0Var.a(R.string.toto_array_p1_tb, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var7 = md80.P1TB;
                            qd80 qd80Var3 = new qd80(i2, strA5, md80Var7, set.contains(md80Var7));
                            String strA6 = lsm0Var.a(R.string.toto_array_p1_tm, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var8 = md80.P1TM;
                            qd80 qd80Var4 = new qd80(i2, strA6, md80Var8, set.contains(md80Var8));
                            String strA7 = lsm0Var.a(R.string.X, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var9 = md80.X;
                            qd80 qd80Var5 = new qd80(i2, strA7, md80Var9, set.contains(md80Var9));
                            String strA8 = lsm0Var.a(R.string.toto_array_p2_tb, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var10 = md80.P2TB;
                            qd80 qd80Var6 = new qd80(i2, strA8, md80Var10, set.contains(md80Var10));
                            String strA9 = lsm0Var.a(R.string.toto_array_p2_tm, Arrays.copyOf(new Object[0], 0));
                            md80 md80Var11 = md80.P2TM;
                            ce80Var = new ce80(dyb.g0(qd80Var3, qd80Var4, qd80Var5, qd80Var6, new qd80(i2, strA9, md80Var11, set.contains(md80Var11))));
                            de80Var = ce80Var;
                            arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                            str2 = str4;
                            it2 = it2;
                            it3 = it3;
                            ecbVar = ecbVar2;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                } while (i5 != 3);
                qkr0Var = (qkr0) next3;
                if (qkr0Var != null) {
                    i = qkr0Var.b;
                } else {
                    i = 0;
                }
                cop0Var = new cop0(str, str6, strI, strI2, f140.i(i, Separators.PERCENT));
                strA = lsm0Var.a(R.string.total_v2, Arrays.copyOf(new Object[]{String.valueOf(d)}, 1));
                if (d <= 0.0d) {
                    strA = null;
                }
                if (strA == null) {
                    strA = str4;
                }
                i2 = ujr0Var2.k;
                j = ujr0Var2.j;
                switch (ulr0Var.ordinal()) {
                    case 0:
                        jf4.o("Unknown toto type");
                        return null;
                    case 1:
                    case 3:
                    case 6:
                    case 7:
                        String strA10 = lsm0Var.a(R.string.P1, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var12 = md80.P1;
                        qd80 qd80Var7 = new qd80(i2, strA10, md80Var12, set.contains(md80Var12));
                        String strA11 = lsm0Var.a(R.string.X, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var13 = md80.X;
                        qd80 qd80Var8 = new qd80(i2, strA11, md80Var13, set.contains(md80Var13));
                        String strA12 = lsm0Var.a(R.string.P2, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var14 = md80.P2;
                        ce80Var = new ce80(dyb.g0(qd80Var7, qd80Var8, new qd80(i2, strA12, md80Var14, set.contains(md80Var14))));
                        de80Var = ce80Var;
                        arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                        str2 = str4;
                        it2 = it2;
                        it3 = it3;
                        ecbVar = ecbVar2;
                        break;
                    case 2:
                    case 4:
                        strA = strA;
                        if (set.isEmpty()) {
                            string2 = lsm0Var.a(R.string.toto_select_outcome, Arrays.copyOf(new Object[0], 0));
                        } else {
                            sb = new StringBuilder();
                            it = set.iterator();
                            i3 = 0;
                            while (it.hasNext()) {
                                next4 = it.next();
                                i4 = i3 + 1;
                                if (i3 >= 0) {
                                    q3d.p();
                                    throw null;
                                }
                                Iterator it9 = it;
                                sb.append(lsm0Var.a(qxw.C((md80) next4), Arrays.copyOf(new Object[0], 0)));
                                if (i3 != set.size() - 1) {
                                    sb.append(Separators.SP);
                                }
                                i3 = i4;
                                it = it9;
                            }
                            string2 = sb.toString();
                        }
                        de80Var = new de80(i2, j, string2, !set.isEmpty());
                        arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                        str2 = str4;
                        it2 = it2;
                        it3 = it3;
                        ecbVar = ecbVar2;
                        break;
                    case 5:
                    case 8:
                    case 9:
                        String strA13 = lsm0Var.a(R.string.toto_array_p1_tb, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var15 = md80.P1TB;
                        qd80 qd80Var9 = new qd80(i2, strA13, md80Var15, set.contains(md80Var15));
                        String strA14 = lsm0Var.a(R.string.toto_array_p1_tm, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var16 = md80.P1TM;
                        qd80 qd80Var10 = new qd80(i2, strA14, md80Var16, set.contains(md80Var16));
                        String strA15 = lsm0Var.a(R.string.X, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var17 = md80.X;
                        qd80 qd80Var11 = new qd80(i2, strA15, md80Var17, set.contains(md80Var17));
                        String strA16 = lsm0Var.a(R.string.toto_array_p2_tb, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var18 = md80.P2TB;
                        qd80 qd80Var12 = new qd80(i2, strA16, md80Var18, set.contains(md80Var18));
                        String strA17 = lsm0Var.a(R.string.toto_array_p2_tm, Arrays.copyOf(new Object[0], 0));
                        md80 md80Var19 = md80.P2TM;
                        ce80Var = new ce80(dyb.g0(qd80Var9, qd80Var10, qd80Var11, qd80Var12, new qd80(i2, strA17, md80Var19, set.contains(md80Var19))));
                        de80Var = ce80Var;
                        arrayList4.add(new ae80(strValueOf, xm6Var, cop0Var, strA, de80Var));
                        str2 = str4;
                        it2 = it2;
                        it3 = it3;
                        ecbVar = ecbVar2;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
            }
            w3d.u(arrayList3, CollectionsKt.q0(kotlin.collections.a.c(ecbVar), arrayList4));
            it2 = it2;
        }
        return dyb.o0(arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    public static final zdu0 u(ceu0 ceu0Var, vby vbyVar) {
        List list;
        List list2;
        ydu0 ydu0Var;
        ceu0Var.getClass();
        vbyVar.getClass();
        try {
            String str = ceu0Var.f4231a;
            if (str == null || (list = (List) vbyVar.b(new zw3(okx.f25427a, (byte) 0), str)) == null) {
                list = iun.f15405a;
            }
        } catch (Exception unused) {
            list = iun.f15405a;
        }
        try {
            String str2 = ceu0Var.b;
            if (str2 == null || (list2 = (List) vbyVar.b(new zw3(okx.f25427a, (byte) 0), str2)) == null) {
                list2 = iun.f15405a;
            }
        } catch (Exception unused2) {
            list2 = iun.f15405a;
        }
        String str3 = ceu0Var.c;
        if (str3 == null) {
            str3 = "";
        }
        feu0 feu0VarM = m(str3);
        String str4 = ceu0Var.d;
        if (str4 == null) {
            str4 = "";
        }
        feu0 feu0VarM2 = m(str4);
        Integer num = (Integer) CollectionsKt.W(0, list);
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) CollectionsKt.W(1, list);
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = (Integer) CollectionsKt.W(2, list);
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        Integer num4 = (Integer) CollectionsKt.W(0, list2);
        int iIntValue4 = num4 != null ? num4.intValue() : -1;
        Integer num5 = (Integer) CollectionsKt.W(1, list2);
        int iIntValue5 = num5 != null ? num5.intValue() : -1;
        Integer num6 = (Integer) CollectionsKt.W(2, list2);
        int iIntValue6 = num6 != null ? num6.intValue() : -1;
        String str5 = ceu0Var.e;
        switch (str5 != null ? str5 : "") {
            case "Prematch":
                ydu0Var = ydu0.f42458a;
                break;
            case "Draw":
                ydu0Var = ydu0.e;
                break;
            case "Live":
                ydu0Var = ydu0.b;
                break;
            case "Win1":
                ydu0Var = ydu0.c;
                break;
            case "Win2":
                ydu0Var = ydu0.d;
                break;
            default:
                ydu0Var = ydu0.f;
                break;
        }
        return new zdu0(feu0VarM, feu0VarM2, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, ydu0Var);
    }

    public static int v(how0 how0Var) {
        Iterator it = how0Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
