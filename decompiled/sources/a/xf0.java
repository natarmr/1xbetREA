package a;

import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yje[] f40767a = new yje[0];
    public static final p73 b = new p73(Float.POSITIVE_INFINITY);
    public static final q73 c = new q73(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final r73 d = new r73(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final s73 e = new s73(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final p73 f = new p73(Float.NEGATIVE_INFINITY);
    public static final q73 g = new q73(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final r73 h = new r73(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final s73 i = new s73(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ugd j = new ugd(-897555462, false, new qbd((byte) 15));
    public static final ugd k = new ugd(1245955596, false, new chd(6));
    public static final ugd l = new ugd(-1077167628, false, new fhd(20));
    public static final ugd m;
    public static final ugd n;
    public static final ugd o;
    public static final ugd p;
    public static final ugd q;
    public static final int[][] r;
    public static final int[][] s;
    public static final int[][] t;
    public static final int[][] u;
    public static final byte[] v;
    public static final int[] w;

    static {
        new ugd(908092321, false, new chd((byte) 20));
        m = new ugd(-746959531, false, new lhd((byte) 17));
        n = new ugd(1443910782, false, new lhd((byte) 18));
        o = new ugd(-1562376949, false, new lhd((byte) 19));
        p = new ugd(-8535694, false, new thd((byte) 1));
        q = new ugd(-329080570, false, new thd((byte) 2));
        r = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        s = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        t = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
        u = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
        v = new byte[1024];
        w = new int[1024];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r1v21, types: [a.jm40] */
    public static final void A(mm40 mm40Var, wk5 wk5Var, Function1 function1, fet fetVar, int i2) {
        ?? r18;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1066465376);
        int i3 = i2 | 6 | (fetVar2.g(wk5Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            oyq0 oyq0VarD = ob3.d(0, 7, fetVar2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = o050.X(jm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            imm immVar = wk5Var.f39292a;
            imm immVar2 = wk5Var.b;
            int i4 = i3 & 896;
            boolean z4 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new nrj0(function1, (byte) 11);
                fetVar2.o0(objP);
            }
            ccq0.b(oyq0VarD, immVar, immVar2, (Function0) objP, fetVar2, 0);
            fetVar2 = fetVar2;
            mi5 mi5Var = wk5Var.c;
            if (mi5Var != null) {
                if (mi5Var instanceof ki5) {
                    fetVar2.e0(-1269765439);
                    d(oyq0VarD, (ki5) mi5Var, wk5Var.d, function1, fetVar2, 6 | (57344 & (i3 << 6)));
                    fetVar2.r(false);
                    z2 = true;
                } else {
                    z = false;
                    if (mi5Var instanceof li5) {
                        fetVar2.e0(-1269755040);
                        n0q n0qVar = o7k0.c;
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
                        mdm mdmVar = ((li5) mi5Var).f20087a;
                        boolean z5 = i4 == 256;
                        Object objP2 = fetVar2.P();
                        if (z5 || objP2 == cl5Var) {
                            objP2 = new nrj0(function1, (byte) 13);
                            fetVar2.o0(objP2);
                        }
                        jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, 0, 5);
                        z2 = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z2);
                r18 = jm40Var;
            } else {
                z = false;
            }
            throw b1j.f(-1269769445, fetVar2, z);
        }
        fetVar2.X();
        r18 = mm40Var;
        ?? r1 = r18;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0((mm40) r1, (Object) wk5Var, function1, i2, (byte) 25);
        }
    }

    public static final void B(y5e0 y5e0Var, fet fetVar, int i2) {
        fetVar.g0(-1300762075);
        int i3 = (fetVar.g(y5e0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1805711643, new j5d0(y5e0Var, (pz40) objP, (byte) 8), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nrc0(y5e0Var, i2, (byte) 19);
        }
    }

    public static final void C(mm40 mm40Var, l4p0 l4p0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        l4p0Var.getClass();
        function2.getClass();
        fetVar2.g0(-793508875);
        int i3 = i2 | 6 | (fetVar2.g(l4p0Var) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarR, s6t0.b().f33626a.getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            imm immVar = l4p0Var.f19420a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new gno0(function2, (byte) 28);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new coo0(function2, (byte) 3);
                fetVar2.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            eie eieVar = l4p0Var.b;
            if (eieVar instanceof mhe) {
                fetVar2.e0(1078684630);
                u(null, ((mhe) eieVar).f21788a, function1, u1c.M(1363237300, new nhl0(eieVar, function2, (byte) 17), fetVar2), fetVar2, i4 | 3072);
                function2 = function1;
                fetVar2.r(false);
            } else if (eieVar instanceof vhe) {
                fetVar2.e0(1835918930);
                z(null, (vhe) eieVar, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!(eieVar instanceof she)) {
                    throw b1j.f(1835909130, fetVar2, false);
                }
                fetVar2.e0(1835921489);
                k(null, ((she) eieVar).f32206a, function2, fetVar2, i4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, l4p0Var, function2, i2, (byte) 10);
        }
    }

    public static final void D(mm40 mm40Var, mhe mheVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(958646111);
        int i3 = i2 | 6 | (fetVar.g(mheVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 24.0f);
            boolean z = false;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 896) == 256) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new itn0(mheVar, function1, (byte) 18);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, mheVar, function1, i2, (byte) 11);
        }
    }

    public static final void E(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1134494733);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(jm40Var, 80.0f), gt40.b);
            tj30 tj30VarC = zq8.c(gqw0.g, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
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
            v8q0.a(str, o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 0.0f, 0.0f, 14), "DISCIPLINE_DETAILS_DEFAULT_TOOLBAR_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 29, i2, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x022b  */
    public static void F(p68 p68Var, int i2, ubu0 ubu0Var, int i3, cf60 cf60Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte[][] bArr = (byte[][]) cf60Var.d;
        int i12 = cf60Var.b;
        int i13 = cf60Var.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = r[0].length;
        K(0, 0, cf60Var);
        int i14 = i12 - length;
        K(i14, 0, cf60Var);
        K(0, i14, cf60Var);
        J(0, 7, cf60Var);
        int i15 = i12 - 8;
        J(i15, 7, cf60Var);
        J(0, i15, cf60Var);
        L(7, 0, cf60Var);
        int i16 = i13 - 8;
        L(i16, 0, cf60Var);
        int i17 = i13 - 7;
        L(7, i17, cf60Var);
        if (cf60Var.o(8, i16) == 0) {
            throw new lrv0();
        }
        cf60Var.p(8, i16, 1);
        byte b2 = ubu0Var.f35401a;
        if (b2 < 2) {
            i4 = 0;
        } else {
            i4 = 0;
            int[] iArr = t[b2 - 1];
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 >= 0 && O(cf60Var.o(i21, i19))) {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= 5) {
                                    break;
                                }
                                int[] iArr2 = s[i24];
                                int i25 = i24;
                                int i26 = 0;
                                for (int i27 = 5; i26 < i27; i27 = 5) {
                                    int i28 = i26;
                                    cf60Var.p(i22 + i26, i23 + i25, iArr2[i28]);
                                    i26 = i28 + 1;
                                    length3 = length3;
                                }
                                i24 = i25 + 1;
                            }
                        }
                        i20++;
                        bArr = bArr;
                        i12 = i12;
                        length3 = length3;
                    }
                }
                i18++;
                bArr = bArr;
                i12 = i12;
            }
        }
        byte[][] bArr3 = bArr;
        int i29 = i12;
        int i30 = 8;
        while (i30 < i15) {
            int i31 = i30 + 1;
            int i32 = i31 % 2;
            if (O(cf60Var.o(i30, 6))) {
                cf60Var.p(i30, 6, i32);
            }
            if (O(cf60Var.o(6, i30))) {
                cf60Var.p(6, i30, i32);
            }
            i30 = i31;
        }
        p68 p68Var2 = new p68();
        if (i3 < 0 || i3 >= 8) {
            throw new lrv0("Invalid mask pattern");
        }
        int iC = (hne.c(i2) << 3) | i3;
        p68Var2.b(iC, 5);
        p68Var2.b(G(iC, 1335), 10);
        p68 p68Var3 = new p68();
        p68Var3.b(21522, 15);
        if (p68Var2.b != p68Var3.b) {
            jf4.o("Sizes don't match");
            return;
        }
        int i33 = i4;
        while (true) {
            int[] iArr3 = p68Var2.f26442a;
            if (i33 >= iArr3.length) {
                break;
            }
            iArr3[i33] = iArr3[i33] ^ p68Var3.f26442a[i33];
            i33++;
        }
        if (p68Var2.b != 15) {
            throw new lrv0("should not happen but we got: " + p68Var2.b);
        }
        int i34 = i4;
        while (true) {
            int i35 = p68Var2.b;
            if (i34 >= i35) {
                break;
            }
            boolean zD = p68Var2.d((i35 - 1) - i34);
            int[] iArr4 = u[i34];
            int i36 = iArr4[i4];
            byte[] bArr4 = bArr3[iArr4[1]];
            byte b3 = zD ? (byte) 1 : (byte) 0;
            bArr4[i36] = b3;
            if (i34 < 8) {
                i11 = (i29 - i34) - 1;
                i10 = 8;
            } else {
                i10 = (i34 - 8) + i17;
                i11 = 8;
            }
            bArr3[i10][i11] = b3;
            i34++;
        }
        if (b2 >= 7) {
            p68 p68Var4 = new p68();
            p68Var4.b(b2, 6);
            p68Var4.b(G(b2, 7973), 12);
            if (p68Var4.b != 18) {
                throw new lrv0("should not happen but we got: " + p68Var4.b);
            }
            int i37 = 17;
            for (int i38 = i4; i38 < 6; i38++) {
                for (int i39 = i4; i39 < 3; i39++) {
                    boolean zD2 = p68Var4.d(i37);
                    i37--;
                    int i40 = (i13 - 11) + i39;
                    byte[] bArr5 = bArr3[i40];
                    byte b4 = zD2 ? (byte) 1 : (byte) 0;
                    bArr5[i38] = b4;
                    bArr3[i38][i40] = b4;
                }
            }
        }
        int i41 = i29 - 1;
        int i42 = i13 - 1;
        int i43 = i4;
        int i44 = -1;
        while (i41 > 0) {
            if (i41 == 6) {
                i41--;
            }
            while (i42 >= 0 && i42 < i13) {
                for (int i45 = i4; i45 < 2; i45++) {
                    int i46 = i41 - i45;
                    if (O(cf60Var.o(i46, i42))) {
                        if (i43 < p68Var.b) {
                            boolean zD3 = p68Var.d(i43);
                            i43++;
                            i5 = zD3;
                        } else {
                            i5 = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i6 = i42 + i46;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 1:
                                    i7 = i42 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 2:
                                    i7 = i46 % 3;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 3:
                                    i7 = (i42 + i46) % 3;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 4:
                                    i7 = ((i46 / 3) + (i42 / 2)) & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 5:
                                    int i47 = i42 * i46;
                                    i7 = (i47 % 3) + (i47 & 1);
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 6:
                                    int i48 = i42 * i46;
                                    i8 = i48 & 1;
                                    i9 = i48 % 3;
                                    i6 = i9 + i8;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 7:
                                    i9 = (i42 * i46) % 3;
                                    i8 = (i42 + i46) & 1;
                                    i6 = i9 + i8;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                default:
                                    jf4.o(twn.m(i3, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        bArr3[i42][i46] = (byte) i5;
                    }
                }
                i42 += i44;
            }
            i44 = -i44;
            i42 += i44;
            i41 -= 2;
        }
        if (i43 == p68Var.b) {
            return;
        }
        throw new lrv0("Not all bits consumed: " + i43 + '/' + p68Var.b);
    }

    public static int G(int i2, int i3) {
        if (i3 == 0) {
            jf4.o("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i2 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i4) {
            iNumberOfLeadingZeros2 ^= i3 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i4);
        }
        return iNumberOfLeadingZeros2;
    }

    public static final h0a H(String str, String str2, y35 y35Var) {
        str.getClass();
        ArrayList arrayListL = q3d.l(str);
        if (str2 != null) {
            arrayListL.add(str2);
        }
        return new h0a(arrayListL, y35Var);
    }

    public static boolean I(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = I(file2) && z;
        }
        return z;
    }

    public static void J(int i2, int i3, cf60 cf60Var) throws lrv0 {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!O(cf60Var.o(i5, i3))) {
                throw new lrv0();
            }
            cf60Var.p(i5, i3, 0);
        }
    }

    public static void K(int i2, int i3, cf60 cf60Var) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = r[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                cf60Var.p(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void L(int i2, int i3, cf60 cf60Var) throws lrv0 {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!O(cf60Var.o(i2, i5))) {
                throw new lrv0();
            }
            cf60Var.p(i2, i5, 0);
        }
    }

    public static final h0a M(zo zoVar, zo zoVar2) {
        String strE = zoVar2 != null ? zoVar2.f8539a.e() : null;
        y35 y35Var = ((jy9) zoVar.c).f17348a;
        String strE2 = zoVar.f8539a.e();
        strE2.getClass();
        return H(strE2, strE, y35Var);
    }

    public static ApplicationLoader N() {
        ApplicationLoader applicationLoader = ApplicationLoader.v1;
        if (applicationLoader != null) {
            return applicationLoader;
        }
        Intrinsics.h("instance");
        throw null;
    }

    public static boolean O(int i2) {
        return i2 == -1;
    }

    public static boolean P() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return kotlin.text.c.o(Build.DEVICE, "m55xq");
    }

    public static PorterDuff.Mode Q(n78 n78Var) {
        if (n78Var == null) {
            return null;
        }
        switch (o78.f24773a[n78Var.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    public static final qp30 R(vw4 vw4Var, ctf0 ctf0Var, HistoryTypeModel historyTypeModel, String str, List list, boolean z, BetHistoryScreenModel betHistoryScreenModel, boolean z2, boolean z3, List list2, boolean z4, boolean z5, List list3) {
        Object next;
        boolean z6;
        Object obj;
        boolean z7;
        int i2;
        List list4;
        hom0 hom0Var;
        x680 x680Var;
        ctf0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        iy4 iy4Var = vw4Var.g;
        long j2 = vw4Var.h;
        int i3 = vw4Var.r;
        q4f q4fVar = vw4Var.b;
        List list5 = vw4Var.T;
        iy4 iy4Var2 = iy4.b;
        boolean z8 = (iy4Var == iy4Var2 && historyTypeModel == HistoryTypeModel.AUTO && q4fVar == q4f.d) || (iy4Var == iy4Var2 && historyTypeModel == HistoryTypeModel.AUTO);
        Object[] objArr = {vw4Var.f38130a};
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(objArr, 1));
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xco) next).f40655a != vw4Var.O);
        xco xcoVar = (xco) next;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z6 = z8;
                obj = null;
                break;
            }
            Object next2 = it2.next();
            ueo ueoVar = (ueo) next2;
            z6 = z8;
            z0w z0wVar = (z0w) CollectionsKt.firstOrNull(list5);
            if (z0wVar != null) {
                if (ueoVar.f35538a == z0wVar.v) {
                    obj = next2;
                    break;
                }
            }
            z8 = z6;
            it2 = it2;
        }
        ueo ueoVar2 = (ueo) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Iterator it4 = it3;
            if (((xco) next3).e) {
                arrayList.add(next3);
            }
            it3 = it4;
        }
        boolean zK = lmc.K(arrayList, list5);
        String strI = jwb.I(vw4Var, ctf0Var, list3);
        String str2 = vw4Var.f38130a;
        String strQ = w6x.q(bfb.R(vw4Var.d, ctf0Var), " · \u200e", strA);
        int iOrdinal = iy4Var.ordinal();
        if (iOrdinal != 0) {
            z7 = zK;
            if (iOrdinal == 1) {
                i2 = R.string.autobet_waiting;
            } else if (iOrdinal == 2) {
                i2 = R.string.autobet_dropped;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                i2 = R.string.accepted;
            }
        } else {
            z7 = zK;
            i2 = R.string.error;
        }
        int iOrdinal2 = iy4Var.ordinal();
        if (iOrdinal2 != 0) {
            list4 = list5;
            if (iOrdinal2 == 1) {
                hom0Var = hom0.g;
            } else if (iOrdinal2 == 2) {
                hom0Var = hom0.e;
            } else {
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                hom0Var = hom0.f13401a;
            }
        } else {
            list4 = list5;
            hom0Var = hom0.f;
        }
        nom0 nom0Var = new nom0(lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0)), hom0Var);
        lc00 lc00VarB = kotlin.collections.a.b();
        if (strI.length() > 0) {
            lc00VarB.add(new tso0("TOP_CHAMP_ID", strI, bro0.f3088a));
        }
        if (z7) {
            lc00VarB.add(new tso0("AUTO_SUB_ID", lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)), xqo0.f41332a));
        }
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        so30 so30Var = !z6 ? null : new so30(R.drawable.ic_glyph_cancel, HistoryMenuItem.l);
        tvw tvwVarV = uvw.v(i3, j2, q4fVar);
        String str3 = vw4Var.z;
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(ahy.Z(i3, vw4Var.t, ctf0Var));
        if (!z) {
            lc00VarB2.add(new x680("COEF_ID", lsm0Var.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), new auy(kng0.k("\u200e", vw4Var.i))));
        }
        double d2 = vw4Var.f;
        String strA2 = lsm0Var.a(R.string.pf_bet, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d2, p3u0.c);
        pz40 pz40Var = s6t0.f31722a;
        lc00VarB2.add(new x680("BET_SUM_ID", strA2, new wty(strC, str, s6t0.b().f33626a.getTextPrimary())));
        if (z || q4fVar == q4f.d) {
            boolean z9 = vw4Var.B;
            iy4 iy4Var3 = iy4.b;
            if (iy4Var == iy4Var3 && z9) {
                x680Var = new x680("DROP_ID", lsm0Var.a(R.string.when_score_change_no_colon, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var.a(R.string.drop_on, Arrays.copyOf(new Object[0], 0))));
            } else {
                x680Var = (iy4Var != iy4Var3 || z9) ? null : new x680("DROP_ID", lsm0Var.a(R.string.when_score_change_no_colon, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var.a(R.string.not_drop_on, Arrays.copyOf(new Object[0], 0))));
            }
            lc00VarB2.add(x680Var);
        }
        i4 i4VarR1 = dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB2)));
        String str4 = vw4Var.D;
        l3w l3wVar = (iy4Var != iy4.c || str4.length() <= 0) ? null : new l3w(lsm0Var.a(R.string.cancellation_reason, Arrays.copyOf(new Object[0], 0)), str4, j8x.f16108a);
        kb30 kb30VarA = zvw.A(vw4Var, z, j2);
        boolean z10 = vw4Var.p;
        ec ecVar = new ec(z, list4.size() == 1);
        String str5 = vw4Var.i;
        String strR = "";
        String strS = z ? wvb.S(vw4Var, betHistoryScreenModel) : "";
        if (z) {
            String str6 = xcoVar != null ? xcoVar.b : null;
            String str7 = str6 == null ? "" : str6;
            int i4 = ueoVar2 != null ? ueoVar2.c : 0;
            if (list4.size() != 1) {
                i4 = -1;
            }
            strR = kotlin.text.c.r(list4.size() == 1 ? ckb.S((z0w) CollectionsKt.U(list4), ueoVar2, str7, z3, z4, z5) : "", " \n", (!z2 || i4 == -1) ? ". " : ua80.e(i4, ". [Р :", "]: "), false);
        }
        return new qp30(str2, str2, strQ, tvwVarV, str3, z10, i4VarR0, ecVar, kb30VarA, strS, strR, str5, i4VarR1, l3wVar, nom0Var, "", so30Var, null);
    }

    public static final String S(String str) {
        String str2;
        String string;
        bh30 bh30VarB = new Regex("\\((.*?)\\)").b(str);
        return (bh30VarB == null || (str2 = (String) CollectionsKt.d0(bh30VarB.a())) == null || (string = StringsKt.u0(str2).toString()) == null) ? "" : kotlin.text.c.r(string, Separators.COMMA, ", ", false);
    }

    public static final void T(wf0 wf0Var) {
        wf0Var.getClass();
        int i2 = wf0Var.b;
        String str = wf0Var.c;
        if (i2 != 0) {
            if (str == null) {
                str = "";
            }
            throw new cii0(i2, str);
        }
    }

    public static final void a(mm40 mm40Var, vy vyVar, fet fetVar, int i2) {
        vyVar.getClass();
        fetVar.g0(905550868);
        byte b2 = 2;
        byte b3 = 4;
        byte b4 = 16;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(vyVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(vyVar, fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new xx(pz40VarF, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new xx(pz40VarF, b3);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = new xx(pz40VarF, (byte) 7);
                fetVar.o0(objP3);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1299951788, new zx(mm40Var, l7m0VarY, l7m0VarY2, v3c.Y(objArr3, (Function0) objP3, fetVar), (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var, vyVar, i2, b4);
        }
    }

    public static final void b(mm40 mm40Var, gyq0 gyq0Var, d9z d9zVar, hh80 hh80Var, Function1 function1, fet fetVar, int i2) {
        gyq0Var.getClass();
        d9zVar.getClass();
        hh80Var.getClass();
        function1.getClass();
        fetVar.g0(-1585634145);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(gyq0Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            bml bmlVar = gyq0Var.f12143a;
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new h61(function1, (byte) 14);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new h61(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            ckb.f(mm40Var, bmlVar, d9zVar, hh80Var, null, null, function2, (Function1) objP2, fetVar, i3 & 8078, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var, (Object) gyq0Var, (Object) d9zVar, (Object) hh80Var, (Object) function1, i2, (byte) 4);
        }
    }

    public static t33 c(float f2) {
        return new t33(Float.valueOf(f2), hp4.j, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017d  */
    /* JADX WARN: Code duplicated, block: B:103:0x018b  */
    /* JADX WARN: Code duplicated, block: B:104:0x018d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    public static final void d(oyq0 oyq0Var, ki5 ki5Var, int i2, Function1 function1, fet fetVar, int i3) {
        int i4;
        cl5 cl5Var;
        boolean z;
        Object objP;
        byte b2;
        boolean z2;
        Object objP2;
        boolean z3;
        Object objP3;
        boolean z4;
        Object objP4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1447518050);
        int i5 = i3 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i5 == 0) {
            i4 = (fetVar2.g(y5dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar2.g(oyq0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.g(ki5Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar2.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            int i6 = i4 >> 3;
            clo cloVarB = lyq0.b(oyq0Var, fetVar2, (i6 & 14) | 24576);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = k7n0.H(jm40Var, -2.0f);
            u2k0 u2k0Var = ki5Var.f18320a;
            int i7 = i4 & 57344;
            boolean z5 = i7 == 16384;
            Object objP5 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z5 || objP5 == cl5Var2) {
                objP5 = new nrj0(function1, (byte) 14);
                fetVar2.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            boolean z6 = i7 == 16384;
            int i8 = i4;
            Object objP6 = fetVar2.P();
            if (z6 || objP6 == cl5Var2) {
                objP6 = new nrj0(function1, (byte) 15);
                fetVar2.o0(objP6);
            }
            Function0 function2 = (Function0) objP6;
            boolean z7 = i7 == 16384;
            Object objP7 = fetVar2.P();
            if (z7 || objP7 == cl5Var2) {
                objP7 = new nrj0(function1, (byte) 16);
                fetVar2.o0(objP7);
            }
            x4d0.f(mm40VarH, u2k0Var, cloVarB, function0, function2, (Function0) objP7, fetVar2, 6);
            p2k0 p2k0Var = ki5Var.b;
            if (p2k0Var == null) {
                fetVar2.e0(-1537711832);
                fetVar2.r(false);
                fetVar2 = fetVar2;
            } else {
                fetVar2.e0(-1537711831);
                mm40 mm40VarB = y5dVar.b(k7n0.H(o7k0.d(jm40Var, 1.0f), -1.0f), true);
                c3d c3dVar = cloVarB.e;
                boolean z8 = i7 == 16384;
                Object objP8 = fetVar2.P();
                if (z8) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP8 == cl5Var) {
                    }
                    Function0 function3 = (Function0) objP8;
                    if (i7 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = fetVar2.P();
                    b2 = 18;
                    if (z || objP == cl5Var) {
                        objP = new nrj0(function1, b2);
                        fetVar2.o0(objP);
                    }
                    Function0 function4 = (Function0) objP;
                    if (i7 == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new abh0(function1, b2);
                        fetVar2.o0(objP2);
                    }
                    Function1 function5 = (Function1) objP2;
                    if (i7 == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP3 = fetVar2.P();
                    if (z3 || objP3 == cl5Var) {
                        objP3 = new nrj0(function1, (byte) 19);
                        fetVar2.o0(objP3);
                    }
                    Function0 function6 = (Function0) objP3;
                    if (i7 == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP4 = fetVar2.P();
                    if (z4 || objP4 == cl5Var) {
                        objP4 = new nrj0(function1, (byte) 12);
                        fetVar2.o0(objP4);
                    }
                    fetVar2 = fetVar2;
                    fre0.f(mm40VarB, p2k0Var, i2, oyq0Var, c3dVar, function3, function4, function5, function6, (Function0) objP4, fetVar2, (i6 & 896) | ((i8 << 6) & 7168));
                    fetVar2.r(false);
                }
                objP8 = new nrj0(function1, (byte) 17);
                fetVar2.o0(objP8);
                Function0 function7 = (Function0) objP8;
                if (i7 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                b2 = 18;
                if (z) {
                    objP = new nrj0(function1, b2);
                    fetVar2.o0(objP);
                } else {
                    objP = new nrj0(function1, b2);
                    fetVar2.o0(objP);
                }
                Function0 function8 = (Function0) objP;
                if (i7 == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar2.P();
                if (z2) {
                    objP2 = new abh0(function1, b2);
                    fetVar2.o0(objP2);
                } else {
                    objP2 = new abh0(function1, b2);
                    fetVar2.o0(objP2);
                }
                Function1 function9 = (Function1) objP2;
                if (i7 == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP3 = fetVar2.P();
                if (z3) {
                    objP3 = new nrj0(function1, (byte) 19);
                    fetVar2.o0(objP3);
                } else {
                    objP3 = new nrj0(function1, (byte) 19);
                    fetVar2.o0(objP3);
                }
                Function0 function10 = (Function0) objP3;
                if (i7 == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP4 = fetVar2.P();
                if (z4) {
                    objP4 = new nrj0(function1, (byte) 12);
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new nrj0(function1, (byte) 12);
                    fetVar2.o0(objP4);
                }
                fetVar2 = fetVar2;
                fre0.f(mm40VarB, p2k0Var, i2, oyq0Var, c3dVar, function7, function8, function9, function10, (Function0) objP4, fetVar2, (i6 & 896) | ((i8 << 6) & 7168));
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) oyq0Var, (Object) ki5Var, i2, function1, i3, (byte) 8);
        }
    }

    public static final void e(final int i2, fet fetVar, mm40 mm40Var, final boolean z, final boolean z2) {
        final mm40 mm40Var2;
        fetVar.g0(83794661);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            final fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            final int i4 = z ? 4 : 6;
            zcl zclVar = qmk.f28987a;
            final float f2 = z ? 224.0f : 132.0f;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zG = fetVar.g(fqj0VarD0) | ((i3 & 896) == 256) | fetVar.e(i4) | fetVar.d(f2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new Function1() { // from class: a.r57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        hcz hczVar = (hcz) obj;
                        hczVar.getClass();
                        byte b2 = 0;
                        boolean z3 = z2;
                        fqj0 fqj0Var = fqj0VarD0;
                        if (z3) {
                            hcz.e(hczVar, null, null, new ugd(826149909, true, new t57(fqj0Var, b2)), 3);
                        }
                        hcz.g(hczVar, i4, null, null, new ugd(-1093826301, true, new u57(f2, fqj0Var, b2)), 6);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 12582912, 382);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.s57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xf0.e(x8x.L(i2 | 1), (fet) obj, mm40Var2, z, z2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(mm40 mm40Var, final String str, final imm immVar, final imm immVar2, final vu8 vu8Var, final l7m0 l7m0Var, final float f2, final float f3, final float f4, final Function1 function1, final ugd ugdVar, fet fetVar, final int i2) {
        imm immVar3;
        vu8 vu8Var2;
        str.getClass();
        immVar.getClass();
        immVar2.getClass();
        vu8Var.getClass();
        fetVar.g0(-1863135797);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            immVar3 = immVar;
            i3 |= fetVar.g(immVar3) ? 256 : 128;
        } else {
            immVar3 = immVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(immVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            vu8Var2 = vu8Var;
            i3 |= fetVar.g(vu8Var2) ? 16384 : 8192;
        } else {
            vu8Var2 = vu8Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.d(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.d(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.d(f4) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            int i4 = 458752 & i3;
            boolean z = i4 == 131072;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = jgk0.b(new kk7(l7m0Var, (byte) 26));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            float fW0 = w6kVar.w0(f2);
            float fW1 = w6kVar.w0(f3);
            int i5 = i3;
            boolean zD = fetVar.d(fW0) | fetVar.d(fW1) | (i4 == 131072);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj) {
                objP2 = jgk0.b(new fx8(fW0, fW1, l7m0Var));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var3 = (l7m0) objP2;
            jm40 jm40Var = jm40.b;
            mm40Var = jm40Var;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            int i6 = i5 & 234881024;
            boolean z2 = ((i5 & 3670016) == 1048576) | (i6 == 67108864);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new fbn(new za3(f2, f4, (byte) 6));
                fetVar.o0(objP3);
            }
            s3e s3eVar = (s3e) objP3;
            boolean z3 = ((i5 & 29360128) == 8388608) | (i6 == 67108864);
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new fbn(new za3(f3, f4, (byte) 5));
                fetVar.o0(objP4);
            }
            s3e s3eVar2 = (s3e) objP4;
            float fFloatValue = ((Number) l7m0Var3.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) objP5;
            Object objP6 = fetVar.P();
            Object obj2 = objP6;
            if (objP6 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarQ, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new hx8(pz40Var, lwfVar, nie0Var2, immVar2, function1, str, l7m0Var2, immVar3, ugdVar, vu8Var2), fetVar), fetVar, 24576);
        } else {
            fetVar.X();
        }
        final mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.gx8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    xf0.f(mm40Var2, str, immVar, immVar2, vu8Var, l7m0Var, f2, f3, f4, function1, ugdVar, (fet) obj3, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void g(mm40 mm40Var, va9 va9Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        mm40 mm40Var2;
        va9Var.getClass();
        function1.getClass();
        fetVar.g0(-1822971181);
        int i3 = i2 | 6 | (fetVar.g(va9Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
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
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o050.W(i120.Q(jm40Var, backgroundContent, ljcVar)), 1.0f);
            imm immVarA = va9Var.a();
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new n19(function1, (byte) 8);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new n19(function1, (byte) 9);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new xz8(function1, (byte) 5);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVarA, null, function0, function2, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4036);
            fetVar2 = fetVar;
            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
            if (va9Var instanceof ra9) {
                fetVar2.e0(1758203792);
                ny9.d(mm40VarD2, (ra9) va9Var, fetVar2, i3 & 112);
                fetVar2.r(false);
            } else if (va9Var instanceof ua9) {
                fetVar2.e0(1758364372);
                mdm mdmVar = ((ua9) va9Var).b;
                boolean z4 = i4 == 256;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new n19(function1, (byte) 10);
                    fetVar2.o0(objP4);
                }
                dwi0.g(mm40VarD2, mdmVar, (Function0) objP4, fetVar2, 0);
                fetVar2.r(false);
            } else if (va9Var instanceof ta9) {
                fetVar2.e0(1758613364);
                mdm mdmVar2 = ((ta9) va9Var).b;
                boolean z5 = i4 == 256;
                Object objP5 = fetVar2.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new n19(function1, (byte) 11);
                    fetVar2.o0(objP5);
                }
                dwi0.g(mm40VarD2, mdmVar2, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!(va9Var instanceof sa9)) {
                    throw b1j.f(-1328758460, fetVar2, false);
                }
                fetVar2.e0(1758870571);
                p8a.i(mm40VarD2, (sa9) va9Var, function1, fetVar2, i3 & 1008);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var2, va9Var, function1, i2, (byte) 12);
        }
    }

    public static final void h(mm40 mm40Var, xdp0 xdp0Var, pw3 pw3Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        xdp0Var.getClass();
        if ((i3 & 4) != 0) {
            zcl zclVar = qmk.f28987a;
            pw3Var = new qw3(4.0f, true, new jf4((byte) 14));
        }
        xx7 xx7Var = gqw0.n;
        if ((i3 & 16) != 0) {
            ugdVar = zgc.f44338a;
        }
        int i4 = i2 >> 3;
        x5d x5dVarA = w5d.a(pw3Var, xx7Var, fetVar, ((((i2 & 14) | (i4 & 112)) | (i4 & 896)) >> 3) & 126);
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
        jpm0.o(fetVar, x5dVarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        ugdVar.j(y5d.f42040a, xdp0Var, fetVar, Integer.valueOf((i2 & 112) | 6 | ((i2 >> 6) & 896)));
        fetVar.r(true);
    }

    public static final void i(npk npkVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1346785637);
        byte b2 = 2;
        int i3 = (fetVar.g(npkVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(mm40VarD, 48.0f), gt40.c);
            fyl fylVar = npkVar.f23917a;
            vxl vxlVar = vxl.c;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ynk(function1, b2);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarK0, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(npkVar, function1, i2, (byte) 8);
        }
    }

    public static final void j(mm40 mm40Var, msk mskVar, l7m0 l7m0Var, float f2, float f3, float f4, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        mskVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(1641306432);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mskVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new plh(l7m0Var, (byte) 5));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "DISCIPLINE_DETAILS_DEFAULT_TOOLBAR");
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new x1d(l7m0Var2, (byte) 15);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                Object fbnVar = new fbn(new za3(f2, f4, (byte) 11));
                fetVar.o0(fbnVar);
                objP3 = fbnVar;
            }
            s3e s3eVar = (s3e) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                Object fbnVar2 = new fbn(new za3(f3, f4, (byte) 10));
                fetVar.o0(fbnVar2);
                objP4 = fbnVar2;
            }
            s3e s3eVar2 = (s3e) objP4;
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) objP5;
            Object objP6 = fetVar.P();
            Object obj2 = objP6;
            if (objP6 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarA, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new ypk(pz40Var, lwfVar, nie0Var2, mskVar, l7m0Var2, function1, l7m0Var, function0, function2), fetVar), fetVar, 24630);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xpk(mm40Var2, mskVar, l7m0Var, f2, f3, f4, function1, function0, function2, i2);
        }
    }

    public static final void k(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-408317097);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i2, (byte) 6);
        }
    }

    public static final void l(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1543000347);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 11);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 21);
        }
    }

    public static final void m(mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        fetVar.g0(-1116896261);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            if (function0 == null) {
                fetVar.e0(-1785764341);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new i280((byte) 24);
                    fetVar.o0(objP);
                }
                function1 = (Function0) objP;
                fetVar.r(false);
            } else {
                fetVar.e0(358036354);
                fetVar.r(false);
                function1 = function0;
            }
            jcb.l(mm40VarQ, mdmVar, false, function1, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dya(mdmVar, function0, i2, b2);
        }
    }

    public static final void n(xa00 xa00Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        xa00Var.getClass();
        function1.getClass();
        fetVar.g0(-385330367);
        int i3 = i2 | (fetVar.g(xa00Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = o050.W(knm0.r(i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n)));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xa00Var.f40530a, ha50.TWO_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ylm(function1, b2);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            hlm.c(jm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            mdm mdmVar = xa00Var.b;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new ylm(function2, (byte) 19);
                fetVar.o0(objP2);
            } else {
                function2 = function1;
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar, 0, 4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(xa00Var, function2, i2, (byte) 2);
        }
    }

    public static final void o(int i2, int i3, fet fetVar, String str) {
        fetVar.g0(1180344314);
        int i4 = (fetVar.g(str) ? 4 : 2) | i3 | (fetVar.e(i2) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mz3 mz3VarX = l7x.X(Integer.valueOf(i2), null, null, fetVar, (i4 >> 3) & 14, 30);
            k7x.b(str, null, o2e.e0(o7k0.c, "DISCIPLINE_DETAILS_DEFAULT_TOOLBAR_IMAGE"), mz3VarX, mz3VarX, null, null, null, null, gqw0.b, gqw0.A, null, fetVar, (i4 & 14) | 805306800, 6, 31200);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v(str, i2, i3, (byte) 3);
        }
    }

    public static final void p(j9m0 j9m0Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-1260355233);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(j9m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, i120.O(zcm0.i(fetVar).f, fetVar).d() + 256.0f), 1.0f);
            pge pgeVar = gqw0.A;
            String str = j9m0Var.f16147a;
            int i4 = j9m0Var.c;
            fetVar2 = fetVar;
            p8a.e(mm40VarD, str, new gfm0(a8k0.F(i4, 0, fetVar), null), new gfm0(a8k0.F(i4, 0, fetVar), null), pgeVar, fetVar2, 196992, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ana(j9m0Var, i2, b2);
        }
    }

    public static final void q(f9m0 f9m0Var, xmw xmwVar, j9m0 j9m0Var, Function0 function0, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        ugd ugdVar2;
        ugd ugdVar3 = ugdVar;
        fetVar.g0(-219063932);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(f9m0Var) : fetVar.i(f9m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xmwVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(j9m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function0) ? 16384 : 8192;
        }
        int i5 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= fetVar.i(ugdVar3) ? 1048576 : 524288;
        }
        int i6 = i5;
        if (fetVar.U(i6 & 1, (i6 & 599187) != 599186)) {
            zfn zfnVar = m8m0.f21378a;
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            n0q n0qVar = o7k0.c;
            ljc ljcVar = jd8.n;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, jM121getTransparent0d7_KjU, ljcVar));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            p(j9m0Var, fetVar, (i6 >> 9) & 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i7 = i6 >> 3;
            hlm.c(o050.W(jm40Var), new imm(new ilm(jM123getWhite0d7_KjU), new plm(rsm0.w(f9m0Var.f9161a, 0, fetVar), ha50.THREE_LINES, jM123getWhite0d7_KjU, fa50.f9191a), f9m0Var.b, jM121getTransparent0d7_KjU, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i7 & 7168) | (i6 & 458752), 0, 4052);
            fet fetVar3 = fetVar;
            kbc.w(null, xmwVar, fetVar3, i7 & 112);
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar2, zclVar2)), ((ThemeColors) fetVar3.k(zaq0.b)).getBackground(), ljcVar);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarQ);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC2, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            ugd ugdVar4 = ugdVar;
            ugdVar4.invoke(fetVar3, Integer.valueOf((i6 >> 18) & 14));
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar3.r(true);
            ugdVar2 = ugdVar4;
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            ugdVar2 = ugdVar3;
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(f9m0Var, xmwVar, j9m0Var, function0, ugdVar2, i2);
        }
    }

    public static final void r(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1701147627);
        byte b2 = 16;
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            onw onwVar = (onw) l7m0Var.getValue();
            xmw xmwVarA = onwVar.a();
            j9m0 j9m0VarB = onwVar.b();
            f9m0 f9m0Var = new f9m0(R.string.participant_card, fmm.f9790a, 0L, false, false, null, null, false, 252);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 23);
                fetVar.o0(objP);
            }
            q(f9m0Var, xmwVarA, j9m0VarB, (Function0) objP, u1c.M(-1207053053, new sjs(onwVar, function1, b2), fetVar), fetVar, 1572870);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 18);
        }
    }

    public static final void s(msk mskVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, Function0 function1, fet fetVar, int i2) {
        Object objJ;
        Object objJ2;
        qja qjaVar = qja.j;
        fetVar.g0(1442867114);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(mskVar) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, -215184013, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, b2), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, -215184013, fetVar), ((Number) objJ).floatValue(), false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new elb(oms0VarZ, (byte) 12));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, -215184013, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new elb(oms0VarZ, (byte) 13));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, -1140961773, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 1669927973, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, 1669927973, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new elb(oms0VarZ, (byte) 14));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, 1669927973, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new elb(oms0VarZ, (byte) 15));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, -1340437307, false), lxs0Var2, fetVar, 0);
            mm40 mm40VarX = yyw.X(o7k0.d(jm40.b, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP7 = fetVar.P();
            if (zH || objP7 == obj) {
                objP7 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, !((Boolean) l7m0Var2.getValue()).booleanValue(), null);
                fetVar.o0(objP7);
            }
            imm immVar = (imm) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = new vkm(1);
                fetVar.o0(objP8);
            }
            hlm.c(mm40VarX, immVar, (vkm) objP8, null, null, null, null, null, null, u1c.M(-2135068122, new cb3(function0, cms0VarE, cms0VarE2, (byte) 3), fetVar), u1c.M(-1198760936, new cxj(l7m0Var, mskVar, (byte) 9), fetVar), u1c.M(511889911, new gf9((Object) mskVar, (Object) function1, (Object) cms0VarE, (Object) cms0VarE2, (byte) 29), fetVar), fetVar, 805309824, 54, 496);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mskVar, (Object) l7m0Var, (Object) l7m0Var2, (Object) function0, (Object) function1, i2, (byte) 29);
        }
    }

    public static final void t(d790 d790Var, FixedWebView fixedWebView, Function1 function1, fet fetVar, int i2) {
        FixedWebView fixedWebView2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        d790Var.getClass();
        fixedWebView.getClass();
        function1.getClass();
        fetVar2.g0(-1718541108);
        int i3 = i2 | (fetVar2.g(d790Var) ? 4 : 2) | (fetVar2.i(fixedWebView) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarS = o050.S(o050.W(i120.Q(n0qVar, background, ljcVar)));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z2 = d790Var instanceof a790;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.payments_consultant, 0, fetVar2), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_refresh, z2 ? ((a790) d790Var).f356a : false, ra50.f30118a, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new qu80(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 4);
                fetVar2.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fixedWebView2 = fixedWebView;
            boolean z5 = (i3 & 112) == 32 || fetVar2.i(fixedWebView2);
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new eib(fixedWebView2, (byte) 1);
                fetVar2.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new ev80((byte) 12);
                fetVar2.o0(objP4);
            }
            dwi0.b(function2, n0qVar, (Function1) objP4, fetVar2, 432, 0);
            if (d790Var instanceof b790) {
                fetVar2.e0(-577045443);
                mm40 mm40VarQ = i120.Q(n0qVar, ((StaticColors) fetVar2.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), ljcVar);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                kpb.j(null, null, fetVar2, 0, 3);
                fetVar2.r(true);
                fetVar2.r(false);
            } else if (d790Var instanceof z690) {
                fetVar2.e0(-576677907);
                mdm mdmVar = ((z690) d790Var).f43855a;
                boolean z6 = i4 == 256;
                Object objP5 = fetVar2.P();
                if (z6 || objP5 == cl5Var) {
                    objP5 = new qu80(function1, (byte) 11);
                    fetVar2.o0(objP5);
                }
                m(mdmVar, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            } else if (d790Var instanceof c790) {
                fetVar2.e0(-576390909);
                m(((c790) d790Var).f3851a, null, fetVar2, 48);
                fetVar2.r(false);
            } else {
                if (!z2) {
                    throw b1j.f(-1958278648, fetVar2, false);
                }
                fetVar2.e0(-576166128);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fixedWebView2 = fixedWebView;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(d790Var, fixedWebView2, function1, i2, (byte) 3);
        }
    }

    public static final void u(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(-1273469706);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new gno0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i2, (byte) 9);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        byte b2;
        Object obj;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-802347566);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            z5e0 z5e0Var = (z5e0) l7m0Var.getValue();
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            boolean zG = fetVar.g(z5e0Var);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                ilm ilmVar = new ilm(secondary);
                obj = obj2;
                Object immVar = new imm(ilmVar, new plm(z5e0Var.a(), ha50.TWO_LINES, secondary, fa50.f9191a), z5e0Var instanceof y5e0 ? new dmm(new ta50(new wkm(1, R.drawable.ic_info, true, ra50.f30118a, secondary))) : fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(immVar);
                objP = immVar;
            } else {
                obj = obj2;
            }
            imm immVar2 = (imm) objP;
            mm40 mm40VarR = knm0.r(i120.Q(jm40.b, ((ThemeColors) fetVar.k(dVar)).getBackground(), jd8.n).e(o7k0.c));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new evd0(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new dvd0(function1, (byte) 11);
                fetVar.o0(objP3);
            }
            b2 = 0;
            hlm.c(null, immVar2, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            if (z5e0Var != null) {
                if (z5e0Var instanceof y5e0) {
                    fetVar.e0(-615436195);
                    B((y5e0) z5e0Var, fetVar, 0);
                    fetVar.r(false);
                    function2 = function1;
                } else if (z5e0Var instanceof w5e0) {
                    fetVar.e0(-615433809);
                    function2 = function1;
                    l(((w5e0) z5e0Var).b, function2, fetVar, i4);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    if (z5e0Var instanceof x5e0) {
                        fetVar.e0(-615428878);
                        x(6, fetVar);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
            }
            throw b1j.f(-615438106, fetVar, false);
        }
        function2 = function1;
        b2 = 0;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function2, i2, b2);
        }
    }

    public static final void w(int i2, fet fetVar) {
        fetVar.g0(-440570249);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40.b, 16.0f, 0.0f, 2), 1.0f), 20.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 24);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(2137826657);
        int i3 = i2 & 1;
        if (fetVar.U(i3, i3 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1431348137);
            for (int i4 = 0; i4 < 15; i4++) {
                w(0, fetVar);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 25);
        }
    }

    public static final void y(ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1500466827);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarQ, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 24.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            vqd.t((i3 & 112) | 6, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0(ugdVar, i2, (byte) 3);
        }
    }

    public static final void z(mm40 mm40Var, vhe vheVar, fet fetVar, int i2) {
        fetVar.g0(-1710297970);
        int i3 = i2 | 6 | (fetVar.g(vheVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            y(u1c.M(-731181698, new t330(vheVar), fetVar), fetVar, 54);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, vheVar, i2, (byte) 26);
        }
    }
}
