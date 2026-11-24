package a;

import android.content.res.Resources;
import android.javax.sip.message.Response;
import android.os.Trace;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
public abstract class ny9 implements uu9 {
    public static final ugd d;
    public static final jak0 n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f24319a = new ugd(226427628, false, new wgd(23));
    public static final ugd b = new ugd(868297705, false, new ahd(10));
    public static final ugd c = new ugd(1948694369, false, new ahd(11));
    public static final ugd e = new ugd(-818617025, false, new jhd(4));
    public static final ugd f = new ugd(686822232, false, new mhd(24));
    public static final ugd g = new ugd(326362521, false, new mhd(25));
    public static final ugd h = new ugd(-34097190, false, new mhd(26));
    public static final int[] i = {1, 10, 100, 1000, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
    public static final int[] j = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] k = {3, 6};
    public static final int[] l = {1, 2, 4, 5, 7, 8};
    public static final StackTraceElement[] m = new StackTraceElement[0];

    static {
        byte b2 = 3;
        d = new ugd(1275113790, false, new jhd(b2));
        n = new jak0(b2);
    }

    public static final void A(ome0 ome0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1793982101);
        int i3 = i2 | (fetVar2.g(ome0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarD = o7k0.d(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new gvb0(function1, ome0Var, (byte) 17);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarD, false, null, null, (Function0) objP, 15);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.b(ome0Var.e, null, lgb.J(o7k0.n(s5x0.J(jm40Var, 12.0f), 32.0f), vgg0.f37379a), a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            v8q0.a(ome0Var.b, o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(ome0Var, function1, i2, (byte) 11);
        }
    }

    public static final void B(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-48546851);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tme0 tme0Var = (tme0) l7m0Var.getValue();
            if (tme0Var == null) {
                z = false;
            } else if (tme0Var instanceof rme0) {
                fetVar2.e0(1144979623);
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 4.0f, 4.0f, 24.0f);
                pz40 pz40Var = s6t0.f31722a;
                long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
                zcl zclVar2 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarM, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
                v8q0.a(rsm0.w(R.string.choose_referee, 0, fetVar2), s5x0.J(jm40Var, 16.0f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                boolean zG = fetVar2.g(tme0Var) | ((i3 & 112) == 32);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    function2 = function1;
                    objP = new oac0(tme0Var, function2, (byte) 26);
                    fetVar2.o0(objP);
                } else {
                    function2 = function1;
                }
                b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP, fetVar2, 6, 510);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                function2 = function1;
                z = false;
                if (tme0Var instanceof sme0) {
                    fetVar2.e0(591165117);
                    o(((sme0) tme0Var).b, fetVar2, 0);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(591121847, fetVar2, z);
        }
        function2 = function1;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function2, i2, (byte) 13);
        }
    }

    public static final void C(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(333526498);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarX = yyw.X(o7k0.c, null, fetVar, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarX);
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
            imm immVarA = ((tme0) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pme0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            B(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 12);
        }
    }

    public static final void D(l7m0 l7m0Var, xcz xczVar, gou0 gou0Var, lou0 lou0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2 = function1;
        fetVar.g0(1933220778);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(gou0Var) ? 256 : 128) | (fetVar.g(lou0Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, qcc.S(R.attr.uikitBackground, fetVar), jd8.n);
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
            mm40 mm40VarX = yyw.X(jm40.b, null, fetVar, 1);
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zbt0(function2, (byte) 19);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new sbt0(function2, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            boolean z3 = i4 == 16384;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new sbt0(function2, (byte) 18);
                fetVar.o0(objP3);
            }
            int i5 = (i3 << 3) & 896;
            cem0.l(mm40VarX, lou0Var, xczVar, function0, function3, (Function1) objP3, fetVar, ((i3 >> 6) & 112) | i5);
            if (Intrinsics.d(gou0Var, eou0.f8153a)) {
                fetVar.e0(1898881437);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new ybt0(l7m0Var, (byte) 8));
                    fetVar.o0(objP4);
                }
                l7m0 l7m0Var2 = (l7m0) objP4;
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = jgk0.b(new ybt0(l7m0Var, (byte) 5));
                    fetVar.o0(objP5);
                }
                E(l7m0Var2, (l7m0) objP5, xczVar, function2, fetVar, i5 | 54 | ((i3 >> 3) & 7168));
                function2 = function2;
                fetVar.r(false);
            } else {
                if (!(gou0Var instanceof fou0)) {
                    throw b1j.f(1308177779, fetVar, false);
                }
                fetVar.e0(1899371206);
                Object objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    objP6 = jgk0.b(new rbt0(gou0Var, (byte) 12));
                    fetVar.o0(objP6);
                }
                h((l7m0) objP6, function2, fetVar, ((i3 >> 9) & 112) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(l7m0Var, xczVar, gou0Var, lou0Var, function2, i2, (byte) 5);
        }
    }

    public static final void E(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var3;
        int i3;
        l7m0 l7m0Var4;
        fetVar.g0(1708984674);
        if ((i2 & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i3 = (fetVar.g(l7m0Var3) ? 4 : 2) | i2;
        } else {
            l7m0Var3 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(6.0f, true, new jf4((byte) 14)), h97.f(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 28.0f, fetVar), z, null, u1c.M(118902244, new nc40(function1, (byte) 23), fetVar), fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgz(l7m0Var, l7m0Var4, xczVar, function1, i2, (byte) 3);
        }
    }

    public static final void F(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(414485326);
        int i3 = i2 | 6 | (fetVar.e(10) ? 32 : 16);
        boolean z = false;
        byte b2 = 26;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).c;
            lh80 lh80Var = new lh80(f2, 16.0f, f2, 16.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new mmn(b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            mm40Var2 = jm40.b;
            b8k0.e(mm40Var2, null, lh80Var, qw3Var, null, null, false, null, function1, fetVar, 6, 490);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var2, z, i2, b2);
        }
    }

    public static final void G(ilp ilpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        fetVar.g0(-1532835998);
        int i3 = i2 | (fetVar.g(ilpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (ilpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = ilpVar.i ? new of5() : null;
            }
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (z2) {
                zcl zclVar4 = qmk.i;
                zcl zclVar5 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar5, zclVar5, zclVar4, zclVar4);
            } else {
                zcl zclVar6 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar6, zclVar6);
            }
            String str = ilpVar.b;
            zfn zfnVar = zaq0.b;
            b7l0 b7l0Var = new b7l0(new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), ilpVar.g, ilpVar.m.b, ilpVar.f, of5Var, ilpVar.j);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, z ? 8.0f : 0.0f, 4.0f, z2 ? 8.0f : 0.0f);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new zvy(function1, ilpVar, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new awy(function1, ilpVar, (byte) 3);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, b7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z2 || ilpVar.j) {
                fetVar.e0(-116565366);
                fetVar.r(false);
            } else {
                fetVar.e0(-116783823);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new up30(ilpVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void H(olp olpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        fetVar.g0(2054067960);
        int i3 = i2 | (fetVar.g(olpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (olpVar.g) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = olpVar.h ? new of5() : null;
            }
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            String str = olpVar.b;
            zfn zfnVar = zaq0.b;
            b7l0 b7l0Var = new b7l0(new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), olpVar.f, olpVar.j.b, olpVar.e, of5Var, olpVar.p);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 20.0f, 0.0f, 4.0f, z ? 8.0f : 0.0f);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new bwy(function1, olpVar, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new cwy(function1, olpVar, (byte) 3);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, b7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z || olpVar.p) {
                fetVar.e0(2127250196);
                fetVar.r(false);
            } else {
                fetVar.e0(2126908731);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), !z2 ? 64.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yo30(olpVar, z, z2, function1, i2, (byte) 2);
        }
    }

    public static final void I(clp clpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        fetVar.g0(-1250639076);
        int i3 = i2 | (fetVar.g(clpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            String str = clpVar.f4571a;
            pz40 pz40Var = s6t0.f31722a;
            q7l0 q7l0Var = new q7l0(new b2l0(str, s6t0.b().f33626a.getTextPrimary()), clpVar.c, null, Integer.valueOf(clpVar.f), null, 52);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 24.0f, 0.0f, 4.0f, z ? 8.0f : 0.0f);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vvy(function1, clpVar, (byte) 3);
                fetVar.o0(objP);
            }
            xbc.o(mm40VarM, q7l0Var, null, null, false, (Function0) objP, null, null, null, fetVar, 0, 476);
            if (z) {
                fetVar.e0(-584522224);
                fetVar.r(false);
            } else {
                fetVar.e0(-584863689);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), !z2 ? 70.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zo30(clpVar, z, z2, function1, i2, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        fet fetVar2;
        int i3;
        ?? r15;
        fet fetVar3;
        fet fetVar4 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar4.g0(354764895);
        int i4 = i2 | (fetVar4.g(l7m0Var) ? 4 : 2) | (fetVar4.i(function1) ? 32 : 16);
        if (fetVar4.U(i4 & 1, (i4 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarR, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarQ);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            imm immVarA = ((wkp0) l7m0Var.getValue()).a();
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar4.P();
            byte b2 = 10;
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new g4p0(function1, b2);
                fetVar4.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar4, 0, 0, 4085);
            if (((wkp0) l7m0Var.getValue()).b().isEmpty()) {
                function2 = function1;
                i3 = i5;
                r15 = 0;
                fetVar4.e0(-1082021607);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fetVar4.e0(-1082770226);
                mm40 mm40VarQ2 = i120.Q(o7k0.d(jm40.b, 1.0f), s6t0.b().f33626a.getBackgroundContent(), ljcVar);
                vxl vxlVar = vxl.b;
                fyl fylVar = new fyl(((wkp0) l7m0Var.getValue()).b(), null, null, s5x0.u(xfn.a(fetVar4).e, 0.0f, xfn.a(fetVar4).e, 0.0f, 10), null, 22);
                i3 = i5;
                boolean z2 = i3 == 32;
                Object objP2 = fetVar4.P();
                if (z2 || objP2 == obj) {
                    function2 = function1;
                    objP2 = new coo0(function2, (byte) 14);
                    fetVar4.o0(objP2);
                } else {
                    function2 = function1;
                }
                ebc.r(mm40VarQ2, fylVar, vxlVar, (Function1) objP2, null, fetVar4, 384, 40);
                mbc.o(agi0.f827a, null, false, fetVar, 6, 6);
                fet fetVar5 = fetVar;
                r15 = 0;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            wkp0 wkp0Var = (wkp0) l7m0Var.getValue();
            if (wkp0Var != null) {
                if (wkp0Var instanceof tkp0) {
                    fetVar3.e0(-173448092);
                    g((tkp0) wkp0Var, function2, fetVar3, i3);
                    fetVar3.r(r15);
                } else if (wkp0Var instanceof ukp0) {
                    fetVar3.e0(-173443530);
                    p(((ukp0) wkp0Var).c, function2, fetVar3, i3);
                    fetVar3.r(r15);
                } else if (wkp0Var instanceof vkp0) {
                    fetVar3.e0(-173438441);
                    x(r15, fetVar3);
                    fetVar3.r(r15);
                }
                fetVar3.r(true);
                fetVar2 = fetVar3;
            }
            throw b1j.f(-173450552, fetVar3, r15);
        }
        function2 = function1;
        fetVar4.X();
        fetVar2 = fetVar4;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function2, i2, (byte) 24);
        }
    }

    public static final void K(mm40 mm40Var, bkl bklVar, fet fetVar, int i2) {
        int i3;
        byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-600173425);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(bklVar) : fetVar2.i(bklVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(0.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            String str = bklVar.c;
            String str2 = bklVar.d;
            int length = str.length();
            jm40 jm40Var = jm40.b;
            if (length > 0) {
                fetVar2.e0(249246334);
                mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.g(jm40Var, 18.0f, 0.0f, 2), 4.0f, 0.0f, 4.0f, 0.0f, 10), "DS_BANNER_TITLE");
                int i4 = str2.length() > 0 ? 1 : 2;
                String str3 = bklVar.c;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarL = g1t0.l();
                pz40 pz40Var = s6t0.f31722a;
                z = false;
                v8q0.a(str3, mm40VarE0, s6t0.b().f33626a.getTextPrimary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, i4, 0, null, y9q0VarL, fetVar2, 0, 384, 110576);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(249931837);
                fetVar2.r(false);
            }
            if (str2.length() > 0) {
                fetVar2.e0(250004811);
                mm40 mm40VarE1 = o2e.e0(s5x0.N(o7k0.g(jm40Var, 14.0f, 0.0f, 2), 4.0f, 0.0f, 4.0f, 0.0f, 10), "DS_BANNER_SUBTITLE");
                String str4 = bklVar.d;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                fet fetVar3 = fetVar2;
                v8q0.a(str4, mm40VarE1, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar3, 0, 24960, 110584);
                fetVar2 = fetVar3;
                fetVar2.r(z);
            } else {
                fetVar2.e0(250462557);
                fetVar2.r(z);
            }
            b2 = 1;
            fetVar2.r(true);
        } else {
            i2 = i2;
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tjl(mm40Var, bklVar, i2, b2);
        }
    }

    public static final void L(y5d y5dVar, ctf0 ctf0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        ctf0Var.getClass();
        function1.getClass();
        fetVar.g0(-2026548170);
        if ((i2 & 48) == 0) {
            i3 = ((i2 & 64) == 0 ? fetVar.g(ctf0Var) : fetVar.i(ctf0Var) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 145) != 144)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
            lsm0 lsm0Var = ctf0Var.b;
            wwb.i(null, lsm0Var.a(R.string.auth_picker_country_title, Arrays.copyOf(new Object[0], 0)), 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            dtb.m(s5x0.K(jm40.b, 16.0f, 8.0f), null, lsm0Var.a(R.string.province, Arrays.copyOf(new Object[0], 0)), 0L, function1, null, fetVar, (i3 << 9) & 458752, 90);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(y5dVar, ctf0Var, function1, i2, (byte) 10);
        }
    }

    public static final void M(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-449531834);
        byte b2 = 16;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new zbt0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new zbt0(function1, (byte) 18);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object objP3 = fetVar.P();
            byte b4 = 6;
            if (objP3 == obj) {
                objP3 = jgk0.b(new ybt0(l7m0Var, b4));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = jgk0.b(new ybt0(l7m0Var, (byte) 7));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            xcz xczVarB = qdzVar.b(((gou0) l7m0Var3.getValue()).getClass().getSimpleName(), new b4u0((byte) 14), fetVar, (i3 << 3) & 896);
            Boolean boolValueOf = Boolean.valueOf(xczVarB.j.a());
            boolean zG = fetVar.g(xczVarB) | fetVar.g(pkk0Var);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new hn(xczVarB, pkk0Var, null, b3);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP5);
            D(l7m0Var, xczVarB, (gou0) l7m0Var3.getValue(), (lou0) l7m0Var2.getValue(), function1, fetVar, (i3 & 14) | 512 | ((i3 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i2, (byte) 11);
        }
    }

    public static final void N(k7 k7Var, tai0 tai0Var) {
        nai0 nai0Var = tai0Var.d;
        hz40 hz40Var = nai0Var.f23193a;
        Object objG = nai0Var.f23193a.g(xai0.z);
        if (objG == null) {
            objG = null;
        }
        ucg0 ucg0Var = (ucg0) objG;
        if (p8a.P(tai0Var)) {
            if (ucg0Var != null && ucg0Var.f35427a == 8) {
                return;
            }
            Object objG2 = hz40Var.g(mai0.y);
            if (objG2 == null) {
                objG2 = null;
            }
            m6 m6Var = (m6) objG2;
            if (m6Var != null) {
                k7Var.b(new d7(android.R.id.accessibilityActionPageUp, m6Var.f21241a));
            }
            Object objG3 = hz40Var.g(mai0.A);
            if (objG3 == null) {
                objG3 = null;
            }
            m6 m6Var2 = (m6) objG3;
            if (m6Var2 != null) {
                k7Var.b(new d7(android.R.id.accessibilityActionPageDown, m6Var2.f21241a));
            }
            Object objG4 = hz40Var.g(mai0.z);
            if (objG4 == null) {
                objG4 = null;
            }
            m6 m6Var3 = (m6) objG4;
            if (m6Var3 != null) {
                k7Var.b(new d7(android.R.id.accessibilityActionPageLeft, m6Var3.f21241a));
            }
            Object objG5 = hz40Var.g(mai0.B);
            m6 m6Var4 = (m6) (objG5 != null ? objG5 : null);
            if (m6Var4 != null) {
                k7Var.b(new d7(android.R.id.accessibilityActionPageRight, m6Var4.f21241a));
            }
        }
    }

    public static final mm40 O(float f2, mm40 mm40Var, boolean z) {
        return mm40Var.e(new by3(f2, z));
    }

    public static final Long P(gu1 gu1Var) {
        z1s0 z1s0Var;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        gu1Var.getClass();
        z1s0 z1s0Var2 = gu1Var.b;
        boolean z = gu1Var.d;
        List list = gu1Var.k.b;
        if (z1s0Var2 != z1s0.f43637a && (z1s0Var2 != (z1s0Var = z1s0.b) || z)) {
            if (plc.z(gu1Var) && !((jng0) CollectionsKt.d0(list)).c.before(new Date())) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (!((jng0) next4).c.after(new Date()));
                jng0 jng0Var = (jng0) next4;
                if (jng0Var != null) {
                    return Long.valueOf(jng0Var.b);
                }
            } else if (z1s0Var2 == z1s0Var && z) {
                Date date = new Date();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    jng0 jng0Var2 = (jng0) next;
                    if (jng0Var2.d.compareTo(date) < 0 && jng0Var2.c.compareTo(date) > 0) {
                        break;
                    }
                }
                jng0 jng0Var3 = (jng0) next;
                if (jng0Var3 != null) {
                    return Long.valueOf(jng0Var3.b);
                }
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    Date date2 = new Date();
                    Iterator it3 = list.iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            Date date3 = ((jng0) next2).d;
                            do {
                                Object next5 = it3.next();
                                Date date4 = ((jng0) next5).d;
                                if (date3.compareTo(date4) > 0) {
                                    next2 = next5;
                                    date3 = date4;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    jng0 jng0Var4 = (jng0) next2;
                    Iterator it4 = list.iterator();
                    if (it4.hasNext()) {
                        next3 = it4.next();
                        if (it4.hasNext()) {
                            Date date5 = ((jng0) next3).c;
                            do {
                                Object next6 = it4.next();
                                Date date6 = ((jng0) next6).c;
                                if (date5.compareTo(date6) < 0) {
                                    next3 = next6;
                                    date5 = date6;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    jng0 jng0Var5 = (jng0) next3;
                    if ((jng0Var4 != null ? jng0Var4.d.getTime() : 0L) <= date2.getTime()) {
                        if ((jng0Var5 != null ? jng0Var5.c.getTime() : 0L) < date2.getTime() && jng0Var5 != null) {
                            return Long.valueOf(jng0Var5.b);
                        }
                    } else if (jng0Var4 != null) {
                        return Long.valueOf(jng0Var4.b);
                    }
                }
            }
        }
        return null;
    }

    public static final void Q(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final gbn R(Function1 function1) {
        return new gbn(new g20((byte) 4), new l9(3, (byte) 17), new y7(function1, (byte) 15), m9.s);
    }

    public static final fc6 S(String str, List list) {
        ArrayList<wmg> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wmg) obj).b.length() > 0) {
                arrayList.add(obj);
            }
        }
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (wmg wmgVar : arrayList) {
            String str2 = wmgVar.f39405a;
            String str3 = wmgVar.c;
            String str4 = wmgVar.b;
            List list2 = wmgVar.k;
            ArrayList<jmg> arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                jmg jmgVar = (jmg) obj2;
                if (jmgVar.b.length() != 0 || jmgVar.f16763a.length() != 0) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, i2));
            for (jmg jmgVar2 : arrayList3) {
                String str5 = jmgVar2.f16763a;
                String str6 = jmgVar2.b;
                int i3 = jmgVar2.d;
                arrayList4.add(new xb6(str5.concat(str6), str6, jmgVar2.f16763a, String.valueOf(i3), String.valueOf(jmgVar2.c), String.valueOf(i3)));
                wmgVar = wmgVar;
            }
            arrayList2.add(new bc6(str2, str3, str4, "", wmgVar.j, arrayList4));
            i2 = 10;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((bc6) obj3).f.isEmpty()) {
                arrayList5.add(obj3);
            }
        }
        return new fc6(str, arrayList5);
    }

    public static final String T(sgy sgyVar) {
        if (sgyVar != null) {
            return sgyVar.v();
        }
        return null;
    }

    public static final boolean U(int i2, int i3, long j2) {
        int iK = p4e.k(j2);
        if (i2 > p4e.i(j2) || iK > i2) {
            return false;
        }
        return i3 <= p4e.h(j2) && p4e.j(j2) <= i3;
    }

    public static final zpu V(String str, int i2, String str2, Function1 function1) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return W(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final zpu W(String str, String str2) {
        StringBuilder sbT = brm0.t(str2, " when parsing an Instant from \"");
        sbT.append(d0(64, str));
        sbT.append('\"');
        return new zpu(sbT.toString(), str, (byte) 11);
    }

    public static final int X(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final mz3 Y(Object obj, gbe0 gbe0Var, Function1 function1, Function1 function2, qge qgeVar, fet fetVar, int i2) {
        return Z(new qz3(obj, (fz3) fetVar.k(dr00.f6538a), gbe0Var), function1, function2, qgeVar, fetVar);
    }

    public static final mz3 Z(qz3 qz3Var, Function1 function1, Function1 function2, qge qgeVar, fet fetVar) {
        fetVar.e0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            o1x o1xVarC = iut0.c(qz3Var.f29561a, fetVar);
            iut0.g(o1xVarC);
            gz3 gz3Var = new gz3(qz3Var.c, o1xVarC, qz3Var.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new mz3(gz3Var);
                fetVar.o0(objP);
            }
            mz3 mz3Var = (mz3) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            mz3Var.l = (vne) objP2;
            mz3Var.m = function1;
            mz3Var.n = function2;
            mz3Var.o = qgeVar;
            mz3Var.p = true;
            mz3Var.q = iut0.a(fetVar);
            mz3Var.n(gz3Var);
            fetVar.r(false);
            return mz3Var;
        } finally {
            Trace.endSection();
        }
    }

    public static final void a(mm40 mm40Var, fc0 fc0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-122191465);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(fc0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = m8m0.f21378a;
            long jM95getGray0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m95getGray0d7_KjU();
            Object[] objArr = new Object[0];
            Object objP = fetVar2.P();
            byte b3 = 5;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new g20(b3);
                fetVar2.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new b5((byte) 20);
                fetVar2.o0(objP2);
            }
            v0h0 v0h0VarT = x8x.t((Function1) objP2, function2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new q8((byte) 26);
                fetVar2.o0(objP3);
            }
            Map map = (Map) e9x.R(objArr, v0h0VarT, (Function0) objP3, fetVar2, 384);
            boolean zG = fetVar2.g(map);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                y3d y3dVar = (y3d) map.get(Long.valueOf(fc0Var.f9285a));
                if (y3dVar != null) {
                    jM95getGray0d7_KjU = y3dVar.f41946a;
                }
                objP4 = androidx.compose.runtime.e.e(new y3d(jM95getGray0d7_KjU));
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Resources resources = (Resources) fetVar2.k(dy2.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 52.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP5 = fetVar2.P();
            byte b4 = 6;
            if (z2 || objP5 == cl5Var) {
                objP5 = new mc(function1, fc0Var, b4);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(i120.Q(y860.W(mm40VarE2, null, null, false, null, (Function0) objP5, 28), ((y3d) pz40Var.getValue()).f41946a, jd8.n), "DS_AGGREGATOR_BANNER_COMPACT");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            fetVar2 = fetVar;
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_sand_clock, 0, fetVar2);
            boolean zG2 = fetVar2.g(pm80VarF);
            Object objP6 = fetVar2.P();
            if (zG2 || objP6 == cl5Var) {
                pz40 pz40Var2 = s6t0.f31722a;
                b2 = 6;
                objP6 = ju70.T(pm80VarF, new m78(s6t0.b().f33626a.getSecondary40(), 5), new g20(b2), 2);
                fetVar2.o0(objP6);
            } else {
                b2 = 6;
            }
            pm80 pm80Var = (pm80) objP6;
            Object objA = fc0Var.c.a();
            n0q n0qVar = o7k0.c;
            boolean z3 = i4 == 32;
            Object objP7 = fetVar2.P();
            if (z3 || objP7 == cl5Var) {
                objP7 = new t1(fc0Var, (byte) 18);
                fetVar2.o0(objP7);
            }
            mm40 mm40VarA = pai0.a(n0qVar, false, (Function1) objP7);
            pge pgeVar = gqw0.A;
            boolean zI = (i4 == 32) | fetVar2.i(map) | fetVar2.g(pz40Var) | fetVar2.i(resources);
            Object objP8 = fetVar2.P();
            if (zI || objP8 == cl5Var) {
                dc0 dc0Var = new dc0((Object) map, (Object) fc0Var, (Object) resources, (Object) pz40Var, (byte) 0);
                fetVar2.o0(dc0Var);
                objP8 = dc0Var;
            }
            byte b5 = b2;
            k7x.b(objA, null, mm40VarA, pm80Var, pm80Var, null, null, (Function1) objP8, null, null, pgeVar, null, fetVar2, 36912, 6, 31584);
            if (fc0Var.b.length() > 0) {
                fetVar2.e0(1069738715);
                zx7 zx7Var = gqw0.h;
                jr8 jr8Var = jr8.f16991a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarE3 = o7k0.e(o7k0.d(jr8Var.b(jm40Var, zx7Var), 1.0f), 40.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                zq8.a(0, fetVar2, i120.P(mm40VarE3, yk5.n(q3d.j(new y3d(staticColors.m63getBlack00d7_KjU()), new y3d(staticColors.m78getBlack800d7_KjU())), 0.0f, Float.POSITIVE_INFINITY, 8), null, b5));
                mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, gqw0.g), 12.0f);
                String str = fc0Var.b;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, mm40VarJ, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.g(), 0L, 0L, psq.f, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777211), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1070670885);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) fc0Var, (Object) function1, i2, (byte) 13);
        }
    }

    public static final void a0(sgy sgyVar, String str) {
        String string;
        sgyVar.getClass();
        String str2 = "in the polymorphic scope of '" + sgyVar.J() + '\'';
        if (str == null) {
            string = hne.l('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbN = b1j.n("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            f140.v(sbN, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbN.append(sgyVar.J());
            sbN.append("' has to be sealed and '@Serializable'.");
            string = sbN.toString();
        }
        throw new fhi0(string);
    }

    public static final void b(mm40 mm40Var, String str, String str2, long j2, long j3, fet fetVar, int i2) {
        str2.getClass();
        fetVar.g0(5217143);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-632463305, new d15(mm40Var, j2, j3, str, str2, (pz40) objP, (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e15(mm40Var, str, str2, j2, j3, i2, (byte) 0);
        }
    }

    public static final m97 b0(kka kkaVar) {
        kkaVar.getClass();
        long j2 = kkaVar.f18426a;
        teo teoVar = kkaVar.j;
        c9a0 c9a0Var = teoVar.c;
        long j3 = c9a0Var.f3953a;
        String str = c9a0Var.b;
        long j4 = teoVar.f33830a;
        long j5 = teoVar.i;
        double d2 = teoVar.d;
        return new m97(j2, (int) kkaVar.l.f36034a, (izc) null, false, false, j3, str, j4, j5, d2, d2, teoVar.e, teoVar.g, (String) null, (String) null, (String) null, false, false, false, 0L, false, (zfa0) null, false, 0.0d, (String) null, 67100700);
    }

    public static final void c(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(855609641);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "BONUS_AGREEMENT_TAG");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.bonus_promotions, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSeparator60()));
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new to6(function1, (byte) 24);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            boolean z2 = ((id8) l7m0Var.getValue()).b && ((id8) l7m0Var.getValue()).f14570a;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new to6(function2, (byte) 25);
                fetVar.o0(objP2);
            } else {
                function2 = function1;
            }
            l7m0Var2 = l7m0Var;
            mom.c(null, z2, womVarF, null, false, null, (Function0) objP2, null, u1c.M(552158506, new xs4(l7m0Var2, function2, (byte) 1), fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
            fetVar.r(true);
        } else {
            function2 = function1;
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var2, function2, i2, (byte) 15);
        }
    }

    public static final fem c0(x1w x1wVar, boolean z, boolean z2) {
        x1wVar.getClass();
        if (!x1wVar.s || !z) {
            return null;
        }
        if (cy7.c() && z2) {
            return null;
        }
        return new fem(cfx0.N(x1wVar.m));
    }

    public static final void d(mm40 mm40Var, ra9 ra9Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-656260163);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ra9Var) ? 32 : 16;
        }
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
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
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new bx(b2, backgroundContent);
                fetVar2.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(rq8.K(jm40Var, (Function1) objP), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, qmk.a(fetVar2).d, 8.0f);
            a4x a4xVar = ra9Var.b;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new ej8((byte) 11);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new d69(b3);
                fetVar2.o0(objP3);
            }
            ibc.o(mm40VarK, a4xVar, null, false, function0, (Function1) objP3, fetVar2, 224256, 4);
            v8q0.a(rsm0.w(R.string.players_duel_build_your_teams_title, 0, fetVar2), s5x0.K(o7k0.d(jm40Var, 1.0f), qmk.a(fetVar2).e, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            byte b4 = 2;
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.d(new x7z(1.0f, true), 1.0f), qmk.a(fetVar2).d, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar2, 0, 1)));
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.next, 0, fetVar2)), false, false, false), rk.n)));
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new d69(b4);
                fetVar2.o0(objP4);
            }
            bkb.f(mm40VarD2, mtlVar, null, false, null, (Function1) objP4, fetVar2, 196614, 28);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            boolean zF2 = fetVar2.f(backgroundContent);
            Object objP5 = fetVar2.P();
            if (zF2 || objP5 == cl5Var) {
                objP5 = new bx((byte) 17, backgroundContent);
                fetVar2.o0(objP5);
            }
            zq8.a(0, fetVar2, o7k0.e(rq8.K(mm40VarD3, (Function1) objP5), 12.0f));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) ra9Var, i2, (byte) 28);
        }
    }

    public static final String d0(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final void e(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i2, int i3) {
        nw3 nw3Var = uc9.e;
        if ((i3 & 2) != 0) {
            nw3Var = uc9.g;
        }
        if ((i3 & 4) != 0) {
            ugdVar = null;
        }
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = s5x0.L(mm40Var, qmk.a(fetVar).d, 0.0f, 2).e(o7k0.c);
        x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, ((i2 & 112) >> 3) & 14);
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
        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
        Object obj = y5d.f42040a;
        if (ugdVar == null) {
            fetVar.e0(2031785276);
        } else {
            fetVar.e0(619730789);
            ugdVar.j(obj, mm40VarD, fetVar, Integer.valueOf((i2 & 896) | 54));
        }
        fetVar.r(false);
        ugdVar2.j(obj, mm40VarD, fetVar, Integer.valueOf(54 | ((i2 >> 3) & 896)));
        fetVar.e0(619734181);
        ugdVar3.j(obj, s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 4.0f, 7), fetVar, Integer.valueOf(6 | ((i2 >> 6) & 896)));
        fetVar.r(false);
        fetVar.r(true);
    }

    public static final void g(tkp0 tkp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1003655205);
        byte b2 = 2;
        int i3 = (fetVar.g(tkp0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            int iOrdinal = tkp0Var.c.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(253226890);
                u4n0.g(0, fetVar);
                r(tkp0Var, function1, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw b1j.f(-1377306536, fetVar, false);
                }
                fetVar.e0(253421818);
                k5n0.h(0, fetVar, tkp0Var.c == zkp0.b);
                z(tkp0Var, function1, fetVar, i3 & 126);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mkp0(tkp0Var, function1, i2, b2);
        }
    }

    public static final void h(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1812540511);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zbt0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(jm40.b, mdmVar, false, (Function0) objP, fetVar, 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 11);
        }
    }

    public static final void i(y5d y5dVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        fetVar2.g0(1449471590);
        if ((i2 & 48) == 0) {
            i3 = (fetVar2.g(l7m0Var) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (!fetVar2.U(i3 & 1, (i3 & 1169) != 1168)) {
            fetVar2.X();
        } else if (((hqe) l7m0Var.getValue()).f13482a) {
            fetVar2.e0(-392818615);
            sj3.m(0, 0L, fetVar2, null);
            fetVar2.r(false);
        } else if (((hqe) l7m0Var.getValue()).b.isEmpty()) {
            fetVar2.e0(-392694832);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13).e(((Boolean) l7m0Var2.getValue()).booleanValue() ? o7k0.c : o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3)), x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
            jcb.l(o7k0.e(jm40Var, 68.0f), new mdm(R.string.lottie_prophylaxis, pdm.c, null, R.drawable.ic_glyph_circle_favourite_secondary_60, 0, R.string.nothing_found, 0, 0, 0L, 0L, 980), false, null, fetVar2, 0, 12);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-391512957);
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            mm40 mm40VarV = cjx.V(o7k0.c, a8k0.G(xczVarA, fetVar2), null);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, (byte) 4);
                fetVar2.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 16, i2, (Object) y5dVar, (Object) l7m0Var, (Object) l7m0Var2, (Object) function1);
        }
    }

    public static final void j(mm40 mm40Var, akl aklVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-1765474106);
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
            fetVar.e0(930689973);
            k(mm40Var, (yjl) aklVar, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!(aklVar instanceof zjl)) {
                throw b1j.f(-108527213, fetVar, false);
            }
            fetVar.e0(930943522);
            m(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ljl(mm40Var, aklVar, function1, i2, (byte) 2);
        }
    }

    public static final void k(mm40 mm40Var, yjl yjlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-1334424301);
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
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jeb.o(o7k0.d(mm40Var, 1.0f), 0, 0.0f, 0.0f, u1c.M(-1642968703, new mjl(yjlVar, function1, b2), fetVar), fetVar, 24576, 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njl(mm40Var, yjlVar, function1, i2, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, bkl bklVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        bkl bklVar2;
        mm40 mm40Var2;
        fetVar.g0(-1022286866);
        int i3 = i2 | 6 | (fetVar.g(bklVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 148.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ojl(function1, bklVar, (byte) 2);
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
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
                objP2 = ju70.T(pm80VarF, null, new j2l((byte) 10), 6);
                fetVar.o0(objP2);
            }
            pm80 pm80Var = (pm80) objP2;
            bklVar2 = bklVar;
            mm40Var2 = jm40Var;
            k7x.b(bklVar2.b.a(), null, o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 84.0f)), ((ThemeColors) fetVar.k(zfnVar)).getSecondary20(), ljcVar), "DS_BANNER_IMAGE"), pm80Var, pm80Var, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            fetVar2 = fetVar;
            K(o7k0.c, bklVar2, fetVar2, 6 | i4);
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
            yfe0VarU.d = new pjl(mm40Var2, bklVar2, function1, i2, (byte) 1);
        }
    }

    public static final void m(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1118991637);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarE = o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 148.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 148.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
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
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 148.0f)), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 148.0f)), vbc.d0(null, fetVar, 0, 1)));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, b2);
        }
    }

    public static final void n(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1979940222);
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
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new s8o(function1, (byte) 22);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 12);
        }
    }

    public static final void o(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1402163668);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(jr8.f16991a.b(jm40Var, gqw0.e), mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 12);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 13);
        }
    }

    public static final void p(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1398117160);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
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
                objP = new g4p0(function1, (byte) 11);
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

    public static final void q(mm40 mm40Var, l7m0 l7m0Var, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        bdzVar.getClass();
        function2.getClass();
        fetVar2.g0(-1576703246);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.g(bdzVar) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new s8o(function2, (byte) 19);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new s8o(function2, (byte) 20);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
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
            imm immVarA = ((b3p) l7m0Var.getValue()).a();
            boolean z4 = i4 == 2048;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new s8o(function2, (byte) 21);
                fetVar2.o0(objP3);
            }
            hlm.c(null, immVarA, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            b3p b3pVar = (b3p) l7m0Var.getValue();
            if (b3pVar != null) {
                if (b3pVar instanceof z2p) {
                    fetVar2.e0(-2017965352);
                    w(null, (z2p) b3pVar, bdzVar, function2, fetVar2, i3 & 8064);
                    function2 = function2;
                    fetVar2.r(false);
                } else {
                    z = false;
                    if (b3pVar instanceof a3p) {
                        fetVar2.e0(-2017723893);
                        F(0, fetVar2, null);
                        fetVar2.r(false);
                    } else if (b3pVar instanceof y2p) {
                        fetVar2.e0(-2017561639);
                        n(o7k0.c, ((y2p) b3pVar).f41916a, function2, fetVar2, ((i3 >> 3) & 896) | 6);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-1589118529, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u2p(mm40Var, l7m0Var, bdzVar, function2, i2, (byte) 0);
        }
    }

    public static final void r(tkp0 tkp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(354211320);
        int i3 = (fetVar.g(tkp0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        int i4 = 0;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVar = new xcz(i4, 3, i4);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7);
            int i5 = ((i3 & 14) == 4 ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object objP = fetVar.P();
            if (i5 != 0 || objP == ukd.f35823a) {
                objP = new lkp0(tkp0Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mkp0(tkp0Var, function1, i2, b2);
        }
    }

    public static final void s(final vhp vhpVar, final boolean z, final boolean z2, final boolean z3, final Function1 function1, fet fetVar, final int i2) {
        ugg0 ugg0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(2079132454);
        int i3 = i2 | (fetVar2.g(vhpVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.h(z2) ? 256 : 128) | (fetVar2.h(z3) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 32.0f, 0.0f, 16.0f, 8.0f, 2);
            m6l0 m6l0Var = vhpVar.i;
            boolean z4 = vhpVar.j;
            boolean z5 = ((i3 & 14) == 4) | ((57344 & i3) == 16384);
            Object objP = fetVar2.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new bw20((Object) function1, (Object) vhpVar, (byte) 12);
                fetVar2.o0(objP);
            }
            vic.g(mm40VarN, m6l0Var, z4, (Function1) objP, fetVar2, 0);
            fetVar2 = fetVar2;
            if (z || !z2) {
                fetVar2.e0(13040178);
                fetVar2.r(false);
            } else {
                fetVar2.e0(12698713);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), z3 ? 64.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar2, 6, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(z, z2, z3, function1, i2) { // from class: a.xp30
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ny9.s(this.f41250a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void t(boolean z, boolean z2, boolean z3, fet fetVar, int i2) {
        ugg0 ugg0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-151483073);
        int i3 = (fetVar2.h(z) ? 4 : 2) | i2 | (fetVar2.h(z2) ? 32 : 16) | (fetVar2.h(z3) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            vic.g(s5x0.N(jm40Var, 32.0f, 0.0f, 16.0f, 8.0f, 2), new l6l0(), false, null, fetVar, 12);
            fetVar2 = fetVar;
            if (z || !z2) {
                fetVar2.e0(512946457);
                fetVar2.r(false);
            } else {
                fetVar2.e0(512604992);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), z3 ? 64.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar2, 6, 4);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wp30(i2, z, z2, z3);
        }
    }

    public static final void u(xkp xkpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        fetVar.g0(-1292362792);
        int i3 = i2 | (fetVar.g(xkpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = xkpVar.h;
            boolean z4 = xkpVar.j;
            byte b2 = 3;
            if (z3) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = xkpVar.i ? new of5() : null;
            }
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (!z2 || z4) {
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.i;
                zcl zclVar6 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar5, zclVar5);
            }
            String str = xkpVar.b;
            zfn zfnVar = zaq0.b;
            a7l0 a7l0Var = new a7l0(new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), xkpVar.f, xkpVar.e, null, of5Var, xkpVar.j, Integer.valueOf(xkpVar.g.size()), 24);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(o2e.e0(jm40Var, "SPORT_CELL"), 4.0f, z ? 8.0f : 0.0f, 4.0f, (!z2 || z4) ? 0.0f : 8.0f);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new tvy(function1, xkpVar, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z6 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new uvy(function1, xkpVar, b2);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, a7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z4 || z2) {
                fetVar.e0(1284037172);
                fetVar.r(false);
            } else {
                fetVar.e0(1283818715);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tp30(xkpVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void v(alp alpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        fetVar.g0(-779983428);
        int i3 = i2 | (fetVar.g(alpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = alpVar.c;
            boolean z4 = alpVar.d;
            pf5 pf5Var = z3 ? new pf5(3, null) : null;
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (!z2 || z4) {
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.i;
                zcl zclVar6 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar5, zclVar5);
            }
            String str = alpVar.f1079a;
            zfn zfnVar = zaq0.b;
            a7l0 a7l0Var = new a7l0(new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), alpVar.b, null, Integer.valueOf(R.drawable.ic_glyph_express), pf5Var, alpVar.d, null, 148);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, z ? 8.0f : 0.0f, 4.0f, (!z2 || z4) ? 0.0f : 8.0f);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new wvy(function1, alpVar, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z6 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new xvy(function1, alpVar, (byte) 3);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, a7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z4 || z2) {
                fetVar.e0(-842370320);
                fetVar.r(false);
            } else {
                fetVar.e0(-842588777);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sp30(alpVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, z2p z2pVar, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-1346739469);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(z2pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarB = bdzVar.b("FAVORITE_ALT_CHAMP_SCREEN", fetVar);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 16.0f, qmk.a(fetVar).c, 32.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qzn(z2pVar, function1, (byte) 27);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, xczVarB, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, i3 & 14, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 1, i2, (Object) mm40Var2, (Object) z2pVar, (Object) bdzVar, (Object) function1);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(88011137);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = Integer.valueOf(iB);
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new m3a0((byte) 4, iIntValue, fqj0VarD0);
                fetVar.o0(objP2);
            }
            b8k0.e(n0qVar, null, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 12582918, 378);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i2, (byte) 2);
        }
    }

    public static final void y(slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        zcz zczVar2;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(1249129301);
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
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f2 = slpVar.e;
            float f3 = xfn.a(fetVar).d;
            float f4 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f3, f2, f4, z ? 12.0f : 24.0f);
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new svy(slpVar, function1, z, (byte) 2);
                fetVar.o0(objP);
            }
            bfb.e(mm40VarQ, slpVar, lh80Var, j700Var, zczVar2, function1, (Function1) objP, fetVar, i3 & 523376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvy(slpVar, z, j700Var, zczVar, function1, i2, (byte) 3);
        }
    }

    public static final void z(tkp0 tkp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(547693249);
        int i3 = (fetVar.g(tkp0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVar = new xcz(b2, 3, b2);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new lkp0(tkp0Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mkp0(tkp0Var, function1, i2, b2);
        }
    }
}
