package a;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.javax.sip.message.Response;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f1884a;
    public static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, Response.TEMPORARILY_UNAVAILABLE, Response.BAD_REQUEST, Response.BAD_REQUEST, 2048};
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ugd g = new ugd(759698998, false, new i5b(10));
    public static final ugd h = new ugd(486633673, false, new i5b(11));
    public static final ugd i = new ugd(364140279, false, new chd(9));
    public static final ugd j = new ugd(-1365736132, false, new ehd(25));
    public static final ugd k = new ugd(1054145557, false, new ehd(26));
    public static final ugd l = new ugd(-703648756, false, new fhd(22));
    public static final ugd m = new ugd(686747635, false, new ehd(27));
    public static final ugd n = new ugd(-674728368, false, new ehd(28));
    public static final ugd o = new ugd(-2017881345, false, new mhd(19));

    public static final void A(int i2, fet fetVar) {
        fetVar.g0(-748914746);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f2, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            u(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 28);
        }
    }

    public static final void B(l7m0 l7m0Var, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1099436573);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(g2vVar) : fetVar2.i(g2vVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            nzt0 nzt0Var = (nzt0) l7m0Var.getValue();
            if (nzt0Var == null) {
                z = false;
            } else if (nzt0Var instanceof lzt0) {
                fetVar2.e0(105996287);
                mdm mdmVar = ((lzt0) nzt0Var).f20921a;
                boolean z2 = (i3 & 57344) == 16384;
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new zbt0(function1, (byte) 11);
                    fetVar2.o0(objP);
                }
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 0, 5);
                fetVar2.r(false);
            } else if (nzt0Var instanceof mzt0) {
                fetVar2.e0(106235390);
                jcb.l(null, g2v.b(g2vVar, pb10.s, null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), false, null, fetVar, 0, 13);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                z = false;
                if (nzt0Var instanceof kzt0) {
                    fetVar2.e0(106538632);
                    kzt0 kzt0Var = (kzt0) nzt0Var;
                    ffb0.B(kzt0Var.f19167a, kzt0Var.b, xczVar, qdzVar, function1, fetVar2, i3 & 65408);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(3417330, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p210(l7m0Var, g2vVar, xczVar, qdzVar, function1, i2, (byte) 2);
        }
    }

    public static final void C(slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        zcz zczVar2;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(1341568437);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            zczVar2 = zczVar;
            i3 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f2 = slpVar.e;
            float f3 = xfn.a(fetVar).d;
            float f4 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f3, f2, f4, z ? 12.0f : 24.0f, fetVar);
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new svy(slpVar, function1, z, b2);
                fetVar.o0(objP);
            }
            bfb.e(mm40VarQ, slpVar, ch80VarF, j700Var, zczVar2, function1, (Function1) objP, fetVar, i3 & 523376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvy(slpVar, z, j700Var, zczVar, function1, i2, (byte) 1);
        }
    }

    public static final void D(hrw hrwVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        fetVar.g0(-757481619);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(hrwVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            function2 = function1;
            gpw.a(hrwVar.a(), u1c.M(157779632, new brw(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), rsm0.w(R.string.statistic_horses_race_runners, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), function2, (byte) 0), fetVar), fetVar, 48);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(hrwVar, function2, i2);
        }
    }

    public static final void E(String str, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i2) {
        Object objJ;
        Object objJ2;
        String str2 = str;
        l7m0 l7m0Var3 = l7m0Var;
        qja qjaVar = qja.j;
        fetVar.g0(1587022439);
        int i3 = i2 | (fetVar.g(str2) ? 4 : 2) | (fetVar.g(l7m0Var3) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var3.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 1835640894, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, (byte) 2), fetVar);
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
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 1835640894, fetVar), ((Number) objJ).floatValue(), false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new elb(oms0VarZ, (byte) 20));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 1835640894, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new elb(oms0VarZ, (byte) 21));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, -1037431906, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, -379691828, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
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
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, -379691828, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new elb(oms0VarZ, (byte) 22));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, -379691828, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new elb(oms0VarZ, (byte) 23));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, -1795028948, false), lxs0Var2, fetVar, 0);
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
            str2 = str;
            l7m0Var3 = l7m0Var;
            hlm.c(mm40VarX, immVar, (vkm) objP8, null, null, null, null, null, null, u1c.M(-1944537749, new cb3(function0, cms0VarE2, cms0VarE, (byte) 4), fetVar), u1c.M(-935817543, new c9o(str2, l7m0Var3, b2), fetVar), null, fetVar, 805306752, 6, 2552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d9o(str2, l7m0Var3, l7m0Var2, function0, i2, (byte) 0);
        }
    }

    public static final void F(mm40 mm40Var, String str, boolean z, g890 g890Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        gmm dmmVar;
        boolean z2;
        char c2;
        Function1 function3;
        boolean z3;
        boolean z4;
        Function1 function4 = function1;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        str.getClass();
        g890Var.getClass();
        function4.getClass();
        function2.getClass();
        fetVar2.g0(-1381933961);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.g(g890Var) ? 2048 : 1024) | (fetVar2.i(function4) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, background, ljcVar), "RULES_WEB_SCREEN");
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z5 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
            int i4 = i3 >> 3;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            boolean zH = fetVar2.h(g890Var.a()) | ((((i4 & 14) ^ 6) > 4 && fetVar2.g(str)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && fetVar2.h(z)) || (i4 & 48) == 32) | fetVar2.d(g890Var.b()) | fetVar2.f(secondary) | fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                ilm ilmVar = new ilm(secondary);
                plm plmVar = new plm(str, secondary, fa50.f9191a);
                if (z) {
                    dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_payments_refresh, g890Var.a(), ra50.f30118a, y3d.c(g890Var.b(), secondary))));
                } else {
                    dmmVar = fmm.f9790a;
                }
                objP = new imm(ilmVar, plmVar, dmmVar, backgroundContent, true, null);
                fetVar2.o0(objP);
            }
            imm immVar = (imm) objP;
            int i5 = i3 & 57344;
            boolean z6 = i5 == 16384;
            Object objP2 = fetVar2.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new qu80(function4, (byte) 12);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z7 = i5 == 16384;
            Object objP3 = fetVar2.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new hs80(function4, (byte) 5);
                fetVar2.o0(objP3);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            String url = g890Var.getUrl();
            Map mapD = g890Var.d();
            long jC = g890Var.c();
            boolean z8 = g890Var instanceof e890;
            if (!z8 || ((e890) g890Var).f) {
                z2 = false;
                c2 = 16384;
            } else {
                z2 = true;
                c2 = 16384;
            }
            boolean z9 = r45 == c2;
            Object objP4 = fetVar.P();
            if (z9 || objP4 == cl5Var) {
                function3 = function1;
                objP4 = new qu80(function3, (byte) 13);
                fetVar.o0(objP4);
            } else {
                function3 = function1;
            }
            Function0 function5 = (Function0) objP4;
            boolean z10 = r45 == 16384;
            Object objP5 = fetVar.P();
            if (z10 || objP5 == cl5Var) {
                objP5 = new qu80(function3, (byte) 14);
                fetVar.o0(objP5);
            }
            Function0 function6 = (Function0) objP5;
            boolean z11 = r45 == 16384;
            Object objP6 = fetVar.P();
            if (z11 || objP6 == cl5Var) {
                objP6 = new qu80(function3, (byte) 15);
                fetVar.o0(objP6);
            }
            Function0 function7 = (Function0) objP6;
            boolean z12 = r45 == 16384;
            Object objP7 = fetVar.P();
            if (z12 || objP7 == cl5Var) {
                objP7 = new qu80(function3, (byte) 16);
                fetVar.o0(objP7);
            }
            Function0 function8 = (Function0) objP7;
            boolean z13 = r45 == 16384;
            Object objP8 = fetVar.P();
            if (z13 || objP8 == cl5Var) {
                objP8 = new hs80(function3, (byte) 6);
                fetVar.o0(objP8);
            }
            ay3.y(n0qVar, url, mapD, jC, z2, function2, function5, function6, function7, function8, (Function1) objP8, fetVar, (i3 & 458752) | 6);
            fetVar2 = fetVar;
            if (z8) {
                fetVar2.e0(-1626572537);
                if (((e890) g890Var).f) {
                    fetVar2.e0(1115890620);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar);
                    jpm0.o(fetVar2, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar4);
                    z4 = false;
                    kpb.j(null, null, fetVar2, 0, 3);
                    z3 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z3 = true;
                    z4 = false;
                    fetVar2.e0(1116152973);
                    fetVar2.r(false);
                }
                fetVar2.r(z4);
                function4 = function1;
            } else {
                z3 = true;
                if (!(g890Var instanceof f890)) {
                    throw b1j.f(-1626574722, fetVar2, false);
                }
                fetVar2.e0(-1626560883);
                mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar);
                tj30 tj30VarC4 = zq8.c(zx7Var, false);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC4, shdVar);
                jpm0.o(fetVar2, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar2, r3, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar4);
                mdm mdmVar = ((f890) g890Var).f;
                boolean z14 = i5 == 16384;
                Object objP9 = fetVar2.P();
                if (z14 || objP9 == cl5Var) {
                    function4 = function1;
                    objP9 = new qu80(function4, (byte) 17);
                    fetVar2.o0(objP9);
                } else {
                    function4 = function1;
                }
                jcb.l(null, mdmVar, false, (Function0) objP9, fetVar2, 0, 5);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            ohs0.x(fetVar2, z3, z3, z3);
            mm40Var2 = jm40.b;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var2, (Object) str, z, (Object) g890Var, function4, function2, i2, (byte) 13);
        }
    }

    public static final void G(j2m0 j2m0Var, c3m0 c3m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1415558980);
        int i3 = i2 | (fetVar.i(j2m0Var) ? 4 : 2) | (fetVar.g(c3m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            int i4 = i3 & 14;
            boolean z = ((i3 & 896) == 256) | (i4 == 4 || fetVar.i(j2m0Var));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new z6e0(j2m0Var, function1, b2);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i3 & 112) == 32) | (i4 == 4 || fetVar.i(j2m0Var));
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new a7e0(j2m0Var, c3m0Var, b2);
                fetVar.o0(objP2);
            }
            dwi0.b(function2, n0qVar, (Function1) objP2, fetVar, 48, 0);
            boolean z3 = i4 == 4 || fetVar.i(j2m0Var);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new v6e0(j2m0Var, b3);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            if (i4 != 4 && !fetVar.i(j2m0Var)) {
                b3 = 0;
            }
            Object objP4 = fetVar.P();
            if (b3 != 0 || objP4 == cl5Var) {
                objP4 = new v6e0(j2m0Var, b2);
                fetVar.o0(objP4);
            }
            v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w6e0(j2m0Var, c3m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void H(l7m0 l7m0Var, j2m0 j2m0Var, Function1 function1, fet fetVar, int i2) {
        long jM123getWhite0d7_KjU;
        wa50 ta50Var;
        l7m0Var.getClass();
        j2m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1908512019);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(j2m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d3m0 d3m0Var = (d3m0) l7m0Var.getValue();
            int iOrdinal = ((d3m0) l7m0Var.getValue()).b().f17581a.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(-501200773);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-501206338, fetVar, false);
                }
                fetVar.e0(-501198625);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            long j2 = jM123getWhite0d7_KjU;
            boolean z = d3m0Var instanceof c3m0;
            int i4 = R.drawable.ic_glyph_filter_inactive;
            if (z) {
                ArrayList arrayList = ((c3m0) d3m0Var).e;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((phv) it.next()).c) {
                            i4 = R.drawable.ic_glyph_filter_active;
                            break;
                        }
                    }
                }
            }
            ra50 ra50Var = ra50.f30118a;
            wkm wkmVar = new wkm(0, R.drawable.ic_info_white_round, true, ra50Var, j2);
            wkm wkmVar2 = new wkm(1, i4, true, ra50Var, j2);
            boolean z2 = z && ((c3m0) d3m0Var).e.size() > 1;
            if (z2 && z) {
                ta50Var = new va50(wkmVar, wkmVar2);
            } else {
                ta50Var = z2 ? new ta50(wkmVar2) : new ta50(wkmVar);
            }
            f9m0 f9m0Var = new f9m0(R.string.stage_table, new dmm(ta50Var), 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((d3m0) l7m0Var.getValue()).b().f17581a;
            j9m0 j9m0Var = ((d3m0) l7m0Var.getValue()).b().b;
            boolean zA = ((d3m0) l7m0Var.getValue()).a();
            int i5 = i3 & 896;
            boolean z3 = i5 == 256;
            Object objP = fetVar.P();
            byte b3 = 12;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new evd0(function1, b3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i5 == 256;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new dvd0(function1, b3);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(1127993375, new x6e0(l7m0Var, function1, j2m0Var, b2), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y6e0(l7m0Var, j2m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void I(ilp ilpVar, Function1 function1, fet fetVar, int i2) {
        u1m u1mVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1003351367);
        int i3 = (fetVar2.g(ilpVar) ? 4 : 2) | i2 | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z = ilpVar.h;
            dlp dlpVar = ilpVar.m;
            if (z) {
                u1mVar = u1m.f34906a;
            } else {
                u1mVar = ilpVar.i ? u1m.b : null;
            }
            u1m u1mVar2 = u1mVar;
            String str = ilpVar.b;
            zfn zfnVar = zaq0.b;
            c2l0 c2l0Var = new c2l0(str, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary());
            boolean z2 = ilpVar.o;
            int i5 = ilpVar.g;
            b8l0 v7l0Var = z2 ? new v7l0(c2l0Var, i5, dlpVar.b, u1mVar2, ilpVar.p, ilpVar.q) : new u7l0(c2l0Var, i5, dlpVar.b, u1mVar2);
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
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
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar2).b, 0.0f, xfn.a(fetVar2).b, 0.0f, 10);
            int i6 = i3 & 112;
            boolean z3 = (i6 == 32) | (i4 == 4);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new zvy(function1, ilpVar, (byte) 7);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i6 == 32) | (i4 == 4);
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new zvy(function1, ilpVar, (byte) 8);
                fetVar2.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z5 = (i4 == 4) | (i6 == 32);
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new zvy(function1, ilpVar, (byte) 9);
                fetVar2.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            byte b2 = 4;
            boolean z6 = (i6 == 32) | (i4 == 4);
            Object objP4 = fetVar2.P();
            if (z6 || objP4 == cl5Var) {
                objP4 = new awy(function1, ilpVar, b2);
                fetVar2.o0(objP4);
            }
            xbc.o(mm40VarN, v7l0Var, null, null, false, function0, function2, function3, (Function1) objP4, fetVar, 0, 28);
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(ilpVar, function1, i2, (byte) 2);
        }
    }

    public static final void J(ilp ilpVar, boolean z, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        boolean z2;
        fetVar.g0(-565338927);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(ilpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            byte b3 = 3;
            if (ilpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = ilpVar.i ? new of5() : null;
            }
            a2l0 a2l0Var = new a2l0(ilpVar.b, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary());
            boolean z3 = ilpVar.o;
            int i4 = ilpVar.g;
            b8l0 e7l0Var = z3 ? new e7l0(a2l0Var, i4, ilpVar.f, of5Var, ilpVar.p, ilpVar.q, 24) : new d7l0(a2l0Var, i4, ilpVar.m.b, ilpVar.f, of5Var, 48);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, z ? 0.0f : 6.0f, 7);
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
            l3l0 l3l0Var = new l3l0(16.0f);
            int i5 = i3 & 896;
            int i6 = i3 & 14;
            boolean z4 = (i5 == 256) | (i6 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new zvy(function1, ilpVar, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z5 = (i5 == 256) | (i6 == 4);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new zvy(function1, ilpVar, b3);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z6 = (i5 == 256) | (i6 == 4);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                z2 = true;
                objP3 = new awy(function1, ilpVar, 1 == true ? 1 : 0);
                fetVar.o0(objP3);
            } else {
                z2 = true;
            }
            xbc.o(null, e7l0Var, l3l0Var, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 153);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) ilpVar, z, (Object) function1, i2, (byte) 13);
        }
    }

    public static final void K(slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        zcz zczVar2;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(-1579671799);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            zczVar2 = zczVar;
            i3 |= fetVar.g(zczVar2) ? 16384 : 8192;
        } else {
            zczVar2 = zczVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, z ? 12.0f : 24.0f, 7);
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new svy(slpVar, function1, z, (byte) 3);
                fetVar.o0(objP);
            }
            bfb.e(mm40VarQ, slpVar, lh80VarU, j700Var, zczVar2, function1, (Function1) objP, fetVar, i3 & 523376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvy(slpVar, z, j700Var, zczVar, function1, i2, (byte) 4);
        }
    }

    public static final void L(olp olpVar, boolean z, Function1 function1, fet fetVar, int i2) {
        u1m u1mVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1727529165);
        int i3 = i2 | (fetVar2.g(olpVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean z2 = olpVar.g;
            jlp jlpVar = olpVar.j;
            if (z2) {
                u1mVar = u1m.f34906a;
            } else {
                u1mVar = olpVar.h ? u1m.b : null;
            }
            u1m u1mVar2 = u1mVar;
            String str = olpVar.b;
            zfn zfnVar = zaq0.b;
            c2l0 c2l0Var = new c2l0(str, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary());
            boolean z3 = olpVar.n;
            int i5 = olpVar.f;
            b8l0 v7l0Var = z3 ? new v7l0(c2l0Var, i5, jlpVar.b, u1mVar2, olpVar.o, olpVar.r) : new u7l0(c2l0Var, i5, jlpVar.b, u1mVar2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarQ = i120.Q(s5x0.N(jm40Var, 20.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar2).b, 0.0f, xfn.a(fetVar2).b, 0.0f, 10);
            int i6 = i3 & 896;
            boolean z5 = (i6 == 256) | (i4 == 4);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new bwy(function1, olpVar, (byte) 7);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z6 = (i6 == 256) | (i4 == 4);
            Object objP2 = fetVar2.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new bwy(function1, olpVar, (byte) 8);
                fetVar2.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z7 = (i6 == 256) | (i4 == 4);
            Object objP3 = fetVar2.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new bwy(function1, olpVar, (byte) 9);
                fetVar2.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            byte b2 = 4;
            boolean z8 = (i6 == 256) | (i4 == 4);
            Object objP4 = fetVar2.P();
            if (z8 || objP4 == cl5Var) {
                objP4 = new cwy(function1, olpVar, b2);
                fetVar2.o0(objP4);
            }
            xbc.o(mm40VarN, v7l0Var, null, null, false, function0, function2, function3, (Function1) objP4, fetVar, 0, 28);
            fetVar2 = fetVar;
            zfi0 zfi0Var = zfi0.f44303a;
            if (z) {
                fetVar2.e0(490357185);
                fetVar2.r(false);
            } else {
                fetVar2.e0(490040582);
                mbc.o(zfi0Var, s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-694999476);
                mbc.o(zfi0Var, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-694836757);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) olpVar, z, (Object) function1, i2, (byte) 22);
        }
    }

    public static final void M(olp olpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        n3l0 k3l0Var;
        float f2;
        fetVar.g0(-197517301);
        int i3 = i2 | (fetVar.g(olpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (olpVar.g) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = olpVar.h ? new of5() : null;
            }
            if (z2) {
                zcl zclVar = qmk.f28987a;
                k3l0Var = new k3l0();
            } else {
                k3l0Var = j3l0.f15840a;
            }
            String str = olpVar.b;
            zfn zfnVar = zaq0.b;
            a2l0 a2l0Var = new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary());
            boolean z3 = olpVar.n;
            int i4 = olpVar.f;
            b8l0 e7l0Var = z3 ? new e7l0(a2l0Var, i4, olpVar.e, of5Var, olpVar.o, olpVar.r, 24) : new d7l0(a2l0Var, i4, olpVar.j.b, olpVar.e, of5Var, 48);
            if (z || z2) {
                zcl zclVar2 = qmk.f28987a;
                f2 = 6.0f;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f2 = 0.0f;
            }
            float f3 = f2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f3, 7);
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
            d4d d4dVar = d4d.BACKGROUND_GROUP_SECONDARY;
            int i5 = i3 & 7168;
            int i6 = i3 & 14;
            boolean z4 = (i5 == 2048) | (i6 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new bwy(function1, olpVar, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z5 = (i6 == 4) | (i5 == 2048);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new bwy(function1, olpVar, (byte) 2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z6 = (i6 == 4) | (i5 == 2048);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new cwy(function1, olpVar, (byte) 1);
                fetVar.o0(objP3);
            }
            xbc.o(null, e7l0Var, k3l0Var, d4dVar, false, function0, function2, null, (Function1) objP3, fetVar, 3072, 145);
            if (z2) {
                fetVar.e0(678992897);
                fetVar.r(false);
            } else {
                fetVar.e0(678654315);
                mbc.o(zfi0.f44303a, s5x0.N(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundGroupSecondary(), jd8.n), 46.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yo30(olpVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void N(clp clpVar, boolean z, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1553968425);
        int i3 = i2 | (fetVar2.g(clpVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 20.0f, 0.0f, 0.0f, 0.0f, 14);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = s5x0.N(jm40Var, xfn.a(fetVar2).b, 0.0f, xfn.a(fetVar2).b, 0.0f, 10);
            z7l0 z7l0Var = new z7l0(new d2l0(clpVar.f4571a, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary()), clpVar.c, null, Integer.valueOf(clpVar.f), null, 116);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vvy(function1, clpVar, (byte) 4);
                fetVar2.o0(objP);
            }
            xbc.o(mm40VarN2, z7l0Var, null, null, false, (Function0) objP, null, null, null, fetVar, 0, 476);
            fetVar2 = fetVar;
            zfi0 zfi0Var = zfi0.f44303a;
            if (z) {
                fetVar2.e0(-1034932315);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1035248918);
                mbc.o(zfi0Var, s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(616788144);
                mbc.o(zfi0Var, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(616950863);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) clpVar, z, (Object) function1, i2, (byte) 23);
        }
    }

    public static final void O(clp clpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        n3l0 k3l0Var;
        float f2;
        fetVar.g0(-1931961553);
        int i3 = i2 | (fetVar.g(clpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z2) {
                zcl zclVar = qmk.f28987a;
                k3l0Var = new k3l0();
            } else {
                k3l0Var = j3l0.f15840a;
            }
            if (z || z2) {
                zcl zclVar2 = qmk.f28987a;
                f2 = 6.0f;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f2 = 0.0f;
            }
            float f3 = f2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f3, 7);
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
            n3l0 n3l0Var = k3l0Var;
            String str = clpVar.f4571a;
            zfn zfnVar = zaq0.b;
            g7l0 g7l0Var = new g7l0(new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), clpVar.c, Integer.valueOf(clpVar.f));
            d4d d4dVar = d4d.BACKGROUND_GROUP_SECONDARY;
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vvy(function1, clpVar, (byte) 1);
                fetVar.o0(objP);
            }
            xbc.o(null, g7l0Var, n3l0Var, d4dVar, false, (Function0) objP, null, null, null, fetVar, 3072, 465);
            if (z2) {
                fetVar.e0(-1063642627);
                fetVar.r(false);
            } else {
                fetVar.e0(-1063981209);
                mbc.o(zfi0.f44303a, s5x0.N(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundGroupSecondary(), jd8.n), 46.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zo30(clpVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void P(mm40 mm40Var, b6p0 b6p0Var, fet fetVar, int i2) {
        b6p0 b6p0Var2;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        b6p0Var.getClass();
        fetVar2.g0(291447313);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(b6p0Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            xx7 xx7Var = gqw0.n;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.s(jm40Var, 226.0f), 0.0f, 16.0f, 0.0f, 8.0f, 5);
            String str = b6p0Var.f2067a;
            pz40 pz40Var = s6t0.f31722a;
            jm40 jm40Var2 = jm40Var;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            mm40 mm40VarL = s5x0.L(jm40Var2, xfn.a(fetVar2).d, 0.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fetVar2.e0(1526937202);
            b6p0Var2 = b6p0Var;
            for (q5p0 q5p0Var : b6p0Var2.b) {
                zcl zclVar2 = qmk.f28987a;
                jm40 jm40Var3 = jm40Var2;
                s7n0.d(s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13), q5p0Var, fetVar2, 0);
                jm40Var2 = jm40Var3;
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            b6p0Var2 = b6p0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, b6p0Var2, i2, (byte) 28);
        }
    }

    public static final void Q(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(882771832);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(jm40Var, 80.0f), mt40.b);
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
            v8q0.a(str, s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 0.0f, 0.0f, 14), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 12, i2, str);
        }
    }

    public static final void R(g2v g2vVar, qdz qdzVar, tzt0 tzt0Var, Function0 function0, fet fetVar, int i2) {
        g2vVar.getClass();
        qdzVar.getClass();
        tzt0Var.getClass();
        function0.getClass();
        fetVar.g0(-1650269860);
        int i3 = i2 | (fetVar.g(g2vVar) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.g(tzt0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarQ = gkb.Q(tzt0Var.D, null, fetVar, 0, 7);
            pz40 pz40VarQ2 = gkb.Q((n7m0) tzt0Var.N.getValue(), null, fetVar, 0, 7);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new las0(1, tzt0Var, tzt0.class, "onScreenEvent", "onScreenEvent(Lorg/xplatform/cyber/game/valorant/impl/presentation/screen/post_game/model/ValorantPostGameAction;)V", 0, (byte) 15);
                fetVar.o0(objP);
            }
            int i4 = i3 << 9;
            o(pz40VarQ, pz40VarQ2, g2vVar, xczVarA, qdzVar, (Function1) ((jhy) objP), function0, fetVar, ((i3 << 6) & 896) | (57344 & i4) | (i4 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 25, i2, g2vVar, qdzVar, tzt0Var, function0);
        }
    }

    public static final Object S(yzj yzjVar, Function0 function0, zje zjeVar) {
        Object obj;
        tzi tziVar;
        if (!((lm40) yzjVar).f20279a.n) {
            return Unit.f46060a;
        }
        lm40 lm40Var = (lm40) yzjVar;
        if (!lm40Var.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var2 = lm40Var.f20279a.e;
        e7z e7zVarZ = vcc.Z(yzjVar);
        loop0: while (true) {
            obj = null;
            if (e7zVarZ == null) {
                break;
            }
            if ((((lm40) e7zVarZ.h1.g).d & 524288) != 0) {
                while (lm40Var2 != null) {
                    if ((lm40Var2.c & 524288) != 0) {
                        lm40 lm40VarV = lm40Var2;
                        xz40 xz40Var = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof z29) {
                                obj = lm40VarV;
                                break loop0;
                            }
                            if ((lm40VarV.c & 524288) != 0 && (lm40VarV instanceof f3k)) {
                                int i2 = 0;
                                for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if ((lm40Var3.c & 524288) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            lm40VarV = lm40Var3;
                                        } else {
                                            if (xz40Var == null) {
                                                xz40Var = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var.b(lm40Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var);
                        }
                    }
                    lm40Var2 = lm40Var2.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var2 = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
        z29 z29Var = (z29) obj;
        if (z29Var == null) {
            return Unit.f46060a;
        }
        s460 s460VarY = vcc.Y(yzjVar);
        Object objA0 = z29Var.a0(s460VarY, new gj4(function0, s460VarY, (byte) 22), zjeVar);
        return objA0 == wne.f39444a ? objA0 : Unit.f46060a;
    }

    public static int T(byte[] bArr, int i2, vw3 vw3Var) throws ynx {
        int iB0 = b0(bArr, i2, vw3Var);
        int i3 = vw3Var.f38129a;
        if (i3 < 0) {
            throw ynx.f();
        }
        if (i3 > bArr.length - iB0) {
            throw ynx.h();
        }
        if (i3 == 0) {
            vw3Var.c = og9.b;
            return iB0;
        }
        vw3Var.c = og9.f(bArr, iB0, i3);
        return iB0 + i3;
    }

    public static int U(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long V(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int W(o2h0 o2h0Var, int i2, byte[] bArr, int i3, int i4, zlx zlxVar, vw3 vw3Var) throws ynx {
        Object objD = o2h0Var.d();
        o2h0 o2h0Var2 = o2h0Var;
        byte[] bArr2 = bArr;
        int i5 = i4;
        vw3 vw3Var2 = vw3Var;
        int iO0 = o0(objD, o2h0Var2, bArr2, i3, i5, vw3Var2);
        o2h0Var2.b(objD);
        vw3Var2.c = objD;
        zlxVar.add(objD);
        while (iO0 < i5) {
            vw3 vw3Var3 = vw3Var2;
            int i6 = i5;
            int iB0 = b0(bArr2, iO0, vw3Var3);
            if (i2 != vw3Var3.f38129a) {
                break;
            }
            byte[] bArr3 = bArr2;
            o2h0 o2h0Var3 = o2h0Var2;
            Object objD2 = o2h0Var3.d();
            iO0 = o0(objD2, o2h0Var3, bArr3, iB0, i6, vw3Var3);
            o2h0Var2 = o2h0Var3;
            bArr2 = bArr3;
            i5 = i6;
            vw3Var2 = vw3Var3;
            o2h0Var2.b(objD2);
            vw3Var2.c = objD2;
            zlxVar.add(objD2);
        }
        return iO0;
    }

    public static int X(byte[] bArr, int i2, vw3 vw3Var) throws ynx {
        int iB0 = b0(bArr, i2, vw3Var);
        int i3 = vw3Var.f38129a;
        if (i3 < 0) {
            throw ynx.f();
        }
        if (i3 == 0) {
            vw3Var.c = "";
            return iB0;
        }
        vw3Var.c = new String(bArr, iB0, i3, cmx.f4629a);
        return iB0 + i3;
    }

    public static int Y(byte[] bArr, int i2, vw3 vw3Var) throws ynx {
        int iB0 = b0(bArr, i2, vw3Var);
        int i3 = vw3Var.f38129a;
        if (i3 < 0) {
            throw ynx.f();
        }
        if (i3 == 0) {
            vw3Var.c = "";
            return iB0;
        }
        vw3Var.c = ptt0.f27581a.f(bArr, iB0, i3);
        return iB0 + i3;
    }

    public static int Z(int i2, byte[] bArr, int i3, int i4, wdt0 wdt0Var, vw3 vw3Var) throws ynx {
        if ((i2 >>> 3) == 0) {
            throw ynx.a();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iD0 = d0(bArr, i3, vw3Var);
            wdt0Var.d(i2, Long.valueOf(vw3Var.b));
            return iD0;
        }
        if (i5 == 1) {
            wdt0Var.d(i2, Long.valueOf(V(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iB0 = b0(bArr, i3, vw3Var);
            int i6 = vw3Var.f38129a;
            if (i6 < 0) {
                throw ynx.f();
            }
            if (i6 > bArr.length - iB0) {
                throw ynx.h();
            }
            if (i6 == 0) {
                wdt0Var.d(i2, og9.b);
            } else {
                wdt0Var.d(i2, og9.f(bArr, iB0, i6));
            }
            return iB0 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw ynx.a();
            }
            wdt0Var.d(i2, Integer.valueOf(U(bArr, i3)));
            return i3 + 4;
        }
        wdt0 wdt0VarC = wdt0.c();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (i3 < i4) {
            int iB1 = b0(bArr, i3, vw3Var);
            i8 = vw3Var.f38129a;
            if (i8 == i7) {
                i3 = iB1;
                break;
            }
            i3 = Z(i8, bArr, iB1, i4, wdt0VarC, vw3Var);
        }
        if (i3 > i4 || i8 != i7) {
            throw ynx.g();
        }
        wdt0Var.d(i2, wdt0VarC);
        return i3;
    }

    public static final void a(mm40 mm40Var, az azVar, Function1 function1, fet fetVar, int i2) {
        azVar.getClass();
        function1.getClass();
        fetVar.g0(590752621);
        int i3 = (fetVar.g(azVar) ? 32 : 16) | i2 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            cy2.a(null, function1, fetVar, (i3 >> 3) & 112);
            boolean zEquals = azVar.equals(yy.f43445a);
            jm40 jm40Var = jm40.b;
            if (zEquals) {
                fetVar.e0(-14823790);
                zcl zclVar = qmk.f28987a;
                hp4.b(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 56.0f, 0.0f, 0.0f, 13));
                fetVar.r(false);
            } else if (azVar instanceof xy) {
                fetVar.e0(-14681283);
                y0x0.a(jr8.f16991a.b(jm40Var, gqw0.e), (xy) azVar, function1, fetVar, i3 & 1008);
                fetVar.r(false);
            } else {
                if (!(azVar instanceof zy)) {
                    throw b1j.f(-1247405612, fetVar, false);
                }
                fetVar.e0(-14425595);
                zcl zclVar2 = qmk.f28987a;
                nnw0.a(s5x0.N(jm40Var, 0.0f, 56.0f, 0.0f, 0.0f, 13), (zy) azVar, fetVar, i3 & 112);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, azVar, function1, i2, (byte) 13);
        }
    }

    public static int a0(int i2, byte[] bArr, int i3, vw3 vw3Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            vw3Var.f38129a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            vw3Var.f38129a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            vw3Var.f38129a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            vw3Var.f38129a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                vw3Var.f38129a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static final void b(mm40 mm40Var, np2 np2Var, fet fetVar, int i2) {
        byte b2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(914333412);
        int i3 = i2 | 6 | (fetVar2.g(np2Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            String str = np2Var.b;
            String str2 = np2Var.d;
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long j2 = qmk.q;
            mm40Var2 = jm40Var;
            y9a.h(x7zVar, str, str2, textPrimary, j2, j2, g1t0.d(), fetVar2, 3072, 0);
            dww.c(a8k0.F(R.drawable.ic_glyph_arrow_right_mirrored, 0, fetVar2), null, o7k0.n(s5x0.L(mm40Var2, 2.0f, 0.0f, 2), 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), fetVar2, 56, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            y9a.h(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), np2Var.c, str2, np2Var.e, j2, j2, g1t0.d(), fetVar2, 3072, 0);
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp2(mm40Var2, np2Var, i2, b2);
        }
    }

    public static int b0(byte[] bArr, int i2, vw3 vw3Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return a0(b2, bArr, i3, vw3Var);
        }
        vw3Var.f38129a = b2;
        return i3;
    }

    public static final void c(mm40 mm40Var, final np2 np2Var, fet fetVar, int i2) {
        np2Var.getClass();
        fetVar.g0(-393626825);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(np2Var) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            hmw0.j(mm40Var, u1c.M(1131736903, new Function2() { // from class: a.lp2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    np2 np2Var2 = np2Var;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(np2Var2.f23891a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110586);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                b34.b(null, np2Var2, fetVar3, 0);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(2138659592, new Function2() { // from class: a.lp2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    np2 np2Var2 = np2Var;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(np2Var2.f23891a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110586);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                b34.b(null, np2Var2, fetVar3, 0);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i3 & 14) | 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp2(mm40Var, np2Var, i2, b2);
        }
    }

    public static int c0(int i2, byte[] bArr, int i3, int i4, zlx zlxVar, vw3 vw3Var) {
        tjx tjxVar = (tjx) zlxVar;
        int iB0 = b0(bArr, i3, vw3Var);
        tjxVar.c(vw3Var.f38129a);
        while (iB0 < i4) {
            int iB1 = b0(bArr, iB0, vw3Var);
            if (i2 != vw3Var.f38129a) {
                break;
            }
            iB0 = b0(bArr, iB1, vw3Var);
            tjxVar.c(vw3Var.f38129a);
        }
        return iB0;
    }

    /* JADX WARN: Code duplicated, block: B:271:0x05af  */
    /* JADX WARN: Code duplicated, block: B:273:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:279:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:281:0x060c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0620  */
    /* JADX WARN: Code duplicated, block: B:285:0x062d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0639  */
    /* JADX WARN: Code duplicated, block: B:289:0x0650  */
    /* JADX WARN: Code duplicated, block: B:303:0x0674  */
    /* JADX WARN: Code duplicated, block: B:305:0x068e  */
    /* JADX WARN: Code duplicated, block: B:307:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:315:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:323:0x06df  */
    /* JADX WARN: Code duplicated, block: B:325:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:327:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:329:0x0710  */
    /* JADX WARN: Code duplicated, block: B:331:0x0727  */
    /* JADX WARN: Code duplicated, block: B:333:0x0733  */
    /* JADX WARN: Code duplicated, block: B:335:0x0749  */
    /* JADX WARN: Code duplicated, block: B:337:0x0758  */
    /* JADX WARN: Code duplicated, block: B:338:0x0771  */
    /* JADX WARN: Code duplicated, block: B:344:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:348:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:352:0x0805  */
    /* JADX WARN: Code duplicated, block: B:355:0x0851  */
    /* JADX WARN: Code duplicated, block: B:356:0x085c  */
    /* JADX WARN: Code duplicated, block: B:359:0x087a  */
    /* JADX WARN: Code duplicated, block: B:360:0x0880  */
    public static final void d(oms0 oms0Var, Function1 function1, mm40 mm40Var, pzn pznVar, alo aloVar, Function2 function2, ugd ugdVar, fet fetVar, int i2) {
        fet fetVar2;
        ugd ugdVar2;
        Object obj;
        boolean z;
        e8k0 e8k0Var;
        isb isbVar;
        Object obj2;
        Object obj3;
        boolean z2;
        boolean z3;
        boolean z4;
        lxs0 lxs0Var;
        isb isbVar2;
        boolean z5;
        vls0 vls0Var;
        vls0 vls0Var2;
        fet fetVar3;
        vls0 vls0Var3;
        vls0 vls0Var4;
        boolean z6;
        ubg0 ubg0Var;
        jm40 jm40Var;
        jm40 jm40Var2;
        toj0 toj0Var;
        mm40 z5u0Var;
        lxs0 lxs0Var2;
        boolean z7;
        boolean z8;
        toj0 toj0Var2;
        lxs0 lxs0Var3;
        vls0 vls0Var5;
        vls0 vls0Var6;
        vls0 vls0VarD;
        boolean zI;
        Object objP;
        toj0 toj0Var3;
        pzn pznVar2;
        alo aloVar2;
        boolean zI2;
        Object obj4;
        boolean zH;
        Object obj5;
        Object objP2;
        v63 v63Var;
        Object obj6;
        Object objP3;
        Object obj7;
        Object objP4;
        Object obj8;
        Object objP5;
        Object obj9;
        Object objP6;
        Object obj10;
        Object objP7;
        Object obj11;
        fet fetVar4;
        Object objP8;
        Object obj12;
        fet fetVar5;
        ugd ugdVar3;
        azn aznVarT0;
        mm40 mm40Var2 = mm40Var;
        ugd ugdVar4 = ugdVar;
        fet fetVar6 = fetVar;
        fetVar6.g0(-1310802509);
        int i3 = (i2 & 6) == 0 ? (fetVar6.g(oms0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar6.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar6.g(mm40Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar6.g(pznVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar6.g(aloVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar6.i(function2) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= fetVar6.i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= fetVar6.i(ugdVar4) ? 67108864 : 33554432;
        }
        int i5 = i4;
        byte b2 = 1;
        if (fetVar6.U(i5 & 1, (i5 & 38347923) != 38347922)) {
            pz40 pz40Var = oms0Var.e;
            pz40 pz40Var2 = oms0Var.d;
            p4 p4Var = oms0Var.f25519a;
            Object value = ((hgk0) pz40Var).getValue();
            Object objP9 = fetVar6.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj13 = objP9;
            if (objP9 == cl5Var) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar6.o0(pz40VarE);
                obj13 = pz40VarE;
            }
            pz40 pz40Var3 = (pz40) obj13;
            Object objP10 = fetVar6.P();
            Object obj14 = objP10;
            if (objP10 == cl5Var) {
                sz2 sz2Var = new sz2(pz40Var3, b2);
                fetVar6.o0(sz2Var);
                obj14 = sz2Var;
            }
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            kzn.a(oms0Var, (Function0) obj14, fetVar6, i7);
            if (value != null && ((Boolean) function1.invoke(value)).booleanValue()) {
                pz40Var3.setValue(Boolean.TRUE);
            }
            hgk0 hgk0Var = (hgk0) pz40Var2;
            if (((Boolean) function1.invoke(hgk0Var.getValue())).booleanValue() || ((Boolean) function1.invoke(p4Var.y0())).booleanValue() || ((value != null && ((Boolean) function1.invoke(value)).booleanValue()) || ((((Boolean) pz40Var3.getValue()).booleanValue() && !Intrinsics.d(p4Var.y0(), hgk0Var.getValue())) || oms0Var.h() || oms0Var.d()))) {
                fetVar6.e0(-273709037);
                int i8 = i7 & 14;
                boolean z9 = ((i8 ^ 6) > 4 && fetVar6.g(oms0Var)) || (i7 & 6) == 4;
                Object objP11 = fetVar6.P();
                if (z9 || objP11 == cl5Var) {
                    objP11 = p4Var.y0();
                    fetVar6.o0(objP11);
                }
                if (oms0Var.h()) {
                    objP11 = p4Var.y0();
                }
                fetVar6.e0(2016262395);
                azn aznVarT1 = t0(oms0Var, function1, objP11, fetVar6);
                fetVar6.r(false);
                Object value2 = hgk0Var.getValue();
                fetVar6.e0(2016262395);
                azn aznVarT2 = t0(oms0Var, function1, value2, fetVar6);
                fetVar6.r(false);
                int i9 = i8 | 3072;
                int i10 = (i9 & 14) ^ 6;
                boolean z10 = (i10 > 4 && fetVar6.g(oms0Var)) || (i9 & 6) == 4;
                Object objP12 = fetVar6.P();
                if (z10 || objP12 == cl5Var) {
                    oms0 oms0Var2 = new oms0(new uz40(aznVarT1), oms0Var, ohs0.n(oms0Var.c, " > EnterExitTransition"));
                    fetVar6.o0(oms0Var2);
                    obj = oms0Var2;
                } else {
                    obj = objP12;
                }
                oms0 oms0Var3 = (oms0) obj;
                boolean zG = ((i10 > 4 && fetVar6.g(oms0Var)) || (i9 & 6) == 4) | fetVar6.g(oms0Var3);
                Object objP13 = fetVar6.P();
                Object obj15 = objP13;
                if (zG || objP13 == cl5Var) {
                    xis0 xis0Var = new xis0((Object) oms0Var, (Object) oms0Var3, (byte) 4);
                    fetVar6.o0(xis0Var);
                    obj15 = xis0Var;
                }
                m0x0.o(oms0Var3, (Function1) obj15, fetVar6);
                if (oms0Var.h()) {
                    oms0Var3.l(aznVarT1, aznVarT2);
                } else {
                    oms0Var3.r(aznVarT2);
                    ((hgk0) oms0Var3.l).setValue(Boolean.FALSE);
                }
                if (oms0Var.h()) {
                    fetVar6.e0(782538635);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(782386797);
                    Object value3 = ((hgk0) oms0Var.e).getValue();
                    if (value3 == null) {
                        fetVar6.e0(782437481);
                        fetVar6.r(false);
                        aznVarT0 = null;
                    } else {
                        fetVar6.e0(782437482);
                        fetVar6.e0(2016262395);
                        aznVarT0 = t0(oms0Var, function1, value3, fetVar6);
                        fetVar6.r(false);
                        fetVar6.r(false);
                    }
                    p4 p4Var2 = oms0Var3.f25519a;
                    pz40 pz40Var4 = oms0Var3.d;
                    hgk0 hgk0Var2 = (hgk0) oms0Var3.e;
                    Object value4 = hgk0Var2.getValue();
                    boolean z11 = value4 != null && aznVarT0 == null && Intrinsics.d(((hgk0) pz40Var4).getValue(), p4Var2.y0());
                    hgk0Var2.setValue(aznVarT0);
                    if (z11) {
                        ((hgk0) oms0Var3.f).setValue(new bms0(value4, ((hgk0) pz40Var4).getValue()));
                        p4Var2.I0(value4);
                        if (!oms0Var3.g()) {
                            oms0Var3.p(true);
                        }
                        SnapshotStateList snapshotStateList = oms0Var3.j;
                        int size = snapshotStateList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((cms0) snapshotStateList.get(i11)).h.m(-2.0f);
                        }
                    }
                    fetVar6.r(false);
                }
                boolean zG2 = fetVar6.g(oms0Var3);
                Object objP14 = fetVar6.P();
                Object obj16 = objP14;
                if (zG2 || objP14 == cl5Var) {
                    pz40 pz40VarE2 = androidx.compose.runtime.e.e(pznVar);
                    fetVar6.o0(pz40VarE2);
                    obj16 = pz40VarE2;
                }
                pz40 pz40Var5 = (pz40) obj16;
                p4 p4Var3 = oms0Var3.f25519a;
                hgk0 hgk0Var3 = (hgk0) oms0Var3.d;
                if (p4Var3.y0() == hgk0Var3.getValue() && oms0Var3.f25519a.y0() == azn.b) {
                    if (oms0Var3.h()) {
                        pz40Var5.setValue(pznVar);
                    } else {
                        pz40Var5.setValue(pzn.b);
                    }
                } else if (hgk0Var3.getValue() != azn.c) {
                    pz40Var5.setValue(((pzn) pz40Var5.getValue()).a(pznVar));
                }
                pzn pznVar3 = (pzn) pz40Var5.getValue();
                pz40 pz40Var6 = oms0Var3.d;
                p4 p4Var4 = oms0Var3.f25519a;
                boolean zG3 = fetVar6.g(oms0Var3);
                Object objP15 = fetVar6.P();
                Object obj17 = objP15;
                if (zG3 || objP15 == cl5Var) {
                    pz40 pz40VarE3 = androidx.compose.runtime.e.e(aloVar);
                    fetVar6.o0(pz40VarE3);
                    obj17 = pz40VarE3;
                }
                pz40 pz40Var7 = (pz40) obj17;
                hgk0 hgk0Var4 = (hgk0) pz40Var6;
                float f2 = 1.0f;
                if (p4Var4.y0() == hgk0Var4.getValue() && p4Var4.y0() == azn.b) {
                    fetVar6.e0(-505142498);
                    fetVar6.r(false);
                    if (oms0Var3.h()) {
                        pz40Var7.setValue(aloVar);
                    } else {
                        pz40Var7.setValue(alo.b);
                    }
                    f2 = 1.0f;
                } else if (hgk0Var4.getValue() != azn.b) {
                    fetVar6.e0(-504838512);
                    fwo fwoVar = ((alo) pz40Var7.getValue()).f1078a.f16780a;
                    fwo fwoVar2 = fwoVar != null ? new fwo(1.0f, fwoVar.b) : null;
                    k1h0 k1h0Var = ((alo) pz40Var7.getValue()).f1078a.d;
                    k1h0 k1h0Var2 = k1h0Var != null ? new k1h0(1.0f, k1h0Var.b, k1h0Var.c) : null;
                    e8k0 e8k0Var2 = ((alo) pz40Var7.getValue()).f1078a.b;
                    if (e8k0Var2 == null) {
                        fetVar6.e0(-504119809);
                        fetVar6.r(false);
                        z = false;
                        e8k0Var = null;
                    } else {
                        fetVar6.e0(-708998590);
                        Object objP16 = fetVar6.P();
                        Object obj18 = objP16;
                        if (objP16 == cl5Var) {
                            gzn gznVar = gzn.g;
                            fetVar6.o0(gznVar);
                            obj18 = gznVar;
                        }
                        e8k0 e8k0Var3 = new e8k0(e8k0Var2.b, (Function1) obj18);
                        z = false;
                        fetVar6.r(false);
                        e8k0Var = e8k0Var3;
                    }
                    isb isbVar3 = ((alo) pz40Var7.getValue()).f1078a.c;
                    if (isbVar3 == null) {
                        fetVar6.e0(-504024174);
                        fetVar6.r(z);
                        isbVar = null;
                    } else {
                        fetVar6.e0(-708995505);
                        Object objP17 = fetVar6.P();
                        Object obj19 = objP17;
                        if (objP17 == cl5Var) {
                            gzn gznVar2 = gzn.h;
                            fetVar6.o0(gznVar2);
                            obj19 = gznVar2;
                        }
                        isb isbVar4 = new isb(isbVar3.f15296a, (Function1) obj19, isbVar3.c, isbVar3.d);
                        fetVar6.r(false);
                        isbVar = isbVar4;
                    }
                    jms0 jms0Var = ((alo) pz40Var7.getValue()).f1078a;
                    pz40Var7.setValue(new alo(new jms0(fwoVar2, e8k0Var, isbVar, k1h0Var2, (LinkedHashMap) null, 96)).a(aloVar));
                    fetVar6.r(false);
                } else {
                    f2 = 1.0f;
                    fetVar6.e0(-503833306);
                    fetVar6.r(false);
                }
                alo aloVar3 = (alo) pz40Var7.getValue();
                pz40 pz40VarF = androidx.compose.runtime.e.f(function2, fetVar6);
                Object objInvoke = function2.invoke(p4Var4.y0(), ((hgk0) pz40Var6).getValue());
                boolean zG4 = fetVar6.g(oms0Var3) | fetVar6.g(pz40VarF);
                Object objP18 = fetVar6.P();
                Object obj20 = objP18;
                if (zG4 || objP18 == cl5Var) {
                    y51 y51Var = new y51((Object) oms0Var3, (Object) pz40VarF, (yje) null, (byte) 26);
                    fetVar6.o0(y51Var);
                    obj20 = y51Var;
                }
                Function2 function3 = (Function2) obj20;
                Object objP19 = fetVar6.P();
                Object obj21 = objP19;
                if (objP19 == cl5Var) {
                    pz40 pz40VarE4 = androidx.compose.runtime.e.e(objInvoke);
                    fetVar6.o0(pz40VarE4);
                    obj21 = pz40VarE4;
                }
                pz40 pz40Var8 = (pz40) obj21;
                Unit unit = Unit.f46060a;
                boolean zI3 = fetVar6.i(function3);
                Object objP20 = fetVar6.P();
                if (zI3 || objP20 == cl5Var) {
                    kgk0 kgk0Var = new kgk0(function3, pz40Var8, null, (byte) 0);
                    fetVar6.o0(kgk0Var);
                    obj2 = kgk0Var;
                } else {
                    obj2 = objP20;
                }
                m0x0.t(fetVar6, unit, (Function2) obj2);
                Object objY0 = p4Var4.y0();
                azn aznVar = azn.c;
                if (objY0 == aznVar && ((hgk0) pz40Var6).getValue() == aznVar && ((Boolean) pz40Var8.getValue()).booleanValue()) {
                    fetVar6.e0(-270520625);
                    fetVar6.r(false);
                    ugdVar3 = ugdVar;
                    z5 = false;
                    fetVar5 = fetVar6;
                } else {
                    fetVar6.e0(-272022668);
                    boolean z12 = i6 == 4;
                    Object objP21 = fetVar6.P();
                    Object obj22 = objP21;
                    if (z12 || objP21 == cl5Var) {
                        v63 v63Var2 = new v63();
                        fetVar6.o0(v63Var2);
                        obj22 = v63Var2;
                    }
                    v63 v63Var3 = (v63) obj22;
                    toj0 toj0Var4 = v63Var3.b;
                    lxs0 lxs0Var4 = hp4.p;
                    Object objP22 = fetVar6.P();
                    Object obj23 = objP22;
                    if (objP22 == cl5Var) {
                        w7f w7fVar = w7f.h;
                        fetVar6.o0(w7fVar);
                        obj23 = w7fVar;
                    }
                    Function0 function0 = (Function0) obj23;
                    fetVar6.e0(-1491182875);
                    fetVar6.r(false);
                    fetVar6.e0(-1491180092);
                    fetVar6.r(false);
                    fetVar6.e0(-31257052);
                    fetVar6.r(false);
                    toj0Var4.c(((hgk0) oms0Var3.e).getValue() != null);
                    boolean zI4 = fetVar6.i(toj0Var4);
                    Object objP23 = fetVar6.P();
                    if (zI4 || objP23 == cl5Var) {
                        hzn hznVar = new hzn(toj0Var4, (byte) 1);
                        fetVar6.o0(hznVar);
                        obj3 = hznVar;
                    } else {
                        obj3 = objP23;
                    }
                    kzn.a(oms0Var3, (Function0) obj3, fetVar6, 0);
                    jms0 jms0Var2 = pznVar3.f27854a;
                    jms0 jms0Var3 = aloVar3.f1078a;
                    isb isbVar5 = jms0Var3.c;
                    boolean zA = h2t0.a(toj0Var4.e, y3d.f);
                    e8k0 e8k0Var4 = jms0Var2.b;
                    isb isbVar6 = jms0Var2.c;
                    if (e8k0Var4 == null && jms0Var3.b == null) {
                        z2 = zA;
                        if (ikx.b(toj0Var4.i, 0L)) {
                            z3 = false;
                        }
                        if (isbVar6 == null || isbVar5 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                            fetVar4 = fetVar;
                            fetVar4.e0(1018653691);
                            objP8 = fetVar4.P();
                            obj12 = objP8;
                            if (objP8 == cl5Var) {
                                fetVar4.o0("Built-in slide");
                                obj12 = "Built-in slide";
                            }
                            isbVar2 = isbVar6;
                            z5 = false;
                            vls0Var = null;
                            vls0 vls0VarD2 = phu0.D(oms0Var3, lxs0Var4, (String) obj12, fetVar4, 384, 0);
                            lxs0Var = lxs0Var4;
                            fetVar4.r(false);
                            vls0Var2 = vls0VarD2;
                            fetVar3 = fetVar4;
                        } else {
                            fet fetVar7 = fetVar;
                            lxs0Var = lxs0Var4;
                            isbVar2 = isbVar6;
                            z5 = false;
                            vls0Var = null;
                            fetVar7.e0(1018759494);
                            fetVar7.r(false);
                            vls0Var2 = null;
                            fetVar3 = fetVar7;
                        }
                        if (z4 != 0) {
                            fetVar3.e0(1018851285);
                            lxs0 lxs0Var5 = hp4.q;
                            objP7 = fetVar3.P();
                            obj11 = objP7;
                            if (objP7 == cl5Var) {
                                fetVar3.o0("Built-in shrink/expand");
                                obj11 = "Built-in shrink/expand";
                            }
                            vls0 vls0VarD3 = phu0.D(oms0Var3, lxs0Var5, (String) obj11, fetVar3, 384, 0);
                            fetVar3.r(z5);
                            vls0Var3 = vls0VarD3;
                        } else {
                            fetVar3.e0(1018962109);
                            fetVar3.r(z5);
                            vls0Var3 = vls0Var;
                        }
                        if (z4 != 0) {
                            fetVar3.e0(1019035735);
                            objP6 = fetVar3.P();
                            obj10 = objP6;
                            if (objP6 == cl5Var) {
                                fetVar3.o0("Built-in InterruptionHandlingOffset");
                                obj10 = "Built-in InterruptionHandlingOffset";
                            }
                            vls0 vls0VarD4 = phu0.D(oms0Var3, lxs0Var, (String) obj10, fetVar3, 384, 0);
                            fetVar3.r(z5);
                            vls0Var4 = vls0VarD4;
                        } else {
                            fetVar3.e0(1019206141);
                            fetVar3.r(z5);
                            vls0Var4 = vls0Var;
                        }
                        z6 = ((isbVar2 != null || isbVar2.d) && (isbVar5 == 0 || isbVar5.d) && z4) ? z5 ? 1 : 0 : true;
                        ubg0Var = a5d.e;
                        jm40Var = jm40.b;
                        if (z2) {
                            jm40Var2 = jm40Var;
                            toj0Var = toj0Var4;
                            fetVar3.e0(1020031362);
                            fetVar3.r(z5);
                            z5u0Var = jm40Var2;
                        } else {
                            fetVar3.e0(1019733235);
                            qja qjaVar = qja.j;
                            s43 s43Var = new s43(ubg0Var, (byte) 2);
                            jm40Var2 = jm40Var;
                            lxs0 lxs0Var6 = new lxs0(qjaVar, s43Var);
                            objP5 = fetVar3.P();
                            obj9 = objP5;
                            if (objP5 == cl5Var) {
                                fetVar3.o0("Built-in veil");
                                obj9 = "Built-in veil";
                            }
                            z5u0Var = new z5u0(oms0Var3, phu0.D(oms0Var3, lxs0Var6, (String) obj9, fetVar3, 384, 0), pznVar3, aloVar3, toj0Var4);
                            toj0Var = toj0Var4;
                            fetVar3.r(z5);
                        }
                        lxs0Var2 = hp4.j;
                        if (jms0Var2.f16780a != null && jms0Var3.f16780a == null && toj0Var.f == f2) {
                            z7 = z5 ? 1 : 0;
                        } else {
                            z7 = true;
                        }
                        if (jms0Var2.d != null && jms0Var3.d == null && toj0Var.g == f2) {
                            z8 = z5 ? 1 : 0;
                        } else {
                            z8 = true;
                        }
                        if (z7) {
                            fetVar3.e0(-1511865571);
                            objP4 = fetVar3.P();
                            obj8 = objP4;
                            if (objP4 == cl5Var) {
                                fetVar3.o0("Built-in alpha");
                                obj8 = "Built-in alpha";
                            }
                            toj0 toj0Var5 = toj0Var;
                            lxs0Var3 = lxs0Var2;
                            toj0Var2 = toj0Var5;
                            vls0 vls0VarD5 = phu0.D(oms0Var3, lxs0Var3, (String) obj8, fetVar3, 384, 0);
                            fetVar3.r(z5);
                            vls0Var5 = vls0VarD5;
                        } else {
                            toj0Var2 = toj0Var;
                            lxs0Var3 = lxs0Var2;
                            fetVar3.e0(-1511696126);
                            fetVar3.r(z5);
                            vls0Var5 = vls0Var;
                        }
                        if (z8 != 0) {
                            fetVar3.e0(-1511628483);
                            objP3 = fetVar3.P();
                            obj7 = objP3;
                            if (objP3 == cl5Var) {
                                fetVar3.o0("Built-in scale");
                                obj7 = "Built-in scale";
                            }
                            vls0 vls0VarD6 = phu0.D(oms0Var3, lxs0Var3, (String) obj7, fetVar3, 384, 0);
                            fetVar3.r(z5);
                            vls0Var6 = vls0VarD6;
                        } else {
                            fetVar3.e0(-1511459038);
                            fetVar3.r(z5);
                            vls0Var6 = vls0Var;
                        }
                        if (z8) {
                            fetVar3.e0(-1511381382);
                            vls0VarD = phu0.D(oms0Var3, kzn.f19160a, "TransformOriginInterruptionHandling", fetVar3, 384, 0);
                            fetVar3.r(z5);
                        } else {
                            fetVar3.e0(-1511209054);
                            fetVar3.r(z5);
                            vls0VarD = vls0Var;
                        }
                        zI = fetVar3.i(vls0Var5) | fetVar3.g(r26) | fetVar3.g(r27) | fetVar3.i(toj0Var2) | fetVar3.i(vls0Var6) | fetVar3.g(oms0Var3) | fetVar3.i(vls0VarD);
                        objP = fetVar3.P();
                        if (!zI || objP == cl5Var) {
                            toj0 toj0Var6 = toj0Var2;
                            objP = new czn(vls0Var5, toj0Var6, vls0Var6, oms0Var3, r26, r27, vls0VarD);
                            toj0Var3 = toj0Var6;
                            pznVar2 = r26;
                            aloVar2 = r27;
                            fetVar3.o0(objP);
                        } else {
                            pznVar2 = pznVar3;
                            toj0Var3 = toj0Var2;
                            aloVar2 = aloVar3;
                        }
                        czn cznVar = (czn) objP;
                        i5d0 i5d0Var = nzj.f24376a;
                        zI2 = fetVar3.i(toj0Var3);
                        Object objP24 = fetVar3.P();
                        obj4 = objP24;
                        if (zI2 || objP24 == cl5Var) {
                            hzn hznVar2 = new hzn(toj0Var3, z5 ? (byte) 1 : (byte) 0);
                            fetVar3.o0(hznVar2);
                            obj4 = hznVar2;
                        }
                        mm40 mm40VarE = new sm40((Function0) obj4).e(jm40Var2);
                        zH = fetVar3.h(z6) | fetVar3.g(function0);
                        Object objP25 = fetVar3.P();
                        obj5 = objP25;
                        if (zH || objP25 == cl5Var) {
                            izn iznVar = new izn(z6, function0);
                            fetVar3.o0(iznVar);
                            obj5 = iznVar;
                        }
                        mm40 mm40VarE2 = mm40VarE.e(i4w0.T(jm40Var2, (Function1) obj5)).e(new bzn(oms0Var3, vls0Var3, vls0Var4, vls0Var2, pznVar2, aloVar2, toj0Var3, function0, cznVar)).e(z5u0Var);
                        fetVar3.e0(-1255657861);
                        fetVar3.r(z5);
                        mm40Var2 = mm40Var;
                        mm40 mm40VarE3 = mm40Var2.e(mm40VarE2.e(jm40Var2));
                        objP2 = fetVar3.P();
                        if (objP2 == cl5Var) {
                            v63Var = v63Var3;
                            s53 s53Var = new s53(v63Var);
                            fetVar3.o0(s53Var);
                            obj6 = s53Var;
                        } else {
                            v63Var = v63Var3;
                            obj6 = objP2;
                        }
                        s53 s53Var2 = (s53) obj6;
                        int iHashCode = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM = fetVar3.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE3);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, s53Var2, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM, gqw0.w);
                        jpm0.l(fetVar3, Integer.valueOf(iHashCode));
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                        ugd ugdVar5 = ugdVar;
                        ugdVar5.F(v63Var, fetVar3, Integer.valueOf((i5 >> 21) & 112));
                        fetVar3.r(true);
                        fetVar3.r(z5);
                        ugdVar3 = ugdVar5;
                        fetVar5 = fetVar3;
                    } else {
                        z2 = zA;
                    }
                    z3 = true;
                    if (isbVar6 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (z3) {
                        fetVar4 = fetVar;
                        fetVar4.e0(1018653691);
                        objP8 = fetVar4.P();
                        obj12 = objP8;
                        if (objP8 == cl5Var) {
                            fetVar4.o0("Built-in slide");
                            obj12 = "Built-in slide";
                        }
                        isbVar2 = isbVar6;
                        z5 = false;
                        vls0Var = null;
                        vls0 vls0VarD7 = phu0.D(oms0Var3, lxs0Var4, (String) obj12, fetVar4, 384, 0);
                        lxs0Var = lxs0Var4;
                        fetVar4.r(false);
                        vls0Var2 = vls0VarD7;
                        fetVar3 = fetVar4;
                    } else {
                        fet fetVar8 = fetVar;
                        lxs0Var = lxs0Var4;
                        isbVar2 = isbVar6;
                        z5 = false;
                        vls0Var = null;
                        fetVar8.e0(1018759494);
                        fetVar8.r(false);
                        vls0Var2 = null;
                        fetVar3 = fetVar8;
                    }
                    if (z4 != 0) {
                        fetVar3.e0(1018851285);
                        lxs0 lxs0Var7 = hp4.q;
                        objP7 = fetVar3.P();
                        obj11 = objP7;
                        if (objP7 == cl5Var) {
                            fetVar3.o0("Built-in shrink/expand");
                            obj11 = "Built-in shrink/expand";
                        }
                        vls0 vls0VarD8 = phu0.D(oms0Var3, lxs0Var7, (String) obj11, fetVar3, 384, 0);
                        fetVar3.r(z5);
                        vls0Var3 = vls0VarD8;
                    } else {
                        fetVar3.e0(1018962109);
                        fetVar3.r(z5);
                        vls0Var3 = vls0Var;
                    }
                    if (z4 != 0) {
                        fetVar3.e0(1019035735);
                        objP6 = fetVar3.P();
                        obj10 = objP6;
                        if (objP6 == cl5Var) {
                            fetVar3.o0("Built-in InterruptionHandlingOffset");
                            obj10 = "Built-in InterruptionHandlingOffset";
                        }
                        vls0 vls0VarD9 = phu0.D(oms0Var3, lxs0Var, (String) obj10, fetVar3, 384, 0);
                        fetVar3.r(z5);
                        vls0Var4 = vls0VarD9;
                    } else {
                        fetVar3.e0(1019206141);
                        fetVar3.r(z5);
                        vls0Var4 = vls0Var;
                    }
                    if (isbVar2 != null) {
                    }
                    ubg0Var = a5d.e;
                    jm40Var = jm40.b;
                    if (z2) {
                        fetVar3.e0(1019733235);
                        qja qjaVar2 = qja.j;
                        s43 s43Var2 = new s43(ubg0Var, (byte) 2);
                        jm40Var2 = jm40Var;
                        lxs0 lxs0Var8 = new lxs0(qjaVar2, s43Var2);
                        objP5 = fetVar3.P();
                        obj9 = objP5;
                        if (objP5 == cl5Var) {
                            fetVar3.o0("Built-in veil");
                            obj9 = "Built-in veil";
                        }
                        z5u0Var = new z5u0(oms0Var3, phu0.D(oms0Var3, lxs0Var8, (String) obj9, fetVar3, 384, 0), pznVar3, aloVar3, toj0Var4);
                        toj0Var = toj0Var4;
                        fetVar3.r(z5);
                    } else {
                        jm40Var2 = jm40Var;
                        toj0Var = toj0Var4;
                        fetVar3.e0(1020031362);
                        fetVar3.r(z5);
                        z5u0Var = jm40Var2;
                    }
                    lxs0Var2 = hp4.j;
                    if (jms0Var2.f16780a != null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (jms0Var2.d != null) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (z7) {
                        fetVar3.e0(-1511865571);
                        objP4 = fetVar3.P();
                        obj8 = objP4;
                        if (objP4 == cl5Var) {
                            fetVar3.o0("Built-in alpha");
                            obj8 = "Built-in alpha";
                        }
                        toj0 toj0Var7 = toj0Var;
                        lxs0Var3 = lxs0Var2;
                        toj0Var2 = toj0Var7;
                        vls0 vls0VarD10 = phu0.D(oms0Var3, lxs0Var3, (String) obj8, fetVar3, 384, 0);
                        fetVar3.r(z5);
                        vls0Var5 = vls0VarD10;
                    } else {
                        toj0Var2 = toj0Var;
                        lxs0Var3 = lxs0Var2;
                        fetVar3.e0(-1511696126);
                        fetVar3.r(z5);
                        vls0Var5 = vls0Var;
                    }
                    if (z8 != 0) {
                        fetVar3.e0(-1511628483);
                        objP3 = fetVar3.P();
                        obj7 = objP3;
                        if (objP3 == cl5Var) {
                            fetVar3.o0("Built-in scale");
                            obj7 = "Built-in scale";
                        }
                        vls0 vls0VarD11 = phu0.D(oms0Var3, lxs0Var3, (String) obj7, fetVar3, 384, 0);
                        fetVar3.r(z5);
                        vls0Var6 = vls0VarD11;
                    } else {
                        fetVar3.e0(-1511459038);
                        fetVar3.r(z5);
                        vls0Var6 = vls0Var;
                    }
                    if (z8) {
                        fetVar3.e0(-1511381382);
                        vls0VarD = phu0.D(oms0Var3, kzn.f19160a, "TransformOriginInterruptionHandling", fetVar3, 384, 0);
                        fetVar3.r(z5);
                    } else {
                        fetVar3.e0(-1511209054);
                        fetVar3.r(z5);
                        vls0VarD = vls0Var;
                    }
                    zI = fetVar3.i(vls0Var5) | fetVar3.g(r26) | fetVar3.g(r27) | fetVar3.i(toj0Var2) | fetVar3.i(vls0Var6) | fetVar3.g(oms0Var3) | fetVar3.i(vls0VarD);
                    objP = fetVar3.P();
                    if (zI) {
                        toj0 toj0Var8 = toj0Var2;
                        objP = new czn(vls0Var5, toj0Var8, vls0Var6, oms0Var3, r26, r27, vls0VarD);
                        toj0Var3 = toj0Var8;
                        pznVar2 = r26;
                        aloVar2 = r27;
                        fetVar3.o0(objP);
                    } else {
                        toj0 toj0Var9 = toj0Var2;
                        objP = new czn(vls0Var5, toj0Var9, vls0Var6, oms0Var3, r26, r27, vls0VarD);
                        toj0Var3 = toj0Var9;
                        pznVar2 = r26;
                        aloVar2 = r27;
                        fetVar3.o0(objP);
                    }
                    czn cznVar2 = (czn) objP;
                    i5d0 i5d0Var2 = nzj.f24376a;
                    zI2 = fetVar3.i(toj0Var3);
                    Object objP26 = fetVar3.P();
                    obj4 = objP26;
                    if (zI2) {
                        hzn hznVar3 = new hzn(toj0Var3, z5 ? (byte) 1 : (byte) 0);
                        fetVar3.o0(hznVar3);
                        obj4 = hznVar3;
                    } else {
                        hzn hznVar4 = new hzn(toj0Var3, z5 ? (byte) 1 : (byte) 0);
                        fetVar3.o0(hznVar4);
                        obj4 = hznVar4;
                    }
                    mm40 mm40VarE4 = new sm40((Function0) obj4).e(jm40Var2);
                    zH = fetVar3.h(z6) | fetVar3.g(function0);
                    Object objP27 = fetVar3.P();
                    obj5 = objP27;
                    if (zH) {
                        izn iznVar2 = new izn(z6, function0);
                        fetVar3.o0(iznVar2);
                        obj5 = iznVar2;
                    } else {
                        izn iznVar3 = new izn(z6, function0);
                        fetVar3.o0(iznVar3);
                        obj5 = iznVar3;
                    }
                    mm40 mm40VarE5 = mm40VarE4.e(i4w0.T(jm40Var2, (Function1) obj5)).e(new bzn(oms0Var3, vls0Var3, vls0Var4, vls0Var2, pznVar2, aloVar2, toj0Var3, function0, cznVar2)).e(z5u0Var);
                    fetVar3.e0(-1255657861);
                    fetVar3.r(z5);
                    mm40Var2 = mm40Var;
                    mm40 mm40VarE6 = mm40Var2.e(mm40VarE5.e(jm40Var2));
                    objP2 = fetVar3.P();
                    if (objP2 == cl5Var) {
                        v63Var = v63Var3;
                        s53 s53Var3 = new s53(v63Var);
                        fetVar3.o0(s53Var3);
                        obj6 = s53Var3;
                    } else {
                        v63Var = v63Var3;
                        obj6 = objP2;
                    }
                    s53 s53Var4 = (s53) obj6;
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE6);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, s53Var4, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.l(fetVar3, Integer.valueOf(iHashCode2));
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    ugd ugdVar6 = ugdVar;
                    ugdVar6.F(v63Var, fetVar3, Integer.valueOf((i5 >> 21) & 112));
                    fetVar3.r(true);
                    fetVar3.r(z5);
                    ugdVar3 = ugdVar6;
                    fetVar5 = fetVar3;
                }
                fetVar5.r(z5);
                ugdVar2 = ugdVar3;
                fetVar2 = fetVar5;
            } else {
                fetVar6.e0(-270514673);
                fetVar6.r(false);
                ugdVar2 = ugdVar4;
                fetVar2 = fetVar6;
            }
        } else {
            fetVar6.X();
            ugdVar2 = ugdVar4;
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r43(oms0Var, function1, mm40Var2, pznVar, aloVar, function2, ugdVar2, i2);
        }
    }

    public static int d0(byte[] bArr, int i2, vw3 vw3Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            vw3Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        vw3Var.b = j3;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void e(y5d y5dVar, boolean z, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        pzn pznVar2;
        int i5;
        alo aloVar2;
        int i6;
        int i7;
        ugd ugdVar2;
        boolean z2;
        mm40 mm40Var2;
        String str2;
        alo aloVar3;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        pzn pznVarA;
        alo aloVarA;
        Object objP;
        int i8;
        fetVar.g0(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (fetVar.h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                pznVar2 = pznVar;
                i4 |= fetVar.g(pznVar2) ? 2048 : 1024;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    aloVar2 = aloVar;
                    if (fetVar.g(aloVar2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 196608;
                if ((1572864 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i7 |= i8;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((599185 & i7) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i7 & 1, z2)) {
                    if (i9 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i10 != 0) {
                        pznVarA = kzn.d(null, 0.0f, 3).a(kzn.c(null, null, 15));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i5 != 0) {
                        aloVarA = kzn.e(null, 3).a(kzn.i(null, null, 15));
                    } else {
                        aloVarA = aloVar2;
                    }
                    oms0 oms0VarZ = phu0.Z(Boolean.valueOf(z), "AnimatedVisibility", fetVar, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.B;
                        fetVar.o0(objP);
                    }
                    i(oms0VarZ, (Function1) objP, mm40Var3, pznVarA, aloVarA, ugdVar2, fetVar, (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7) | (i7 & 3670016));
                    aloVar3 = aloVarA;
                    str2 = "AnimatedVisibility";
                    pznVar2 = pznVarA;
                    mm40Var2 = mm40Var3;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    str2 = str;
                    aloVar3 = aloVar2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new q63(y5dVar, z, mm40Var2, pznVar2, aloVar3, str2, ugdVar, i2, i3);
                }
            }
            i4 |= 24576;
            aloVar2 = aloVar;
            i7 = i4 | 196608;
            if ((1572864 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((599185 & i7) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i9 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i10 != 0) {
                    pznVarA = kzn.d(null, 0.0f, 3).a(kzn.c(null, null, 15));
                } else {
                    pznVarA = pznVar2;
                }
                if (i5 != 0) {
                    aloVarA = kzn.e(null, 3).a(kzn.i(null, null, 15));
                } else {
                    aloVarA = aloVar2;
                }
                oms0 oms0VarZ2 = phu0.Z(Boolean.valueOf(z), "AnimatedVisibility", fetVar, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.B;
                    fetVar.o0(objP);
                }
                i(oms0VarZ2, (Function1) objP, mm40Var3, pznVarA, aloVarA, ugdVar2, fetVar, (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7) | (i7 & 3670016));
                aloVar3 = aloVarA;
                str2 = "AnimatedVisibility";
                pznVar2 = pznVarA;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                str2 = str;
                aloVar3 = aloVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new q63(y5dVar, z, mm40Var2, pznVar2, aloVar3, str2, ugdVar, i2, i3);
            }
        }
        i4 |= 3072;
        pznVar2 = pznVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                aloVar2 = aloVar;
                if (fetVar.g(aloVar2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i4 | 196608;
            if ((1572864 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((599185 & i7) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                if (i9 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i10 != 0) {
                    pznVarA = kzn.d(null, 0.0f, 3).a(kzn.c(null, null, 15));
                } else {
                    pznVarA = pznVar2;
                }
                if (i5 != 0) {
                    aloVarA = kzn.e(null, 3).a(kzn.i(null, null, 15));
                } else {
                    aloVarA = aloVar2;
                }
                oms0 oms0VarZ3 = phu0.Z(Boolean.valueOf(z), "AnimatedVisibility", fetVar, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.B;
                    fetVar.o0(objP);
                }
                i(oms0VarZ3, (Function1) objP, mm40Var3, pznVarA, aloVarA, ugdVar2, fetVar, (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7) | (i7 & 3670016));
                aloVar3 = aloVarA;
                str2 = "AnimatedVisibility";
                pznVar2 = pznVarA;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                str2 = str;
                aloVar3 = aloVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new q63(y5dVar, z, mm40Var2, pznVar2, aloVar3, str2, ugdVar, i2, i3);
            }
        }
        i4 |= 24576;
        aloVar2 = aloVar;
        i7 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            ugdVar2 = ugdVar;
            if (fetVar.i(ugdVar2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i7 |= i8;
        } else {
            ugdVar2 = ugdVar;
        }
        if ((599185 & i7) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i7 & 1, z2)) {
            if (i9 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var;
            }
            if (i10 != 0) {
                pznVarA = kzn.d(null, 0.0f, 3).a(kzn.c(null, null, 15));
            } else {
                pznVarA = pznVar2;
            }
            if (i5 != 0) {
                aloVarA = kzn.e(null, 3).a(kzn.i(null, null, 15));
            } else {
                aloVarA = aloVar2;
            }
            oms0 oms0VarZ4 = phu0.Z(Boolean.valueOf(z), "AnimatedVisibility", fetVar, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
            objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m9.B;
                fetVar.o0(objP);
            }
            i(oms0VarZ4, (Function1) objP, mm40Var3, pznVarA, aloVarA, ugdVar2, fetVar, (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7) | (i7 & 3670016));
            aloVar3 = aloVarA;
            str2 = "AnimatedVisibility";
            pznVar2 = pznVarA;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            str2 = str;
            aloVar3 = aloVar2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q63(y5dVar, z, mm40Var2, pznVar2, aloVar3, str2, ugdVar, i2, i3);
        }
    }

    public static final String e0(String str, double d2) {
        pn40 pn40Var = pn40.f27267a;
        return kng0.l("\u202d", pn40.d(d2, str, p3u0.c), "\u202c");
    }

    public static final void f(uz40 uz40Var, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        pzn pznVar2;
        alo aloVar2;
        String str2;
        fetVar.g0(-1238803325);
        int i3 = i2 | (fetVar.g(uz40Var) ? 32 : 16) | 224640;
        if (fetVar.U(i3 & 1, (599185 & i3) != 599184)) {
            pzn pznVarA = kzn.c(null, null, 15).a(kzn.d(null, 0.0f, 3));
            alo aloVarA = kzn.i(null, null, 15).a(kzn.e(null, 3));
            oms0 oms0VarV = phu0.V(uz40Var, "AnimatedVisibility", fetVar, ((i3 >> 3) & 14) | 48, 0);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m9.A;
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            i(oms0VarV, (Function1) objP, jm40Var, pznVarA, aloVarA, ugdVar, fetVar, 1600944);
            mm40Var2 = jm40Var;
            pznVar2 = pznVarA;
            aloVar2 = aloVarA;
            str2 = "AnimatedVisibility";
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            pznVar2 = pznVar;
            aloVar2 = aloVar;
            str2 = str;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o63(uz40Var, mm40Var2, pznVar2, aloVar2, str2, ugdVar, i2);
        }
    }

    public static void f0(int i2, fq80 fq80Var) {
        fq80Var.J(7);
        byte[] bArr = fq80Var.f9961a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final void g(uz40 uz40Var, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        alo aloVarA;
        String str2;
        fetVar.g0(657024243);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? fetVar.g(uz40Var) : fetVar.i(uz40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(pznVar) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(aloVar) ? 2048 : 1024;
        }
        int i7 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i7 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i7 & 1, (74899 & i7) != 74898)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            aloVarA = i6 != 0 ? kzn.e(null, 3).a(kzn.h()) : aloVar;
            oms0 oms0VarV = phu0.V(uz40Var, "AnimatedVisibility", fetVar, (i7 & 14) | ((i7 >> 9) & 112), 0);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m9.Y;
                fetVar.o0(objP);
            }
            int i8 = i7 << 3;
            mm40Var2 = mm40Var;
            i(oms0VarV, (Function1) objP, mm40Var2, pznVar, aloVarA, ugdVar, fetVar, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            aloVarA = aloVar;
            str2 = str;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q43(uz40Var, mm40Var2, pznVar, aloVarA, str2, ugdVar, i2, i3);
        }
    }

    public static synchronized AudioManager g0(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f1884a = null;
            }
            AudioManager audioManager = f1884a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                brd brdVar = new brd();
                kc5.P0().execute(new fy2(applicationContext, brdVar, (byte) 6));
                brdVar.a();
                AudioManager audioManager2 = f1884a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f1884a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void h(boolean z, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        int i5;
        pzn pznVar2;
        int i6;
        int i7;
        alo aloVar2;
        int i8;
        int i9;
        String str2;
        int i10;
        ugd ugdVar2;
        boolean z2;
        pzn pznVarA;
        alo aloVarA;
        String str3;
        yfe0 yfe0VarU;
        Object objP;
        int i11;
        fetVar.g0(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                mm40Var2 = mm40Var;
                i4 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    pznVar2 = pznVar;
                    if (fetVar.g(pznVar2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        aloVar2 = aloVar;
                        if (fetVar.g(aloVar2)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            str2 = str;
                            if (fetVar.g(str2)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        if ((196608 & i2) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i4 |= i11;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((74899 & i4) != 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fetVar.U(i4 & 1, z2)) {
                            if (i12 != 0) {
                                mm40Var2 = jm40.b;
                            }
                            if (i5 != 0) {
                                pzn pznVarD = kzn.d(null, 0.0f, 3);
                                Map map = quu0.f29360a;
                                pznVarA = pznVarD.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                            } else {
                                pznVarA = pznVar2;
                            }
                            if (i7 != 0) {
                                aloVarA = kzn.h().a(kzn.e(null, 3));
                            } else {
                                aloVarA = aloVar2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            oms0 oms0VarZ = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            objP = fetVar.P();
                            if (objP == ukd.f35823a) {
                                objP = m9.z;
                                fetVar.o0(objP);
                            }
                            int i13 = i4 << 3;
                            mm40Var2 = mm40Var2;
                            i(oms0VarZ, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016));
                        } else {
                            fetVar.X();
                            pznVarA = pznVar2;
                            aloVarA = aloVar2;
                        }
                        str3 = str2;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    str2 = str;
                    if ((196608 & i2) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i4 & 1, z2)) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i5 != 0) {
                            pzn pznVarD2 = kzn.d(null, 0.0f, 3);
                            Map map2 = quu0.f29360a;
                            pznVarA = pznVarD2.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                        } else {
                            pznVarA = pznVar2;
                        }
                        if (i7 != 0) {
                            aloVarA = kzn.h().a(kzn.e(null, 3));
                        } else {
                            aloVarA = aloVar2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        oms0 oms0VarZ2 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = m9.z;
                            fetVar.o0(objP);
                        }
                        int i14 = i4 << 3;
                        mm40Var2 = mm40Var2;
                        i(oms0VarZ2, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016));
                    } else {
                        fetVar.X();
                        pznVarA = pznVar2;
                        aloVarA = aloVar2;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                    }
                }
                i4 |= 3072;
                aloVar2 = aloVar;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i4 & 1, z2)) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i5 != 0) {
                            pzn pznVarD3 = kzn.d(null, 0.0f, 3);
                            Map map3 = quu0.f29360a;
                            pznVarA = pznVarD3.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                        } else {
                            pznVarA = pznVar2;
                        }
                        if (i7 != 0) {
                            aloVarA = kzn.h().a(kzn.e(null, 3));
                        } else {
                            aloVarA = aloVar2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        oms0 oms0VarZ3 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = m9.z;
                            fetVar.o0(objP);
                        }
                        int i15 = i4 << 3;
                        mm40Var2 = mm40Var2;
                        i(oms0VarZ3, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016));
                    } else {
                        fetVar.X();
                        pznVarA = pznVar2;
                        aloVarA = aloVar2;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD4 = kzn.d(null, 0.0f, 3);
                        Map map4 = quu0.f29360a;
                        pznVarA = pznVarD4.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ4 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i16 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ4, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 384;
            pznVar2 = pznVar;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    aloVar2 = aloVar;
                    if (fetVar.g(aloVar2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i4 & 1, z2)) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i5 != 0) {
                            pzn pznVarD5 = kzn.d(null, 0.0f, 3);
                            Map map5 = quu0.f29360a;
                            pznVarA = pznVarD5.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                        } else {
                            pznVarA = pznVar2;
                        }
                        if (i7 != 0) {
                            aloVarA = kzn.h().a(kzn.e(null, 3));
                        } else {
                            aloVarA = aloVar2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        oms0 oms0VarZ5 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = m9.z;
                            fetVar.o0(objP);
                        }
                        int i17 = i4 << 3;
                        mm40Var2 = mm40Var2;
                        i(oms0VarZ5, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016));
                    } else {
                        fetVar.X();
                        pznVarA = pznVar2;
                        aloVarA = aloVar2;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD6 = kzn.d(null, 0.0f, 3);
                        Map map6 = quu0.f29360a;
                        pznVarA = pznVarD6.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ6 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i18 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ6, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 3072;
            aloVar2 = aloVar;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD7 = kzn.d(null, 0.0f, 3);
                        Map map7 = quu0.f29360a;
                        pznVarA = pznVarD7.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ7 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i19 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ7, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i5 != 0) {
                    pzn pznVarD8 = kzn.d(null, 0.0f, 3);
                    Map map8 = quu0.f29360a;
                    pznVarA = pznVarD8.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                } else {
                    pznVarA = pznVar2;
                }
                if (i7 != 0) {
                    aloVarA = kzn.h().a(kzn.e(null, 3));
                } else {
                    aloVarA = aloVar2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                oms0 oms0VarZ8 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.z;
                    fetVar.o0(objP);
                }
                int i110 = i4 << 3;
                mm40Var2 = mm40Var2;
                i(oms0VarZ8, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i110 & 896) | 48 | (i110 & 7168) | (57344 & i110) | (i110 & 3670016));
            } else {
                fetVar.X();
                pznVarA = pznVar2;
                aloVarA = aloVar2;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
            }
        }
        i4 |= 48;
        mm40Var2 = mm40Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                pznVar2 = pznVar;
                if (fetVar.g(pznVar2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    aloVar2 = aloVar;
                    if (fetVar.g(aloVar2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (fetVar.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fetVar.U(i4 & 1, z2)) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i5 != 0) {
                            pzn pznVarD9 = kzn.d(null, 0.0f, 3);
                            Map map9 = quu0.f29360a;
                            pznVarA = pznVarD9.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                        } else {
                            pznVarA = pznVar2;
                        }
                        if (i7 != 0) {
                            aloVarA = kzn.h().a(kzn.e(null, 3));
                        } else {
                            aloVarA = aloVar2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        oms0 oms0VarZ9 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = m9.z;
                            fetVar.o0(objP);
                        }
                        int i111 = i4 << 3;
                        mm40Var2 = mm40Var2;
                        i(oms0VarZ9, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i111 & 896) | 48 | (i111 & 7168) | (57344 & i111) | (i111 & 3670016));
                    } else {
                        fetVar.X();
                        pznVarA = pznVar2;
                        aloVarA = aloVar2;
                    }
                    str3 = str2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD10 = kzn.d(null, 0.0f, 3);
                        Map map10 = quu0.f29360a;
                        pznVarA = pznVarD10.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ10 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i112 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ10, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i112 & 896) | 48 | (i112 & 7168) | (57344 & i112) | (i112 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 3072;
            aloVar2 = aloVar;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD11 = kzn.d(null, 0.0f, 3);
                        Map map11 = quu0.f29360a;
                        pznVarA = pznVarD11.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ11 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i113 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ11, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i113 & 896) | 48 | (i113 & 7168) | (57344 & i113) | (i113 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i5 != 0) {
                    pzn pznVarD12 = kzn.d(null, 0.0f, 3);
                    Map map12 = quu0.f29360a;
                    pznVarA = pznVarD12.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                } else {
                    pznVarA = pznVar2;
                }
                if (i7 != 0) {
                    aloVarA = kzn.h().a(kzn.e(null, 3));
                } else {
                    aloVarA = aloVar2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                oms0 oms0VarZ12 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.z;
                    fetVar.o0(objP);
                }
                int i114 = i4 << 3;
                mm40Var2 = mm40Var2;
                i(oms0VarZ12, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i114 & 896) | 48 | (i114 & 7168) | (57344 & i114) | (i114 & 3670016));
            } else {
                fetVar.X();
                pznVarA = pznVar2;
                aloVarA = aloVar2;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
            }
        }
        i4 |= 384;
        pznVar2 = pznVar;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                aloVar2 = aloVar;
                if (fetVar.g(aloVar2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (fetVar.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar.U(i4 & 1, z2)) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i5 != 0) {
                        pzn pznVarD13 = kzn.d(null, 0.0f, 3);
                        Map map13 = quu0.f29360a;
                        pznVarA = pznVarD13.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                    } else {
                        pznVarA = pznVar2;
                    }
                    if (i7 != 0) {
                        aloVarA = kzn.h().a(kzn.e(null, 3));
                    } else {
                        aloVarA = aloVar2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    oms0 oms0VarZ13 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = m9.z;
                        fetVar.o0(objP);
                    }
                    int i115 = i4 << 3;
                    mm40Var2 = mm40Var2;
                    i(oms0VarZ13, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i115 & 896) | 48 | (i115 & 7168) | (57344 & i115) | (i115 & 3670016));
                } else {
                    fetVar.X();
                    pznVarA = pznVar2;
                    aloVarA = aloVar2;
                }
                str3 = str2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i5 != 0) {
                    pzn pznVarD14 = kzn.d(null, 0.0f, 3);
                    Map map14 = quu0.f29360a;
                    pznVarA = pznVarD14.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                } else {
                    pznVarA = pznVar2;
                }
                if (i7 != 0) {
                    aloVarA = kzn.h().a(kzn.e(null, 3));
                } else {
                    aloVarA = aloVar2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                oms0 oms0VarZ14 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.z;
                    fetVar.o0(objP);
                }
                int i116 = i4 << 3;
                mm40Var2 = mm40Var2;
                i(oms0VarZ14, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i116 & 896) | 48 | (i116 & 7168) | (57344 & i116) | (i116 & 3670016));
            } else {
                fetVar.X();
                pznVarA = pznVar2;
                aloVarA = aloVar2;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
            }
        }
        i4 |= 3072;
        aloVar2 = aloVar;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                str2 = str;
                if (fetVar.g(str2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            if ((196608 & i2) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i5 != 0) {
                    pzn pznVarD15 = kzn.d(null, 0.0f, 3);
                    Map map15 = quu0.f29360a;
                    pznVarA = pznVarD15.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
                } else {
                    pznVarA = pznVar2;
                }
                if (i7 != 0) {
                    aloVarA = kzn.h().a(kzn.e(null, 3));
                } else {
                    aloVarA = aloVar2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                oms0 oms0VarZ15 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = m9.z;
                    fetVar.o0(objP);
                }
                int i117 = i4 << 3;
                mm40Var2 = mm40Var2;
                i(oms0VarZ15, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i117 & 896) | 48 | (i117 & 7168) | (57344 & i117) | (i117 & 3670016));
            } else {
                fetVar.X();
                pznVarA = pznVar2;
                aloVarA = aloVar2;
            }
            str3 = str2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
            }
        }
        i4 |= 24576;
        str2 = str;
        if ((196608 & i2) == 0) {
            ugdVar2 = ugdVar;
            if (fetVar.i(ugdVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i4 |= i11;
        } else {
            ugdVar2 = ugdVar;
        }
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i4 & 1, z2)) {
            if (i12 != 0) {
                mm40Var2 = jm40.b;
            }
            if (i5 != 0) {
                pzn pznVarD16 = kzn.d(null, 0.0f, 3);
                Map map16 = quu0.f29360a;
                pznVarA = pznVarD16.a(kzn.b(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.i, true, gzn.d));
            } else {
                pznVarA = pznVar2;
            }
            if (i7 != 0) {
                aloVarA = kzn.h().a(kzn.e(null, 3));
            } else {
                aloVarA = aloVar2;
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            oms0 oms0VarZ16 = phu0.Z(Boolean.valueOf(z), str2, fetVar, (i4 & 14) | ((i4 >> 9) & 112), 0);
            objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m9.z;
                fetVar.o0(objP);
            }
            int i118 = i4 << 3;
            mm40Var2 = mm40Var2;
            i(oms0VarZ16, (Function1) objP, mm40Var2, pznVarA, aloVarA, ugdVar2, fetVar, (i118 & 896) | 48 | (i118 & 7168) | (57344 & i118) | (i118 & 3670016));
        } else {
            fetVar.X();
            pznVarA = pznVar2;
            aloVarA = aloVar2;
        }
        str3 = str2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p63(z, mm40Var2, pznVarA, aloVarA, str3, ugdVar, i2, i3);
        }
    }

    public static final px3 h0(c1a c1aVar) {
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        byte b2 = 0;
        Object obj = {0};
        Object objC = ((ow9) c1aVar).c(key);
        if (objC != null) {
            obj = objC;
        }
        return new px3((int[]) obj, b2);
    }

    public static final void i(oms0 oms0Var, Function1 function1, mm40 mm40Var, pzn pznVar, alo aloVar, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        pzn pznVar2;
        alo aloVar2;
        ugd ugdVar2;
        fetVar.g0(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(oms0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            pznVar2 = pznVar;
            i3 |= fetVar.g(pznVar2) ? 2048 : 1024;
        } else {
            pznVar2 = pznVar;
        }
        if ((i2 & 24576) == 0) {
            aloVar2 = aloVar;
            i3 |= fetVar.g(aloVar2) ? 16384 : 8192;
        } else {
            aloVar2 = aloVar;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            ugdVar2 = ugdVar;
            i4 |= fetVar.i(ugdVar2) ? 1048576 : 524288;
        } else {
            ugdVar2 = ugdVar;
        }
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new s63(function1, oms0Var);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = y43.c;
                fetVar.o0(objP2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            d(oms0Var, function1, mm40VarQ, pznVar2, aloVar2, (Function2) objP2, ugdVar2, fetVar, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t63(oms0Var, function1, mm40Var, pznVar, aloVar, ugdVar, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static jre0 i0(v0 v0Var, boolean z, boolean z2, Boolean bool, boolean z3, yox yoxVar, vd40 vd40Var) {
        kfy kfyVar;
        jre0 jre0Var;
        p4d0 p4d0Var;
        r2d0 r2d0Var;
        v0Var.getClass();
        gmk0 gmk0Var = (gmk0) v0Var.d;
        vd40Var.getClass();
        r2d0 r2d0Var2 = r2d0.INTERFACE;
        if (z) {
            if (bool == null) {
                udk.a(41, "isConst should not be null for property (container=", v0Var);
                return null;
            }
            if (v0Var instanceof p4d0) {
                p4d0 p4d0Var2 = (p4d0) v0Var;
                if (p4d0Var2.h == r2d0Var2) {
                    return c9x.u(yoxVar, p4d0Var2.g.d(g950.e("DefaultImpls")), vd40Var);
                }
            }
            if (bool.booleanValue() && (v0Var instanceof q4d0)) {
                kfy kfyVar2 = gmk0Var instanceof kfy ? (kfy) gmk0Var : null;
                rey reyVar = kfyVar2 != null ? kfyVar2.b : null;
                if (reyVar != null) {
                    String str = reyVar.f30360a;
                    if (str == null) {
                        rey.a(10);
                        throw null;
                    }
                    String strReplace = str.replace('/', '.');
                    strReplace.getClass();
                    swq swqVar = new swq(strReplace);
                    swq swqVarB = swqVar.b();
                    g950 g950VarG = swqVar.f32934a.g();
                    g950VarG.getClass();
                    swq swqVar2 = swq.c;
                    twq twqVar = mbc.g0(g950VarG).f32934a;
                    twqVar.c();
                    String strS = kotlin.text.c.s(twqVar.f34663a, '.', '$');
                    if (!swqVarB.f32934a.c()) {
                        strS = swqVarB + '.' + strS;
                    }
                    g2v g2vVarG = yoxVar.g(strS);
                    if (g2vVarG != null) {
                        return (jre0) g2vVarG.f10580a;
                    }
                    return null;
                }
            }
        }
        if (z2 && (v0Var instanceof p4d0)) {
            p4d0 p4d0Var3 = (p4d0) v0Var;
            if (p4d0Var3.h == r2d0.COMPANION_OBJECT && (p4d0Var = p4d0Var3.f) != null && ((r2d0Var = p4d0Var.h) == r2d0.CLASS || r2d0Var == r2d0.ENUM_CLASS || (z3 && (r2d0Var == r2d0Var2 || r2d0Var == r2d0.ANNOTATION_CLASS)))) {
                gmk0 gmk0Var2 = (gmk0) p4d0Var.d;
                ory oryVar = gmk0Var2 instanceof ory ? (ory) gmk0Var2 : null;
                if (oryVar != null) {
                    return oryVar.f25757a;
                }
            } else if (v0Var instanceof q4d0) {
                kfyVar = (kfy) gmk0Var;
                jre0Var = kfyVar.c;
                if (jre0Var == null) {
                    return c9x.u(yoxVar, kfyVar.a(), vd40Var);
                }
                return jre0Var;
            }
        } else if ((v0Var instanceof q4d0) && (gmk0Var instanceof kfy)) {
            kfyVar = (kfy) gmk0Var;
            jre0Var = kfyVar.c;
            if (jre0Var == null) {
                return c9x.u(yoxVar, kfyVar.a(), vd40Var);
            }
            return jre0Var;
        }
        return null;
    }

    public static final void j(int i2, int i3, fet fetVar, String str) {
        fetVar.g0(-1496130298);
        int i4 = (fetVar.g(str) ? 4 : 2) | i3 | (fetVar.e(i2) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mz3 mz3VarX = l7x.X(Integer.valueOf(i2), null, null, fetVar, (i4 >> 3) & 14, 30);
            k7x.b(str, null, o7k0.c, mz3VarX, mz3VarX, null, null, null, null, gqw0.b, gqw0.A, null, fetVar, (i4 & 14) | 805306800, 6, 31200);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v(str, i2, i3, (byte) 8);
        }
    }

    public static final int j0(c1a c1aVar, int i2) {
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        byte b2 = 0;
        Object obj = {0};
        ow9 ow9Var = (ow9) c1aVar;
        Object objC = ow9Var.c(key);
        if (objC != null) {
            obj = objC;
        }
        if (new px3((int[]) obj, b2).contains(Integer.valueOf(i2))) {
            return i2;
        }
        key.getClass();
        Object obj2 = {0};
        Object objC2 = ow9Var.c(key);
        if (objC2 != null) {
            obj2 = objC2;
        }
        return new px3((int[]) obj2, b2).contains(1) ? 1 : 0;
    }

    public static final void k(mm40 mm40Var, List list, ugd ugdVar, fet fetVar, int i2) {
        list.getClass();
        if ((i2 & 4) != 0) {
            ugdVar = o2e.f24526a;
        }
        kr00.a(u1c.M(2132081821, new zb8(ugdVar, mm40Var, list), fetVar), fetVar, 6);
    }

    public static final void l(plp plpVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(876776685);
        int i3 = (fetVar2.g(plpVar) ? 4 : 2) | i2;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
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
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(jm40Var, xfn.a(fetVar2).e, 12.0f, xfn.a(fetVar2).e, 0.0f, 8), new hjm(plpVar.b, new ojm(127), null, null, null, null, false, null, null, plpVar.f, null, null, 7676), kjm.b, null, null, null, fetVar, 384, 56);
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uph0(plpVar, i2);
        }
    }

    public static int l0(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return k5d.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final void m(mm40 mm40Var, und undVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        undVar.getClass();
        fetVar2.g0(221206118);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(undVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            String str = undVar.f35954a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, undVar, i2, (byte) 27);
        }
    }

    public static final boolean m0(c1a c1aVar) {
        c1aVar.getClass();
        return Build.VERSION.SDK_INT >= 28 && j0(c1aVar, 5) == 5;
    }

    public static final void n(l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        qdz qdzVar2;
        Function1 function3;
        Function1 function4;
        fet fetVar2 = fetVar;
        fetVar2.g0(121686506);
        int i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2 | (fetVar2.g(xczVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            qdzVar2 = qdzVar;
            i3 |= fetVar2.g(qdzVar2) ? 256 : 128;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function3 = function2;
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        } else {
            function3 = function2;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new plh(l7m0Var, (byte) 9));
                fetVar2.o0(objP);
            }
            lpk lpkVar = (lpk) ((l7m0) objP).getValue();
            if (lpkVar != null) {
                if (lpkVar instanceof jpk) {
                    fetVar2.e0(210772012);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = jgk0.b(new plh(l7m0Var, (byte) 10));
                        fetVar2.o0(objP2);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP2;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = jgk0.b(new plh(l7m0Var, (byte) 11));
                        fetVar2.o0(objP3);
                    }
                    int i4 = i3 << 6;
                    hp4.h(l7m0Var2, (l7m0) objP3, xczVar, qdzVar2, function1, function3, fetVar2, (i4 & 3670016) | (i4 & 7168) | 438 | (57344 & i4) | (458752 & i4));
                    function4 = function1;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    function4 = function1;
                    if (lpkVar instanceof kpk) {
                        fetVar2.e0(211381937);
                        mm40 mm40VarR = knm0.r(o7k0.c);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
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
                        mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                        mdm mdmVar = ((kpk) lpkVar).f18680a;
                        boolean z = (i3 & 7168) == 2048;
                        Object objP4 = fetVar2.P();
                        if (z || objP4 == cl5Var) {
                            objP4 = new ouh(function4, (byte) 21);
                            fetVar2.o0(objP4);
                        }
                        jcb.l(mm40VarB, mdmVar, false, (Function0) objP4, fetVar2, 0, 4);
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                }
            }
            throw b1j.f(976627752, fetVar2, false);
        }
        function4 = function1;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(l7m0Var, xczVar, qdzVar, function4, function2, i2, (byte) 2);
        }
    }

    public static float n0(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void o(l7m0 l7m0Var, l7m0 l7m0Var2, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, Function0 function0, fet fetVar, int i2) {
        int i3;
        xcz xczVar2;
        qdz qdzVar2;
        Function1 function2;
        fetVar.g0(-1689270119);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(g2vVar) : fetVar.i(g2vVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 2048 : 1024;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 24576) == 0) {
            qdzVar2 = qdzVar;
            i3 |= fetVar.g(qdzVar2) ? 16384 : 8192;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((196608 & i2) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int i4 = i3;
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
            int i5 = i4 >> 3;
            j120.H(i5 & 14, fetVar, null, l7m0Var2);
            mm40 mm40VarE = o050.W(jm40.b).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            boolean z2 = (i4 & 3670016) == 1048576;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new xks0(function0, (byte) 2);
                fetVar.o0(objP);
            }
            n4c.b((Function0) objP, fetVar);
            B(l7m0Var, g2vVar, xczVar2, qdzVar2, function2, fetVar, (i4 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o210(l7m0Var, l7m0Var2, g2vVar, xczVar, qdzVar, function1, function0, i2, (byte) 2);
        }
    }

    public static int o0(Object obj, o2h0 o2h0Var, byte[] bArr, int i2, int i3, vw3 vw3Var) throws ynx {
        int iA0 = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iA0 = a0(i4, bArr, iA0, vw3Var);
            i4 = vw3Var.f38129a;
        }
        int i5 = iA0;
        if (i4 < 0 || i4 > i3 - i5) {
            throw ynx.h();
        }
        int i6 = i5 + i4;
        o2h0Var.h(obj, bArr, i5, i6, vw3Var);
        vw3Var.c = obj;
        return i6;
    }

    public static final void p(mm40 mm40Var, slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(1364082676);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            int iOrdinal = slpVar.f32411a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1593192853);
                C(slpVar, z, j700Var, zczVar, function1, fetVar, i3 & 524286);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1592813785);
                uc9.F(slpVar, z, j700Var, zczVar, function1, fetVar, i3 & 524286);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-1592418659);
                ny9.y(slpVar, z, j700Var, zczVar, function1, fetVar, i3 & 524286);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(-1592027284);
                o2e.E(slpVar, z, j700Var, zczVar, function1, fetVar, i3 & 524286);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(918436962, fetVar, false);
                }
                fetVar.e0(-1591651316);
                K(slpVar, z, j700Var, zczVar, function1, fetVar, i3 & 524286);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var2, (Object) slpVar, z, (Object) j700Var, (Object) zczVar, (wdr) function1, i2, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static j6 p0(q8b q8bVar) {
        int i2;
        int i3;
        int iG = q8bVar.g(16);
        int iG2 = q8bVar.g(16);
        if (iG2 == 65535) {
            iG2 = q8bVar.g(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iG2 + i2;
        if (iG == 44097) {
            i4 += 2;
        }
        if (q8bVar.g(2) == 3) {
            do {
                q8bVar.g(2);
            } while (q8bVar.f());
        }
        int iG3 = q8bVar.g(10);
        if (q8bVar.f() && q8bVar.g(3) > 0) {
            q8bVar.o(2);
        }
        int i5 = q8bVar.f() ? 48000 : 44100;
        int iG4 = q8bVar.g(4);
        int[] iArr = b;
        if (i5 == 44100 && iG4 == 13) {
            i3 = iArr[iG4];
        } else if (i5 != 48000 || iG4 >= 14) {
            i3 = 0;
        } else {
            int i6 = iArr[iG4];
            int i7 = iG3 % 5;
            if (i7 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (iG4 != 3) {
                    }
                    i3 = i6 + 1;
                } else if (i7 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
        }
        return new j6(i5, i4, i3);
    }

    public static final void q(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1708627158);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            byte b2 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            boolean zG = fetVar2.g(xczVarA);
            Object objP2 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP2 == cl5Var) {
                objP2 = new bz0(xczVarA, pz40Var, yjeVar, b2);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, unit, (Function2) objP2);
            qsk qskVar = (qsk) ((tsk) l7m0Var.getValue()).b.getValue();
            mm40 mm40VarX = yyw.X(o7k0.c, null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
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
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP3);
            }
            zcl zclVar = qmk.f28987a;
            qcc.e(qskVar, (agk0) objP3, pz40Var, 0.0f, 0.0f, 0.0f, 0.0f, function1, fetVar, ((i3 << 15) & 29360128) | 432);
            int i4 = i3 << 3;
            fetVar2 = fetVar;
            n(l7m0Var, xczVarA, qdzVar, function1, function2, fetVar2, (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i2, (byte) 5);
        }
    }

    public static void q0(q8b q8bVar, i6 i6Var) throws kq80 {
        int iG = q8bVar.g(5);
        q8bVar.o(2);
        if (q8bVar.f()) {
            q8bVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            q8bVar.n();
        }
        if (q8bVar.f()) {
            int iG2 = q8bVar.g(3);
            if (i6Var.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                i6Var.b = iG;
            }
            if (q8bVar.f()) {
                s0(q8bVar);
            }
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-426928547);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 26);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, b2);
        }
    }

    public static void r0(q8b q8bVar, i6 i6Var) throws kq80 {
        q8bVar.o(2);
        boolean zF = q8bVar.f();
        int iG = q8bVar.g(8);
        for (int i2 = 0; i2 < iG; i2++) {
            q8bVar.o(2);
            if (q8bVar.f()) {
                q8bVar.o(5);
            }
            if (zF) {
                q8bVar.o(24);
            } else {
                if (q8bVar.f()) {
                    if (!q8bVar.f()) {
                        q8bVar.o(4);
                    }
                    i6Var.c = q8bVar.g(6) + 1;
                }
                q8bVar.o(4);
            }
        }
        if (q8bVar.f()) {
            q8bVar.o(3);
            if (q8bVar.f()) {
                s0(q8bVar);
            }
        }
    }

    public static final void s(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-3173425);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 14);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar2, (i3 << 3) & 112, 5);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar2, function1, i2, (byte) 22);
        }
    }

    public static void s0(q8b q8bVar) throws kq80 {
        int iG = q8bVar.g(6);
        if (iG < 2 || iG > 42) {
            throw kq80.e(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        q8bVar.o(iG * 8);
    }

    public static final void t(mm40 mm40Var, f9o f9oVar, l7m0 l7m0Var, float f2, float f3, float f4, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        f9oVar.getClass();
        function0.getClass();
        fetVar.g0(676517412);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(f9oVar) ? 32 : 16;
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
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object[] objArr = new Object[0];
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new plh(l7m0Var, (byte) 22);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                Object fbnVar = new fbn(new za3(f2, f4, (byte) 25));
                fetVar.o0(fbnVar);
                objP2 = fbnVar;
            }
            s3e s3eVar = (s3e) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                Object fbnVar2 = new fbn(new za3(f3, f4, (byte) 24));
                fetVar.o0(fbnVar2);
                objP3 = fbnVar2;
            }
            s3e s3eVar2 = (s3e) objP3;
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object objP5 = fetVar.P();
            Object obj2 = objP5;
            if (objP5 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarD, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new e9o(pz40Var, lwfVar, nie0Var2, f9oVar, l7m0Var, l7m0VarY, function0, (byte) 0), fetVar), fetVar, 24630);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new db3(mm40Var2, f9oVar, l7m0Var, f2, f3, f4, function0, i2, (byte) 2);
        }
    }

    public static final azn t0(oms0 oms0Var, Function1 function1, Object obj, fet fetVar) {
        azn aznVar;
        fetVar.b0(-422486566, oms0Var);
        boolean zH = oms0Var.h();
        p4 p4Var = oms0Var.f25519a;
        if (zH) {
            fetVar.e0(-212166497);
            fetVar.r(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                aznVar = azn.b;
            } else {
                aznVar = ((Boolean) function1.invoke(p4Var.y0())).booleanValue() ? azn.c : azn.f1725a;
            }
        } else {
            fetVar.e0(-211886815);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object value = ((hgk0) oms0Var.e).getValue();
            if (((Boolean) function1.invoke(p4Var.y0())).booleanValue() || (value != null && ((Boolean) function1.invoke(value)).booleanValue())) {
                pz40Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                aznVar = azn.b;
            } else {
                aznVar = ((value == null || !((Boolean) function1.invoke(value)).booleanValue()) && ((Boolean) pz40Var.getValue()).booleanValue()) ? azn.c : azn.f1725a;
            }
            fetVar.r(false);
        }
        fetVar.r(false);
        return aznVar;
    }

    public static final void u(fqj0 fqj0Var, fet fetVar, int i2) {
        fetVar.g0(1992805051);
        int i3 = (fetVar.g(fqj0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 20.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, s5x0.N(xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var), 0.0f, 0.0f, 0.0f, 8.0f, 7));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 16, i2, fqj0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:105:0x023e A[LOOP:10: B:101:0x022f->B:105:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0246  */
    /* JADX WARN: Code duplicated, block: B:111:0x0256  */
    /* JADX WARN: Code duplicated, block: B:114:0x0263 A[LOOP:11: B:110:0x0254->B:114:0x0263, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026b  */
    /* JADX WARN: Code duplicated, block: B:120:0x027b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0288 A[LOOP:12: B:119:0x0279->B:123:0x0288, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0290  */
    /* JADX WARN: Code duplicated, block: B:129:0x029e  */
    /* JADX WARN: Code duplicated, block: B:12:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b9 A[LOOP:20: B:132:0x02a9->B:136:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02dd A[LOOP:13: B:141:0x02ce->B:145:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:154:0x0302 A[LOOP:14: B:150:0x02f3->B:154:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x030a  */
    /* JADX WARN: Code duplicated, block: B:15:0x00d1 A[LOOP:0: B:11:0x00c4->B:15:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x031a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0327 A[LOOP:15: B:159:0x0318->B:163:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x032f  */
    /* JADX WARN: Code duplicated, block: B:169:0x033f  */
    /* JADX WARN: Code duplicated, block: B:172:0x034c A[LOOP:16: B:168:0x033d->B:172:0x034c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0354  */
    /* JADX WARN: Code duplicated, block: B:178:0x0364  */
    /* JADX WARN: Code duplicated, block: B:181:0x0371 A[LOOP:17: B:177:0x0362->B:181:0x0371, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0379  */
    /* JADX WARN: Code duplicated, block: B:187:0x0389  */
    /* JADX WARN: Code duplicated, block: B:18:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:190:0x0396 A[LOOP:18: B:186:0x0387->B:190:0x0396, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x039e  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:199:0x03bb A[LOOP:19: B:195:0x03ac->B:199:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:211:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:216:0x0417  */
    /* JADX WARN: Code duplicated, block: B:218:0x041e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:221:0x0427  */
    /* JADX WARN: Code duplicated, block: B:223:0x042e  */
    /* JADX WARN: Code duplicated, block: B:226:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x00d5 A[EDGE_INSN: B:227:0x00d5->B:17:0x00d5 BREAK  A[LOOP:0: B:11:0x00c4->B:15:0x00d1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x00fc A[EDGE_INSN: B:229:0x00fc->B:26:0x00fc BREAK  A[LOOP:1: B:20:0x00eb->B:24:0x00f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x011c A[EDGE_INSN: B:231:0x011c->B:35:0x011c BREAK  A[LOOP:2: B:29:0x010b->B:33:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x014e A[EDGE_INSN: B:233:0x014e->B:44:0x014e BREAK  A[LOOP:3: B:38:0x013d->B:42:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x016e A[EDGE_INSN: B:234:0x016e->B:53:0x016e BREAK  A[LOOP:4: B:47:0x015d->B:51:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x018d A[EDGE_INSN: B:237:0x018d->B:62:0x018d BREAK  A[LOOP:5: B:56:0x017c->B:60:0x0189], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01b0 A[EDGE_INSN: B:239:0x01b0->B:71:0x01b0 BREAK  A[LOOP:6: B:65:0x019b->B:69:0x01aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01d5 A[EDGE_INSN: B:241:0x01d5->B:80:0x01d5 BREAK  A[LOOP:7: B:74:0x01c0->B:78:0x01cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01fa A[EDGE_INSN: B:243:0x01fa->B:89:0x01fa BREAK  A[LOOP:8: B:83:0x01e5->B:87:0x01f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x021f A[EDGE_INSN: B:245:0x021f->B:98:0x021f BREAK  A[LOOP:9: B:92:0x020a->B:96:0x0219], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0244 A[EDGE_INSN: B:247:0x0244->B:107:0x0244 BREAK  A[LOOP:10: B:101:0x022f->B:105:0x023e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0269 A[EDGE_INSN: B:248:0x0269->B:116:0x0269 BREAK  A[LOOP:11: B:110:0x0254->B:114:0x0263], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00f8 A[LOOP:1: B:20:0x00eb->B:24:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x028e A[EDGE_INSN: B:251:0x028e->B:125:0x028e BREAK  A[LOOP:12: B:119:0x0279->B:123:0x0288], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x02e3 A[EDGE_INSN: B:253:0x02e3->B:147:0x02e3 BREAK  A[LOOP:13: B:141:0x02ce->B:145:0x02dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0308 A[EDGE_INSN: B:255:0x0308->B:156:0x0308 BREAK  A[LOOP:14: B:150:0x02f3->B:154:0x0302], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x032d A[EDGE_INSN: B:256:0x032d->B:165:0x032d BREAK  A[LOOP:15: B:159:0x0318->B:163:0x0327], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0352 A[EDGE_INSN: B:259:0x0352->B:174:0x0352 BREAK  A[LOOP:16: B:168:0x033d->B:172:0x034c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0377 A[EDGE_INSN: B:261:0x0377->B:183:0x0377 BREAK  A[LOOP:17: B:177:0x0362->B:181:0x0371], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x039c A[EDGE_INSN: B:263:0x039c->B:192:0x039c BREAK  A[LOOP:18: B:186:0x0387->B:190:0x0396], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x03c1 A[EDGE_INSN: B:265:0x03c1->B:201:0x03c1 BREAK  A[LOOP:19: B:195:0x03ac->B:199:0x03bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0118 A[LOOP:2: B:29:0x010b->B:33:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    /* JADX WARN: Code duplicated, block: B:39:0x013f  */
    /* JADX WARN: Code duplicated, block: B:42:0x014a A[LOOP:3: B:38:0x013d->B:42:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a A[LOOP:4: B:47:0x015d->B:51:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[LOOP:5: B:56:0x017c->B:60:0x0189, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01aa A[LOOP:6: B:65:0x019b->B:69:0x01aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf A[LOOP:7: B:74:0x01c0->B:78:0x01cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4 A[LOOP:8: B:83:0x01e5->B:87:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x020c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219 A[LOOP:9: B:92:0x020a->B:96:0x0219, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0221  */
    public static final hl1 u0(wrd wrdVar) {
        f61 f61Var;
        f61 f61Var2;
        String str;
        ep1[] ep1VarArrValues;
        int length;
        int i2;
        ep1 ep1Var;
        String str2;
        hr10[] hr10VarArrValues;
        int length2;
        int i3;
        hr10 hr10Var;
        String str3;
        h650[] h650VarArrValues;
        int length3;
        int i4;
        h650 h650Var;
        String str4;
        b01[] b01VarArrValues;
        int length4;
        int i5;
        b01 b01Var;
        String str5;
        lj0[] lj0VarArrValues;
        int length5;
        int i6;
        lj0 lj0Var;
        String str6;
        xmu0[] xmu0VarArrValues;
        int length6;
        int i7;
        xmu0 xmu0Var;
        String str7;
        of1[] of1VarArrValues;
        int length7;
        int i8;
        of1 of1Var;
        String str8;
        ot0[] ot0VarArrValues;
        int length8;
        int i9;
        ot0 ot0Var;
        String str9;
        re0[] re0VarArrValues;
        int length9;
        int i10;
        re0 re0Var;
        String str10;
        me1[] me1VarArrValues;
        int length10;
        int i11;
        me1 me1Var;
        String str11;
        ee1[] ee1VarArrValues;
        int length11;
        int i12;
        ee1 ee1Var;
        String str12;
        gh0[] gh0VarArrValues;
        int length12;
        int i13;
        gh0 gh0Var;
        String str13;
        qe0[] qe0VarArrValues;
        int length13;
        int i14;
        qe0 qe0Var;
        String str14;
        hh0[] hh0VarArrValues;
        int length14;
        int i15;
        hh0 hh0Var;
        hh0 hh0Var2;
        hh0[] hh0VarArr;
        String str15;
        ai0[] ai0VarArrValues;
        int length15;
        int i16;
        ai0 ai0Var;
        String str16;
        zf1[] zf1VarArrValues;
        int length16;
        int i17;
        zf1 zf1Var;
        String str17;
        ep0[] ep0VarArrValues;
        int length17;
        int i18;
        ep0 ep0Var;
        String str18;
        th1[] th1VarArrValues;
        int length18;
        int i19;
        th1 th1Var;
        String str19;
        nr1[] nr1VarArrValues;
        int length19;
        int i20;
        nr1 nr1Var;
        String str20;
        vc0[] vc0VarArrValues;
        int length20;
        int i21;
        vc0 vc0Var;
        String str21;
        ww1[] ww1VarArrValues;
        int length21;
        int i22;
        ww1 ww1Var;
        Integer num;
        Integer num2;
        int iIntValue;
        Integer num3;
        int iIntValue2;
        Integer num4;
        int iIntValue3;
        ww1[] ww1VarArr;
        vc0[] vc0VarArr;
        nr1[] nr1VarArr;
        th1[] th1VarArr;
        ep0[] ep0VarArr;
        zf1[] zf1VarArr;
        ai0[] ai0VarArr;
        qe0[] qe0VarArr;
        gh0[] gh0VarArr;
        ee1[] ee1VarArr;
        me1[] me1VarArr;
        re0[] re0VarArr;
        ot0[] ot0VarArr;
        of1[] of1VarArr;
        wrdVar.getClass();
        li0 li0Var = wrdVar.x4;
        boolean zV = ay3.V(wrdVar);
        li0 li0Var2 = wrdVar.o4;
        rhp rhpVar = wrdVar.z7;
        if (!zV) {
            if (ay3.W(wrdVar)) {
                Boolean bool = li0Var2.d;
                Boolean bool2 = Boolean.TRUE;
                f61Var2 = new f61(true, false, false, false, false, false, false, false, false, Intrinsics.d(bool, bool2), false, false, Intrinsics.d(rhpVar.i, bool2));
            } else {
                Boolean bool3 = li0Var2.d;
                Boolean bool4 = Boolean.TRUE;
                f61Var = new f61(false, false, false, false, false, false, false, false, false, Intrinsics.d(bool3, bool4), false, false, Intrinsics.d(rhpVar.i, bool4));
            }
            boolean zV2 = ay3.V(wrdVar);
            str = wrdVar.O2.d;
            ep1VarArrValues = ep1.values();
            length = ep1VarArrValues.length;
            i2 = 0;
            while (true) {
                if (i2 < length) {
                    ep1Var = null;
                    break;
                }
                ep1Var = ep1VarArrValues[i2];
                if (ep1Var.f8163a.equals(str)) {
                    break;
                }
                i2++;
            }
            if (ep1Var == null) {
                ep1Var = ep1.AGGREGATOR;
            }
            boolean zD = Intrinsics.d(li0Var.m, Boolean.TRUE);
            str2 = wrdVar.K4.f20679a;
            hr10VarArrValues = hr10.values();
            length2 = hr10VarArrValues.length;
            i3 = 0;
            while (true) {
                if (i3 < length2) {
                    hr10Var = null;
                    break;
                }
                hr10Var = hr10VarArrValues[i3];
                if (hr10Var.f13509a.equals(str2)) {
                    break;
                }
                i3++;
            }
            if (hr10Var == null) {
                hr10Var = hr10.SQUARE_S;
            }
            hr10 hr10Var2 = hr10Var;
            str3 = wrdVar.h5.x;
            h650VarArrValues = h650.values();
            length3 = h650VarArrValues.length;
            i4 = 0;
            while (true) {
                if (i4 < length3) {
                    h650Var = null;
                    break;
                }
                h650Var = h650VarArrValues[i4];
                if (h650Var.f12513a.equals(str3)) {
                    break;
                }
                i4++;
            }
            if (h650Var == null) {
                h650Var = h650.CARD_HORIZONTAL;
            }
            h650 h650Var2 = h650Var;
            Boolean bool5 = wrdVar.y4.n;
            Boolean bool6 = Boolean.TRUE;
            boolean zD2 = Intrinsics.d(bool5, bool6);
            boolean zD3 = Intrinsics.d(wrdVar.F4.u, bool6);
            str4 = wrdVar.q5.H;
            b01VarArrValues = b01.values();
            length4 = b01VarArrValues.length;
            i5 = 0;
            while (true) {
                if (i5 < length4) {
                    b01Var = null;
                    break;
                }
                b01Var = b01VarArrValues[i5];
                if (b01Var.f1746a.equals(str4)) {
                    break;
                }
                i5++;
            }
            if (b01Var == null) {
                b01Var = b01.BACKGROUND_PICTURE;
            }
            b01 b01Var2 = b01Var;
            str5 = wrdVar.o5.F;
            lj0VarArrValues = lj0.values();
            length5 = lj0VarArrValues.length;
            i6 = 0;
            while (true) {
                if (i6 < length5) {
                    lj0Var = null;
                    break;
                }
                lj0Var = lj0VarArrValues[i6];
                if (lj0Var.f20131a.equals(str5)) {
                    break;
                }
                i6++;
            }
            if (lj0Var == null) {
                lj0Var = lj0.TRANSPARENCY;
            }
            str6 = wrdVar.p5.G;
            xmu0VarArrValues = xmu0.values();
            length6 = xmu0VarArrValues.length;
            i7 = 0;
            while (true) {
                if (i7 < length6) {
                    xmu0Var = null;
                    break;
                }
                xmu0Var = xmu0VarArrValues[i7];
                if (xmu0Var.f41147a.equals(str6)) {
                    break;
                }
                i7++;
            }
            if (xmu0Var == null) {
                xmu0Var = xmu0.STATUS;
            }
            str7 = wrdVar.r5.I;
            of1VarArrValues = of1.values();
            length7 = of1VarArrValues.length;
            i8 = 0;
            while (true) {
                if (i8 < length7) {
                    of1Var = null;
                    break;
                }
                of1Var = of1VarArrValues[i8];
                of1VarArr = of1VarArrValues;
                if (of1Var.f25144a.equals(str7)) {
                    break;
                }
                i8++;
                of1VarArrValues = of1VarArr;
            }
            if (of1Var == null) {
                of1Var = of1.CELLS;
            }
            of1 of1Var2 = of1Var;
            str8 = wrdVar.s5.J;
            ot0VarArrValues = ot0.values();
            length8 = ot0VarArrValues.length;
            i9 = 0;
            while (true) {
                if (i9 < length8) {
                    ot0Var = null;
                    break;
                }
                ot0Var = ot0VarArrValues[i9];
                ot0VarArr = ot0VarArrValues;
                if (ot0Var.f25807a.equals(str8)) {
                    break;
                }
                i9++;
                ot0VarArrValues = ot0VarArr;
            }
            if (ot0Var == null) {
                ot0Var = ot0.BACKGROUND_L;
            }
            ot0 ot0Var2 = ot0Var;
            str9 = wrdVar.t5.K;
            re0VarArrValues = re0.values();
            length9 = re0VarArrValues.length;
            i10 = 0;
            while (true) {
                if (i10 < length9) {
                    re0Var = null;
                    break;
                }
                re0Var = re0VarArrValues[i10];
                re0VarArr = re0VarArrValues;
                if (re0Var.f30311a.equals(str9)) {
                    break;
                }
                i10++;
                re0VarArrValues = re0VarArr;
            }
            if (re0Var == null) {
                re0Var = re0.ACCENT_ARROW;
            }
            re0 re0Var2 = re0Var;
            str10 = wrdVar.w5.N;
            me1VarArrValues = me1.values();
            length10 = me1VarArrValues.length;
            i11 = 0;
            while (true) {
                if (i11 < length10) {
                    me1Var = null;
                    break;
                }
                me1Var = me1VarArrValues[i11];
                me1VarArr = me1VarArrValues;
                if (me1Var.f21622a.equals(str10)) {
                    break;
                }
                i11++;
                me1VarArrValues = me1VarArr;
            }
            if (me1Var == null) {
                me1Var = me1.HEADER;
            }
            me1 me1Var2 = me1Var;
            str11 = wrdVar.v5.M;
            ee1VarArrValues = ee1.values();
            length11 = ee1VarArrValues.length;
            i12 = 0;
            while (true) {
                if (i12 < length11) {
                    ee1Var = null;
                    break;
                }
                ee1Var = ee1VarArrValues[i12];
                ee1VarArr = ee1VarArrValues;
                if (ee1Var.f7646a.equals(str11)) {
                    break;
                }
                i12++;
                ee1VarArrValues = ee1VarArr;
            }
            if (ee1Var == null) {
                ee1Var = ee1.CELL_STYLE;
            }
            ee1 ee1Var2 = ee1Var;
            str12 = wrdVar.u5.L;
            gh0VarArrValues = gh0.values();
            length12 = gh0VarArrValues.length;
            i13 = 0;
            while (true) {
                if (i13 < length12) {
                    gh0Var = null;
                    break;
                }
                gh0Var = gh0VarArrValues[i13];
                gh0VarArr = gh0VarArrValues;
                if (gh0Var.f11274a.equals(str12)) {
                    break;
                }
                i13++;
                gh0VarArrValues = gh0VarArr;
            }
            if (gh0Var == null) {
                gh0Var = gh0.LINE;
            }
            gh0 gh0Var2 = gh0Var;
            str13 = wrdVar.A5.R;
            qe0VarArrValues = qe0.values();
            length13 = qe0VarArrValues.length;
            i14 = 0;
            while (true) {
                if (i14 < length13) {
                    qe0Var = null;
                    break;
                }
                qe0Var = qe0VarArrValues[i14];
                qe0VarArr = qe0VarArrValues;
                if (qe0Var.f28557a.equals(str13)) {
                    break;
                }
                i14++;
                qe0VarArrValues = qe0VarArr;
            }
            if (qe0Var == null) {
                qe0Var = qe0.LARGE_ICON;
            }
            qe0 qe0Var2 = qe0Var;
            str14 = wrdVar.y5.P;
            if (ay3.W(wrdVar)) {
                hh0Var = hh0.ICON_LEFT_VIRTUAL;
            } else {
                hh0VarArrValues = hh0.values();
                length14 = hh0VarArrValues.length;
                i15 = 0;
                while (true) {
                    if (i15 < length14) {
                        hh0Var = null;
                        break;
                    }
                    hh0Var2 = hh0VarArrValues[i15];
                    hh0VarArr = hh0VarArrValues;
                    if (hh0Var2.f13038a.equals(str14)) {
                        hh0Var = hh0Var2;
                        break;
                    }
                    i15++;
                    hh0VarArrValues = hh0VarArr;
                }
                if (hh0Var == null) {
                    hh0Var = hh0.ICON_LEFT;
                }
            }
            hh0 hh0Var3 = hh0Var;
            str15 = wrdVar.x5.O;
            ai0VarArrValues = ai0.values();
            length15 = ai0VarArrValues.length;
            i16 = 0;
            while (true) {
                if (i16 < length15) {
                    ai0Var = null;
                    break;
                }
                ai0Var = ai0VarArrValues[i16];
                ai0VarArr = ai0VarArrValues;
                if (ai0Var.f900a.equals(str15)) {
                    break;
                }
                i16++;
                ai0VarArrValues = ai0VarArr;
            }
            if (ai0Var == null) {
                ai0Var = ai0.CHIPS_S;
            }
            ai0 ai0Var2 = ai0Var;
            str16 = wrdVar.E5.V;
            zf1VarArrValues = zf1.values();
            length16 = zf1VarArrValues.length;
            i17 = 0;
            while (true) {
                if (i17 < length16) {
                    zf1Var = null;
                    break;
                }
                zf1Var = zf1VarArrValues[i17];
                zf1VarArr = zf1VarArrValues;
                if (zf1Var.f44280a.equals(str16)) {
                    break;
                }
                i17++;
                zf1VarArrValues = zf1VarArr;
            }
            if (zf1Var == null) {
                zf1Var = zf1.BACKGROUND_S;
            }
            zf1 zf1Var2 = zf1Var;
            str17 = wrdVar.F5.W;
            ep0VarArrValues = ep0.values();
            length17 = ep0VarArrValues.length;
            i18 = 0;
            while (true) {
                if (i18 < length17) {
                    ep0Var = null;
                    break;
                }
                ep0Var = ep0VarArrValues[i18];
                ep0VarArr = ep0VarArrValues;
                if (ep0Var.f8162a.equals(str17)) {
                    break;
                }
                i18++;
                ep0VarArrValues = ep0VarArr;
            }
            if (ep0Var == null) {
                ep0Var = ep0.SMALL_HEADER;
            }
            ep0 ep0Var2 = ep0Var;
            str18 = wrdVar.z5.Q;
            th1VarArrValues = th1.values();
            length18 = th1VarArrValues.length;
            i19 = 0;
            while (true) {
                if (i19 < length18) {
                    th1Var = null;
                    break;
                }
                th1Var = th1VarArrValues[i19];
                th1VarArr = th1VarArrValues;
                if (th1Var.f33940a.equals(str18)) {
                    break;
                }
                i19++;
                th1VarArrValues = th1VarArr;
            }
            if (th1Var == null) {
                th1Var = th1.BRAND_S;
            }
            th1 th1Var2 = th1Var;
            str19 = wrdVar.G5.X;
            nr1VarArrValues = nr1.values();
            length19 = nr1VarArrValues.length;
            i20 = 0;
            while (true) {
                if (i20 < length19) {
                    nr1Var = null;
                    break;
                }
                nr1Var = nr1VarArrValues[i20];
                nr1VarArr = nr1VarArrValues;
                if (nr1Var.f23981a.equals(str19)) {
                    break;
                }
                i20++;
                nr1VarArrValues = nr1VarArr;
            }
            if (nr1Var == null) {
                nr1Var = nr1.PRIZE;
            }
            nr1 nr1Var2 = nr1Var;
            str20 = wrdVar.K5.b0;
            vc0VarArrValues = vc0.values();
            length20 = vc0VarArrValues.length;
            i21 = 0;
            while (true) {
                if (i21 < length20) {
                    vc0Var = null;
                    break;
                }
                vc0Var = vc0VarArrValues[i21];
                vc0VarArr = vc0VarArrValues;
                if (vc0Var.f37164a.equals(str20)) {
                    break;
                }
                i21++;
                vc0VarArrValues = vc0VarArr;
            }
            if (vc0Var == null) {
                vc0Var = vc0.SIMPLE;
            }
            vc0 vc0Var2 = vc0Var;
            str21 = wrdVar.L5.c0;
            ww1VarArrValues = ww1.values();
            length21 = ww1VarArrValues.length;
            i22 = 0;
            while (true) {
                if (i22 < length21) {
                    ww1Var = null;
                    break;
                }
                ww1Var = ww1VarArrValues[i22];
                ww1VarArr = ww1VarArrValues;
                if (ww1Var.f39865a.equals(str21)) {
                    break;
                }
                i22++;
                ww1VarArrValues = ww1VarArr;
            }
            if (ww1Var == null) {
                ww1Var = ww1.PICTURE;
            }
            ww1 ww1Var2 = ww1Var;
            Boolean bool7 = wrdVar.C4.r;
            Boolean bool8 = Boolean.TRUE;
            boolean zD4 = Intrinsics.d(bool7, bool8);
            boolean zD5 = Intrinsics.d(wrdVar.D4.s, bool8);
            num = wrdVar.E4.t;
            if (num == null && num.intValue() == 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 30;
            }
            int i23 = iIntValue;
            boolean zW = ay3.W(wrdVar);
            boolean zD6 = Intrinsics.d(wrdVar.A4.p, bool8);
            boolean zD7 = Intrinsics.d(wrdVar.B4.q, bool8);
            boolean zD8 = Intrinsics.d(wrdVar.p3.E, bool8);
            num3 = wrdVar.r1.f1;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 60;
            }
            int i24 = iIntValue2;
            num4 = wrdVar.s1.g1;
            if (num4 != null) {
                iIntValue3 = num4.intValue();
            } else {
                iIntValue3 = 180;
            }
            return new hl1(f61Var, zV2, ep1Var, zD, hr10Var2, h650Var2, zD2, b01Var2, lj0Var, xmu0Var, of1Var2, ot0Var2, re0Var2, me1Var2, ee1Var2, gh0Var2, qe0Var2, hh0Var3, ai0Var2, zf1Var2, ep0Var2, th1Var2, nr1Var2, vc0Var2, ww1Var2, zD4, zD5, i23, zW, zD6, zD7, zD8, i24, iIntValue3, zD3, Intrinsics.d(wrdVar.q3.F, bool8), Intrinsics.d(wrdVar.r3.G, bool8), Intrinsics.d(wrdVar.s3.H, bool8), Intrinsics.d(wrdVar.x1.l1, bool8), Intrinsics.d(wrdVar.H4.w, bool8), Intrinsics.d(wrdVar.I4.x, bool8), Intrinsics.d(wrdVar.J4.y, bool8));
        }
        Boolean bool9 = wrdVar.c3.r;
        Boolean bool10 = Boolean.TRUE;
        f61Var2 = new f61(false, true, Intrinsics.d(bool9, bool10), Intrinsics.d(wrdVar.p4.e, bool10), Intrinsics.d(wrdVar.d3.s, bool10), Intrinsics.d(li0Var.m, bool10), Intrinsics.d(wrdVar.G4.v, bool10), Intrinsics.d(wrdVar.e3.t, bool10), Intrinsics.d(wrdVar.f3.u, bool10), Intrinsics.d(li0Var2.d, bool10), Intrinsics.d(wrdVar.g3.v, bool10), Intrinsics.d(wrdVar.l4.f20082a, bool10), Intrinsics.d(rhpVar.i, bool10));
        f61Var = f61Var2;
        boolean zV3 = ay3.V(wrdVar);
        str = wrdVar.O2.d;
        ep1VarArrValues = ep1.values();
        length = ep1VarArrValues.length;
        i2 = 0;
        while (true) {
            if (i2 < length) {
                ep1Var = null;
                break;
            }
            ep1Var = ep1VarArrValues[i2];
            if (ep1Var.f8163a.equals(str)) {
                break;
                break;
            }
            i2++;
        }
        if (ep1Var == null) {
            ep1Var = ep1.AGGREGATOR;
        }
        boolean zD9 = Intrinsics.d(li0Var.m, Boolean.TRUE);
        str2 = wrdVar.K4.f20679a;
        hr10VarArrValues = hr10.values();
        length2 = hr10VarArrValues.length;
        i3 = 0;
        while (true) {
            if (i3 < length2) {
                hr10Var = null;
                break;
            }
            hr10Var = hr10VarArrValues[i3];
            if (hr10Var.f13509a.equals(str2)) {
                break;
                break;
            }
            i3++;
        }
        if (hr10Var == null) {
            hr10Var = hr10.SQUARE_S;
        }
        hr10 hr10Var3 = hr10Var;
        str3 = wrdVar.h5.x;
        h650VarArrValues = h650.values();
        length3 = h650VarArrValues.length;
        i4 = 0;
        while (true) {
            if (i4 < length3) {
                h650Var = null;
                break;
            }
            h650Var = h650VarArrValues[i4];
            if (h650Var.f12513a.equals(str3)) {
                break;
                break;
            }
            i4++;
        }
        if (h650Var == null) {
            h650Var = h650.CARD_HORIZONTAL;
        }
        h650 h650Var3 = h650Var;
        Boolean bool11 = wrdVar.y4.n;
        Boolean bool12 = Boolean.TRUE;
        boolean zD10 = Intrinsics.d(bool11, bool12);
        boolean zD11 = Intrinsics.d(wrdVar.F4.u, bool12);
        str4 = wrdVar.q5.H;
        b01VarArrValues = b01.values();
        length4 = b01VarArrValues.length;
        i5 = 0;
        while (true) {
            if (i5 < length4) {
                b01Var = null;
                break;
            }
            b01Var = b01VarArrValues[i5];
            if (b01Var.f1746a.equals(str4)) {
                break;
                break;
            }
            i5++;
        }
        if (b01Var == null) {
            b01Var = b01.BACKGROUND_PICTURE;
        }
        b01 b01Var3 = b01Var;
        str5 = wrdVar.o5.F;
        lj0VarArrValues = lj0.values();
        length5 = lj0VarArrValues.length;
        i6 = 0;
        while (true) {
            if (i6 < length5) {
                lj0Var = null;
                break;
            }
            lj0Var = lj0VarArrValues[i6];
            if (lj0Var.f20131a.equals(str5)) {
                break;
                break;
            }
            i6++;
        }
        if (lj0Var == null) {
            lj0Var = lj0.TRANSPARENCY;
        }
        str6 = wrdVar.p5.G;
        xmu0VarArrValues = xmu0.values();
        length6 = xmu0VarArrValues.length;
        i7 = 0;
        while (true) {
            if (i7 < length6) {
                xmu0Var = null;
                break;
            }
            xmu0Var = xmu0VarArrValues[i7];
            if (xmu0Var.f41147a.equals(str6)) {
                break;
                break;
            }
            i7++;
        }
        if (xmu0Var == null) {
            xmu0Var = xmu0.STATUS;
        }
        str7 = wrdVar.r5.I;
        of1VarArrValues = of1.values();
        length7 = of1VarArrValues.length;
        i8 = 0;
        while (true) {
            if (i8 < length7) {
                of1Var = null;
                break;
            }
            of1Var = of1VarArrValues[i8];
            of1VarArr = of1VarArrValues;
            if (of1Var.f25144a.equals(str7)) {
                break;
                break;
            }
            i8++;
            of1VarArrValues = of1VarArr;
        }
        if (of1Var == null) {
            of1Var = of1.CELLS;
        }
        of1 of1Var3 = of1Var;
        str8 = wrdVar.s5.J;
        ot0VarArrValues = ot0.values();
        length8 = ot0VarArrValues.length;
        i9 = 0;
        while (true) {
            if (i9 < length8) {
                ot0Var = null;
                break;
            }
            ot0Var = ot0VarArrValues[i9];
            ot0VarArr = ot0VarArrValues;
            if (ot0Var.f25807a.equals(str8)) {
                break;
                break;
            }
            i9++;
            ot0VarArrValues = ot0VarArr;
        }
        if (ot0Var == null) {
            ot0Var = ot0.BACKGROUND_L;
        }
        ot0 ot0Var3 = ot0Var;
        str9 = wrdVar.t5.K;
        re0VarArrValues = re0.values();
        length9 = re0VarArrValues.length;
        i10 = 0;
        while (true) {
            if (i10 < length9) {
                re0Var = null;
                break;
            }
            re0Var = re0VarArrValues[i10];
            re0VarArr = re0VarArrValues;
            if (re0Var.f30311a.equals(str9)) {
                break;
                break;
            }
            i10++;
            re0VarArrValues = re0VarArr;
        }
        if (re0Var == null) {
            re0Var = re0.ACCENT_ARROW;
        }
        re0 re0Var3 = re0Var;
        str10 = wrdVar.w5.N;
        me1VarArrValues = me1.values();
        length10 = me1VarArrValues.length;
        i11 = 0;
        while (true) {
            if (i11 < length10) {
                me1Var = null;
                break;
            }
            me1Var = me1VarArrValues[i11];
            me1VarArr = me1VarArrValues;
            if (me1Var.f21622a.equals(str10)) {
                break;
                break;
            }
            i11++;
            me1VarArrValues = me1VarArr;
        }
        if (me1Var == null) {
            me1Var = me1.HEADER;
        }
        me1 me1Var3 = me1Var;
        str11 = wrdVar.v5.M;
        ee1VarArrValues = ee1.values();
        length11 = ee1VarArrValues.length;
        i12 = 0;
        while (true) {
            if (i12 < length11) {
                ee1Var = null;
                break;
            }
            ee1Var = ee1VarArrValues[i12];
            ee1VarArr = ee1VarArrValues;
            if (ee1Var.f7646a.equals(str11)) {
                break;
                break;
            }
            i12++;
            ee1VarArrValues = ee1VarArr;
        }
        if (ee1Var == null) {
            ee1Var = ee1.CELL_STYLE;
        }
        ee1 ee1Var3 = ee1Var;
        str12 = wrdVar.u5.L;
        gh0VarArrValues = gh0.values();
        length12 = gh0VarArrValues.length;
        i13 = 0;
        while (true) {
            if (i13 < length12) {
                gh0Var = null;
                break;
            }
            gh0Var = gh0VarArrValues[i13];
            gh0VarArr = gh0VarArrValues;
            if (gh0Var.f11274a.equals(str12)) {
                break;
                break;
            }
            i13++;
            gh0VarArrValues = gh0VarArr;
        }
        if (gh0Var == null) {
            gh0Var = gh0.LINE;
        }
        gh0 gh0Var3 = gh0Var;
        str13 = wrdVar.A5.R;
        qe0VarArrValues = qe0.values();
        length13 = qe0VarArrValues.length;
        i14 = 0;
        while (true) {
            if (i14 < length13) {
                qe0Var = null;
                break;
            }
            qe0Var = qe0VarArrValues[i14];
            qe0VarArr = qe0VarArrValues;
            if (qe0Var.f28557a.equals(str13)) {
                break;
                break;
            }
            i14++;
            qe0VarArrValues = qe0VarArr;
        }
        if (qe0Var == null) {
            qe0Var = qe0.LARGE_ICON;
        }
        qe0 qe0Var3 = qe0Var;
        str14 = wrdVar.y5.P;
        if (ay3.W(wrdVar)) {
            hh0Var = hh0.ICON_LEFT_VIRTUAL;
        } else {
            hh0VarArrValues = hh0.values();
            length14 = hh0VarArrValues.length;
            i15 = 0;
            while (true) {
                if (i15 < length14) {
                    hh0Var = null;
                    break;
                }
                hh0Var2 = hh0VarArrValues[i15];
                hh0VarArr = hh0VarArrValues;
                if (hh0Var2.f13038a.equals(str14)) {
                    hh0Var = hh0Var2;
                    break;
                }
                i15++;
                hh0VarArrValues = hh0VarArr;
            }
            if (hh0Var == null) {
                hh0Var = hh0.ICON_LEFT;
            }
        }
        hh0 hh0Var4 = hh0Var;
        str15 = wrdVar.x5.O;
        ai0VarArrValues = ai0.values();
        length15 = ai0VarArrValues.length;
        i16 = 0;
        while (true) {
            if (i16 < length15) {
                ai0Var = null;
                break;
            }
            ai0Var = ai0VarArrValues[i16];
            ai0VarArr = ai0VarArrValues;
            if (ai0Var.f900a.equals(str15)) {
                break;
                break;
            }
            i16++;
            ai0VarArrValues = ai0VarArr;
        }
        if (ai0Var == null) {
            ai0Var = ai0.CHIPS_S;
        }
        ai0 ai0Var3 = ai0Var;
        str16 = wrdVar.E5.V;
        zf1VarArrValues = zf1.values();
        length16 = zf1VarArrValues.length;
        i17 = 0;
        while (true) {
            if (i17 < length16) {
                zf1Var = null;
                break;
            }
            zf1Var = zf1VarArrValues[i17];
            zf1VarArr = zf1VarArrValues;
            if (zf1Var.f44280a.equals(str16)) {
                break;
                break;
            }
            i17++;
            zf1VarArrValues = zf1VarArr;
        }
        if (zf1Var == null) {
            zf1Var = zf1.BACKGROUND_S;
        }
        zf1 zf1Var3 = zf1Var;
        str17 = wrdVar.F5.W;
        ep0VarArrValues = ep0.values();
        length17 = ep0VarArrValues.length;
        i18 = 0;
        while (true) {
            if (i18 < length17) {
                ep0Var = null;
                break;
            }
            ep0Var = ep0VarArrValues[i18];
            ep0VarArr = ep0VarArrValues;
            if (ep0Var.f8162a.equals(str17)) {
                break;
                break;
            }
            i18++;
            ep0VarArrValues = ep0VarArr;
        }
        if (ep0Var == null) {
            ep0Var = ep0.SMALL_HEADER;
        }
        ep0 ep0Var3 = ep0Var;
        str18 = wrdVar.z5.Q;
        th1VarArrValues = th1.values();
        length18 = th1VarArrValues.length;
        i19 = 0;
        while (true) {
            if (i19 < length18) {
                th1Var = null;
                break;
            }
            th1Var = th1VarArrValues[i19];
            th1VarArr = th1VarArrValues;
            if (th1Var.f33940a.equals(str18)) {
                break;
                break;
            }
            i19++;
            th1VarArrValues = th1VarArr;
        }
        if (th1Var == null) {
            th1Var = th1.BRAND_S;
        }
        th1 th1Var3 = th1Var;
        str19 = wrdVar.G5.X;
        nr1VarArrValues = nr1.values();
        length19 = nr1VarArrValues.length;
        i20 = 0;
        while (true) {
            if (i20 < length19) {
                nr1Var = null;
                break;
            }
            nr1Var = nr1VarArrValues[i20];
            nr1VarArr = nr1VarArrValues;
            if (nr1Var.f23981a.equals(str19)) {
                break;
                break;
            }
            i20++;
            nr1VarArrValues = nr1VarArr;
        }
        if (nr1Var == null) {
            nr1Var = nr1.PRIZE;
        }
        nr1 nr1Var3 = nr1Var;
        str20 = wrdVar.K5.b0;
        vc0VarArrValues = vc0.values();
        length20 = vc0VarArrValues.length;
        i21 = 0;
        while (true) {
            if (i21 < length20) {
                vc0Var = null;
                break;
            }
            vc0Var = vc0VarArrValues[i21];
            vc0VarArr = vc0VarArrValues;
            if (vc0Var.f37164a.equals(str20)) {
                break;
                break;
            }
            i21++;
            vc0VarArrValues = vc0VarArr;
        }
        if (vc0Var == null) {
            vc0Var = vc0.SIMPLE;
        }
        vc0 vc0Var3 = vc0Var;
        str21 = wrdVar.L5.c0;
        ww1VarArrValues = ww1.values();
        length21 = ww1VarArrValues.length;
        i22 = 0;
        while (true) {
            if (i22 < length21) {
                ww1Var = null;
                break;
            }
            ww1Var = ww1VarArrValues[i22];
            ww1VarArr = ww1VarArrValues;
            if (ww1Var.f39865a.equals(str21)) {
                break;
                break;
            }
            i22++;
            ww1VarArrValues = ww1VarArr;
        }
        if (ww1Var == null) {
            ww1Var = ww1.PICTURE;
        }
        ww1 ww1Var3 = ww1Var;
        Boolean bool13 = wrdVar.C4.r;
        Boolean bool14 = Boolean.TRUE;
        boolean zD12 = Intrinsics.d(bool13, bool14);
        boolean zD13 = Intrinsics.d(wrdVar.D4.s, bool14);
        num = wrdVar.E4.t;
        if (num == null) {
            num2 = num;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 30;
        }
        int i25 = iIntValue;
        boolean zW2 = ay3.W(wrdVar);
        boolean zD14 = Intrinsics.d(wrdVar.A4.p, bool14);
        boolean zD15 = Intrinsics.d(wrdVar.B4.q, bool14);
        boolean zD16 = Intrinsics.d(wrdVar.p3.E, bool14);
        num3 = wrdVar.r1.f1;
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = 60;
        }
        int i26 = iIntValue2;
        num4 = wrdVar.s1.g1;
        if (num4 != null) {
            iIntValue3 = num4.intValue();
        } else {
            iIntValue3 = 180;
        }
        return new hl1(f61Var, zV3, ep1Var, zD9, hr10Var3, h650Var3, zD10, b01Var3, lj0Var, xmu0Var, of1Var3, ot0Var3, re0Var3, me1Var3, ee1Var3, gh0Var3, qe0Var3, hh0Var4, ai0Var3, zf1Var3, ep0Var3, th1Var3, nr1Var3, vc0Var3, ww1Var3, zD12, zD13, i25, zW2, zD14, zD15, zD16, i26, iIntValue3, zD11, Intrinsics.d(wrdVar.q3.F, bool14), Intrinsics.d(wrdVar.r3.G, bool14), Intrinsics.d(wrdVar.s3.H, bool14), Intrinsics.d(wrdVar.x1.l1, bool14), Intrinsics.d(wrdVar.H4.w, bool14), Intrinsics.d(wrdVar.I4.x, bool14), Intrinsics.d(wrdVar.J4.y, bool14));
    }

    public static final void v(xkp xkpVar, Function1 function1, fet fetVar, int i2) {
        u1m u1mVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(600756113);
        byte b2 = 4;
        int i3 = (fetVar2.g(xkpVar) ? 4 : 2) | i2 | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            if (xkpVar.h) {
                u1mVar = u1m.f34906a;
            } else {
                u1mVar = xkpVar.i ? u1m.b : null;
            }
            u1m u1mVar2 = u1mVar;
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
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
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar2).b, 0.0f, xfn.a(fetVar2).b, 0.0f, 10);
            t7l0 t7l0Var = new t7l0(new c2l0(xkpVar.b, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary()), xkpVar.f, xkpVar.e, null, xkpVar.j, Integer.valueOf(xkpVar.g.size()), u1mVar2, 56);
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new tvy(function1, xkpVar, (byte) 4);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i5 == 4) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new uvy(function1, xkpVar, b2);
                fetVar2.o0(objP2);
            }
            xbc.o(mm40VarN, t7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            fetVar2 = fetVar;
            if (xkpVar.j) {
                fetVar2.e0(28578375);
                fetVar2.r(false);
            } else {
                fetVar2.e0(28415656);
                mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(xkpVar, function1, i2, (byte) 4);
        }
    }

    public static final TreeMap v0(ob6 ob6Var) {
        Map mapB;
        Map mapB2;
        Map mapB3;
        LinkedHashMap linkedHashMapJ = xp20.j(wp20.b(new Pair("cfView", Integer.valueOf(ob6Var.d))), wp20.b(new Pair("count", 10)));
        int i2 = ob6Var.b;
        if (i2 > 0) {
            mapB = wp20.b(new Pair("country", Integer.valueOf(i2)));
        } else {
            mapB = lun.f20680a;
            mapB.getClass();
        }
        LinkedHashMap linkedHashMapJ2 = xp20.j(linkedHashMapJ, mapB);
        int i3 = ob6Var.f24962a;
        if (i3 > 0) {
            mapB2 = wp20.b(new Pair("fcountry", Integer.valueOf(i3)));
        } else {
            mapB2 = lun.f20680a;
            mapB2.getClass();
        }
        LinkedHashMap linkedHashMapJ3 = xp20.j(xp20.j(xp20.j(xp20.j(linkedHashMapJ2, mapB2), wp20.b(new Pair("gr", 1357))), wp20.b(new Pair("lng", ob6Var.f))), wp20.b(new Pair("ref", 1)));
        boolean z = ob6Var.c;
        long j2 = ob6Var.e;
        if (!z || j2 <= 0) {
            mapB3 = lun.f20680a;
            mapB3.getClass();
        } else {
            mapB3 = wp20.b(new Pair("userId", Long.valueOf(j2)));
        }
        return new TreeMap(xp20.j(xp20.j(linkedHashMapJ3, mapB3), wp20.b(new Pair("whence", 22))));
    }

    public static final void w(xkp xkpVar, boolean z, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        n3l0 l3l0Var;
        fetVar.g0(1768271303);
        int i3 = i2 | (fetVar.g(xkpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (xkpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = xkpVar.i ? new of5() : null;
            }
            boolean z2 = xkpVar.j;
            if (z2) {
                zcl zclVar = qmk.f28987a;
                l3l0Var = new m3l0();
            } else {
                zcl zclVar2 = qmk.f28987a;
                l3l0Var = new l3l0(16.0f);
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, (z || z2) ? 0.0f : 6.0f, 7);
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
            c7l0 c7l0Var = new c7l0(new a2l0(xkpVar.b, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary()), xkpVar.f, xkpVar.e, null, of5Var, xkpVar.j, Integer.valueOf(xkpVar.g.size()), 24);
            int i4 = i3 & 896;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 256) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new tvy(function1, xkpVar, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i4 == 256) | (i5 == 4);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new uvy(function1, xkpVar, b2);
                fetVar.o0(objP2);
            }
            xbc.o(null, c7l0Var, l3l0Var, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 217);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) xkpVar, z, (Object) function1, i2, (byte) 11);
        }
    }

    public static final r6w w0(s77 s77Var) {
        switch (s77Var == null ? -1 : t77.f33452a[s77Var.ordinal()]) {
            case 1:
                return r6w.f29954a;
            case 2:
                return r6w.b;
            case 3:
                return r6w.c;
            case 4:
                return r6w.d;
            case 5:
                return r6w.e;
            case 6:
                return r6w.f;
            case 7:
                return r6w.k;
            default:
                return r6w.f29954a;
        }
    }

    public static final void x(alp alpVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-786484691);
        int i3 = (fetVar2.g(alpVar) ? 4 : 2) | i2 | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            u1m u1mVar = alpVar.c ? u1m.f34906a : null;
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
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
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar2).b, 0.0f, xfn.a(fetVar2).b, 0.0f, 10);
            t7l0 t7l0Var = new t7l0(new c2l0(alpVar.f1079a, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary()), alpVar.b, null, Integer.valueOf(R.drawable.ic_glyph_express), alpVar.d, null, u1mVar, 180);
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wvy(function1, alpVar, (byte) 4);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i5 == 4) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xvy(function1, alpVar, (byte) 4);
                fetVar2.o0(objP2);
            }
            xbc.o(mm40VarN, t7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            fetVar2 = fetVar;
            if (alpVar.d) {
                fetVar2.e0(954000043);
                fetVar2.r(false);
            } else {
                fetVar2.e0(953837324);
                mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(alpVar, function1, i2, (byte) 3);
        }
    }

    public static final String x0(ay3 ay3Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (ay3Var.equals(t78.p) || ay3Var.equals(r78.p)) {
            return ctf0Var.f(R.string.empty_str, new Object[0]);
        }
        if (ay3Var.equals(u78.p)) {
            return ctf0Var.f(R.string.error_uncorrect_bet, new Object[0]);
        }
        if (ay3Var instanceof w78) {
            w78 w78Var = (w78) ay3Var;
            return String.format(ctf0Var.f(R.string.error_too_low_bet_info_v2, new Object[0]), Arrays.copyOf(new Object[]{e0(w78Var.q, w78Var.p)}, 1));
        }
        if (ay3Var instanceof v78) {
            v78 v78Var = (v78) ay3Var;
            return String.format(ctf0Var.f(R.string.error_too_height_bet_info_v2, new Object[0]), Arrays.copyOf(new Object[]{e0(v78Var.q, v78Var.p)}, 1));
        }
        if (ay3Var instanceof s78) {
            String strF = ctf0Var.f(R.string.min_max_bet_input_jackpot, new Object[0]);
            s78 s78Var = (s78) ay3Var;
            String str = s78Var.r;
            return String.format(strF, Arrays.copyOf(new Object[]{e0(str, s78Var.p), e0(str, s78Var.q)}, 2));
        }
        if (!(ay3Var instanceof x78)) {
            t9f.b();
            return null;
        }
        int i2 = cy7.f5159a;
        x78 x78Var = (x78) ay3Var;
        return cy7.e(String.format(ctf0Var.f(R.string.unlimited_bet_amount_info_value, new Object[0]), Arrays.copyOf(new Object[]{e0(x78Var.q, x78Var.p)}, 1)));
    }

    public static final void y(alp alpVar, boolean z, Function1 function1, fet fetVar, int i2) {
        n3l0 l3l0Var;
        fetVar.g0(-1339786581);
        int i3 = i2 | (fetVar.g(alpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            pf5 pf5Var = alpVar.c ? new pf5(3, null) : null;
            boolean z2 = alpVar.d;
            if (z2) {
                zcl zclVar = qmk.f28987a;
                l3l0Var = new m3l0();
            } else {
                zcl zclVar2 = qmk.f28987a;
                l3l0Var = new l3l0(16.0f);
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, (z || z2) ? 0.0f : 6.0f, 7);
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
            c7l0 c7l0Var = new c7l0(new a2l0(alpVar.f1079a, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary()), alpVar.b, null, Integer.valueOf(R.drawable.ic_glyph_express), pf5Var, alpVar.d, null, 148);
            int i4 = i3 & 896;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 256) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new wvy(function1, alpVar, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i4 == 256) | (i5 == 4);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new xvy(function1, alpVar, (byte) 1);
                fetVar.o0(objP2);
            }
            xbc.o(null, c7l0Var, l3l0Var, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 217);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) alpVar, z, (Object) function1, i2, (byte) 12);
        }
    }

    public static float y0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void z(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1833826114);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            hrw hrwVar = (hrw) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
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
            D(hrwVar, function1, fetVar, (i3 & 896) | 6);
            if (hrwVar != null) {
                boolean z = hrwVar instanceof drw;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-1121702075);
                    vbc.H((drw) hrwVar, function1, fetVar, i3 & 910);
                    fetVar.r(false);
                } else if (hrwVar instanceof erw) {
                    fetVar.e0(-1144554780);
                    r(((erw) hrwVar).b, function1, fetVar, (i3 >> 3) & 112);
                    fetVar.r(false);
                } else if (hrwVar instanceof frw) {
                    fetVar.e0(-1144549724);
                    r(((frw) hrwVar).b, function1, fetVar, (i3 >> 3) & 112);
                    fetVar.r(false);
                } else if (hrwVar instanceof grw) {
                    fetVar.e0(-1121142897);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    m2x.h(0, fetVar, s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(-1144564170, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 20);
        }
    }

    public abstract void k0();
}
