package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ohm0 {
    public static final yeq0 A(int i) {
        if (i == 1) {
            return yeq0.f42501a;
        }
        if (i == 2) {
            return yeq0.b;
        }
        if (i == 3) {
            return yeq0.c;
        }
        if (i == 4) {
            return yeq0.d;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r45v5, types: [a.f2i] */
    /* JADX WARN: Type inference failed for: r48v3, types: [a.p0n] */
    public static final cml0 B(d0t d0tVar, String str, ArrayList arrayList, y78 y78Var, v5l0 v5l0Var, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        p6x p6xVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        r0n p0nVar;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        e4i e4iVar;
        p6x p6xVar2;
        p6x p6xVar3;
        long j = d0tVar.f5282a;
        Date date = d0tVar.P;
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        gzm ezmVar = dzm.f6947a;
        fzm fzmVar = fzm.f10414a;
        if (iOrdinal == 0) {
            fol0 fol0VarP = wdx.P(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            int i = gql0.f11739a;
            int i2 = rqsVar.g;
            boolean z6 = i2 > 0;
            boolean z7 = i2 == 1;
            boolean z8 = z6 && z7;
            boolean z9 = z6 && !z7;
            czm czmVarN = ihm0.n(d0tVar);
            czm czmVarO = ihm0.o(d0tVar);
            tym tymVarR = fxb.R(d0tVar, ctf0Var);
            tym tymVarS = fxb.S(d0tVar);
            tym tymVarT = fxb.T(d0tVar, ctf0Var);
            if (z8) {
                p6xVar = p6x.f26478a;
            } else {
                p6xVar = z9 ? p6x.b : p6x.c;
            }
            String strU = fxb.U(d0tVar, ctf0Var);
            if (kpb.e0(d0tVar)) {
                ezmVar = fzmVar;
            } else if (kpb.j0(d0tVar)) {
                ezmVar = new ezm(24, kpb.u0(d0tVar), date.getTime(), false);
            }
            return new xll0(j, fol0VarP, new qml0(new hzm(czmVarN, czmVarO, tymVarR, tymVarS, tymVarT, p6xVar, new rym(strU, ezmVar))));
        }
        xem xemVar = tem.f33827a;
        wem wemVar = wem.f39025a;
        vem vemVar = vem.f37292a;
        String str15 = "";
        Object p0nVar2 = null;
        if (iOrdinal == 1) {
            pz40 pz40Var = s6t0.f31722a;
            jol0 jol0VarT = wdx.T(d0tVar, str, arrayList, z2, z3, new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            int i3 = gql0.f11739a;
            int i4 = rqsVar.g;
            boolean z10 = i4 > 0;
            boolean z11 = i4 == 1;
            boolean z12 = z10 && z11;
            boolean z13 = z10 && !z11;
            String strS0 = qzb.s0(d0tVar);
            tym tymVarR2 = fxb.R(d0tVar, ctf0Var);
            String str16 = (tymVarR2 == null || (str8 = tymVarR2.b) == null) ? "" : str8;
            tym tymVarS2 = fxb.S(d0tVar);
            String str17 = (tymVarS2 == null || (str7 = tymVarS2.b) == null) ? "" : str7;
            String str18 = fxb.T(d0tVar, ctf0Var).b;
            tym tymVarR3 = fxb.R(d0tVar, ctf0Var);
            boolean z14 = tymVarR3 != null ? tymVarR3.d : false;
            tym tymVarS3 = fxb.S(d0tVar);
            z0n z0nVar = new z0n(strS0, 0, str16, str17, str18, fxb.T(d0tVar, ctf0Var).d, z14, tymVarS3 != null ? tymVarS3.d : false);
            String strT0 = qzb.t0(d0tVar);
            tym tymVarR4 = fxb.R(d0tVar, ctf0Var);
            String str19 = (tymVarR4 == null || (str6 = tymVarR4.c) == null) ? "" : str6;
            tym tymVarS4 = fxb.S(d0tVar);
            String str20 = (tymVarS4 == null || (str5 = tymVarS4.c) == null) ? "" : str5;
            String str21 = fxb.T(d0tVar, ctf0Var).c;
            tym tymVarR5 = fxb.R(d0tVar, ctf0Var);
            boolean z15 = tymVarR5 != null ? tymVarR5.e : false;
            tym tymVarS5 = fxb.S(d0tVar);
            z0n z0nVar2 = new z0n(strT0, 0, str19, str20, str21, fxb.T(d0tVar, ctf0Var).e, z15, tymVarS5 != null ? tymVarS5.e : false);
            p0nVar2 = kpb.j0(d0tVar) ? new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
            String strU2 = fxb.U(d0tVar, ctf0Var);
            tym tymVarR6 = fxb.R(d0tVar, ctf0Var);
            if (tymVarR6 == null || (str3 = tymVarR6.f34762a) == null) {
                str3 = "";
            }
            tym tymVarS6 = fxb.S(d0tVar);
            if (tymVarS6 != null && (str4 = tymVarS6.f34762a) != null) {
                str15 = str4;
            }
            String str22 = fxb.T(d0tVar, ctf0Var).f34762a;
            if (z12) {
                xemVar = vemVar;
            } else if (z13) {
                xemVar = wemVar;
            }
            return new bml0(j, jol0VarT, new wnl0(z0nVar, z0nVar2, strU2, p0nVar2, str3, str15, str22, xemVar));
        }
        if (iOrdinal == 2) {
            boolean z16 = true;
            iol0 iol0VarS = wdx.S(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            boolean zA0 = kpb.a0(d0tVar, z, z4);
            boolean zF0 = kpb.f0(d0tVar, z);
            int i5 = gql0.f11739a;
            int i6 = rqsVar.g;
            boolean z17 = i6 > 0;
            boolean z18 = i6 == 1;
            boolean z19 = z17 && z18;
            if (!z17 || z18) {
                z16 = false;
            }
            String strS1 = qzb.s0(d0tVar);
            tym tymVarR7 = fxb.R(d0tVar, ctf0Var);
            String str23 = (tymVarR7 == null || (str14 = tymVarR7.b) == null) ? "" : str14;
            tym tymVarS7 = fxb.S(d0tVar);
            String str24 = (tymVarS7 == null || (str13 = tymVarS7.b) == null) ? "" : str13;
            String str25 = fxb.T(d0tVar, ctf0Var).b;
            tym tymVarR8 = fxb.R(d0tVar, ctf0Var);
            boolean z20 = tymVarR8 != null ? tymVarR8.d : false;
            tym tymVarS8 = fxb.S(d0tVar);
            a1n a1nVar = new a1n(strS1, null, 0, str23, str24, str25, fxb.T(d0tVar, ctf0Var).d, z20, tymVarS8 != null ? tymVarS8.d : false);
            String strT1 = qzb.t0(d0tVar);
            tym tymVarR9 = fxb.R(d0tVar, ctf0Var);
            String str26 = (tymVarR9 == null || (str12 = tymVarR9.c) == null) ? "" : str12;
            tym tymVarS9 = fxb.S(d0tVar);
            String str27 = (tymVarS9 == null || (str11 = tymVarS9.c) == null) ? "" : str11;
            String str28 = fxb.T(d0tVar, ctf0Var).c;
            tym tymVarR10 = fxb.R(d0tVar, ctf0Var);
            boolean z21 = tymVarR10 != null ? tymVarR10.e : false;
            tym tymVarS10 = fxb.S(d0tVar);
            a1n a1nVar2 = new a1n(strT1, null, 0, str26, str27, str28, fxb.T(d0tVar, ctf0Var).e, z21, tymVarS10 != null ? tymVarS10.e : false);
            String strU3 = fxb.U(d0tVar, ctf0Var);
            tym tymVarR11 = fxb.R(d0tVar, ctf0Var);
            if (tymVarR11 == null || (str9 = tymVarR11.f34762a) == null) {
                str9 = "";
            }
            tym tymVarS11 = fxb.S(d0tVar);
            if (tymVarS11 != null && (str10 = tymVarS11.f34762a) != null) {
                str15 = str10;
            }
            String str29 = fxb.T(d0tVar, ctf0Var).f34762a;
            if (z19) {
                xemVar = vemVar;
            } else if (z16) {
                xemVar = wemVar;
            }
            if (zF0) {
                p0nVar2 = e2i.f7087a;
            } else if (zA0) {
                p0nVar2 = c2i.f3624a;
            }
            String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (kpb.e0(d0tVar)) {
                p0nVar = q0n.f27908a;
            } else {
                p0nVar = kpb.j0(d0tVar) ? new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), false, 24) : o0n.f24435a;
            }
            return new aml0(j, iol0VarS, new onl0(p0nVar2, xemVar, p0nVar, a1nVar, a1nVar2, str9, str15, str29, strU3, strA));
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            gol0 gol0VarQ = wdx.Q(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            int i7 = gql0.f11739a;
            int i8 = rqsVar.g;
            boolean z22 = i8 > 0;
            boolean z23 = i8 == 1;
            boolean z24 = z22 && z23;
            boolean z25 = z22 && !z23;
            czm czmVarN2 = ihm0.n(d0tVar);
            czm czmVarO2 = ihm0.o(d0tVar);
            tym tymVarR12 = fxb.R(d0tVar, ctf0Var);
            tym tymVarS12 = fxb.S(d0tVar);
            tym tymVarT2 = fxb.T(d0tVar, ctf0Var);
            if (z24) {
                p6xVar3 = p6x.f26478a;
            } else {
                p6xVar3 = z25 ? p6x.b : p6x.c;
            }
            p6x p6xVar4 = p6xVar3;
            String strA2 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            String strU4 = fxb.U(d0tVar, ctf0Var);
            if (kpb.e0(d0tVar)) {
                ezmVar = fzmVar;
            } else if (kpb.j0(d0tVar)) {
                ezmVar = new ezm(24, kpb.u0(d0tVar), date.getTime(), false);
            }
            return new yll0(j, gol0VarQ, new yml0(new jzm(czmVarN2, czmVarO2, tymVarR12, tymVarS12, tymVarT2, p6xVar4, new sym(strA2, strU4, ezmVar))));
        }
        long j2 = d0tVar.f5282a;
        n0x n0xVar = new n0x(dtb.F(str));
        String strH = kpb.H(d0tVar, y78Var, z5);
        boolean zE0 = kpb.e0(d0tVar);
        String strA3 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
        boolean zB0 = kpb.b0(d0tVar, z);
        boolean zD0 = kpb.d0(d0tVar, z);
        boolean zA1 = kpb.a0(d0tVar, z, z4);
        boolean zF1 = kpb.f0(d0tVar, z);
        if (kpb.j0(d0tVar)) {
            long jU0 = kpb.u0(d0tVar);
            fgm fgmVar = fgm.f9498a;
            e4iVar = new e4i(24, jU0, date.getTime(), false);
        } else {
            e4iVar = null;
        }
        hol0 hol0VarR = wdx.R(d0tVar, str, arrayList, z2, strH, e4iVar, z3, strA3, zE0, str2, zB0, zD0, zA1, zF1);
        int i9 = gql0.f11739a;
        int i10 = rqsVar.g;
        boolean z26 = i10 > 0;
        boolean z27 = i10 == 1;
        boolean z28 = z26 && z27;
        boolean z29 = z26 && !z27;
        czm czmVarN3 = ihm0.n(d0tVar);
        czm czmVarO3 = ihm0.o(d0tVar);
        tym tymVarR13 = fxb.R(d0tVar, ctf0Var);
        tym tymVarS13 = fxb.S(d0tVar);
        tym tymVarT3 = fxb.T(d0tVar, ctf0Var);
        if (z28) {
            p6xVar2 = p6x.f26478a;
        } else {
            p6xVar2 = z29 ? p6x.b : p6x.c;
        }
        return new zll0(j2, n0xVar, hol0VarR, new gnl0(new izm(czmVarN3, czmVarO3, tymVarR13, tymVarS13, tymVarT3, p6xVar2)));
    }

    public static final lc00 C(mtu0 mtu0Var, vby vbyVar) {
        ftu0 ftu0Var;
        ftu0 ftu0Var2;
        List list;
        vbyVar.getClass();
        jiy jiyVarSerializer = ltu0.Companion.serializer();
        String str = mtu0Var.b;
        if (str == null) {
            str = "";
        }
        ltu0 ltu0Var = (ltu0) vbyVar.b(jiyVarSerializer, str);
        lc00 lc00VarB = kotlin.collections.a.b();
        ctu0 ctu0Var = ltu0Var.f20643a;
        if (ctu0Var != null && (list = ctu0Var.f4961a) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lc00VarB.add(y((ftu0) it.next(), utu0.f36274a));
            }
        }
        itu0 itu0Var = ltu0Var.b;
        if (itu0Var != null && (ftu0Var2 = itu0Var.f15369a) != null) {
            lc00VarB.add(y(ftu0Var2, utu0.b));
        }
        itu0 itu0Var2 = ltu0Var.c;
        if (itu0Var2 != null && (ftu0Var = itu0Var2.f15369a) != null) {
            lc00VarB.add(y(ftu0Var, utu0.c));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static boolean D(byte b) {
        return b > -65;
    }

    public static final void a(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-480027157);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var, mdmVar, function1, i, (byte) 10);
        }
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(-2086007033);
        if (fetVar.U(i & 1, i != 0)) {
            j0x.l(iym0.r((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L)), 48, fetVar, o7k0.d(jm40.b, 1.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i, (byte) 7);
        }
    }

    public static final void c(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-427571329);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 236.0f + fH0;
            float f2 = 56.0f + fH0;
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g7o0(l7m0Var, (byte) 17);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new g7o0(l7m0Var, (byte) 18);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            m0x0.d(null, f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(-1518680788, new lkb(l7m0Var, f, f2, function1, (byte) 4), fetVar), u1c.M(-1442815438, new fqk(l7m0VarY2, function1, l7m0Var, qdzVar.b(((gbp0) l7m0VarY2.getValue()).f11026a.getClass().getSimpleName(), new ofo0((byte) 25), fetVar, (i2 << 3) & 896), qdzVar, function2, l7m0VarY), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 10);
        }
    }

    public static final void d(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1687420304);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((gbp0) l7m0Var.getValue()).b.isEmpty()) {
            fetVar.e0(-1640075886);
            fetVar.r(false);
        } else {
            fetVar.e0(-1640831418);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            fetVar.e0(1886739295);
            a4x a4xVar = ((gbp0) l7m0Var.getValue()).b;
            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new yvh0(rsm0.w(((fbp0) it.next()).b, 0, fetVar), bwh0.f3325a));
            }
            fetVar.r(false);
            i4 i4VarR0 = dyb.r0(arrayList);
            dxh0 dxh0Var = ((gbp0) l7m0Var.getValue()).c;
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g7o0(l7m0Var, (byte) 21);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new coo0(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            ibc.n(mm40VarJ, i4VarR0, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar, 384, 16);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, (byte) 23);
        }
    }

    public static final void e(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1361658389);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pz40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            x7z x7zVar = new x7z(1.0f, true);
            String str = ((zar0) pz40Var.getValue()).f44081a;
            pz40 pz40Var2 = s6t0.f31722a;
            v8q0.a(str, x7zVar, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            jm40 jm40Var = jm40.b;
            v8q0.a(((zar0) pz40Var.getValue()).b, o7k0.s(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 52.0f), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(((zar0) pz40Var.getValue()).c, o7k0.s(s5x0.N(s5x0.N(jm40Var, 1.0f, 0.0f, 0.0f, 0.0f, 14), 4.0f, 0.0f, 0.0f, 0.0f, 14), 52.0f), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 9);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-417432016);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(w2dVarW0);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (zG || objP == obj) {
                objP = cjx.V(jm40Var, w2dVarW0, null);
                fetVar.o0(objP);
            }
            mm40 mm40Var3 = (mm40) objP;
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ojr0(l7m0Var, (byte) 11);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP2, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new ojr0(l7m0Var, (byte) 12);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
            Object[] objArr3 = new Object[0];
            boolean z3 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new ojr0(l7m0Var, (byte) 13);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP4, fetVar);
            wom womVarF = mom.f(fetVar);
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = jgk0.b(new ok7(w2dVarW0, (byte) 9));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var2 = (l7m0) objP5;
            int i4 = i2 & 896;
            boolean z4 = i4 == 256;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == obj) {
                objP6 = new nas0(function1, (byte) 3);
                fetVar.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean z5 = i4 == 256;
            Object objP7 = fetVar.P();
            if (z5 || objP7 == obj) {
                objP7 = new nas0(function1, (byte) 4);
                fetVar.o0(objP7);
            }
            v3c.z(function0, (Function0) objP7, null, fetVar, 0, 4);
            v2n0.c(jm40Var, w2dVarW0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(490732879, new npb0(w2dVarW0, l7m0VarY2, l7m0VarY, l7m0Var2, function1, (byte) 1), fetVar), null, u1c.M(1892276714, new us4(womVarF, w2dVarW0, function1, l7m0VarY3, mm40Var3, xczVarA, l7m0VarY2), fetVar), fetVar, 1600582, 32);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void g(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1326999550);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zlv0 zlv0Var = (zlv0) l7m0Var.getValue();
            if (zlv0Var != null) {
                if (zlv0Var instanceof ylv0) {
                    fetVar.e0(-358712180);
                    b(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = zlv0Var instanceof xlv0;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1764887395);
                        a(ir8Var.b(jm40Var, gqw0.e), ((xlv0) zlv0Var).e, function1, fetVar, i2 & 896);
                        fetVar.r(false);
                    } else if (zlv0Var instanceof wlv0) {
                        fetVar.e0(1765143889);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        a4x a4xVar = ((wlv0) zlv0Var).e;
                        boolean z2 = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new szu0(function1, (byte) 8);
                            fetVar.o0(objP);
                        }
                        gkb.c(a4xVar, mm40VarD, (Function1) objP, R.string.match_reviewe, fetVar, 48, 0);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-358713945, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i, (byte) 6);
        }
    }

    public static final void h(cp cpVar, String str) {
        int length = str.length();
        yfu0 yfu0Var = cpVar.u;
        if (length == 0) {
            ((tsn0) yfu0Var).j.setVisibility(8);
        } else {
            ((tsn0) yfu0Var).j.setText(str);
            ((tsn0) yfu0Var).j.setVisibility(0);
        }
    }

    public static final void i(cp cpVar, zsn0 zsn0Var) {
        DsTimer dsTimer = ((tsn0) cpVar.u).u;
        dsTimer.setTimerType(zsn0Var.b);
        dsTimer.setVisibility(zsn0Var.d ? 0 : 8);
        dsTimer.setTime(zsn0Var.f44913a);
        dsTimer.setTimeDirection(zsn0Var.c);
        if (zsn0Var.e) {
            dsTimer.d();
        }
    }

    public static byte j(long j) {
        x0x.x("out of range: %s", j, (j >> 8) == 0);
        return (byte) j;
    }

    public static final String k(long j) {
        BigDecimal scale = new BigDecimal(String.valueOf(j / 1000.0d)).setScale(2, RoundingMode.HALF_UP);
        return ohs0.n((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString(), "k");
    }

    public static final d4d l(long j, long j2) {
        return j > j2 ? d4d.STATIC_GAMES_TEXT_VICTORY : d4d.STATIC_WHITE;
    }

    public static String m(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
        }
        return sb.toString();
    }

    public static final ArrayList x(List list) {
        list.getClass();
        List<twr0> listA0 = CollectionsKt.A0(list, new tgo0((byte) 20));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (twr0 twr0Var : listA0) {
            int i2 = twr0Var.f34666a;
            int i3 = twr0Var.b;
            int i4 = i2 - i;
            if (i4 > 0) {
                arrayList.add(new fxr0(i4 * kxr0.f19071a));
                i += i4;
            }
            arrayList.add(new xwr0(twr0Var.c, i3));
            i += i3;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final ttu0 y(ftu0 ftu0Var, utu0 utu0Var) {
        ?? arrayList;
        String str = ftu0Var.f10132a;
        if (str == null) {
            str = "";
        }
        List list = ftu0Var.b;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((zsu0) it.next()).f44924a;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new ttu0(utu0Var, str, arrayList);
    }

    public static final khm0 z(nhm0 nhm0Var) {
        Integer num = nhm0Var.f23540a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = nhm0Var.b;
        if (str == null) {
            str = "";
        }
        return new khm0(iIntValue, str);
    }

    public abstract boolean n();

    public abstract int o();

    public abstract long p();

    public abstract String q();

    public abstract String r();

    public abstract boolean s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();
}
