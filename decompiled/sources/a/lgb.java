package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static vz2 f20000a;
    public static uw2 b;
    public static a6a c;

    public static final void A(mm40 mm40Var, lkl lklVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        boolean z;
        boolean z2;
        String str;
        float f;
        lkl lklVar2 = lklVar;
        fet fetVar3 = fetVar;
        qc0 qc0Var = lklVar2.b;
        fetVar3.g0(-358161692);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(lklVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function0) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            long j = jM123getWhite0d7_KjU;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            Object objP = fetVar3.P();
            if (objP == ukd.f35823a) {
                objP = new wul(oul.e, oe9.c, new se9(R.drawable.ic_glyph_gift), true, false, true);
                fetVar3.o0(objP);
            }
            wul wulVar = (wul) objP;
            String str2 = lklVar2.e;
            int iOrdinal = qc0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar3.e0(-1824926263);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                long j2 = qmk.q;
                long j3 = qmk.t;
                long j4 = qmk.n;
                n05 n05Var = new n05(j2, j3, j4);
                int i4 = i2;
                v8q0.a(lklVar2.c, mm40VarN, j, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.r(), fetVar, 0, 24960, 110576);
                long j5 = j;
                if (qc0Var == qc0.f28463a) {
                    fetVar.e0(-1824335465);
                    lklVar2 = lklVar;
                    j6n.h(lklVar2.e, dqo0.f6527a, s5x0.N(o7k0.A(jm40Var, null, 3), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0, 0, fetVar, 48, 24);
                    fetVar2 = fetVar;
                    i3 = 0;
                    fetVar2.r(false);
                } else {
                    lklVar2 = lklVar;
                    fetVar.e0(-1823976826);
                    v8q0.a(lklVar2.e, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), j5, new n05(qmk.p, j2, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110576);
                    j5 = j5;
                    fetVar2 = fetVar;
                    i3 = 0;
                    fetVar2.r(false);
                }
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, i3);
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
                yx7 yx7Var = gqw0.k;
                qzb.n(s5x0.N(new ecu0(yx7Var), 0.0f, 0.0f, 12.0f, 0.0f, 11), wulVar, function0, fetVar2, (i4 & 896) | 48, 0);
                v8q0.a(lklVar2.d, new ecu0(yx7Var), j5, new n05(qmk.r, qmk.y, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.s(), fetVar, 0, 24960, 110576);
                fetVar3 = fetVar;
                z = true;
                fetVar3.r(true);
                fetVar3.r(false);
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-1998531442, fetVar3, false);
                }
                fetVar3.e0(-1822237261);
                if (lklVar2.c.length() > 0) {
                    fetVar3.e0(-1822184716);
                    if (str2.length() > 0) {
                        zcl zclVar2 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                        f = 0.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7);
                    long j6 = qmk.q;
                    long j7 = qmk.t;
                    z2 = false;
                    z = true;
                    str = str2;
                    v8q0.a(lklVar2.c, mm40VarN2, j, new n05(j6, j7, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j7, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar, 0, 24960, 110576);
                    j = j;
                    fetVar3 = fetVar;
                    fetVar3.r(false);
                } else {
                    z2 = false;
                    z = true;
                    str = str2;
                    fetVar3.e0(-1821501848);
                    fetVar3.r(false);
                }
                if (str.length() > 0) {
                    fetVar3.e0(-1821410832);
                    long j8 = qmk.p;
                    long j9 = qmk.q;
                    v8q0.a(lklVar2.e, null, j, new n05(j8, j9, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j9, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110578);
                    fetVar3 = fetVar;
                    fetVar3.r(z2);
                } else {
                    fetVar3.e0(-1820877880);
                    fetVar3.r(z2);
                }
                fetVar3.r(z2);
            }
            fetVar3.r(z);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) lklVar2, (Object) function0, i, (byte) 0);
        }
    }

    public static final void B(mm40 mm40Var, uhm uhmVar, Function0 function0, Function1 function1, Function1 function2, Function0 function3, Function0 function4, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        Function0 function5;
        ugd ugdVarM;
        fetVar.g0(-881786512);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(uhmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function5 = function3;
            i2 |= fetVar.i(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            imm immVar = new imm(uhmVar.d, uhmVar.f, uhmVar.e, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, null);
            sd sdVar = uhmVar.j;
            if (sdVar == null) {
                fetVar.e0(-1281068949);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-1281068948);
                ugdVarM = u1c.M(1478277110, new d8m((Object) uhmVar, (Object) sdVar, (Object) function0, (byte) 4), fetVar);
                fetVar.r(false);
            }
            ugd ugdVar = ugdVarM;
            int i3 = (i2 & 14) | 24576 | ((i2 >> 6) & 7168);
            int i4 = i2 << 6;
            hlm.c(mm40Var2, immVar, null, function5, null, function1, function2, null, function4, ugdVar, null, null, fetVar, i3 | (458752 & i4) | (3670016 & i4) | (i4 & 234881024), 54, 132);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var, (yhm) uhmVar, function0, function1, function2, function3, function4, i, (byte) 8);
        }
    }

    public static final void C(mm40 mm40Var, long j, long j2, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1424512057);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarI = o7k0.i(mm40Var, f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = J(mm40VarI, ugg0Var);
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = i120.S(mm40VarQ, 1.0f, j2, ugg0Var);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarQ2 = i120.Q(J(o7k0.i(jm40Var, f2), ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), ljcVar);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_status_block, 0, fetVar), null, o7k0.n(jm40Var, f2), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksl(mm40Var, j, j2, f, f2, i, (byte) 1);
        }
    }

    public static final void D(mm40 mm40Var, ssl sslVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-999687278);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(sslVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (sslVar instanceof psl) {
            fetVar.e0(-380287082);
            long j = ((psl) sslVar).f27521a;
            pz40 pz40Var = s6t0.f31722a;
            long jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            zcl zclVar = qmk.f28987a;
            C(mm40Var, j, jM121getTransparent0d7_KjU, 16.0f, 12.0f, fetVar, i2 & 14);
            fetVar.r(false);
        } else if (sslVar instanceof osl) {
            fetVar.e0(-379927048);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            int i3 = i2;
            long jM121getTransparent0d7_KjU2 = staticColors.m121getTransparent0d7_KjU();
            long jM121getTransparent0d7_KjU3 = staticColors.m121getTransparent0d7_KjU();
            osl oslVar = (osl) sslVar;
            C(mm40Var, jM121getTransparent0d7_KjU2, jM121getTransparent0d7_KjU3, oslVar.a(), oslVar.b(), fetVar, i3 & 14);
            fetVar.r(false);
        } else {
            int i4 = i2;
            if (sslVar instanceof qsl) {
                fetVar.e0(-379534557);
                qsl qslVar = (qsl) sslVar;
                long j2 = qslVar.b;
                long j3 = qslVar.f29264a;
                zcl zclVar2 = qmk.f28987a;
                C(mm40Var, j2, j3, 16.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            } else if (sslVar instanceof rsl) {
                fetVar.e0(-379188349);
                rsl rslVar = (rsl) sslVar;
                long j4 = rslVar.b;
                long j5 = rslVar.f31037a;
                zcl zclVar3 = qmk.f28987a;
                C(mm40Var, j4, j5, 16.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            } else {
                if (!(sslVar instanceof lsl)) {
                    throw b1j.f(1373205543, fetVar, false);
                }
                fetVar.e0(-378835786);
                long j6 = ((lsl) sslVar).f20585a;
                pz40 pz40Var3 = s6t0.f31722a;
                long jM121getTransparent0d7_KjU4 = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                zcl zclVar4 = qmk.f28987a;
                C(mm40Var, j6, jM121getTransparent0d7_KjU4, 14.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jsl(mm40Var, sslVar, i, b2);
        }
    }

    public static final void E(uhm uhmVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        chm chmVar = uhmVar.i;
        chm chmVar2 = uhmVar.h;
        fetVar.g0(1324991299);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(uhmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 120.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (chmVar2 != null) {
                ewm0.n(rz4.f(fetVar, -166380584, 1.0f, true), chmVar2, function0, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-166198955);
                fetVar.r(false);
            }
            if (chmVar != null) {
                ewm0.n(rz4.f(fetVar, -166150378, 1.0f, true), chmVar, function1, fetVar, i2 & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-165966827);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) uhmVar, function0, function1, i, (byte) 17);
        }
    }

    public static final void F(int i, fet fetVar) {
        fetVar.g0(-1894495231);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 120.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            qxw.o(fetVar, xbc.c0(J(o7k0.s(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), 64.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            h97.s(J(o7k0.s(new x7z(1.0f, true), 64.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 12);
        }
    }

    public static final void G(mm40 mm40Var, uhm uhmVar, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        boolean z;
        Function1 function3 = function1;
        a4x a4xVar = uhmVar.k;
        fetVar.g0(698749212);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(uhmVar) ? 32 : 16) | (fetVar.i(function3) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = uhmVar.c;
            boolean zG = fetVar.g(a4xVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                if (a4xVar != null && a4xVar.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator<E> it = a4xVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((ghm) it.next()) instanceof ehm) {
                        z = true;
                        break;
                    }
                }
                objP = Boolean.valueOf(z);
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            mm40 mm40VarN = s5x0.N(mm40Var, xfn.a(fetVar).d, 0.0f, 0.0f, 0.0f, 14);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (z2) {
                fetVar.e0(533697258);
                F(0, fetVar);
                fetVar.r(false);
            } else if (uhmVar.h == null && uhmVar.i == null) {
                fetVar.e0(534078186);
                fetVar.r(false);
            } else {
                fetVar.e0(533841470);
                int i3 = i2 >> 6;
                E(uhmVar, function0, function2, fetVar, ((i2 >> 3) & 14) | (i3 & 112) | (i3 & 896));
                fetVar.r(false);
            }
            if (!pkd.d(fetVar) || zBooleanValue) {
                fetVar.e0(534336602);
                d(i2 & 896, fetVar, a4xVar, null, function3);
                fetVar.r(false);
            } else {
                fetVar.e0(534135629);
                e((i2 << 3) & 7168, fetVar, uhmVar.k, null, function1, !z2);
                function3 = function1;
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, uhmVar, function3, function0, function2, i);
        }
    }

    public static final jzs0 H(aty atyVar) {
        boolean z;
        tft0 tft0VarJ0;
        kkq kkqVarY;
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        if (kzj0VarZ == null && ((kkqVarY = rcb.Y(atyVar)) == null || (kzj0VarZ = rcb.W0(kkqVarY)) == null)) {
            kzj0VarZ = rcb.Z(atyVar);
            kzj0VarZ.getClass();
        }
        hzs0 hzs0VarY0 = rcb.y0(rcb.o1(kzj0VarZ));
        if (hzs0VarY0 != null) {
            return hzs0VarY0;
        }
        if (atyVar instanceof wsy) {
            z = ary.z((wsy) atyVar);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(atyVar);
            sb.append(", ");
            c99.s(kng0.g(sre0.f32672a, atyVar.getClass(), sb));
            z = false;
        }
        if (z) {
            zxs0 zxs0Var = (zxs0) CollectionsKt.v0(rcb.o0(atyVar));
            zxs0Var.getClass();
            if (rcb.T0(zxs0Var)) {
                tft0VarJ0 = null;
            } else {
                if (!(zxs0Var instanceof pzs0)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(zxs0Var);
                    sb2.append(", ");
                    c99.s(kng0.g(sre0.f32672a, zxs0Var.getClass(), sb2));
                    return null;
                }
                tft0VarJ0 = ((pzs0) zxs0Var).b().j0();
            }
            if (tft0VarJ0 != null) {
                return H(tft0VarJ0);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    public static final hnf I(int i, long j, trf trfVar, ctf0 ctf0Var, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        List list = trfVar.f34420a;
        str2.getClass();
        ctf0Var.getClass();
        int i2 = 0;
        List listJ = q3d.j(0, 1, 2, 3, 4);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add((pqf) CollectionsKt.W(((Number) it.next()).intValue(), list));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((pqf) it2.next()) == null) {
                    return null;
                }
            }
        }
        ArrayList arrayListS = CollectionsKt.S(arrayList);
        pqf pqfVar = (pqf) arrayListS.get(0);
        pqf pqfVar2 = (pqf) arrayListS.get(1);
        pqf pqfVar3 = (pqf) arrayListS.get(2);
        pqf pqfVar4 = (pqf) arrayListS.get(3);
        pqf pqfVar5 = (pqf) arrayListS.get(4);
        if (!kotlin.text.c.x(str4, ujn.h, false)) {
            if (str4.length() == 0) {
                str4 = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(str4)) {
                    str4 = "";
                } else {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                }
            }
        }
        enf enfVar = new enf(str4, str2);
        srf srfVarO0 = bfb.o0(pqfVar);
        srf srfVarO1 = bfb.o0(pqfVar2);
        srf srfVarO2 = bfb.o0(pqfVar3);
        srf srfVarO3 = bfb.o0(pqfVar4);
        srf srfVarO4 = bfb.o0(pqfVar5);
        list.getClass();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            i2 += ((pqf) it3.next()).b;
        }
        return new hnf(str, j, enfVar, srfVarO0, srfVarO1, srfVarO2, srfVarO3, srfVarO4, i, ctf0Var.b.a(R.string.cs2_total_cash_v2, Arrays.copyOf(new Object[]{String.valueOf(i2)}, 1)), z);
    }

    public static final mm40 J(mm40 mm40Var, yjj0 yjj0Var) {
        return i4w0.U(mm40Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, yjj0Var, true, 0L, 0L, 0, null, 1042431);
    }

    public static final mm40 K(mm40 mm40Var) {
        return i4w0.U(mm40Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 0, null, 1044479);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f1  */
    public static final aty L(aty atyVar, HashSet hashSet) {
        List<jzs0> parameters;
        kzj0 kzj0Var;
        jzs0 jzs0VarH;
        aty atyVarJ0;
        aty atyVarL;
        iys0 iys0VarH;
        gqw0 gqw0Var = gqw0.C1;
        jys0 jys0VarN0 = gqw0Var.n0(atyVar);
        if (hashSet.add(jys0VarN0)) {
            hzs0 hzs0VarY0 = rcb.y0(jys0VarN0);
            byte b2 = 1;
            int i = 0;
            if (hzs0VarY0 == null) {
                if (rcb.K0(jys0VarN0)) {
                    jys0 jys0VarN1 = gqw0Var.n0(atyVar);
                    jys0VarN1.getClass();
                    if (jys0VarN1 instanceof iys0) {
                        parameters = ((iys0) jys0VarN1).getParameters();
                        parameters.getClass();
                    } else {
                        c99.s(kng0.g(sre0.f32672a, jys0VarN1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", jys0VarN1, ", ")));
                        parameters = null;
                    }
                    List listO0 = rcb.o0(atyVar);
                    ArrayList arrayList = new ArrayList(r3d.q(listO0, 10));
                    for (Object obj : listO0) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        aty atyVarX0 = rcb.x0(gqw0Var, (zxs0) obj);
                        if (atyVarX0 == null) {
                            atyVarX0 = rcb.u0((jzs0) parameters.get(i));
                        }
                        arrayList.add(atyVarX0);
                        i = i2;
                    }
                    ArrayList arrayList2 = new ArrayList(r3d.q(parameters, 10));
                    for (jzs0 jzs0Var : parameters) {
                        jzs0Var.getClass();
                        if (jzs0Var instanceof hzs0) {
                            iys0VarH = ((hzs0) jzs0Var).h();
                            iys0VarH.getClass();
                        } else {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(jzs0Var);
                            sb.append(", ");
                            c99.s(kng0.g(sre0.f32672a, jzs0Var.getClass(), sb));
                            iys0VarH = null;
                        }
                        arrayList2.add(iys0VarH);
                    }
                    Map mapM = xp20.m(CollectionsKt.T0(arrayList2, arrayList));
                    mapM.getClass();
                    ArrayList arrayList3 = new ArrayList(mapM.size());
                    for (Map.Entry entry : mapM.entrySet()) {
                        jys0 jys0Var = (jys0) entry.getKey();
                        aty atyVar2 = (aty) entry.getValue();
                        jys0Var.getClass();
                        atyVar2.getClass();
                        arrayList3.add(new Pair((iys0) jys0Var, new q4m0((wsy) atyVar2)));
                    }
                    Map mapM2 = xp20.m(arrayList3);
                    if (mapM2 == null) {
                        xzs0.a(5);
                        throw null;
                    }
                    xzs0 xzs0Var = new xzs0(new r4m0(mapM2, b2));
                    atyVar.getClass();
                    if (atyVar instanceof wsy) {
                        int i3 = ddx.f5919a;
                        foc focVarN = ((wsy) atyVar).S().n();
                        wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
                        if (wm40Var != null) {
                            int i4 = rek.f30339a;
                            k2u0 k2u0VarN0 = wm40Var.n0();
                            cdx cdxVar = k2u0VarN0 instanceof cdx ? (cdx) k2u0VarN0 : null;
                            kzj0Var = cdxVar != null ? (kzj0) cdxVar.b : null;
                        }
                        if (kzj0Var == null) {
                            atyVarJ0 = null;
                        } else {
                            jzs0VarH = H(kzj0Var);
                            if (jzs0VarH == null) {
                                atyVarJ0 = rcb.j1(xzs0Var, kzj0Var);
                            } else {
                                atyVarJ0 = j0(kzj0Var, rcb.j1(xzs0Var, rcb.u0(jzs0VarH)));
                            }
                        }
                        if (atyVarJ0 != null && (atyVarL = L(atyVarJ0, hashSet)) != null) {
                            if (!rcb.P0(atyVar)) {
                                return atyVarL;
                            }
                            if (!rcb.P0(atyVarL) && (!(atyVarL instanceof mzj0) || !rcb.Q0((mzj0) atyVarL))) {
                                return gqw0Var.K0(atyVarL);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb2.append(atyVar);
                        sb2.append(", ");
                        c99.s(kng0.g(sre0.f32672a, atyVar.getClass(), sb2));
                    }
                    if (kzj0Var == null) {
                        atyVarJ0 = null;
                    } else {
                        jzs0VarH = H(kzj0Var);
                        if (jzs0VarH == null) {
                            atyVarJ0 = rcb.j1(xzs0Var, kzj0Var);
                        } else {
                            atyVarJ0 = j0(kzj0Var, rcb.j1(xzs0Var, rcb.u0(jzs0VarH)));
                        }
                    }
                    if (atyVarJ0 != null) {
                        if (!rcb.P0(atyVar)) {
                            return atyVarL;
                        }
                        if (!rcb.P0(atyVarL)) {
                            return gqw0Var.K0(atyVarL);
                        }
                    }
                }
                return atyVar;
            }
            aty atyVarU0 = rcb.u0(hzs0VarY0);
            aty atyVarL2 = L(atyVarU0, hashSet);
            if (atyVarL2 != null) {
                if (!rcb.K0(gqw0Var.n0(atyVarU0)) && (!(atyVarU0 instanceof mzj0) || !rcb.Q0((mzj0) atyVarU0))) {
                    b2 = 0;
                }
                if ((atyVarL2 instanceof mzj0) && rcb.Q0((mzj0) atyVarL2) && rcb.P0(atyVar) && b2 != 0) {
                    return gqw0Var.K0(atyVarU0);
                }
                return (rcb.P0(atyVarL2) || !rcb.N0(atyVar)) ? atyVarL2 : gqw0Var.K0(atyVarL2);
            }
        }
        return null;
    }

    public static Object M(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            jf4.o(twn.m(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static long N(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    r4e.k(i6);
                    csj.b();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return r4e.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long O(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    r4e.k(i6);
                    csj.b();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return r4e.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static long P(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            zcx.a("width and height must be >= 0");
        }
        return r4e.h(i, i, i2, i2);
    }

    public static long Q(int i) {
        if (i < 0) {
            zcx.a("width must be >= 0");
        }
        return r4e.h(i, i, 0, Integer.MAX_VALUE);
    }

    public static final float R(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 1:
                return 0.0f;
            case 2:
                return 1.0f;
            case 3:
                return 2.0f;
            case 4:
                return 3.0f;
            case 5:
                return 4.0f;
            case 6:
                return 5.0f;
            case 7:
                return 6.0f;
            case 8:
                return 7.0f;
            case 9:
                return 8.0f;
            case 10:
                return 9.0f;
            case 11:
                return 11.0f;
            default:
                return 0.0f;
        }
    }

    public static final int S(q4f q4fVar) {
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 22 || iOrdinal == 23) {
            return R.drawable.ic_coupon_constructor;
        }
        switch (iOrdinal) {
            case 2:
                return R.drawable.ic_express;
            case 3:
                return R.drawable.ic_system_bet;
            case 4:
                return R.drawable.ic_chain_bet;
            case 5:
                return R.drawable.ic_multibet;
            case 6:
                return R.drawable.ic_conditional_bet;
            case 7:
                return R.drawable.ic_andexpress_bet;
            case 8:
                return R.drawable.ic_lucky_bet;
            case 9:
                return R.drawable.ic_patent_bet;
            default:
                return R.drawable.ic_multi_event;
        }
    }

    public static final String T(wdj wdjVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (wdjVar.equals(udj.f35481a)) {
            return ctf0Var.b.a(R.string.for_month, Arrays.copyOf(new Object[0], 0));
        }
        if (wdjVar instanceof tdj) {
            return ctf0Var.b.a(R.string.history_filter_day, Arrays.copyOf(new Object[0], 0));
        }
        if (!(wdjVar instanceof vdj)) {
            t9f.b();
            return null;
        }
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        Locale localeForLanguageTag = Locale.getDefault();
        if (Intrinsics.d(localeForLanguageTag, Locale.ROOT)) {
            String strReplace = language.replace('_', '-');
            strReplace.getClass();
            localeForLanguageTag = Locale.forLanguageTag(strReplace);
            localeForLanguageTag.getClass();
        } else {
            localeForLanguageTag.getClass();
        }
        rdj rdjVar = rdj.f30294a;
        vdj vdjVar = (vdj) wdjVar;
        znq0 znq0Var = new znq0(vdjVar.f37235a);
        sdj sdjVar = sdj.UNIQUE_2;
        return ctf0Var.b.a(R.string.date_filter_title, Arrays.copyOf(new Object[]{rdj.f(znq0Var, sdjVar, localeForLanguageTag, 28), rdj.f(new znq0(vdjVar.b), sdjVar, localeForLanguageTag, 28)}, 2));
    }

    public static final String U(d0t d0tVar, dmr dmrVar) {
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        return StringsKt.f0(str);
    }

    public static final int V(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 0:
                return R.string.empty_str;
            case 1:
                return R.string.single;
            case 2:
                return R.string.express;
            case 3:
                return R.string.system;
            case 4:
                return R.string.chain;
            case 5:
                return R.string.multibet;
            case 6:
                return R.string.condition_bet;
            case 7:
                return R.string.antiexpress;
            case 8:
                return R.string.lucky;
            case 9:
                return R.string.patent;
            case 10:
                return R.string.coupon_type_constructor;
            case 11:
                return R.string.multisingle;
            case 12:
                return R.string.football;
            case 13:
                return R.string.exact_score;
            case 14:
                return R.string.hockey;
            case 15:
                return R.string.toto_fifteen;
            case 16:
                return R.string.cyberFootball;
            case 17:
                return R.string.cyberSport;
            case 18:
                return R.string.basketball;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return R.string.toto_partner;
            case 20:
                return R.string.cricket;
            case 21:
                return R.string.finance_bets;
            case 22:
                return R.string.betconstructor;
            case 23:
                return R.string.autobet;
            case 24:
                return R.string.toto_jackpot;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return R.string.lotto_title;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final int W(jvn jvnVar) {
        int iOrdinal = jvnVar.ordinal();
        if (iOrdinal == 0) {
            return R.string.coef_view_us;
        }
        if (iOrdinal == 1) {
            return R.string.coef_view_eng;
        }
        if (iOrdinal == 2) {
            return R.string.coef_view_dec;
        }
        if (iOrdinal == 3) {
            return R.string.coef_view_hong;
        }
        if (iOrdinal == 4) {
            return R.string.coef_view_ind;
        }
        if (iOrdinal == 5) {
            return R.string.coef_view_mal;
        }
        t9f.b();
        return 0;
    }

    public static final String X(q4f q4fVar, String str) {
        if ((q4fVar != q4f.e && q4fVar != q4f.g) || str.length() == 0 || str.length() <= 4) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        Integer intOrNull = StringsKt.toIntOrNull(str.substring(1, 3));
        Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
        Integer intOrNull2 = StringsKt.toIntOrNull(str.substring(3, 5));
        return String.format(locale, " %d/%d", Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0)}, 2));
    }

    public static final int Y(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 12:
                return R.drawable.ic_football;
            case 13:
                return R.drawable.ic_score;
            case 14:
                return R.drawable.ic_ice_hockey;
            case 15:
                return R.drawable.ic_pyatnashki;
            case 16:
                return R.drawable.ic_cyber_football;
            case 17:
                return R.drawable.ic_cyber_sport;
            case 18:
                return R.drawable.ic_basketball;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return R.drawable.glyph_free_toto;
            case 20:
                return R.drawable.ic_cricket;
            default:
                return 0;
        }
    }

    public static final uts0 Z() {
        return ro4.m0(300, 0, ihn.f14788a, 2);
    }

    public static final void a(mm40 mm40Var, long j, long j2, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-369724622);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarI = o7k0.i(mm40Var, f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = J(mm40VarI, ugg0Var);
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = i120.S(mm40VarQ, 1.0f, j2, ugg0Var);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarJ2 = J(o7k0.i(jm40Var, f2), ugg0Var);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ2 = i120.Q(mm40VarJ2, ((StaticColors) fetVar.k(zfnVar)).m98getGreen0d7_KjU(), ljcVar);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_status_check, 0, fetVar), null, o7k0.n(jm40Var, f2), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksl(mm40Var, j, j2, f, f2, i, (byte) 0);
        }
    }

    public static boolean a0(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = Build.BRAND;
        str3.getClass();
        return str3.equalsIgnoreCase(str);
    }

    public static final void b(mm40 mm40Var, ssl sslVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-625670005);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(sslVar) ? 32 : 16;
        }
        byte b2 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (sslVar instanceof psl) {
            fetVar.e0(823124991);
            long j = ((psl) sslVar).f27521a;
            pz40 pz40Var = s6t0.f31722a;
            long jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            zcl zclVar = qmk.f28987a;
            a(mm40Var, j, jM121getTransparent0d7_KjU, 16.0f, 12.0f, fetVar, i2 & 14);
            fetVar.r(false);
        } else if (sslVar instanceof osl) {
            fetVar.e0(823483041);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            int i3 = i2;
            long jM121getTransparent0d7_KjU2 = staticColors.m121getTransparent0d7_KjU();
            long jM121getTransparent0d7_KjU3 = staticColors.m121getTransparent0d7_KjU();
            osl oslVar = (osl) sslVar;
            a(mm40Var, jM121getTransparent0d7_KjU2, jM121getTransparent0d7_KjU3, oslVar.a(), oslVar.b(), fetVar, i3 & 14);
            fetVar.r(false);
        } else {
            int i4 = i2;
            if (sslVar instanceof qsl) {
                fetVar.e0(823873548);
                qsl qslVar = (qsl) sslVar;
                long j2 = qslVar.b;
                long j3 = qslVar.f29264a;
                zcl zclVar2 = qmk.f28987a;
                a(mm40Var, j2, j3, 16.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            } else if (sslVar instanceof rsl) {
                fetVar.e0(824217772);
                rsl rslVar = (rsl) sslVar;
                long j4 = rslVar.b;
                long j5 = rslVar.f31037a;
                zcl zclVar3 = qmk.f28987a;
                a(mm40Var, j4, j5, 16.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            } else {
                if (!(sslVar instanceof lsl)) {
                    throw b1j.f(26551958, fetVar, false);
                }
                fetVar.e0(824568351);
                long j6 = ((lsl) sslVar).f20585a;
                pz40 pz40Var3 = s6t0.f31722a;
                long jM121getTransparent0d7_KjU4 = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                zcl zclVar4 = qmk.f28987a;
                a(mm40Var, j6, jM121getTransparent0d7_KjU4, 14.0f, 10.0f, fetVar, i4 & 14);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jsl(mm40Var, sslVar, i, b2);
        }
    }

    public static final boolean b0(le90 le90Var) {
        zf90 zf90Var;
        le90Var.getClass();
        String str = le90Var.f19891a;
        String str2 = le90Var.b;
        if (str.equals("-1") || str2.equals("-1") || str.length() <= 0 || str2.length() <= 0) {
            return false;
        }
        return ((str.equals("0") && str2.equals("0")) || (zf90Var = le90Var.h) == zf90.d || zf90Var == zf90.c) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static final void c(xk80 xk80Var, int i, fet fetVar, int i2) {
        yfe0 yfe0VarU;
        hhm hhmVar;
        Object obj;
        fetVar.g0(1562370657);
        byte b2 = 2;
        int i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16);
        byte b3 = 0;
        byte b4 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (i <= 1) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    hhmVar = new hhm(xk80Var, i, i2, b3);
                }
            } else {
                pz40 pz40VarD = vcc.D(xk80Var.p, fetVar);
                Boolean bool = (Boolean) pz40VarD.getValue();
                bool.booleanValue();
                int i4 = (fetVar.g(pz40VarD) ? 1 : 0) | ((i3 & 14) == 4 ? (byte) 1 : (byte) 0);
                Object objP = fetVar.P();
                if (i4 == 0) {
                    obj = objP;
                    if (objP == ukd.f35823a) {
                        Object atjVar = new atj(xk80Var, pz40VarD, null, b2);
                        fetVar.o0(atjVar);
                        obj = atjVar;
                    }
                } else {
                    Object atjVar2 = new atj(xk80Var, pz40VarD, null, b2);
                    fetVar.o0(atjVar2);
                    obj = atjVar2;
                }
                m0x0.t(fetVar, bool, (Function2) obj);
            }
            yfe0VarU.d = hhmVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            hhmVar = new hhm(xk80Var, i, i2, b4);
            yfe0VarU.d = hhmVar;
        }
    }

    public static boolean c0(l1a l1aVar) {
        Boolean bool;
        l1aVar.getClass();
        try {
            c1a c1aVar = l1aVar.b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((ow9) c1aVar).c(key);
        } catch (BufferUnderflowException e) {
            if (mhk.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (l8x.g0()) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && l8x.j0()) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void d(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1416704789);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int size = a4xVar.size();
            boolean zE = fetVar2.e(size);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                objP = new y02(size, (byte) 6);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar2, 0, 3);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new zsf(0.42f, 0.0f, 0.58f, 1.0f);
                fetVar2.o0(objP2);
            }
            zsf zsfVar = (zsf) objP2;
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            c(kwjVarB, size, fetVar2, 0);
            float f = xfn.a(fetVar2).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            q5x.e(kwjVarB, null, null, null, size, 0.0f, null, null, false, null, null, null, null, u1c.M(-50121196, new t39((Object) kwjVarB, (Object) k6zVar, (Object) a4xVar, (Object) function1, (Object) zsfVar, (byte) 2), fetVar2), fetVar2, 0, 27648, 8174);
            fetVar2 = fetVar2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 28.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            if (size > 1) {
                fetVar2.e0(-668465228);
                n1i.a(null, kwjVarB, smm.f32453a, null, fetVar2, 384, 9);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-668312429);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i, (byte) 2);
        }
    }

    public static boolean d0() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (kotlin.text.c.x(lowerCase, "ums", false)) {
            return true;
        }
        if (a0("Itel")) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (kotlin.text.c.x(lowerCase2, "sp", false)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        a4x a4xVar2;
        mm40 mm40Var2;
        float f;
        float f2;
        fetVar.g0(942715339);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            jwo[] jwoVarArr = {jwo.f17261a};
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            if (xczVarA.c()) {
                zcl zclVar = qmk.f28987a;
                f = 36.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            l7m0 l7m0VarA = d43.a(f, ro4.m0(300, 0, null, 6), "Fade width start", fetVar, 432, 8);
            mm40VarD.getClass();
            l7m0VarA.getClass();
            mm40 mm40VarM = rq8.M(mm40VarD, new mz0((Object) jwoVarArr, (Object) l7m0VarA, backgroundContent, (byte) 17));
            jwo[] jwoVarArr2 = {jwo.b};
            long backgroundContent2 = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            if (xczVarA.d()) {
                fetVar.e0(-288625631);
                f2 = 36.0f + xfn.a(fetVar).d;
                fetVar.r(false);
            } else {
                fetVar.e0(-288623503);
                fetVar.r(false);
                f2 = 0.0f;
            }
            l7m0 l7m0VarA2 = d43.a(f2, ro4.m0(300, 0, null, 6), "Fade width end", fetVar, 432, 8);
            mm40VarM.getClass();
            l7m0VarA2.getClass();
            mm40 mm40VarM2 = rq8.M(mm40VarM, new mz0((Object) jwoVarArr2, (Object) l7m0VarA2, backgroundContent2, (byte) 17));
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, xfn.a(fetVar).d, 28.0f, 3);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new or0(a4xVar2, function1, (byte) 13);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.f(mm40VarM2, xczVarA, lh80VarU, false, qw3Var, yx7Var, null, z, null, (Function1) objP, fetVar, ((i2 << 18) & 29360128) | 196608, 328);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var2, z, a4xVar2, function1, i, (byte) 1);
        }
    }

    public static final String e0(huo0 huo0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (huo0Var instanceof wdt) {
            pn40 pn40Var = pn40.f27267a;
            return pn40.i(((wdt) huo0Var).f38989a.d, 2);
        }
        if (huo0Var instanceof ydt) {
            pn40 pn40Var2 = pn40.f27267a;
            return pn40.i(((ydt) huo0Var).f42456a.d, 0);
        }
        if (huo0Var instanceof xdt) {
            pn40 pn40Var3 = pn40.f27267a;
            return pn40.i(((xdt) huo0Var).f40712a.d, 2);
        }
        if (!(huo0Var instanceof zdt)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        pn40 pn40Var4 = pn40.f27267a;
        return pn40.i(((zdt) huo0Var).f44224a.d, 0);
    }

    public static final void f(int i, long j, fet fetVar, String str, Function0 function0) {
        ljc ljcVar = jd8.n;
        str.getClass();
        function0.getClass();
        fetVar.g0(1347417894);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (j != 0) {
                fetVar.e0(162318453);
                mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
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
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarM = s5x0.M(mm40VarD, 16.0f, 16.0f, 16.0f, 24.0f);
                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(str), true, false, true);
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new pk9(function0, (byte) 20);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarM, wulVar, (Function0) objP, fetVar, 0, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(163228861);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                qxw.o(fetVar, i120.Q(o7k0.e(mm40VarD2, 26.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dx1(j, str, function0, i);
        }
    }

    public static final String f0(huo0 huo0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (huo0Var instanceof wdt) {
            pn40 pn40Var = pn40.f27267a;
            wqd wqdVar = ((wdt) huo0Var).f38989a;
            return ua80.i("/ \u200e", pn40.i(wqdVar.e, 2), Separators.SP, wqdVar.b);
        }
        if (huo0Var instanceof ydt) {
            pn40 pn40Var2 = pn40.f27267a;
            return "/ \u200e".concat(pn40.i(((ydt) huo0Var).f42456a.e, 0));
        }
        if (huo0Var instanceof xdt) {
            pn40 pn40Var3 = pn40.f27267a;
            wqd wqdVar2 = ((xdt) huo0Var).f40712a;
            return ua80.i("/ \u200e", pn40.i(wqdVar2.e, 2), Separators.SP, wqdVar2.b);
        }
        if (!(huo0Var instanceof zdt)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        pn40 pn40Var4 = pn40.f27267a;
        return "/ \u200e".concat(pn40.i(((zdt) huo0Var).f44224a.e, 0));
    }

    public static final void g(final mm40 mm40Var, final long j, float f, float f2, float f3, fet fetVar, final int i) {
        final float f4;
        final float f5;
        final float f6;
        int i2;
        float f7;
        float f8;
        float f9;
        fetVar.g0(-1784481089);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | 9344;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                i2 = i3 & (-65409);
                f7 = 6.0f;
                f8 = 4.0f;
                f9 = 1.0f;
            } else {
                fetVar.X();
                i2 = i3 & (-65409);
                f9 = f;
                f7 = f2;
                f8 = f3;
            }
            fetVar.s();
            zfn zfnVar = bmd.h;
            final float fW0 = ((w6k) fetVar.k(zfnVar)).w0(f9);
            final float fW1 = ((w6k) fetVar.k(zfnVar)).w0(f7);
            final float fW2 = ((w6k) fetVar.k(zfnVar)).w0(f8);
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f9);
            if ((((i2 & 112) ^ 48) <= 32 || !fetVar.f(j)) && (i2 & 48) != 32) {
                z = false;
            }
            boolean zD = fetVar.d(fW0) | z | fetVar.d(fW1) | fetVar.d(fW2);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                Function1 function1 = new Function1() { // from class: a.lrh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        fhl.Q(fhlVar, j, jFloatToRawIntBits, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fW0, 0, qjj.K(0.0f, new float[]{fW1, fW2}), 464);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function1);
                objP = function1;
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
            f4 = f9;
            f5 = f7;
            f6 = f8;
        } else {
            fetVar.X();
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(j, f4, f5, f6, i) { // from class: a.mrh
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    lgb.g(this.f22271a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static int g0(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final void h(mm40 mm40Var, lkl lklVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        h4d h4dVar;
        float f;
        fetVar.g0(1128735097);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(lklVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long promoCardGradientStart = ((ThemeColors) fetVar.k(zfnVar)).getPromoCardGradientStart();
            long promoCardGradientEnd = ((ThemeColors) fetVar.k(zfnVar)).getPromoCardGradientEnd();
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            qc0 qc0Var = lklVar.b;
            String str = lklVar.f;
            boolean zE = fetVar.e(qc0Var.ordinal());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = qc0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    objP = yk5.g(q3d.j(new y3d(promoCardGradientStart), new y3d(promoCardGradientEnd)), 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    objP = new skk0(secondary);
                }
                fetVar.o0(objP);
            }
            t89 t89Var = (t89) objP;
            boolean zE2 = fetVar.e(qc0Var.ordinal());
            Object objP2 = fetVar.P();
            Object obj = objP2;
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = qc0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    h4dVar = null;
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return;
                    }
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar2.b = fArrA;
                    h4dVar = h4dVar2;
                }
                fetVar.o0(h4dVar);
                obj = h4dVar;
            }
            a4d a4dVar = (a4d) obj;
            boolean zG = fetVar.g(str);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new wul(oul.e, oe9.f25112a, new ue9(str), true, false, true);
                fetVar.o0(objP3);
            }
            wul wulVar = (wul) objP3;
            int iOrdinal3 = qc0Var.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                zcl zclVar = qmk.f28987a;
                f = 98.0f;
            } else if (iOrdinal3 != 2 && iOrdinal3 != 3) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 68.0f;
            }
            float f2 = f;
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function0, 28);
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.P(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarW), t89Var, null, 6), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            yx7 yx7Var = gqw0.k;
            int i3 = i2 & 896;
            A(s5x0.N(x7zVar.e(new ecu0(yx7Var)), 0.0f, 0.0f, 12.0f, 0.0f, 11), lklVar, function0, fetVar, i2 & 1008);
            j0x.b(l7x.X(lklVar.f20206a.a(), null, null, fetVar, 0, 30), null, o2e.e0(yyw.V(o7k0.n(new ecu0(yx7Var), f2), fetVar.k(bmd.n) == k6z.b), "AGGREGATOR_BONUSES_IMAGE_BUTTON_STYLE"), null, gqw0.A, 0.0f, a4dVar, fetVar, 24624, 40);
            fet fetVar3 = fetVar;
            fetVar3.r(true);
            if (qc0Var != qc0.d) {
                fetVar3.e0(193579262);
                qzb.n(o2e.e0(o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), 40.0f), "AGGREGATOR_BONUSES_BUTTON_GO_BUTTON_STYLE"), wulVar, function0, fetVar3, i3, 0);
                fetVar3.r(false);
            } else {
                fetVar3.e0(193937715);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, lklVar, function0, i, (byte) 14);
        }
    }

    public static final float h0(fet fetVar) {
        pfx pfxVarI;
        Window window = hxm0.p((View) fetVar.k(dy2.f)).getWindow();
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(window) | fetVar.g(w6kVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            View decorView = window.getDecorView();
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(decorView);
            objP = twn.j(w6kVar.r0((xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(1)) == null) ? 0 : pfxVarI.b), fetVar);
        }
        return ((ycl) objP).f42389a;
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1516166392);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 176.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 23);
        }
    }

    public static int i0(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZ = gkb.Z(obj);
        int i2 = iZ & i;
        int iK0 = k0(i2, obj3);
        if (iK0 != 0) {
            int i3 = ~i;
            int i4 = iZ & i3;
            int i5 = -1;
            while (true) {
                int i6 = iK0 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && Objects.equals(obj, objArr[i6]) && (objArr2 == null || Objects.equals(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        l0(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = g0(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iK0 = i9;
            }
        }
        return -1;
    }

    public static final void j(mm40 mm40Var, vsl vslVar, fet fetVar, int i, int i2) {
        vslVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (vslVar instanceof tsl) {
            fetVar.e0(1457760211);
            b(mm40Var, ((tsl) vslVar).f34466a, fetVar, i & 14);
            fetVar.r(false);
        } else {
            if (!(vslVar instanceof usl)) {
                throw b1j.f(185570127, fetVar, false);
            }
            fetVar.e0(1457944785);
            D(mm40Var, ((usl) vslVar).f36217a, fetVar, i & 14);
            fetVar.r(false);
        }
    }

    public static final aty j0(aty atyVar, aty atyVar2) {
        kkq kkqVarY;
        gqw0 gqw0Var = gqw0.C1;
        atyVar.getClass();
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        if (kzj0VarZ == null && ((kkqVarY = rcb.Y(atyVar)) == null || (kzj0VarZ = rcb.W0(kkqVarY)) == null)) {
            kzj0VarZ = rcb.Z(atyVar);
            kzj0VarZ.getClass();
        }
        if (rcb.y0(rcb.o1(kzj0VarZ)) != null) {
            return rcb.P0(atyVar) ? gqw0Var.K0(atyVar2) : atyVar2;
        }
        zxs0 zxs0Var = (zxs0) CollectionsKt.v0(rcb.o0(atyVar));
        if (soo.f32553a[rcb.A0(zxs0Var).ordinal()] == 1) {
            gqw0Var.c();
            throw null;
        }
        tft0 tft0VarX0 = rcb.x0(gqw0Var, zxs0Var);
        tft0VarX0.getClass();
        aty atyVarJ0 = j0(tft0VarX0, atyVar2);
        atyVarJ0.getClass();
        if (atyVarJ0 instanceof wsy) {
            gqw0Var.c();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(gqw0Var);
        sb.append(", ");
        throw new IllegalArgumentException(kng0.g(sre0.f32672a, gqw0Var.getClass(), sb).toString());
    }

    public static final void k(uhm uhmVar, bzl bzlVar, Function1 function1, Function0 function0, Function0 function2, Function0 function3, Function1 function4, Function0 function5, Function1 function6, Function0 function7, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        bzlVar.getClass();
        fetVar2.g0(-783953224);
        jm40 jm40Var = jm40.b;
        int i2 = i | (fetVar2.g(jm40Var) ? 4 : 2) | (fetVar2.g(uhmVar) ? 32 : 16) | (fetVar2.g(bzlVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536) | (fetVar2.i(function3) ? 1048576 : 524288) | (fetVar2.i(function4) ? 8388608 : 4194304) | (fetVar2.i(function5) ? 67108864 : 33554432) | (fetVar2.i(function6) ? 536870912 : 268435456);
        int i3 = fetVar2.i(function7) ? 4 : 2;
        if (fetVar2.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            mm40 mm40VarK = K(mbc.N(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), bzlVar, fetVar, (i2 >> 3) & 112));
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
            zcl zclVar = qmk.f28987a;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new yra(bzlVar, (byte) 4));
                fetVar.o0(objP);
            }
            int i4 = i2 >> 12;
            B(yyw.X(jm40Var, null, fetVar, 1), uhmVar, function3, function4, function6, function5, function7, fetVar, (i4 & 896) | (i2 & 112) | (i4 & 7168) | ((i2 >> 15) & 57344) | ((i2 >> 9) & 458752) | ((i3 << 18) & 3670016));
            fetVar2 = fetVar;
            mbc.c(152.0f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), bzlVar, u1c.M(313545814, new cqk(uhmVar, function1, function0, function2, (l7m0) objP), fetVar), fetVar2, (i2 & 896) | 3072);
            rz4.t(jm40Var, 36.0f, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nf4(uhmVar, bzlVar, function1, function0, function2, function3, function4, function5, function6, function7, i, (byte) 1);
        }
    }

    public static int k0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static final void l(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(1397134428);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            y(i2 & 126, fetVar, a4xVar, mm40Var);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 7);
        }
    }

    public static void l0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final void m(mm40 mm40Var, gym gymVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-688735062);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 100.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(6.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            if (!(gymVar.c instanceof txm) || gymVar.b.length() > 0 || gymVar.d.length() > 0) {
                fetVar.e0(1770117114);
                q(gymVar, fetVar, (i2 >> 3) & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(1770167086);
                fetVar.r(false);
            }
            x(0, fetVar, null, gymVar.f12137a);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 19, i, mm40Var, gymVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final kgb m0(ogb ogbVar) {
        ?? arrayList;
        deb debVar;
        ?? arrayList2;
        ArrayList arrayList3;
        List list;
        ?? arrayList4;
        ?? arrayList5;
        juk jukVar;
        List<u680> list2;
        List<iip0> list3 = ogbVar.f25210a;
        int i = 10;
        if (list3 != null) {
            arrayList = new ArrayList(r3d.q(list3, 10));
            for (iip0 iip0Var : list3) {
                iip0Var.getClass();
                String str = iip0Var.f14838a;
                if (str == null) {
                    str = "";
                }
                Integer num = iip0Var.c;
                int iIntValue = num != null ? num.intValue() : 0;
                String str2 = iip0Var.d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = iip0Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new xfp0(str, iIntValue, str2, str3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        Long l = ogbVar.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        veb vebVar = ogbVar.c;
        if (vebVar != null) {
            String str4 = vebVar.f37276a;
            String str5 = str4 == null ? "" : str4;
            p6i0 p6i0Var = vebVar.b;
            if (p6i0Var == null || (jukVar = p6i0Var.c) == null || (list2 = jukVar.f17157a) == null) {
                arrayList2 = 0;
            } else {
                arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (u680 u680Var : list2) {
                    u680Var.getClass();
                    String str6 = u680Var.f35126a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = u680Var.b;
                    if (str7 == null) {
                        str7 = "";
                    }
                    Boolean bool = u680Var.c;
                    arrayList2.add(new ytk(str6, str7, bool != null ? bool.booleanValue() : false));
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r13 = arrayList2;
            String str8 = vebVar.d;
            String str9 = str8 == null ? "" : str8;
            String str10 = vebVar.f;
            String str11 = str10 == null ? "" : str10;
            Long l2 = vebVar.g;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            List list4 = vebVar.i;
            if (list4 != null) {
                arrayList3 = new ArrayList(r3d.q(list4, 10));
                r13 = r13;
                for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                    mmo0 mmo0Var = (mmo0) it.next();
                    mmo0Var.getClass();
                    Long l3 = mmo0Var.f22050a;
                    long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                    List list5 = mmo0Var.b;
                    if (list5 != null) {
                        arrayList5 = new ArrayList(r3d.q(list5, i));
                        Iterator it2 = list5.iterator();
                        r13 = r13;
                        while (it2.hasNext()) {
                            urq0 urq0Var = (urq0) it2.next();
                            Iterator it3 = it2;
                            Long l4 = urq0Var.f36177a;
                            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                            String str12 = urq0Var.c;
                            if (str12 == null) {
                                str12 = "";
                            }
                            arrayList5.add(new rrq0(jLongValue4, str12));
                            str5 = str5;
                            it2 = it3;
                            r13 = r13;
                        }
                    } else {
                        arrayList5 = 0;
                    }
                    String str13 = str5;
                    ?? r22 = r13;
                    if (arrayList5 == 0) {
                        arrayList5 = iun.f15405a;
                    }
                    arrayList3.add(new dmo0(jLongValue3, arrayList5));
                    str5 = str13;
                    r13 = r22;
                    i = 10;
                }
            } else {
                arrayList3 = null;
            }
            String str14 = str5;
            ?? r23 = r13;
            List list6 = arrayList3;
            if (arrayList3 == null) {
                list6 = iun.f15405a;
            }
            List list7 = vebVar.j;
            if (list7 != null) {
                ArrayList<u6e0> arrayListR = r3d.r(list7);
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayListR, 10));
                for (u6e0 u6e0Var : arrayListR) {
                    Long l5 = u6e0Var.f35135a;
                    long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                    List<q9e0> list8 = u6e0Var.b;
                    if (list8 != null) {
                        arrayList4 = new ArrayList(r3d.q(list8, 10));
                        for (q9e0 q9e0Var : list8) {
                            Long l6 = q9e0Var.f28343a;
                            long jLongValue6 = l6 != null ? l6.longValue() : 0L;
                            Long l7 = q9e0Var.b;
                            long jLongValue7 = l7 != null ? l7.longValue() : 0L;
                            List list9 = q9e0Var.d;
                            if (list9 == null) {
                                list9 = iun.f15405a;
                            }
                            List list10 = list9;
                            String str15 = q9e0Var.e;
                            arrayList4.add(new k9e0(jLongValue6, jLongValue7, str15 == null ? "" : str15, list10));
                        }
                    } else {
                        arrayList4 = 0;
                    }
                    if (arrayList4 == 0) {
                        arrayList4 = iun.f15405a;
                    }
                    arrayList6.add(new n6e0(jLongValue5, arrayList4));
                }
                list = arrayList6;
            } else {
                list = null;
            }
            if (list == null) {
                list = iun.f15405a;
            }
            debVar = new deb(str14, r23, str9, str11, jLongValue2, list6, list);
        } else {
            debVar = null;
        }
        return new kgb(arrayList, jLongValue, debVar);
    }

    public static final void n(mm40 mm40Var, mim0 mim0Var, boolean z, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        mim0Var.getClass();
        function1.getClass();
        if ((i & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (z) {
            fetVar.e0(211662417);
            k6zVar = (k6z) fetVar.k(bmd.n);
            fetVar.r(false);
        } else {
            fetVar.e0(211663341);
            fetVar.r(false);
            k6zVar = k6z.f17794a;
        }
        obc.d(bmd.n.a(k6zVar), u1c.M(-1491965622, new d8m((Object) mim0Var, (Object) mm40Var, (Object) function1, (byte) 17), fetVar), fetVar, 56);
    }

    public static final yre n0(q4f q4fVar) {
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal != 22) {
            switch (iOrdinal) {
                case 1:
                    return yre.SINGLE;
                case 2:
                    return yre.EXPRESS;
                case 3:
                    return yre.SYSTEM;
                case 4:
                    return yre.CHAIN;
                case 5:
                    return yre.MULTY;
                case 6:
                    return yre.CONDITION;
                case 7:
                    return yre.ANTI_EXPRESS;
                case 8:
                    return yre.LUCKY;
                case 9:
                    return yre.PATENT;
                case 10:
                    break;
                case 11:
                    return yre.MANY_SINGLES;
                default:
                    return null;
            }
        }
        return yre.CONSTRUCTOR;
    }

    public static final void o(xdu0 xdu0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(333001020);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xdu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = w6o.f38633a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(xdu0Var, clzVar, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(xdu0Var, clzVar, (byte) 11);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, xdu0Var, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(xdu0Var, i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v39, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v41, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v43, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    public static final omg o0(rmg rmgVar) {
        String strF;
        String str;
        int i;
        String strF2;
        String strF3;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        List list;
        char c2;
        ?? arrayList4;
        mls mlsVar;
        int iOrdinal;
        Integer num = rmgVar.f30743a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = rmgVar.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        s8h s8hVarI = e3c.I(rmgVar.c);
        s8h s8hVarI2 = e3c.I(rmgVar.d);
        String str2 = rmgVar.e;
        String str3 = "";
        String str4 = str2 == null ? "" : str2;
        Integer num3 = rmgVar.f;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = rmgVar.g;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        Long l = rmgVar.i;
        ?? arrayList5 = 0;
        if (l != null) {
            long jLongValue = l.longValue();
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(jLongValue), sdj.UNIVERSAL, null, 60);
        } else {
            strF = null;
        }
        if (strF == null) {
            strF = "";
        }
        List list2 = rmgVar.j;
        if (list2 != null) {
            ArrayList arrayList6 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                nmg nmgVar = (nmg) next;
                nmgVar.getClass();
                l8h l8hVar = nmgVar.b;
                Long l2 = nmgVar.f;
                Long l3 = nmgVar.e;
                e8h e8hVarR = u1c.R(l8hVar);
                e8h e8hVarR2 = u1c.R(nmgVar.c);
                Iterator it2 = it;
                Long l4 = nmgVar.f23770a;
                long jLongValue2 = l4 != null ? l4.longValue() : 0L;
                Integer num5 = nmgVar.d;
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                String str5 = strF;
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    rdj rdjVar2 = rdj.f30294a;
                    strF2 = rdj.f(new znq0(jLongValue3), sdj.UNIVERSAL, null, 60);
                } else {
                    strF2 = null;
                }
                String str6 = strF2 == null ? str3 : strF2;
                if (l2 != null) {
                    long jLongValue4 = l2.longValue();
                    rdj rdjVar3 = rdj.f30294a;
                    strF3 = rdj.f(new znq0(jLongValue4), sdj.UNIVERSAL, null, 60);
                } else {
                    strF3 = null;
                }
                String str7 = strF3 == null ? str3 : strF3;
                rdj rdjVar4 = rdj.f30294a;
                String strH = rdj.h(new znq0((l2 != null ? l2.longValue() : 0L) - (l3 != null ? l3.longValue() : 0L)), ykq0.UNIQUE_2, Boolean.TRUE, null, 248);
                List<hev> list3 = nmgVar.g;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    for (hev hevVar : list3) {
                        hevVar.getClass();
                        Integer num6 = hevVar.f12942a;
                        int iIntValue6 = num6 != null ? num6.intValue() : 0;
                        Integer num7 = hevVar.b;
                        arrayList.add(new eev(iIntValue6, num7 != null ? num7.intValue() : 0));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r27 = arrayList;
                List<hev> list4 = nmgVar.h;
                if (list4 != null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    for (hev hevVar2 : list4) {
                        hevVar2.getClass();
                        Integer num8 = hevVar2.f12942a;
                        int iIntValue7 = num8 != null ? num8.intValue() : 0;
                        Integer num9 = hevVar2.b;
                        arrayList2.add(new eev(iIntValue7, num9 != null ? num9.intValue() : 0));
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r28 = arrayList2;
                List<hev> list5 = nmgVar.i;
                if (list5 != null) {
                    arrayList3 = new ArrayList(r3d.q(list5, 10));
                    for (hev hevVar3 : list5) {
                        hevVar3.getClass();
                        Integer num10 = hevVar3.f12942a;
                        int iIntValue8 = (num10 != null ? num10.intValue() : 0) - 50;
                        Integer num11 = hevVar3.b;
                        arrayList3.add(new eev(iIntValue8, num11 != null ? num11.intValue() : 0));
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r29 = arrayList3;
                ArrayList arrayListQ0 = CollectionsKt.q0(e8hVarR.e, e8hVarR2.e);
                Iterable iterable = nmgVar.j;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : iterable) {
                    p8h p8hVar = (p8h) obj;
                    if (p8hVar.c == null || p8hVar.d == null || p8hVar.f26553a == null || p8hVar.b == null) {
                        arrayList7.add(obj);
                    }
                }
                if (arrayList7.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList(r3d.q(iterable, 10));
                    int i4 = 0;
                    for (Object obj2 : iterable) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            q3d.p();
                            throw null;
                        }
                        p8h p8hVar2 = (p8h) obj2;
                        p8hVar2.getClass();
                        String str8 = p8hVar2.f26553a;
                        String str9 = str8 == null ? str3 : str8;
                        String strE = lmc.E(p8hVar2.b);
                        Boolean bool = p8hVar2.c;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = p8hVar2.d;
                        arrayList8.add(new m8h(i5, str9, strE, zBooleanValue, bool2 != null ? bool2.booleanValue() : false));
                        i4 = i5;
                    }
                    list = arrayList8;
                } else {
                    list = iun.f15405a;
                }
                List<lls> list6 = nmgVar.k;
                if (list6 != null) {
                    c2 = '\n';
                    arrayList4 = new ArrayList(r3d.q(list6, 10));
                    for (lls llsVar : list6) {
                        llsVar.getClass();
                        ols olsVar = llsVar.f20264a;
                        if (olsVar == null || (iOrdinal = olsVar.ordinal()) == 0) {
                            mlsVar = mls.f22008a;
                        } else if (iOrdinal == 1) {
                            mlsVar = mls.b;
                        } else if (iOrdinal == 2) {
                            mlsVar = mls.c;
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            mlsVar = mls.d;
                        }
                        mls mlsVar2 = mlsVar;
                        Long l5 = llsVar.b;
                        long j = -1;
                        if (l5 != null) {
                            long jLongValue5 = l5.longValue();
                            if (jLongValue5 >= 0) {
                                j = jLongValue5;
                            }
                        }
                        long j2 = j;
                        Boolean bool3 = llsVar.c;
                        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                        Integer num12 = llsVar.d;
                        int iIntValue9 = num12 != null ? num12.intValue() : 0;
                        String str10 = llsVar.e;
                        String str11 = str10 == null ? str3 : str10;
                        String strE2 = lmc.E(llsVar.f);
                        Integer num13 = llsVar.g;
                        int iIntValue10 = num13 != null ? num13.intValue() : 0;
                        String str12 = llsVar.h;
                        arrayList4.add(new ils(mlsVar2, j2, zBooleanValue2, iIntValue9, str11, strE2, iIntValue10, str12 == null ? str3 : str12, lmc.E(llsVar.i)));
                    }
                } else {
                    c2 = '\n';
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                arrayList6.add(new kmg(jLongValue2, i3, e8hVarR, e8hVarR2, iIntValue5, str6, str7, strH, r27, r28, r29, arrayListQ0, list, arrayList4));
                i2 = i3;
                it = it2;
                strF = str5;
                str3 = str3;
                iIntValue = iIntValue;
            }
            str = strF;
            i = iIntValue;
            arrayList5 = new ArrayList();
            for (Object obj3 : arrayList6) {
                kmg kmgVar = (kmg) obj3;
                if (!kmgVar.j.isEmpty() || !kmgVar.i.isEmpty() || !kmgVar.l.isEmpty()) {
                    arrayList5.add(obj3);
                }
            }
        } else {
            str = strF;
            i = iIntValue;
        }
        if (arrayList5 == 0) {
            arrayList5 = iun.f15405a;
        }
        return new omg(i, iIntValue2, s8hVarI, s8hVarI2, str4, iIntValue3, iIntValue4, str, arrayList5);
    }

    public static final void p(efr efrVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        efrVar.getClass();
        boolean z = efrVar.f;
        fetVar2.g0(1039237272);
        int i2 = i | (fetVar2.g(efrVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = z ? 0.0f : 2.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = J(o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7), 1.0f), 56.0f), b5x.Q(z));
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarJ, staticColors.m73getBlack400d7_KjU(), jd8.n), 8.0f, 6.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            o5n0.h(efrVar.c, fetVar2, 0);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zhg0 zhg0Var = zhg0.f44392a;
            z(0, fetVar2, zhg0Var.a(1.0f, mm40VarD, true), efrVar.b, efrVar.f7730a);
            v8q0.a(efrVar.e, o2e.e0(zhg0Var.a(1.0f, o7k0.d(jm40Var, 1.0f), true), "FUTURE_GAME_ITEM_DATE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 130040);
            v8q0.a(efrVar.d, o2e.e0(zhg0Var.a(1.0f, o7k0.d(jm40Var, 1.0f), true), "FUTURE_GAME_ITEM_TIME"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jar(efrVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [a.dbp, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v6, types: [a.dbp, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v7, types: [a.dbp, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v8, types: [a.dbp, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v9, types: [a.dbp, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static final dbp p0(hcp hcpVar) {
        ?? arrayList;
        ?? r18;
        List arrayList2;
        ?? arrayList3;
        xvs xvsVar;
        ?? r10;
        xvs xvsVar2;
        List list;
        xvs xvsVar3;
        tnp0 rnp0Var;
        List<adp> list2 = hcpVar.c;
        xvs xvsVar4 = null;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (adp adpVar : list2) {
                adpVar.getClass();
                Long l = adpVar.f690a;
                Long l2 = adpVar.c;
                if (l == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue = l.longValue();
                if (l2 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue2 = l2.longValue();
                long jLongValue3 = l.longValue();
                if (jLongValue2 == 40 || gql0.a().contains(l2)) {
                    Integer num = adpVar.f;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Long l3 = adpVar.d;
                    if (l3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    rnp0Var = new rnp0(jLongValue3, jLongValue2, l3.longValue(), Integer.valueOf(iIntValue));
                } else {
                    rnp0Var = new snp0(jLongValue3, jLongValue2);
                }
                String str = adpVar.b;
                String str2 = str == null ? "" : str;
                String str3 = adpVar.e;
                String str4 = str3 == null ? "" : str3;
                List list3 = adpVar.g;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                List list4 = list3;
                Integer num2 = adpVar.h;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Boolean bool = adpVar.i;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                String str5 = adpVar.j;
                arrayList.add(new xcp(jLongValue, rnp0Var, str2, str4, l2.longValue(), list4, iIntValue2, zBooleanValue, str5 == null ? "" : str5));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r8 = arrayList;
        List<b9p> list5 = hcpVar.b;
        if (list5 != null) {
            arrayList2 = new ArrayList();
            for (b9p b9pVar : list5) {
                List<n8p> list6 = b9pVar.b;
                if (list6 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                    for (n8p n8pVar : list6) {
                        Long l4 = b9pVar.f2222a;
                        n8pVar.getClass();
                        Long l5 = n8pVar.f23102a;
                        if (l5 == null) {
                            ?? r19 = xvsVar4;
                            jf4.k(r19);
                            return r19;
                        }
                        long jLongValue4 = l5.longValue();
                        Long l6 = n8pVar.b;
                        if (l6 == null) {
                            ?? r110 = xvsVar4;
                            jf4.k(r110);
                            return r110;
                        }
                        long jLongValue5 = l6.longValue();
                        Long l7 = n8pVar.c;
                        if (l7 == null) {
                            ?? r111 = xvsVar4;
                            jf4.k(r111);
                            return r111;
                        }
                        long jLongValue6 = l7.longValue();
                        String str6 = n8pVar.d;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = n8pVar.e;
                        String str9 = str8 == null ? "" : str8;
                        Long l8 = n8pVar.f;
                        if (l8 == null) {
                            ?? r112 = xvsVar4;
                            jf4.k(r112);
                            return r112;
                        }
                        long jLongValue7 = l8.longValue();
                        ddk ddkVar = xvs.b;
                        long jLongValue8 = l4 != null ? l4.longValue() : 0L;
                        ddkVar.getClass();
                        xvs[] xvsVarArrValues = xvs.values();
                        int length = xvsVarArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                xvsVar2 = xvsVar4;
                                list = arrayList2;
                                xvsVar3 = xvsVar2;
                                break;
                            }
                            xvsVar3 = xvsVarArrValues[i];
                            xvsVar2 = xvsVar4;
                            list = arrayList2;
                            if (xvsVar3.f41576a == jLongValue8) {
                                break;
                            }
                            i++;
                            xvsVar4 = xvsVar2;
                            arrayList2 = list;
                        }
                        if (xvsVar3 == null) {
                            xvsVar3 = xvs.UNKNOWN;
                        }
                        arrayList4.add(new k8p(jLongValue4, jLongValue5, jLongValue6, str7, str9, jLongValue7, xvsVar3));
                        xvsVar4 = xvsVar2;
                        arrayList2 = list;
                    }
                    xvsVar = xvsVar4;
                    r10 = arrayList4;
                } else {
                    xvsVar = xvsVar4;
                    r10 = xvsVar;
                }
                List list7 = arrayList2;
                if (r10 == 0) {
                    r10 = iun.f15405a;
                }
                w3d.u(list7, r10);
                arrayList2 = list7;
                xvsVar4 = xvsVar;
            }
            r18 = xvsVar4;
        } else {
            r18 = 0;
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = iun.f15405a;
        }
        List list8 = arrayList2;
        List<l5p> list9 = hcpVar.f12834a;
        if (list9 != null) {
            arrayList3 = new ArrayList(r3d.q(list9, 10));
            for (l5p l5pVar : list9) {
                l5pVar.getClass();
                Long l9 = l5pVar.f19469a;
                Long l10 = l5pVar.d;
                if (l9 == null) {
                    jf4.k(r18);
                    return r18;
                }
                long jLongValue9 = l9.longValue();
                Long l11 = l5pVar.c;
                if (l11 == null) {
                    jf4.k(r18);
                    return r18;
                }
                long jLongValue10 = l11.longValue();
                if (l10 == null) {
                    jf4.k(r18);
                    return r18;
                }
                long jLongValue11 = l10.longValue();
                Boolean bool2 = l5pVar.h;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                long jLongValue12 = l9.longValue();
                sgb qgbVar = zBooleanValue2 ? new qgb(jLongValue12, l10.longValue()) : new rgb(jLongValue12);
                String str10 = l5pVar.b;
                String str11 = str10 == null ? "" : str10;
                String str12 = l5pVar.e;
                String str13 = str12 == null ? "" : str12;
                String str14 = l5pVar.f;
                String str15 = str14 == null ? "" : str14;
                Long l12 = l5pVar.g;
                long jLongValue13 = l12 != null ? l12.longValue() : 0L;
                Boolean bool3 = l5pVar.n;
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = l5pVar.l;
                Boolean bool5 = Boolean.TRUE;
                h5p h5pVar = Intrinsics.d(bool4, bool5) ? h5p.c : Intrinsics.d(l5pVar.k, bool5) ? h5p.b : h5p.f12492a;
                Integer num3 = l5pVar.i;
                int iIntValue3 = num3 != null ? num3.intValue() : -1;
                Integer num4 = l5pVar.j;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Long l13 = l5pVar.m;
                arrayList3.add(new i5p(iIntValue3, iIntValue4, jLongValue9, jLongValue10, jLongValue11, jLongValue13, l13 != null ? l13.longValue() : 0L, qgbVar, h5pVar, str11, str13, str15, zBooleanValue3));
            }
        } else {
            arrayList3 = r18;
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r11 = arrayList3;
        m7p m7pVar = hcpVar.d;
        if (m7pVar == null) {
            jf4.k(r18);
            return r18;
        }
        Long l14 = m7pVar.f21331a;
        if (l14 == null) {
            jf4.k(r18);
            return r18;
        }
        long jLongValue14 = l14.longValue();
        Long l15 = m7pVar.b;
        if (l15 == null) {
            jf4.k(r18);
            return r18;
        }
        long jLongValue15 = l15.longValue();
        Long l16 = m7pVar.c;
        if (l16 == null) {
            jf4.k(r18);
            return r18;
        }
        long jLongValue16 = l16.longValue();
        Long l17 = m7pVar.d;
        if (l17 == null) {
            jf4.k(r18);
            return r18;
        }
        j7p j7pVar = new j7p(jLongValue14, jLongValue15, jLongValue16, l17.longValue());
        String str16 = hcpVar.e;
        return new dbp(r8, list8, r11, j7pVar, str16 == null ? "" : str16);
    }

    public static final void q(gym gymVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1128344315);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(gymVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
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
            String str = gymVar.d;
            wxm wxmVar = gymVar.c;
            if (str.length() > 0) {
                fetVar2.e0(-559910337);
                j6n.h(gymVar.d, oro0.f25744a, null, 0, 0, fetVar2, 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-559773565);
                fetVar2.r(false);
            }
            if (wxmVar instanceof txm) {
                fetVar2.e0(-1264979965);
                fetVar2.r(false);
            } else if (wxmVar instanceof uxm) {
                fetVar2.e0(-559587720);
                rcb.x(null, acb.W((uxm) wxmVar), h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!(wxmVar instanceof vxm)) {
                    throw b1j.f(-1264982140, fetVar2, false);
                }
                fetVar2.e0(-559165345);
                j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            }
            if (gymVar.b.length() > 0) {
                fetVar2.e0(-558931791);
                v8q0.a(gymVar.b, new x7z(1.0f, false), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-558627805);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(gymVar, i, (byte) 21);
        }
    }

    public static final la30 q0(vvd0 vvd0Var, m9s m9sVar) {
        vvd0Var.getClass();
        m9sVar.getClass();
        yk5 yk5Var = mc6.b;
        qqs qqsVar = m9sVar.h;
        Integer numValueOf = Integer.valueOf(qqsVar.n);
        yk5Var.getClass();
        byte b2 = yk5.d(numValueOf).f21536a;
        int i = qqsVar.d;
        return new la30(b2, 0L, "", qem0.l(b2, i), qem0.l(b2, i));
    }

    public static final void r(Object obj, boolean z, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(759141899);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj2 = objP;
            if (objP == ukd.f35823a) {
                u2z u2zVar = new u2z();
                u2zVar.f34970a = obj;
                fetVar.o0(u2zVar);
                obj2 = u2zVar;
            }
            u2z u2zVar2 = (u2z) obj2;
            if (z) {
                u2zVar2.f34970a = obj;
            }
            pzn pznVarD = kzn.d(Z(), 0.0f, 2);
            uts0 uts0VarZ = Z();
            yx7 yx7Var = gqw0.j;
            b34.h(z, null, pznVarD.a(kzn.c(uts0VarZ, yx7Var, 8)), kzn.e(Z(), 2).a(kzn.i(Z(), yx7Var, 8)), null, u1c.M(1380453091, new rgh(ugdVar, u2zVar2, (byte) 10), fetVar), fetVar, ((i2 >> 3) & 14) | 196608, 18);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(obj, z, (Object) ugdVar, i, (byte) 9);
        }
    }

    public static final void s(mm40 mm40Var, String str, long j, fet fetVar) {
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
        k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
        k1xVar.c = str;
        k7x.b(k1xVar.a(), null, mm40VarN, a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, null, null, null, null, null, new m78(j, 5), fetVar, 36912, 0, 28640);
    }

    public static final void t(mm40 mm40Var, m0x m0xVar, qge qgeVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1468494542);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(m0xVar) ? 32 : 16) | 384;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objA = m0xVar.a();
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new ca6(pz40Var, (byte) 18);
                fetVar2.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, qgeVar, fetVar2, 3456, 18);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (lz3Var != null && ((lz3Var instanceof kz3) || (lz3Var instanceof hz3))) {
                fetVar2.e0(-615357944);
                j0x.b(mz3VarX, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), null, qgeVar, 0.0f, null, fetVar, 1597488, 40);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-615052718);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, m0xVar, qgeVar, i, (byte) 5);
        }
    }

    public static final void u(mm40 mm40Var, mm40 mm40Var2, mz3 mz3Var, long j, qge qgeVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-2094749667);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(mm40Var2) ? 32 : 16) | (fetVar2.g(mz3Var) ? 256 : 128) | (fetVar2.e(R.drawable.composition_player_statistic_placeholder) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            lz3 lz3Var = (lz3) ydx.F(mz3Var.u, fetVar2).getValue();
            if (lz3Var != null) {
                if ((lz3Var instanceof kz3) || (lz3Var instanceof hz3)) {
                    fetVar2.e0(1187941728);
                    j0x.b(mz3Var, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), null, qgeVar, 0.0f, null, fetVar2, ((i2 >> 6) & 14) | 24624, 104);
                    fetVar2.r(false);
                } else if ((lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                    fetVar2.e0(1188288060);
                    dww.c(a8k0.F(R.drawable.composition_player_statistic_placeholder, (i2 >> 9) & 14, fetVar2), null, mm40Var2, j, fetVar, ((i2 << 3) & 896) | 56 | ((i2 >> 3) & 7168), 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(1285243608, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new si6(mm40Var, mm40Var2, mz3Var, j, qgeVar, i, (byte) 2);
        }
    }

    public static final void v(mm40 mm40Var, final mm40 mm40Var2, final String str, final int i, final long j, final qge qgeVar, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var3;
        int i4;
        mm40 mm40Var4;
        boolean z;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(695798290);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var3 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var3 = mm40Var;
            i4 = (fetVar2.g(mm40Var3) ? 4 : 2) | i2;
        } else {
            mm40Var3 = mm40Var;
            i4 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(mm40Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar2.f(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar2.g(qgeVar) ? 131072 : 65536;
        }
        int i6 = i4;
        if (fetVar2.U(i6 & 1, (74899 & i6) != 74898)) {
            mm40 mm40Var5 = i5 != 0 ? jm40.b : mm40Var3;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new ca6(pz40Var, b2);
                fetVar2.o0(objP2);
            }
            int i7 = i6 >> 6;
            mz3 mz3VarX = l7x.X(str, (Function1) objP2, qgeVar, fetVar2, (i7 & 14) | 384 | (i7 & 7168), 18);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (lz3Var == null) {
                z = false;
            } else if ((lz3Var instanceof kz3) || (lz3Var instanceof hz3)) {
                fetVar2.e0(1015360371);
                mm40 mm40VarE0 = o2e.e0(mm40Var5, "STATISTIC_PLAYER_IMAGE_TEST_TAG");
                boolean z2 = (i6 & 896) == 256;
                Object objP3 = fetVar2.P();
                if (z2 || objP3 == cl5Var) {
                    objP3 = new ka6(str, (byte) 2);
                    fetVar2.o0(objP3);
                }
                mm40Var4 = mm40Var5;
                j0x.b(mz3VarX, null, pai0.a(mm40VarE0, false, (Function1) objP3), null, qgeVar, 0.0f, null, fetVar, (57344 & (i6 >> 3)) | 48, 104);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mm40Var4 = mm40Var5;
                z = false;
                if ((lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                    fetVar2.e0(1015827262);
                    pm80 pm80VarF = a8k0.F(i, (i6 >> 9) & 14, fetVar2);
                    mm40 mm40VarE1 = o2e.e0(mm40Var2, "STATISTIC_PLAYER_IMAGE_TEST_TAG");
                    boolean z3 = (i6 & 7168) == 2048;
                    Object objP4 = fetVar2.P();
                    if (z3 || objP4 == cl5Var) {
                        objP4 = new dx2(i, (byte) 7);
                        fetVar2.o0(objP4);
                    }
                    dww.c(pm80VarF, null, pai0.a(mm40VarE1, false, (Function1) objP4), j, fetVar2, 56 | ((i6 >> 3) & 7168), 0);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1352722674, fetVar2, z);
        }
        fetVar2.X();
        mm40Var4 = mm40Var3;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var6 = mm40Var4;
            yfe0VarU.d = new Function2() { // from class: a.jrh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lgb.v(mm40Var6, mm40Var2, str, i, j, qgeVar, (fet) obj, x8x.L(i2 | 1), i3 ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0190  */
    /* JADX WARN: Code duplicated, block: B:106:0x0199  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e  */
    public static final void w(mm40 mm40Var, mm40 mm40Var2, o0x o0xVar, m0x m0xVar, long j, u12 u12Var, a4d a4dVar, qge qgeVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var3;
        u12 u12Var2;
        int i4;
        a4d a4dVar2;
        int i5;
        boolean z;
        u12 u12Var3;
        a4d a4dVar3;
        yfe0 yfe0VarU;
        u12 u12Var4;
        a4d a4dVar4;
        Object objP;
        cl5 cl5Var;
        pz40 pz40Var;
        Object objP2;
        mz3 mz3VarX;
        lz3 lz3Var;
        boolean z2;
        int i6;
        o0xVar.getClass();
        fetVar.g0(1757147389);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            mm40Var3 = mm40Var2;
            i3 |= fetVar.g(mm40Var3) ? 32 : 16;
        } else {
            mm40Var3 = mm40Var2;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(o0xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(m0xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.f(j) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                u12Var2 = u12Var;
                i3 |= fetVar.g(u12Var2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    a4dVar2 = a4dVar;
                    if (fetVar.g(a4dVar2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((12582912 & i) != 0) {
                    if (fetVar.g(qgeVar)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i7 != 0) {
                        u12Var4 = gqw0.e;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(hz3.f13888a);
                        fetVar.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    Object objA = o0xVar.a();
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ca6(pz40Var, (byte) 17);
                        fetVar.o0(objP2);
                    }
                    mz3VarX = l7x.X(objA, (Function1) objP2, qgeVar, fetVar, ((i3 >> 12) & 7168) | 384, 18);
                    lz3Var = (lz3) pz40Var.getValue();
                    if (lz3Var != null) {
                        if (!(lz3Var instanceof kz3) || (lz3Var instanceof hz3)) {
                            fetVar.e0(117253793);
                            u12 u12Var5 = u12Var4;
                            j0x.b(mz3VarX, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), u12Var5, qgeVar, 0.0f, a4dVar4, fetVar, (i3 & 3670016) | ((i3 >> 6) & 7168) | 48 | ((i3 >> 9) & 57344), 32);
                            u12Var4 = u12Var5;
                            fetVar.r(false);
                        } else if ((lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                            fetVar.e0(117670681);
                            dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, mm40Var3, j, fetVar, ((i3 << 3) & 896) | 56 | ((i3 >> 3) & 7168), 0);
                            fetVar.r(false);
                        } else {
                            z2 = false;
                        }
                        u12Var3 = u12Var4;
                        a4dVar3 = a4dVar4;
                    } else {
                        z2 = false;
                    }
                    throw b1j.f(696515538, fetVar, z2);
                }
                fetVar.X();
                u12Var3 = u12Var2;
                a4dVar3 = a4dVar2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new krh(mm40Var, mm40Var2, o0xVar, m0xVar, j, u12Var3, a4dVar3, qgeVar, i, i2);
                }
            }
            i3 |= 1572864;
            a4dVar2 = a4dVar;
            if ((12582912 & i) != 0) {
                if (fetVar.g(qgeVar)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i7 != 0) {
                    u12Var4 = gqw0.e;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i4 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(hz3.f13888a);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                Object objA2 = o0xVar.a();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ca6(pz40Var, (byte) 17);
                    fetVar.o0(objP2);
                }
                mz3VarX = l7x.X(objA2, (Function1) objP2, qgeVar, fetVar, ((i3 >> 12) & 7168) | 384, 18);
                lz3Var = (lz3) pz40Var.getValue();
                if (lz3Var != null) {
                    if (!(lz3Var instanceof kz3)) {
                        fetVar.e0(117253793);
                        u12 u12Var6 = u12Var4;
                        j0x.b(mz3VarX, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), u12Var6, qgeVar, 0.0f, a4dVar4, fetVar, (i3 & 3670016) | ((i3 >> 6) & 7168) | 48 | ((i3 >> 9) & 57344), 32);
                        u12Var4 = u12Var6;
                        fetVar.r(false);
                    } else {
                        if (lz3Var instanceof iz3) {
                            z2 = false;
                        }
                        fetVar.e0(117670681);
                        dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, mm40Var3, j, fetVar, ((i3 << 3) & 896) | 56 | ((i3 >> 3) & 7168), 0);
                        fetVar.r(false);
                    }
                    u12Var3 = u12Var4;
                    a4dVar3 = a4dVar4;
                } else {
                    z2 = false;
                }
                throw b1j.f(696515538, fetVar, z2);
            }
            fetVar.X();
            u12Var3 = u12Var2;
            a4dVar3 = a4dVar2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new krh(mm40Var, mm40Var2, o0xVar, m0xVar, j, u12Var3, a4dVar3, qgeVar, i, i2);
            }
        }
        i3 |= 196608;
        u12Var2 = u12Var;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                a4dVar2 = a4dVar;
                if (fetVar.g(a4dVar2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((12582912 & i) != 0) {
                if (fetVar.g(qgeVar)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i7 != 0) {
                    u12Var4 = gqw0.e;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i4 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(hz3.f13888a);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                Object objA3 = o0xVar.a();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ca6(pz40Var, (byte) 17);
                    fetVar.o0(objP2);
                }
                mz3VarX = l7x.X(objA3, (Function1) objP2, qgeVar, fetVar, ((i3 >> 12) & 7168) | 384, 18);
                lz3Var = (lz3) pz40Var.getValue();
                if (lz3Var != null) {
                    if (!(lz3Var instanceof kz3)) {
                        fetVar.e0(117253793);
                        u12 u12Var7 = u12Var4;
                        j0x.b(mz3VarX, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), u12Var7, qgeVar, 0.0f, a4dVar4, fetVar, (i3 & 3670016) | ((i3 >> 6) & 7168) | 48 | ((i3 >> 9) & 57344), 32);
                        u12Var4 = u12Var7;
                        fetVar.r(false);
                    } else {
                        if (lz3Var instanceof iz3) {
                            z2 = false;
                        }
                        fetVar.e0(117670681);
                        dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, mm40Var3, j, fetVar, ((i3 << 3) & 896) | 56 | ((i3 >> 3) & 7168), 0);
                        fetVar.r(false);
                    }
                    u12Var3 = u12Var4;
                    a4dVar3 = a4dVar4;
                } else {
                    z2 = false;
                }
                throw b1j.f(696515538, fetVar, z2);
            }
            fetVar.X();
            u12Var3 = u12Var2;
            a4dVar3 = a4dVar2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new krh(mm40Var, mm40Var2, o0xVar, m0xVar, j, u12Var3, a4dVar3, qgeVar, i, i2);
            }
        }
        i3 |= 1572864;
        a4dVar2 = a4dVar;
        if ((12582912 & i) != 0) {
            if (fetVar.g(qgeVar)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i7 != 0) {
                u12Var4 = gqw0.e;
            } else {
                u12Var4 = u12Var2;
            }
            if (i4 != 0) {
                a4dVar4 = null;
            } else {
                a4dVar4 = a4dVar2;
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40Var = (pz40) objP;
            Object objA4 = o0xVar.a();
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ca6(pz40Var, (byte) 17);
                fetVar.o0(objP2);
            }
            mz3VarX = l7x.X(objA4, (Function1) objP2, qgeVar, fetVar, ((i3 >> 12) & 7168) | 384, 18);
            lz3Var = (lz3) pz40Var.getValue();
            if (lz3Var != null) {
                if (!(lz3Var instanceof kz3)) {
                    fetVar.e0(117253793);
                    u12 u12Var8 = u12Var4;
                    j0x.b(mz3VarX, null, o2e.e0(mm40Var, "STATISTIC_PLAYER_IMAGE_TEST_TAG"), u12Var8, qgeVar, 0.0f, a4dVar4, fetVar, (i3 & 3670016) | ((i3 >> 6) & 7168) | 48 | ((i3 >> 9) & 57344), 32);
                    u12Var4 = u12Var8;
                    fetVar.r(false);
                } else {
                    if (lz3Var instanceof iz3) {
                        z2 = false;
                    }
                    fetVar.e0(117670681);
                    dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, mm40Var3, j, fetVar, ((i3 << 3) & 896) | 56 | ((i3 >> 3) & 7168), 0);
                    fetVar.r(false);
                }
                u12Var3 = u12Var4;
                a4dVar3 = a4dVar4;
            } else {
                z2 = false;
            }
            throw b1j.f(696515538, fetVar, z2);
        }
        fetVar.X();
        u12Var3 = u12Var2;
        a4dVar3 = a4dVar2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new krh(mm40Var, mm40Var2, o0xVar, m0xVar, j, u12Var3, a4dVar3, qgeVar, i, i2);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-613959617);
        int i2 = i | 6 | (fetVar2.g(null) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), yx7Var, fetVar2, 48);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -26364061, false);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.m(), fetVar2, (i2 >> 6) & 14, 24960, 109562);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 27);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-440337967);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 559407611, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                iem iemVar = (iem) next;
                StringBuilder sb = new StringBuilder();
                sb.append(iemVar);
                sb.append(i3);
                fetVar2.b0(-1132275316, sb.toString());
                mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                String string = StringsKt.v0(iemVar.f14640a).toString();
                String string2 = StringsKt.v0(iemVar.b).toString();
                zfn zfnVar = zaq0.b;
                smk0 smk0Var = new smk0(((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), g1t0.d().f42262a.b, null, null, null, g1t0.d().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                smk0 smk0Var2 = new smk0(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), g1t0.g().f42262a.b, null, null, null, g1t0.g().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                zcl zclVar2 = qmk.f28987a;
                fet fetVar3 = fetVar2;
                s5x0.a(s5x0.L(jm40.b, 0.0f, 10.0f, 1), string, string2, smk0Var, smk0Var2, fetVar3, 0);
                fetVar2 = fetVar3;
                fetVar2.r(false);
                i3 = i4;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 8);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1224088561);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "FUTURE_GAME_ITEM_TEAM_LOGO"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, ((i2 >> 3) & 14) | 36912, 0, 32736);
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "FUTURE_GAME_ITEM_TEAM_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 5);
        }
    }
}
