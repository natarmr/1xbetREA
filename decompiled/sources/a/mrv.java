package a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mrv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f22291a = new ugd(1921481751, false, new vgd(4));
    public static final ugd b = new ugd(276836610, false, new zgd(8));
    public static final ugd c = new ugd(591695802, false, new zgd(9));
    public static final ugd d = new ugd(900059637, false, new zgd(10));
    public static final ugd e = new ugd(-514305569, false, new qbd((byte) 20));
    public static final ugd f = new ugd(-1675891119, false, new qbd((byte) 21));
    public static final ugd g = new ugd(402766252, false, new chd(17));
    public static final ugd h = new ugd(-264622433, false, new jhd(15));
    public static final ugd i = new ugd(1472935818, false, new ohd(12));
    public static final mb50 j = new mb50(2);
    public static final int[] k = {R.attr.colorPrimary};
    public static final int[] l = {R.attr.colorPrimaryVariant};

    public static final void A(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i2) {
        int i3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(-1315062102);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function5) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            int i4 = i3 & 112;
            d(s5x0.N(jm40Var, 8.0f, 8.0f, 8.0f, 0.0f, 8), uzhVar, function2, fetVar, ((i3 >> 6) & 896) | i4);
            int i5 = i4 | 6 | (i3 & 896) | (i3 & 7168);
            int i6 = i3 >> 3;
            e(o7k0.d(jm40Var, 1.0f), uzhVar, function0, function1, function3, function4, function5, fetVar, i5 | (57344 & i6) | (458752 & i6) | (i6 & 3670016));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wml(mm40Var, uzhVar, function0, function1, function2, function3, function4, function5, i2, (byte) 4);
        }
    }

    public static final void B(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1061817353);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
                objP = new pme0(function1, (byte) 14);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 28);
        }
    }

    public static final void C(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-438651693);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new z9q(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0206  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    public static final void D(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        cl5 cl5Var;
        Function1 function2;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        ?? r0;
        Object obj3;
        paq paqVar;
        Function1 function3 = function1;
        l7m0Var.getClass();
        function3.getClass();
        fetVar.g0(-1437667378);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function3) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean z4 = i4 == 32;
            Object objP = fetVar.P();
            byte b3 = 28;
            cl5 cl5Var2 = ukd.f35823a;
            Object obj4 = objP;
            if (z4 || objP == cl5Var2) {
                mfp mfpVar = new mfp(function3, b3);
                fetVar.o0(mfpVar);
                obj4 = mfpVar;
            }
            Function0 function0 = (Function0) obj4;
            boolean z5 = i4 == 32;
            Object objP2 = fetVar.P();
            Object obj5 = objP2;
            if (z5 || objP2 == cl5Var2) {
                z9q z9qVar = new z9q(function3, b2);
                fetVar.o0(z9qVar);
                obj5 = z9qVar;
            }
            v3c.z(function0, (Function0) obj5, null, fetVar, 0, 4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o050.S(o050.W(jm40Var));
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarS.e(n0qVar);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), "FIN_BET_SCREEN");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
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
            saq saqVar = (saq) l7m0Var.getValue();
            if (saqVar != null) {
                if (saqVar instanceof paq) {
                    fetVar.e0(234364323);
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
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    imm immVarA = ((saq) l7m0Var.getValue()).a();
                    boolean z7 = i4 == 32;
                    Object objP3 = fetVar.P();
                    if (z7) {
                        cl5Var = cl5Var2;
                    } else {
                        cl5Var = cl5Var2;
                        if (objP3 != cl5Var) {
                            function2 = function1;
                            obj = objP3;
                        }
                        Function0 function4 = (Function0) obj;
                        if (i4 == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Object objP4 = fetVar.P();
                        obj2 = objP4;
                        if (z2 || objP4 == cl5Var) {
                            z9q z9qVar2 = new z9q(function2, (byte) 4);
                            fetVar.o0(z9qVar2);
                            obj2 = z9qVar2;
                        }
                        Function0 function5 = (Function0) obj2;
                        if (i4 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object objP5 = fetVar.P();
                        if (!z3 || objP5 == cl5Var) {
                            r0 = 0;
                            baq baqVar = new baq(function2, false ? 1 : 0);
                            fetVar.o0(baqVar);
                            obj3 = baqVar;
                        } else {
                            r0 = 0;
                            obj3 = objP5;
                        }
                        hlm.c(mm40VarN, immVarA, null, function4, function5, (Function1) obj3, null, null, null, null, null, null, fetVar, 0, 0, 4036);
                        paqVar = (paq) saqVar;
                        v(paqVar, function1, fetVar, i4);
                        fetVar.r(true);
                        if (paqVar.g) {
                            fetVar.e0(979651593);
                            a0(r0, fetVar);
                        } else {
                            fetVar.e0(304442728);
                        }
                        fetVar.r(r0);
                        fetVar.r(true);
                        fetVar.r(r0);
                        function3 = function1;
                    }
                    function2 = function1;
                    z9q z9qVar3 = new z9q(function2, (byte) 3);
                    fetVar.o0(z9qVar3);
                    obj = z9qVar3;
                    Function0 function6 = (Function0) obj;
                    if (i4 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object objP6 = fetVar.P();
                    obj2 = objP6;
                    if (z2) {
                        z9q z9qVar4 = new z9q(function2, (byte) 4);
                        fetVar.o0(z9qVar4);
                        obj2 = z9qVar4;
                    } else {
                        z9q z9qVar5 = new z9q(function2, (byte) 4);
                        fetVar.o0(z9qVar5);
                        obj2 = z9qVar5;
                    }
                    Function0 function7 = (Function0) obj2;
                    if (i4 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Object objP7 = fetVar.P();
                    if (z3) {
                        r0 = 0;
                        baq baqVar2 = new baq(function2, false ? 1 : 0);
                        fetVar.o0(baqVar2);
                        obj3 = baqVar2;
                    } else {
                        r0 = 0;
                        baq baqVar3 = new baq(function2, false ? 1 : 0);
                        fetVar.o0(baqVar3);
                        obj3 = baqVar3;
                    }
                    hlm.c(mm40VarN, immVarA, null, function6, function7, (Function1) obj3, null, null, null, null, null, null, fetVar, 0, 0, 4036);
                    paqVar = (paq) saqVar;
                    v(paqVar, function1, fetVar, i4);
                    fetVar.r(true);
                    if (paqVar.g) {
                        fetVar.e0(979651593);
                        a0(r0, fetVar);
                    } else {
                        fetVar.e0(304442728);
                    }
                    fetVar.r(r0);
                    fetVar.r(true);
                    fetVar.r(r0);
                    function3 = function1;
                } else if (saqVar instanceof qaq) {
                    fetVar.e0(235383479);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    imm immVarA2 = ((saq) l7m0Var.getValue()).a();
                    boolean z8 = i4 == 32;
                    Object objP8 = fetVar.P();
                    Object obj6 = objP8;
                    if (z8 || objP8 == cl5Var2) {
                        z9q z9qVar6 = new z9q(function3, (byte) 5);
                        fetVar.o0(z9qVar6);
                        obj6 = z9qVar6;
                    }
                    Function0 function8 = (Function0) obj6;
                    boolean z9 = i4 == 32;
                    Object objP9 = fetVar.P();
                    Object obj7 = objP9;
                    if (z9 || objP9 == cl5Var2) {
                        z9q z9qVar7 = new z9q(function3, (byte) 6);
                        fetVar.o0(z9qVar7);
                        obj7 = z9qVar7;
                    }
                    Function0 function9 = (Function0) obj7;
                    boolean z10 = i4 == 32;
                    Object objP10 = fetVar.P();
                    Object obj8 = objP10;
                    if (z10 || objP10 == cl5Var2) {
                        qyo qyoVar = new qyo(function3, (byte) 28);
                        fetVar.o0(qyoVar);
                        obj8 = qyoVar;
                    }
                    hlm.c(mm40VarN2, immVarA2, null, function8, function9, (Function1) obj8, null, null, null, null, null, null, fetVar, 0, 0, 4036);
                    C(((qaq) saqVar).b, function1, fetVar, i4);
                    fetVar.r(false);
                    function3 = function1;
                } else if (saqVar instanceof raq) {
                    fetVar.e0(236045577);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarD3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    imm immVarA3 = ((saq) l7m0Var.getValue()).a();
                    boolean z11 = i4 == 32;
                    Object objP11 = fetVar.P();
                    byte b4 = 29;
                    Object obj9 = objP11;
                    if (z11 || objP11 == cl5Var2) {
                        mfp mfpVar2 = new mfp(function3, b4);
                        fetVar.o0(mfpVar2);
                        obj9 = mfpVar2;
                    }
                    Function0 function10 = (Function0) obj9;
                    boolean z12 = i4 == 32;
                    Object objP12 = fetVar.P();
                    Object obj10 = objP12;
                    if (z12 || objP12 == cl5Var2) {
                        z9q z9qVar8 = new z9q(function3, (byte) 1);
                        fetVar.o0(z9qVar8);
                        obj10 = z9qVar8;
                    }
                    Function0 function11 = (Function0) obj10;
                    boolean z13 = i4 == 32;
                    Object objP13 = fetVar.P();
                    Object obj11 = objP13;
                    if (z13 || objP13 == cl5Var2) {
                        qyo qyoVar2 = new qyo(function3, b4);
                        fetVar.o0(qyoVar2);
                        obj11 = qyoVar2;
                    }
                    Function1 function12 = (Function1) obj11;
                    function3 = function3;
                    hlm.c(mm40VarN3, immVarA3, null, function10, function11, function12, null, null, null, null, null, null, fetVar, 0, 0, 4036);
                    L(0, fetVar);
                    fetVar.r(false);
                } else {
                    z = false;
                }
                fetVar.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-408082917, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function3, i2, (byte) 15);
        }
    }

    public static final void E(paq paqVar, fet fetVar, int i2) {
        pcy pcyVar;
        pcy pcyVar2;
        pcy pcyVar3;
        pcy pcyVar4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1606920763);
        int i3 = i2 | (fetVar2.g(paqVar) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar2).d;
            float f3 = xfn.a(fetVar2).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, f2, 8.0f, f3, 0.0f, 8), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 10.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar5 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar5);
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
            mm40 mm40VarS = o7k0.s(jm40Var, 124.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar5);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar5);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            String strW = rsm0.w(R.string.level_start_normal, 0, fetVar2);
            y9q0 y9q0VarN = g1t0.n();
            long j2 = qmk.q;
            long j3 = qmk.r;
            long j4 = qmk.n;
            v8q0.a(strW, mm40VarD2, s6t0.b().f33626a.getSecondary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarN, fetVar2, 48, 24960, 110576);
            fetVar2.r(true);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 1.0f), 24.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE2);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar5;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar5;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            h9q h9qVar = paqVar.c;
            pcy pcyVar6 = pcyVar;
            v8q0.a(h9qVar.c, mm40VarD3, s6t0.b().f33626a.getSecondary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 48, 24960, 110576);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 12.0f, 0.0f, 10), true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar6;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar6;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarE3 = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarE3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
            pcy pcyVar7 = pcyVar2;
            v8q0.a(h9qVar.f12689a, mm40VarD4, s6t0.b().f33626a.getTextPrimary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 110576);
            fetVar.r(true);
            mm40 mm40VarE4 = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 1.0f), 24.0f);
            tj30 tj30VarC4 = zq8.c(zx7Var, false);
            int iHashCode7 = Long.hashCode(fetVar.T);
            bh90 bh90VarM7 = fetVar.m();
            mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarE4);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar3 = pcyVar7;
                fetVar.l(pcyVar3);
            } else {
                pcyVar3 = pcyVar7;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar);
            jpm0.o(fetVar, bh90VarM7, shdVar2);
            vqd.u(iHashCode7, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC6, shdVar4);
            mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
            pcy pcyVar8 = pcyVar3;
            v8q0.a(h9qVar.d, mm40VarD5, s6t0.b().f33626a.getTextPrimary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 110576);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarS2 = o7k0.s(jm40Var, 80.0f);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode8 = Long.hashCode(fetVar.T);
            bh90 bh90VarM8 = fetVar.m();
            mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarS2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar4 = pcyVar8;
                fetVar.l(pcyVar4);
            } else {
                pcyVar4 = pcyVar8;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM8, shdVar2);
            vqd.u(iHashCode8, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC7, shdVar4);
            mm40 mm40VarE5 = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
            tj30 tj30VarC5 = zq8.c(zx7Var, false);
            int iHashCode9 = Long.hashCode(fetVar.T);
            bh90 bh90VarM9 = fetVar.m();
            mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarE5);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar4);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC5, shdVar);
            jpm0.o(fetVar, bh90VarM9, shdVar2);
            vqd.u(iHashCode9, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC8, shdVar4);
            nia0.g(o7k0.d(jm40Var, 1.0f), new q53(h9qVar.e, h9qVar.f), new t6k(), fetVar, 390);
            fetVar.r(true);
            mm40 mm40VarE6 = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 1.0f), 24.0f);
            tj30 tj30VarC6 = zq8.c(zx7Var, false);
            int iHashCode10 = Long.hashCode(fetVar.T);
            bh90 bh90VarM10 = fetVar.m();
            mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarE6);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar4);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC6, shdVar);
            jpm0.o(fetVar, bh90VarM10, shdVar2);
            vqd.u(iHashCode10, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC9, shdVar4);
            mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
            v8q0.a(h9qVar.b, mm40VarD6, s6t0.b().f33626a.getTextPrimary(), new n05(j3, qmk.u, j4), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.u(), fetVar, 48, 24960, 109552);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5o(paqVar, i2, (byte) 26);
        }
    }

    public static final void F(paq paqVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(964826508);
        int i4 = i2 & 6;
        jr8 jr8Var = jr8.f16991a;
        if (i4 == 0) {
            i3 = (fetVar.g(jr8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(paqVar) ? 32 : 16;
        }
        byte b2 = 8;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar2 = fetVar;
            nnw0.g(jr8Var.b(o7k0.d(jm40.b, 1.0f), gqw0.h), null, false, u1c.M(38838370, new elm(paqVar, b2), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(paqVar, i2, b2);
        }
    }

    public static final void G(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1435176716);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 24.0f, 0.0f, 4.0f, 5);
            lw3 lw3Var = uc9.b;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 150.0f);
            String strW = rsm0.w(R.string.finance_bet_zone, 0, fetVar2);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(strW, mm40VarS, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarS2 = o7k0.s(jm40Var, 124.0f);
            thg0 thg0VarA2 = shg0.a(uc9.h, yx7Var, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            j6n.h(rsm0.w(R.string.upper_normal, 0, fetVar2), gqo0.f11744a, o7k0.g(jm40Var, 0.0f, 56.0f, 1), 0, 0, fetVar2, 48, 24);
            j6n.h(rsm0.w(R.string.lower_normal, 0, fetVar2), nro0.f24013a, o7k0.g(jm40Var, 0.0f, 56.0f, 1), 0, 0, fetVar2, 48, 24);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jbp(i2, (byte) 21);
        }
    }

    public static final void H(paq paqVar, Function1 function1, fet fetVar, int i2) {
        byte b2;
        fetVar.g0(1600112408);
        int i3 = (fetVar.g(paqVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = ((k6z) fetVar.k(bmd.n)) == k6z.b;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            qcc.u(paqVar.d, z, fetVar, 6);
            bsr0.f(paqVar.e, paqVar.f, fetVar, 0);
            b2 = 1;
            fetVar.r(true);
            int i4 = i3 << 3;
            j120.l(paqVar.d, z, function1, fetVar, i4 & 896);
            F(paqVar, fetVar, (i4 & 112) | 6);
            fetVar.r(true);
        } else {
            b2 = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aaq(paqVar, function1, i2, b2);
        }
    }

    public static final void I(mm40 mm40Var, uzh uzhVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1709737506);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(8.0f);
            mm40 mm40VarM = s5x0.M(mm40Var, 16.0f, 12.0f, uzhVar.l ? 38.0f : 8.0f, 6.0f);
            boolean zE = fetVar.e(iT) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new inl(uzhVar, iT, b2);
                fetVar.o0(objP);
            }
            x4n0.a(mm40VarM, (Function2) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jnl(mm40Var, uzhVar, i2, b2);
        }
    }

    public static final void J(mm40 mm40Var, e2d e2dVar, qdz qdzVar, a4x a4xVar, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z5;
        fetVar.g0(647536788);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(e2dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z5 = z4;
            i3 |= fetVar.h(z5) ? 8388608 : 4194304;
        } else {
            z5 = z4;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z6 = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z6 || objP == cl5Var) {
                objP = z ? "KEY_LAZY_LIST_SEARCH_SHIMMERS" : "KEY_LAZY_LIST_SEARCH";
                fetVar.o0(objP);
            }
            xcz xczVarB = qdzVar.b((String) objP, new vtf0((byte) 3), fetVar, i3 & 896);
            fetVar.e0(2070958304);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new j6g0((byte) 17);
                fetVar.o0(objP2);
            }
            mm40 mm40VarV = cjx.V(mm40Var, e2d.b(e2dVar, (Function0) objP2), null);
            fetVar.r(false);
            int i4 = 234881024 & i3;
            boolean z7 = i4 == 67108864;
            Object objP3 = fetVar.P();
            byte b2 = 12;
            if (z7 || objP3 == cl5Var) {
                objP3 = new pme0(function1, b2);
                fetVar.o0(objP3);
            }
            mm40 mm40VarA = pzw.A(0, fetVar, mm40VarV, (Function0) objP3);
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ((i3 & 3670016) == 1048576) | fetVar.g(xczVarB);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new qa2(z3, xczVarB, null, (byte) 9);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP4);
            if (z3) {
                function1.invoke(n3g0.f22849a);
            }
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z8 = i4 == 67108864;
            Object objP5 = fetVar.P();
            if (z8 || objP5 == cl5Var) {
                objP5 = new pme0(function1, (byte) 13);
                fetVar.o0(objP5);
            }
            mom.c(mm40VarE, z2, womVarF, null, false, null, (Function0) objP5, null, u1c.M(-830676759, new na2(z, mm40VarA, xczVarB, pz40VarF, z5, function1, (byte) 2), fetVar), fetVar, ((i3 >> 12) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa2(mm40Var, e2dVar, qdzVar, a4xVar, z, z2, z3, z4, function1, i2, (byte) 1);
        }
    }

    public static final zw3 K(jiy jiyVar) {
        jiyVar.getClass();
        return new zw3(jiyVar, (byte) 0);
    }

    public static final void L(int i2, fet fetVar) {
        fetVar.g0(791563703);
        if (fetVar.U(i2 & 1, i2 != 0)) {
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
            pz40 pz40Var = s6t0.f31722a;
            kpb.j(mm40VarB, new dkm((ycl) null, new y3d(s6t0.b().f33626a.getSecondary()), 3), fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jbp(i2, (byte) 19);
        }
    }

    public static final void M(int i2, fet fetVar) {
        fetVar.g0(-914721525);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            g1x.l(null, xia0.d, fetVar, 48, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfa0(i2, (byte) 4);
        }
    }

    public static final inv N(jiy jiyVar, jiy jiyVar2) {
        jiyVar.getClass();
        jiyVar2.getClass();
        return new inv(jiyVar, jiyVar2, (byte) 1);
    }

    public static final void O(int i2, int i3, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-21704737);
        int i4 = i3 | 6 | (fetVar.e(i2) ? 32 : 16);
        byte b2 = 14;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(mm40Var2, 40.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarN, s6t0.b().f33626a.getBackground(), vgg0.f37379a);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(i2, (i4 >> 3) & 14, fetVar), null, o7k0.n(mm40Var2, 32.0f), s6t0.b().f33626a.getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var2, i2, i3, b2);
        }
    }

    public static final void P(jz30 jz30Var, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(680516410);
        int i3 = i2 | (fetVar2.g(jz30Var) ? 4 : 2) | (fetVar2.i(function0) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new a2z(function0, (byte) 28);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarD, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarW, 16.0f, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            qxw.o(fetVar2, o7k0.s(jm40Var, 16.0f));
            O(jz30Var.b.b, 0, fetVar2, null);
            qxw.o(fetVar2, o7k0.s(jm40Var, 16.0f));
            String str = jz30Var.f17391a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(jz30Var, function0, i2, (byte) 8);
        }
    }

    public static final void Q(mm40 mm40Var, wrb wrbVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        wrb wrbVar2 = wrbVar;
        fetVar.g0(2136460655);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wrbVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar = (cqq) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new cqq();
                fetVar.o0(objP2);
            }
            cqq cqqVar2 = (cqq) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new cqq();
                fetVar.o0(objP3);
            }
            cqq cqqVar3 = (cqq) objP3;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(n0qVar, qmk.a(fetVar).d, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, backgroundContent, ugg0Var2), 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarB0 = y860.b0(jm40Var, cqqVar);
            wrbVar2 = wrbVar;
            c6q0 c6q0Var = wrbVar2.b;
            c6q0 c6q0Var2 = wrbVar2.d;
            c6q0 c6q0Var3 = wrbVar2.c;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new trb(function1, (byte) 1);
                fetVar.o0(objP4);
            }
            wvb.t(mm40VarB0, c6q0Var, 0, null, (Function1) objP4, fetVar, 0, 12);
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            mm40 mm40VarB1 = y860.b0(jm40Var, cqqVar2);
            boolean z3 = i4 == 256;
            Object objP5 = fetVar.P();
            if (z3 || objP5 == cl5Var) {
                objP5 = new trb(function1, (byte) 2);
                fetVar.o0(objP5);
            }
            wvb.t(mm40VarB1, c6q0Var3, 0, null, (Function1) objP5, fetVar, 0, 12);
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            mm40 mm40VarB2 = y860.b0(jm40Var, cqqVar3);
            boolean z4 = i4 == 256;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var) {
                objP6 = new trb(function1, (byte) 3);
                fetVar.o0(objP6);
            }
            wvb.t(mm40VarB2, c6q0Var2, 0, null, (Function1) objP6, fetVar, 0, 12);
            fetVar.r(true);
            fetVar.r(true);
            if (wrbVar2.f) {
                if (wrbVar2.b.f) {
                    cqq.a(cqqVar);
                } else if (c6q0Var3.f) {
                    cqq.a(cqqVar2);
                } else if (c6q0Var2.f) {
                    cqq.a(cqqVar3);
                }
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 24, i2, (Object) mm40Var2, (Object) wrbVar2, function1);
        }
    }

    public static final void R(vja0 vja0Var, fet fetVar, int i2) {
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-337174343);
        int i3 = i2 | (fetVar2.g(vja0Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarG = o7k0.g(o7k0.d(s5x0.J(jm40Var, 8.0f), 1.0f), 96.0f, 0.0f, 2);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM75getBlack600d7_KjU = staticColors.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarG, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
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
            if (vja0Var instanceof uja0) {
                fetVar2.e0(-2104360932);
                hca0 hca0Var = ((uja0) vja0Var).b;
                String str = hca0Var.c;
                String str2 = hca0Var.d;
                S(s5x0.K(jm40Var, 16.0f, 12.0f), hca0Var, fetVar2, 0);
                mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                String str3 = hca0Var.f12812a;
                bre breVar = hca0Var.e;
                v8q0.a(str3, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.u(), fetVar, 0, 0, 131066);
                fetVar2 = fetVar;
                if (str2.length() > 0) {
                    fetVar2.e0(1297396214);
                    v8q0.a(str2, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 0, 0, 131066);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1297606270);
                    fetVar2.r(false);
                }
                if (breVar.f3077a.length() > 0) {
                    fetVar2.e0(1297697038);
                    v8q0.a(breVar.f3077a, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1297914782);
                    fetVar2.r(false);
                }
                if (str.length() > 0) {
                    fetVar2.e0(1298000435);
                    fet fetVar3 = fetVar2;
                    v8q0.a(str, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar3, 0, 0, 131066);
                    fetVar2 = fetVar3;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1298213374);
                    fetVar2.r(false);
                }
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-2102868499);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(vja0Var, i2, (byte) 18);
        }
    }

    public static final void S(mm40 mm40Var, hca0 hca0Var, fet fetVar, int i2) {
        fetVar.g0(-1389482903);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(hca0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            pz40 pz40Var = s6t0.f31722a;
            long secondary60 = s6t0.b().f33626a.getSecondary60();
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, secondary60, ugg0Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.n(mm40VarQ, 76.0f), ugg0Var);
            String str = hca0Var.b;
            bre breVar = hca0Var.e;
            k7x.b(str, null, mm40VarJ, a8k0.F(R.drawable.ic_statistic_profile, 0, fetVar), a8k0.F(R.drawable.ic_statistic_profile, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            if (breVar.b.length() > 0) {
                fetVar.e0(272577434);
                k7x.b(breVar.b, null, jr8.f16991a.b(jm40Var, gqw0.i), a8k0.F(R.drawable.ic_no_country, 0, fetVar), a8k0.F(R.drawable.ic_no_country, 0, fetVar), null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
                fetVar.r(false);
            } else {
                fetVar.e0(272918899);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, hca0Var, i2, (byte) 7);
        }
    }

    public static final void T(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1862430214);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            Y(((vja0) l7m0Var.getValue()).d(), fetVar, 0);
            mm40 mm40VarW = o050.W(n0qVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            imm immVar = new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new plm(rsm0.w(R.string.player_info_statistic, 0, fetVar), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, y3d.f, false, null);
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i0a0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            R((vja0) l7m0Var.getValue(), fetVar, 6);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).e(n0qVar);
            zcl zclVar2 = qmk.l;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar3, zclVar3, mm40VarE), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            vja0 vja0Var = (vja0) l7m0Var.getValue();
            if (vja0Var != null) {
                if (vja0Var instanceof tja0) {
                    fetVar.e0(874195512);
                    M(0, fetVar);
                    fetVar.r(false);
                    function2 = function1;
                } else if (vja0Var instanceof uja0) {
                    fetVar.e0(874198009);
                    function2 = function1;
                    w((uja0) vja0Var, function2, fetVar, 6 | i4);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    if (vja0Var instanceof sja0) {
                        fetVar.e0(1330506524);
                        mdm mdmVar = ((sja0) vja0Var).b;
                        boolean z3 = i4 == 256;
                        Object objP2 = fetVar.P();
                        if (z3 || objP2 == cl5Var) {
                            objP2 = new i0a0(function2, (byte) 14);
                            fetVar.o0(objP2);
                        }
                        jcb.l(null, mdmVar, false, (Function0) objP2, fetVar, 0, 5);
                        fetVar.r(false);
                    }
                }
                ohs0.x(fetVar, true, true, true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(874193099, fetVar, false);
        }
        function2 = function1;
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i2, (byte) 28);
        }
    }

    public static final void U(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            V(mm40Var, ugdVar, fetVar, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i2, b2);
        }
    }

    public static final void V(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.d(null, m2a.v);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new xx(pz40Var, (byte) 11);
                fetVar.o0(objP2);
            }
            obc.d(e5q0.b.a(m0(0, fetVar, (Function0) objP2)), u1c.M(-291176396, new ry2(mm40Var, pz40Var, ugdVar, b2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i2, b2);
        }
    }

    public static final void W(int i2, fet fetVar) {
        fetVar.g0(914720440);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0VarD0));
            mm40 mm40VarN2 = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            zcl zclVar3 = qmk.i;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(o7k0.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN2), 128.0f), 16.0f), fqj0VarD0));
            fetVar.r(true);
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 60.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f);
            zfi0 zfi0Var = zfi0.f44303a;
            mbc.o(zfi0Var, mm40VarD, false, fetVar, 6, 4);
            mm40 mm40VarL3 = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarL3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(jm40Var, 40.0f)), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(o7k0.e(o7k0.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14)), 96.0f), 16.0f), fqj0VarD0));
            fetVar.r(true);
            mbc.o(zfi0Var, o7k0.d(s5x0.N(jm40Var, 60.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), false, fetVar, 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfa0(i2, (byte) 3);
        }
    }

    public static final void X(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(462707542);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 108.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 21);
        }
    }

    public static final void Y(j9m0 j9m0Var, fet fetVar, int i2) {
        fetVar.g0(2096897765);
        byte b2 = 2;
        int i3 = (fetVar.g(j9m0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).f.e().b;
            Object[] objArr = new Object[0];
            boolean zE = fetVar.e(i4);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                objP = new y02(i4, (byte) 9);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP, fetVar, 0);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zE2 = fetVar.e(i4) | fetVar.g(cgk0Var);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zE2 || objP2 == obj) {
                objP2 = new cna(i4, cgk0Var, yjeVar, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP2);
            float fR0 = w6kVar.r0(cgk0Var.l());
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 256.0f + fR0), 1.0f);
            pge pgeVar = gqw0.A;
            String str = j9m0Var.f16147a;
            int i5 = j9m0Var.c;
            p8a.e(mm40VarD, str, new gfm0(a8k0.F(i5, 0, fetVar), null), new gfm0(a8k0.F(i5, 0, fetVar), null), pgeVar, fetVar, 196608, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(j9m0Var, i2, (byte) 17);
        }
    }

    public static final void Z(mm40 mm40Var, d9z d9zVar, l7m0 l7m0Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        pfx pfxVarI;
        fetVar.g0(-506601450);
        int i3 = i2 | 6 | (fetVar.g(d9zVar) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "LazyVerticalGridTestTag");
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new x1d(l7m0Var, (byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            ngv ngvVar = new ngv(2);
            float f2 = xfn.a(fetVar).c;
            float f3 = xfn.a(fetVar).c;
            float f4 = j3m.f15841a;
            zcl zclVar = qmk.f28987a;
            float f5 = f4 + 8.0f;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            View view = (View) fetVar.k(dy2.f);
            WeakHashMap weakHashMap = djv0.w;
            int i5 = zcm0.i(fetVar).e.e().d;
            if (i5 <= 0) {
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                i5 = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
            }
            lh80 lh80VarU = s5x0.u(f2, 0.0f, f3, w6kVar.r0(i5) + f5 + 56.0f, 2);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z2 = (i4 == 256) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new epg(l7m0Var, xdrVar, ugdVar, (byte) 0);
                fetVar.o0(objP2);
            }
            g8x.i(ngvVar, mm40VarA, d9zVar, lh80VarU, null, qw3Var, null, false, null, (Function1) objP2, fetVar, (i3 << 3) & 896, 944);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) d9zVar, (Object) l7m0Var, (Object) xdrVar, (Object) ugdVar, i2, (byte) 25);
        }
    }

    public static final void a(mm40 mm40Var, tgk0 tgk0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(200837862);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(tgk0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new e0(function1, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            mm40 mm40VarN2 = o7k0.n(jm40.b, 40.0f);
            boolean z2 = tgk0Var.f33917a;
            yb ybVar = new yb();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new q8(b3);
                fetVar.o0(objP2);
            }
            acb.n(ybVar, z2, (Function0) objP2, mm40VarN2, fetVar, 384, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) tgk0Var, (Object) function1, i2, (byte) 6);
        }
    }

    public static final void a0(int i2, fet fetVar) {
        fetVar.g0(303724808);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, StaticColors.INSTANCE.m70getBlack200d7_KjU(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new v9q(b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            kpb.j(jr8.f16991a.b(jm40.b, gqw0.e), new dkm((ycl) null, new y3d(s6t0.b().f33626a.getSecondary()), 3), fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jbp(i2, (byte) 20);
        }
    }

    public static final void b(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1219571293);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 148.0f), 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 4);
        }
    }

    public static final void b0(Integer num, long j2, long j3, float f2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-224631962);
        int i3 = i2 | (fetVar2.g(num) ? 4 : 2) | (fetVar2.g(null) ? 32 : 16) | (fetVar2.f(j2) ? 256 : 128) | (fetVar2.f(j3) ? 2048 : 1024);
        if (!fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar2.X();
        } else if (num != null) {
            fetVar2.e0(-451486508);
            j0x.b(a8k0.F(num.intValue(), i3 & 14, fetVar2), null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar, 25016, 104);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            fetVar2.e0(-451219784);
            mm40 mm40VarQ = i120.Q(o7k0.c, j2, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(R.drawable.ic_glyph_games, 0, fetVar2), null, o7k0.n(jr8.f16991a.b(jm40.b, gqw0.e), f2), j3, fetVar2, 56 | (i3 & 7168), 0);
            fetVar2.r(true);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wan(num, j2, j3, f2, i2, (byte) 1);
        }
    }

    public static final void c(uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-839361211);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(uzhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 74899) != 74898)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            q7n q7nVar = uzhVar.s;
            tzh tzhVar = uzhVar.t;
            fetVar2.e0(200994420);
            String str4 = q7nVar.f28259a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            cwr0.o(null, str4, g1t0.g(), q7nVar.b, new qol(null, 15), tol.d, null, function4, fetVar2, 1572864 | ((i4 << 9) & 234881024));
            fetVar2 = fetVar2;
            fetVar2.r(false);
            a4x a4xVar = uzhVar.j;
            woo0 woo0Var = woo0.f39508a;
            if (a4xVar == null || a4xVar.isEmpty()) {
                fetVar2.e0(201943175);
                fetVar2.r(false);
            } else {
                fetVar2.e0(201533479);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String str5 = uzhVar.f;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD, str5, g1t0.g(), uzhVar.j, woo0Var, tzhVar.b, function0, fetVar2, ((i4 << 15) & 3670016) | 24582);
                fetVar2.r(false);
            }
            a4x a4xVar2 = uzhVar.k;
            if (a4xVar2 == null || a4xVar2.isEmpty()) {
                fetVar2.e0(202411399);
                fetVar2.r(false);
            } else {
                fetVar2.e0(202018040);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                String str6 = uzhVar.g;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD2, str6, g1t0.g(), uzhVar.k, woo0Var, tzhVar.c, function1, fetVar2, ((i4 << 12) & 3670016) | 24582);
                fetVar2.r(false);
            }
            String str7 = uzhVar.h;
            if (str7 == null || str7.length() == 0 || (str3 = uzhVar.m) == null || str3.length() == 0) {
                fetVar2.e0(202786375);
                fetVar2.r(false);
            } else {
                fetVar2.e0(202519217);
                String str8 = uzhVar.h;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str8, g1t0.g(), uzhVar.m, tzhVar.d, fetVar2, 0);
                fetVar2.r(false);
            }
            String str9 = uzhVar.i;
            if (str9 == null || str9.length() == 0 || (str2 = uzhVar.n) == null || str2.length() == 0) {
                fetVar2.e0(203166311);
                fetVar2.r(false);
            } else {
                fetVar2.e0(202896270);
                String str10 = uzhVar.i;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str10, g1t0.g(), uzhVar.n, false, fetVar2, 0);
                fetVar2.r(false);
            }
            String str11 = uzhVar.o;
            if ((str11 == null || str11.length() == 0) && ((str = uzhVar.p) == null || str.length() == 0)) {
                fetVar2.e0(203556167);
                fetVar2.r(false);
            } else {
                fetVar2.e0(203275555);
                pzb.l(uzhVar.o, uzhVar.p, function2, function3, fetVar2, (i4 >> 3) & 8064);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new anl(uzhVar, function0, function1, function2, function3, function4, i2, (byte) 3);
        }
    }

    public static void c0(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.X, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                e0(context, l, "Theme.MaterialComponents");
            }
        }
        e0(context, k, "Theme.AppCompat");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static final void d(mm40 mm40Var, uzh uzhVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        uzh uzhVar2;
        fet fetVar2;
        String str;
        fet fetVar3;
        ?? r11;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(-1915490356);
        if ((i2 & 6) == 0) {
            i3 = (fetVar5.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar5.g(uzhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar5.i(function0) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 120.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarE);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z = fetVar5.S;
            Function0 function1 = e7z.u1;
            if (z) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar5, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar3);
            jpm0.n(fetVar5);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar5, 0);
            int iHashCode2 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM2 = fetVar5.m();
            mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarA);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, shdVar);
            jpm0.o(fetVar5, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC1, shdVar4);
            mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, 88.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar3, zclVar3, zclVar2, mm40VarC);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM3 = fetVar5.m();
            mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarE2);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC2, shdVar);
            jpm0.o(fetVar5, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC2, shdVar4);
            mm40 mm40VarA2 = jr8Var.a(jm40Var);
            long background = afn0.m(fetVar5).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarV = yyw.V(i120.Q(mm40VarA2, background, ljcVar), fetVar5.k(bmd.n) == k6z.b);
            String str2 = uzhVar.d;
            ovl ovlVar = uzhVar.r;
            String str3 = ovlVar.b;
            k7x.a(str2, null, mm40VarV, gqw0.A, null, fetVar5, 1572912, 1976);
            fetVar5.r(true);
            mm40 mm40VarQ = i120.Q(h97.e(zclVar3, zclVar2, zclVar2, zclVar3, o7k0.c(new x7z(1.0f, true), 1.0f)), afn0.m(fetVar5).getBackground(), ljcVar);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM4 = fetVar5.m();
            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarQ);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC3, shdVar);
            jpm0.o(fetVar5, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC3, shdVar4);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
            int iHashCode5 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM5 = fetVar5.m();
            mm40 mm40VarC4 = kbc.c0(fetVar5, n0qVar);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA, shdVar);
            jpm0.o(fetVar5, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC4, shdVar4);
            I(jm40Var, uzhVar, fetVar5, (i4 & 112) | 6);
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            String str4 = uzhVar.e;
            afn0.v(fetVar5).getClass();
            aad.e(str4, mm40VarN, y9q0.a(g1t0.p(), afn0.m(fetVar5).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, qmk.t, null, null, 16580606), null, 2, false, 1, 0, null, new n05(qmk.q, qmk.w, qmk.n), fetVar, 1794048, 392);
            if ((str3 == null || str3.length() == 0) && ((str = ovlVar.c) == null || str.length() == 0)) {
                uzhVar2 = uzhVar;
                fetVar3 = fetVar;
                r11 = 0;
                fetVar3.e0(-309740871);
                fetVar3.r(false);
            } else {
                fetVar.e0(-311327482);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                afn0.v(fetVar).getClass();
                uzhVar2 = uzhVar;
                wha0.n(mm40VarD2, g1t0.g(), new y8n(ovlVar.f25931a, str3 == null ? "" : str3, ovlVar.c, afn0.m(fetVar).getBackground(), afn0.m(fetVar).getTextPrimary(), afn0.m(fetVar).getTextPrimary(), afn0.m(fetVar).getSecondary(), false, new unm(tnm.f34243a, afn0.m(fetVar).getPrimary(), afn0.m(fetVar).getPrimary(), afn0.m(fetVar).getSecondary20(), 8.0f, 4.0f, uzhVar2.q, 100, false, 768)), fetVar, 6, 0);
                fetVar3 = fetVar;
                r11 = 0;
                fetVar3.r(false);
            }
            ohs0.x(fetVar3, true, true, true);
            f(r11, fetVar3, o7k0.c(ffb0.R(jr8Var.b(jm40Var, gqw0.d), 82.0f, 0.0f, 2), 1.0f));
            if (uzhVar2.l) {
                fetVar3.e0(216693792);
                mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, gqw0.c), 8.0f);
                long secondary20 = afn0.m(fetVar3).getSecondary20();
                zcl zclVar4 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                fet fetVar6 = fetVar3;
                dww.c(a8k0.F(R.drawable.ic_glyph_cancel, r11, fetVar3), null, y860.Y(o7k0.n(i120.Q(mm40VarJ, secondary20, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 24.0f), false, null, null, function0, 15), afn0.m(fetVar3).getSecondary(), fetVar6, 56, 0);
                fetVar6.r(r11);
                fetVar4 = fetVar6;
            } else {
                fet fetVar7 = fetVar3;
                fetVar7.e0(217334128);
                fetVar7.r(r11);
                fetVar4 = fetVar7;
            }
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            uzhVar2 = uzhVar;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) uzhVar2, (Object) function0, i2, (byte) 3);
        }
    }

    public static void d0(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.X, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        jf4.o("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static final void e(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        uzh uzhVar2;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        fetVar.g0(841604260);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            uzhVar2 = uzhVar;
            i3 |= fetVar.g(uzhVar2) ? 32 : 16;
        } else {
            uzhVar2 = uzhVar;
        }
        if ((i2 & 384) == 0) {
            function5 = function0;
            i3 |= fetVar.i(function5) ? 256 : 128;
        } else {
            function5 = function0;
        }
        if ((i2 & 3072) == 0) {
            function6 = function1;
            i3 |= fetVar.i(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i2 & 24576) == 0) {
            function7 = function2;
            i3 |= fetVar.i(function7) ? 16384 : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i2) == 0) {
            function8 = function3;
            i3 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i2) == 0) {
            function9 = function4;
            i3 |= fetVar.i(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 6.0f, 0.0f, 0.0f, 13);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            c(uzhVar2, function5, function6, function7, function8, function9, fetVar, (i3 >> 3) & 524286);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zml(mm40Var, uzhVar, function0, function1, function2, function3, function4, i2, (byte) 3);
        }
    }

    public static void e0(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                jf4.o(kng0.l("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-441479359);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS2 = o7k0.s(o7k0.c(jr8Var.b(jm40Var, zx7Var), 1.0f), 2.0f);
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 15, backgroundContent);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarS2, (Function1) objP, fetVar, 0);
            mm40 mm40VarR = ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.b), 0.0f, -6.0f, 1);
            long backgroundContent2 = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, i120.S(i120.Q(mm40VarR, backgroundContent2, ugg0Var), 2.0f, backgroundContent, ugg0Var));
            qxw.o(fetVar, i120.S(i120.Q(ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.h), 0.0f, 6.0f, 1), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ugg0Var), 2.0f, backgroundContent, ugg0Var));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, false, i2, (byte) 3);
        }
    }

    public static final String f0(lv7 lv7Var, ctf0 ctf0Var, String str) {
        boolean zC = cy7.c();
        int i2 = lv7Var.f20704a;
        if (!zC) {
            return ctf0Var.b.a(R.string.bet_history_bets_and_sum, Arrays.copyOf(new Object[]{Integer.valueOf(i2), str}, 2));
        }
        return str + " · " + i2 + " :" + kotlin.text.c.r(ctf0Var.b.a(R.string.bet_history_bets, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
    }

    public static final void g(mm40 mm40Var, ayq0 ayq0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        ayq0 ayq0Var2 = ayq0Var;
        fet fetVar2 = fetVar;
        ayq0Var2.getClass();
        function1.getClass();
        fetVar2.g0(956572006);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ayq0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_aggregator_placeholder, 0, fetVar2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new mc((Object) function1, (Object) ayq0Var2, (byte) 12);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarY = y860.Y(mm40Var, false, null, null, (Function0) objP2, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new eo0((byte) 19);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarE0 = o2e.e0(i4w0.T(n0qVar, (Function1) objP3), "MONTH_PROVIDER_IMAGE");
            boolean z4 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new k1(ayq0Var2, pz40Var, (byte) 28);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP4);
            String str = ayq0Var2.f1682a;
            pge pgeVar = gqw0.A;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new we(pz40Var, (byte) 13);
                fetVar2.o0(objP5);
            }
            Function1 function2 = (Function1) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new we(pz40Var, (byte) 14);
                fetVar2.o0(objP6);
            }
            k7x.b(str, null, mm40VarA, pm80VarF, pm80VarF, pm80VarF, null, function2, (Function1) objP6, null, pgeVar, null, fetVar2, 113545264, 6, 31296);
            zx7 zx7Var = gqw0.g;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jr8Var.b(jm40Var, zx7Var), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            ayq0Var2 = ayq0Var;
            String str2 = ayq0Var2.c;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            zfn zfnVar2 = m8m0.f21378a;
            v8q0.a(str2, mm40VarN2, ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarP, fetVar2, 0, 24960, 110584);
            fetVar2 = fetVar2;
            String str3 = ayq0Var2.d;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str3, null, ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar2, 0, 24960, 110586);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) ayq0Var2, (Object) function1, i2, (byte) 16);
        }
    }

    public static final String g0(lv7 lv7Var, String str) {
        pn40 pn40Var = pn40.f27267a;
        return ua80.i("\u200e", pn40.i(lv7Var.d, 2), " ", str);
    }

    public static final void h(mm40 mm40Var, int i2, xv1 xv1Var, fet fetVar, int i3) {
        int i4;
        xv1Var.getClass();
        fetVar.g0(-1886956951);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.g(xv1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.i(null) ? 2048 : 1024;
        }
        if (!fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            fetVar.X();
        } else if (xv1Var instanceof vv1) {
            fetVar.e0(-1802249950);
            j(mm40Var, i2, (vv1) xv1Var, fetVar, i4 & 8190);
            fetVar.r(false);
        } else {
            if (!xv1Var.equals(wv1.f39817a)) {
                throw b1j.f(-889423306, fetVar, false);
            }
            fetVar.e0(-889412152);
            i(i4 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yv1(mm40Var, i2, xv1Var, i3, (byte) 0);
        }
    }

    public static final hjm h0(String str) {
        return new hjm(str, new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188);
    }

    public static final void i(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-1101466756);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 3);
        }
    }

    public static final Object i0(pj30 pj30Var) {
        Object objN = pj30Var.n();
        p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
        if (p6zVar != null) {
            return p6zVar.g0();
        }
        return null;
    }

    public static final void j(mm40 mm40Var, int i2, vv1 vv1Var, fet fetVar, int i3) {
        int i4;
        long jM134getYellow200d7_KjU;
        boolean z;
        shd shdVar;
        shd shdVar2;
        vv1 vv1Var2 = vv1Var;
        fet fetVar2 = fetVar;
        String str = vv1Var2.e;
        fetVar2.g0(-5306383);
        if ((i3 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar2.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.g(vv1Var2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar2.i(null) ? 2048 : 1024;
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new c51(vv1Var2, (byte) 18);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar5);
            jpm0.n(fetVar2);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            jm40 jm40Var = jm40.b;
            if (i2 == 0 || i2 == 2) {
                fetVar2.e0(-1140420864);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 116.0f), 1.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m125getWhite100d7_KjU(), vgg0.a(12.0f));
                fetVar2 = fetVar;
                zq8.a(0, fetVar2, mm40VarQ);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1140041269);
                fetVar2.r(false);
            }
            zx7 zx7Var2 = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var2);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            if (i2 == 0) {
                pz40 pz40Var = s6t0.f31722a;
                jM134getYellow200d7_KjU = StaticColors.INSTANCE.m134getYellow200d7_KjU();
            } else if (i2 == 1) {
                pz40 pz40Var2 = s6t0.f31722a;
                jM134getYellow200d7_KjU = StaticColors.INSTANCE.m97getGray400d7_KjU();
            } else if (i2 != 2) {
                pz40 pz40Var3 = s6t0.f31722a;
                jM134getYellow200d7_KjU = s6t0.b().f33626a.getBackgroundContent();
            } else {
                pz40 pz40Var4 = s6t0.f31722a;
                jM134getYellow200d7_KjU = StaticColors.INSTANCE.m89getDarkOrange200d7_KjU();
            }
            mm40 mm40VarD = o7k0.d(o7k0.e(i120.Q(mm40VarN, jM134getYellow200d7_KjU, vgg0.a(16.0f)), 116.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar6);
            mm40 mm40VarJ = s5x0.J(jm40Var, 8.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM3, shdVar4);
            vqd.u(iHashCode3, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            mm40 mm40VarN2 = s5x0.N(o7k0.e(jm40Var, 48.0f), 64.0f, 0.0f, 16.0f, 0.0f, 10);
            zx7 zx7Var3 = gqw0.d;
            tj30 tj30VarC3 = zq8.c(zx7Var3, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar3);
            jpm0.o(fetVar2, bh90VarM4, shdVar4);
            vqd.u(iHashCode4, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar6);
            String str2 = vv1Var2.c;
            y9q0 y9q0VarA = y9q0.a(g1t0.k(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, idm0.t(12), null, null, 16646143);
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long j2 = qmk.r;
            long j3 = qmk.s;
            long j4 = qmk.n;
            v8q0.a(str2, null, textPrimary, new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarA, fetVar, 0, 24960, 110578);
            fet fetVar3 = fetVar;
            fetVar3.r(true);
            mm40 mm40VarL = s5x0.L(o7k0.e(jm40Var, 52.0f), 8.0f, 0.0f, 2);
            tj30 tj30VarC4 = zq8.c(zx7Var3, false);
            int iHashCode5 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM5 = fetVar3.m();
            mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarL);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC4, shdVar3);
            jpm0.o(fetVar3, bh90VarM5, shdVar4);
            vqd.u(iHashCode5, fetVar3, shdVar5, fetVar3);
            jpm0.o(fetVar3, mm40VarC4, shdVar6);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
            int iHashCode6 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM6 = fetVar3.m();
            mm40 mm40VarC5 = kbc.c0(fetVar3, jm40Var);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA2, shdVar3);
            jpm0.o(fetVar3, bh90VarM6, shdVar4);
            vqd.u(iHashCode6, fetVar3, shdVar5, fetVar3);
            jpm0.o(fetVar3, mm40VarC5, shdVar6);
            if (vv1Var.d.length() > 0) {
                fetVar3.e0(172881397);
                shdVar2 = shdVar5;
                shdVar = shdVar6;
                z = false;
                v8q0.a(vv1Var.d, null, ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), new n05(j2, qmk.t, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.v(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110578);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                z = false;
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                fetVar3.e0(173559708);
                fetVar3.r(false);
            }
            if (str.length() > 0) {
                fetVar3.e0(173675431);
                v8q0.a(str, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), new n05(j2, qmk.t, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.v(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110576);
                fetVar3 = fetVar;
                fetVar3.r(z);
            } else {
                fetVar3.e0(174428700);
                fetVar3.r(z);
            }
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar3.r(true);
            mm40 mm40VarN3 = s5x0.N(r2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            tj30 tj30VarC5 = zq8.c(zx7Var, z);
            int iHashCode7 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM7 = fetVar3.m();
            mm40 mm40VarC6 = kbc.c0(fetVar3, mm40VarN3);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC5, shdVar3);
            jpm0.o(fetVar3, bh90VarM7, shdVar4);
            vqd.u(iHashCode7, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC6, shdVar);
            vv1Var2 = vv1Var;
            fetVar2 = fetVar;
            j0x.b(lv00.T(vv1Var2.b, null, null, null, fetVar3, 48, 12), null, o7k0.n(jr8Var.b(r2, zx7Var), 60.0f), null, gqw0.A, 0.0f, null, fetVar2, 24624, 104);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv1(mm40Var, i2, vv1Var2, i3, (byte) 0);
        }
    }

    public static final jiy j0(jiy jiyVar) {
        jiyVar.getClass();
        return jiyVar.getDescriptor().b() ? jiyVar : new t860(jiyVar);
    }

    public static final wme0 k(sgy sgyVar, jiy jiyVar) {
        sgyVar.getClass();
        jiyVar.getClass();
        return new wme0(sgyVar, jiyVar);
    }

    public static final mm40 k0(mm40 mm40Var, Object obj) {
        return mm40Var.e(new n6z(obj));
    }

    public static final void l(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1992255089);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ij4((byte) 9);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.e(mm40VarE, null, null, null, null, null, false, null, (Function1) objP, fetVar2, 805306368, 510);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 17);
        }
    }

    public static TypedArray l0(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        c0(context, attributeSet, i2, i3);
        d0(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final void m(mm40 mm40Var, ua5 ua5Var, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ua5Var.getClass();
        long j2 = ua5Var.b;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1911872221);
        int i3 = i2 | 6 | (fetVar.g(ua5Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(Long.valueOf(j2));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f);
            ((ijg) fetVar.k(jjg.f16616a)).getClass();
            long j3 = ijg.j;
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, j3, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            int i4 = i3 >> 3;
            int i5 = i4 & 14;
            cjx.g(ua5Var, function0, function1, function2, fetVar, i4 & 8190);
            if (((Number) pz40Var.getValue()).longValue() == j2) {
                fetVar.e0(-1987979000);
                o(ua5Var, fetVar, i5);
                fetVar.r(false);
            } else {
                fetVar.e0(-1987895238);
                if (ua5Var.f) {
                    fetVar.e0(905706731);
                    n(ua5Var, fetVar, i5);
                } else {
                    fetVar.e0(-1987833579);
                }
                fetVar.r(false);
                pz40Var.setValue(Long.valueOf(j2));
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00(mm40Var2, (Object) ua5Var, function0, function1, (wdr) function2, i2, (byte) 9);
        }
    }

    public static final h23 m0(int i2, fet fetVar, Function0 function0) {
        View view = (View) fetVar.k(dy2.f);
        boolean zG = fetVar.g(view);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = new h23(view, null, function0);
            fetVar.o0(objP);
        }
        h23 h23Var = (h23) objP;
        boolean zI = fetVar.i(h23Var);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            objP2 = new c23(h23Var, (byte) 3);
            fetVar.o0(objP2);
        }
        m0x0.o(h23Var, (Function1) objP2, fetVar);
        return h23Var;
    }

    public static final void n(ua5 ua5Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1300217116);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ua5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Iterator<E> it = ua5Var.i.iterator();
            while (it.hasNext()) {
                ntr.i((ta5) it.next(), fetVar, 0);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ra5(ua5Var, i2, b2);
        }
    }

    public static final Function1 n0(Set set, Function1 function1, fet fetVar, int i2, int i3) {
        set.getClass();
        if ((i3 & 2) != 0) {
            function1 = j;
        }
        byte b2 = 1;
        boolean z = (((i2 & 14) ^ 6) > 4 && fetVar.g(set)) || (i2 & 6) == 4;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            function1.getClass();
            phf0 phf0Var = new phf0();
            phf0Var.f26994a = function1;
            phf0Var.b = new LinkedHashMap();
            phf0Var.c = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((hb50) it.next()).b(phf0Var);
            }
            objP = new b530((Object) new qzn(phf0Var, new LinkedHashMap(), b2), (byte) 15);
            fetVar.o0(objP);
        }
        return (Function1) objP;
    }

    public static final void o(ua5 ua5Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-739623712);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ua5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (!fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.X();
        } else if (ua5Var.i.isEmpty()) {
            fetVar.e0(-947126942);
            fetVar.r(false);
        } else {
            fetVar.e0(-947636272);
            b34.h(ua5Var.f, null, kzn.c(ro4.m0(250, 0, null, 6), null, 14), kzn.i(ro4.m0(250, 0, null, 6), null, 14), null, u1c.M(-1374074227, new un6(ua5Var, (byte) 24), fetVar), fetVar, 200064, 18);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ra5(ua5Var, i2, b2);
        }
    }

    public static final void o0(jsm0 jsm0Var) {
        jsm0Var.getClass();
        ysm0 ysm0Var = ysm0.f43175a;
    }

    public static final void p(oy6 oy6Var, fet fetVar, int i2) {
        int i3;
        oy6Var.getClass();
        fetVar.g0(1086446679);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(oy6Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            hew0.b((i3 & 14) | 3504, u1c.M(-104644155, new dq6(oy6Var, b2), fetVar), null, null, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(oy6Var, i2);
        }
    }

    public static final fba p0(iba ibaVar) {
        Byte b2 = ibaVar.f14477a;
        byte bByteValue = b2 != null ? b2.byteValue() : (byte) 0;
        Byte b3 = ibaVar.b;
        return new fba(bByteValue, b3 != null ? b3.byteValue() : (byte) 0, x1x.Q(ibaVar.c), Intrinsics.d(ibaVar.d, Boolean.TRUE));
    }

    public static final void q(mm40 mm40Var, eh8 eh8Var, fet fetVar, int i2) {
        eh8 eh8Var2 = eh8Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1609641315);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(eh8Var2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 36.0f, 0.0f, 11);
            y9q0 y9q0VarI = g1t0.i();
            String str = eh8Var2.b;
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarN, staticColors.m123getWhite0d7_KjU(), new n05(qmk.q, qmk.s, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarI, fetVar, 0, 24960, 109552);
            eh8Var2 = eh8Var;
            v8q0.a(eh8Var2.c, o7k0.w(s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 36.0f, 0.0f, 11), gqw0.l, false, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 4, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, eh8Var2, i2, (byte) 16);
        }
    }

    public static final void r(mm40 mm40Var, ona onaVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1037348812);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(onaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new mna(function1, onaVar, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40Var2, null, null, false, null, (Function0) objP, fetVar2, (i3 & 14) | 24960, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 56.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((StaticColors) fetVar2.k(zfnVar)).m126getWhite200d7_KjU(), jd8.n);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            lgb.t(o7k0.n(jm40Var, 32.0f), onaVar.b, gqw0.B, fetVar2, 3072);
            fetVar2.r(true);
            mm40 mm40VarE2 = o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
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
            String str = onaVar.c;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nna(mm40Var, onaVar, function1, i2, (byte) 1);
        }
    }

    public static final void s(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1624602893);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 6.0f, 5), 48.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, (byte) 3);
        }
    }

    public static final void t(mm40 mm40Var, v2n v2nVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        pm80 pm80VarF;
        pm80 pm80VarF2;
        v2n v2nVar2 = v2nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(2104152489);
        int i3 = i2 | 6 | (fetVar2.g(v2nVar2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 92.0f), 64.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new d8l0(function1, v2nVar2, (byte) 2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarS, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            o0x o0xVar = v2nVar2.b;
            Integer num = v2nVar2.d;
            Object objA = o0xVar.a();
            if (num == null) {
                fetVar2.e0(-347011129);
                fetVar2.r(false);
                pm80VarF = null;
            } else {
                fetVar2.e0(-347011128);
                pm80VarF = a8k0.F(num.intValue(), 0, fetVar2);
                fetVar2.r(false);
            }
            if (num == null) {
                fetVar2.e0(-346928793);
                fetVar2.r(false);
                pm80VarF2 = null;
            } else {
                fetVar2.e0(-346928792);
                pm80VarF2 = a8k0.F(num.intValue(), 0, fetVar2);
                fetVar2.r(false);
            }
            pm80 pm80Var = pm80VarF;
            pge pgeVar = gqw0.A;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 64.0f), 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(objA, null, h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS2), pm80Var, pm80VarF2, null, null, null, null, null, pgeVar, null, fetVar2, 36912, 6, 27616);
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            v2nVar2 = v2nVar;
            v8q0.a(v2nVar2.c, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e8l0(mm40Var2, v2nVar2, function1, i2, (byte) 1);
        }
    }

    public static final void u(mm40 mm40Var, wrb wrbVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        wrbVar.getClass();
        function1.getClass();
        fetVar2.g0(680134185);
        int i3 = i2 | 6 | (fetVar2.g(wrbVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            WeakHashMap weakHashMap = djv0.w;
            ujo ujoVar = new ujo(zcm0.i(fetVar2).c, zcm0.i(fetVar2).e);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = j120.k0(jm40Var, ujoVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            imm immVar = wrbVar.f39632a;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new dib(function1, (byte) 6);
                fetVar2.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            Q(null, wrbVar, function1, fetVar2, i3 & 1008);
            fetVar2.r(true);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.h);
            mtl mtlVar = wrbVar.e;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new trb(function1, (byte) 0);
                fetVar2.o0(objP2);
            }
            bkb.f(mm40VarB, mtlVar, null, false, null, (Function1) objP2, fetVar2, 0, 28);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, wrbVar, function1, i2, (byte) 3);
        }
    }

    public static final void v(paq paqVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1668479194);
        int i3 = (fetVar.g(paqVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            se seVar = paqVar.b;
            if (seVar == null) {
                fetVar.e0(-7016716);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                fetVar.e0(-7016715);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar = qmk.f28987a;
                fetVar2 = fetVar;
                rcb.r(s5x0.N(mm40VarD, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8), seVar, null, fetVar2, 0, 4);
                fetVar2.r(false);
            }
            E(paqVar, fetVar2, i3 & 14);
            G(0, fetVar2);
            H(paqVar, function1, fetVar2, i3 & 126);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aaq(paqVar, function1, i2, b2);
        }
    }

    public static final void w(uja0 uja0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        float f2;
        jm40 jm40Var;
        Object obj;
        boolean z;
        fetVar.g0(-463156551);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uja0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            boolean z2 = uja0Var.e;
            jm40 jm40Var2 = jm40.b;
            Object obj2 = ukd.f35823a;
            if (z2) {
                fetVar.e0(1833263419);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                a4x a4xVar = uja0Var.c;
                boolean z3 = (i5 & 112) == 32;
                Object objP = fetVar.P();
                if (z3 || objP == obj2) {
                    objP = new l3a0(uja0Var, (byte) 14);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z4 = (i5 & 896) == 256;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == obj2) {
                    objP2 = new hs80(function1, (byte) 22);
                    fetVar.o0(objP2);
                }
                f2 = 1.0f;
                jm40Var = jm40Var2;
                obj = obj2;
                z = false;
                ibc.o(mm40VarK, a4xVar, null, false, function0, (Function1) objP2, fetVar, 0, 12);
                fetVar.r(false);
            } else {
                f2 = 1.0f;
                jm40Var = jm40Var2;
                obj = obj2;
                z = false;
                fetVar.e0(1833615145);
                fetVar.r(false);
            }
            byte b2 = 1;
            mm40 mm40VarB = y5dVar.b(o7k0.d(jm40Var, f2), true);
            boolean z5 = (i5 & 112) == 32 ? true : z;
            if ((i5 & 896) == 256) {
                z = true;
            }
            boolean z6 = z5 | z;
            Object objP3 = fetVar.P();
            if (z6 || objP3 == obj) {
                objP3 = new zga0(uja0Var, function1, b2);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarB, null, null, null, null, null, false, null, (Function1) objP3, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) uja0Var, (Object) function1, i2, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:153:0x0212  */
    /* JADX WARN: Code duplicated, block: B:156:0x021b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0232 A[PHI: r12 r20
  0x0232: PHI (r12v46 a.d9z) = (r12v12 a.d9z), (r12v47 a.d9z) binds: [B:164:0x023e, B:161:0x0229] A[DONT_GENERATE, DONT_INLINE]
  0x0232: PHI (r20v6 int) = (r20v4 int), (r20v7 int) binds: [B:164:0x023e, B:161:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x0240  */
    /* JADX WARN: Code duplicated, block: B:168:0x0252  */
    /* JADX WARN: Code duplicated, block: B:169:0x0263  */
    /* JADX WARN: Code duplicated, block: B:172:0x0271  */
    /* JADX WARN: Code duplicated, block: B:175:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:185:0x030e  */
    /* JADX WARN: Code duplicated, block: B:188:0x032a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0340  */
    /* JADX WARN: Code duplicated, block: B:194:0x0358  */
    /* JADX WARN: Code duplicated, block: B:197:0x0372  */
    /* JADX WARN: Code duplicated, block: B:200:0x0386  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:217:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:223:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:228:0x0401  */
    /* JADX WARN: Code duplicated, block: B:231:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x040c  */
    /* JADX WARN: Code duplicated, block: B:237:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x045c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0484  */
    /* JADX WARN: Code duplicated, block: B:243:0x0490  */
    /* JADX WARN: Code duplicated, block: B:245:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:248:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:249:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:252:0x0500  */
    /* JADX WARN: Code duplicated, block: B:253:0x0504  */
    /* JADX WARN: Code duplicated, block: B:256:0x0556  */
    /* JADX WARN: Code duplicated, block: B:257:0x055a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0571  */
    /* JADX WARN: Code duplicated, block: B:261:0x0573  */
    /* JADX WARN: Code duplicated, block: B:264:0x057a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x0580  */
    /* JADX WARN: Code duplicated, block: B:270:0x059c  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:274:0x062c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0630  */
    /* JADX WARN: Code duplicated, block: B:278:0x0647  */
    /* JADX WARN: Code duplicated, block: B:279:0x0649  */
    /* JADX WARN: Code duplicated, block: B:282:0x0650 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0656  */
    /* JADX WARN: Code duplicated, block: B:288:0x066b  */
    /* JADX WARN: Code duplicated, block: B:289:0x066d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0674 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x067c  */
    /* JADX WARN: Code duplicated, block: B:298:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:299:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:301:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:304:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:305:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:307:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:308:0x06df  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:313:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:314:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:316:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:318:0x06f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:321:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:323:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:325:0x0718 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:328:0x071d  */
    /* JADX WARN: Code duplicated, block: B:331:0x074e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:334:0x0754  */
    /* JADX WARN: Code duplicated, block: B:337:0x0769  */
    /* JADX WARN: Code duplicated, block: B:343:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:345:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:347:0x080d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0815  */
    /* JADX WARN: Code duplicated, block: B:352:0x0839  */
    /* JADX WARN: Code duplicated, block: B:353:0x083b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:359:0x0848  */
    /* JADX WARN: Code duplicated, block: B:362:0x0879  */
    /* JADX WARN: Code duplicated, block: B:363:0x0898  */
    /* JADX WARN: Code duplicated, block: B:364:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:366:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:367:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:370:0x0918  */
    /* JADX WARN: Code duplicated, block: B:371:0x091a  */
    /* JADX WARN: Code duplicated, block: B:374:0x0921 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x0927  */
    /* JADX WARN: Code duplicated, block: B:381:0x0956  */
    /* JADX WARN: Code duplicated, block: B:383:0x0977  */
    /* JADX WARN: Code duplicated, block: B:384:0x097b  */
    /* JADX WARN: Code duplicated, block: B:386:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:388:0x09df  */
    /* JADX WARN: Code duplicated, block: B:391:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:393:? A[RETURN, SYNTHETIC] */
    public static final void x(final l7m0 l7m0Var, final l7m0 l7m0Var2, final l7m0 l7m0Var3, final l7m0 l7m0Var4, final l7m0 l7m0Var5, final l7m0 l7m0Var6, final l7m0 l7m0Var7, final sek sekVar, final bek bekVar, final z5s z5sVar, final xex xexVar, final CyberBottomSheetParams cyberBottomSheetParams, d9z d9zVar, boolean z, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function1 function4, final Function1 function5, final Function1 function6, final Function1 function7, final ugd ugdVar, fet fetVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        char c2;
        int i8;
        boolean z2;
        final d9z d9zVar2;
        final boolean z3;
        yfe0 yfe0VarU;
        d9z d9zVarA;
        int i9;
        final boolean zD;
        Object objP;
        Object obj;
        pz40 pz40Var;
        Object objP2;
        Context context;
        Resources resources;
        boolean zG;
        Object objP3;
        DisplayMetrics displayMetrics;
        int i10;
        DisplayMetrics displayMetrics2;
        boolean z4;
        boolean zBooleanValue;
        Object objP4;
        yog yogVar;
        Object objP5;
        final l7m0 l7m0Var8;
        Object objP6;
        Object objP7;
        l7m0 l7m0Var9;
        Object objP8;
        byte b2;
        l7m0 l7m0Var10;
        Object objP9;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean zBooleanValue2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object ic1Var;
        boolean z12;
        fet fetVar2;
        zx7 zx7Var;
        Object obj2;
        Function0 function8;
        boolean z13;
        boolean zH;
        Object objP10;
        n0q n0qVar;
        boolean zB;
        byte b3;
        jm40 jm40Var;
        mm40 mm40VarN;
        mm40 mm40VarV;
        boolean z14;
        Function0 function9;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        l7m0 l7m0Var11;
        boolean z15;
        Object objP11;
        mm40 mm40Var;
        mm40 mm40Var2;
        boolean z16;
        Object objP12;
        boolean z17;
        Object objP13;
        fet fetVar3;
        final i3m i3mVar;
        qss qssVar;
        qss qssVar2;
        byte b4;
        shd shdVar5;
        Function0 function10;
        shd shdVar6;
        fet fetVar4;
        shd shdVar7;
        zx7 zx7Var2;
        boolean z18;
        boolean z19;
        Object objP14;
        shd shdVar8;
        boolean z20;
        qss qssVar3;
        shd shdVar9;
        boolean z21;
        Object objP15;
        boolean zH2;
        Object objP16;
        final mm40 mm40Var3;
        boolean zG2;
        Object objP17;
        l7m0 l7m0Var12;
        Object objP18;
        zx7 zx7Var3 = gqw0.e;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        l7m0Var5.getClass();
        l7m0Var6.getClass();
        l7m0Var7.getClass();
        sekVar.getClass();
        bekVar.getClass();
        xexVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        fetVar.g0(1891120544);
        if ((i2 & 6) == 0) {
            i5 = i2 | (fetVar.g(l7m0Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar.g(l7m0Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.g(l7m0Var4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar.g(l7m0Var5) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= fetVar.g(l7m0Var6) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= fetVar.g(l7m0Var7) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= fetVar.g(sekVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= fetVar.g(bekVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= fetVar.g(z5sVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (fetVar.g(xexVar) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= fetVar.g(cyberBottomSheetParams) ? 32 : 16;
        }
        int i11 = i6;
        if ((i3 & 384) == 0) {
            i11 |= 128;
        }
        int i12 = i4 & 8192;
        if (i12 == 0) {
            i7 = i12;
            if ((i3 & 3072) == 0) {
                i11 |= fetVar.h(z) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i11 |= fetVar.i(function0) ? 16384 : 8192;
            }
            if ((i3 & 196608) == 0) {
                i11 |= fetVar.i(function1) ? 131072 : 65536;
            }
            if ((i3 & 1572864) == 0) {
                i11 |= fetVar.i(function2) ? 1048576 : 524288;
            }
            if ((i3 & 12582912) == 0) {
                i11 |= fetVar.i(function3) ? 8388608 : 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i11 |= fetVar.i(function4) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i11 |= fetVar.i(function5) ? 536870912 : 268435456;
            }
            if (fetVar.i(function6)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            i8 = 384 | c2 | (fetVar.i(function7) ? ' ' : (char) 16);
            if ((i5 & 306783379) != 306783378 && (i11 & 306783379) == 306783378 && (i8 & 147) == 146) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (fetVar.U(i5 & 1, z2)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    int i13 = i11 & (-897);
                    d9zVarA = f9z.a(fetVar);
                    i9 = i13;
                    if (i7 != 0) {
                        z3 = false;
                    }
                    fetVar.s();
                    zD = pkd.d(fetVar);
                    objP = fetVar.P();
                    obj = ukd.f35823a;
                    if (objP == obj) {
                        objP = androidx.compose.runtime.e.e(new ycl(Float.NaN));
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    uts0 uts0Var = w3m.f38508a;
                    objP2 = fetVar.P();
                    if (objP2 == obj) {
                        objP2 = new i3m();
                        fetVar.o0(objP2);
                    }
                    i3m i3mVar2 = (i3m) objP2;
                    context = (Context) fetVar.k(dy2.b);
                    resources = (Resources) fetVar.k(dy2.c);
                    zG = fetVar.g(context) | fetVar.g(resources);
                    objP3 = fetVar.P();
                    if (zG || objP3 == obj) {
                        displayMetrics = resources.getDisplayMetrics();
                        context.getClass();
                        Object systemService = context.getSystemService("window");
                        systemService.getClass();
                        DisplayMetrics displayMetrics3 = new DisplayMetrics();
                        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics3);
                        i10 = displayMetrics3.widthPixels;
                        Object systemService2 = context.getSystemService("window");
                        systemService2.getClass();
                        displayMetrics2 = new DisplayMetrics();
                        ((WindowManager) systemService2).getDefaultDisplay().getRealMetrics(displayMetrics2);
                        if (Math.hypot(((double) i10) / ((double) displayMetrics.xdpi), ((double) displayMetrics2.heightPixels) / ((double) displayMetrics.ydpi)) <= 6.0d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = Boolean.valueOf(z4);
                        fetVar.o0(objP3);
                    }
                    zBooleanValue = ((Boolean) objP3).booleanValue();
                    Object[] objArr = new Object[0];
                    objP4 = fetVar.P();
                    if (objP4 == obj) {
                        objP4 = new xng((byte) 1);
                        fetVar.o0(objP4);
                    }
                    yogVar = (yog) e9x.R(objArr, yog.d, (Function0) objP4, fetVar, 384);
                    objP5 = fetVar.P();
                    if (objP5 == obj) {
                        objP5 = jgk0.b(new vef(d9zVarA, yogVar, (byte) 6));
                        fetVar.o0(objP5);
                    }
                    l7m0Var8 = (l7m0) objP5;
                    objP6 = fetVar.P();
                    if (objP6 == obj) {
                        objP6 = jgk0.b(new eka(l7m0Var5, (byte) 25));
                        fetVar.o0(objP6);
                    }
                    l7m0 l7m0Var13 = (l7m0) objP6;
                    objP7 = fetVar.P();
                    if (objP7 == obj) {
                        objP7 = jgk0.b(new eka(l7m0Var5, (byte) 26));
                        fetVar.o0(objP7);
                    }
                    l7m0Var9 = (l7m0) objP7;
                    objP8 = fetVar.P();
                    b2 = 27;
                    if (objP8 == obj) {
                        objP8 = jgk0.b(new eka(l7m0Var5, b2));
                        fetVar.o0(objP8);
                    }
                    l7m0Var10 = (l7m0) objP8;
                    objP9 = fetVar.P();
                    if (objP9 == obj) {
                        objP9 = jgk0.b(new eka(l7m0Var4, (byte) 24));
                        fetVar.o0(objP9);
                    }
                    l7m0 l7m0Var14 = (l7m0) objP9;
                    if (!((Boolean) l7m0Var9.getValue()).booleanValue() || y(l7m0Var14)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (zBooleanValue || !z5) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6 || ((Boolean) l7m0Var8.getValue()).booleanValue()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z3 != 0) {
                        zBooleanValue2 = ((Boolean) l7m0Var9.getValue()).booleanValue();
                    } else {
                        zBooleanValue2 = ((Boolean) l7m0Var10.getValue()).booleanValue();
                    }
                    Object value = l7m0Var7.getValue();
                    z8 = z6;
                    if ((i5 & 3670016) == 1048576) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean zG3 = z9 | fetVar.g(d9zVarA) | fetVar.g(yogVar);
                    if ((i9 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zG3 | z10;
                    Object objP19 = fetVar.P();
                    if (!z11 || objP19 == obj) {
                        z12 = z5;
                        fetVar2 = fetVar;
                        zx7Var = zx7Var3;
                        obj2 = obj;
                        ic1Var = new ic1((Object) l7m0Var7, (Object) d9zVarA, (Object) yogVar, (Object) function2, (yje) null, (byte) 20);
                        function8 = function2;
                        fetVar2.o0(ic1Var);
                    } else {
                        z12 = z5;
                        fetVar2 = fetVar;
                        obj2 = obj;
                        zx7Var = zx7Var3;
                        function8 = function2;
                        ic1Var = objP19;
                    }
                    m0x0.v(function8, value, (Function2) ic1Var, fetVar2);
                    Boolean boolValueOf = Boolean.valueOf(z12);
                    z13 = z12;
                    zH = fetVar2.h(z13) | fetVar2.g(yogVar);
                    objP10 = fetVar2.P();
                    if (zH || objP10 == obj2) {
                        objP10 = new igb(z13, yogVar, (yje) null);
                        fetVar2.o0(objP10);
                    }
                    m0x0.t(fetVar2, boolValueOf, (Function2) objP10);
                    j120.H(i5 & 14, fetVar2, null, l7m0Var);
                    n0qVar = o7k0.c;
                    zB = ycl.b(((ycl) pz40Var.getValue()).f42389a, Float.NaN);
                    b3 = 14;
                    jm40Var = jm40.b;
                    if (zB) {
                        fetVar2.e0(1289701573);
                        objP18 = fetVar2.P();
                        if (objP18 == obj2) {
                            objP18 = new ca6(pz40Var, b3);
                            fetVar2.o0(objP18);
                        }
                        mm40VarN = yyw.X(jm40Var, (Function1) objP18, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1289891727);
                        fetVar2.r(false);
                        mm40VarN = s5x0.N(jm40Var, 0.0f, ((ycl) pz40Var.getValue()).f42389a, 0.0f, 0.0f, 13);
                    }
                    mm40 mm40VarE = n0qVar.e(mm40VarN);
                    if (z8) {
                        mm40VarV = cjx.V(jm40Var, yogVar.c, null);
                    } else {
                        mm40VarV = jm40Var;
                    }
                    mm40 mm40VarE2 = mm40VarE.e(mm40VarV);
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z14 = fetVar2.S;
                    function9 = e7z.u1;
                    if (z14) {
                        fetVar2.l(function9);
                    } else {
                        fetVar2.r0();
                    }
                    shdVar = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    zcl zclVar = qmk.f28987a;
                    i3mVar2.getClass();
                    l7m0Var11 = l7m0Var14;
                    mm40 mm40VarD0 = ro4.d0(jm40Var, new k3m(!z7, i3mVar2, 0.0f));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    boolean z22 = z7;
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD0);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(function9);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    if ((i9 & 234881024) == 67108864) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objP11 = fetVar2.P();
                    if (z15 || objP11 == obj2) {
                        objP11 = new omf(function4, (byte) 21);
                        fetVar2.o0(objP11);
                    }
                    vtb.A(i5 & 112, fetVar2, null, l7m0Var2, (Function1) objP11);
                    fetVar2.r(true);
                    if (z8) {
                        fetVar2.e0(-413964229);
                        ma80 ma80Var = ma80.f21447a;
                        k6z k6zVar = k6z.f17794a;
                        mm40 mm40VarA = fbh0.a(jm40Var, d9zVarA, ma80Var, true, null, 52);
                        mm40Var = jm40Var;
                        mm40VarA.getClass();
                        yogVar.getClass();
                        mm40 mm40VarQ = knx.Q(lgb.K(mm40VarA), new sd8(yogVar, (byte) 18));
                        fetVar2.r(false);
                        mm40Var2 = mm40VarQ;
                    } else {
                        mm40Var = jm40Var;
                        fetVar2.e0(-413325164);
                        fetVar2.r(false);
                        mm40Var2 = mm40Var;
                    }
                    mm40 mm40VarN2 = s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                    float f2 = j3m.b;
                    mm40VarN2.getClass();
                    mm40 mm40VarD1 = ro4.d0(mm40VarN2, new k3m(z22, i3mVar2, f2));
                    x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD1);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(function9);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    if ((i9 & 1879048192) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objP12 = fetVar2.P();
                    if (z16 || objP12 == obj2) {
                        objP12 = new omf(function5, (byte) 22);
                        fetVar2.o0(objP12);
                    }
                    Function1 function11 = (Function1) objP12;
                    if ((i8 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objP13 = fetVar2.P();
                    if (z17 || objP13 == obj2) {
                        objP13 = new omf(function6, (byte) 23);
                        fetVar2.o0(objP13);
                    }
                    fetVar3 = fetVar2;
                    i3mVar = i3mVar2;
                    fww.f(null, l7m0Var3, function11, (Function1) objP13, fetVar3, (i5 >> 3) & 112);
                    nam.a(s5x0.L(mm40Var, qmk.a(fetVar3).c, 0.0f, 2), l7m0Var6, function3, fetVar3, ((i5 >> 12) & 112) | ((i9 >> 15) & 896));
                    fetVar3.r(true);
                    qssVar = (qss) l7m0Var5.getValue();
                    qssVar2 = qssVar;
                    if (qssVar2 == null) {
                        b4 = -1;
                    } else if (qssVar2 instanceof lss) {
                        b4 = 0;
                    } else if (qssVar2 instanceof mss) {
                        b4 = 1;
                    } else if (qssVar2 instanceof nss) {
                        b4 = 2;
                    } else if (qssVar2 instanceof oss) {
                        b4 = 3;
                    } else if (qssVar2 instanceof pss) {
                        b4 = 4;
                    } else {
                        b4 = -2;
                    }
                    if (b4 != 0) {
                        if (b4 == 1) {
                            shdVar5 = shdVar;
                            function10 = function9;
                            shdVar9 = shdVar4;
                            shdVar6 = shdVar3;
                            fetVar4 = fetVar3;
                            shdVar7 = shdVar2;
                            zx7Var2 = zx7Var;
                            z18 = false;
                            fetVar4.e0(-411716295);
                            odq.a(knm0.r(mm40Var), ((mss) qssVar).f22336a, fetVar4, 0);
                            fetVar4.r(false);
                        } else if (b4 != 2) {
                            if (b4 == 3) {
                                z18 = false;
                                fetVar3.e0(-411397801);
                                mm40 mm40VarR = knm0.r(n0qVar);
                                zx7Var2 = zx7Var;
                                tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                                int iHashCode4 = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM4 = fetVar3.m();
                                mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarR);
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    function10 = function9;
                                    fetVar3.l(function10);
                                } else {
                                    function10 = function9;
                                    fetVar3.r0();
                                }
                                shdVar5 = shdVar;
                                jpm0.o(fetVar3, tj30VarC2, shdVar5);
                                jpm0.o(fetVar3, bh90VarM4, shdVar2);
                                vqd.u(iHashCode4, fetVar3, shdVar3, fetVar3);
                                jpm0.o(fetVar3, mm40VarC3, shdVar4);
                                mdm mdmVar = ((oss) qssVar).f25796a;
                                if ((i9 & 458752) == 131072) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                objP15 = fetVar3.P();
                                if (z21 || objP15 == obj2) {
                                    objP15 = new pk9(function1, (byte) 15);
                                    fetVar3.o0(objP15);
                                }
                                fetVar4 = fetVar3;
                                shdVar7 = shdVar2;
                                shdVar6 = shdVar3;
                                shdVar9 = shdVar4;
                                jcb.l(null, mdmVar, false, (Function0) objP15, fetVar4, 0, 5);
                                fetVar4.r(true);
                                fetVar4.r(false);
                            } else {
                                if (b4 != 4) {
                                    throw b1j.f(-151844543, fetVar3, false);
                                }
                                fetVar3.e0(-410760813);
                                zH2 = fetVar3.h(((Boolean) l7m0Var8.getValue()).booleanValue()) | fetVar3.g(i3mVar);
                                objP16 = fetVar3.P();
                                if (zH2 || objP16 == obj2) {
                                    objP16 = kbc.O(mm40Var, new o3m(((Boolean) l7m0Var8.getValue()).booleanValue(), (Object) i3mVar, (byte) 0));
                                    fetVar3.o0(objP16);
                                }
                                mm40Var3 = (mm40) objP16;
                                zG2 = fetVar3.g(((pss) qssVar).f27528a) | fetVar3.h(zD);
                                objP17 = fetVar3.P();
                                if (!zG2 || objP17 == obj2) {
                                    l7m0Var12 = l7m0Var11;
                                    objP17 = jgk0.b(new lf2((Object) qssVar, zD, (Object) l7m0Var12, (byte) 3));
                                    fetVar3.o0(objP17);
                                } else {
                                    l7m0Var12 = l7m0Var11;
                                }
                                final l7m0 l7m0Var15 = (l7m0) objP17;
                                zfn zfnVar = t0h.f33118a;
                                if (z3 == 0 && !y(l7m0Var12)) {
                                    mm40Var = mm40Var3;
                                }
                                z3 = z3;
                                final l7m0 l7m0Var16 = l7m0Var12;
                                final boolean z23 = zBooleanValue2;
                                final d9z d9zVar3 = d9zVarA;
                                z18 = false;
                                i3mVar = i3mVar;
                                zBooleanValue2 = z23;
                                l7m0Var11 = l7m0Var16;
                                obc.d(zfnVar.a(mm40Var), u1c.M(1148916308, new Function2() { // from class: a.gpg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        fet fetVar5 = (fet) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        byte b5 = 0;
                                        if (fetVar5.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final boolean z24 = zD;
                                            boolean zH3 = fetVar5.h(z24);
                                            Object objP20 = fetVar5.P();
                                            if (zH3 || objP20 == ukd.f35823a) {
                                                objP20 = new cpg(b5, z24);
                                                fetVar5.o0(objP20);
                                            }
                                            xdr xdrVar = (xdr) objP20;
                                            final i3m i3mVar3 = i3mVar;
                                            final boolean z25 = z23;
                                            final l7m0 l7m0Var17 = l7m0Var4;
                                            final sek sekVar2 = sekVar;
                                            final bek bekVar2 = bekVar;
                                            final z5s z5sVar2 = z5sVar;
                                            final Function1 function12 = function7;
                                            final boolean z26 = z3;
                                            final mm40 mm40Var4 = mm40Var3;
                                            final ugd ugdVar2 = ugdVar;
                                            final l7m0 l7m0Var18 = l7m0Var8;
                                            final l7m0 l7m0Var19 = l7m0Var16;
                                            mrv.Z(null, d9zVar3, l7m0Var15, xdrVar, u1c.M(-180659616, new ydr() { // from class: a.dpg
                                                @Override // a.ydr
                                                public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    int i14;
                                                    p6t0 p6t0Var = (p6t0) obj5;
                                                    a4x a4xVar = (a4x) obj6;
                                                    fet fetVar6 = (fet) obj7;
                                                    int iIntValue2 = ((Integer) obj8).intValue();
                                                    p6t0Var.getClass();
                                                    a4xVar.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        i14 = (fetVar6.g(p6t0Var) ? 4 : 2) | iIntValue2;
                                                    } else {
                                                        i14 = iIntValue2;
                                                    }
                                                    if ((iIntValue2 & 48) == 0) {
                                                        i14 |= fetVar6.g(a4xVar) ? 32 : 16;
                                                    }
                                                    boolean z27 = true;
                                                    byte b6 = 0;
                                                    if (fetVar6.U(i14 & 1, (i14 & 147) != 146)) {
                                                        boolean z28 = p6t0Var instanceof kxs;
                                                        l7m0 l7m0Var20 = l7m0Var19;
                                                        if (z28) {
                                                            fetVar6.e0(-436445846);
                                                            if (!((Boolean) l7m0Var18.getValue()).booleanValue() || (!mrv.y(l7m0Var20) && z25)) {
                                                                z27 = false;
                                                            }
                                                            uts0 uts0Var2 = w3m.f38508a;
                                                            mm40 mm40VarE0 = o2e.e0(kbc.O(jm40.b, new o3m(z27, i3mVar3, b6)), "GAME_STREAM");
                                                            z5s z5sVar3 = z5sVar2;
                                                            zss.b(mm40VarE0, l7m0Var17, sekVar2, bekVar2, z5sVar3.d, z5sVar3.e, p7x.D(a4xVar, z24), function12, fetVar6, 0);
                                                            fetVar6.r(false);
                                                        } else {
                                                            fetVar6.e0(-1815155099);
                                                            boolean z29 = z26;
                                                            ugd ugdVar3 = ugdVar2;
                                                            if (!z29 || mrv.y(l7m0Var20)) {
                                                                fetVar6.e0(-434975671);
                                                                ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i14 & 14));
                                                                fetVar6.r(false);
                                                            } else {
                                                                fetVar6.e0(-435188114);
                                                                tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                                                                int iHashCode5 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM5 = fetVar6.m();
                                                                mm40 mm40VarC4 = kbc.c0(fetVar6, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(e7z.u1);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC3, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                                ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i14 & 14));
                                                                fetVar6.r(true);
                                                                fetVar6.r(false);
                                                            }
                                                            fetVar6.r(false);
                                                        }
                                                    } else {
                                                        fetVar6.X();
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar5), fetVar5, 24576);
                                        } else {
                                            fetVar5.X();
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar3), fetVar3, 56);
                                fetVar3.r(false);
                                function10 = function9;
                                fetVar4 = fetVar3;
                                shdVar5 = shdVar;
                                zx7Var2 = zx7Var;
                                shdVar7 = shdVar2;
                                shdVar6 = shdVar3;
                                shdVar8 = shdVar4;
                            }
                            z20 = true;
                        } else {
                            shdVar5 = shdVar;
                            function10 = function9;
                            shdVar9 = shdVar4;
                            shdVar6 = shdVar3;
                            fetVar4 = fetVar3;
                            shdVar7 = shdVar2;
                            zx7Var2 = zx7Var;
                            z18 = false;
                            fetVar4.e0(-151820422);
                            fetVar4.r(false);
                        }
                        shdVar8 = shdVar9;
                        z20 = true;
                    } else {
                        z3 = z3;
                        shdVar5 = shdVar;
                        function10 = function9;
                        i3mVar = i3mVar;
                        shdVar6 = shdVar3;
                        fetVar4 = fetVar3;
                        shdVar7 = shdVar2;
                        zBooleanValue2 = zBooleanValue2;
                        zx7Var2 = zx7Var;
                        z18 = false;
                        fetVar4.e0(-412248100);
                        mm40 mm40VarR2 = knm0.r(n0qVar);
                        tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                        int iHashCode5 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM5 = fetVar4.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar4, mm40VarR2);
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(function10);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC3, shdVar5);
                        jpm0.o(fetVar4, bh90VarM5, shdVar7);
                        vqd.u(iHashCode5, fetVar4, shdVar6, fetVar4);
                        jpm0.o(fetVar4, mm40VarC4, shdVar4);
                        mdm mdmVar2 = ((lss) qssVar).f20596a;
                        if ((i9 & 57344) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objP14 = fetVar4.P();
                        if (z19 || objP14 == obj2) {
                            objP14 = new pk9(function0, (byte) 14);
                            fetVar4.o0(objP14);
                        }
                        shdVar8 = shdVar4;
                        jcb.l(null, mdmVar2, false, (Function0) objP14, fetVar4, 0, 5);
                        z20 = true;
                        fetVar4.r(true);
                        fetVar4.r(false);
                    }
                    fetVar4.r(z20);
                    qssVar3 = (qss) l7m0Var5.getValue();
                    if (qssVar3 instanceof nss) {
                        fetVar4.e0(1297340159);
                        tj30 tj30VarC4 = zq8.c(zx7Var2, z18);
                        int iHashCode6 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM6 = fetVar4.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar4, n0qVar);
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(function10);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC4, shdVar5);
                        jpm0.o(fetVar4, bh90VarM6, shdVar7);
                        vqd.u(iHashCode6, fetVar4, shdVar6, fetVar4);
                        jpm0.o(fetVar4, mm40VarC5, shdVar8);
                        jcb.l(null, ((nss) qssVar3).f24063a, false, null, fetVar4, 0, 13);
                        fetVar4.r(true);
                        fetVar4.r(z18);
                    } else {
                        fetVar4.e0(1297527554);
                        fetVar4.r(z18);
                    }
                    xexVar.l(cyberBottomSheetParams, i3mVar, d9zVarA, l7m0Var8, ((Boolean) l7m0Var13.getValue()).booleanValue(), ((Boolean) l7m0Var9.getValue()).booleanValue(), y(l7m0Var11), zBooleanValue2, fetVar4, (i9 & 112) | 24582 | ((i9 << 27) & 1879048192));
                    d9zVar2 = d9zVarA;
                } else {
                    fetVar.X();
                    int i14 = i11 & (-897);
                    d9zVarA = d9zVar;
                    i9 = i14;
                }
                z3 = z;
                fetVar.s();
                zD = pkd.d(fetVar);
                objP = fetVar.P();
                obj = ukd.f35823a;
                if (objP == obj) {
                    objP = androidx.compose.runtime.e.e(new ycl(Float.NaN));
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                uts0 uts0Var2 = w3m.f38508a;
                objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = new i3m();
                    fetVar.o0(objP2);
                }
                i3m i3mVar3 = (i3m) objP2;
                context = (Context) fetVar.k(dy2.b);
                resources = (Resources) fetVar.k(dy2.c);
                zG = fetVar.g(context) | fetVar.g(resources);
                objP3 = fetVar.P();
                if (zG) {
                    displayMetrics = resources.getDisplayMetrics();
                    context.getClass();
                    Object systemService3 = context.getSystemService("window");
                    systemService3.getClass();
                    DisplayMetrics displayMetrics4 = new DisplayMetrics();
                    ((WindowManager) systemService3).getDefaultDisplay().getRealMetrics(displayMetrics4);
                    i10 = displayMetrics4.widthPixels;
                    Object systemService4 = context.getSystemService("window");
                    systemService4.getClass();
                    displayMetrics2 = new DisplayMetrics();
                    ((WindowManager) systemService4).getDefaultDisplay().getRealMetrics(displayMetrics2);
                    if (Math.hypot(((double) i10) / ((double) displayMetrics.xdpi), ((double) displayMetrics2.heightPixels) / ((double) displayMetrics.ydpi)) <= 6.0d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = Boolean.valueOf(z4);
                    fetVar.o0(objP3);
                } else {
                    displayMetrics = resources.getDisplayMetrics();
                    context.getClass();
                    Object systemService5 = context.getSystemService("window");
                    systemService5.getClass();
                    DisplayMetrics displayMetrics5 = new DisplayMetrics();
                    ((WindowManager) systemService5).getDefaultDisplay().getRealMetrics(displayMetrics5);
                    i10 = displayMetrics5.widthPixels;
                    Object systemService6 = context.getSystemService("window");
                    systemService6.getClass();
                    displayMetrics2 = new DisplayMetrics();
                    ((WindowManager) systemService6).getDefaultDisplay().getRealMetrics(displayMetrics2);
                    if (Math.hypot(((double) i10) / ((double) displayMetrics.xdpi), ((double) displayMetrics2.heightPixels) / ((double) displayMetrics.ydpi)) <= 6.0d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = Boolean.valueOf(z4);
                    fetVar.o0(objP3);
                }
                zBooleanValue = ((Boolean) objP3).booleanValue();
                Object[] objArr2 = new Object[0];
                objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new xng((byte) 1);
                    fetVar.o0(objP4);
                }
                yogVar = (yog) e9x.R(objArr2, yog.d, (Function0) objP4, fetVar, 384);
                objP5 = fetVar.P();
                if (objP5 == obj) {
                    objP5 = jgk0.b(new vef(d9zVarA, yogVar, (byte) 6));
                    fetVar.o0(objP5);
                }
                l7m0Var8 = (l7m0) objP5;
                objP6 = fetVar.P();
                if (objP6 == obj) {
                    objP6 = jgk0.b(new eka(l7m0Var5, (byte) 25));
                    fetVar.o0(objP6);
                }
                l7m0 l7m0Var17 = (l7m0) objP6;
                objP7 = fetVar.P();
                if (objP7 == obj) {
                    objP7 = jgk0.b(new eka(l7m0Var5, (byte) 26));
                    fetVar.o0(objP7);
                }
                l7m0Var9 = (l7m0) objP7;
                objP8 = fetVar.P();
                b2 = 27;
                if (objP8 == obj) {
                    objP8 = jgk0.b(new eka(l7m0Var5, b2));
                    fetVar.o0(objP8);
                }
                l7m0Var10 = (l7m0) objP8;
                objP9 = fetVar.P();
                if (objP9 == obj) {
                    objP9 = jgk0.b(new eka(l7m0Var4, (byte) 24));
                    fetVar.o0(objP9);
                }
                l7m0 l7m0Var18 = (l7m0) objP9;
                if (((Boolean) l7m0Var9.getValue()).booleanValue()) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (zBooleanValue) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z3 != 0) {
                    zBooleanValue2 = ((Boolean) l7m0Var9.getValue()).booleanValue();
                } else {
                    zBooleanValue2 = ((Boolean) l7m0Var10.getValue()).booleanValue();
                }
                Object value2 = l7m0Var7.getValue();
                z8 = z6;
                if ((i5 & 3670016) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean zG4 = z9 | fetVar.g(d9zVarA) | fetVar.g(yogVar);
                if ((i9 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zG4 | z10;
                Object objP110 = fetVar.P();
                if (z11) {
                    z12 = z5;
                    fetVar2 = fetVar;
                    zx7Var = zx7Var3;
                    obj2 = obj;
                    ic1Var = new ic1((Object) l7m0Var7, (Object) d9zVarA, (Object) yogVar, (Object) function2, (yje) null, (byte) 20);
                    function8 = function2;
                    fetVar2.o0(ic1Var);
                } else {
                    z12 = z5;
                    fetVar2 = fetVar;
                    zx7Var = zx7Var3;
                    obj2 = obj;
                    ic1Var = new ic1((Object) l7m0Var7, (Object) d9zVarA, (Object) yogVar, (Object) function2, (yje) null, (byte) 20);
                    function8 = function2;
                    fetVar2.o0(ic1Var);
                }
                m0x0.v(function8, value2, (Function2) ic1Var, fetVar2);
                Boolean boolValueOf2 = Boolean.valueOf(z12);
                z13 = z12;
                zH = fetVar2.h(z13) | fetVar2.g(yogVar);
                objP10 = fetVar2.P();
                if (zH) {
                    objP10 = new igb(z13, yogVar, (yje) null);
                    fetVar2.o0(objP10);
                } else {
                    objP10 = new igb(z13, yogVar, (yje) null);
                    fetVar2.o0(objP10);
                }
                m0x0.t(fetVar2, boolValueOf2, (Function2) objP10);
                j120.H(i5 & 14, fetVar2, null, l7m0Var);
                n0qVar = o7k0.c;
                zB = ycl.b(((ycl) pz40Var.getValue()).f42389a, Float.NaN);
                b3 = 14;
                jm40Var = jm40.b;
                if (zB) {
                    fetVar2.e0(1289701573);
                    objP18 = fetVar2.P();
                    if (objP18 == obj2) {
                        objP18 = new ca6(pz40Var, b3);
                        fetVar2.o0(objP18);
                    }
                    mm40VarN = yyw.X(jm40Var, (Function1) objP18, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1289891727);
                    fetVar2.r(false);
                    mm40VarN = s5x0.N(jm40Var, 0.0f, ((ycl) pz40Var.getValue()).f42389a, 0.0f, 0.0f, 13);
                }
                mm40 mm40VarE3 = n0qVar.e(mm40VarN);
                if (z8) {
                    mm40VarV = cjx.V(jm40Var, yogVar.c, null);
                } else {
                    mm40VarV = jm40Var;
                }
                mm40 mm40VarE4 = mm40VarE3.e(mm40VarV);
                mw3 mw3Var2 = uc9.c;
                xx7 xx7Var2 = gqw0.m;
                x5d x5dVarA3 = w5d.a(mw3Var2, xx7Var2, fetVar2, 0);
                int iHashCode7 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM7 = fetVar2.m();
                mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarE4);
                mkd.c0.getClass();
                fetVar2.i0();
                z14 = fetVar2.S;
                function9 = e7z.u1;
                if (z14) {
                    fetVar2.l(function9);
                } else {
                    fetVar2.r0();
                }
                shdVar = gqw0.x;
                jpm0.o(fetVar2, x5dVarA3, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM7, shdVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode7);
                shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf2, shdVar3);
                jpm0.n(fetVar2);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC6, shdVar4);
                zcl zclVar2 = qmk.f28987a;
                i3mVar3.getClass();
                l7m0Var11 = l7m0Var18;
                mm40 mm40VarD2 = ro4.d0(jm40Var, new k3m(!z7, i3mVar3, 0.0f));
                tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                boolean z24 = z7;
                int iHashCode8 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM8 = fetVar2.m();
                mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(function9);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC5, shdVar);
                jpm0.o(fetVar2, bh90VarM8, shdVar2);
                vqd.u(iHashCode8, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC7, shdVar4);
                if ((i9 & 234881024) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objP11 = fetVar2.P();
                if (z15) {
                    objP11 = new omf(function4, (byte) 21);
                    fetVar2.o0(objP11);
                } else {
                    objP11 = new omf(function4, (byte) 21);
                    fetVar2.o0(objP11);
                }
                vtb.A(i5 & 112, fetVar2, null, l7m0Var2, (Function1) objP11);
                fetVar2.r(true);
                if (z8) {
                    fetVar2.e0(-413964229);
                    ma80 ma80Var2 = ma80.f21447a;
                    k6z k6zVar2 = k6z.f17794a;
                    mm40 mm40VarA2 = fbh0.a(jm40Var, d9zVarA, ma80Var2, true, null, 52);
                    mm40Var = jm40Var;
                    mm40VarA2.getClass();
                    yogVar.getClass();
                    mm40 mm40VarQ2 = knx.Q(lgb.K(mm40VarA2), new sd8(yogVar, (byte) 18));
                    fetVar2.r(false);
                    mm40Var2 = mm40VarQ2;
                } else {
                    mm40Var = jm40Var;
                    fetVar2.e0(-413325164);
                    fetVar2.r(false);
                    mm40Var2 = mm40Var;
                }
                mm40 mm40VarN3 = s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                float f3 = j3m.b;
                mm40VarN3.getClass();
                mm40 mm40VarD3 = ro4.d0(mm40VarN3, new k3m(z24, i3mVar3, f3));
                x5d x5dVarA4 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var2, fetVar2, 0);
                int iHashCode9 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM9 = fetVar2.m();
                mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarD3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(function9);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA4, shdVar);
                jpm0.o(fetVar2, bh90VarM9, shdVar2);
                vqd.u(iHashCode9, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC8, shdVar4);
                if ((i9 & 1879048192) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objP12 = fetVar2.P();
                if (z16) {
                    objP12 = new omf(function5, (byte) 22);
                    fetVar2.o0(objP12);
                } else {
                    objP12 = new omf(function5, (byte) 22);
                    fetVar2.o0(objP12);
                }
                Function1 function12 = (Function1) objP12;
                if ((i8 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objP13 = fetVar2.P();
                if (z17) {
                    objP13 = new omf(function6, (byte) 23);
                    fetVar2.o0(objP13);
                } else {
                    objP13 = new omf(function6, (byte) 23);
                    fetVar2.o0(objP13);
                }
                fetVar3 = fetVar2;
                i3mVar = i3mVar3;
                fww.f(null, l7m0Var3, function12, (Function1) objP13, fetVar3, (i5 >> 3) & 112);
                nam.a(s5x0.L(mm40Var, qmk.a(fetVar3).c, 0.0f, 2), l7m0Var6, function3, fetVar3, ((i5 >> 12) & 112) | ((i9 >> 15) & 896));
                fetVar3.r(true);
                qssVar = (qss) l7m0Var5.getValue();
                qssVar2 = qssVar;
                if (qssVar2 == null) {
                    b4 = -1;
                } else if (qssVar2 instanceof lss) {
                    b4 = 0;
                } else if (qssVar2 instanceof mss) {
                    b4 = 1;
                } else if (qssVar2 instanceof nss) {
                    b4 = 2;
                } else if (qssVar2 instanceof oss) {
                    b4 = 3;
                } else if (qssVar2 instanceof pss) {
                    b4 = 4;
                } else {
                    b4 = -2;
                }
                if (b4 != 0) {
                    if (b4 == 1) {
                        shdVar5 = shdVar;
                        function10 = function9;
                        shdVar9 = shdVar4;
                        shdVar6 = shdVar3;
                        fetVar4 = fetVar3;
                        shdVar7 = shdVar2;
                        zx7Var2 = zx7Var;
                        z18 = false;
                        fetVar4.e0(-411716295);
                        odq.a(knm0.r(mm40Var), ((mss) qssVar).f22336a, fetVar4, 0);
                        fetVar4.r(false);
                    } else if (b4 != 2) {
                        if (b4 == 3) {
                            z18 = false;
                            fetVar3.e0(-411397801);
                            mm40 mm40VarR3 = knm0.r(n0qVar);
                            zx7Var2 = zx7Var;
                            tj30 tj30VarC6 = zq8.c(zx7Var2, false);
                            int iHashCode10 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM10 = fetVar3.m();
                            mm40 mm40VarC9 = kbc.c0(fetVar3, mm40VarR3);
                            fetVar3.i0();
                            if (fetVar3.S) {
                                function10 = function9;
                                fetVar3.l(function10);
                            } else {
                                function10 = function9;
                                fetVar3.r0();
                            }
                            shdVar5 = shdVar;
                            jpm0.o(fetVar3, tj30VarC6, shdVar5);
                            jpm0.o(fetVar3, bh90VarM10, shdVar2);
                            vqd.u(iHashCode10, fetVar3, shdVar3, fetVar3);
                            jpm0.o(fetVar3, mm40VarC9, shdVar4);
                            mdm mdmVar3 = ((oss) qssVar).f25796a;
                            if ((i9 & 458752) == 131072) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            objP15 = fetVar3.P();
                            if (z21) {
                                objP15 = new pk9(function1, (byte) 15);
                                fetVar3.o0(objP15);
                            } else {
                                objP15 = new pk9(function1, (byte) 15);
                                fetVar3.o0(objP15);
                            }
                            fetVar4 = fetVar3;
                            shdVar7 = shdVar2;
                            shdVar6 = shdVar3;
                            shdVar9 = shdVar4;
                            jcb.l(null, mdmVar3, false, (Function0) objP15, fetVar4, 0, 5);
                            fetVar4.r(true);
                            fetVar4.r(false);
                        } else {
                            if (b4 != 4) {
                                throw b1j.f(-151844543, fetVar3, false);
                            }
                            fetVar3.e0(-410760813);
                            zH2 = fetVar3.h(((Boolean) l7m0Var8.getValue()).booleanValue()) | fetVar3.g(i3mVar);
                            objP16 = fetVar3.P();
                            if (zH2) {
                                objP16 = kbc.O(mm40Var, new o3m(((Boolean) l7m0Var8.getValue()).booleanValue(), (Object) i3mVar, (byte) 0));
                                fetVar3.o0(objP16);
                            } else {
                                objP16 = kbc.O(mm40Var, new o3m(((Boolean) l7m0Var8.getValue()).booleanValue(), (Object) i3mVar, (byte) 0));
                                fetVar3.o0(objP16);
                            }
                            mm40Var3 = (mm40) objP16;
                            zG2 = fetVar3.g(((pss) qssVar).f27528a) | fetVar3.h(zD);
                            objP17 = fetVar3.P();
                            if (zG2) {
                                l7m0Var12 = l7m0Var11;
                                objP17 = jgk0.b(new lf2((Object) qssVar, zD, (Object) l7m0Var12, (byte) 3));
                                fetVar3.o0(objP17);
                            } else {
                                l7m0Var12 = l7m0Var11;
                                objP17 = jgk0.b(new lf2((Object) qssVar, zD, (Object) l7m0Var12, (byte) 3));
                                fetVar3.o0(objP17);
                            }
                            final l7m0 l7m0Var19 = (l7m0) objP17;
                            zfn zfnVar2 = t0h.f33118a;
                            if (z3 == 0) {
                                mm40Var = mm40Var3;
                            }
                            z3 = z3;
                            final l7m0 l7m0Var110 = l7m0Var12;
                            final boolean z25 = zBooleanValue2;
                            final d9z d9zVar4 = d9zVarA;
                            z18 = false;
                            i3mVar = i3mVar;
                            zBooleanValue2 = z25;
                            l7m0Var11 = l7m0Var110;
                            obc.d(zfnVar2.a(mm40Var), u1c.M(1148916308, new Function2() { // from class: a.gpg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    fet fetVar5 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    byte b5 = 0;
                                    if (fetVar5.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final boolean z26 = zD;
                                        boolean zH3 = fetVar5.h(z26);
                                        Object objP20 = fetVar5.P();
                                        if (zH3 || objP20 == ukd.f35823a) {
                                            objP20 = new cpg(b5, z26);
                                            fetVar5.o0(objP20);
                                        }
                                        xdr xdrVar = (xdr) objP20;
                                        final i3m i3mVar4 = i3mVar;
                                        final boolean z27 = z25;
                                        final l7m0 l7m0Var111 = l7m0Var4;
                                        final sek sekVar2 = sekVar;
                                        final bek bekVar2 = bekVar;
                                        final z5s z5sVar2 = z5sVar;
                                        final Function1 function13 = function7;
                                        final boolean z28 = z3;
                                        final mm40 mm40Var4 = mm40Var3;
                                        final ugd ugdVar2 = ugdVar;
                                        final l7m0 l7m0Var112 = l7m0Var8;
                                        final l7m0 l7m0Var113 = l7m0Var110;
                                        mrv.Z(null, d9zVar4, l7m0Var19, xdrVar, u1c.M(-180659616, new ydr() { // from class: a.dpg
                                            @Override // a.ydr
                                            public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                int i15;
                                                p6t0 p6t0Var = (p6t0) obj5;
                                                a4x a4xVar = (a4x) obj6;
                                                fet fetVar6 = (fet) obj7;
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                p6t0Var.getClass();
                                                a4xVar.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    i15 = (fetVar6.g(p6t0Var) ? 4 : 2) | iIntValue2;
                                                } else {
                                                    i15 = iIntValue2;
                                                }
                                                if ((iIntValue2 & 48) == 0) {
                                                    i15 |= fetVar6.g(a4xVar) ? 32 : 16;
                                                }
                                                boolean z29 = true;
                                                byte b6 = 0;
                                                if (fetVar6.U(i15 & 1, (i15 & 147) != 146)) {
                                                    boolean z210 = p6t0Var instanceof kxs;
                                                    l7m0 l7m0Var20 = l7m0Var113;
                                                    if (z210) {
                                                        fetVar6.e0(-436445846);
                                                        if (!((Boolean) l7m0Var112.getValue()).booleanValue() || (!mrv.y(l7m0Var20) && z27)) {
                                                            z29 = false;
                                                        }
                                                        uts0 uts0Var3 = w3m.f38508a;
                                                        mm40 mm40VarE0 = o2e.e0(kbc.O(jm40.b, new o3m(z29, i3mVar4, b6)), "GAME_STREAM");
                                                        z5s z5sVar3 = z5sVar2;
                                                        zss.b(mm40VarE0, l7m0Var111, sekVar2, bekVar2, z5sVar3.d, z5sVar3.e, p7x.D(a4xVar, z26), function13, fetVar6, 0);
                                                        fetVar6.r(false);
                                                    } else {
                                                        fetVar6.e0(-1815155099);
                                                        boolean z211 = z28;
                                                        ugd ugdVar3 = ugdVar2;
                                                        if (!z211 || mrv.y(l7m0Var20)) {
                                                            fetVar6.e0(-434975671);
                                                            ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i15 & 14));
                                                            fetVar6.r(false);
                                                        } else {
                                                            fetVar6.e0(-435188114);
                                                            tj30 tj30VarC7 = zq8.c(gqw0.f11754a, false);
                                                            int iHashCode11 = Long.hashCode(fetVar6.T);
                                                            bh90 bh90VarM11 = fetVar6.m();
                                                            mm40 mm40VarC10 = kbc.c0(fetVar6, mm40Var4);
                                                            mkd.c0.getClass();
                                                            fetVar6.i0();
                                                            if (fetVar6.S) {
                                                                fetVar6.l(e7z.u1);
                                                            } else {
                                                                fetVar6.r0();
                                                            }
                                                            jpm0.o(fetVar6, tj30VarC7, gqw0.x);
                                                            jpm0.o(fetVar6, bh90VarM11, gqw0.w);
                                                            jpm0.o(fetVar6, Integer.valueOf(iHashCode11), gqw0.y);
                                                            jpm0.n(fetVar6);
                                                            jpm0.o(fetVar6, mm40VarC10, gqw0.v);
                                                            ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i15 & 14));
                                                            fetVar6.r(true);
                                                            fetVar6.r(false);
                                                        }
                                                        fetVar6.r(false);
                                                    }
                                                } else {
                                                    fetVar6.X();
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar5), fetVar5, 24576);
                                    } else {
                                        fetVar5.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar3), fetVar3, 56);
                            fetVar3.r(false);
                            function10 = function9;
                            fetVar4 = fetVar3;
                            shdVar5 = shdVar;
                            zx7Var2 = zx7Var;
                            shdVar7 = shdVar2;
                            shdVar6 = shdVar3;
                            shdVar8 = shdVar4;
                        }
                        z20 = true;
                    } else {
                        shdVar5 = shdVar;
                        function10 = function9;
                        shdVar9 = shdVar4;
                        shdVar6 = shdVar3;
                        fetVar4 = fetVar3;
                        shdVar7 = shdVar2;
                        zx7Var2 = zx7Var;
                        z18 = false;
                        fetVar4.e0(-151820422);
                        fetVar4.r(false);
                    }
                    shdVar8 = shdVar9;
                    z20 = true;
                } else {
                    z3 = z3;
                    shdVar5 = shdVar;
                    function10 = function9;
                    i3mVar = i3mVar;
                    shdVar6 = shdVar3;
                    fetVar4 = fetVar3;
                    shdVar7 = shdVar2;
                    zBooleanValue2 = zBooleanValue2;
                    zx7Var2 = zx7Var;
                    z18 = false;
                    fetVar4.e0(-412248100);
                    mm40 mm40VarR4 = knm0.r(n0qVar);
                    tj30 tj30VarC7 = zq8.c(zx7Var2, false);
                    int iHashCode11 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM11 = fetVar4.m();
                    mm40 mm40VarC10 = kbc.c0(fetVar4, mm40VarR4);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(function10);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC7, shdVar5);
                    jpm0.o(fetVar4, bh90VarM11, shdVar7);
                    vqd.u(iHashCode11, fetVar4, shdVar6, fetVar4);
                    jpm0.o(fetVar4, mm40VarC10, shdVar4);
                    mdm mdmVar4 = ((lss) qssVar).f20596a;
                    if ((i9 & 57344) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objP14 = fetVar4.P();
                    if (z19) {
                        objP14 = new pk9(function0, (byte) 14);
                        fetVar4.o0(objP14);
                    } else {
                        objP14 = new pk9(function0, (byte) 14);
                        fetVar4.o0(objP14);
                    }
                    shdVar8 = shdVar4;
                    jcb.l(null, mdmVar4, false, (Function0) objP14, fetVar4, 0, 5);
                    z20 = true;
                    fetVar4.r(true);
                    fetVar4.r(false);
                }
                fetVar4.r(z20);
                qssVar3 = (qss) l7m0Var5.getValue();
                if (qssVar3 instanceof nss) {
                    fetVar4.e0(1297340159);
                    tj30 tj30VarC8 = zq8.c(zx7Var2, z18);
                    int iHashCode12 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM12 = fetVar4.m();
                    mm40 mm40VarC11 = kbc.c0(fetVar4, n0qVar);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(function10);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC8, shdVar5);
                    jpm0.o(fetVar4, bh90VarM12, shdVar7);
                    vqd.u(iHashCode12, fetVar4, shdVar6, fetVar4);
                    jpm0.o(fetVar4, mm40VarC11, shdVar8);
                    jcb.l(null, ((nss) qssVar3).f24063a, false, null, fetVar4, 0, 13);
                    fetVar4.r(true);
                    fetVar4.r(z18);
                } else {
                    fetVar4.e0(1297527554);
                    fetVar4.r(z18);
                }
                xexVar.l(cyberBottomSheetParams, i3mVar, d9zVarA, l7m0Var8, ((Boolean) l7m0Var17.getValue()).booleanValue(), ((Boolean) l7m0Var9.getValue()).booleanValue(), y(l7m0Var11), zBooleanValue2, fetVar4, (i9 & 112) | 24582 | ((i9 << 27) & 1879048192));
                d9zVar2 = d9zVarA;
            } else {
                fetVar.X();
                d9zVar2 = d9zVar;
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.hpg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iL = x8x.L(i2 | 1);
                        int iL2 = x8x.L(i3);
                        mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, d9zVar2, z3, function0, function1, function2, function3, function4, function5, function6, function7, ugdVar, (fet) obj3, iL, iL2, i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i11 |= 3072;
        i7 = i12;
        if ((i3 & 24576) == 0) {
            i11 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i11 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i11 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i11 |= fetVar.i(function3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i11 |= fetVar.i(function4) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i11 |= fetVar.i(function5) ? 536870912 : 268435456;
        }
        if (fetVar.i(function6)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        i8 = 384 | c2 | (fetVar.i(function7) ? ' ' : (char) 16);
        if ((i5 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (fetVar.U(i5 & 1, z2)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                int i15 = i11 & (-897);
                d9zVarA = f9z.a(fetVar);
                i9 = i15;
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
            } else {
                int i16 = i11 & (-897);
                d9zVarA = f9z.a(fetVar);
                i9 = i16;
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
            }
            fetVar.s();
            zD = pkd.d(fetVar);
            objP = fetVar.P();
            obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(new ycl(Float.NaN));
                fetVar.o0(objP);
            }
            pz40Var = (pz40) objP;
            uts0 uts0Var3 = w3m.f38508a;
            objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new i3m();
                fetVar.o0(objP2);
            }
            i3m i3mVar4 = (i3m) objP2;
            context = (Context) fetVar.k(dy2.b);
            resources = (Resources) fetVar.k(dy2.c);
            zG = fetVar.g(context) | fetVar.g(resources);
            objP3 = fetVar.P();
            if (zG) {
                displayMetrics = resources.getDisplayMetrics();
                context.getClass();
                Object systemService7 = context.getSystemService("window");
                systemService7.getClass();
                DisplayMetrics displayMetrics6 = new DisplayMetrics();
                ((WindowManager) systemService7).getDefaultDisplay().getRealMetrics(displayMetrics6);
                i10 = displayMetrics6.widthPixels;
                Object systemService8 = context.getSystemService("window");
                systemService8.getClass();
                displayMetrics2 = new DisplayMetrics();
                ((WindowManager) systemService8).getDefaultDisplay().getRealMetrics(displayMetrics2);
                if (Math.hypot(((double) i10) / ((double) displayMetrics.xdpi), ((double) displayMetrics2.heightPixels) / ((double) displayMetrics.ydpi)) <= 6.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = Boolean.valueOf(z4);
                fetVar.o0(objP3);
            } else {
                displayMetrics = resources.getDisplayMetrics();
                context.getClass();
                Object systemService9 = context.getSystemService("window");
                systemService9.getClass();
                DisplayMetrics displayMetrics7 = new DisplayMetrics();
                ((WindowManager) systemService9).getDefaultDisplay().getRealMetrics(displayMetrics7);
                i10 = displayMetrics7.widthPixels;
                Object systemService10 = context.getSystemService("window");
                systemService10.getClass();
                displayMetrics2 = new DisplayMetrics();
                ((WindowManager) systemService10).getDefaultDisplay().getRealMetrics(displayMetrics2);
                if (Math.hypot(((double) i10) / ((double) displayMetrics.xdpi), ((double) displayMetrics2.heightPixels) / ((double) displayMetrics.ydpi)) <= 6.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = Boolean.valueOf(z4);
                fetVar.o0(objP3);
            }
            zBooleanValue = ((Boolean) objP3).booleanValue();
            Object[] objArr3 = new Object[0];
            objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new xng((byte) 1);
                fetVar.o0(objP4);
            }
            yogVar = (yog) e9x.R(objArr3, yog.d, (Function0) objP4, fetVar, 384);
            objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = jgk0.b(new vef(d9zVarA, yogVar, (byte) 6));
                fetVar.o0(objP5);
            }
            l7m0Var8 = (l7m0) objP5;
            objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = jgk0.b(new eka(l7m0Var5, (byte) 25));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var111 = (l7m0) objP6;
            objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = jgk0.b(new eka(l7m0Var5, (byte) 26));
                fetVar.o0(objP7);
            }
            l7m0Var9 = (l7m0) objP7;
            objP8 = fetVar.P();
            b2 = 27;
            if (objP8 == obj) {
                objP8 = jgk0.b(new eka(l7m0Var5, b2));
                fetVar.o0(objP8);
            }
            l7m0Var10 = (l7m0) objP8;
            objP9 = fetVar.P();
            if (objP9 == obj) {
                objP9 = jgk0.b(new eka(l7m0Var4, (byte) 24));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var112 = (l7m0) objP9;
            if (((Boolean) l7m0Var9.getValue()).booleanValue()) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (zBooleanValue) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z3 != 0) {
                zBooleanValue2 = ((Boolean) l7m0Var9.getValue()).booleanValue();
            } else {
                zBooleanValue2 = ((Boolean) l7m0Var10.getValue()).booleanValue();
            }
            Object value3 = l7m0Var7.getValue();
            z8 = z6;
            if ((i5 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean zG5 = z9 | fetVar.g(d9zVarA) | fetVar.g(yogVar);
            if ((i9 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zG5 | z10;
            Object objP111 = fetVar.P();
            if (z11) {
                z12 = z5;
                fetVar2 = fetVar;
                zx7Var = zx7Var3;
                obj2 = obj;
                ic1Var = new ic1((Object) l7m0Var7, (Object) d9zVarA, (Object) yogVar, (Object) function2, (yje) null, (byte) 20);
                function8 = function2;
                fetVar2.o0(ic1Var);
            } else {
                z12 = z5;
                fetVar2 = fetVar;
                zx7Var = zx7Var3;
                obj2 = obj;
                ic1Var = new ic1((Object) l7m0Var7, (Object) d9zVarA, (Object) yogVar, (Object) function2, (yje) null, (byte) 20);
                function8 = function2;
                fetVar2.o0(ic1Var);
            }
            m0x0.v(function8, value3, (Function2) ic1Var, fetVar2);
            Boolean boolValueOf3 = Boolean.valueOf(z12);
            z13 = z12;
            zH = fetVar2.h(z13) | fetVar2.g(yogVar);
            objP10 = fetVar2.P();
            if (zH) {
                objP10 = new igb(z13, yogVar, (yje) null);
                fetVar2.o0(objP10);
            } else {
                objP10 = new igb(z13, yogVar, (yje) null);
                fetVar2.o0(objP10);
            }
            m0x0.t(fetVar2, boolValueOf3, (Function2) objP10);
            j120.H(i5 & 14, fetVar2, null, l7m0Var);
            n0qVar = o7k0.c;
            zB = ycl.b(((ycl) pz40Var.getValue()).f42389a, Float.NaN);
            b3 = 14;
            jm40Var = jm40.b;
            if (zB) {
                fetVar2.e0(1289701573);
                objP18 = fetVar2.P();
                if (objP18 == obj2) {
                    objP18 = new ca6(pz40Var, b3);
                    fetVar2.o0(objP18);
                }
                mm40VarN = yyw.X(jm40Var, (Function1) objP18, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1289891727);
                fetVar2.r(false);
                mm40VarN = s5x0.N(jm40Var, 0.0f, ((ycl) pz40Var.getValue()).f42389a, 0.0f, 0.0f, 13);
            }
            mm40 mm40VarE5 = n0qVar.e(mm40VarN);
            if (z8) {
                mm40VarV = cjx.V(jm40Var, yogVar.c, null);
            } else {
                mm40VarV = jm40Var;
            }
            mm40 mm40VarE6 = mm40VarE5.e(mm40VarV);
            mw3 mw3Var3 = uc9.c;
            xx7 xx7Var3 = gqw0.m;
            x5d x5dVarA5 = w5d.a(mw3Var3, xx7Var3, fetVar2, 0);
            int iHashCode13 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM13 = fetVar2.m();
            mm40 mm40VarC12 = kbc.c0(fetVar2, mm40VarE6);
            mkd.c0.getClass();
            fetVar2.i0();
            z14 = fetVar2.S;
            function9 = e7z.u1;
            if (z14) {
                fetVar2.l(function9);
            } else {
                fetVar2.r0();
            }
            shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA5, shdVar);
            shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM13, shdVar2);
            Integer numValueOf3 = Integer.valueOf(iHashCode13);
            shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf3, shdVar3);
            jpm0.n(fetVar2);
            shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC12, shdVar4);
            zcl zclVar3 = qmk.f28987a;
            i3mVar4.getClass();
            l7m0Var11 = l7m0Var112;
            mm40 mm40VarD4 = ro4.d0(jm40Var, new k3m(!z7, i3mVar4, 0.0f));
            tj30 tj30VarC9 = zq8.c(gqw0.f11754a, false);
            boolean z26 = z7;
            int iHashCode14 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM14 = fetVar2.m();
            mm40 mm40VarC13 = kbc.c0(fetVar2, mm40VarD4);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(function9);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC9, shdVar);
            jpm0.o(fetVar2, bh90VarM14, shdVar2);
            vqd.u(iHashCode14, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC13, shdVar4);
            if ((i9 & 234881024) == 67108864) {
                z15 = true;
            } else {
                z15 = false;
            }
            objP11 = fetVar2.P();
            if (z15) {
                objP11 = new omf(function4, (byte) 21);
                fetVar2.o0(objP11);
            } else {
                objP11 = new omf(function4, (byte) 21);
                fetVar2.o0(objP11);
            }
            vtb.A(i5 & 112, fetVar2, null, l7m0Var2, (Function1) objP11);
            fetVar2.r(true);
            if (z8) {
                fetVar2.e0(-413964229);
                ma80 ma80Var3 = ma80.f21447a;
                k6z k6zVar3 = k6z.f17794a;
                mm40 mm40VarA3 = fbh0.a(jm40Var, d9zVarA, ma80Var3, true, null, 52);
                mm40Var = jm40Var;
                mm40VarA3.getClass();
                yogVar.getClass();
                mm40 mm40VarQ3 = knx.Q(lgb.K(mm40VarA3), new sd8(yogVar, (byte) 18));
                fetVar2.r(false);
                mm40Var2 = mm40VarQ3;
            } else {
                mm40Var = jm40Var;
                fetVar2.e0(-413325164);
                fetVar2.r(false);
                mm40Var2 = mm40Var;
            }
            mm40 mm40VarN4 = s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 8.0f, 5);
            float f4 = j3m.b;
            mm40VarN4.getClass();
            mm40 mm40VarD5 = ro4.d0(mm40VarN4, new k3m(z26, i3mVar4, f4));
            x5d x5dVarA6 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var3, fetVar2, 0);
            int iHashCode15 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM15 = fetVar2.m();
            mm40 mm40VarC14 = kbc.c0(fetVar2, mm40VarD5);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(function9);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA6, shdVar);
            jpm0.o(fetVar2, bh90VarM15, shdVar2);
            vqd.u(iHashCode15, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC14, shdVar4);
            if ((i9 & 1879048192) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            objP12 = fetVar2.P();
            if (z16) {
                objP12 = new omf(function5, (byte) 22);
                fetVar2.o0(objP12);
            } else {
                objP12 = new omf(function5, (byte) 22);
                fetVar2.o0(objP12);
            }
            Function1 function13 = (Function1) objP12;
            if ((i8 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            objP13 = fetVar2.P();
            if (z17) {
                objP13 = new omf(function6, (byte) 23);
                fetVar2.o0(objP13);
            } else {
                objP13 = new omf(function6, (byte) 23);
                fetVar2.o0(objP13);
            }
            fetVar3 = fetVar2;
            i3mVar = i3mVar4;
            fww.f(null, l7m0Var3, function13, (Function1) objP13, fetVar3, (i5 >> 3) & 112);
            nam.a(s5x0.L(mm40Var, qmk.a(fetVar3).c, 0.0f, 2), l7m0Var6, function3, fetVar3, ((i5 >> 12) & 112) | ((i9 >> 15) & 896));
            fetVar3.r(true);
            qssVar = (qss) l7m0Var5.getValue();
            qssVar2 = qssVar;
            if (qssVar2 == null) {
                b4 = -1;
            } else if (qssVar2 instanceof lss) {
                b4 = 0;
            } else if (qssVar2 instanceof mss) {
                b4 = 1;
            } else if (qssVar2 instanceof nss) {
                b4 = 2;
            } else if (qssVar2 instanceof oss) {
                b4 = 3;
            } else if (qssVar2 instanceof pss) {
                b4 = 4;
            } else {
                b4 = -2;
            }
            if (b4 != 0) {
                if (b4 == 1) {
                    shdVar5 = shdVar;
                    function10 = function9;
                    shdVar9 = shdVar4;
                    shdVar6 = shdVar3;
                    fetVar4 = fetVar3;
                    shdVar7 = shdVar2;
                    zx7Var2 = zx7Var;
                    z18 = false;
                    fetVar4.e0(-411716295);
                    odq.a(knm0.r(mm40Var), ((mss) qssVar).f22336a, fetVar4, 0);
                    fetVar4.r(false);
                } else if (b4 != 2) {
                    if (b4 == 3) {
                        z18 = false;
                        fetVar3.e0(-411397801);
                        mm40 mm40VarR5 = knm0.r(n0qVar);
                        zx7Var2 = zx7Var;
                        tj30 tj30VarC10 = zq8.c(zx7Var2, false);
                        int iHashCode16 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM16 = fetVar3.m();
                        mm40 mm40VarC15 = kbc.c0(fetVar3, mm40VarR5);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            function10 = function9;
                            fetVar3.l(function10);
                        } else {
                            function10 = function9;
                            fetVar3.r0();
                        }
                        shdVar5 = shdVar;
                        jpm0.o(fetVar3, tj30VarC10, shdVar5);
                        jpm0.o(fetVar3, bh90VarM16, shdVar2);
                        vqd.u(iHashCode16, fetVar3, shdVar3, fetVar3);
                        jpm0.o(fetVar3, mm40VarC15, shdVar4);
                        mdm mdmVar5 = ((oss) qssVar).f25796a;
                        if ((i9 & 458752) == 131072) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        objP15 = fetVar3.P();
                        if (z21) {
                            objP15 = new pk9(function1, (byte) 15);
                            fetVar3.o0(objP15);
                        } else {
                            objP15 = new pk9(function1, (byte) 15);
                            fetVar3.o0(objP15);
                        }
                        fetVar4 = fetVar3;
                        shdVar7 = shdVar2;
                        shdVar6 = shdVar3;
                        shdVar9 = shdVar4;
                        jcb.l(null, mdmVar5, false, (Function0) objP15, fetVar4, 0, 5);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    } else {
                        if (b4 != 4) {
                            throw b1j.f(-151844543, fetVar3, false);
                        }
                        fetVar3.e0(-410760813);
                        zH2 = fetVar3.h(((Boolean) l7m0Var8.getValue()).booleanValue()) | fetVar3.g(i3mVar);
                        objP16 = fetVar3.P();
                        if (zH2) {
                            objP16 = kbc.O(mm40Var, new o3m(((Boolean) l7m0Var8.getValue()).booleanValue(), (Object) i3mVar, (byte) 0));
                            fetVar3.o0(objP16);
                        } else {
                            objP16 = kbc.O(mm40Var, new o3m(((Boolean) l7m0Var8.getValue()).booleanValue(), (Object) i3mVar, (byte) 0));
                            fetVar3.o0(objP16);
                        }
                        mm40Var3 = (mm40) objP16;
                        zG2 = fetVar3.g(((pss) qssVar).f27528a) | fetVar3.h(zD);
                        objP17 = fetVar3.P();
                        if (zG2) {
                            l7m0Var12 = l7m0Var11;
                            objP17 = jgk0.b(new lf2((Object) qssVar, zD, (Object) l7m0Var12, (byte) 3));
                            fetVar3.o0(objP17);
                        } else {
                            l7m0Var12 = l7m0Var11;
                            objP17 = jgk0.b(new lf2((Object) qssVar, zD, (Object) l7m0Var12, (byte) 3));
                            fetVar3.o0(objP17);
                        }
                        final l7m0 l7m0Var113 = (l7m0) objP17;
                        zfn zfnVar3 = t0h.f33118a;
                        if (z3 == 0) {
                            mm40Var = mm40Var3;
                        }
                        z3 = z3;
                        final l7m0 l7m0Var114 = l7m0Var12;
                        final boolean z27 = zBooleanValue2;
                        final d9z d9zVar5 = d9zVarA;
                        z18 = false;
                        i3mVar = i3mVar;
                        zBooleanValue2 = z27;
                        l7m0Var11 = l7m0Var114;
                        obc.d(zfnVar3.a(mm40Var), u1c.M(1148916308, new Function2() { // from class: a.gpg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                fet fetVar5 = (fet) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                byte b5 = 0;
                                if (fetVar5.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final boolean z28 = zD;
                                    boolean zH3 = fetVar5.h(z28);
                                    Object objP20 = fetVar5.P();
                                    if (zH3 || objP20 == ukd.f35823a) {
                                        objP20 = new cpg(b5, z28);
                                        fetVar5.o0(objP20);
                                    }
                                    xdr xdrVar = (xdr) objP20;
                                    final i3m i3mVar5 = i3mVar;
                                    final boolean z29 = z27;
                                    final l7m0 l7m0Var115 = l7m0Var4;
                                    final sek sekVar2 = sekVar;
                                    final bek bekVar2 = bekVar;
                                    final z5s z5sVar2 = z5sVar;
                                    final Function1 function14 = function7;
                                    final boolean z210 = z3;
                                    final mm40 mm40Var4 = mm40Var3;
                                    final ugd ugdVar2 = ugdVar;
                                    final l7m0 l7m0Var116 = l7m0Var8;
                                    final l7m0 l7m0Var117 = l7m0Var114;
                                    mrv.Z(null, d9zVar5, l7m0Var113, xdrVar, u1c.M(-180659616, new ydr() { // from class: a.dpg
                                        @Override // a.ydr
                                        public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            int i17;
                                            p6t0 p6t0Var = (p6t0) obj5;
                                            a4x a4xVar = (a4x) obj6;
                                            fet fetVar6 = (fet) obj7;
                                            int iIntValue2 = ((Integer) obj8).intValue();
                                            p6t0Var.getClass();
                                            a4xVar.getClass();
                                            if ((iIntValue2 & 6) == 0) {
                                                i17 = (fetVar6.g(p6t0Var) ? 4 : 2) | iIntValue2;
                                            } else {
                                                i17 = iIntValue2;
                                            }
                                            if ((iIntValue2 & 48) == 0) {
                                                i17 |= fetVar6.g(a4xVar) ? 32 : 16;
                                            }
                                            boolean z211 = true;
                                            byte b6 = 0;
                                            if (fetVar6.U(i17 & 1, (i17 & 147) != 146)) {
                                                boolean z212 = p6t0Var instanceof kxs;
                                                l7m0 l7m0Var20 = l7m0Var117;
                                                if (z212) {
                                                    fetVar6.e0(-436445846);
                                                    if (!((Boolean) l7m0Var116.getValue()).booleanValue() || (!mrv.y(l7m0Var20) && z29)) {
                                                        z211 = false;
                                                    }
                                                    uts0 uts0Var4 = w3m.f38508a;
                                                    mm40 mm40VarE0 = o2e.e0(kbc.O(jm40.b, new o3m(z211, i3mVar5, b6)), "GAME_STREAM");
                                                    z5s z5sVar3 = z5sVar2;
                                                    zss.b(mm40VarE0, l7m0Var115, sekVar2, bekVar2, z5sVar3.d, z5sVar3.e, p7x.D(a4xVar, z28), function14, fetVar6, 0);
                                                    fetVar6.r(false);
                                                } else {
                                                    fetVar6.e0(-1815155099);
                                                    boolean z213 = z210;
                                                    ugd ugdVar3 = ugdVar2;
                                                    if (!z213 || mrv.y(l7m0Var20)) {
                                                        fetVar6.e0(-434975671);
                                                        ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i17 & 14));
                                                        fetVar6.r(false);
                                                    } else {
                                                        fetVar6.e0(-435188114);
                                                        tj30 tj30VarC11 = zq8.c(gqw0.f11754a, false);
                                                        int iHashCode17 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM17 = fetVar6.m();
                                                        mm40 mm40VarC16 = kbc.c0(fetVar6, mm40Var4);
                                                        mkd.c0.getClass();
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(e7z.u1);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, tj30VarC11, gqw0.x);
                                                        jpm0.o(fetVar6, bh90VarM17, gqw0.w);
                                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode17), gqw0.y);
                                                        jpm0.n(fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC16, gqw0.v);
                                                        ugdVar3.F(p6t0Var, fetVar6, Integer.valueOf(i17 & 14));
                                                        fetVar6.r(true);
                                                        fetVar6.r(false);
                                                    }
                                                    fetVar6.r(false);
                                                }
                                            } else {
                                                fetVar6.X();
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar5), fetVar5, 24576);
                                } else {
                                    fetVar5.X();
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar3), fetVar3, 56);
                        fetVar3.r(false);
                        function10 = function9;
                        fetVar4 = fetVar3;
                        shdVar5 = shdVar;
                        zx7Var2 = zx7Var;
                        shdVar7 = shdVar2;
                        shdVar6 = shdVar3;
                        shdVar8 = shdVar4;
                    }
                    z20 = true;
                } else {
                    shdVar5 = shdVar;
                    function10 = function9;
                    shdVar9 = shdVar4;
                    shdVar6 = shdVar3;
                    fetVar4 = fetVar3;
                    shdVar7 = shdVar2;
                    zx7Var2 = zx7Var;
                    z18 = false;
                    fetVar4.e0(-151820422);
                    fetVar4.r(false);
                }
                shdVar8 = shdVar9;
                z20 = true;
            } else {
                z3 = z3;
                shdVar5 = shdVar;
                function10 = function9;
                i3mVar = i3mVar;
                shdVar6 = shdVar3;
                fetVar4 = fetVar3;
                shdVar7 = shdVar2;
                zBooleanValue2 = zBooleanValue2;
                zx7Var2 = zx7Var;
                z18 = false;
                fetVar4.e0(-412248100);
                mm40 mm40VarR6 = knm0.r(n0qVar);
                tj30 tj30VarC11 = zq8.c(zx7Var2, false);
                int iHashCode17 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM17 = fetVar4.m();
                mm40 mm40VarC16 = kbc.c0(fetVar4, mm40VarR6);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function10);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC11, shdVar5);
                jpm0.o(fetVar4, bh90VarM17, shdVar7);
                vqd.u(iHashCode17, fetVar4, shdVar6, fetVar4);
                jpm0.o(fetVar4, mm40VarC16, shdVar4);
                mdm mdmVar6 = ((lss) qssVar).f20596a;
                if ((i9 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objP14 = fetVar4.P();
                if (z19) {
                    objP14 = new pk9(function0, (byte) 14);
                    fetVar4.o0(objP14);
                } else {
                    objP14 = new pk9(function0, (byte) 14);
                    fetVar4.o0(objP14);
                }
                shdVar8 = shdVar4;
                jcb.l(null, mdmVar6, false, (Function0) objP14, fetVar4, 0, 5);
                z20 = true;
                fetVar4.r(true);
                fetVar4.r(false);
            }
            fetVar4.r(z20);
            qssVar3 = (qss) l7m0Var5.getValue();
            if (qssVar3 instanceof nss) {
                fetVar4.e0(1297340159);
                tj30 tj30VarC12 = zq8.c(zx7Var2, z18);
                int iHashCode18 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM18 = fetVar4.m();
                mm40 mm40VarC17 = kbc.c0(fetVar4, n0qVar);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function10);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC12, shdVar5);
                jpm0.o(fetVar4, bh90VarM18, shdVar7);
                vqd.u(iHashCode18, fetVar4, shdVar6, fetVar4);
                jpm0.o(fetVar4, mm40VarC17, shdVar8);
                jcb.l(null, ((nss) qssVar3).f24063a, false, null, fetVar4, 0, 13);
                fetVar4.r(true);
                fetVar4.r(z18);
            } else {
                fetVar4.e0(1297527554);
                fetVar4.r(z18);
            }
            xexVar.l(cyberBottomSheetParams, i3mVar, d9zVarA, l7m0Var8, ((Boolean) l7m0Var111.getValue()).booleanValue(), ((Boolean) l7m0Var9.getValue()).booleanValue(), y(l7m0Var11), zBooleanValue2, fetVar4, (i9 & 112) | 24582 | ((i9 << 27) & 1879048192));
            d9zVar2 = d9zVarA;
        } else {
            fetVar.X();
            d9zVar2 = d9zVar;
            z3 = z;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hpg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, d9zVar2, z3, function0, function1, function2, function3, function4, function5, function6, function7, ugdVar, (fet) obj3, iL, iL2, i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final boolean y(l7m0 l7m0Var) {
        return ((Boolean) l7m0Var.getValue()).booleanValue();
    }

    public static final void z(mm40 mm40Var, c3n c3nVar, float f2, Function1 function1, fet fetVar, int i2) {
        long backgroundContent;
        fetVar.g0(1124239094);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(c3nVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(mm40Var, 108.0f), 1.0f), f2, 0.0f, 2);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarL);
            y3d y3dVar = c3nVar.b;
            if (y3dVar == null) {
                fetVar.e0(-1937973625);
                backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                fetVar.r(false);
            } else {
                fetVar.e0(-1937974958);
                fetVar.r(false);
                backgroundContent = y3dVar.f41946a;
            }
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, jd8.n);
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((byte) 3, (Object) c3nVar, function1);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarQ, null, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 196608, 458);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, (Object) c3nVar, f2, (wdr) function1, i2, (byte) 7);
        }
    }
}
