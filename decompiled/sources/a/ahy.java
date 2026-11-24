package a;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
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
public abstract class ahy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f898a = new ugd(-1440835782, false, new zgd(14));
    public static final ugd b = new ugd(904794692, false, new ehd(6));
    public static final ugd c = new ugd(1393416707, false, new lhd(0));
    public static final ugd d = new ugd(-1080533638, false, new qhd(1));
    public static final int[] e = {13, 15, 14};

    public static final void A(float f, j8l0 j8l0Var, List list, fet fetVar, int i) {
        int i2;
        int i3;
        int i4;
        jm40 jm40Var;
        int i5;
        boolean z;
        mm40 mm40VarL;
        int i6 = i;
        fetVar.g0(-931020387);
        int i7 = i6 & 6;
        jm40 jm40Var2 = jm40.b;
        int i8 = 2;
        if (i7 == 0) {
            i2 = (fetVar.g(jm40Var2) ? 4 : 2) | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i2 |= fetVar.e(j8l0Var.ordinal()) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i2 |= (i6 & 4096) == 0 ? fetVar.g(list) : fetVar.i(list) ? 2048 : 1024;
        }
        boolean z2 = false;
        int i9 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, f, 0.0f, 24.0f, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            fetVar.e0(-532599748);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p6t0 p6t0Var = (p6t0) it.next();
                if (p6t0Var == null) {
                    i4 = i6;
                    jm40Var = jm40Var2;
                    i5 = i8;
                    z = z2;
                } else {
                    if (p6t0Var instanceof rfl0) {
                        fetVar.e0(669348546);
                        if (lgl0.f20015a[j8l0Var.ordinal()] == i9) {
                            fetVar.e0(669464951);
                            mm40 mm40VarL2 = s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, i8);
                            zcl zclVar2 = qmk.f28987a;
                            mm40VarL = s5x0.N(mm40VarL2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            fetVar.r(z2);
                        } else {
                            fetVar.e0(669720670);
                            mm40VarL = s5x0.L(jm40Var2, xfn.a(fetVar).d, 0.0f, i8);
                            fetVar.r(z2);
                        }
                        boolean z3 = z2;
                        nkb.h(mm40VarL, ((rfl0) p6t0Var).f30394a, kjm.b, null, null, null, fetVar, 384, 56);
                        fetVar.r(z3);
                        z2 = z3 ? 1 : 0;
                        i6 = i6;
                        i8 = i8;
                        jm40Var2 = jm40Var2;
                    } else {
                        i4 = i6;
                        jm40Var = jm40Var2;
                        i5 = i8;
                        z = z2;
                        if (p6t0Var instanceof qfl0) {
                            fetVar.e0(670136442);
                            mm40 mm40VarL3 = s5x0.L(o7k0.c(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, i5);
                            zcl zclVar3 = qmk.f28987a;
                            C(z ? 1 : 0, fetVar, s5x0.N(mm40VarL3, 0.0f, 0.0f, 0.0f, 6.0f, 7));
                            fetVar.r(z);
                        } else if (p6t0Var instanceof rer0) {
                            fetVar.e0(670490958);
                            zcl zclVar4 = qmk.f28987a;
                            qcc.m(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), ((rer0) p6t0Var).f30350a, null, fetVar, 12);
                            fetVar.r(z);
                        }
                        i6 = i4;
                        jm40Var2 = jm40Var;
                        i8 = i5;
                        z2 = z;
                    }
                    i9 = 1;
                }
                fetVar.e0(670701851);
                fetVar.r(z);
                i6 = i4;
                jm40Var2 = jm40Var;
                i8 = i5;
                z2 = z;
                i9 = 1;
            }
            i3 = i6;
            fetVar.r(z2);
            fetVar.r(true);
        } else {
            i3 = i6;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm(f, j8l0Var, list, i3);
        }
    }

    public static final void B(kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zcz zczVar2;
        fetVar.g0(2060476328);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            zczVar2 = zczVar;
            i2 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            n0q n0qVar = o7k0.c;
            float f = kfl0Var.e;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, z ? 12.0f : 24.0f, 5);
            int i3 = i2 & 112;
            int i4 = 458752 & i2;
            boolean z2 = (i3 == 32) | (i4 == 131072);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new u5l0((byte) 6, (Object) kfl0Var, function1);
                fetVar.o0(objP);
            }
            ydx.u(n0qVar, kfl0Var, zczVar2, j700Var, lh80VarU, function1, (Function1) objP, fetVar, (i2 & 7168) | ((i2 >> 6) & 896) | i3 | i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fgl0(kfl0Var, z, j700Var, zczVar, function1, i, (byte) 3);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1479212934);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarE = o7k0.e(mm40Var.e(o7k0.c), ((Configuration) fetVar.k(dy2.f6873a)).screenHeightDp * 0.8f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 25);
        }
    }

    public static final void D(kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zcz zczVar2;
        fetVar.g0(1389010364);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            zczVar2 = zczVar;
            i2 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f = kfl0Var.e;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, z ? 12.0f : 24.0f, 5);
            int i3 = i2 & 112;
            int i4 = 458752 & i2;
            boolean z2 = (i3 == 32) | (i4 == 131072) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new egl0(kfl0Var, function1, z, b2);
                fetVar.o0(objP);
            }
            ydx.u(mm40VarQ, kfl0Var, zczVar2, j700Var, lh80VarU, function1, (Function1) objP, fetVar, (i2 & 7168) | ((i2 >> 6) & 896) | i3 | i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fgl0(kfl0Var, z, j700Var, zczVar, function1, i, (byte) 0);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(887219174);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            rz4.t(jm40Var, 6.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 26);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(572903562);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(((g94) l7m0Var.getValue()).f10893a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new fj4(function1, (byte) 3);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 13);
        }
    }

    public static final void G(sma0 sma0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(624287936);
        int i2 = (fetVar.g(sma0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar).d, 16.0f, xfn.a(fetVar).d, 16.0f);
            a4x a4xVar = sma0Var.d;
            boolean z = sma0Var.c;
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            byte b3 = 28;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new l3a0(sma0Var, b3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hs80(function1, b3);
                fetVar.o0(objP2);
            }
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, z, function0, (Function1) objP2, fetVar, 384, 0);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1703865718, new lma0(sma0Var, b2), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(sma0Var, function1, i, (byte) 9);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-653157145);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0VarC = ((vma0) l7m0Var.getValue()).c();
            zdm0 zdm0Var = ((vma0) l7m0Var.getValue()).b().f11534a;
            j9m0 j9m0Var = ((vma0) l7m0Var.getValue()).b().b;
            boolean zA = ((vma0) l7m0Var.getValue()).a();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i0a0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 27);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0VarC, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(-722152843, new dqz(l7m0Var, function1, (byte) 9), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void I(rma0 rma0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(1636460722);
        int i2 = (fetVar.g(rma0Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new kma0(b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            byte b3 = 14;
            b2 = (i2 & 14) == 4 ? (byte) 1 : (byte) 0;
            Object objP2 = fetVar.P();
            if (b2 != 0 || objP2 == cl5Var) {
                objP2 = new yr80(rma0Var, b3);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function1, n0qVar, (Function1) objP2, fetVar2, 54, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(rma0Var, i, (byte) 29);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1904112975);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new f7f0(l7m0Var, (byte) 5);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new f7f0(l7m0Var, (byte) 6);
                fetVar.o0(objP2);
            }
            K(u1c.M(-1687762053, new t5e0(l7m0VarY, function1, (byte) 19), fetVar), u1c.M(-1264171188, new xs4(v3c.Y(objArr2, (Function0) objP2, fetVar), function1, (byte) 9), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 20);
        }
    }

    public static final void K(ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        fetVar.g0(-400117387);
        if (fetVar.U(i & 1, (i & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarV = v2n0.v(o7k0.d(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 1.0f), new j0w0[]{h0w0.f12254a}, fetVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarV);
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
            ugdVar.invoke(fetVar, 6);
            fetVar.r(true);
            ugdVar2.F(y5d.f42040a, fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0(ugdVar, ugdVar2, i, (byte) 4);
        }
    }

    public static final void L(mm40 mm40Var, float f, j8l0 j8l0Var, j700 j700Var, zcz zczVar, List list, fet fetVar, int i) {
        mm40 mm40Var2;
        mm40 mm40VarV;
        fetVar.g0(-430011509);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(j8l0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? fetVar.g(list) : fetVar.i(list) ? 131072 : 65536;
        }
        if (!fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.X();
            mm40Var2 = mm40Var;
        } else {
            if (j8l0Var == j8l0.MEDIUM_ITEMS_LINE_SEPARATOR || j8l0Var == j8l0.MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS) {
                fetVar.e0(1414954048);
                A(f, j8l0Var, list, fetVar, ((i2 >> 6) & 7168) | (i2 & 1022));
                fetVar.r(false);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new pt1(f, j8l0Var, j700Var, zczVar, list, i);
                    return;
                }
                return;
            }
            fetVar.e0(1415129911);
            fetVar.r(false);
            xcz xczVarA = zczVar.a("SPORT_SCREEN_SHIMMERS" + j700Var, fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new gg90(xczVarA, (byte) 17);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            jm40 jm40Var = jm40.b;
            if (e2dVar != null) {
                fetVar.e0(1415519705);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new f7f0(l7m0VarY, (byte) 20);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(jm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(1415678239);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            mm40 mm40VarQ = i120.Q(mm40VarV.e(o7k0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            byte b2 = 5;
            lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, 24.0f, 5);
            boolean z = ((458752 & i2) == 131072 || ((i2 & 262144) != 0 && fetVar.i(list))) | ((i2 & 896) == 256);
            Object objP3 = fetVar.P();
            if (z || objP3 == obj) {
                objP3 = new u5l0(list, j8l0Var, b2);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarQ, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP3, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40Var;
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new zh2(mm40Var2, f, j8l0Var, j700Var, zczVar, list, i);
        }
    }

    public static final void M(kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zcz zczVar2;
        fetVar.g0(1758889202);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            zczVar2 = zczVar;
            i2 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            float f = kfl0Var.e;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, z ? 12.0f : 24.0f, 5);
            int i3 = i2 & 112;
            int i4 = 458752 & i2;
            boolean z2 = (i3 == 32) | (i4 == 131072) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new egl0(kfl0Var, function1, z, b2);
                fetVar.o0(objP);
            }
            ydx.u(mm40VarQ, kfl0Var, zczVar2, j700Var, lh80VarU, function1, (Function1) objP, fetVar, (i2 & 7168) | ((i2 >> 6) & 896) | i3 | i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fgl0(kfl0Var, z, j700Var, zczVar, function1, i, (byte) 2);
        }
    }

    public static final void N(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1812405264);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 24.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            rz4.t(jm40Var, 16.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 27);
        }
    }

    public static final void O(mm40 mm40Var, mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(2096081598);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, i2 & 112, 13);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i, (byte) 3);
        }
    }

    public static final void P(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1450820691);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uck0(function1, (byte) 22);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i, (byte) 3);
        }
    }

    public static final void Q(mm40 mm40Var, l7m0 l7m0Var, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fet fetVar2;
        hn8 hn8Var;
        boolean z;
        Function1 function2 = function1;
        l7m0Var.getClass();
        zczVar.getClass();
        function2.getClass();
        fetVar.g0(-1543209666);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(zczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = 57344 & i2;
            boolean z2 = i3 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new uck0(function2, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 16384;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new uck0(function2, (byte) 21);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            ogl0 ogl0Var = (ogl0) l7m0Var2.getValue();
            mm40 mm40VarR = knm0.r(mm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = j120.K(mm40VarR, s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7));
            hn8 hn8Var2 = ogl0Var.b;
            mm40 mm40VarP = o050.P(j120.K(mm40VarK, s5x0.u(0.0f, 0.0f, 0.0f, hn8Var2.f13337a ? 12.0f : 0.0f, 7)));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            int i4 = i2;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            pfl0 pfl0Var = ogl0Var.f25226a;
            if (pfl0Var instanceof nfl0) {
                fetVar.e0(-102606146);
                fetVar.r(false);
                function2 = function1;
                hn8Var = hn8Var2;
                fetVar2 = fetVar;
                z = true;
            } else if (pfl0Var instanceof ofl0) {
                fetVar.e0(-280402390);
                ofl0 ofl0Var = (ofl0) pfl0Var;
                fetVar2 = fetVar;
                L(null, ofl0Var.b, ofl0Var.f25175a, j700Var, zczVar, ofl0Var.c, fetVar2, (i4 << 3) & 64512);
                fetVar2.r(false);
                function2 = function1;
                hn8Var = hn8Var2;
                z = true;
            } else if (pfl0Var instanceof kfl0) {
                fetVar.e0(-280391246);
                function2 = function1;
                hn8Var = hn8Var2;
                z = true;
                o(null, (kfl0) pfl0Var, hn8Var2.f13337a, j700Var, zczVar, function2, fetVar, (i4 << 3) & 523264);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                function2 = function1;
                hn8Var = hn8Var2;
                fetVar2 = fetVar;
                z = true;
                if (pfl0Var instanceof lfl0) {
                    fetVar2.e0(-280379909);
                    O(null, ((lfl0) pfl0Var).f19963a, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    if (!(pfl0Var instanceof mfl0)) {
                        throw b1j.f(-280406504, fetVar2, false);
                    }
                    fetVar2.e0(-280374898);
                    P(null, ((mfl0) pfl0Var).f21700a, function2, fetVar2, (i4 >> 6) & 896);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
            R(hn8Var, function2, fetVar2, (i4 >> 9) & 112);
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qdb(mm40Var, l7m0Var, j700Var, zczVar, function2, i, (byte) 1);
        }
    }

    public static final void R(hn8 hn8Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(973247653);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hn8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (hn8Var.f13337a) {
            fetVar.e0(-1303221122);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            mtl mtlVar = hn8Var.b;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new elk0(function1, (byte) 14);
                fetVar.o0(objP);
            }
            y860.n(null, mtlVar, lh80VarU, (Function1) objP, fetVar, 1);
            fetVar.r(false);
        } else {
            fetVar.e0(-1302785603);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sdb(hn8Var, function1, i, b2);
        }
    }

    public static final void S(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-311998672);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            g1x.l(s5x0.L(n0qVar, qmk.a(fetVar).d, 0.0f, 2), jiq0.l, fetVar, 48, 0);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 12);
        }
    }

    public static final void T(int i, fet fetVar) {
        fetVar.g0(1870729138);
        if (fetVar.U(i & 1, i != 0)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            U(0, fetVar, null);
            V(0, fetVar, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i, (byte) 6);
        }
    }

    public static final void U(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1451294674);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 12.0f, 4.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 120.0f), 14.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, o7k0.e(jm40Var, 6.0f));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(jm40Var, 64.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 60.0f), 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 16);
        }
    }

    public static final void V(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-228385029);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 138.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 15);
        }
    }

    public static final void W(mm40 mm40Var, fgv0 fgv0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Window window;
        WindowManager.LayoutParams attributes;
        fetVar.g0(-322457230);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(fgv0Var) : fetVar.i(fgv0Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (a8k0.A()) {
                fetVar.e0(1518664571);
                Activity activity = (Activity) fetVar.k(cr00.f4820a);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
                    fetVar.o0(objP);
                }
                Integer num = (Integer) objP;
                Unit unit = Unit.f46060a;
                boolean zI = fetVar.i(activity);
                Object objP2 = fetVar.P();
                if (zI || objP2 == cl5Var) {
                    objP2 = new zfv0(activity, num, b2);
                    fetVar.o0(objP2);
                }
                m0x0.o(unit, (Function1) objP2, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1519176784);
                fetVar.r(false);
            }
            mm40 mm40VarP = o050.P(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            fetVar2 = fetVar;
            jcb.l(null, fgv0Var.c, false, null, fetVar2, 0, 13);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) fgv0Var, i, (byte) 21);
        }
    }

    public static final void X(fhl fhlVar, a9q0 a9q0Var, float f, float f2, boolean z) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (z) {
            jFloatToRawIntBits = Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f) - ((int) (a9q0Var.c >> 32)));
            iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        }
        v2n0.o(fhlVar, a9q0Var, StaticColors.INSTANCE.m130getWhite600d7_KjU(), (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32), 248);
    }

    public static final gbn Y(Function1 function1) {
        return new gbn(new hhd((byte) 14), new l9(3, (byte) 9), new y7(function1, (byte) 10), m9.k);
    }

    public static final x680 Z(int i, int i2, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (i <= 1) {
            return null;
        }
        return new x680("EVENT_COUNT_ID", ctf0Var.b.a(R.string.coupon_makebet_events, Arrays.copyOf(new Object[0], 0)), new zty(w6x.n(i2, i, Separators.SLASH)));
    }

    public static final void a(mm40 mm40Var, sql sqlVar, sql sqlVar2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1845835794);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(sqlVar) ? 32 : 16) | (fetVar2.g(sqlVar2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
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
            mm40 mm40VarS = o7k0.s(jm40Var, 128.0f);
            xx7 xx7Var = gqw0.n;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 80.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarN, null, null, fetVar2, 48, 2040);
            String str = sqlVar.b;
            y9q0 y9q0VarG = h97.g(fetVar);
            long secondary = afn0.m(fetVar).getSecondary();
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            v8q0.a(str, null, secondary, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110578);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str2 = sqlVar.c;
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarQ = g1t0.q();
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            long j4 = qmk.s;
            long j5 = qmk.u;
            v8q0.a(str2, mm40VarN2, textPrimary, new n05(j4, j5, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarQ, fetVar, 0, 24960, 110576);
            fetVar.r(true);
            mm40 mm40VarS2 = o7k0.s(jm40Var, 128.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarN3 = o7k0.n(jm40Var, 80.0f);
            o0x o0xVar2 = sqlVar2.f32635a;
            k7x.a(o0xVar2 != null ? o0xVar2.a() : null, null, mm40VarN3, null, null, fetVar, 48, 2040);
            v8q0.a(sqlVar2.b, null, afn0.m(fetVar).getSecondary(), new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 110578);
            mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str3 = sqlVar2.c;
            afn0.v(fetVar).getClass();
            v8q0.a(str3, mm40VarN4, afn0.m(fetVar).getTextPrimary(), new n05(j4, j5, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mql(mm40Var, sqlVar, sqlVar2, i, (byte) 0);
        }
    }

    public static final List a0(xgy xgyVar) {
        xgyVar.getClass();
        qpy qpyVarX = xgyVar.X();
        Class cls = xgyVar.b;
        if (qpyVarX != null) {
            hny.v(xgyVar, "Should be called only for Java classes: ");
            return null;
        }
        if (cls.isAnnotation()) {
            return iun.f15405a;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            n9y n9yVar = (Modifier.isStatic(method.getModifiers()) || method.isSynthetic()) ? null : new n9y(xgyVar, method, op9.NO_RECEIVER, rgy.k);
            if (n9yVar != null) {
                arrayList.add(n9yVar);
            }
        }
        return arrayList;
    }

    public static final void b(mm40 mm40Var, nyq0 nyq0Var, boolean z, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Object obj;
        nyq0Var.getClass();
        fetVar.g0(1211871200);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(nyq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = ugdVar2;
            i3 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = ugdVar2;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i5 & 896;
            int i7 = i5 & 112;
            boolean z2 = (i6 == 256) | (i7 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new pa(z, nyq0Var, (yje) null);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            boolean z3 = ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | (i7 == 32) | (i6 == 256);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                i4a0 i4a0Var = new i4a0((Object) ugdVar, obj, (Object) nyq0Var, z, (byte) 3);
                fetVar.o0(i4a0Var);
                objP2 = i4a0Var;
            }
            x4n0.a(mm40Var3, (Function2) objP2, fetVar, i5 & 14, 0);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(mm40Var2, (Object) nyq0Var, z, (xdr) ugdVar, (xdr) ugdVar2, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    public static final List b0(xgy xgyVar, cr30 cr30Var, rq30 rq30Var) {
        ock ockVar;
        zgy zgyVar = new zgy(xgyVar, (byte) 0);
        Collection<vjj> collectionT = uvw.t(cr30Var, null, 3);
        ArrayList arrayList = new ArrayList();
        for (vjj vjjVar : collectionT) {
            if (vjjVar instanceof mp9) {
                mp9 mp9Var = (mp9) vjjVar;
                if (Intrinsics.d(mp9Var.getVisibility(), uek.h)) {
                    ockVar = null;
                } else if ((mp9Var.l() != 2) == (rq30Var == rq30.f30912a)) {
                    ockVar = (ock) vjjVar.i0(zgyVar, Unit.f46060a);
                } else {
                    ockVar = null;
                }
            } else {
                ockVar = null;
            }
            if (ockVar != null) {
                arrayList.add(ockVar);
            }
        }
        return CollectionsKt.L0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3  */
    public static final void c(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        byte b2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(-583798433);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b3 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            imm immVar = ((cj1) l7m0Var.getValue()).f4439a;
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP2 == cl5Var2) {
                objP2 = new si1(function1, b3);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var2) {
                objP3 = new h61(function1, (byte) 9);
                fetVar2.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z5 || objP4 == cl5Var2) {
                objP4 = new h61(function1, (byte) 10);
                fetVar2.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean z6 = i3 == 256;
            Object objP5 = fetVar2.P();
            if (z6 || objP5 == cl5Var2) {
                b2 = 1;
                objP5 = new si1(function1, b2);
                fetVar2.o0(objP5);
            } else {
                b2 = 1;
            }
            hlm.c(null, immVar, null, function0, null, function2, function3, null, (Function0) objP5, null, null, null, fetVar, 0, 0, 3733);
            fetVar2 = fetVar;
            d9z d9zVarA = f9z.a(fetVar2);
            li1 li1Var = ((cj1) l7m0Var.getValue()).b;
            boolean z7 = li1Var instanceof ki1;
            jm40 jm40Var = jm40.b;
            if (z7) {
                x7z x7zVarF = rz4.f(fetVar2, 1624164946, 1.0f, true);
                ki1 ki1Var = (ki1) li1Var;
                col colVar = ki1Var.b;
                zcl zclVar = qmk.f28987a;
                lh80 lh80Var = new lh80(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f);
                boolean z8 = i3 == 256;
                Object objP6 = fetVar2.P();
                if (z8) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP6 == cl5Var) {
                    }
                    cl5 cl5Var3 = cl5Var;
                    wvb.k(x7zVarF, colVar, d9zVarA, lh80Var, null, (Function2) objP6, fetVar2, 0, 16);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    ma80 ma80Var = ma80.b;
                    mtl mtlVar = ki1Var.f18314a;
                    if (i3 == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = fetVar2.P();
                    if (z || objP == cl5Var3) {
                        objP = new h61(function1, (byte) 7);
                        fetVar2.o0(objP);
                    }
                    bkb.f(mm40VarD, mtlVar, ma80Var, false, null, (Function1) objP, fetVar2, 390, 24);
                    fetVar2.r(false);
                }
                objP6 = new ag0(function1, (byte) 8);
                fetVar2.o0(objP6);
                cl5 cl5Var4 = cl5Var;
                wvb.k(x7zVarF, colVar, d9zVarA, lh80Var, null, (Function2) objP6, fetVar2, 0, 16);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                ma80 ma80Var2 = ma80.b;
                mtl mtlVar2 = ki1Var.f18314a;
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z) {
                    objP = new h61(function1, (byte) 7);
                    fetVar2.o0(objP);
                } else {
                    objP = new h61(function1, (byte) 7);
                    fetVar2.o0(objP);
                }
                bkb.f(mm40VarD2, mtlVar2, ma80Var2, false, null, (Function1) objP, fetVar2, 390, 24);
                fetVar2.r(false);
            } else {
                byte b4 = 0;
                if (li1Var instanceof hi1) {
                    fetVar2.e0(1625794058);
                    hi1 hi1Var = (hi1) li1Var;
                    bol bolVar = hi1Var.b;
                    fetVar2.e0(1625862878);
                    a4x a4xVar = bolVar.f2938a;
                    boolean z9 = i3 == 256;
                    Object objP7 = fetVar2.P();
                    if (z9 || objP7 == cl5Var2) {
                        objP7 = new nr0(function1, (byte) 28);
                        fetVar2.o0(objP7);
                    }
                    Function0 function4 = (Function0) objP7;
                    boolean zG = fetVar2.g(d9zVarA) | fetVar2.g(function4);
                    Object objP8 = fetVar2.P();
                    if (zG || objP8 == cl5Var2) {
                        objP8 = new xi1(d9zVarA, function4, null, b4);
                        fetVar2.o0(objP8);
                    }
                    m0x0.t(fetVar2, a4xVar, (Function2) objP8);
                    fetVar2.r(false);
                    x7z x7zVar = new x7z(1.0f, true);
                    zcl zclVar2 = qmk.f28987a;
                    lh80 lh80Var2 = new lh80(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f);
                    boolean z10 = i3 == 256;
                    Object objP9 = fetVar2.P();
                    if (z10 || objP9 == cl5Var2) {
                        objP9 = new ag0(function1, (byte) 7);
                        fetVar2.o0(objP9);
                    }
                    wvb.k(x7zVar, bolVar, d9zVarA, lh80Var2, null, (Function2) objP9, fetVar2, 0, 16);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    ma80 ma80Var3 = ma80.b;
                    mtl mtlVar3 = hi1Var.f13091a;
                    boolean z11 = i3 == 256;
                    Object objP10 = fetVar2.P();
                    if (z11 || objP10 == cl5Var2) {
                        objP10 = new h61(function1, (byte) 6);
                        fetVar2.o0(objP10);
                    }
                    bkb.f(mm40VarD3, mtlVar3, ma80Var3, false, null, (Function1) objP10, fetVar2, 390, 24);
                    fetVar2.r(false);
                } else if (li1Var instanceof ji1) {
                    fetVar2.e0(1627933771);
                    mm40 mm40VarS = o050.S(n0qVar);
                    WeakHashMap weakHashMap = djv0.w;
                    mm40 mm40VarP = o050.P(j120.L(mm40VarS, zcm0.i(fetVar2).e));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarP);
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
                    mdm mdmVar = ((ji1) li1Var).f16554a;
                    boolean z12 = i3 == 256;
                    Object objP11 = fetVar2.P();
                    if (z12 || objP11 == cl5Var2) {
                        objP11 = new nr0(function1, (byte) 29);
                        fetVar2.o0(objP11);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP11, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    if (!(li1Var instanceof ii1)) {
                        throw b1j.f(-1610174505, fetVar2, false);
                    }
                    fetVar2.e0(1628610501);
                    m8x.y(null, null, u1c.M(-758636039, new znk(mm40Var, li1Var, function1, (byte) 20), fetVar2), null, null, 0, 0L, 0L, null, u1c.M(546912963, new ri1(mm40Var, li1Var, b4), fetVar2), fetVar, 805306752, 507);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 3);
        }
    }

    public static final n0x c0(vql vqlVar, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        String str = "";
        if (z) {
            if (vqlVar == vql.d) {
                str = "Color_Bottom.webp";
            }
        } else if (z2) {
            int iOrdinal = vqlVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    str = z4 ? "Cup_Inactive_Wait.webp" : null;
                    if (str == null) {
                        str = "Cup.webp";
                    }
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    str = z4 ? "Color_Inactive_Wait.webp" : null;
                    if (str == null) {
                        str = "Color_Top.webp";
                    }
                } else if (!z3) {
                    str = z4 ? "Icon_Inactive_Wait.webp" : "Icon_Inactive.webp";
                } else if (i == 1) {
                    str = "Icon_Gold.webp";
                } else if (i != 2) {
                    str = i != 3 ? "Icon_Other.webp" : "Icon_Bronze.webp";
                } else {
                    str = "Icon_Silver.webp";
                }
            } else if (!z3) {
                str = z4 ? "Chevron_Inactive_Wait.webp" : "Chevron_Inactive.webp";
            } else if (i == 1) {
                str = "Chevron_Gold.webp";
            } else if (i != 2) {
                str = i != 3 ? "Chevron_Other.webp" : "Chevron_Bronze.webp";
            } else {
                str = "Chevron_Silver.webp";
            }
        } else if (vqlVar == vql.f37860a && z3) {
            str = "Chevron_Points.webp";
        }
        if (str.length() <= 0) {
            return null;
        }
        List list = u0d.f34849a;
        return new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_progress/".concat(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v9, types: [a.fet] */
    public static final void d(mm40 mm40Var, ob4 ob4Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        ?? r8;
        pcy pcyVar;
        jm40 jm40Var;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        int i3;
        boolean z;
        int i4;
        jm40 jm40Var2;
        float f;
        boolean z2;
        ?? r11;
        fet fetVar2;
        ?? r9;
        ?? r0;
        boolean z3;
        Function1 function3 = function1;
        fet fetVar3 = fetVar;
        ob4Var.getClass();
        function3.getClass();
        fetVar3.g0(396758485);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(ob4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.i(function2) ? 2048 : 1024;
        }
        if (fetVar3.U(i2 & 1, (i2 & 1171) != 1170)) {
            wpq wpqVar = (wpq) fetVar3.k(bmd.i);
            pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
            View rootView = ((View) fetVar3.k(dy2.f)).getRootView();
            g8x.U(null, fetVar3, 1);
            boolean zG = fetVar3.g(wpqVar) | fetVar3.g(pkk0Var);
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new za4(wpqVar, pkk0Var);
                fetVar3.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = i2;
            v3c.A(null, function0, null, fetVar3, 0, 5);
            mm40 mm40VarL = s5x0.L(o7k0.d(mm40Var, 1.0f), xfn.a(fetVar3).e, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarL);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z4 = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar6);
            jpm0.n(fetVar3);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar7);
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 44.0f);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarW = o7k0.w(mm40VarE, yx7Var, false, 2);
            String str = ob4Var.h;
            y9q0 y9q0VarS = g1t0.s();
            zfn zfnVar = zaq0.b;
            Unit unit = null;
            v8q0.a(str, mm40VarW, ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), new n05(qmk.u, qmk.y, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarS, fetVar3, 0, 24960, 110576);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var3, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z5 = (i5 & 112) == 32;
            Object objP2 = fetVar3.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new a13(ob4Var, (byte) 23);
                fetVar3.o0(objP2);
            }
            mm40 mm40VarA0 = qxw.a0(mm40VarN, (Function0) objP2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarA0);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar2;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar3, shdVar6, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar7);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            jwb.e(Boolean.valueOf(ob4Var.c), new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, u1c.M(-1981585444, new ab4((Object) ob4Var, (Object) function1, (byte) 0), fetVar3), fetVar, 24576, 12);
            wul wulVar = ob4Var.i;
            if (wulVar == null) {
                fetVar.e0(-498422060);
                fetVar.r(false);
                jm40Var = jm40Var3;
                shdVar2 = shdVar5;
                shdVar = shdVar6;
                shdVar3 = shdVar7;
                z = true;
                i3 = 256;
            } else {
                fetVar.e0(-498422059);
                jm40Var = jm40Var3;
                mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 44.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar5);
                shdVar = shdVar6;
                vqd.u(iHashCode3, fetVar, shdVar, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar7);
                boolean z6 = (i5 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z6 || objP3 == cl5Var) {
                    objP3 = new zk2(function1, (byte) 28);
                    fetVar.o0(objP3);
                }
                shdVar2 = shdVar5;
                shdVar3 = shdVar7;
                i3 = 256;
                qzb.n(null, wulVar, (Function0) objP3, fetVar, 0, 1);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            }
            fetVar.r(z);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z7 = z;
            c6q0 c6q0Var = ob4Var.f;
            int i6 = i5 & 896;
            boolean z8 = i6 == i3 ? z7 : false;
            Object objP4 = fetVar.P();
            if (z8 || objP4 == cl5Var) {
                objP4 = new wc2(function1, (byte) 12);
                fetVar.o0(objP4);
            }
            shd shdVar8 = shdVar;
            jm40 jm40Var4 = jm40Var;
            shd shdVar9 = shdVar2;
            wvb.t(mm40VarN3, c6q0Var, 7, null, (Function1) objP4, fetVar, 384, 8);
            fet fetVar4 = fetVar;
            mm40 mm40VarN4 = s5x0.N(o7k0.d(jm40Var4, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            boolean zI = fetVar4.i(rootView) | ((i5 & 7168) == 2048);
            Object objP5 = fetVar4.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new bb4(function2, rootView);
                fetVar4.o0(objP5);
            }
            mm40 mm40VarD0 = ro4.d0(mm40VarN4, (Function1) objP5);
            wul wulVar2 = ob4Var.k;
            boolean zG2 = fetVar4.g(function0) | (i6 == 256);
            Object objP6 = fetVar4.P();
            if (zG2 || objP6 == cl5Var) {
                objP6 = new mn(function0, function1, (byte) 4);
                fetVar4.o0(objP6);
            }
            qzb.n(mm40VarD0, wulVar2, (Function0) objP6, fetVar4, 0, 0);
            wul wulVar3 = ob4Var.j;
            if (wulVar3 == null) {
                fetVar4.e0(-20849306);
                fetVar4.r(false);
                i4 = 2;
            } else {
                fetVar4.e0(-20849305);
                mm40 mm40VarN5 = s5x0.N(o7k0.d(jm40Var4, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean zG3 = fetVar4.g(function0) | (i6 == 256);
                Object objP7 = fetVar4.P();
                if (zG3 || objP7 == cl5Var) {
                    i4 = 2;
                    objP7 = new mn(function0, function1, (byte) 2);
                    fetVar4.o0(objP7);
                } else {
                    i4 = 2;
                }
                qzb.n(mm40VarN5, wulVar3, (Function0) objP7, fetVar4, 0, 0);
                fetVar4.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar4.e0(1384812806);
                jm40Var2 = jm40Var4;
                qxw.o(fetVar4, o7k0.e(s5x0.N(jm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 40.0f));
                fetVar4.r(false);
            } else {
                jm40Var2 = jm40Var4;
                fetVar4.e0(1384799755);
                fetVar4.r(false);
            }
            if (ob4Var.d.isEmpty()) {
                f = 40.0f;
                z2 = false;
                r11 = 1;
                fetVar4.e0(-19734173);
                fetVar4.r(false);
                fetVar2 = fetVar4;
            } else {
                fetVar4.e0(-20271372);
                mm40 mm40VarN6 = s5x0.N(jm40Var2, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                List list = ob4Var.d;
                boolean zG4 = fetVar4.g(function0) | (i6 == 256);
                Object objP8 = fetVar4.P();
                if (zG4 || objP8 == cl5Var) {
                    objP8 = new ya4(function0, function1, (byte) 0);
                    fetVar4.o0(objP8);
                }
                Function1 function4 = (Function1) objP8;
                boolean zG5 = fetVar4.g(function0) | (i6 == 256);
                Object objP9 = fetVar4.P();
                if (zG5 || objP9 == cl5Var) {
                    z3 = true;
                    objP9 = new mn(function0, function1, (byte) 1);
                    fetVar4.o0(objP9);
                } else {
                    z3 = true;
                }
                f = 40.0f;
                r11 = z3;
                knx.g(mm40VarN6, list, function4, (Function0) objP9, fetVar, 0);
                fet fetVar5 = fetVar;
                z2 = false;
                fetVar5.r(false);
                fetVar2 = fetVar5;
            }
            xa4 xa4Var = ob4Var.l;
            if (xa4Var == null) {
                fetVar2.e0(-19651683);
                fetVar2.r(z2);
                function3 = function1;
                r0 = r11;
                r9 = fetVar2;
            } else {
                fetVar2.e0(-19651682);
                qxw.o(fetVar2, o7k0.g(jm40Var2, 24.0f, 0.0f, i4).e(new x7z(1.0f, r11)));
                mm40 mm40VarN7 = s5x0.N(o7k0.g(o7k0.d(jm40Var2, 1.0f), f, 0.0f, i4), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                thg0 thg0VarA2 = shg0.a(uc9.e, yx7Var, fetVar2, 54);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN7);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM4, shdVar9);
                vqd.u(iHashCode4, fetVar2, shdVar8, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar3);
                float dimension = ((Resources) fetVar2.k(dy2.c)).getDimension(R.dimen.auth_max_btn_with) / ((w6k) fetVar2.k(bmd.h)).getDensity();
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                mm40 mm40VarU = o7k0.u(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0.0f, dimension, r11);
                String str2 = xa4Var.f40535a;
                y9q0 y9q0VarN = g1t0.n();
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                f2q0 f2q0Var = new f2q0(6);
                boolean z9 = r11 == true ? 1 : 0;
                v8q0.a(str2, mm40VarU, secondary, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 2, 0, null, y9q0VarN, fetVar, 0, 24960, 109560);
                fet fetVar6 = fetVar;
                mm40 mm40VarU2 = o7k0.u(jm40Var2, 0.0f, dimension, z9 ? 1 : 0);
                wul wulVar4 = xa4Var.b;
                boolean z10 = (fetVar6.g(function0) ? 1 : 0) | (i6 == 256 ? z9 ? 1 : 0 : false);
                Object objP10 = fetVar6.P();
                if (z10 != 0 || objP10 == cl5Var) {
                    function3 = function1;
                    objP10 = new mn(function0, function3, (byte) 3);
                    fetVar6.o0(objP10);
                } else {
                    function3 = function1;
                }
                qzb.n(mm40VarU2, wulVar4, (Function0) objP10, fetVar6, 0, 0);
                fetVar6.r(z9);
                fetVar6.r(false);
                r0 = z9;
                r9 = fetVar6;
            }
            r9.r(r0);
            r8 = r9;
        } else {
            fetVar3.X();
            r8 = fetVar3;
        }
        yfe0 yfe0VarU = r8.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((Object) mm40Var, (Object) ob4Var, function3, (wdr) function2, i, (byte) 3);
        }
    }

    public static final String d0(vql vqlVar, ctf0 ctf0Var, String str) {
        int iOrdinal = vqlVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? ctf0Var.b.a(R.string.tournament_place, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.place, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.tournament_place_number_v2, Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-810521779);
        byte b2 = 2;
        int i3 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            wom womVarF = mom.f(fetVar);
            int i4 = i3 & 112;
            int i5 = i3 & 126;
            F(l7m0Var, function1, fetVar, i5);
            x1o x1oVar = ((g94) l7m0Var.getValue()).d;
            if (x1oVar.equals(w1o.f38412a)) {
                fetVar.e0(1445393341);
                n0q n0qVar = o7k0.c;
                zx7 zx7Var = gqw0.e;
                boolean z = ((g94) l7m0Var.getValue()).b;
                boolean z2 = i4 == 32;
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new fj4(function1, b2);
                    fetVar.o0(objP);
                }
                i2 = i5;
                mom.c(n0qVar, z, womVarF, zx7Var, false, null, (Function0) objP, null, u1c.M(-212855372, new xs4(l7m0Var, function1, b3), fetVar), fetVar, 100666374, 176);
                fetVar.r(false);
            } else {
                i2 = i5;
                if (!(x1oVar instanceof v1o)) {
                    throw b1j.f(1570643772, fetVar, false);
                }
                fetVar.e0(1445993873);
                o2e.i((i3 << 3) & 1008, fetVar, null, l7m0Var, function1);
                fetVar.r(false);
            }
            i(l7m0Var, function1, fetVar, i2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 11);
        }
    }

    public static final a9q0 e0(g9q0 g9q0Var, String str, long j) {
        return g9q0.a(g9q0Var, str, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), 2, 1, j, null, 968);
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(1038900795);
        byte b2 = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar), fetVar), null, y860.W(mm40Var, null, null, true, null, function0, 24), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i, b2);
        }
    }

    public static final Object f0(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj != null) {
            return obj;
        }
        e9d0.o();
        return null;
    }

    public static final void g(cj8 cj8Var, fet fetVar, int i) {
        cj8Var.getClass();
        fetVar.g0(1037224356);
        int i2 = (fetVar.g(cj8Var) ? 4 : 2) | i;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (cj8Var.equals(bj8.f2693a)) {
            fetVar.e0(1956220429);
            ArrayList arrayList = new ArrayList(4);
            for (int i3 = 0; i3 < 4; i3++) {
                arrayList.add(new Pair(Integer.valueOf(i3), oan.f24935a));
            }
            h(0, fetVar, arrayList);
            fetVar.r(false);
        } else {
            if (!(cj8Var instanceof aj8)) {
                throw b1j.f(340196704, fetVar, false);
            }
            fetVar.e0(1956478256);
            a4x<yi8> a4xVar = ((aj8) cj8Var).f961a;
            ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
            for (yi8 yi8Var : a4xVar) {
                arrayList2.add(new Pair(yi8Var.f42675a, yi8Var.b));
            }
            h(0, fetVar, arrayList2);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m87(cj8Var, i, (byte) 14);
        }
    }

    public static final mm40 g0(uaz uazVar, hru hruVar, boolean z, ma80 ma80Var) {
        return new qaz(uazVar, hruVar, z, ma80Var);
    }

    public static final void h(int i, fet fetVar, ArrayList arrayList) {
        fetVar.g0(-899868102);
        byte b2 = 2;
        int i2 = (fetVar.g(arrayList) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(o7k0.d(jm40.b, 1.0f), a8k0.G(xczVarA, fetVar), null);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(s5x0.u(0.0f, 16.0f, 0.0f, 24.0f, 5), fetVar);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uy2(arrayList, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mo1(arrayList, i);
        }
    }

    public static final t6h h0(h7h h7hVar, k7h k7hVar) {
        vbg vbgVar = k7hVar.i;
        long j = k7hVar.d;
        if (vbgVar instanceof tbg) {
            return new q6h(null, j);
        }
        if (!(vbgVar instanceof ubg)) {
            if (vbgVar != null) {
                return new r6h(j, null, false);
            }
            if (h7hVar != null && h7hVar.c) {
                return new q6h(Long.valueOf(h7hVar.f12573a), j);
            }
            if (h7hVar == null || !h7hVar.h) {
                if (h7hVar != null) {
                    return new r6h(j, Long.valueOf(h7hVar.f12573a), h7hVar.g.isEmpty());
                }
                if (k7hVar.h) {
                    return new q6h(null, j);
                }
                return null;
            }
        }
        return s6h.f31701a;
    }

    public static final void i(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-608337112);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hq8 hq8Var = ((g94) l7m0Var.getValue()).e;
            if (hq8Var instanceof eq8) {
                fetVar.e0(-496405427);
                thb.a((eq8) hq8Var, null, function1, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
            } else if (hq8Var instanceof fq8) {
                fetVar.e0(-496400183);
                zjb.b((fq8) hq8Var, null, function1, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
            } else {
                if (!(hq8Var instanceof gq8)) {
                    throw b1j.f(-496408322, fetVar, false);
                }
                fetVar.e0(1791593496);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 12);
        }
    }

    public static final h7h i0(k7h k7hVar) {
        Object next;
        Iterator<E> it = k7hVar.f17819a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((h7h) next).f12573a != k7hVar.c);
        h7h h7hVar = (h7h) next;
        return h7hVar == null ? (h7h) CollectionsKt.firstOrNull(k7hVar.f17819a) : h7hVar;
    }

    public static final void j(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-350506785);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 7);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarN, false, null, null, (Function0) objP, 15);
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_play, 6, fetVar2), fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            dww.c(s4u0VarR, null, mm40VarY, staticColors.m123getWhite0d7_KjU(), fetVar2, 56, 0);
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 8.0f, 12.0f, 0.0f, 8);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(str, mm40VarN2, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var2, str, function0, i, (byte) 1);
        }
    }

    public static final jn7 j0(en7 en7Var) {
        en7Var.getClass();
        return new jn7(Integer.valueOf(en7Var.f8078a), Integer.valueOf(en7Var.b), Integer.valueOf(en7Var.c), Double.valueOf(en7Var.d));
    }

    public static final void k(mm40 mm40Var, j83 j83Var, fet fetVar) {
        zx7 zx7Var = gqw0.e;
        ugd ugdVar = saj.f31890a;
        tj30 tj30VarC = zq8.c(zx7Var, false);
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
        ugdVar.j(jr8.f16991a, j83Var, fetVar, 6);
        fetVar.r(true);
    }

    public static final void k0(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static final void l(qwv0 qwv0Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1533082013);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (((bp8) l7m0Var.getValue()).f2969a) {
            fetVar.e0(-635773422);
            sj3.l(qwv0Var, null, 0L, fetVar, i2 & 14);
            fetVar.r(false);
        } else if (((bp8) l7m0Var.getValue()).e.isEmpty()) {
            fetVar.e0(-635678252);
            r(((bp8) l7m0Var.getValue()).f, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(-635574960);
            a4x a4xVar = ((bp8) l7m0Var.getValue()).e;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new trb(function1, (byte) 8);
                fetVar.o0(objP);
            }
            v(qwv0Var, a4xVar, (Function1) objP, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 27, i, (Object) qwv0Var, (Object) l7m0Var, function1);
        }
    }

    public static final void m(String str, String str2, String str3, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(901734719);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            int i3 = i2 << 3;
            wwb.i(null, str, 0L, 0, 0L, fetVar, i3 & 112, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarK = s5x0.K(jm40.b, 16.0f, 8.0f);
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new trb(function1, (byte) 9);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean zG = fetVar.g(pkk0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new ifc(pkk0Var, b2);
                fetVar.o0(objP2);
            }
            dtb.m(mm40VarK, str3, str2, 0L, function2, (Function0) objP2, fetVar, ((i2 >> 3) & 112) | (i3 & 896), 24);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 8, i, (Object) str, (Object) str2, (Object) str3, (Object) function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0381  */
    /* JADX WARN: Code duplicated, block: B:142:0x0389  */
    public static final void n(mm40 mm40Var, Function0 function0, Function0 function1, Function1 function2, Function0 function3, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        yx7 yx7Var;
        int i2;
        pzn pznVarA;
        h7h h7hVar;
        wbg wbgVar;
        boolean z2;
        Function1 function4 = function2;
        fet fetVar2 = fetVar;
        yx7 yx7Var2 = gqw0.j;
        function0.getClass();
        function4.getClass();
        function3.getClass();
        fetVar2.g0(-476240581);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.i(function4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar2.i(ugdVar) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            k7h k7hVar = (k7h) function0.invoke();
            h7h h7hVarI0 = i0(k7hVar);
            vbg vbgVar = k7hVar.i;
            t6h t6hVarH0 = h0(h7hVarI0, k7hVar);
            if (Intrinsics.d(t6hVarH0, s6h.f31701a)) {
                z = true;
            } else if (t6hVarH0 instanceof r6h) {
                z = ((r6h) t6hVarH0).c;
            } else {
                if (!(t6hVarH0 instanceof q6h) && t6hVarH0 != null) {
                    t9f.b();
                    return;
                }
                z = false;
            }
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarK = lgb.K(n0qVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            int i5 = i4 & 896;
            boolean zH = fetVar2.h(z) | (i5 == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = new jw7(z, function1, (byte) 8);
                fetVar2.o0(objP);
            }
            ftc ftcVar = new ftc((Function0) objP, (byte) 1);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = knx.Q(jm40Var, ftcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            if (k7hVar.e) {
                fetVar2.e0(-2031941177);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                boolean z4 = i5 == 256;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new y(function1, (byte) 21);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarT = i4w0.T(mm40VarD, (Function1) objP2);
                boolean z5 = (i4 & 7168) == 2048;
                Object objP3 = fetVar2.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new omf(function2, (byte) 28);
                    fetVar2.o0(objP3);
                }
                mbc.d(mm40VarT, k7hVar, (Function1) objP3, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2031401095);
                fetVar2.r(false);
            }
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(k7hVar);
                fetVar2.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            boolean zG = fetVar2.g(k7hVar);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                objP6 = new vef(k7hVar, pz40Var2, (byte) 8);
                fetVar2.o0(objP6);
            }
            m0x0.D((Function0) objP6, fetVar2);
            Boolean boolValueOf = Boolean.valueOf(k7hVar.f);
            boolean zG2 = fetVar2.g(k7hVar);
            Object objP7 = fetVar2.P();
            yje yjeVar = null;
            if (zG2 || objP7 == cl5Var) {
                objP7 = new e9g(k7hVar, pz40Var, yjeVar, (byte) 8);
                fetVar2.o0(objP7);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP7);
            boolean z6 = k7hVar.f;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                zsf zsfVar = hhn.c;
                i2 = 0;
                yx7Var = yx7Var2;
                pznVarA = kzn.d(ro4.m0(Response.OK, 0, zsfVar, 2), 0.0f, 2).a(kzn.c(ro4.m0(Response.OK, 0, zsfVar, 2), yx7Var, 12));
            } else {
                yx7Var = yx7Var2;
                i2 = 0;
                pznVarA = pzn.b;
            }
            pzn pznVar = pznVarA;
            zsf zsfVar2 = hhn.c;
            mm40Var2 = jm40Var;
            function4 = function2;
            byte b2 = 1;
            b34.e(y5d.f42040a, z6, null, pznVar, kzn.e(ro4.m0(Response.OK, i2, zsfVar2, 2), 2).a(kzn.i(ro4.m0(Response.OK, i2, zsfVar2, 2), yx7Var, 12)), null, u1c.M(-306507855, new hgs0(function1, k7hVar, function4, function3, pz40Var2, (byte) 3), fetVar2), fetVar2, 1572870, 18);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            boolean z7 = (t6hVarH0 instanceof r6h) || (t6hVarH0 instanceof s6h);
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP8);
            }
            pz40 pz40Var3 = (pz40) objP8;
            Boolean boolValueOf2 = Boolean.valueOf(z7);
            boolean zH2 = fetVar2.h(z7);
            Object objP9 = fetVar2.P();
            if (zH2 || objP9 == cl5Var) {
                objP9 = new u6h(z7, pz40Var3, null, (byte) 0);
                fetVar2.o0(objP9);
            }
            m0x0.t(fetVar2, boolValueOf2, (Function2) objP9);
            Object objP10 = fetVar2.P();
            if (objP10 == cl5Var) {
                objP10 = new uz40(k7hVar);
                fetVar2.o0(objP10);
            }
            uz40 uz40Var = (uz40) objP10;
            boolean zN1 = uz40Var.n1();
            pz40 pz40Var4 = uz40Var.d;
            if (!zN1) {
                k7h k7hVar2 = (k7h) ((hgk0) pz40Var4).getValue();
                k7hVar2.getClass();
                if (Intrinsics.d(h0(i0(k7hVar2), k7hVar2), h0(i0(k7hVar), k7hVar))) {
                    if (((hgk0) pz40Var4).getValue() != k7hVar) {
                        uz40Var.o1(k7hVar);
                    }
                }
            } else if (((hgk0) pz40Var4).getValue() != k7hVar) {
                uz40Var.o1(k7hVar);
            }
            oms0 oms0VarV = phu0.V(uz40Var, null, fetVar2, 0, 2);
            Object objP11 = fetVar2.P();
            if (objP11 == cl5Var) {
                objP11 = new ca6(pz40Var3, (byte) 15);
                fetVar2.o0(objP11);
            }
            Function1 function5 = (Function1) objP11;
            Object objP12 = fetVar2.P();
            if (objP12 == cl5Var) {
                objP12 = new vlf((byte) 27);
                fetVar2.o0(objP12);
            }
            ay3.e(oms0VarV, n0qVar, function5, null, (Function1) objP12, u1c.M(-373749053, new n82(function1, function4, ugdVar, b2), fetVar2), fetVar2, 221616, 4);
            fetVar2.r(true);
            if (vbgVar == null) {
                h7hVar = h7hVarI0;
            } else {
                h7hVar = (!(vbgVar instanceof sbg) || (wbgVar = (wbg) CollectionsKt.firstOrNull(((sbg) vbgVar).f31931a)) == null) ? null : wbgVar.f38876a;
            }
            boolean z8 = i5 == 256;
            Object objP13 = fetVar2.P();
            if (z8 || objP13 == cl5Var) {
                objP13 = jgk0.b(new pk9(function1, (byte) 16));
                fetVar2.o0(objP13);
            }
            if (((Boolean) ((l7m0) objP13).getValue()).booleanValue()) {
                if (vbgVar == null) {
                    z2 = k7hVar.h || (h7hVarI0 != null && h7hVarI0.c);
                } else {
                    z2 = vbgVar instanceof tbg;
                }
                if (z2) {
                    fetVar2.e0(487995406);
                    wzb.j(lv00.Q(function1), s5x0.t(0.0f, 0.0f, 3), fetVar2, 48, 0);
                    fetVar2.r(false);
                } else if (h7hVar != null) {
                    fetVar2.e0(488003142);
                    lv00.w(lv00.Q(function1), h7hVar, function4, fetVar2, (i4 >> 3) & 896);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-2051530259);
                    fetVar2.r(false);
                }
            } else {
                fetVar2.e0(487991321);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var2, (Object) function0, (Object) function1, function4, (wdr) function3, (wdr) ugdVar, i, (byte) 8);
        }
    }

    public static final void o(mm40 mm40Var, kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-917273816);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            int iOrdinal = kfl0Var.f18201a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1031829838);
                D(kfl0Var, z, j700Var, zczVar, function1, fetVar, i2 & 524286);
                fetVar.r(false);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                fetVar.e0(-1031815434);
                B(kfl0Var, z, j700Var, zczVar, function1, fetVar, i2 & 524286);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(-1031803535);
                w(kfl0Var, z, j700Var, zczVar, function1, fetVar, i2 & 524286);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-1031831617, fetVar, false);
                }
                fetVar.e0(-1031791819);
                M(kfl0Var, z, j700Var, zczVar, function1, fetVar, i2 & 524286);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgh0(mm40Var2, kfl0Var, z, j700Var, zczVar, function1, i);
        }
    }

    public static final void p(mm40 mm40Var, wql wqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1153183733);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wqlVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            nkb.h(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), new hjm(wqlVar.d, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            a(s5x0.M(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f, 12.0f, 12.0f, 16.0f), wqlVar.f39596a, wqlVar.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lql(mm40Var, wqlVar, i, b2);
        }
    }

    public static final void q(mm40 mm40Var, xql xqlVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        tql tqlVar;
        jm40 jm40Var;
        shd shdVar;
        shd shdVar2;
        pcy pcyVar;
        shd shdVar3;
        boolean z;
        boolean z2;
        fetVar.g0(205446907);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xqlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar6);
            jpm0.n(fetVar);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar7);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            kjm kjmVar = kjm.f18392a;
            String str = xqlVar.e;
            tql tqlVar2 = xqlVar.d;
            shd shdVar8 = shdVar7;
            nkb.h(mm40VarN, new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190), kjmVar, null, null, null, fetVar, 384, 56);
            fet fetVar3 = fetVar;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), afn0.m(fetVar3).getBackgroundContent(), jd8.n), 12.0f, 12.0f, 12.0f, 16.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarM);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA2, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar3, shdVar6, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar8);
            a(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), xqlVar.f41326a, xqlVar.c, fetVar3, 0);
            byte b2 = 14;
            if (tqlVar2.f == uql.f36124a) {
                fetVar3.e0(-2055993710);
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 14.0f, 7);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.k, fetVar3, 48);
                int iHashCode3 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM3 = fetVar3.m();
                mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarN2);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar2);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, thg0VarA, shdVar4);
                jpm0.o(fetVar3, bh90VarM3, shdVar5);
                vqd.u(iHashCode3, fetVar3, shdVar6, fetVar3);
                jpm0.o(fetVar3, mm40VarC2, shdVar8);
                String str2 = tqlVar2.f34386a;
                if (str2 == null) {
                    fetVar3.e0(487282160);
                    z2 = false;
                    fetVar3.r(false);
                    tqlVar = tqlVar2;
                    jm40Var = jm40Var2;
                    z = true;
                    shdVar = shdVar6;
                    shdVar2 = shdVar5;
                    pcyVar = pcyVar2;
                    shdVar3 = shdVar4;
                } else {
                    x7z x7zVarF = rz4.f(fetVar3, 487282161, 1.0f, false);
                    y9q0 y9q0VarG = h97.g(fetVar3);
                    long secondary = afn0.m(fetVar3).getSecondary();
                    long j = qmk.q;
                    long j2 = qmk.r;
                    long j3 = qmk.n;
                    shdVar3 = shdVar4;
                    jm40Var = jm40Var2;
                    pcyVar = pcyVar2;
                    shdVar = shdVar6;
                    shdVar2 = shdVar5;
                    z = true;
                    v8q0.a(str2, x7zVarF, secondary, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110576);
                    tqlVar = tqlVar2;
                    v8q0.a(tqlVar2.e, o7k0.u(jm40Var, 0.0f, 68.0f, 1), afn0.m(fetVar).getSecondary(), new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 110576);
                    fetVar3 = fetVar;
                    z2 = false;
                    fetVar3.r(false);
                }
                fetVar3.r(z);
                fetVar3.r(z2);
            } else {
                shdVar8 = shdVar8;
                tqlVar = tqlVar2;
                jm40Var = jm40Var2;
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                pcyVar = pcyVar2;
                shdVar3 = shdVar4;
                z = true;
                fetVar3.e0(-2054270637);
                fetVar3.r(false);
            }
            tql tqlVar3 = tqlVar;
            snm.b(o7k0.c, new unm(tnm.f34243a, afn0.m(fetVar3).getPrimary(), afn0.m(fetVar3).getPrimary(), afn0.m(fetVar3).getBackground(), 6.0f, 6.0f, tqlVar.b, 0, true, 640), fetVar3, 6);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, z, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
            int iHashCode4 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM4 = fetVar3.m();
            mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarN3);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA2, shdVar3);
            jpm0.o(fetVar3, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar3, shdVar, fetVar3);
            jpm0.o(fetVar3, mm40VarC3, shdVar8);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z);
            String str3 = tqlVar3.c;
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            long j4 = qmk.q;
            long j5 = qmk.r;
            long j6 = qmk.n;
            v8q0.a(str3, x7zVar, textPrimary, new n05(j4, j5, j6), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110576);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(tqlVar3.d, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z), afn0.m(fetVar).getSecondary(), new n05(j4, j5, j6), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, z, z, z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kql(mm40Var, xqlVar, i, (byte) 0);
        }
    }

    public static final void r(mdm mdmVar, fet fetVar, int i) {
        fetVar.g0(1394405521);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            jcb.l(o7k0.e(jm40.b, 68.0f), mdmVar, false, null, fetVar, (i2 << 3) & 112, 12);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar, i, (byte) 5);
        }
    }

    public static final void s(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-268097676);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 19;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, b2);
        }
    }

    public static final void t(final mm40 mm40Var, final liq liqVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        liqVar.getClass();
        fetVar.g0(559045921);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(liqVar) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (liqVar.b.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.iiq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b2;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b4) {
                                case 0:
                                    ahy.t(mm40Var, liqVar, fetVar2, x8x.L(i | 1));
                                    break;
                                default:
                                    ahy.t(mm40Var, liqVar, fetVar2, x8x.L(i | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(i120.Q(o2e.e0(o7k0.e(mm40VarD, 256.0f), "FIXED_GRAPH_CHART_TEST_TAG"), StaticColors.INSTANCE.m73getBlack400d7_KjU(), vgg0.a(16.0f)), 8.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                u(liqVar, fetVar, (i2 >> 3) & 14);
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.iiq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b4) {
                        case 0:
                            ahy.t(mm40Var, liqVar, fetVar2, x8x.L(i | 1));
                            break;
                        default:
                            ahy.t(mm40Var, liqVar, fetVar2, x8x.L(i | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void u(liq liqVar, fet fetVar, int i) {
        int i2;
        long j;
        fetVar.g0(-935318450);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(liqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = qjj.K(4.0f, new float[]{14.0f, 8.0f});
                fetVar.o0(objP);
            }
            x03 x03Var = (x03) objP;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                liqVar.getClass();
                a4x a4xVar = liqVar.b;
                wev wevVar = liqVar.e;
                Iterator<E> it = a4xVar.iterator();
                if (!it.hasNext()) {
                    itt0.a();
                    return;
                }
                int iAbs = Math.abs(((miq) it.next()).f21856a);
                while (it.hasNext()) {
                    int iAbs2 = Math.abs(((miq) it.next()).f21856a);
                    if (iAbs < iAbs2) {
                        iAbs = iAbs2;
                    }
                }
                if (iAbs < 100) {
                    iAbs = 100;
                }
                int iZ = kpb.Z(iAbs);
                int i5 = wevVar == wev.b ? 5 : 9;
                Iterator<E> it2 = a4xVar.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return;
                }
                long j2 = ((miq) it2.next()).b;
                loop1: while (true) {
                    j = j2;
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop1;
                        }
                        j2 = ((miq) it2.next()).b;
                        if (j < j2) {
                        }
                    }
                }
                int iOrdinal = wevVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = 4;
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                hiq hiqVar = new hiq(iZ, i5, iZ * i3, j);
                fetVar.o0(hiqVar);
                objP2 = hiqVar;
            }
            hiq hiqVar2 = (hiq) objP2;
            if (fetVar.k(bmd.n) == k6z.b) {
                z = true;
            }
            n0q n0qVar = o7k0.c;
            boolean zI = fetVar.i(hiqVar2) | (i4 == 4) | fetVar.g(g9q0VarN) | fetVar.i(x03Var) | fetVar.h(z);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                cw6 cw6Var = new cw6((Object) liqVar, (Object) hiqVar2, (Object) g9q0VarN, (Object) x03Var, z, (byte) 5);
                fetVar.o0(cw6Var);
                objP3 = cw6Var;
            }
            qxw.o(fetVar, rq8.L(n0qVar, (Function1) objP3));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new giq(liqVar, i, b2);
        }
    }

    public static final void v(qwv0 qwv0Var, a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        ywv0 ywv0Var = qwv0Var.f29454a;
        fetVar.g0(-425132792);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            xczVarA.getClass();
            ywv0Var.getClass();
            btv0 btv0Var = new btv0(xczVarA, xczVarA, ywv0Var, false);
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, ((zvv0) ((hgk0) ((l7m0) ywv0Var.g.b)).getValue()).g, 7);
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(a4xVar))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(btv0Var, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 28, i, (Object) qwv0Var, (Object) a4xVar, function1);
        }
    }

    public static final void w(kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zcz zczVar2;
        fetVar.g0(-354586030);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            zczVar2 = zczVar;
            i2 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f = kfl0Var.e;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, z ? 12.0f : 24.0f, 5);
            int i3 = i2 & 112;
            int i4 = 458752 & i2;
            boolean z2 = (i3 == 32) | (i4 == 131072) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new egl0(kfl0Var, function1, z, b2);
                fetVar.o0(objP);
            }
            ydx.u(mm40VarQ, kfl0Var, zczVar2, j700Var, lh80VarU, function1, (Function1) objP, fetVar, (i2 & 7168) | ((i2 >> 6) & 896) | i3 | i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fgl0(kfl0Var, z, j700Var, zczVar, function1, i, (byte) 1);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(666053264);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            rz4.t(jm40Var, 8.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 28);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fetVar.g0(716502253);
        int i2 = (fetVar.g(l7m0Var) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.d(xf80.f40779a.a(null), u1c.M(1323592109, new kr0(mm40Var, l7m0Var, function1), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 6);
        }
    }

    public static final void z(int i, fet fetVar) {
        fetVar.g0(-56386645);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = Integer.valueOf((int) ((iB * 0.009615385f) + 2.0f));
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new m3a0((byte) 2, iIntValue, fqj0VarD0);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP2, fetVar, 12582912, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfa0(i, (byte) 6);
        }
    }
}
