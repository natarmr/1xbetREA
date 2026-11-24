package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.InputConfiguration;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f1t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f8782a = new ugd(207158977, false, new wgd(17));
    public static final ugd b = new ugd(1627323240, false, new chd(1));
    public static final ugd c = new ugd(207605094, false, new fhd(9));
    public static final ugd d = new ugd(-847086994, false, new mhd(7));
    public static final ugd e = new ugd(1727593256, false, new shd(0));
    public static final mtc f = new mtc();
    public static final Object g = new Object();
    public static final boolean[] h = new boolean[3];
    public static final Feature i;
    public static final Feature j;
    public static final Feature k;
    public static final Feature[] l;

    static {
        Feature feature = new Feature(-1, 1L, "commit_to_configuration_v2_api", true);
        i = feature;
        Feature feature2 = new Feature(-1, 1L, "get_serving_version_api", true);
        Feature feature3 = new Feature(-1, 1L, "get_experiment_tokens_api", true);
        Feature feature4 = new Feature(-1, 2L, "register_flag_update_listener_api", true);
        j = feature4;
        Feature feature5 = new Feature(-1, 1L, "sync_after_api", true);
        Feature feature6 = new Feature(-1, 1L, "sync_after_for_application_api", true);
        Feature feature7 = new Feature(-1, 1L, "set_app_wide_properties_api", true);
        Feature feature8 = new Feature(-1, 1L, "set_runtime_properties_api", true);
        Feature feature9 = new Feature(-1, 1L, "get_storage_info_api", true);
        k = feature9;
        l = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }

    public static final void A(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(114951542);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new npa0((byte) 28);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
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
            kpb.j(null, null, fetVar, 0, 3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 10);
        }
    }

    public static final void B(mac0 mac0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fetVar.g0(-315180603);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(mac0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        int i4 = i3;
        byte b2 = 0;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "PROMO_CHECK_SCREEN_COLUMN");
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.check_promocode_title, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSeparator60()));
            boolean z2 = (i4 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bac0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            if (mac0Var != null) {
                if (mac0Var instanceof kac0) {
                    fetVar.e0(-2004976061);
                    int i5 = i4 << 3;
                    t((kac0) mac0Var, function1, fetVar, 6 | (i5 & 112) | (i5 & 896));
                    fetVar.r(false);
                } else {
                    z = false;
                    if (mac0Var instanceof lac0) {
                        fetVar.e0(-2004786620);
                        int i6 = i4 << 3;
                        D((lac0) mac0Var, function1, fetVar, 6 | (i6 & 112) | (i6 & 896));
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-2004341019, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mac0Var, (Object) function1, i2, (byte) 16);
        }
    }

    public static final void C(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-758972862);
        int i3 = (fetVar.g(l7m0Var) ? 32 : 16) | i2 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mac0 mac0Var = (mac0) l7m0Var.getValue();
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarK0 = j120.k0(mm40VarQ, new dnz(new ujo(zcm0.i(fetVar).c, zcm0.i(fetVar).e), 32));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            B(mac0Var, function1, fetVar, (i3 >> 3) & 112);
            if ((mac0Var instanceof kac0) && ((kac0) mac0Var).e) {
                fetVar.e0(-519060614);
                A(0, fetVar, k7n0.H(jr8.f16991a.a(jm40.b), 1.0f));
                fetVar.r(false);
            } else {
                fetVar.e0(-518895322);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 22);
        }
    }

    public static final void D(lac0 lac0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-52904572);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(y5d.f42040a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(lac0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            o(null, u1c.M(1156740859, new p0z((Object) lac0Var, (byte) 28), fetVar), fetVar, (i3 & 14) | 384);
            String str = lac0Var.f19699a;
            boolean z = lac0Var.b;
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bac0(function1, b2);
                fetVar.o0(objP);
            }
            vdx.r(0, fetVar, null, str, (Function0) objP, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) lac0Var, (Object) function1, i2, (byte) 17);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        fet fetVar2;
        xcz xczVar;
        Function1 function2 = function1;
        fetVar.g0(-2071097616);
        byte b2 = 2;
        byte b3 = 16;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ojr0(l7m0Var, (byte) 14));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var3 = (l7m0) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(pkk0Var);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP2 == cl5Var) {
                objP2 = new pig(xczVarA, pkk0Var, yjeVar, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(((bls0) l7m0Var.getValue()).c);
            int i4 = i3 & 112;
            boolean zG2 = ((i3 & 14) == 4) | fetVar.g(xczVarA) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                xczVar = xczVarA;
                ygz ygzVar = new ygz(l7m0Var, xczVar, function2, yjeVar, (byte) 2);
                fetVar.o0(ygzVar);
                objP3 = ygzVar;
            } else {
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            iks0 iks0Var = (iks0) l7m0Var3.getValue();
            if (Intrinsics.d(iks0Var, gks0.f11459a)) {
                fetVar.e0(1431980853);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new ojr0(l7m0Var2, (byte) 15));
                    fetVar.o0(objP4);
                }
                l7m0 l7m0Var4 = (l7m0) objP4;
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = jgk0.b(new ojr0(l7m0Var, b3));
                    fetVar.o0(objP5);
                }
                function2 = function1;
                fetVar2 = fetVar;
                F(l7m0Var4, (l7m0) objP5, xczVar, function2, fetVar2, ((i3 << 6) & 7168) | 54);
                fetVar2.r(false);
            } else {
                function2 = function1;
                fetVar2 = fetVar;
                if (!(iks0Var instanceof hks0)) {
                    throw b1j.f(-1754924632, fetVar2, false);
                }
                fetVar2.e0(1432498243);
                hks0 hks0Var = (hks0) iks0Var;
                boolean zF = fetVar2.f(hks0Var.f13223a);
                Object objP6 = fetVar2.P();
                if (zF || objP6 == cl5Var) {
                    objP6 = jgk0.b(new qir0(hks0Var, (byte) 19));
                    fetVar2.o0(objP6);
                }
                p((l7m0) objP6, function2, fetVar2, i4);
                fetVar2.r(false);
            }
        } else {
            l7m0Var2 = l7m0Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var2, function2, i2, (byte) 8);
        }
    }

    public static final void F(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var3;
        int i3;
        l7m0 l7m0Var4;
        fetVar.g0(2032179443);
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
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), z, null, u1c.M(889762549, new nc40(function1, (byte) 20), fetVar), fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgz(l7m0Var, l7m0Var4, xczVar, function1, i2, (byte) 2);
        }
    }

    public static final void G(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1791296439);
        byte b2 = 2;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((a9i0) l7m0Var.getValue()).f479a) {
            fetVar.e0(456666372);
            f(((a9i0) l7m0Var.getValue()).d, ((a9i0) l7m0Var.getValue()).e, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(456593274);
            n(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, b2);
        }
    }

    public static final void H(qln0 qln0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-87113047);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(qln0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (!fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.X();
        } else if (qln0Var instanceof lln0) {
            fetVar.e0(-1024388366);
            lln0 lln0Var = (lln0) qln0Var;
            v(lln0Var.f20256a, lln0Var.b, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!qln0Var.equals(kln0.f18499a)) {
                throw b1j.f(-2111257045, fetVar, false);
            }
            fetVar.e0(-1024188137);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(qln0Var, i2, (byte) 6);
        }
    }

    public static final void I(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-2040453227);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarR = knm0.r(o050.X(jm40Var));
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarR.e(n0qVar);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), new plm(((pvn0) l7m0Var.getValue()).f27670a.f39664a, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_refresh, true, ra50.f30118a, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                function2 = function1;
                objP = new opm0(function2, (byte) 19);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new zbm0(function2, (byte) 14);
                fetVar2.o0(objP2);
            }
            b2 = 19;
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 54, 981);
            fetVar2 = fetVar;
            fvn0 fvn0Var = ((pvn0) l7m0Var.getValue()).b;
            if (fvn0Var instanceof cvn0) {
                fetVar2.e0(1662869668);
                r(((cvn0) fvn0Var).f5039a, function2, fetVar2, i4);
                fetVar2.r(false);
            } else {
                if (fvn0Var instanceof dvn0) {
                    fetVar2.e0(9509049);
                    dvn0 dvn0Var = (dvn0) fvn0Var;
                    Function1 function3 = function2;
                    y(n0qVar, dvn0Var.f6753a, dvn0Var.b, dvn0Var.c, function3, fetVar2, ((i3 << 9) & 57344) | 6);
                    function2 = function3;
                    fetVar2.r(false);
                } else {
                    i2 = i2;
                    b2 = 19;
                    if (!(fvn0Var instanceof evn0)) {
                        throw b1j.f(1662867064, fetVar2, false);
                    }
                    fetVar2.e0(1662884910);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                    kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), 3), fetVar2, 0, 0);
                    z = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                fetVar2.r(z);
            }
            z = true;
            fetVar2.r(z);
        } else {
            i2 = i2;
            function2 = function1;
            b2 = 19;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function2, i2, b2);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1915141449);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "TRANSFERS_SCREEN_COLUMN");
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
            nsm0.i(((bls0) l7m0Var.getValue()).f2809a, function1, fetVar, i3 & 112);
            E(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 7);
        }
    }

    public static String K(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (g) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace(Separators.HT, "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbT = brm0.t(str, "\n  ");
        sbT.append(strReplace.replace(Separators.RETURN, "\n  "));
        sbT.append('\n');
        return sbT.toString();
    }

    public static final CharSequence L(CharSequence charSequence) {
        CharSequence charSequenceSubSequence;
        charSequence.getClass();
        if (!by7.c().f3402a) {
            return charSequence;
        }
        int length = charSequence.length();
        while (true) {
            length--;
            if (-1 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            String strValueOf = String.valueOf(charSequence.charAt(length));
            if (!Intrinsics.d(strValueOf, Separators.SP) && !Intrinsics.d(strValueOf, Separators.DOT)) {
                charSequenceSubSequence = charSequence.subSequence(0, length + 1);
                break;
            }
        }
        String string = charSequence.subSequence(charSequenceSubSequence.length(), charSequence.length()).toString();
        if (!StringsKt.S(charSequence, string)) {
            return "\u200f" + ((Object) charSequence);
        }
        return "\u200f" + string + ((Object) charSequenceSubSequence);
    }

    public static void M(l4e l4eVar, p900 p900Var, k4e k4eVar) {
        k4eVar.p = -1;
        w2e w2eVar = k4eVar.N;
        w2e w2eVar2 = k4eVar.M;
        w2e w2eVar3 = k4eVar.K;
        w2e w2eVar4 = k4eVar.L;
        w2e w2eVar5 = k4eVar.J;
        k4eVar.q = -1;
        j4e j4eVar = l4eVar.U[0];
        j4e j4eVar2 = j4e.d;
        j4e j4eVar3 = j4e.b;
        if (j4eVar != j4eVar3 && k4eVar.U[0] == j4eVar2) {
            int i2 = w2eVar5.g;
            int iS = l4eVar.s() - w2eVar4.g;
            w2eVar5.i = p900Var.k(w2eVar5);
            w2eVar4.i = p900Var.k(w2eVar4);
            p900Var.d(w2eVar5.i, i2);
            p900Var.d(w2eVar4.i, iS);
            k4eVar.p = 2;
            k4eVar.a0 = i2;
            int i3 = iS - i2;
            k4eVar.W = i3;
            int i4 = k4eVar.d0;
            if (i3 < i4) {
                k4eVar.W = i4;
            }
        }
        if (l4eVar.U[1] == j4eVar3 || k4eVar.U[1] != j4eVar2) {
            return;
        }
        int i5 = w2eVar3.g;
        int iM = l4eVar.m() - w2eVar2.g;
        w2eVar3.i = p900Var.k(w2eVar3);
        w2eVar2.i = p900Var.k(w2eVar2);
        p900Var.d(w2eVar3.i, i5);
        p900Var.d(w2eVar2.i, iM);
        if (k4eVar.c0 > 0 || k4eVar.i0 == 8) {
            ukk0 ukk0VarK = p900Var.k(w2eVar);
            w2eVar.i = ukk0VarK;
            p900Var.d(ukk0VarK, k4eVar.c0 + i5);
        }
        k4eVar.q = 2;
        k4eVar.b0 = i5;
        int i6 = iM - i5;
        k4eVar.X = i6;
        int i7 = k4eVar.e0;
        if (i6 < i7) {
            k4eVar.X = i7;
        }
    }

    public static final Type N(kiy kiyVar, boolean z) {
        fhy fhyVarO = kiyVar.o();
        if (fhyVarO instanceof miy) {
            miy miyVar = (miy) fhyVarO;
            GenericDeclaration genericDeclaration = (GenericDeclaration) miyVar.b.getValue();
            if (genericDeclaration == null) {
                v4i0.j(kiyVar, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (Intrinsics.d(typeVariable2.getName(), ((niy) miyVar).d)) {
                    if (z2) {
                        jf4.o("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                typeVariable.getClass();
                return typeVariable;
            }
            v4i0.o("Array contains no element matching the predicate.");
            return null;
        }
        if (!(fhyVarO instanceof sgy)) {
            v4i0.j(kiyVar, "Unsupported type classifier: ");
            return null;
        }
        sgy sgyVar = (sgy) fhyVarO;
        Class clsH = z ? azw.H(sgyVar) : azw.G(sgyVar);
        List listM = kiyVar.M();
        if (listM.isEmpty()) {
            return clsH;
        }
        if (!clsH.isArray()) {
            return O(clsH, listM);
        }
        if (clsH.getComponentType().isPrimitive()) {
            return clsH;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.x0(listM);
        if (kTypeProjection == null) {
            e9d0.i(kiyVar, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        uiy uiyVar = kTypeProjection.f46069a;
        kiy kiyVar2 = kTypeProjection.b;
        int i2 = uiyVar == null ? -1 : d1t0.f5327a[uiyVar.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return clsH;
        }
        if (i2 != 2 && i2 != 3) {
            t9f.b();
            return null;
        }
        kiyVar2.getClass();
        Type typeN = N(kiyVar2, false);
        return typeN instanceof Class ? clsH : new ujt(typeN);
    }

    public static final to80 O(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(W((KTypeProjection) it.next()));
            }
            return new to80(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(W((KTypeProjection) it2.next()));
            }
            return new to80(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        to80 to80VarO = O(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(r3d.q(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(W((KTypeProjection) it3.next()));
        }
        return new to80(cls, to80VarO, arrayList3);
    }

    public static void P(String str, String str2) {
        synchronized (g) {
            Log.d(str, K(str2, null));
        }
    }

    public static void Q(String str, String str2) {
        synchronized (g) {
            Log.e(str, K(str2, null));
        }
    }

    public static void R(String str, String str2, Throwable th) {
        synchronized (g) {
            Log.e(str, K(str2, th));
        }
    }

    public static final boolean S(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final String T(d0t d0tVar, dmr dmrVar) {
        Object objPrevious;
        List list = d0tVar.p.n;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((cmr) objPrevious).f4620a != dmrVar);
        cmr cmrVar = (cmr) objPrevious;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static final a4x U(d0t d0tVar) {
        List listG0 = nia0.g0(T(d0tVar, dmr.r));
        ArrayList arrayList = new ArrayList(r3d.q(listG0, 10));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Iterable iterableG0 = arrayList;
        if (zIsEmpty) {
            iterableG0 = dyb.g0(Integer.valueOf(R.drawable.ic_card_shirt));
        }
        return dyb.o0(iterableG0);
    }

    public static final String V(d0t d0tVar, ctf0 ctf0Var) {
        return ctf0Var.b.a(obc.P(T(d0tVar, dmr.B).equals("2"), T(d0tVar, dmr.u), d0tVar.v, d0tVar.n), Arrays.copyOf(new Object[0], 0));
    }

    public static final Type W(KTypeProjection kTypeProjection) {
        uiy uiyVar = kTypeProjection.f46069a;
        if (uiyVar == null) {
            ogv0.c.getClass();
            return ogv0.d;
        }
        kiy kiyVar = kTypeProjection.b;
        kiyVar.getClass();
        int iOrdinal = uiyVar.ordinal();
        if (iOrdinal == 0) {
            return N(kiyVar, true);
        }
        if (iOrdinal == 1) {
            return new ogv0(null, N(kiyVar, true));
        }
        if (iOrdinal == 2) {
            return new ogv0(N(kiyVar, true), null);
        }
        t9f.b();
        return null;
    }

    public static final a4x X(d0t d0tVar) {
        List listG0 = nia0.g0(T(d0tVar, dmr.s));
        ArrayList arrayList = new ArrayList(r3d.q(listG0, 10));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Iterable iterableG0 = arrayList;
        if (zIsEmpty) {
            iterableG0 = dyb.g0(Integer.valueOf(R.drawable.ic_card_shirt));
        }
        return dyb.o0(iterableG0);
    }

    public static final o0x Y(Context context, m0x m0xVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        context.getClass();
        Drawable drawableU = epv0.U(m0xVar.f20977a, context);
        if (drawableU == null) {
            return m0xVar;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableMutate = colorDrawable.mutate();
        colorDrawable.setBounds(0, 0, i2, i3);
        drawableMutate.draw(canvas);
        Drawable drawableMutate2 = drawableU.mutate();
        drawableMutate2.setTint(i7);
        drawableMutate2.setBounds(0, 0, i4, i5);
        int iSave = canvas.save();
        canvas.translate((i2 - i4) / 2.0f, (i3 - i5) / 2.0f);
        try {
            drawableMutate2.draw(canvas);
            canvas.restoreToCount(iSave);
            Resources resources = context.getResources();
            resources.getClass();
            return new l0x(new BitmapDrawable(resources, bitmapCreateBitmap));
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x015e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0150  */
    public static final void a(mm40 mm40Var, final String str, final long j2, n05 n05Var, long j3, nrq nrqVar, long j4, f2q0 f2q0Var, long j5, final int i2, boolean z, final int i3, int i4, final y9q0 y9q0Var, long j6, fet fetVar, final int i5, final int i6) {
        mm40 mm40Var2;
        int i7;
        nrq nrqVar2;
        int i8;
        int i9;
        f2q0 f2q0Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        final n05 n05Var2;
        final long j7;
        final boolean z3;
        final int i17;
        final long j8;
        final mm40 mm40Var3;
        final nrq nrqVar3;
        final f2q0 f2q0Var3;
        final long j9;
        final long j10;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        n05 n05Var3;
        long j11;
        long j12;
        long j13;
        int i18;
        long j14;
        long j15;
        int i19;
        long j16;
        long j17;
        boolean z4;
        int i20;
        long j18;
        byte directionality;
        str.getClass();
        fetVar.g0(1204254275);
        int i21 = i6 & 1;
        if (i21 != 0) {
            i7 = i5 | 6;
            mm40Var2 = mm40Var;
        } else if ((i5 & 6) == 0) {
            mm40Var2 = mm40Var;
            i7 = (fetVar.g(mm40Var2) ? 4 : 2) | i5;
        } else {
            mm40Var2 = mm40Var;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= fetVar.f(j2) ? 256 : 128;
        }
        int i22 = i6 & 8;
        if (i22 != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= (i5 & 4096) == 0 ? fetVar.g(n05Var) : fetVar.i(n05Var) ? 2048 : 1024;
        }
        int i23 = 1794048 | i7;
        int i24 = i6 & 128;
        int i25 = 4194304;
        if (i24 == 0) {
            if ((12582912 & i5) == 0) {
                nrqVar2 = nrqVar;
                i23 |= fetVar.g(nrqVar2) ? 8388608 : 4194304;
            }
            i8 = i23 | 905969664;
            i9 = i6 & 1024;
            if (i9 != 0) {
                i11 = 24966;
                f2q0Var2 = f2q0Var;
            } else {
                f2q0Var2 = f2q0Var;
                if (fetVar.g(f2q0Var2)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i11 = 24960 | i10;
            }
            i12 = i6 & 2048;
            if (i12 != 0) {
                i14 = i11 | 48;
            } else {
                if (fetVar.f(j5)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i14 = i11 | i13;
            }
            int i26 = i14 | 199680;
            if (fetVar.g(y9q0Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            int i27 = i26 | i15;
            if ((i6 & 131072) == 0 && fetVar.f(j6)) {
                i25 = 8388608;
            }
            i16 = i27 | i25 | 100663296;
            if ((i8 & 306783379) == 306783378 || (i16 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i8 & 1, z2)) {
                fetVar.Z();
                if ((i5 & 1) != 0 || fetVar.B()) {
                    if (i21 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i22 != 0) {
                        n05Var3 = null;
                    } else {
                        n05Var3 = n05Var;
                    }
                    j11 = daq0.c;
                    if (i24 != 0) {
                        nrqVar2 = null;
                    }
                    if (i9 != 0) {
                        f2q0Var2 = null;
                    }
                    if (i12 != 0) {
                        j12 = j11;
                    } else {
                        j12 = j5;
                    }
                    if ((i6 & 131072) != 0) {
                        j13 = qmk.p;
                        i16 &= -29360129;
                    } else {
                        j13 = j6;
                    }
                    i18 = 1;
                    j14 = j12;
                    j15 = j13;
                    i19 = i16;
                    j16 = j11;
                    j17 = j16;
                    z4 = true;
                } else {
                    fetVar.X();
                    if ((i6 & 131072) != 0) {
                        i16 &= -29360129;
                    }
                    j17 = j3;
                    j16 = j4;
                    j14 = j5;
                    i18 = i4;
                    j15 = j6;
                    mm40Var4 = mm40Var2;
                    i19 = i16;
                    n05Var3 = n05Var;
                    z4 = z;
                }
                fetVar.s();
                i20 = 0;
                while (true) {
                    if (i20 < str.length()) {
                        j18 = j17;
                        break;
                    }
                    directionality = Character.getDirectionality(str.charAt(i20));
                    if (directionality != 1 || directionality == 2) {
                        j18 = j15;
                        break;
                    }
                    i20++;
                }
                n05 n05Var4 = n05Var3;
                v8q0.a(str, o2e.e0(mm40Var4, "ADAPTIVE_TEXT"), j2, n05Var4, j18, null, null, nrqVar2, j16, f2q0Var2, j14, i2, z4, i3, i18, null, y9q0Var, fetVar, (i8 & 896) | ((i8 >> 3) & 14) | (i8 & 7168) | ((i8 << 3) & 458752) | (3670016 & i8) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (524286 & i19) | 1572864 | ((i19 << 3) & 29360128), 0);
                n05Var2 = n05Var4;
                nrqVar3 = nrqVar2;
                j9 = j16;
                f2q0Var3 = f2q0Var2;
                j10 = j14;
                z3 = z4;
                i17 = i18;
                j7 = j17;
                j8 = j15;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                n05Var2 = n05Var;
                j7 = j3;
                z3 = z;
                i17 = i4;
                j8 = j6;
                mm40Var3 = mm40Var2;
                nrqVar3 = nrqVar2;
                f2q0Var3 = f2q0Var2;
                j9 = j4;
                j10 = j5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.lp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i5 | 1);
                        mm40 mm40Var5 = mm40Var3;
                        String str2 = str;
                        long j19 = j2;
                        n05 n05Var5 = n05Var2;
                        long j20 = j7;
                        nrq nrqVar4 = nrqVar3;
                        long j21 = j9;
                        f2q0 f2q0Var4 = f2q0Var3;
                        long j22 = j10;
                        byte b2 = i2;
                        boolean z5 = z3;
                        int i28 = i3;
                        boolean z6 = i17;
                        y9q0 y9q0Var2 = y9q0Var;
                        long j23 = j8;
                        int i29 = i6;
                        f1t0.a(mm40Var5, str2, j19, n05Var5, j20, nrqVar4, j21, f2q0Var4, j22, b2, z5, i28, z6 ? 1 : 0, y9q0Var2, j23, (fet) obj, iL, i29);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i23 = 14376960 | i7;
        nrqVar2 = nrqVar;
        i8 = i23 | 905969664;
        i9 = i6 & 1024;
        if (i9 != 0) {
            i11 = 24966;
            f2q0Var2 = f2q0Var;
        } else {
            f2q0Var2 = f2q0Var;
            if (fetVar.g(f2q0Var2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i11 = 24960 | i10;
        }
        i12 = i6 & 2048;
        if (i12 != 0) {
            i14 = i11 | 48;
        } else {
            if (fetVar.f(j5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i14 = i11 | i13;
        }
        int i28 = i14 | 199680;
        if (fetVar.g(y9q0Var)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i29 = i28 | i15;
        if ((i6 & 131072) == 0) {
            i25 = 8388608;
        }
        i16 = i29 | i25 | 100663296;
        if ((i8 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (fetVar.U(i8 & 1, z2)) {
            fetVar.Z();
            if ((i5 & 1) != 0) {
                if (i21 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i22 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                j11 = daq0.c;
                if (i24 != 0) {
                    nrqVar2 = null;
                }
                if (i9 != 0) {
                    f2q0Var2 = null;
                }
                if (i12 != 0) {
                    j12 = j11;
                } else {
                    j12 = j5;
                }
                if ((i6 & 131072) != 0) {
                    j13 = qmk.p;
                    i16 &= -29360129;
                } else {
                    j13 = j6;
                }
                i18 = 1;
                j14 = j12;
                j15 = j13;
                i19 = i16;
                j16 = j11;
                j17 = j16;
                z4 = true;
            } else {
                if (i21 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i22 != 0) {
                    n05Var3 = null;
                } else {
                    n05Var3 = n05Var;
                }
                j11 = daq0.c;
                if (i24 != 0) {
                    nrqVar2 = null;
                }
                if (i9 != 0) {
                    f2q0Var2 = null;
                }
                if (i12 != 0) {
                    j12 = j11;
                } else {
                    j12 = j5;
                }
                if ((i6 & 131072) != 0) {
                    j13 = qmk.p;
                    i16 &= -29360129;
                } else {
                    j13 = j6;
                }
                i18 = 1;
                j14 = j12;
                j15 = j13;
                i19 = i16;
                j16 = j11;
                j17 = j16;
                z4 = true;
            }
            fetVar.s();
            i20 = 0;
            while (true) {
                if (i20 < str.length()) {
                    j18 = j17;
                    break;
                }
                directionality = Character.getDirectionality(str.charAt(i20));
                if (directionality != 1) {
                }
                j18 = j15;
                break;
                i20++;
            }
            n05 n05Var5 = n05Var3;
            v8q0.a(str, o2e.e0(mm40Var4, "ADAPTIVE_TEXT"), j2, n05Var5, j18, null, null, nrqVar2, j16, f2q0Var2, j14, i2, z4, i3, i18, null, y9q0Var, fetVar, (i8 & 896) | ((i8 >> 3) & 14) | (i8 & 7168) | ((i8 << 3) & 458752) | (3670016 & i8) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (524286 & i19) | 1572864 | ((i19 << 3) & 29360128), 0);
            n05Var2 = n05Var5;
            nrqVar3 = nrqVar2;
            j9 = j16;
            f2q0Var3 = f2q0Var2;
            j10 = j14;
            z3 = z4;
            i17 = i18;
            j7 = j17;
            j8 = j15;
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            n05Var2 = n05Var;
            j7 = j3;
            z3 = z;
            i17 = i4;
            j8 = j6;
            mm40Var3 = mm40Var2;
            nrqVar3 = nrqVar2;
            f2q0Var3 = f2q0Var2;
            j9 = j4;
            j10 = j5;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.lp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i5 | 1);
                    mm40 mm40Var5 = mm40Var3;
                    String str2 = str;
                    long j19 = j2;
                    n05 n05Var6 = n05Var2;
                    long j20 = j7;
                    nrq nrqVar4 = nrqVar3;
                    long j21 = j9;
                    f2q0 f2q0Var4 = f2q0Var3;
                    long j22 = j10;
                    byte b2 = i2;
                    boolean z5 = z3;
                    int i210 = i3;
                    boolean z6 = i17;
                    y9q0 y9q0Var2 = y9q0Var;
                    long j23 = j8;
                    int i211 = i6;
                    f1t0.a(mm40Var5, str2, j19, n05Var6, j20, nrqVar4, j21, f2q0Var4, j22, b2, z5, i210, z6 ? 1 : 0, y9q0Var2, j23, (fet) obj, iL, i211);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static void a0(String str, String str2) {
        synchronized (g) {
            Log.i(str, K(str2, null));
        }
    }

    public static final void b(mm40 mm40Var, m52 m52Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-1248738800);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(m52Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o2e.e0(jm40Var, "TeamStatsBlockTestTag").e((mm40) fetVar.k(t0h.f33118a));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            ozb.z(m52Var.f21200a, null, fetVar, 0);
            cem0.g(o7k0.d(jm40Var, 1.0f), m52Var.b, function1, fetVar, (i3 & 896) | 6, 0);
            jmp0 jmp0Var = m52Var.c;
            if (jmp0Var instanceof gmp0) {
                fetVar.e0(-1958986826);
                kmp0 kmp0Var = m52Var.d;
                if (kmp0Var == null) {
                    fetVar.e0(-1958986827);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1958986826);
                    ycm0.e(null, kmp0Var, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else if (jmp0Var instanceof hmp0) {
                fetVar.e0(-1958777514);
                kmp0 kmp0Var2 = m52Var.e;
                if (kmp0Var2 == null) {
                    fetVar.e0(-1958777515);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1958777514);
                    ycm0.e(null, kmp0Var2, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!(jmp0Var instanceof imp0)) {
                    throw b1j.f(-617385770, fetVar, false);
                }
                fetVar.e0(-1958617182);
                x8x.k(m52Var.f, fetVar, 0);
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
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) m52Var, (Object) function1, i2, (byte) 21);
        }
    }

    public static final InputConfiguration b0(String str, List list) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            jf4.n("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            kex kexVar = (kex) CollectionsKt.U(list);
            return new InputConfiguration(kexVar.f18170a, kexVar.b, kexVar.c);
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kex kexVar2 = (kex) it.next();
            ow2.z();
            arrayList.add(ow2.h(kexVar2.f18170a, kexVar2.b, str));
        }
        return ow2.g(((kex) CollectionsKt.U(list)).c, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0182  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x021a  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0141  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x017c  */
    public static final void c(mm40 mm40Var, bdz bdzVar, bzl bzlVar, vg2 vg2Var, float f2, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        float f3;
        mm40 mm40Var3;
        float f4;
        int i5;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        lde ldeVar;
        float f5;
        float f6;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(2038273935);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.g(vg2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f3 = f2;
                int i7 = fetVar2.d(f3) ? 16384 : 8192;
                i4 |= i7;
            } else {
                f3 = f2;
            }
            i4 |= i7;
        } else {
            f3 = f2;
        }
        if ((i2 & 196608) == 0) {
            i4 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                mm40Var3 = i6 != 0 ? jm40.b : mm40Var2;
                if ((i3 & 16) != 0) {
                    zcl zclVar = qmk.f28987a;
                    i4 &= -57345;
                    f4 = 8.0f;
                }
                fetVar2.s();
                i5 = 458752 & i4;
                if (i5 == 131072) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new ja2(function1, (byte) 12);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                if (i5 == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new ja2(function1, (byte) 13);
                    fetVar2.o0(objP2);
                }
                v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
                mm40 mm40VarE = mm40Var3.e(o7k0.c);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                ldeVar = vg2Var.b;
                if (ldeVar instanceof ade) {
                    fetVar2.e0(-1435329257);
                    u(null, (ade) ldeVar, function1, fetVar2, (i4 >> 9) & 896);
                    fetVar2.r(false);
                    f6 = f4;
                } else if (ldeVar instanceof ede) {
                    fetVar2.e0(-1435120720);
                    int i8 = i4 << 3;
                    float f7 = f4;
                    x(f7, (i8 & 896) | 196608 | ((i4 >> 9) & 112) | (i8 & 7168) | ((i4 << 9) & 234881024), bzlVar, fetVar2, ((ede) ldeVar).f7612a, bdzVar, null, function1, false, vg2Var.c, vg2Var.d);
                    fetVar2.r(false);
                    f6 = f7;
                } else {
                    f5 = f4;
                    if (ldeVar instanceof jde) {
                        fetVar2.e0(-1434611855);
                        int i9 = i4 << 3;
                        x(f5, 196608 | ((i4 >> 9) & 112) | (i9 & 896) | (i9 & 7168) | ((i4 << 9) & 234881024), bzlVar, fetVar2, ((jde) ldeVar).f16325a, bdzVar, null, function1, true, vg2Var.c, vg2Var.d);
                        f6 = f5;
                        fetVar2.r(false);
                    } else {
                        f6 = f5;
                        if (ldeVar instanceof vce) {
                            throw b1j.f(-1293227328, fetVar2, false);
                        }
                        fetVar2.e0(-1434112166);
                        s(null, bdzVar, bzlVar, vg2Var.c, (vce) ldeVar, function1, fetVar, i4 & 459760);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(true);
                f3 = f6;
            } else {
                fetVar2.X();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                mm40Var3 = mm40Var2;
            }
            f4 = f3;
            fetVar2.s();
            i5 = 458752 & i4;
            if (i5 == 131072) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z) {
                objP = new ja2(function1, (byte) 12);
                fetVar2.o0(objP);
            } else {
                objP = new ja2(function1, (byte) 12);
                fetVar2.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            if (i5 == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar2.P();
            if (z2) {
                objP2 = new ja2(function1, (byte) 13);
                fetVar2.o0(objP2);
            } else {
                objP2 = new ja2(function1, (byte) 13);
                fetVar2.o0(objP2);
            }
            v3c.z(function2, (Function0) objP2, null, fetVar2, 0, 4);
            mm40 mm40VarE2 = mm40Var3.e(o7k0.c);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            ldeVar = vg2Var.b;
            if (ldeVar instanceof ade) {
                fetVar2.e0(-1435329257);
                u(null, (ade) ldeVar, function1, fetVar2, (i4 >> 9) & 896);
                fetVar2.r(false);
                f6 = f4;
            } else if (ldeVar instanceof ede) {
                fetVar2.e0(-1435120720);
                int i10 = i4 << 3;
                float f8 = f4;
                x(f8, (i10 & 896) | 196608 | ((i4 >> 9) & 112) | (i10 & 7168) | ((i4 << 9) & 234881024), bzlVar, fetVar2, ((ede) ldeVar).f7612a, bdzVar, null, function1, false, vg2Var.c, vg2Var.d);
                fetVar2.r(false);
                f6 = f8;
            } else {
                f5 = f4;
                if (ldeVar instanceof jde) {
                    fetVar2.e0(-1434611855);
                    int i11 = i4 << 3;
                    x(f5, 196608 | ((i4 >> 9) & 112) | (i11 & 896) | (i11 & 7168) | ((i4 << 9) & 234881024), bzlVar, fetVar2, ((jde) ldeVar).f16325a, bdzVar, null, function1, true, vg2Var.c, vg2Var.d);
                    f6 = f5;
                    fetVar2.r(false);
                } else {
                    f6 = f5;
                    if (ldeVar instanceof vce) {
                        throw b1j.f(-1293227328, fetVar2, false);
                    }
                    fetVar2.e0(-1434112166);
                    s(null, bdzVar, bzlVar, vg2Var.c, (vce) ldeVar, function1, fetVar, i4 & 459760);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            fetVar2.r(true);
            f3 = f6;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qt0(mm40Var3, bdzVar, bzlVar, (Object) vg2Var, f3, function1, i2, i3, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final qq4 c0(tq4 tq4Var, as4 as4Var) {
        ?? arrayList;
        List list;
        vq4 vq4Var;
        a860 a860Var;
        List list2 = tq4Var.f34363a;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(fre0.e0((pq4) it.next(), as4Var));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List<pq4> list3 = tq4Var.b;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (pq4 pq4Var : list3) {
                pq4Var.getClass();
                String str = pq4Var.f27397a;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                String str2 = pq4Var.m;
                if (str2 == null) {
                    jf4.k(null);
                    return null;
                }
                Integer num = pq4Var.n;
                if (num == null) {
                    jf4.k(null);
                    return null;
                }
                switch (num.intValue()) {
                    case 1:
                        vq4Var = vq4.b;
                        break;
                    case 2:
                        vq4Var = vq4.c;
                        break;
                    case 3:
                        vq4Var = vq4.d;
                        break;
                    case 4:
                        vq4Var = vq4.e;
                        break;
                    case 5:
                        vq4Var = vq4.g;
                        break;
                    case 6:
                        vq4Var = vq4.f;
                        break;
                    default:
                        vq4Var = vq4.f37837a;
                        break;
                }
                vq4 vq4Var2 = vq4Var;
                String str3 = pq4Var.l;
                if (str3 == null) {
                    jf4.k(null);
                    return null;
                }
                String str4 = pq4Var.k;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = str4;
                Integer num2 = pq4Var.j;
                if (num2 == null) {
                    jf4.k(null);
                    return null;
                }
                va80 va80VarF = fww.F(num2.intValue());
                String str6 = pq4Var.i;
                if (str6 == null) {
                    jf4.k(null);
                    return null;
                }
                Long l2 = pq4Var.e;
                if (l2 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue = l2.longValue();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Date date = new Date(timeUnit.toMillis(jLongValue));
                Long l3 = pq4Var.h;
                if (l3 == null) {
                    jf4.k(null);
                    return null;
                }
                Date date2 = new Date(timeUnit.toMillis(l3.longValue()));
                wsz wszVar = a860.f411a;
                Integer num3 = pq4Var.p;
                if (num3 == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num3.intValue();
                wszVar.getClass();
                if (iIntValue == 0) {
                    a860Var = a860.b;
                } else if (iIntValue == 1) {
                    a860Var = a860.c;
                } else if (iIntValue == 2) {
                    a860Var = a860.d;
                } else if (iIntValue != 3) {
                    a860Var = iIntValue != 4 ? a860.g : a860.f;
                } else {
                    a860Var = a860.e;
                }
                arrayList2.add(new hq4(str, str2, vq4Var2, str6, str5, str3, va80VarF, date, date2, a860Var));
            }
            list = arrayList2;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new qq4(arrayList, list);
    }

    public static final void d(mm40 mm40Var, ox6 ox6Var, qln0 qln0Var, hx6 hx6Var, i8k0 i8k0Var, String str, Function1 function1, Function1 function2, fet fetVar, int i2) {
        hx6 hx6Var2;
        boolean z;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-728886864);
        int i3 = i2 | (fetVar2.g(ox6Var) ? 32 : 16) | (fetVar2.g(qln0Var) ? 256 : 128) | (fetVar2.e(hx6Var.ordinal()) ? 2048 : 1024) | (fetVar2.g(i8k0Var) ? 16384 : 8192) | (fetVar2.g(str) ? 131072 : 65536) | (fetVar2.i(function1) ? 1048576 : 524288) | (fetVar2.i(function2) ? 8388608 : 4194304);
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            wpq wpqVar = (wpq) fetVar2.k(bmd.i);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            hx6 hx6Var3 = hx6.c;
            mm40 mm40VarN = epv0.N(mm40VarD, hx6Var == hx6Var3 ? 0.5f : 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarN, 16.0f, 0.0f, 2);
            xx7 xx7Var = gqw0.n;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.h, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarL2 = s5x0.L(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 12.0f, 0.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL2);
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
            int i4 = i3 >> 3;
            e(null, ox6Var, hx6Var, ox6Var.c, str, function1, fetVar2, (i3 & 112) | (i4 & 896) | (57344 & i4) | (i4 & 458752));
            hx6Var2 = hx6Var;
            if (rw6.f31203a[hx6Var2.ordinal()] == 1) {
                fetVar2.e0(-1610634727);
                wvb.o(null, 6.0f, 0L, fetVar2, 0, 5);
                H(qln0Var, fetVar2, (i3 >> 6) & 14);
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-51947759);
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            prm prmVar = new prm(i8k0Var.f14343a, new jrm(new g8k0(6, i8k0Var.b, null), new g8k0(6, i8k0Var.c, null)), null, null, hx6Var2 != hx6Var3 ? true : z, 118);
            boolean zI = fetVar2.i(wpqVar) | ((i3 & 29360128) == 8388608 ? true : z);
            Object objP = fetVar2.P();
            if (zI || objP == ukd.f35823a) {
                objP = new qo5(wpqVar, function2, (byte) 21);
                fetVar2.o0(objP);
            }
            qcc.k(mm40VarD3, prmVar, (Function1) objP, fetVar, 6, 0);
            fetVar2 = fetVar;
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
        } else {
            hx6Var2 = hx6Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6(mm40Var, (Object) ox6Var, (Object) qln0Var, (Object) hx6Var2, (Object) i8k0Var, str, (Object) function1, (Object) function2, i2, (byte) 0);
        }
    }

    public static final mlr d0(sv0 sv0Var, String str) {
        sv0Var.getClass();
        str.getClass();
        Long l2 = sv0Var.f32844a;
        Integer num = sv0Var.j;
        List list = sv0Var.o;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = sv0Var.g;
        long jLongValue2 = l3 != null ? l3.longValue() : 0L;
        long jIntValue = num != null ? num.intValue() : -1;
        long jIntValue2 = num != null ? num.intValue() : 0L;
        String str2 = sv0Var.k;
        String str3 = str2 == null ? "" : str2;
        String str4 = sv0Var.b;
        String str5 = str4 == null ? "" : str4;
        String str6 = sv0Var.c;
        String strConcat = str.concat(str6 != null ? str6 : "");
        boolean z = list != null && list.contains("popular");
        boolean z2 = list != null && list.contains("new");
        boolean z3 = list != null && list.contains("promo");
        boolean z4 = list != null && list.contains("hot");
        Boolean bool = sv0Var.f;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(sv0Var.n, bool2);
        List list2 = sv0Var.d;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new mlr(jLongValue, jLongValue2, jIntValue, jIntValue2, str3, str5, strConcat, (String) null, z, z2, z3, zD, zD2, false, z4, list2, Intrinsics.d(sv0Var.p, bool2), 131200);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0412  */
    /* JADX WARN: Code duplicated, block: B:124:0x0424  */
    /* JADX WARN: Code duplicated, block: B:127:0x0472  */
    /* JADX WARN: Code duplicated, block: B:128:0x0474  */
    /* JADX WARN: Code duplicated, block: B:132:0x0481  */
    /* JADX WARN: Code duplicated, block: B:135:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:137:0x04eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r12v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r23v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v21, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    public static final void e(mm40 mm40Var, ox6 ox6Var, hx6 hx6Var, boolean z, String str, Function1 function1, fet fetVar, int i2) {
        hx6 hx6Var2;
        String str2;
        mm40 mm40Var2;
        ?? r12;
        long jB;
        Object obj;
        boolean z2;
        long secondary20;
        boolean z3;
        Object obj2;
        shd shdVar;
        agk0 agk0Var;
        cl5 cl5Var;
        shd shdVar2;
        jm40 jm40Var;
        cgk0 cgk0Var;
        pcy pcyVar;
        ?? r7;
        ?? r2;
        cl5 cl5Var2;
        Function1 function2;
        long jC;
        ?? r14;
        boolean zG;
        Object obj3;
        ?? r13;
        Object objP;
        Object obj4;
        Object obj5;
        fet fetVar2 = fetVar;
        pz40 pz40Var = ox6Var.f25996a;
        fetVar2.g0(894014619);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(ox6Var) : fetVar2.i(ox6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(hx6Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP2 = fetVar2.P();
            cl5 cl5Var3 = ukd.f35823a;
            Object obj6 = objP2;
            if (objP2 == cl5Var3) {
                agk0 agk0VarA = androidx.compose.runtime.e.a(16.0f);
                fetVar2.o0(agk0VarA);
                obj6 = agk0VarA;
            }
            agk0 agk0Var2 = (agk0) obj6;
            Object objP3 = fetVar2.P();
            Object obj7 = objP3;
            if (objP3 == cl5Var3) {
                cgk0 cgk0VarB = androidx.compose.runtime.e.b(0);
                fetVar2.o0(cgk0VarB);
                obj7 = cgk0VarB;
            }
            cgk0 cgk0Var2 = (cgk0) obj7;
            Object[] objArr = new Object[0];
            Object objP4 = fetVar2.P();
            Object obj8 = objP4;
            if (objP4 == cl5Var3) {
                lg6 lg6Var = new lg6((byte) 23);
                fetVar2.o0(lg6Var);
                obj8 = lg6Var;
            }
            pz40 pz40Var2 = (pz40) e9x.Q(objArr, (Function0) obj8, fetVar2, 48);
            Object[] objArr2 = new Object[0];
            Object objP5 = fetVar2.P();
            Object obj9 = objP5;
            if (objP5 == cl5Var3) {
                lg6 lg6Var2 = new lg6((byte) 24);
                fetVar2.o0(lg6Var2);
                obj9 = lg6Var2;
            }
            pz40 pz40Var3 = (pz40) e9x.Q(objArr2, (Function0) obj9, fetVar2, 48);
            Object[] objArr3 = new Object[0];
            Object objP6 = fetVar2.P();
            Object obj10 = objP6;
            if (objP6 == cl5Var3) {
                lg6 lg6Var3 = new lg6((byte) 25);
                fetVar2.o0(lg6Var3);
                obj10 = lg6Var3;
            }
            pz40 pz40Var4 = (pz40) e9x.Q(objArr3, (Function0) obj10, fetVar2, 48);
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                fetVar2.e0(497921626);
                jB = afn0.m(fetVar2).getSecondary60();
                fetVar2.r(false);
            } else {
                fetVar2.e0(497972621);
                afn0.v(fetVar2).getClass();
                jB = g1t0.j().b();
                fetVar2.r(false);
            }
            long j2 = jB;
            a8q0 a8q0Var = (a8q0) pz40Var.getValue();
            Boolean bool = (Boolean) pz40Var3.getValue();
            bool.getClass();
            boolean zG2 = fetVar2.g(pz40Var3) | ((i3 & 458752) == 131072);
            Object objP7 = fetVar2.P();
            yje yjeVar = null;
            if (zG2 || objP7 == cl5Var3) {
                ua4 ua4Var = new ua4(function1, pz40Var3, yjeVar, (byte) 1);
                fetVar2.o0(ua4Var);
                obj = ua4Var;
            } else {
                obj = objP7;
            }
            m0x0.t(fetVar2, bool, (Function2) obj);
            zcl zclVar = qmk.f28987a;
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                fetVar2.e0(154625387);
                secondary20 = afn0.m(fetVar2).getPrimaryHighlight();
                z2 = false;
            } else {
                z2 = false;
                fetVar2.e0(154626662);
                secondary20 = afn0.m(fetVar2).getSecondary20();
            }
            fetVar2.r(z2);
            long j3 = secondary20;
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarA = o7k0.A(o7k0.e(s5x0.K(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.S(jm40Var2, 1.0f, j3, ugg0Var2)), afn0.m(fetVar2).getBackgroundGroupSecondary(), jd8.n), 6.0f, 4.0f), 32.0f), null, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar2);
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
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var3) {
                z3 = false;
                cgk0 cgk0VarB2 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(cgk0VarB2);
                obj2 = cgk0VarB2;
            } else {
                z3 = false;
                obj2 = objP8;
            }
            cgk0 cgk0Var3 = (cgk0) obj2;
            if (a8q0Var.f440a.b.length() == 0) {
                fetVar2.e0(739666428);
                Object objP9 = fetVar2.P();
                if (objP9 == cl5Var3) {
                    nw6 nw6Var = new nw6(cgk0Var3, (byte) 4);
                    fetVar2.o0(nw6Var);
                    obj5 = nw6Var;
                } else {
                    obj5 = objP9;
                }
                mm40 mm40VarD0 = ro4.d0(jm40Var2, (Function1) obj5);
                String str3 = ox6Var.b;
                afn0.v(fetVar2).getClass();
                y9q0 y9q0VarJ = g1t0.j();
                afn0.v(fetVar2).getClass();
                nrq nrqVar = g1t0.j().f42262a.f;
                long secondary60 = afn0.m(fetVar2).getSecondary60();
                long j4 = qmk.o;
                afn0.v(fetVar2).getClass();
                cl5Var = cl5Var3;
                jm40Var = jm40Var2;
                cgk0Var = cgk0Var2;
                boolean z5 = z3;
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                agk0Var = agk0Var2;
                shdVar2 = shdVar3;
                v8q0.a(str3, mm40VarD0, secondary60, new n05(j4, g1t0.j().f42262a.b, idm0.s(0.25d)), 0L, null, null, nrqVar, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 48, 24960, 110448);
                fet fetVar3 = fetVar;
                fetVar3.r(z5);
                r2 = z5;
                r7 = fetVar3;
            } else {
                shdVar = shdVar5;
                agk0Var = agk0Var2;
                fet fetVar4 = fetVar2;
                cl5Var = cl5Var3;
                shdVar2 = shdVar3;
                jm40Var = jm40Var2;
                cgk0Var = cgk0Var2;
                boolean z6 = z3;
                pcyVar = pcyVar2;
                fetVar4.e0(740396044);
                fetVar4.r(z6);
                cgk0Var3.m(z6 ? 1 : 0);
                r2 = z6;
                r7 = fetVar4;
            }
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, r7, 54);
            int iHashCode2 = Long.hashCode(r7.T);
            bh90 bh90VarM2 = r7.m();
            mm40 mm40VarC1 = kbc.c0(r7, jm40Var);
            r7.i0();
            if (r7.S) {
                r7.l(pcyVar);
            } else {
                r7.r0();
            }
            jpm0.o(r7, thg0VarA, shdVar2);
            jpm0.o(r7, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, r7, shdVar, r7);
            jpm0.o(r7, mm40VarC1, shdVar6);
            byte b2 = 2;
            mm40 mm40VarU = o7k0.u(q8a.y0(jm40Var, enx.f8115a), pkd.e(cgk0Var3.l(), r7), 0.0f, 2);
            int i4 = (((r7.g(a8q0Var) ? 1 : 0) | (r7.g(pz40Var3) ? 1 : 0)) | (r7.g(pz40Var4) ? 1 : 0) ? 1 : 0) | ((i3 & 7168) == 2048 ? 1 : r2) | (r7.g(pz40Var2) ? 1 : 0);
            Object objP10 = r7.P();
            if (i4 == 0) {
                cl5Var2 = cl5Var;
                if (objP10 == cl5Var2) {
                }
                mm40 mm40VarB0 = j120.b0(mm40VarU, (Function1) objP10);
                if (function1 == null) {
                    r7.e0(-1682846341);
                    objP = r7.P();
                    obj4 = objP;
                    if (objP == cl5Var2) {
                        h26 h26Var = new h26((byte) 16);
                        r7.o0(h26Var);
                        obj4 = h26Var;
                    }
                    r7.r(r2);
                    function2 = (Function1) obj4;
                } else {
                    r7.e0(915545432);
                    r7.r(r2);
                    function2 = function1;
                }
                afn0.v(r7).getClass();
                y9q0 y9q0VarQ = g1t0.q();
                hx6Var2 = hx6Var;
                if (hx6Var2 == hx6.b) {
                    r7.e0(915552172);
                    jC = afn0.m(r7).getWarning();
                    r7.r(r2);
                } else {
                    jC = rz4.c(r7, 915553168, r7, r2);
                }
                y9q0 y9q0VarA = y9q0.a(y9q0VarQ, jC, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                str2 = str;
                pvf pvfVar = new pvf(str2, j2, r2);
                skk0 skk0Var = new skk0(afn0.m(r7).getPrimary());
                uly ulyVar = new uly(0, null, 9, 0, 123);
                if (hx6Var2 != hx6.c) {
                    r14 = 1;
                } else {
                    r14 = r2;
                }
                zG = r7.g(a8q0Var);
                Object objP11 = r7.P();
                obj3 = objP11;
                if (zG || objP11 == cl5Var2) {
                    lw6 lw6Var = new lw6(a8q0Var, agk0Var, cgk0Var, b2);
                    r7.o0(lw6Var);
                    obj3 = lw6Var;
                }
                ?? r23 = r7;
                z96.a(a8q0Var, function2, mm40VarB0, r14, false, y9q0VarA, ulyVar, null, true, 0, 0, pvfVar, (Function1) obj3, null, skk0Var, null, r23, 102236160, 0, 42640);
                r13 = r23;
                if (((a8q0) pz40Var.getValue()).f440a.b.length() > 0) {
                    r13.e0(-1681281864);
                    dww.c(a8k0.F(R.drawable.ic_glyph_edit, 0, r13), null, o7k0.n(jm40Var, 16.0f), afn0.m(r13).getPrimary(), r13, 56, 0);
                    r13.r(false);
                } else {
                    r13.e0(-1681017155);
                    r13.r(false);
                }
                r13.r(true);
                r13.r(true);
                mm40Var2 = jm40Var;
                r12 = r13;
            } else {
                cl5Var2 = cl5Var;
            }
            cw6 cw6Var = new cw6(a8q0Var, z, pz40Var3, pz40Var4, pz40Var2);
            r7.o0(cw6Var);
            objP10 = cw6Var;
            mm40 mm40VarB1 = j120.b0(mm40VarU, (Function1) objP10);
            if (function1 == null) {
                r7.e0(-1682846341);
                objP = r7.P();
                obj4 = objP;
                if (objP == cl5Var2) {
                    h26 h26Var2 = new h26((byte) 16);
                    r7.o0(h26Var2);
                    obj4 = h26Var2;
                }
                r7.r(r2);
                function2 = (Function1) obj4;
            } else {
                r7.e0(915545432);
                r7.r(r2);
                function2 = function1;
            }
            afn0.v(r7).getClass();
            y9q0 y9q0VarQ2 = g1t0.q();
            hx6Var2 = hx6Var;
            if (hx6Var2 == hx6.b) {
                r7.e0(915552172);
                jC = afn0.m(r7).getWarning();
                r7.r(r2);
            } else {
                jC = rz4.c(r7, 915553168, r7, r2);
            }
            y9q0 y9q0VarA2 = y9q0.a(y9q0VarQ2, jC, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            str2 = str;
            pvf pvfVar2 = new pvf(str2, j2, r2);
            skk0 skk0Var2 = new skk0(afn0.m(r7).getPrimary());
            uly ulyVar2 = new uly(0, null, 9, 0, 123);
            if (hx6Var2 != hx6.c) {
                r14 = 1;
            } else {
                r14 = r2;
            }
            zG = r7.g(a8q0Var);
            Object objP12 = r7.P();
            obj3 = objP12;
            if (zG) {
                lw6 lw6Var2 = new lw6(a8q0Var, agk0Var, cgk0Var, b2);
                r7.o0(lw6Var2);
                obj3 = lw6Var2;
            } else {
                lw6 lw6Var3 = new lw6(a8q0Var, agk0Var, cgk0Var, b2);
                r7.o0(lw6Var3);
                obj3 = lw6Var3;
            }
            ?? r24 = r7;
            z96.a(a8q0Var, function2, mm40VarB1, r14, false, y9q0VarA2, ulyVar2, null, true, 0, 0, pvfVar2, (Function1) obj3, null, skk0Var2, null, r24, 102236160, 0, 42640);
            r13 = r24;
            if (((a8q0) pz40Var.getValue()).f440a.b.length() > 0) {
                r13.e0(-1681281864);
                dww.c(a8k0.F(R.drawable.ic_glyph_edit, 0, r13), null, o7k0.n(jm40Var, 16.0f), afn0.m(r13).getPrimary(), r13, 56, 0);
                r13.r(false);
            } else {
                r13.e0(-1681017155);
                r13.r(false);
            }
            r13.r(true);
            r13.r(true);
            mm40Var2 = jm40Var;
            r12 = r13;
        } else {
            hx6Var2 = hx6Var;
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
            r12 = fetVar2;
        }
        yfe0 yfe0VarU = r12.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var2, (Object) ox6Var, (Object) hx6Var2, z, (Object) str2, (wdr) function1, i2, (byte) 5);
        }
    }

    public static final String e0(l4b l4bVar) {
        l4bVar.getClass();
        int iOrdinal = l4bVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return "2";
        }
        if (iOrdinal == 2) {
            return "1";
        }
        if (iOrdinal == 3) {
            return "4";
        }
        if (iOrdinal == 4) {
            return "3";
        }
        t9f.b();
        return null;
    }

    public static final void f(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1571562131);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o050.W(jm40.b);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new w7i0(function1, b2);
                fetVar2.o0(objP);
            }
            int i4 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, (i3 << 3) & 112, 0, 4084);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new igh0((byte) 29);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, (i4 & 112) | 3072, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i2, (byte) 6);
        }
    }

    public static final String f0(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceE = lgi0.e(e1t0.f7052a, type);
        return ((Class) pgi0.o(sequenceE)).getName() + kotlin.text.c.q(pgi0.f(sequenceE), "[]");
    }

    public static final void g(mm40 mm40Var, nan nanVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1667912270);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(nanVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(null) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            boolean zG = fetVar.g(w6kVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                zcl zclVar = qmk.f28987a;
                objP2 = Integer.valueOf(w6kVar.T(56.0f));
                fetVar.o0(objP2);
            }
            yx7 yx7Var = cgk0Var.l() > ((Number) objP2).intValue() ? gqw0.j : gqw0.k;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarD, vgg0.a(20.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(20.0f));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = mm40VarQ.e(jm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 8.0f, 8.0f, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(10.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            i(null, nanVar.d, nanVar.c, fetVar, 0);
            String str = nanVar.f23198a;
            String str2 = nanVar.b;
            x7z x7zVar = new x7z(1.0f, true);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new nw6(cgk0Var, (byte) 15);
                fetVar.o0(objP3);
            }
            k(0, fetVar, ro4.d0(x7zVar, (Function1) objP3), str, str2);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) nanVar, i2, (byte) 6);
        }
    }

    public static void g0(String str, String str2) {
        synchronized (g) {
            Log.w(str, K(str2, null));
        }
    }

    public static final void h(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1008115107);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(lgb.J(mm40VarD, vgg0.a(20.0f)), 72.0f), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, (byte) 28);
        }
    }

    public static void h0(String str, String str2, Throwable th) {
        synchronized (g) {
            Log.w(str, K(str2, th));
        }
    }

    public static final void i(mm40 mm40Var, mt90 mt90Var, m0x m0xVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-988082549);
        int i3 = i2 | 6 | (fetVar.g(mt90Var) ? 32 : 16) | (fetVar.g(m0xVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.e0(-359545631);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(jm40Var, 56.0f), vgg0.a(12.0f)), ibc.Y(d4d.PRIMARY, fetVar), jd8.n);
            fetVar.r(false);
            oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_games_square, 0, fetVar), null, null, 14);
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
            k7x.b(m0xVar.a(), null, o7k0.c, oilVarT, oilVarT, oilVarT, null, null, null, null, gqw0.A, null, fetVar, 299440, 6, 31680);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, mt90Var, m0xVar, i2, (byte) 26);
        }
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(623971587);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), "BONUS_SCREEN_COLUMN");
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.bonuses_title, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSeparator60()));
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new tk8(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            if (((wl8) l7m0Var.getValue()).b) {
                fetVar.e0(-1669195211);
                knx.k(0, fetVar, null);
                fetVar.r(false);
                function2 = function1;
            } else if (((wl8) l7m0Var.getValue()).c) {
                fetVar.e0(-1669091361);
                mdm mdmVar = ((wl8) l7m0Var.getValue()).d;
                if (mdmVar != null) {
                    fetVar.e0(-1669000500);
                    boolean z2 = i4 == 256;
                    Object objP2 = fetVar.P();
                    if (z2 || objP2 == cl5Var) {
                        function2 = function1;
                        objP2 = new tk8(function2, (byte) 5);
                        fetVar.o0(objP2);
                    } else {
                        function2 = function1;
                    }
                    bsr0.g(null, mdmVar, (Function0) objP2, fetVar, 0);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    fetVar.e0(-1668726615);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                function2 = function1;
                fetVar.e0(-1668687028);
                jar0.i(null, ((wl8) l7m0Var.getValue()).f39340a, function2, fetVar, i4);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            function2 = function1;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i2, (byte) 9);
        }
    }

    public static final void k(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1229712372);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            xx7 xx7Var = gqw0.m;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar2 = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary();
            jm40 jm40Var = jm40.b;
            v8q0.a(str, o2e.e0(o7k0.d(jm40Var, 1.0f), "WEB_GAMES_BONUS_INFO_TITLE_TEXT"), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0VarM, fetVar2, ((i3 >> 3) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar2;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(1432290904);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1431992684);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                v8q0.a(str2, o2e.e0(o7k0.d(jm40Var, 1.0f), "WEB_GAMES_BONUS_INFO_LABEL_TEXT"), ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, ((i3 >> 6) & 14) | 48, 0, 131064);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i2, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, float f2, float f3, float f4, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        float f5;
        float f6;
        fetVar.g0(-1414664746);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f2) ? 32 : 16) | 1152;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                f5 = 64.0f;
                f6 = 16.0f;
            } else {
                fetVar.X();
                f5 = f3;
                f6 = f4;
            }
            fetVar.s();
            ugg0 ugg0VarB = vgg0.b(f6, f6, 0.0f, 0.0f);
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f5 + f2);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD, 100.0f + f2);
            zx7 zx7Var2 = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarE2, zx7Var2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new nk7((byte) 27);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarB, (Function1) objP);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarK, s6t0.b().f33626a.getBackgroundContent(), ugg0VarB);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            ugdVar2 = ugdVar;
            ua80.p(54, ugdVar2, jr8Var, fetVar, true);
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            f5 = f3;
            f6 = f4;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ko8(mm40Var, f2, f5, f6, ugdVar2, i2);
        }
    }

    public static final void m(mm40 mm40Var, qr9 qr9Var, Function0 function0, Function0 function1, fet fetVar, int i2, int i3) {
        Function0 function2;
        int i4;
        Function0 function3;
        int i5;
        Function0 function4;
        Function0 function5;
        mm40 mm40Var2;
        yjj0 yjj0VarA;
        fetVar.g0(-34461647);
        int i6 = i2 | 6 | (fetVar.g(qr9Var) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            function2 = function0;
        } else {
            function2 = function0;
            i4 = i6 | (fetVar.i(function2) ? 256 : 128);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            function3 = function1;
        } else {
            function3 = function1;
            i5 = i4 | (fetVar.i(function3) ? 2048 : 1024);
        }
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            Function0 function6 = i7 != 0 ? null : function2;
            Function0 function7 = i8 == 0 ? function3 : null;
            wui0 wui0Var = qr9Var.c;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.b(jm40Var, 0.0f, 80.0f, 1), 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            int iOrdinal = wui0Var.ordinal();
            if (iOrdinal == 0) {
                yjj0VarA = vgg0.a(16.0f);
            } else if (iOrdinal == 1) {
                yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            } else if (iOrdinal == 2) {
                yjj0VarA = jd8.n;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            }
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, yjj0VarA);
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
            mm40 mm40VarE0 = o2e.e0(jm40Var, "SETTING_CELL_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
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
            phu0.g(new ecu0(gqw0.k), qr9Var.f29198a, fetVar, 0);
            epv0.i(qr9Var.b, function6, function7, fetVar, (i5 >> 3) & 1008);
            fetVar.r(true);
            boolean zE = fetVar.e(wui0Var.ordinal());
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = Boolean.valueOf(tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b}));
                fetVar.o0(objP);
            }
            if (((Boolean) objP).booleanValue()) {
                fetVar.e0(1054625938);
                mbc.o(agi0.f827a, s5x0.N(jr8.f16991a.b(jm40Var, gqw0.h), 64.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1054865227);
                fetVar.r(false);
            }
            fetVar.r(true);
            function5 = function7;
            function4 = function6;
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            function4 = function2;
            function5 = function3;
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9((byte) 0, i2, i3, function5, mm40Var2, qr9Var, function4);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1466867763);
        byte b2 = 4;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ugd ugdVarM = u1c.M(1192810487, new u7i0(l7m0Var, function1, (byte) 3), fetVar);
            ugd ugdVarM2 = u1c.M(298875576, new u7i0(l7m0Var, function1, b2), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(null, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackground(), 0L, null, u1c.M(1236888322, new xs4(l7m0Var, function1, (byte) 10), fetVar), fetVar, 805306800, 441);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 5);
        }
    }

    public static final void o(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(916258065);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = y5dVar.b(o7k0.d(jm40Var, 1.0f), true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarB, f2, 12.0f);
            int i6 = (i5 << 3) & 7168;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i6 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i2, (byte) 7);
        }
    }

    public static final void p(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-2000070542);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarS = o050.S(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nas0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void q(mm40 mm40Var, pan panVar, fet fetVar, int i2) {
        int i3;
        panVar.getClass();
        fetVar.g0(-2112921968);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(panVar) ? 32 : 16) | 384;
        if (!fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            fetVar.X();
        } else if (panVar instanceof nan) {
            fetVar.e0(982566736);
            g(mm40Var, (nan) panVar, fetVar, i4 & 1022);
            fetVar.r(false);
        } else {
            if (!panVar.equals(oan.f24935a)) {
                throw b1j.f(1001524976, fetVar, false);
            }
            fetVar.e0(982775924);
            h(i4 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, panVar, i2, (byte) 5);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-251393598);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new opm0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 28);
        }
    }

    public static final void s(mm40 mm40Var, bdz bdzVar, bzl bzlVar, boolean z, vce vceVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarV;
        fetVar.g0(-287379880);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(vceVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_EVENTS", fetVar);
            wom womVarF = mom.f(fetVar);
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (bzlVar != null) {
                fetVar.e0(-1463748507);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(jm40Var, bzlVar.a((Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1463644750);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            n0q n0qVar = o7k0.c;
            boolean z2 = (458752 & i3) == 131072;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 16);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(-650203485, new qb((Object) mm40VarV, (Object) xczVarB, (Object) vceVar, false, (byte) 1), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var2, (Object) bdzVar, (Object) bzlVar, z, (Object) vceVar, (wdr) function1, i2, (byte) 0);
        }
    }

    public static final void t(kac0 kac0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1691884856);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(y5d.f42040a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(kac0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            o(null, u1c.M(225006831, new in80(kac0Var, function1, (byte) 7), fetVar), fetVar, (i3 & 14) | 384);
            String str = kac0Var.f17956a;
            boolean z = kac0Var.b;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gvb0(function1, kac0Var, (byte) 6);
                fetVar.o0(objP);
            }
            vdx.r(0, fetVar, null, str, (Function0) objP, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) kac0Var, (Object) function1, i2, (byte) 15);
        }
    }

    public static final void u(mm40 mm40Var, ade adeVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1743973659);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(adeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
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
            mdm mdmVar = adeVar.f675a;
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ja2(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) adeVar, (Object) function1, i2, (byte) 22);
        }
    }

    public static final void v(String str, String str2, fet fetVar, int i2) {
        fetVar.g0(351146257);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.g(str2) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jwb.p(null, uc9.e, null, gqw0.j, 2, 0, u1c.M(-1094818442, new ew6(str, str2, b2), fetVar), fetVar, 1600560, 37);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6(b2, i2, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x040c  */
    /* JADX WARN: Code duplicated, block: B:223:0x042c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0448  */
    /* JADX WARN: Code duplicated, block: B:229:0x0474  */
    /* JADX WARN: Code duplicated, block: B:231:0x047c  */
    /* JADX WARN: Code duplicated, block: B:233:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:236:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:238:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:239:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:242:0x0511  */
    /* JADX WARN: Code duplicated, block: B:243:0x0513  */
    /* JADX WARN: Code duplicated, block: B:247:0x051c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0539  */
    /* JADX WARN: Code duplicated, block: B:251:0x0541  */
    /* JADX WARN: Code duplicated, block: B:253:0x054d  */
    public static final void w(mm40 mm40Var, final l7m0 l7m0Var, final l7m0 l7m0Var2, final l7m0 l7m0Var3, final l7m0 l7m0Var4, final l7m0 l7m0Var5, final l7m0 l7m0Var6, final l7m0 l7m0Var7, final l7m0 l7m0Var8, final l7m0 l7m0Var9, final l7m0 l7m0Var10, final l7m0 l7m0Var11, final l7m0 l7m0Var12, final l7m0 l7m0Var13, final l7m0 l7m0Var14, final l7m0 l7m0Var15, tht thtVar, final Function1 function1, fet fetVar, final int i2, final int i3) {
        final l7m0 l7m0Var16;
        l7m0 l7m0Var17;
        int i4;
        tht thtVar2;
        Function1 function2;
        final mm40 mm40Var2;
        cl5 cl5Var;
        cl5 cl5Var2;
        fet fetVar2;
        boolean zBooleanValue;
        jr8 jr8Var;
        n0q n0qVar;
        shd shdVar;
        shd shdVar2;
        pcy pcyVar;
        zx7 zx7Var;
        shd shdVar3;
        shd shdVar4;
        jm40 jm40Var;
        cl5 cl5Var3;
        boolean z;
        boolean z2;
        float fA;
        boolean z3;
        Object objP;
        Object objP2;
        Object objP3;
        fet fetVar3 = fetVar;
        zx7 zx7Var2 = gqw0.e;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        l7m0Var5.getClass();
        l7m0Var6.getClass();
        l7m0Var7.getClass();
        l7m0Var8.getClass();
        l7m0Var9.getClass();
        l7m0Var10.getClass();
        l7m0Var11.getClass();
        l7m0Var12.getClass();
        l7m0Var13.getClass();
        l7m0Var14.getClass();
        l7m0Var15.getClass();
        function1.getClass();
        fetVar3.g0(-1434288377);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            l7m0Var16 = l7m0Var;
            i5 |= fetVar3.g(l7m0Var16) ? 32 : 16;
        } else {
            l7m0Var16 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar3.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar3.g(l7m0Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            l7m0Var17 = l7m0Var4;
            i5 |= fetVar3.g(l7m0Var17) ? 16384 : 8192;
        } else {
            l7m0Var17 = l7m0Var4;
        }
        if ((i2 & 196608) == 0) {
            i5 |= fetVar3.g(l7m0Var5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= fetVar3.g(l7m0Var6) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= fetVar3.g(l7m0Var7) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= fetVar3.g(l7m0Var8) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= fetVar3.g(l7m0Var9) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i4 = i3 | (fetVar3.g(l7m0Var10) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar3.g(l7m0Var11) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar3.g(l7m0Var12) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar3.g(l7m0Var13) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar3.g(l7m0Var14) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= fetVar3.g(l7m0Var15) ? 131072 : 65536;
        }
        int i6 = i4 | (fetVar3.g(thtVar) ? 1048576 : 524288);
        if ((i3 & 12582912) == 0) {
            i6 |= fetVar3.i(function1) ? 8388608 : 4194304;
        }
        int i7 = i6;
        if (fetVar3.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 4793491) == 4793490) ? false : true)) {
            final wpq wpqVar = (wpq) fetVar3.k(bmd.i);
            final pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
            Object objP4 = fetVar3.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (objP4 == cl5Var4) {
                objP4 = new cqq();
                fetVar3.o0(objP4);
            }
            final cqq cqqVar = (cqq) objP4;
            WeakHashMap weakHashMap = djv0.w;
            boolean zBooleanValue2 = ((Boolean) ((hgk0) zcm0.i(fetVar3).c.d).getValue()).booleanValue();
            Object objP5 = fetVar3.P();
            byte b2 = 14;
            if (objP5 == cl5Var4) {
                objP5 = new vls(b2);
                fetVar3.o0(objP5);
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarG0 = l8x.G0(rq8.K(jm40Var2, (Function1) objP5));
            n0q n0qVar2 = o7k0.c;
            mm40 mm40VarE = mm40VarG0.e(n0qVar2);
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z4 = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar7);
            jpm0.n(fetVar3);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar8);
            imm immVar = thtVar.f33976a;
            int i8 = i7 & 29360128;
            boolean z5 = i8 == 8388608;
            Object objP6 = fetVar3.P();
            if (z5 || objP6 == cl5Var4) {
                objP6 = new hcr(function1, (byte) 27);
                fetVar3.o0(objP6);
            }
            hlm.c(null, immVar, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar3, 0, 0, 4085);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var2, 0.0f, 56.0f, 0.0f, 0.0f, 13), "GENERATE_COUPON_LAZY_COLUMN");
            ch80 ch80VarF = h97.f(12.0f, 12.0f, 12.0f, 64.0f, fetVar3);
            boolean zI = ((i7 & 896) == 256) | ((i7 & 112) == 32) | ((i5 & 112) == 32) | ((i7 & 57344) == 16384) | ((234881024 & i5) == 67108864) | (i8 == 8388608) | ((i5 & 896) == 256) | ((i7 & 458752) == 131072) | fetVar3.i(wpqVar) | fetVar3.g(pkk0Var) | ((57344 & i5) == 16384) | ((3670016 & i5) == 1048576) | ((i5 & 7168) == 2048) | ((i5 & 458752) == 131072) | ((i5 & 29360128) == 8388608) | ((i5 & 1879048192) == 536870912) | ((i7 & 14) == 4);
            Object objP7 = fetVar3.P();
            if (zI) {
                cl5Var = cl5Var4;
            } else {
                cl5Var = cl5Var4;
                if (objP7 != cl5Var) {
                    cl5Var2 = cl5Var;
                    fetVar2 = fetVar3;
                }
                fet fetVar4 = fetVar2;
                b8k0.e(mm40VarE0, null, ch80VarF, null, null, null, false, null, (Function1) objP7, fetVar4, 0, 506);
                fetVar3 = fetVar4;
                zBooleanValue = ((Boolean) l7m0Var11.getValue()).booleanValue();
                jr8Var = jr8.f16991a;
                if (zBooleanValue) {
                    fetVar3.e0(200850030);
                    mm40 mm40VarN = s5x0.N(n0qVar2, 0.0f, 56.0f, 0.0f, 0.0f, 13);
                    n0qVar = n0qVar2;
                    objP2 = fetVar3.P();
                    cl5Var3 = cl5Var2;
                    if (objP2 == cl5Var3) {
                        objP2 = new tet((byte) 5);
                        fetVar3.o0(objP2);
                    }
                    mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28);
                    objP3 = fetVar3.P();
                    if (objP3 == cl5Var3) {
                        objP3 = new vls((byte) 16);
                        fetVar3.o0(objP3);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarW, (Function1) objP3);
                    z = false;
                    tj30 tj30VarC2 = zq8.c(zx7Var3, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarK);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        pcyVar = pcyVar2;
                        fetVar3.l(pcyVar);
                    } else {
                        pcyVar = pcyVar2;
                        fetVar3.r0();
                    }
                    shdVar3 = shdVar5;
                    jpm0.o(fetVar3, tj30VarC2, shdVar3);
                    shdVar4 = shdVar6;
                    jpm0.o(fetVar3, bh90VarM2, shdVar4);
                    shdVar = shdVar7;
                    vqd.u(iHashCode2, fetVar3, shdVar, fetVar3);
                    shdVar2 = shdVar8;
                    jpm0.o(fetVar3, mm40VarC1, shdVar2);
                    zx7Var = zx7Var2;
                    jm40Var = jm40Var2;
                    kpb.j(jr8Var.b(jm40Var, zx7Var), null, fetVar3, 0, 2);
                    z2 = true;
                    fetVar3.r(true);
                    fetVar3.r(false);
                } else {
                    n0qVar = n0qVar2;
                    shdVar = shdVar7;
                    shdVar2 = shdVar8;
                    pcyVar = pcyVar2;
                    zx7Var = r38;
                    shdVar3 = shdVar5;
                    shdVar4 = r40;
                    jm40Var = r32;
                    cl5Var3 = cl5Var2;
                    z = false;
                    z2 = true;
                    fetVar3.e0(201410293);
                    fetVar3.r(false);
                }
                if (((Boolean) l7m0Var12.getValue()).booleanValue()) {
                    fetVar3.e0(201450252);
                    tj30 tj30VarC3 = zq8.c(zx7Var, z);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, n0qVar);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC3, shdVar3);
                    jpm0.o(fetVar3, bh90VarM3, shdVar4);
                    vqd.u(iHashCode3, fetVar3, shdVar, fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, shdVar2);
                    mdm mdmVar = (mdm) l7m0Var13.getValue();
                    if (i8 == 8388608) {
                        z3 = z2;
                    } else {
                        z3 = z;
                    }
                    objP = fetVar3.P();
                    if (z3 || objP == cl5Var3) {
                        objP = new hcr(function2, (byte) 28);
                        fetVar3.o0(objP);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP, fetVar3, 0, 5);
                    fetVar3.r(z2);
                    fetVar3.r(z);
                    thtVar2 = thtVar;
                } else {
                    fetVar3.e0(201865559);
                    if (zBooleanValue2) {
                        fetVar3.e0(201886577);
                        fetVar3.r(z);
                        fA = 0.0f;
                    } else {
                        fetVar3.e0(201930287);
                        WeakHashMap weakHashMap2 = djv0.w;
                        fA = i120.O(zcm0.i(fetVar3).e, fetVar3).a();
                        fetVar3.r(z);
                    }
                    float f2 = fA;
                    thtVar2 = thtVar;
                    l(jr8Var.b(jm40Var, gqw0.h), f2, 0.0f, 0.0f, u1c.M(1027745772, new kom(f2, thtVar2, function1), fetVar3), fetVar3, 24576);
                    fetVar3 = fetVar3;
                    fetVar3.r(z);
                }
                fetVar3.r(z2);
                mm40Var2 = jm40Var;
            }
            cl5Var2 = cl5Var;
            final l7m0 l7m0Var18 = l7m0Var17;
            fetVar2 = fetVar3;
            Function1 function3 = new Function1() { // from class: a.fht
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    hcz hczVar = (hcz) obj;
                    hczVar.getClass();
                    if (((Boolean) l7m0Var11.getValue()).booleanValue() || ((Boolean) l7m0Var12.getValue()).booleanValue()) {
                        return Unit.f46060a;
                    }
                    l7m0 l7m0Var19 = l7m0Var16;
                    l7m0 l7m0Var20 = l7m0Var14;
                    Function1 function4 = function1;
                    cqq cqqVar2 = cqqVar;
                    l7m0 l7m0Var21 = l7m0Var2;
                    l7m0 l7m0Var22 = l7m0Var15;
                    wpq wpqVar2 = wpqVar;
                    pkk0 pkk0Var2 = pkk0Var;
                    l7m0 l7m0Var23 = l7m0Var18;
                    l7m0 l7m0Var24 = l7m0Var3;
                    hcz.e(hczVar, null, null, new ugd(-883947486, true, new jad(l7m0Var19, l7m0Var20, function4, cqqVar2, l7m0Var21, l7m0Var22, wpqVar2, pkk0Var2, l7m0Var23, l7m0Var24, l7m0Var5, l7m0Var8, l7m0Var6)), 3);
                    if (((Boolean) l7m0Var24.getValue()).booleanValue() && ((Boolean) l7m0Var7.getValue()).booleanValue()) {
                        hcz.e(hczVar, null, null, ju70.c, 3);
                        hcz.e(hczVar, null, null, new ugd(944750827, true, new xs4(l7m0Var9, function4, (byte) 25)), 3);
                        hcz.e(hczVar, null, null, ju70.d, 3);
                        hcz.e(hczVar, null, null, new ugd(-185512339, true, new xs4(l7m0Var10, function4, (byte) 26)), 3);
                    }
                    return Unit.f46060a;
                }
            };
            fetVar2.o0(function3);
            objP7 = function3;
            fet fetVar5 = fetVar2;
            b8k0.e(mm40VarE0, null, ch80VarF, null, null, null, false, null, (Function1) objP7, fetVar5, 0, 506);
            fetVar3 = fetVar5;
            zBooleanValue = ((Boolean) l7m0Var11.getValue()).booleanValue();
            jr8Var = jr8.f16991a;
            if (zBooleanValue) {
                fetVar3.e0(200850030);
                mm40 mm40VarN2 = s5x0.N(n0qVar2, 0.0f, 56.0f, 0.0f, 0.0f, 13);
                n0qVar = n0qVar2;
                objP2 = fetVar3.P();
                cl5Var3 = cl5Var2;
                if (objP2 == cl5Var3) {
                    objP2 = new tet((byte) 5);
                    fetVar3.o0(objP2);
                }
                mm40 mm40VarW2 = y860.W(mm40VarN2, null, null, false, null, (Function0) objP2, 28);
                objP3 = fetVar3.P();
                if (objP3 == cl5Var3) {
                    objP3 = new vls((byte) 16);
                    fetVar3.o0(objP3);
                }
                mm40 mm40VarK2 = rq8.K(mm40VarW2, (Function1) objP3);
                z = false;
                tj30 tj30VarC4 = zq8.c(zx7Var3, false);
                int iHashCode4 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM4 = fetVar3.m();
                mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarK2);
                fetVar3.i0();
                if (fetVar3.S) {
                    pcyVar = pcyVar2;
                    fetVar3.l(pcyVar);
                } else {
                    pcyVar = pcyVar2;
                    fetVar3.r0();
                }
                shdVar3 = shdVar5;
                jpm0.o(fetVar3, tj30VarC4, shdVar3);
                shdVar4 = shdVar6;
                jpm0.o(fetVar3, bh90VarM4, shdVar4);
                shdVar = shdVar7;
                vqd.u(iHashCode4, fetVar3, shdVar, fetVar3);
                shdVar2 = shdVar8;
                jpm0.o(fetVar3, mm40VarC3, shdVar2);
                zx7Var = zx7Var2;
                jm40Var = jm40Var2;
                kpb.j(jr8Var.b(jm40Var, zx7Var), null, fetVar3, 0, 2);
                z2 = true;
                fetVar3.r(true);
                fetVar3.r(false);
            } else {
                n0qVar = n0qVar2;
                shdVar = shdVar7;
                shdVar2 = shdVar8;
                pcyVar = pcyVar2;
                zx7Var = r38;
                shdVar3 = shdVar5;
                shdVar4 = r40;
                jm40Var = r32;
                cl5Var3 = cl5Var2;
                z = false;
                z2 = true;
                fetVar3.e0(201410293);
                fetVar3.r(false);
            }
            if (((Boolean) l7m0Var12.getValue()).booleanValue()) {
                fetVar3.e0(201450252);
                tj30 tj30VarC5 = zq8.c(zx7Var, z);
                int iHashCode5 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM5 = fetVar3.m();
                mm40 mm40VarC4 = kbc.c0(fetVar3, n0qVar);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC5, shdVar3);
                jpm0.o(fetVar3, bh90VarM5, shdVar4);
                vqd.u(iHashCode5, fetVar3, shdVar, fetVar3);
                jpm0.o(fetVar3, mm40VarC4, shdVar2);
                mdm mdmVar2 = (mdm) l7m0Var13.getValue();
                if (i8 == 8388608) {
                    z3 = z2;
                } else {
                    z3 = z;
                }
                objP = fetVar3.P();
                if (z3) {
                    objP = new hcr(function2, (byte) 28);
                    fetVar3.o0(objP);
                } else {
                    objP = new hcr(function2, (byte) 28);
                    fetVar3.o0(objP);
                }
                jcb.l(null, mdmVar2, false, (Function0) objP, fetVar3, 0, 5);
                fetVar3.r(z2);
                fetVar3.r(z);
                thtVar2 = thtVar;
            } else {
                fetVar3.e0(201865559);
                if (zBooleanValue2) {
                    fetVar3.e0(201886577);
                    fetVar3.r(z);
                    fA = 0.0f;
                } else {
                    fetVar3.e0(201930287);
                    WeakHashMap weakHashMap3 = djv0.w;
                    fA = i120.O(zcm0.i(fetVar3).e, fetVar3).a();
                    fetVar3.r(z);
                }
                float f3 = fA;
                thtVar2 = thtVar;
                l(jr8Var.b(jm40Var, gqw0.h), f3, 0.0f, 0.0f, u1c.M(1027745772, new kom(f3, thtVar2, function1), fetVar3), fetVar3, 24576);
                fetVar3 = fetVar3;
                fetVar3.r(z);
            }
            fetVar3.r(z2);
            mm40Var2 = jm40Var;
        } else {
            thtVar2 = thtVar;
            function2 = function1;
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            final tht thtVar3 = thtVar2;
            final Function1 function4 = function2;
            yfe0VarU.d = new Function2() { // from class: a.ght
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    f1t0.w(mm40Var2, l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var8, l7m0Var9, l7m0Var10, l7m0Var11, l7m0Var12, l7m0Var13, l7m0Var14, l7m0Var15, thtVar3, function4, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(float f2, int i2, bzl bzlVar, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z, boolean z2, boolean z3) {
        mm40 mm40Var2;
        d9z d9zVarA;
        mm40 mm40VarV;
        byte b2;
        Object obj;
        byte b3;
        Object obj2;
        fetVar.g0(1080408984);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(bzlVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(a4xVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        byte b4 = 0;
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            if (z) {
                fetVar.e0(-20494717);
                d9zVarA = f9z.a(fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-20448992);
                d9zVarA = bdzVar.a("KEY_LAZY_LIST_EVENTS", fetVar);
                fetVar.r(false);
            }
            d9z d9zVar = d9zVarA;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (bzlVar != null) {
                fetVar.e0(-20321706);
                boolean z4 = (458752 & i3) == 131072;
                Object objP = fetVar.P();
                Object obj3 = objP;
                if (z4 || objP == cl5Var) {
                    kg2 kg2Var = new kg2(b4, z);
                    fetVar.o0(kg2Var);
                    obj3 = kg2Var;
                }
                mm40VarV = cjx.V(jm40Var, bzlVar.a((Function0) obj3), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-20203534);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i4 = i3;
            boolean zG = ((i4 & 29360128) == 8388608) | fetVar.g(d9zVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                b2 = 0;
                mg2 mg2Var = new mg2(z3, d9zVar, null, b2);
                fetVar.o0(mg2Var);
                obj = mg2Var;
            } else {
                b2 = 0;
                obj = objP2;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) obj);
            if (z3) {
                function1.invoke(cg2.f4292a);
            }
            int i5 = i4 & 234881024;
            int i6 = (fetVar.g(d9zVar) ? 1 : 0) | (i5 == 67108864 ? (byte) 1 : b2);
            Object objP3 = fetVar.P();
            if (i6 != 0 || objP3 == cl5Var) {
                b3 = 1;
                pd0 pd0Var = new pd0(d9zVar, function1, null, b3);
                fetVar.o0(pd0Var);
                obj2 = pd0Var;
            } else {
                b3 = 1;
                obj2 = objP3;
            }
            m0x0.t(fetVar, d9zVar, (Function2) obj2);
            n0q n0qVar = o7k0.c;
            byte b5 = i5 == 67108864 ? b3 : (byte) 0;
            Object objP4 = fetVar.P();
            Object obj4 = objP4;
            if (b5 != 0 || objP4 == cl5Var) {
                ja2 ja2Var = new ja2(function1, (byte) 14);
                fetVar.o0(ja2Var);
                obj4 = ja2Var;
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) obj4, null, u1c.M(627778669, new ai2(mm40VarV, z, f2, d9zVar, pz40VarF, function1, (byte) 2), fetVar), fetVar, ((i4 >> 15) & 112) | 100663296, 184);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lg2(mm40Var2, f2, bdzVar, bzlVar, a4xVar, z, z2, z3, function1, i2);
        }
    }

    public static final void y(mm40 mm40Var, a4x a4xVar, boolean z, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        byte b2;
        fetVar.g0(-726248769);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(mtlVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 4.0f, xfn.a(fetVar).d, 20.0f);
            boolean z2 = ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                b2 = 1;
                objP = new a7j0(a4xVar, function1, b2);
                fetVar.o0(objP);
            } else {
                b2 = 1;
            }
            int i4 = i3;
            b8k0.e(mm40VarH, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            if (z) {
                fetVar.e0(-2029869714);
                o050.f(null, mtlVar, function1, fetVar, (i4 >> 6) & 1008);
                fetVar.r(false);
            } else {
                fetVar.e0(-2029736135);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, (Object) a4xVar, z, (Object) mtlVar, (wdr) function1, i2, (byte) 8);
        }
    }

    public static final void z(int i2, fet fetVar) {
        fetVar.g0(-325227111);
        byte b2 = 3;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new igh0((byte) 28);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(null, new dkm((ycl) null, new y3d(s6t0.b().f33626a.getPrimary()), b2), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d1i0(i2, b2);
        }
    }
}
