package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.text.format.DateFormat;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p8a implements uu9 {
    public static ExecutorService b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26544a = new Object();
    public static final ugd c = new ugd(-1325982537, false, new wgd(24));
    public static final ugd d = new ugd(395869383, false, new chd(15));
    public static final ugd e = new ugd(1035609003, false, new chd(22));
    public static final ugd f = new ugd(-1654047424, false, new chd(23));
    public static final ugd g = new ugd(389840169, false, new chd(24));
    public static final ugd h = new ugd(148142856, false, new chd(25));
    public static final ugd i = new ugd(-420645676, false, new chd(26));
    public static final ugd j = new ugd(-1665781606, false, new ohd(3));
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final Object l = new Object();

    public static final void A(mm40 mm40Var, o0x o0xVar, int i2, y3d y3dVar, long j2, Function0 function0, fet fetVar, int i3) {
        fet fetVar2;
        pm80 pm80VarF;
        fetVar.g0(-918991168);
        int i4 = i3 | (fetVar.g(o0xVar) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128) | (fetVar.g(y3dVar) ? 2048 : 1024) | (fetVar.f(j2) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536);
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.c(s5x0.N(mm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), null, null, false, null, function0, 28);
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
            if (i2 != 0) {
                fetVar.e0(-110703559);
                pm80VarF = a8k0.F(i2, (i4 >> 6) & 14, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(863192835);
                fetVar.r(false);
                pm80VarF = null;
            }
            boolean zG = fetVar.g(pm80VarF);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = pm80VarF != null ? ju70.T(pm80VarF, new m78(j2, 5), null, 10) : null;
                fetVar.o0(objP);
            }
            pm80 pm80Var = (pm80) objP;
            mm40 mm40VarN = o7k0.n(jm40.b, 32.0f);
            m78 m78Var = null;
            Object objA = o0xVar.a();
            pge pgeVar = gqw0.A;
            if (y3dVar != null) {
                m78Var = new m78(y3dVar.f41946a, 5);
            }
            k7x.b(objA, null, mm40VarN, pm80Var, pm80Var, null, null, null, null, null, pgeVar, m78Var, fetVar, 36912, 6, 27616);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o040(mm40Var, o0xVar, i2, y3dVar, j2, function0, i3);
        }
    }

    public static final void B(int i2, int i3, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        String str4;
        mm40 mm40Var2;
        ThemeColors themeColors;
        g1t0 g1t0Var;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-648127879);
        int i5 = i3 | 6 | (fetVar2.e(i2) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            ThemeColors themeColors2 = (ThemeColors) fetVar2.k(zaq0.b);
            g1t0 g1t0Var2 = (g1t0) fetVar2.k(j1t0.e);
            StaticColors staticColors = (StaticColors) fetVar2.k(m8m0.f21378a);
            boolean zF = ((i5 & 112) == 32) | fetVar2.f(themeColors2.getBackground());
            Object objP = fetVar2.P();
            if (zF || objP == ukd.f35823a) {
                themeColors = themeColors2;
                tnm tnmVar = tnm.f34243a;
                long jM132getYellow0d7_KjU = staticColors.m132getYellow0d7_KjU();
                long jM132getYellow0d7_KjU2 = staticColors.m132getYellow0d7_KjU();
                long background = themeColors.getBackground();
                zcl zclVar = qmk.f28987a;
                g1t0Var = g1t0Var2;
                i4 = 0;
                unm unmVar = new unm(tnmVar, jM132getYellow0d7_KjU, jM132getYellow0d7_KjU2, background, 6.0f, 360.0f, i2, 100, false, 768);
                fetVar2.o0(unmVar);
                objP = unmVar;
            } else {
                themeColors = themeColors2;
                g1t0Var = g1t0Var2;
                i4 = 0;
            }
            unm unmVar2 = (unm) objP;
            long backgroundContent = themeColors.getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, i4);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String strW = rsm0.w(R.string.bonus_wagering_process, i4, fetVar2);
            ThemeColors themeColors3 = themeColors;
            long secondary = themeColors3.getSecondary();
            g1t0Var.getClass();
            v8q0.a(strW, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            snm.b(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), unmVar2, fetVar2, 0);
            str3 = str;
            str4 = str2;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(2011772591, new zb8(str3, themeColors3, g1t0Var, str4), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str3 = str;
            str4 = str2;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, i2, str3, str4, i3);
        }
    }

    public static final void C(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        fetVar.g0(-24184168);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = f9z.a(fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            ngv ngvVar = new ngv(i4);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean zE = ((i3 & 112) == 32) | fetVar.e(i4) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new p4p(b2, i4, a4xVar2, function1);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            g8x.i(ngvVar, mm40VarE, d9zVarA, ch80VarG, null, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 944);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar2, function1, i2, (byte) 2);
        }
    }

    public static final void D(mm40 mm40Var, boolean z, String str, v7f0 v7f0Var, Function1 function1, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        ww00 ww00Var = v7f0Var.b;
        str.getClass();
        function1.getClass();
        function0.getClass();
        fetVar2.g0(-85899481);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(v7f0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarL = s5x0.L(mm40Var.e(o7k0.c), xfn.a(fetVar2).e, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 44.0f);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(mm40VarE, yx7Var, false, 2), "REGISTRATION_HEADER");
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarS = g1t0.s();
            zfn zfnVar2 = zaq0.b;
            byte b2 = 1;
            int i4 = i3;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarS, fetVar, (i3 >> 6) & 14, 24960, 110584);
            mm40 mm40VarN = s5x0.N(o7k0.d(new x7z(1.0f, true), 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new lrc0(z, v7f0Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40 mm40VarE2 = o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), 40.0f);
            thg0 thg0VarA = shg0.a(uc9.e, yx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
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
            String str2 = ww00Var.f39864a;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.n(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            qzb.n(null, ww00Var.b, function0, fetVar2, (i4 >> 9) & 896, 1);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, z, str, v7f0Var, function1, function0, i2);
        }
    }

    public static final void E(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1567482449);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 15);
        }
    }

    public static final void F(final mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, final Function1 function2, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        boolean z;
        fetVar.g0(239024690);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i3 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 256 : 128;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            final d4p d4pVar = (d4p) l7m0Var3.getValue();
            if (d4pVar != null) {
                boolean z2 = d4pVar instanceof c4p;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar.e0(-270865565);
                    wom womVarF = mom.f(fetVar);
                    boolean zBooleanValue = ((Boolean) l7m0Var4.getValue()).booleanValue();
                    boolean z3 = (i3 & 7168) == 2048;
                    Object objP = fetVar.P();
                    if (z3 || objP == cl5Var) {
                        objP = new s8o(function1, (byte) 27);
                        fetVar.o0(objP);
                    }
                    mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(523563701, new xdr() { // from class: a.n4p
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            byte b5 = b4;
                            Function1 function3 = function2;
                            d4p d4pVar2 = d4pVar;
                            mm40 mm40Var2 = mm40Var;
                            ir8 ir8Var = (ir8) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (b5) {
                                case 0:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p8a.v(0, fetVar2, ((z3p) d4pVar2).f43732a, mm40Var2, function3);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p8a.C(0, fetVar2, ((c4p) d4pVar2).f3736a, mm40Var2, function3);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
                    fetVar.r(false);
                } else if (d4pVar instanceof z3p) {
                    fetVar.e0(-270291538);
                    wom womVarF2 = mom.f(fetVar);
                    boolean zBooleanValue2 = ((Boolean) l7m0Var2.getValue()).booleanValue();
                    boolean z4 = (i3 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new s8o(function1, (byte) 23);
                        fetVar.o0(objP2);
                    }
                    mom.c(null, zBooleanValue2, womVarF2, null, false, null, (Function0) objP2, null, u1c.M(1597085022, new xdr() { // from class: a.n4p
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            byte b5 = b3;
                            Function1 function3 = function2;
                            d4p d4pVar2 = d4pVar;
                            mm40 mm40Var2 = mm40Var;
                            ir8 ir8Var = (ir8) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (b5) {
                                case 0:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p8a.v(0, fetVar2, ((z3p) d4pVar2).f43732a, mm40Var2, function3);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    ir8Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p8a.C(0, fetVar2, ((c4p) d4pVar2).f3736a, mm40Var2, function3);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
                    fetVar.r(false);
                } else {
                    z = false;
                    if (d4pVar instanceof a4p) {
                        fetVar.e0(-269731523);
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
                        mdm mdmVar = ((a4p) d4pVar).f235a;
                        boolean z5 = (i3 & 7168) == 2048;
                        Object objP3 = fetVar.P();
                        if (z5 || objP3 == cl5Var) {
                            objP3 = new s8o(function1, (byte) 24);
                            fetVar.o0(objP3);
                        }
                        jcb.l(null, mdmVar, false, (Function0) objP3, fetVar, 0, 5);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else if (d4pVar instanceof b4p) {
                        fetVar.e0(-269223898);
                        a4x a4xVar = ((b4p) d4pVar).f1970a;
                        Object objP4 = fetVar.P();
                        if (objP4 == cl5Var) {
                            objP4 = new e4p(b2);
                            fetVar.o0(objP4);
                        }
                        v((i3 & 14) | 384, fetVar, a4xVar, mm40Var, (Function1) objP4);
                        fetVar.r(false);
                    }
                }
            } else {
                z = false;
            }
            throw b1j.f(2069470538, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4p(mm40Var, l7m0Var, l7m0Var2, function1, function2, i2, (byte) 0);
        }
    }

    public static final void G(int i2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-444588695);
        int i3 = i2 | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            float f2 = xfn.a(fetVar2).e;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40Var, f2, 8.0f), 1.0f), 24.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "MENU_SESSION_TIMER");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i3 >> 3) & 14, 24960, 110586);
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
            yfe0VarU.d = new n040(mm40Var2, str2, i2, (byte) 0);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1007508048);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.g(mm40VarQ, 44.0f, 0.0f, 2), 8.0f, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            mm40 mm40VarU = o7k0.u(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0.0f, 136.0f, 1);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar2, (i3 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar2;
            x7z x7zVar = new x7z(1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
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
            str3 = str2;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(135558746, new g0(str3, (byte) 15), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str3 = str2;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str3, i2, (byte) 9);
        }
    }

    public static final void I(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(54439931);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
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
            imm immVarA = ((onp0) l7m0Var.getValue()).a();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 12);
                fetVar.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            onp0 onp0Var = (onp0) l7m0Var.getValue();
            if (onp0Var != null) {
                if (onp0Var instanceof nnp0) {
                    fetVar.e0(1586447759);
                    x(0, fetVar);
                    fetVar.r(false);
                } else if (onp0Var instanceof mnp0) {
                    fetVar.e0(1586540511);
                    s(((mnp0) onp0Var).b, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (onp0Var instanceof lnp0) {
                    fetVar.e0(1586681096);
                    m((lnp0) onp0Var, function1, fetVar, i4);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(1021004800, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 25);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: byte
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: byte
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: byte
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: byte
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void J(a.mm40 r33, a.bkl r34, a.fet r35, int r36) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p8a.J(a.mm40, a.bkl, a.fet, int):void");
    }

    public static final void K(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, d930 d930Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        d930Var.getClass();
        fetVar.g0(-2132911518);
        int i3 = i2 | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.g(d930Var) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288) | (fetVar.i(function2) ? 8388608 : 4194304);
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            mm40 mm40VarU = vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue());
            zcl zclVar = qmk.f28987a;
            b8k0.d(mm40VarU, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 16.0f, 0.0f, 28.0f, 5), fetVar), false, null, u1c.M(1613666276, new v1i0(qdzVar, function2, function1, d930Var, (byte) 4), fetVar), fetVar, ((i3 >> 6) & 112) | 100663680, 216);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0(l7m0Var, l7m0Var2, xczVar, qdzVar, d930Var, function1, function2, i2);
        }
    }

    public static final boolean L(x7m0 x7m0Var, int i2, j4 j4Var, boolean z) {
        boolean z2;
        synchronized (l) {
            try {
                int i3 = x7m0Var.d;
                if (i3 == i2) {
                    x7m0Var.c = j4Var;
                    z2 = true;
                    if (z) {
                        x7m0Var.e++;
                    }
                    x7m0Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final boolean P(tai0 tai0Var) {
        return !tai0Var.k().f23193a.c(xai0.j);
    }

    public static final gbn Q(Function1 function1) {
        return new gbn(new g20((byte) 7), new l9(3, (byte) 18), new y7(function1, (byte) 16), m9.t);
    }

    public static final String R(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (kotlin.text.c.x(str, "http", false)) {
                try {
                    String strSubstring = ((String) obj).substring(StringsKt.V((CharSequence) obj, "//", 0, false, 6) + 2);
                    return strSubstring.substring(StringsKt.V(strSubstring, Separators.SLASH, 0, false, 6));
                } catch (Exception unused) {
                    return str;
                }
            }
        }
        return String.valueOf(obj);
    }

    public static final boolean S(tai0 tai0Var) {
        Object objG = tai0Var.d.f23193a.g(xai0.L);
        if (objG == null) {
            objG = null;
        }
        evq0 evq0Var = (evq0) objG;
        hz40 hz40Var = tai0Var.d.f23193a;
        Object objG2 = hz40Var.g(xai0.z);
        if (objG2 == null) {
            objG2 = null;
        }
        ucg0 ucg0Var = (ucg0) objG2;
        boolean z = evq0Var != null;
        Object objG3 = hz40Var.g(xai0.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (ucg0Var != null && ucg0Var.f35427a == 4)) {
            return z;
        }
        return true;
    }

    public static final String T(tai0 tai0Var, Resources resources) {
        int iD;
        nai0 nai0Var = tai0Var.d;
        nai0 nai0Var2 = tai0Var.d;
        Object objG = nai0Var.f23193a.g(xai0.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        hz40 hz40Var = nai0Var2.f23193a;
        Object objG2 = hz40Var.g(xai0.L);
        if (objG2 == null) {
            objG2 = null;
        }
        evq0 evq0Var = (evq0) objG2;
        Object objG3 = hz40Var.g(xai0.z);
        if (objG3 == null) {
            objG3 = null;
        }
        ucg0 ucg0Var = (ucg0) objG3;
        if (evq0Var != null) {
            int iOrdinal = evq0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (ucg0Var != null && ucg0Var.f35427a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (ucg0Var != null && ucg0Var.f35427a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = hz40Var.g(xai0.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((ucg0Var == null || ucg0Var.f35427a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = hz40Var.g(xai0.c);
        if (objG5 == null) {
            objG5 = null;
        }
        g3c0 g3c0Var = (g3c0) objG5;
        if (g3c0Var != null) {
            if (g3c0Var != g3c0.c) {
                if (objG == null) {
                    cvc cvcVar = g3c0Var.b;
                    float f2 = cvcVar.b;
                    float f3 = cvcVar.f5023a;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (g3c0Var.f10603a - f3) / (cvcVar.b - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    if (f4 == 0.0f) {
                        iD = 0;
                    } else {
                        iD = f4 == 1.0f ? 100 : l1e0.d(Math.round(f4 * 100.0f), 1, 99);
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(iD));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        zai0 zai0Var = xai0.G;
        if (hz40Var.c(zai0Var)) {
            hz40 hz40Var2 = new tai0(tai0Var.f33613a, true, tai0Var.c, nai0Var2).k().f23193a;
            Object objG6 = hz40Var2.g(xai0.f40557a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = hz40Var2.g(xai0.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = hz40Var2.g(zai0Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final j83 U(tai0 tai0Var) {
        Object objG = tai0Var.d.f23193a.g(xai0.G);
        if (objG == null) {
            objG = null;
        }
        j83 j83Var = (j83) objG;
        Object objG2 = tai0Var.d.f23193a.g(xai0.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return j83Var == null ? list != null ? (j83) CollectionsKt.firstOrNull(list) : null : j83Var;
    }

    public static final x7m0 V(SnapshotStateList snapshotStateList) {
        x7m0 x7m0Var = snapshotStateList.f45348a;
        x7m0Var.getClass();
        return (x7m0) xfk0.s(x7m0Var, snapshotStateList);
    }

    public static final int W(SnapshotStateList snapshotStateList) {
        x7m0 x7m0Var = snapshotStateList.f45348a;
        x7m0Var.getClass();
        return ((x7m0) xfk0.f(x7m0Var)).e;
    }

    public static final long X(long j2, long j3) {
        return (((long) Float.floatToRawIntBits((((int) (j2 >> 32)) - ((int) (j3 >> 32))) / 2)) << 32) | (((long) Float.floatToRawIntBits(((int) (j2 & 4294967295L)) * 0.4f)) & 4294967295L);
    }

    public static final boolean Y(tai0 tai0Var, Resources resources) {
        if (phu0.R(tai0Var)) {
            return false;
        }
        nai0 nai0Var = tai0Var.d;
        if (nai0Var.c) {
            return true;
        }
        Object objG = nai0Var.f23193a.g(xai0.f40557a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) CollectionsKt.firstOrNull(list) : null) == null && U(tai0Var) == null && T(tai0Var, resources) == null && !S(tai0Var)) && Z(tai0Var);
    }

    public static final boolean Z(tai0 tai0Var) {
        if (!tai0Var.n()) {
            List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (g1x.x((tai0) listI.get(i2))) {
                }
            }
            e7z e7zVarV = tai0Var.c.v();
            while (true) {
                if (e7zVarV == null) {
                    e7zVarV = null;
                    break;
                }
                nai0 nai0VarX = e7zVarV.x();
                if (nai0VarX != null && nai0VarX.c) {
                    break;
                }
                e7zVarV = e7zVarV.v();
            }
            return !(e7zVarV != null);
        }
        return false;
    }

    public static final void a(mm40 mm40Var, bol bolVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(272928803);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bolVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d9z d9zVarA = f9z.a(fetVar);
            int i4 = i3 & 896;
            boolean zG = fetVar.g(d9zVarA) | (i4 == 256);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new pd0(d9zVarA, function1, null, b2);
                fetVar.o0(objP);
            }
            m0x0.v(d9zVarA, function1, (Function2) objP, fetVar);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 32.0f, fetVar);
            b2 = i4 == 256 ? (byte) 1 : (byte) 0;
            Object objP2 = fetVar.P();
            if (b2 != 0 || objP2 == obj) {
                objP2 = new y7(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            wvb.k(mm40Var, bolVar, d9zVarA, ch80VarF, (Function1) objP2, null, fetVar, i3 & 126, 32);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, bolVar, function1, i2, (byte) 14);
        }
    }

    public static final boolean a0(SnapshotStateList snapshotStateList, Function1 function1) {
        int i2;
        j4 j4Var;
        Object objInvoke;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (l) {
                x7m0 x7m0Var = snapshotStateList.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i2 = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            ii90 ii90VarH = j4Var.h();
            objInvoke = function1.invoke(ii90VarH);
            j4 j4VarF = ii90VarH.f();
            if (Intrinsics.d(j4VarF, j4Var)) {
                break;
            }
            x7m0 x7m0Var3 = snapshotStateList.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = L((x7m0) xfk0.w(x7m0Var3, snapshotStateList, rfk0VarH), i2, j4VarF, true);
            }
            xfk0.l(rfk0VarH, snapshotStateList);
        } while (!zL);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void b(mm40 mm40Var, col colVar, fet fetVar, int i2) {
        fetVar.g0(-664085962);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(colVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            wvb.k(mm40Var, colVar, null, h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 32.0f, fetVar), null, null, fetVar, i3 & 126, 52);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var, colVar, i2, (byte) 21);
        }
    }

    public static final void c(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-152240530);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = ufx.E(fetVar, mm40Var.e(o7k0.c));
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
                objP = new dn(function1, (byte) 13);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i2, (byte) 0);
        }
    }

    public static final void d(mm40 mm40Var, a4x a4xVar, a4d a4dVar, gfm0 gfm0Var, gfm0 gfm0Var2, qge qgeVar, fet fetVar, int i2) {
        fet fetVar2;
        pz40 pz40Var;
        mz3 mz3Var;
        boolean z;
        a4xVar.getClass();
        fetVar.g0(263747541);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(a4dVar) ? 256 : 128) | (fetVar.g(gfm0Var) ? 2048 : 1024) | (fetVar.g(gfm0Var2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            ArrayList arrayList = new ArrayList(a4xVar.size());
            int size = a4xVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = a4xVar.get(i4);
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            boolean zG = fetVar.g(arrayList);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            m1e m1eVarP = feb.P(fetVar);
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = arrayList.get(cgk0Var.l());
            q1x.a(k1xVar);
            k1xVar.i = R(arrayList.get(cgk0Var.l()));
            k1xVar.f = R(arrayList.get(cgk0Var.l()));
            vi9 vi9Var = vi9.c;
            k1xVar.m = vi9Var;
            k1xVar.n = vi9Var;
            k1xVar.e = new c5k(arrayList, cgk0Var);
            fetVar2 = fetVar;
            mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar2, 0, 30);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            pz40 pz40VarE = ydx.E(m1eVarP.b(), Boolean.valueOf(m1eVarP.c()), null, fetVar2, 0, 2);
            pz40 pz40VarF = ydx.F(mz3VarX.u, fetVar2);
            Boolean bool = (Boolean) pz40VarE.getValue();
            bool.booleanValue();
            boolean zG2 = fetVar2.g(pz40VarF) | fetVar2.g(pz40VarE) | fetVar2.g(mz3VarX);
            Object objP3 = fetVar2.P();
            if (zG2 || objP3 == cl5Var) {
                pz40Var = pz40VarF;
                mz3Var = mz3VarX;
                objP3 = new rz3(mz3Var, pz40Var, pz40Var2, pz40VarE, null, (byte) 1);
                fetVar2.o0(objP3);
            } else {
                pz40Var = pz40VarF;
                mz3Var = mz3VarX;
            }
            m0x0.t(fetVar2, bool, (Function2) objP3);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (Intrinsics.d(lz3Var, hz3.f13888a) || (lz3Var instanceof jz3)) {
                fetVar2.e0(1809665085);
                if (gfm0Var == null) {
                    fetVar2.e0(1809665084);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1809665085);
                    j0x.b(gfm0Var.f11214a, null, mm40Var, null, qgeVar, 0.0f, gfm0Var.b, fetVar, ((i3 << 6) & 896) | 24632, 40);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else if (lz3Var instanceof iz3) {
                fetVar2.e0(1810080175);
                if (gfm0Var2 == null) {
                    fetVar2.e0(1810080174);
                    fetVar2.r(false);
                    z = false;
                } else {
                    fetVar2.e0(1810080175);
                    z = false;
                    j0x.b(gfm0Var2.f11214a, null, mm40Var, null, qgeVar, 0.0f, gfm0Var2.b, fetVar, ((i3 << 6) & 896) | 24632, 40);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(z);
            } else {
                if (!(lz3Var instanceof kz3)) {
                    throw b1j.f(58372849, fetVar2, false);
                }
                fetVar2.e0(1810449943);
                j0x.b(mz3Var, null, mm40Var, null, qgeVar, 0.0f, a4dVar, fetVar, ((i3 << 6) & 896) | 24624 | ((i3 << 12) & 3670016), 40);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, a4xVar, a4dVar, gfm0Var, gfm0Var2, qgeVar, i2, (byte) 2);
        }
    }

    public static final mtl d0(gu1 gu1Var, s9s0 s9s0Var, boolean z, ctf0 ctf0Var) {
        String strA;
        rk rkVar;
        gu1 gu1Var2 = gu1Var;
        ctf0Var.getClass();
        if (gu1Var2 != null) {
            gqt0 gqt0Var = gu1Var2.n;
            re9 re9Var = gu1Var2.p;
            boolean z2 = s9s0Var == s9s0.b && (gqt0Var == gqt0.f || gqt0Var == gqt0.g);
            if (re9Var == re9.c || z2) {
                gu1Var2 = null;
            }
            if (gu1Var2 != null) {
                iul iulVar = iul.e;
                oe9 oe9Var = oe9.f25112a;
                lf9 lf9Var = gu1Var2.o;
                switch (gu1Var2.n.ordinal()) {
                    case 0:
                        strA = lf9Var.b;
                        break;
                    case 1:
                        strA = lf9Var.e;
                        break;
                    case 2:
                        strA = lf9Var.c;
                        break;
                    case 3:
                        strA = lf9Var.f19942a;
                        break;
                    case 4:
                        strA = lf9Var.f;
                        break;
                    case 5:
                        strA = ctf0Var.b.a(R.string.casino_tournaments_games_title, Arrays.copyOf(new Object[0], 0));
                        break;
                    case 6:
                        strA = ctf0Var.b.a(R.string.tournaments_play_button, Arrays.copyOf(new Object[0], 0));
                        break;
                    case 7:
                        strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                wul wulVar = new wul(iulVar, oe9Var, new ue9(strA), true, z, true);
                int iOrdinal = s9s0Var.ordinal();
                if (iOrdinal == 0) {
                    rkVar = rk.e;
                } else if (iOrdinal == 1) {
                    rkVar = rk.f;
                } else if (iOrdinal == 2) {
                    rkVar = rk.g;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    rkVar = rk.d;
                }
                return new mtl(dyb.g0(new itl(wulVar, rkVar)));
            }
        }
        return null;
    }

    public static final void e(mm40 mm40Var, Object obj, gfm0 gfm0Var, gfm0 gfm0Var2, qge qgeVar, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2;
        pz40 pz40Var;
        mz3 mz3Var;
        fetVar.g0(-1947531223);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(obj) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= fetVar.g(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(gfm0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.g(gfm0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar.g(qgeVar) ? 131072 : 65536;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            m1e m1eVarP = feb.P(fetVar);
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = obj;
            q1x.a(k1xVar);
            k1xVar.i = R(obj);
            k1xVar.f = R(obj);
            vi9 vi9Var = vi9.c;
            k1xVar.m = vi9Var;
            k1xVar.n = vi9Var;
            fetVar2 = fetVar;
            mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar2, 0, 30);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            pz40 pz40VarE = ydx.E(m1eVarP.b(), Boolean.valueOf(m1eVarP.c()), null, fetVar2, 0, 2);
            pz40 pz40VarF = ydx.F(mz3VarX.u, fetVar2);
            Boolean bool = (Boolean) pz40VarE.getValue();
            bool.booleanValue();
            boolean zG = fetVar2.g(pz40VarF) | fetVar2.g(pz40VarE) | fetVar2.g(mz3VarX);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                pz40Var = pz40VarF;
                mz3Var = mz3VarX;
                objP2 = new rz3(mz3Var, pz40Var, pz40Var2, pz40VarE, null, (byte) 0);
                fetVar2.o0(objP2);
            } else {
                pz40Var = pz40VarF;
                mz3Var = mz3VarX;
            }
            m0x0.t(fetVar2, bool, (Function2) objP2);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (Intrinsics.d(lz3Var, hz3.f13888a) || (lz3Var instanceof jz3)) {
                fetVar2.e0(1811867049);
                if (gfm0Var == null) {
                    fetVar2.e0(1811867048);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1811867049);
                    j0x.b(gfm0Var.f11214a, null, mm40Var, null, qgeVar, 0.0f, gfm0Var.b, fetVar, ((i5 << 6) & 896) | 56 | ((i5 >> 3) & 57344), 40);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else if (lz3Var instanceof iz3) {
                fetVar2.e0(1812282139);
                if (gfm0Var2 == null) {
                    fetVar2.e0(1812282138);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1812282139);
                    j0x.b(gfm0Var2.f11214a, null, mm40Var2, null, qgeVar, 0.0f, gfm0Var2.b, fetVar, ((i5 << 6) & 896) | 56 | ((i5 >> 3) & 57344), 40);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                if (!(lz3Var instanceof kz3)) {
                    throw b1j.f(1028275205, fetVar2, false);
                }
                fetVar2.e0(1812651907);
                j0x.b(mz3Var, null, mm40Var, null, qgeVar, 0.0f, null, fetVar, ((i5 << 6) & 896) | 48 | ((i5 >> 3) & 57344) | ((i5 << 12) & 3670016), 40);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var, obj, (Object) gfm0Var, (Object) gfm0Var2, (Object) qgeVar, i2, i3, (byte) 2);
        }
    }

    public static final ef6 e0(xm5 xm5Var, ctf0 ctf0Var, double d2, ko7 ko7Var, boolean z) {
        v30 g30Var;
        ctf0Var.getClass();
        ql5 ql5Var = xm5Var.c;
        double d3 = ql5Var.b;
        String str = ql5Var.f;
        String strA = ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        h40 h40Var = xm5Var.d;
        f40 f40Var = h40Var.b;
        double d4 = h40Var.f12411a;
        if (f40Var == f40.f8887a || !(ko7Var instanceof jo7)) {
            g30Var = new g30();
        } else if (z) {
            g30Var = new d30(strA);
        } else if (f40Var == f40.b) {
            g30Var = new j30(strA);
        } else if (f40Var == f40.c) {
            str.getClass();
            if (d4 == -1.0d) {
                g30Var = new a30(strA);
            } else {
                int i2 = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                g30Var = new s30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
            }
        } else if (f40Var == f40.d) {
            int i3 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            g30Var = new p30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
        } else if (f40Var == f40.f) {
            int i4 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            g30Var = new m30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
        } else {
            g30Var = f40Var == f40.e ? new d30(strA) : new g30();
        }
        pn40 pn40Var4 = pn40.f27267a;
        return new ef6(g30Var, new rw7(pn40.c(d3, p3u0.c), str, (d3 == 0.0d || d2 > d3) && ql5Var.f28916a != 0 && ctf0Var.i(), false));
    }

    /* JADX WARN: Code duplicated, block: B:89:0x012e  */
    public static final m97 f0(oq7 oq7Var, boolean z) {
        BetPlayerZip betPlayerZip;
        String strF;
        zfa0 xfa0Var;
        oq7Var.getClass();
        wh7 wh7Var = oq7Var.i;
        String str = oq7Var.g;
        if (wh7Var != null) {
            Long l2 = wh7Var.f39152a;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            String str2 = wh7Var.b;
            if (str2 == null) {
                str2 = "";
            }
            betPlayerZip = new BetPlayerZip(jLongValue, str2);
        } else {
            betPlayerZip = new BetPlayerZip(0L, "");
        }
        Long l3 = oq7Var.n;
        long jLongValue2 = l3 != null ? l3.longValue() : -1L;
        tqt tqtVar = uoy.b;
        Integer num = oq7Var.m;
        int iIntValue = num != null ? num.intValue() : 3;
        tqtVar.getClass();
        byte b2 = tqt.j(iIntValue).f36034a;
        izc izcVar = izc.d;
        boolean zD = Intrinsics.d(oq7Var.f, Boolean.TRUE);
        Integer num2 = oq7Var.o;
        boolean z2 = num2 != null && num2.intValue() == 1;
        long j2 = betPlayerZip.f46425a;
        Long lValueOf = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf = null;
        }
        long jLongValue3 = (lValueOf == null && (lValueOf = oq7Var.p) == null) ? 0L : lValueOf.longValue();
        long j3 = oq7Var.f25674a;
        Long l4 = oq7Var.c;
        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
        double d2 = oq7Var.d;
        double d3 = oq7Var.b;
        String str3 = str == null ? "" : str;
        if (Intrinsics.d(str, "SP")) {
            strF = "SP";
        } else if (z || str == null || str.length() <= 0) {
            pn40 pn40Var = pn40.f27267a;
            strF = pn40.f(oq7Var.b);
        } else {
            strF = str;
        }
        String str4 = oq7Var.h;
        String str5 = str4 == null ? "" : str4;
        boolean zD2 = Intrinsics.d(str, "SP");
        Boolean bool = oq7Var.q;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l5 = oq7Var.r;
        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
        Boolean bool2 = oq7Var.t;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        kga0 kga0Var = oq7Var.u;
        if (kga0Var != null) {
            List list = kga0Var.f18229a;
            List list2 = kga0Var.b;
            xfa0Var = (list == null || !(list.isEmpty() ^ true) || list2 == null || !(list2.isEmpty() ^ true)) ? yfa0.INSTANCE : new xfa0(list, list2);
            if (xfa0Var == null) {
                xfa0Var = yfa0.INSTANCE;
            }
        } else {
            xfa0Var = yfa0.INSTANCE;
        }
        zfa0 zfa0Var = xfa0Var;
        Boolean bool3 = oq7Var.s;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Double d4 = oq7Var.w;
        double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
        String str6 = oq7Var.x;
        return new m97(jLongValue2, (int) b2, izcVar, zD, z2, jLongValue3, betPlayerZip.b, j3, jLongValue4, d2, d2, d3, str3, strF, str5, (String) null, zD2, false, zBooleanValue, jLongValue5, zBooleanValue2, zfa0Var, zBooleanValue3, dDoubleValue, str6 == null ? r3 : str6, 1212416);
    }

    public static final void g(mm40 mm40Var, String str, String str2, long j2, long j3, fet fetVar, int i2) {
        str2.getClass();
        fetVar.g0(-1098142089);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j2) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i3 |= fetVar.f(j3) ? 131072 : 65536;
        }
        int i4 = i3 | (fetVar.d(24.0f) ? 1048576 : 524288);
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(new daq0(j3));
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1735822537, new d15(mm40Var, j2, j3, str, str2, (pz40) objP, (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e15(mm40Var, str, str2, j2, j3, i2, (byte) 1);
        }
    }

    public static final m97 g0(BetZip betZip, boolean z, long j2) {
        zfa0 xfa0Var;
        long j3 = betZip.m;
        byte b2 = betZip.l.f36034a;
        boolean z2 = betZip.f;
        boolean z3 = betZip.B;
        long j4 = betZip.o;
        String str = betZip.A;
        long j5 = betZip.f46426a;
        long j6 = betZip.c;
        double d2 = betZip.d;
        double d3 = betZip.b;
        String str2 = betZip.g;
        String strM = ju70.M(betZip, z);
        String str3 = betZip.h;
        if (StringsKt.W(str3)) {
            str3 = betZip.t;
        }
        String str4 = str3;
        String str5 = betZip.u;
        boolean z4 = betZip.x;
        boolean z5 = betZip.w;
        boolean z6 = betZip.p;
        boolean z7 = betZip.r;
        PlayersDuelZip playersDuelZip = betZip.s;
        playersDuelZip.getClass();
        iun iunVar = iun.f15405a;
        if (playersDuelZip.equals(new PlayersDuelZip(iunVar, iunVar))) {
            xfa0Var = yfa0.INSTANCE;
        } else {
            List list = playersDuelZip.f46428a;
            if (list == null) {
                list = iunVar;
            }
            List list2 = playersDuelZip.b;
            if (list2 == null) {
                list2 = iunVar;
            }
            xfa0Var = new xfa0(list, list2);
        }
        return new m97(j3, b2, (izc) null, z2, z3, j4, str, j5, j6, d2, d2, d3, str2, strM, str4, str5, z4, z5, z6, j2, betZip.Y, xfa0Var, z7, 0.0d, (String) null, 51380228);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0261  */
    /* JADX WARN: Code duplicated, block: B:59:0x0263  */
    /* JADX WARN: Code duplicated, block: B:63:0x026c  */
    /* JADX WARN: Code duplicated, block: B:69:0x027a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(mm40 mm40Var, final sl8 sl8Var, final Function1 function1, final Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        cl5 cl5Var;
        boolean z2;
        boolean z3;
        Object objP;
        boolean z4;
        fet fetVar2 = fetVar;
        sl8Var.getClass();
        String str = sl8Var.b;
        long j2 = sl8Var.d;
        function1.getClass();
        function2.getClass();
        fetVar2.g0(453739761);
        int i3 = i2 | 6 | (fetVar2.i(sl8Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar2.k(dy2.b);
            ThemeColors themeColors = (ThemeColors) fetVar2.k(zaq0.b);
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            String str2 = sl8Var.c;
            boolean zF = fetVar2.f(j2) | fetVar2.g(str2) | fetVar2.h(zIs24HourFormat);
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zF || objP2 == cl5Var2) {
                rdj rdjVar = rdj.f30294a;
                objP2 = String.format(str2, Arrays.copyOf(new Object[]{rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56)}, 1));
                fetVar2.o0(objP2);
            }
            String str3 = (String) objP2;
            boolean zF2 = fetVar2.f(themeColors.getBackground()) | fetVar2.g(str) | fetVar2.g(str3) | fetVar2.f(themeColors.getPrimary());
            Object objP3 = fetVar2.P();
            if (zF2 || objP3 == cl5Var2) {
                z = false;
                objP3 = new rqm((vui0) new uui0(str, null, str3, null, null, 58), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_gift), new y3d(themeColors.getBackground()), new m0x(R.drawable.ic_glyph_gift, null, 6), new y3d(themeColors.getPrimary()), null, null, 0.0f, 240), (pvi0) null, (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 444);
                fetVar2.o0(objP3);
            } else {
                z = false;
            }
            rqm rqmVar = (rqm) objP3;
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0VarA);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, z ? 1 : 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            obc.q(null, rqmVar, false, null, null, null, null, null, fetVar, 0, 253);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            H(z ? 1 : 0, fetVar, null, sl8Var.e, sl8Var.f);
            mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 8.0f, 0.0f, 2), false, fetVar, 6, 4);
            fetVar.r(true);
            B(sl8Var.i, 0, fetVar, null, sl8Var.g, sl8Var.h);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rl8 rl8Var = sl8Var.j;
            int i4 = i3 & 112;
            boolean z6 = ((i3 & 896) == 256 ? (char) 1 : z ? 1 : 0) | ((i4 == 32 || fetVar.i(sl8Var)) ? (char) 1 : z ? 1 : 0);
            Object objP4 = fetVar.P();
            if (z6 == 0) {
                cl5Var = cl5Var2;
                if (objP4 == cl5Var) {
                }
                Function0 function0 = (Function0) objP4;
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = z ? 1 : 0;
                }
                if (i4 != 32 || fetVar.i(sl8Var)) {
                    z = true;
                }
                z3 = z2 | z;
                objP = fetVar.P();
                if (z3 == 0 || objP == cl5Var) {
                    z4 = true;
                    final char c2 = 1 == true ? 1 : 0;
                    objP = new Function0() { // from class: a.md8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = c2;
                            sl8 sl8Var2 = sl8Var;
                            Function1 function3 = function2;
                            switch (b2) {
                                case 0:
                                    function3.invoke(Integer.valueOf(sl8Var2.f32386a));
                                    break;
                                default:
                                    function3.invoke(Integer.valueOf(sl8Var2.f32386a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                } else {
                    z4 = true;
                }
                j(mm40VarD, rl8Var, function0, (Function0) objP, fetVar, 6);
                fetVar2 = fetVar;
                fetVar2.r(z4);
                mm40Var2 = jm40Var;
            } else {
                cl5Var = cl5Var2;
            }
            final byte b2 = z ? (byte) 1 : (byte) 0;
            objP4 = new Function0() { // from class: a.md8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    sl8 sl8Var2 = sl8Var;
                    Function1 function3 = function1;
                    switch (b3) {
                        case 0:
                            function3.invoke(Integer.valueOf(sl8Var2.f32386a));
                            break;
                        default:
                            function3.invoke(Integer.valueOf(sl8Var2.f32386a));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP4);
            Function0 function3 = (Function0) objP4;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = z ? 1 : 0;
            }
            if (i4 != 32) {
                z = true;
            } else {
                z = true;
            }
            z3 = z2 | z;
            objP = fetVar.P();
            if (z3 == 0) {
                z4 = true;
                final byte c3 = 1 == true ? 1 : 0;
                objP = new Function0() { // from class: a.md8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = c3;
                        sl8 sl8Var2 = sl8Var;
                        Function1 function4 = function2;
                        switch (b3) {
                            case 0:
                                function4.invoke(Integer.valueOf(sl8Var2.f32386a));
                                break;
                            default:
                                function4.invoke(Integer.valueOf(sl8Var2.f32386a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            } else {
                z4 = true;
                final byte c4 = 1 == true ? 1 : 0;
                objP = new Function0() { // from class: a.md8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = c4;
                        sl8 sl8Var2 = sl8Var;
                        Function1 function4 = function2;
                        switch (b3) {
                            case 0:
                                function4.invoke(Integer.valueOf(sl8Var2.f32386a));
                                break;
                            default:
                                function4.invoke(Integer.valueOf(sl8Var2.f32386a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            j(mm40VarD, rl8Var, function3, (Function0) objP, fetVar, 6);
            fetVar2 = fetVar;
            fetVar2.r(z4);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 27, i2, mm40Var2, sl8Var, function1, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    public static final lla h0(x1w x1wVar, v5l0 v5l0Var, ctf0 ctf0Var, List list, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        tla plaVar;
        dem demVar;
        lla glaVar;
        ?? r10;
        fma bmaVar;
        x1wVar.getClass();
        List list2 = x1wVar.m;
        boolean z6 = x1wVar.s;
        a2w a2wVar = x1wVar.n;
        a2w a2wVar2 = x1wVar.o;
        boolean z7 = x1wVar.t;
        String str3 = x1wVar.r;
        String str4 = x1wVar.q;
        v5l0Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            tma tmaVar = new tma(o2e.j0(x1wVar, list, z2, z3, str2, z5), null, 14);
            if (z7) {
                plaVar = new sla(new w1n(a2wVar.f144a, g7w.d(a2wVar), g7w.c(a2wVar)), new w1n(a2wVar2.f144a, g7w.d(a2wVar2), g7w.c(a2wVar2)), new t1n(str4, str3), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null);
            } else {
                plaVar = new pla(g7w.a(a2wVar, false), g7w.a(a2wVar2, false), new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(str4, str3, false, false, new hpm(0L, 3))), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null);
            }
            if (!z6 || (cy7.c() && z4)) {
                demVar = null;
            } else {
                demVar = new dem(x1wVar.f40139a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), cfx0.N(list2), z);
            }
            glaVar = new gla(tmaVar, plaVar, demVar, x1wVar.f40139a);
        } else if (iOrdinal != 1) {
            int i2 = 2;
            if (iOrdinal == 2) {
                wma wmaVar = new wma(o2e.j0(x1wVar, list, z2, z3, str2, z5), null, dj8.X(x1wVar, z, z4), 6);
                String str5 = a2wVar2.f144a;
                String str6 = a2wVar.f144a;
                glaVar = new jla(wmaVar, z7 ? new kma(new wzm(str6, null, str4), new wzm(str5, null, str3), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null) : new hma(new wzm(str6, null, str4), new wzm(str5, null, str3), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null), ny9.c0(x1wVar, z, z4), x1wVar.f40139a);
            } else if (iOrdinal == 3) {
                vma vmaVar = new vma(o2e.j0(x1wVar, list, z2, z3, str2, z5), new b4i(q8a.e0(x1wVar, ctf0Var), i2), dj8.X(x1wVar, z, z4));
                if (z7) {
                    r10 = 0;
                    bmaVar = new ema(g7w.e(a2wVar, true), g7w.e(a2wVar2, true), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3), new jwm(q8a.f0(x1wVar, z4)), null);
                } else {
                    r10 = 0;
                    bmaVar = new bma(g7w.e(a2wVar, false), g7w.e(a2wVar2, false), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3), new jwm(q8a.f0(x1wVar, z4)), null);
                }
                gem gemVar = (z6 && z && (!cy7.c() || !z4)) ? new gem(cfx0.N(list2)) : null;
                long j2 = x1wVar.f40139a;
                StringBuilder sb = new StringBuilder(ujn.h);
                if (str.length() == 0) {
                    sb.setLength(r10);
                } else if (StringsKt.O(str, ujn.h, r10) || kotlin.text.c.x(str, "https://", r10)) {
                    sb.setLength(r10);
                    sb.append(str);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    char[] cArr = new char[1];
                    cArr[r10] = '/';
                    sb.append(StringsKt.y0(str, cArr));
                }
                glaVar = new ila(j2, gemVar, vmaVar, bmaVar, new n0x(sb.toString()));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                glaVar = new hla(new uma(o2e.j0(x1wVar, list, z2, z3, str2, z5), null, dj8.X(x1wVar, z, z4), 6), z7 ? new yla(g7w.e(a2wVar, true), g7w.e(a2wVar2, true), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null) : new vla(g7w.e(a2wVar, false), g7w.e(a2wVar2, false), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null), ny9.c0(x1wVar, z, z4), x1wVar.f40139a);
            }
        } else {
            glaVar = new kla(new xma(o2e.j0(x1wVar, list, z2, z3, str2, z5), null, dj8.X(x1wVar, z, z4), 6), z7 ? new qma(g7w.b(a2wVar, str4), g7w.b(a2wVar2, str3), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null) : new nma(g7w.b(a2wVar, str4), g7w.b(a2wVar2, str3), new jwm(q8a.e0(x1wVar, ctf0Var)), new jwm(q8a.f0(x1wVar, z4)), null), (z6 && z && (!cy7.c() || !z4)) ? new eem(cfx0.N(list2)) : null, x1wVar.f40139a);
        }
        return glaVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    public static final void i(mm40 mm40Var, sa9 sa9Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        cl5 cl5Var;
        boolean z;
        Object objP;
        boolean zF;
        Object objP2;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-357655607);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(sa9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            boolean zF2 = fetVar2.f(backgroundContent);
            Object objP3 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zF2 || objP3 == cl5Var2) {
                objP3 = new bx((byte) 18, backgroundContent);
                fetVar2.o0(objP3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(rq8.K(jm40Var, (Function1) objP3), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, qmk.a(fetVar2).d, 8.0f);
            a4x a4xVar = sa9Var.b;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z2 || objP4 == cl5Var2) {
                objP4 = new vb8((Object) sa9Var, (byte) 22);
                fetVar2.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            int i5 = i3 & 896;
            boolean z3 = i5 == 256;
            Object objP5 = fetVar2.P();
            if (z3 || objP5 == cl5Var2) {
                objP5 = new xz8(function1, (byte) 6);
                fetVar2.o0(objP5);
            }
            ibc.o(mm40VarK, a4xVar, null, false, function0, (Function1) objP5, fetVar2, 3072, 4);
            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
            lh80 lh80VarU = s5x0.u(qmk.a(fetVar2).d, 0.0f, qmk.a(fetVar2).d, 24.0f, 2);
            boolean z4 = (i5 == 256) | (i4 == 32);
            Object objP6 = fetVar2.P();
            byte b2 = 19;
            if (z4) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP6 == cl5Var) {
                }
                cl5 cl5Var3 = cl5Var;
                b8k0.e(mm40VarD2, null, lh80VarU, null, null, null, false, null, (Function1) objP6, fetVar, 0, 506);
                fetVar2 = fetVar;
                mm40 mm40VarD3 = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 56.0f, 7), 1.0f);
                mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.next, 0, fetVar2)), sa9Var.e, false, false), rk.n)));
                if (i5 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == cl5Var3) {
                    objP = new xz8(function1, (byte) 7);
                    fetVar2.o0(objP);
                }
                bkb.f(mm40VarD3, mtlVar, null, false, null, (Function1) objP, fetVar2, 0, 28);
                mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                zF = fetVar2.f(backgroundContent);
                objP2 = fetVar2.P();
                if (zF || objP2 == cl5Var3) {
                    objP2 = new bx((byte) 19, backgroundContent);
                    fetVar2.o0(objP2);
                }
                zq8.a(0, fetVar2, o7k0.e(rq8.K(mm40VarD4, (Function1) objP2), 12.0f));
                fetVar2.r(true);
            }
            objP6 = new op7(sa9Var, function1, b2);
            fetVar2.o0(objP6);
            cl5 cl5Var4 = cl5Var;
            b8k0.e(mm40VarD2, null, lh80VarU, null, null, null, false, null, (Function1) objP6, fetVar, 0, 506);
            fetVar2 = fetVar;
            mm40 mm40VarD5 = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 56.0f, 7), 1.0f);
            mtl mtlVar2 = new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.next, 0, fetVar2)), sa9Var.e, false, false), rk.n)));
            if (i5 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                objP = new xz8(function1, (byte) 7);
                fetVar2.o0(objP);
            } else {
                objP = new xz8(function1, (byte) 7);
                fetVar2.o0(objP);
            }
            bkb.f(mm40VarD5, mtlVar2, null, false, null, (Function1) objP, fetVar2, 0, 28);
            mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
            zF = fetVar2.f(backgroundContent);
            objP2 = fetVar2.P();
            if (zF) {
                objP2 = new bx((byte) 19, backgroundContent);
                fetVar2.o0(objP2);
            } else {
                objP2 = new bx((byte) 19, backgroundContent);
                fetVar2.o0(objP2);
            }
            zq8.a(0, fetVar2, o7k0.e(rq8.K(mm40VarD6, (Function1) objP2), 12.0f));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 15, i2, (Object) mm40Var, (Object) sa9Var, function1);
        }
    }

    public static final void i0(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            v4i0.m(ohs0.m("index (", i2, ") is out of bound of [0, ", Separators.RPAREN, i3));
        }
    }

    public static final void j(mm40 mm40Var, rl8 rl8Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        String strW;
        fetVar.g0(391543493);
        int i3 = i2 | (fetVar.g(rl8Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            ThemeColors themeColors = (ThemeColors) fetVar.k(zaq0.b);
            boolean z = rl8Var instanceof ol8;
            if (z) {
                fetVar.e0(-658741425);
                strW = rsm0.w(R.string.withdraw, 0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-658689407);
                strW = rsm0.w(R.string.refusal_to_participate, 0, fetVar);
                fetVar.r(false);
            }
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = z ? function1 : function0;
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean zG = (i4 == 32) | fetVar.g(strW);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                if (z) {
                    ol8 ol8Var = (ol8) rl8Var;
                    objP2 = new wul(lul.e, oe9.f25112a, new ue9(strW), ol8Var.b, ol8Var.f25439a, false);
                } else {
                    objP2 = rl8Var instanceof ql8 ? new wul(qul.e, oe9.f25112a, new ue9(strW), true, ((ql8) rl8Var).f28921a, false) : null;
                }
                fetVar.o0(objP2);
            }
            wul wulVar = (wul) objP2;
            if (wulVar != null) {
                fetVar.e0(-657354268);
                mm40Var2 = mm40Var;
                mm40 mm40VarQ = i120.Q(mm40Var2, themeColors.getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarQ, 8.0f);
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
                qzb.n(o7k0.d(jm40.b, 1.0f), wulVar, function2, fetVar, 6, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                mm40Var2 = mm40Var;
                fetVar.e0(-657022723);
                fetVar.r(false);
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 28, i2, mm40Var2, rl8Var, function0, function1);
        }
    }

    public static final void k(mm40 mm40Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            qxw.o(fetVar, rq8.K(mm40Var, function1));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var, function1, i2, b2);
        }
    }

    public static final void l(mm40 mm40Var, bra braVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        ydr ydrVar;
        braVar.getClass();
        function1.getClass();
        fetVar.g0(-1365014505);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(braVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            bzl bzlVarZ = mbc.Z(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new yra(bzlVarZ, b2));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new n19(function1, (byte) 18);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new n19(function1, (byte) 19);
                fetVar.o0(objP3);
            }
            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            uhm uhmVar = braVar.f3069a;
            boolean z4 = i4 == 256;
            Object objP4 = fetVar.P();
            boolean z5 = z4;
            byte b3 = 12;
            if (z5 || objP4 == cl5Var) {
                objP4 = new xz8(function1, b3);
                fetVar.o0(objP4);
            }
            thb.g(uhmVar, bzlVarZ, (Function1) objP4, fetVar, 1);
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new ahd((byte) 28);
                fetVar.o0(objP5);
            }
            mm40 mm40VarN = mbc.N(lgb.K(i120.Q(knx.Q(n0qVar, (xdr) objP5), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), vgg0.c(((ycl) l7m0Var.getValue()).f42389a, ((ycl) l7m0Var.getValue()).f42389a, 0.0f, 0.0f, 12))), bzlVarZ, fetVar, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            ydrVar = ugdVar;
            ydrVar.j(jr8.f16991a, bzlVarZ, fetVar, 390);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ydrVar = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var, (Object) braVar, function1, (wdr) ydrVar, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    public static final void m(final lnp0 lnp0Var, Function1 function1, fet fetVar, int i2) {
        cl5 cl5Var;
        boolean z;
        boolean z2;
        Object objP;
        fet fetVar2 = fetVar;
        fetVar2.g0(1201459222);
        int i3 = i2 | (fetVar2.g(lnp0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        final byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar2.e0(-743885988);
            int size = lnp0Var.b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(ddz.a(0, 0, fetVar2, 0, 3));
            }
            fetVar2.r(false);
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            int i5 = lnp0Var.d;
            int i6 = i3 & 14;
            boolean z3 = i6 == 4;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var2) {
                objP3 = new Function0() { // from class: a.jnp0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size2;
                        byte b3 = b2;
                        lnp0 lnp0Var2 = lnp0Var;
                        switch (b3) {
                            case 0:
                                size2 = lnp0Var2.b.size();
                                break;
                            default:
                                size2 = lnp0Var2.d;
                                break;
                        }
                        return Integer.valueOf(size2);
                    }
                };
                fetVar2.o0(objP3);
            }
            kwj kwjVarB = zk80.b(i5, (Function0) objP3, fetVar2, 0, 2);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ2 = i120.Q(o7k0.d(jm40Var, 1.0f), s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f2 = xfn.a(fetVar2).f;
            float f3 = xfn.a(fetVar2).f;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, f2, 4.0f, f3, 8.0f);
            a4x a4xVar = lnp0Var.b;
            boolean z5 = i6 == 4;
            Object objP4 = fetVar2.P();
            if (z5) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP4 == cl5Var) {
                }
                Function0 function0 = (Function0) objP4;
                boolean zI = fetVar2.i(vneVar) | fetVar2.g(kwjVarB);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zI | z;
                objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 5);
                    fetVar2.o0(objP);
                }
                ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP, fetVar, 3456, 16);
                fetVar.r(true);
                mbc.o(agi0.f827a, null, false, fetVar, 6, 6);
                q5x.e(kwjVarB, n0qVar, null, null, 0, 0.0f, gqw0.j, null, false, null, null, null, null, u1c.M(548087821, new d2s(lnp0Var, arrayList, (byte) 22), fetVar), fetVar, 102236208, 24576, 16060);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            final byte b3 = 1;
            objP4 = new Function0() { // from class: a.jnp0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int size2;
                    byte b4 = b3;
                    lnp0 lnp0Var2 = lnp0Var;
                    switch (b4) {
                        case 0:
                            size2 = lnp0Var2.b.size();
                            break;
                        default:
                            size2 = lnp0Var2.d;
                            break;
                    }
                    return Integer.valueOf(size2);
                }
            };
            fetVar2.o0(objP4);
            Function0 function2 = (Function0) objP4;
            boolean zI2 = fetVar2.i(vneVar) | fetVar2.g(kwjVarB);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zI2 | z;
            objP = fetVar2.P();
            if (z2) {
                objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 5);
                fetVar2.o0(objP);
            } else {
                objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 5);
                fetVar2.o0(objP);
            }
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, false, function2, (Function1) objP, fetVar, 3456, 16);
            fetVar.r(true);
            mbc.o(agi0.f827a, null, false, fetVar, 6, 6);
            q5x.e(kwjVarB, n0qVar, null, null, 0, 0.0f, gqw0.j, null, false, null, null, null, null, u1c.M(548087821, new d2s(lnp0Var, arrayList, (byte) 22), fetVar), fetVar, 102236208, 24576, 16060);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) lnp0Var, (Object) function1, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0404  */
    /* JADX WARN: Code duplicated, block: B:113:0x0433  */
    /* JADX WARN: Code duplicated, block: B:114:0x0436  */
    /* JADX WARN: Code duplicated, block: B:116:0x0439  */
    /* JADX WARN: Code duplicated, block: B:117:0x043c  */
    /* JADX WARN: Code duplicated, block: B:121:0x044b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0468  */
    /* JADX WARN: Code duplicated, block: B:126:0x049a  */
    /* JADX WARN: Code duplicated, block: B:128:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0138  */
    /* JADX WARN: Code duplicated, block: B:39:0x013c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0175  */
    /* JADX WARN: Code duplicated, block: B:44:0x017b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0197  */
    /* JADX WARN: Code duplicated, block: B:48:0x0199  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0206  */
    /* JADX WARN: Code duplicated, block: B:58:0x021a  */
    /* JADX WARN: Code duplicated, block: B:61:0x022f A[LOOP:0: B:59:0x0229->B:61:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x026e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0270  */
    /* JADX WARN: Code duplicated, block: B:70:0x0279  */
    /* JADX WARN: Code duplicated, block: B:73:0x028c  */
    /* JADX WARN: Code duplicated, block: B:74:0x028e  */
    /* JADX WARN: Code duplicated, block: B:80:0x029b  */
    /* JADX WARN: Code duplicated, block: B:82:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x0312  */
    /* JADX WARN: Code duplicated, block: B:87:0x031a  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x03d3  */
    public static final void n(mm40 mm40Var, p2f p2fVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        mm40 mm40Var2;
        cl5 cl5Var;
        boolean z;
        pcy pcyVar;
        jm40 jm40Var;
        List list;
        boolean z2;
        Object objP;
        int i3;
        int i4;
        pcy pcyVar2;
        pcy pcyVar3;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        Object objP2;
        boolean z6;
        Object objP3;
        boolean z7;
        boolean z8;
        boolean zG;
        Object objP4;
        boolean zG2;
        Object objP5;
        ArrayList arrayList;
        Iterator it;
        boolean z9;
        Object objP6;
        boolean z10;
        Object objP7;
        p2f p2fVar2 = p2fVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        ljc ljcVar = jd8.n;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        p2fVar2.getClass();
        function1.getClass();
        fetVar2.g0(-1550362234);
        int i7 = i2 | 6 | (fetVar2.g(p2fVar2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i7 & 1, (i7 & 147) != 146)) {
            Context context = (Context) fetVar2.k(dy2.b);
            boolean zI = fetVar2.i(context);
            Object objP8 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            byte b2 = 6;
            if (zI || objP8 == cl5Var2) {
                objP8 = new yg3(context, b2);
                fetVar2.o0(objP8);
            }
            Function0 function0 = (Function0) objP8;
            boolean zI2 = fetVar2.i(context);
            Object objP9 = fetVar2.P();
            if (zI2 || objP9 == cl5Var2) {
                objP9 = new yg3(context, (byte) 7);
                fetVar2.o0(objP9);
            }
            v3c.z(function0, (Function0) objP9, null, fetVar2, 0, 4);
            pkk0 pkk0Var = (pkk0) fetVar2.k(bmd.q);
            WeakHashMap weakHashMap = djv0.w;
            Boolean bool = (Boolean) ((hgk0) zcm0.i(fetVar2).c.d).getValue();
            boolean zBooleanValue = bool.booleanValue();
            int i8 = i7 & 896;
            boolean zH = (i8 == 256) | fetVar2.h(zBooleanValue);
            Object objP10 = fetVar2.P();
            yje yjeVar = null;
            if (zH) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP10 == cl5Var) {
                }
                m0x0.t(fetVar2, bool, (Function2) objP10);
                mm40 mm40VarE0 = o2e.e0(j120.k0(o050.W(i120.Q(o7k0.c, afn0.m(fetVar2).getBackground(), ljcVar)), new ujo(zcm0.i(fetVar2).c, zcm0.i(fetVar2).e)), "COUPON_SCANNER_CONTENT");
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                mkd.c0.getClass();
                fetVar2.i0();
                z = fetVar2.S;
                pcyVar = e7z.u1;
                if (z) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                zx7 zx7Var = gqw0.b;
                jr8 jr8Var = jr8.f16991a;
                jm40Var = jm40.b;
                mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                p2fVar2 = p2fVar;
                imm immVar = p2fVar2.k;
                list = p2fVar2.f;
                if (i8 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new afd(function1, (byte) 6);
                    fetVar2.o0(objP);
                }
                cl5 cl5Var3 = cl5Var;
                hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
                if (list.isEmpty()) {
                    i3 = i8;
                    i4 = 0;
                    fetVar.e0(2066392728);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2065415391);
                    zG2 = fetVar.g(list);
                    objP5 = fetVar.P();
                    if (zG2 || objP5 == cl5Var3) {
                        arrayList = new ArrayList(r3d.q(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new yvh0(((o2f) it.next()).a(), bwh0.f3325a));
                        }
                        objP5 = dyb.o0(arrayList);
                        fetVar.o0(objP5);
                    }
                    a4x a4xVar = (a4x) objP5;
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), afn0.m(fetVar).getBackgroundContent(), ljcVar);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                    dxh0 dxh0Var = p2fVar2.h;
                    if ((i7 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objP6 = fetVar.P();
                    if (z9 || objP6 == cl5Var3) {
                        objP6 = new jwd(p2fVar2, (byte) 13);
                        fetVar.o0(objP6);
                    }
                    Function0 function3 = (Function0) objP6;
                    if (i8 == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP7 = fetVar.P();
                    if (z10 || objP7 == cl5Var3) {
                        objP7 = new trb(function1, (byte) 25);
                        fetVar.o0(objP7);
                    }
                    i3 = i8;
                    ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function3, (Function1) objP7, fetVar, 384, 16);
                    i4 = 0;
                    fetVar.r(false);
                }
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarK2 = s5x0.K(mm40VarD, 12.0f, 12.0f);
                long backgroundContent = afn0.m(fetVar).getBackgroundContent();
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarK2, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 16.0f);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, i4);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    pcyVar2 = pcyVar;
                    fetVar.l(pcyVar2);
                } else {
                    pcyVar2 = pcyVar;
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar);
                pcyVar3 = pcyVar2;
                v8q0.a(rsm0.w(R.string.code_info_request, i4, fetVar), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 131064);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                c6q0 c6q0Var = p2fVar2.j;
                i5 = i7 & 112;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean zG3 = fetVar.g(pkk0Var) | z3;
                i6 = i3;
                if (i6 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zG3 | z4;
                objP2 = fetVar.P();
                if (!z5 || objP2 == cl5Var3) {
                    function2 = function1;
                    objP2 = new z1f(p2fVar2, pkk0Var, function2);
                    fetVar.o0(objP2);
                } else {
                    function2 = function1;
                }
                kly klyVar = new kly((Function1) objP2, null, null, 62);
                if (i6 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP3 = fetVar.P();
                if (z6 || objP3 == cl5Var3) {
                    objP3 = new trb(function2, (byte) 26);
                    fetVar.o0(objP3);
                }
                wvb.t(mm40VarD2, c6q0Var, 7, klyVar, (Function1) objP3, fetVar, 390, 0);
                fetVar.r(true);
                fetVar.r(true);
                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                mtl mtlVar = p2fVar2.i;
                if (i6 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i5 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zG = z8 | z7 | fetVar.g(pkk0Var);
                objP4 = fetVar.P();
                if (zG || objP4 == cl5Var3) {
                    objP4 = new z1f(function2, p2fVar2, pkk0Var);
                    fetVar.o0(objP4);
                }
                bkb.f(mm40VarB2, mtlVar, null, false, null, (Function1) objP4, fetVar, 0, 28);
                fetVar2 = fetVar;
                if (p2fVar2.d) {
                    fetVar2.e0(841340872);
                    mm40 mm40VarQ2 = i120.Q(o7k0.c, afn0.p(fetVar2).m73getBlack400d7_KjU(), ljcVar);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar3);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM4, shdVar3);
                    vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar);
                    kpb.j(null, null, fetVar2, 0, 3);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(841611874);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            objP10 = new a2f(function1, zBooleanValue, yjeVar, (byte) 0);
            fetVar2.o0(objP10);
            m0x0.t(fetVar2, bool, (Function2) objP10);
            mm40 mm40VarE1 = o2e.e0(j120.k0(o050.W(i120.Q(o7k0.c, afn0.m(fetVar2).getBackground(), ljcVar)), new ujo(zcm0.i(fetVar2).c, zcm0.i(fetVar2).e)), "COUPON_SCANNER_CONTENT");
            tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarE1);
            mkd.c0.getClass();
            fetVar2.i0();
            z = fetVar2.S;
            pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar4);
            jpm0.o(fetVar2, bh90VarM5, shdVar3);
            vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar);
            zx7 zx7Var2 = gqw0.b;
            jr8 jr8Var2 = jr8.f16991a;
            jm40Var = jm40.b;
            mm40 mm40VarB3 = jr8Var2.b(jm40Var, zx7Var2);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarB3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA3, shdVar4);
            jpm0.o(fetVar2, bh90VarM6, shdVar3);
            vqd.u(iHashCode6, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar);
            p2fVar2 = p2fVar;
            imm immVar2 = p2fVar2.k;
            list = p2fVar2.f;
            if (i8 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar2.P();
            if (z2) {
                objP = new afd(function1, (byte) 6);
                fetVar2.o0(objP);
            } else {
                objP = new afd(function1, (byte) 6);
                fetVar2.o0(objP);
            }
            cl5 cl5Var4 = cl5Var;
            hlm.c(null, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            if (list.isEmpty()) {
                fetVar.e0(2065415391);
                zG2 = fetVar.g(list);
                objP5 = fetVar.P();
                if (zG2) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yvh0(((o2f) it.next()).a(), bwh0.f3325a));
                    }
                    objP5 = dyb.o0(arrayList);
                    fetVar.o0(objP5);
                } else {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yvh0(((o2f) it.next()).a(), bwh0.f3325a));
                    }
                    objP5 = dyb.o0(arrayList);
                    fetVar.o0(objP5);
                }
                a4x a4xVar2 = (a4x) objP5;
                mm40 mm40VarQ3 = i120.Q(o7k0.d(jm40Var, 1.0f), afn0.m(fetVar).getBackgroundContent(), ljcVar);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarK3 = s5x0.K(mm40VarQ3, 12.0f, 8.0f);
                dxh0 dxh0Var2 = p2fVar2.h;
                if ((i7 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objP6 = fetVar.P();
                if (z9) {
                    objP6 = new jwd(p2fVar2, (byte) 13);
                    fetVar.o0(objP6);
                } else {
                    objP6 = new jwd(p2fVar2, (byte) 13);
                    fetVar.o0(objP6);
                }
                Function0 function4 = (Function0) objP6;
                if (i8 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objP7 = fetVar.P();
                if (z10) {
                    objP7 = new trb(function1, (byte) 25);
                    fetVar.o0(objP7);
                } else {
                    objP7 = new trb(function1, (byte) 25);
                    fetVar.o0(objP7);
                }
                i3 = i8;
                ibc.n(mm40VarK3, a4xVar2, gxh0.f12078a, dxh0Var2, false, function4, (Function1) objP7, fetVar, 384, 16);
                i4 = 0;
                fetVar.r(false);
            } else {
                i3 = i8;
                i4 = 0;
                fetVar.e0(2066392728);
                fetVar.r(false);
            }
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar5 = qmk.f28987a;
            mm40 mm40VarK4 = s5x0.K(mm40VarD3, 12.0f, 12.0f);
            long backgroundContent2 = afn0.m(fetVar).getBackgroundContent();
            zcl zclVar6 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarK4, backgroundContent2, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)), 16.0f);
            x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar, i4);
            int iHashCode7 = Long.hashCode(fetVar.T);
            bh90 bh90VarM7 = fetVar.m();
            mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarJ2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar4);
            jpm0.o(fetVar, bh90VarM7, shdVar3);
            vqd.u(iHashCode7, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC6, shdVar);
            pcyVar3 = pcyVar2;
            v8q0.a(rsm0.w(R.string.code_info_request, i4, fetVar), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 131064);
            mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
            c6q0 c6q0Var2 = p2fVar2.j;
            i5 = i7 & 112;
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zG4 = fetVar.g(pkk0Var) | z3;
            i6 = i3;
            if (i6 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = zG4 | z4;
            objP2 = fetVar.P();
            if (z5) {
                function2 = function1;
                objP2 = new z1f(p2fVar2, pkk0Var, function2);
                fetVar.o0(objP2);
            } else {
                function2 = function1;
                objP2 = new z1f(p2fVar2, pkk0Var, function2);
                fetVar.o0(objP2);
            }
            kly klyVar2 = new kly((Function1) objP2, null, null, 62);
            if (i6 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP3 = fetVar.P();
            if (z6) {
                objP3 = new trb(function2, (byte) 26);
                fetVar.o0(objP3);
            } else {
                objP3 = new trb(function2, (byte) 26);
                fetVar.o0(objP3);
            }
            wvb.t(mm40VarD4, c6q0Var2, 7, klyVar2, (Function1) objP3, fetVar, 390, 0);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarB4 = jr8Var2.b(jm40Var, gqw0.h);
            mtl mtlVar2 = p2fVar2.i;
            if (i6 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i5 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            zG = z8 | z7 | fetVar.g(pkk0Var);
            objP4 = fetVar.P();
            if (zG) {
                objP4 = new z1f(function2, p2fVar2, pkk0Var);
                fetVar.o0(objP4);
            } else {
                objP4 = new z1f(function2, p2fVar2, pkk0Var);
                fetVar.o0(objP4);
            }
            bkb.f(mm40VarB4, mtlVar2, null, false, null, (Function1) objP4, fetVar, 0, 28);
            fetVar2 = fetVar;
            if (p2fVar2.d) {
                fetVar2.e0(841340872);
                mm40 mm40VarQ4 = i120.Q(o7k0.c, afn0.p(fetVar2).m73getBlack400d7_KjU(), ljcVar);
                tj30 tj30VarC4 = zq8.c(gqw0.e, false);
                int iHashCode8 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM8 = fetVar2.m();
                mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarQ4);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC4, shdVar4);
                jpm0.o(fetVar2, bh90VarM8, shdVar3);
                vqd.u(iHashCode8, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC7, shdVar);
                kpb.j(null, null, fetVar2, 0, 3);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(841611874);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, p2fVar2, function2, i2, (byte) 22);
        }
    }

    public static final void o(mm40 mm40Var, akl aklVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-381062784);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(aklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (aklVar instanceof yjl) {
            fetVar.e0(-642562882);
            p(mm40Var, (yjl) aklVar, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!(aklVar instanceof zjl)) {
                throw b1j.f(-1129108633, fetVar, false);
            }
            fetVar.e0(-642312309);
            r(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ljl(mm40Var, aklVar, function1, i2, (byte) 3);
        }
    }

    public static final void p(mm40 mm40Var, yjl yjlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(1589898837);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(yjlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            fetVar.e0(-292981798);
            Iterator<E> it = yjlVar.f42744a.iterator();
            while (it.hasNext()) {
                q(null, (bkl) it.next(), function1, fetVar, i3 & 896);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njl(mm40Var, yjlVar, function1, i2, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, bkl bklVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        bkl bklVar2;
        mm40 mm40Var2;
        fetVar.g0(-1902909672);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(bklVar) : fetVar.i(bklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 148.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            int i4 = i3 & 112;
            boolean z = (i4 == 32 || ((i3 & 64) != 0 && fetVar.i(bklVar))) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ojl(function1, bklVar, (byte) 3);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarE2, null, null, false, null, (Function0) objP, 28);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarW, backgroundContent, ljcVar), "DS_BANNER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 8.0f, 8.0f, 8.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_sand_clock_banner, 0, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = ju70.T(pm80VarF, null, new j2l((byte) 11), 6);
                fetVar.o0(objP2);
            }
            pm80 pm80Var = (pm80) objP2;
            bklVar2 = bklVar;
            mm40Var2 = jm40Var;
            k7x.b(bklVar2.b.a(), null, o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 84.0f)), ((ThemeColors) fetVar.k(zfnVar)).getSecondary20(), ljcVar), "DS_BANNER_IMAGE"), pm80Var, pm80Var, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            fetVar2 = fetVar;
            J(o7k0.c, bklVar2, fetVar2, i4 | 6);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            bklVar2 = bklVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjl(mm40Var2, bklVar2, function1, i2, (byte) 1);
        }
    }

    public static final void r(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1886451667);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD2, 148.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 148.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 148.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 148.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, b2);
        }
    }

    public static final void s(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1118421602);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i2, b2);
        }
    }

    public static final void t(mm40 mm40Var, a2n a2nVar, boolean z, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(-211175944);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(a2nVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (a2nVar instanceof y56) {
            fetVar.e0(984758713);
            vcc.i(mm40Var, (y56) a2nVar, z, function1, null, fetVar, i3 & 8190, 16);
            fetVar.r(false);
        } else if (a2nVar instanceof c2o0) {
            fetVar.e0(984999862);
            hkb.n(mm40Var, (c2o0) a2nVar, z, function1, null, fetVar, i3 & 8190, 16);
            fetVar.r(false);
        } else {
            fetVar.e0(985209546);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 8, i2, (Object) mm40Var, (Object) a2nVar, (Object) function1, z);
        }
    }

    public static final void u(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1561672521);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new plh(l7m0Var, (byte) 24);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i4 == 32;
            Object objP2 = fetVar.P();
            byte b2 = 25;
            if (z2 || objP2 == cl5Var) {
                objP2 = new plh(l7m0Var, b2);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40Var, background, ljcVar);
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
            imm immVar = ((y4p) l7m0Var.getValue()).f42014a;
            int i5 = i3 & 896;
            boolean z3 = i5 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new s8o(function1, b2);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean z4 = i5 == 256;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new qyo(function1, (byte) 6);
                fetVar.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean z5 = i5 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new qyo(function1, (byte) 7);
                fetVar.o0(objP5);
            }
            Function1 function4 = (Function1) objP5;
            boolean z6 = i5 == 256;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new s8o(function1, (byte) 26);
                fetVar.o0(objP6);
            }
            hlm.c(null, immVar, null, function0, null, function3, function4, null, (Function0) objP6, null, null, null, fetVar, 0, 0, 3733);
            mm40 mm40VarQ2 = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar);
            boolean z7 = i5 == 256;
            Object objP7 = fetVar.P();
            if (z7 || objP7 == cl5Var) {
                function2 = function1;
                objP7 = new qyo(function2, (byte) 8);
                fetVar.o0(objP7);
            } else {
                function2 = function1;
            }
            F(mm40VarQ2, l7m0VarY, l7m0VarY2, function2, (Function1) objP7, fetVar, (i3 << 3) & 7168);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i2, (byte) 14);
        }
    }

    public static final void v(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        fetVar.g0(871433623);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = f9z.a(fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            ngv ngvVar = new ngv(i4);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean zE = ((i3 & 112) == 32) | fetVar.e(i4) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new p4p(b2, i4, a4xVar, function1);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarE, d9zVarA, ch80VarG, null, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 944);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar, function1, i2, (byte) 7);
        }
    }

    public static final void w(mm40 mm40Var, boolean z, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        function1.getClass();
        fetVar.g0(-1359200584);
        int i3 = i2 | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar2 = fetVar;
            nnw0.g(o7k0.c, null, false, u1c.M(-769417694, new ldc(z, function1, b2), fetVar), fetVar2, 3072, 6);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var2, z, (Object) function1, i2, (byte) 8);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(-1864162923);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ2 = i120.Q(o7k0.e(mm40VarD, 44.0f), s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
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
            mm40 mm40VarN = s5x0.N(o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 32.0f), xfn.a(fetVar).f, 0.0f, xfn.a(fetVar).f, 0.0f, 10);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 146.0f), xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 146.0f), xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 146.0f), xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i2, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v22 */
    public static final void y(mm40 mm40Var, l240 l240Var, final Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        ugd ugdVarM;
        final byte b2;
        ugd ugdVarM2;
        boolean z;
        mm40 mm40Var3;
        int i3;
        cl5 cl5Var;
        jm40 jm40Var;
        boolean z2;
        fet fetVar2 = fetVar;
        l240Var.getClass();
        function1.getClass();
        fetVar2.g0(-1689011533);
        int i4 = i2 | 6 | (fetVar2.g(l240Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        final byte b3 = 0;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            int i5 = i4 & 896;
            ?? r4 = i5 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (r4 != false || objP == cl5Var2) {
                objP = new m040(function1, b3);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            ?? r5 = i5 == 256;
            Object objP2 = fetVar2.P();
            if (r5 != false || objP2 == cl5Var2) {
                objP2 = new m040(function1, (byte) 4);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarX = yyw.X(jm40Var2, null, fetVar2, 1);
            imm immVar = l240Var.k;
            final o2c0 o2c0Var = l240Var.f19290a;
            ?? r19 = i5 == 256;
            Object objP3 = fetVar2.P();
            byte b4 = 3;
            if (r19 != false || objP3 == cl5Var2) {
                objP3 = new rp30(function1, b4);
                fetVar2.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            if (o2c0Var == null) {
                fetVar2.e0(-830853841);
                fetVar2.r(false);
                ugdVarM = null;
            } else {
                fetVar2.e0(-830853840);
                ugdVarM = u1c.M(-980494351, new Function2() { // from class: a.p040
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b3;
                        cl5 cl5Var3 = ukd.f35823a;
                        Function1 function3 = function1;
                        o2c0 o2c0Var2 = o2c0Var;
                        switch (b5) {
                            case 0:
                                fet fetVar3 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarE0 = o2e.e0(jm40.b, "PROFILE_MENU_ICON");
                                    o0x o0xVar = o2c0Var2.c;
                                    int i6 = o2c0Var2.d;
                                    y3d y3dVar = o2c0Var2.e;
                                    long j2 = o2c0Var2.f;
                                    boolean zG = fetVar3.g(function3);
                                    Object objP4 = fetVar3.P();
                                    if (zG || objP4 == cl5Var3) {
                                        objP4 = new m040(function3, (byte) 2);
                                        fetVar3.o0(objP4);
                                    }
                                    p8a.A(mm40VarE0, o0xVar, i6, y3dVar, j2, (Function0) objP4, fetVar3, 6);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                fet fetVar4 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    String str = o2c0Var2.f24525a;
                                    String str2 = o2c0Var2.b;
                                    boolean zG2 = fetVar4.g(function3);
                                    Object objP5 = fetVar4.P();
                                    if (zG2 || objP5 == cl5Var3) {
                                        objP5 = new m040(function3, (byte) 3);
                                        fetVar4.o0(objP5);
                                    }
                                    p8a.z(null, str, str2, (Function0) objP5, fetVar4, 0);
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2);
                fetVar2.r(false);
            }
            if (o2c0Var == null) {
                fetVar2.e0(-830278264);
                fetVar2.r(false);
                z = false;
                ugdVarM2 = null;
                b2 = 1;
            } else {
                fetVar2.e0(-830278263);
                b2 = 1;
                ugdVarM2 = u1c.M(630697803, new Function2() { // from class: a.p040
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b2;
                        cl5 cl5Var3 = ukd.f35823a;
                        Function1 function3 = function1;
                        o2c0 o2c0Var2 = o2c0Var;
                        switch (b5) {
                            case 0:
                                fet fetVar3 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarE0 = o2e.e0(jm40.b, "PROFILE_MENU_ICON");
                                    o0x o0xVar = o2c0Var2.c;
                                    int i6 = o2c0Var2.d;
                                    y3d y3dVar = o2c0Var2.e;
                                    long j2 = o2c0Var2.f;
                                    boolean zG = fetVar3.g(function3);
                                    Object objP4 = fetVar3.P();
                                    if (zG || objP4 == cl5Var3) {
                                        objP4 = new m040(function3, (byte) 2);
                                        fetVar3.o0(objP4);
                                    }
                                    p8a.A(mm40VarE0, o0xVar, i6, y3dVar, j2, (Function0) objP4, fetVar3, 6);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                fet fetVar4 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    String str = o2c0Var2.f24525a;
                                    String str2 = o2c0Var2.b;
                                    boolean zG2 = fetVar4.g(function3);
                                    Object objP5 = fetVar4.P();
                                    if (zG2 || objP5 == cl5Var3) {
                                        objP5 = new m040(function3, (byte) 3);
                                        fetVar4.o0(objP5);
                                    }
                                    p8a.z(null, str, str2, (Function0) objP5, fetVar4, 0);
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2);
                z = false;
                fetVar2.r(false);
            }
            boolean z4 = z;
            hlm.c(mm40VarX, immVar, null, null, null, function2, null, null, null, ugdVarM, ugdVarM2, null, fetVar, 0, 0, 2524);
            fetVar2 = fetVar;
            String str = l240Var.f;
            if (str == null) {
                fetVar2.e0(-829945138);
                fetVar2.r(z4);
                mm40Var3 = null;
            } else {
                fetVar2.e0(-829945137);
                mm40Var3 = null;
                G(z4 ? 1 : 0, fetVar2, null, str);
                fetVar2.r(z4);
            }
            jjl jjlVar = l240Var.l;
            if (jjlVar == null) {
                fetVar2.e0(-829850340);
                fetVar2.r(z4);
                cl5Var = cl5Var2;
                i3 = 256;
            } else {
                fetVar2.e0(-829850339);
                ijl ijlVar = l240Var.h;
                i3 = 256;
                ?? r11 = i5 == 256 ? 1 : z4 ? 1 : 0;
                Object objP4 = fetVar2.P();
                cl5Var = cl5Var2;
                if (r11 != 0 || objP4 == cl5Var) {
                    objP4 = new m040(function1, (byte) 5);
                    fetVar2.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                ?? r12 = i5 == 256 ? 1 : z4 ? 1 : 0;
                Object objP5 = fetVar2.P();
                if (r12 != 0 || objP5 == cl5Var) {
                    objP5 = new m040(function1, (byte) 6);
                    fetVar2.o0(objP5);
                }
                Function0 function4 = (Function0) objP5;
                ?? r13 = i5 == 256 ? 1 : z4 ? 1 : 0;
                Object objP6 = fetVar2.P();
                if (r13 != 0 || objP6 == cl5Var) {
                    objP6 = new m040(function1, (byte) 7);
                    fetVar2.o0(objP6);
                }
                feb.k(ijlVar, jjlVar, null, function3, function4, (Function0) objP6, fetVar, 0, 4);
                fetVar2 = fetVar;
                fetVar2.r(z4);
            }
            r44 r44Var = l240Var.i;
            if (r44Var == null) {
                fetVar2.e0(-829401832);
                fetVar2.r(z4);
                jm40Var = jm40Var2;
                z2 = true;
            } else {
                fetVar2.e0(-829401831);
                float f2 = xfn.a(fetVar2).d;
                zcl zclVar = qmk.f28987a;
                jm40Var = jm40Var2;
                mm40 mm40VarK = s5x0.K(jm40Var, f2, 8.0f);
                String str2 = r44Var.f29818a;
                String str3 = r44Var.b;
                ?? r8 = i5 == i3 ? 1 : z4 ? 1 : 0;
                Object objP7 = fetVar2.P();
                if (r8 != 0 || objP7 == cl5Var) {
                    objP7 = new m040(function1, (byte) 8);
                    fetVar2.o0(objP7);
                }
                Function0 function5 = (Function0) objP7;
                ?? r1 = i5 == i3 ? 1 : z4 ? 1 : 0;
                Object objP8 = fetVar2.P();
                if (r1 != 0 || objP8 == cl5Var) {
                    z2 = true;
                    objP8 = new m040(function1, 1 == true ? 1 : 0);
                    fetVar2.o0(objP8);
                } else {
                    z2 = true;
                }
                fet fetVar3 = fetVar2;
                pzb.g(mm40VarK, str2, str3, function5, (Function0) objP8, fetVar3, 0);
                fetVar2 = fetVar3;
                fetVar2.r(z4);
            }
            zno0 zno0Var = l240Var.m;
            int i6 = (i4 >> 3) & 112;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), "MENU_TABS_CONTAINER");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z4);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
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
            if (zno0Var instanceof yno0) {
                fetVar2.e0(-945667785);
                s5x0.w(mm40Var3, (yno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof xno0) {
                fetVar2.e0(-945662985);
                m0x0.F(mm40Var3, (xno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof tno0) {
                fetVar2.e0(-945657690);
                j47.F(mm40Var3, (tno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof rno0) {
                fetVar2.e0(-945652392);
                hp4.a(mm40Var3, (rno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof sno0) {
                fetVar2.e0(-945647297);
                kc5.F(mm40Var3, (sno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof uno0) {
                fetVar2.e0(-945641886);
                jd8.a(mm40Var3, (uno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else if (zno0Var instanceof vno0) {
                fetVar2.e0(-945636481);
                jd8.K(mm40Var3, (vno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            } else {
                if (!(zno0Var instanceof wno0)) {
                    throw b1j.f(-945668528, fetVar2, z4);
                }
                fetVar2.e0(-945631400);
                dj8.G(mm40Var3, (wno0) zno0Var, function1, fetVar2, (i6 << 3) & 1008);
                fetVar2.r(z4);
            }
            fetVar2.r(z2);
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, l240Var, function1, i2, (byte) 19);
        }
    }

    public static final void z(mm40 mm40Var, String str, String str2, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2141254767);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10).e(o7k0.c), null, null, false, null, function0, 28);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarM, fetVar2, (i3 >> 3) & 14, 24960, 110586);
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i3 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 28, i2, (Object) mm40Var2, (Object) str, (Object) str2, (Object) function0);
        }
    }

    public boolean M(y4 y4Var, u4 u4Var, u4 u4Var2) {
        synchronized (y4Var) {
            try {
                if (y4Var.b != u4Var) {
                    return false;
                }
                y4Var.b = u4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean N(y4 y4Var, Object obj, Object obj2) {
        synchronized (y4Var) {
            try {
                if (y4Var.f41976a != obj) {
                    return false;
                }
                y4Var.f41976a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean O(y4 y4Var, x4 x4Var, x4 x4Var2) {
        synchronized (y4Var) {
            try {
                if (y4Var.c != x4Var) {
                    return false;
                }
                y4Var.c = x4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b0(x4 x4Var, x4 x4Var2) {
        x4Var.b = x4Var2;
    }

    public void c0(x4 x4Var, Thread thread) {
        x4Var.f40243a = thread;
    }
}
