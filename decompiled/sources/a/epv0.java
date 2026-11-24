package a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class epv0 {
    public static final ugd f;
    public static final zai0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f8206a = new ugd(1583292821, false, new wgd(19));
    public static final ugd b = new ugd(636288403, false, new vgd(6));
    public static final ugd c = new ugd(-1357803046, false, new vgd(7));
    public static final ugd d = new ugd(396252353, false, new fhd(11));
    public static final ugd e = new ugd(1781140959, false, new mhd(8));
    public static final int[] g = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static final int[] h = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    public static final int[] i = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    public static final int[] j = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};
    public static final Object k = new Object();
    public static final zai0 m = new zai0("AccessibilityClassName", true, new d1i0(12));
    public static final zai0 n = new zai0("CredentialRequest", false, new d1i0(21));
    public static final Object o = new Object();
    public static final String[] p = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] q = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    static {
        byte b2 = 20;
        f = new ugd(-1241125530, false, new qhd(b2));
        l = new zai0("TestTagsAsResourceId", false, new d1i0(b2));
    }

    public static final void A(String str, String str2, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        String str3;
        ilm ilmVar;
        tlm olmVar;
        fetVar.g0(-927286795);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ilm ilmVar2 = new ilm(secondary);
            int length = str3.length();
            fa50 fa50Var = fa50.f9191a;
            if (length == 0) {
                olmVar = new plm(str, secondary, fa50Var);
                ilmVar = ilmVar2;
            } else {
                ilmVar = ilmVar2;
                olmVar = new olm(str, str3, secondary, secondary, fa50Var);
            }
            imm immVar = new imm(ilmVar, olmVar, !z ? new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, secondary))) : fmm.f9790a, backgroundContent, false, null);
            int i5 = i4 & 7168;
            boolean z2 = i5 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new bac0(function1, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i5 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new rpa0(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 9, i2, (Object) str, (Object) str2, (Object) function1, z);
        }
    }

    public static final void B(l7m0 l7m0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-341670793);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            wgc0 wgc0Var = (wgc0) l7m0Var.getValue();
            mm40 mm40VarR = knm0.r(o2e.e0(o7k0.c, "PROMOCODES_COLUMN"));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = wgc0Var.g;
            vgc0 vgc0Var = wgc0Var.f39109a;
            A(str, wgc0Var.d, wgc0Var.c, function1, fetVar2, (i3 << 6) & 7168);
            fetVar2 = fetVar2;
            if (wgc0Var.b) {
                fetVar2.e0(1167954255);
                D(vgc0Var, l7m0Var, function1, fetVar2, (i3 << 3) & 1008);
                mbc.o(zfi0.f44303a, o7k0.d(jm40.b, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1168267541);
                fetVar2.r(false);
            }
            C(vgc0Var, ugdVar, ugdVar2, fetVar2, 432);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(l7m0Var, function1, ugdVar, ugdVar2, i2);
        }
    }

    public static final void C(vgc0 vgc0Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1482064994);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(vgc0Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = vgc0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1664675921);
                twn.v((i3 >> 3) & 14, ugdVar, fetVar, false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1664677806, fetVar, false);
                }
                fetVar.e0(-1664674092);
                twn.v((i3 >> 6) & 14, ugdVar2, fetVar, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(vgc0Var, ugdVar, ugdVar2, i2, (byte) 24);
        }
    }

    public static final void D(vgc0 vgc0Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        vgc0 vgc0Var2;
        fetVar.g0(2137297461);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(vgc0Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40.b, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 16.0f, 8.0f);
            dxh0 dxh0Var = ((wgc0) l7m0Var.getValue()).e;
            a4x a4xVar = ((wgc0) l7m0Var.getValue()).f;
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                vgc0Var2 = vgc0Var;
                objP = new ssa0(vgc0Var2, (byte) 21);
                fetVar.o0(objP);
            } else {
                vgc0Var2 = vgc0Var;
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new rpa0(function1, (byte) 23);
                fetVar.o0(objP2);
            }
            ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar, 384, 16);
        } else {
            vgc0Var2 = vgc0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(vgc0Var2, l7m0Var, function1, i2, (byte) 23);
        }
    }

    public static final void E(a4x a4xVar, l7m0 l7m0Var, boolean z, bdz bdzVar, boolean z2, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        a4x a4xVar2;
        boolean z3;
        boolean z4;
        Function1 function3;
        fetVar.g0(-2025913795);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            a4xVar2 = a4xVar;
            i3 |= fetVar.g(a4xVar2) ? 32 : 16;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z3 = z;
            i3 |= fetVar.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(bdzVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z4 = z2;
            i3 |= fetVar.h(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            function3 = function2;
            i3 |= fetVar.i(function3) ? 8388608 : 4194304;
        } else {
            function3 = function2;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            wom womVarF = mom.f(fetVar);
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 17);
                fetVar.o0(objP);
            }
            mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(440540744, new na2(bdzVar, z3, a4xVar2, z4, function1, function3), fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwl(a4xVar, l7m0Var, z, bdzVar, z2, function1, function2, i2);
        }
    }

    public static final void F(long j2, fet fetVar, int i2) {
        fetVar.g0(2055373396);
        int i3 = (fetVar.f(j2) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j2, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a21(j2, i2, (byte) 17);
        }
    }

    public static final void G(int i2, fet fetVar) {
        fetVar.g0(-2101869077);
        int i3 = i2 & 1;
        if (fetVar.U(i3, i3 != 0)) {
            zfn zfnVar = zaq0.b;
            F(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fetVar, 0);
            F(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fetVar, 0);
            F(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fetVar, 0);
            F(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3t(i2, (byte) 9);
        }
    }

    public static final void H(final xpj0 xpj0Var, final float f2, final float f3, final boolean z, final yjj0 yjj0Var, final long j2, final long j3, final float f4, final Function2 function2, final ugd ugdVar, fet fetVar, final int i2) {
        boolean z2;
        float f5;
        mm40 mm40VarV;
        fetVar.g0(-2108849428);
        int i3 = i2 | (fetVar.g(xpj0Var) ? 4 : 2) | (fetVar.d(f2) ? 32 : 16) | (fetVar.d(f3) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.g(yjj0Var) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536) | (fetVar.f(j3) ? 1048576 : 524288) | (fetVar.d(0.0f) ? 8388608 : 4194304) | (fetVar.d(f4) ? 67108864 : 33554432) | (fetVar.i(function2) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && ((fetVar.i(ugdVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            yt40 yt40Var = yt40.f43200a;
            nul0 nul0VarP = d7x.P(yt40Var, fetVar);
            nul0 nul0VarP2 = d7x.P(yt40Var, fetVar);
            nul0 nul0VarP3 = d7x.P(yt40.d, fetVar);
            int i4 = i3 & 14;
            boolean zI = (i4 == 4) | fetVar.i(nul0VarP2) | fetVar.i(nul0VarP3) | fetVar.i(nul0VarP);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                z2 = false;
                f5 = 0.0f;
                Object np8Var = new np8(xpj0Var, nul0VarP2, nul0VarP3, nul0VarP, (byte) 0);
                fetVar.o0(np8Var);
                objP = np8Var;
            } else {
                z2 = false;
                f5 = 0.0f;
            }
            m0x0.D((Function0) objP, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            ma80 ma80Var = ma80.f21447a;
            float fW0 = ((w6k) fetVar.k(bmd.h)).w0(f2);
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(2049456610);
                boolean zG = fetVar.g(xpj0Var.e);
                Object objP3 = fetVar.P();
                if (zG || objP3 == obj) {
                    op7 op7Var = new op7(vneVar, xpj0Var, (byte) 12);
                    uts0 uts0Var = tpj0.f34337a;
                    objP3 = new spj0(xpj0Var, op7Var);
                    fetVar.o0(objP3);
                }
                mm40VarV = cjx.V(jm40Var, (vj50) objP3, null);
                fetVar.r(false);
            } else {
                fetVar.e0(2049851798);
                fetVar.r(z2);
                mm40VarV = jm40Var;
            }
            mm40 mm40VarE = o7k0.d(o7k0.u(jm40Var, 0.0f, f3, 1), 1.0f).e(new m7k0(0.0f, f2, 0.0f, Float.NaN, false, 5)).e(mm40VarV);
            qv2 qv2Var = xpj0Var.e;
            boolean zD = fetVar.d(fW0) | (i4 == 4);
            Object objP4 = fetVar.P();
            if (zD || objP4 == obj) {
                objP4 = new rx7(xpj0Var, fW0);
                fetVar.o0(objP4);
            }
            mm40 mm40VarE2 = s5x0.E(mm40VarE, qv2Var, (Function2) objP4);
            qv2 qv2Var2 = xpj0Var.e;
            mm40 mm40VarT = i4w0.T(uel.a(mm40VarE2, (pv2) qv2Var2.g, ma80Var, z, ((hgk0) ((pz40) qv2Var2.i)).getValue() != null, null, new ru2(qv2Var2, null), 32), new pp8(xpj0Var, (byte) 1));
            ugd ugdVarM = u1c.M(1508311921, new zp8(xpj0Var, function2, ugdVar, vneVar, z), fetVar);
            int i5 = i3 >> 9;
            gmn0.a(mm40VarT, yjj0Var, j2, j3, f5, f4, null, ugdVarM, fetVar, (i5 & 458752) | (i5 & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (57344 & i5), 64);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(f2, f3, z, yjj0Var, j2, j3, f4, function2, ugdVar, i2) { // from class: a.op8
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ yjj0 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ float h;
                public final /* synthetic */ Function2 i;
                public final /* synthetic */ ugd j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(1);
                    epv0.H(this.f25630a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj2, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void I(mm40 mm40Var, final zdo0 zdo0Var, boolean z, final boolean z2, boolean z3, final int i2, final e2d e2dVar, final Function1 function1, fet fetVar, int i3) {
        mm40 mm40Var2;
        Boolean bool;
        zdo0Var.getClass();
        e2dVar.getClass();
        function1.getClass();
        fetVar.g0(493984859);
        int i4 = i3 | 6 | (fetVar.g(zdo0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.h(z2) ? 2048 : 1024) | (fetVar.h(z3) ? 16384 : 8192) | (fetVar.e(i2) ? 131072 : 65536) | (fetVar.g(e2dVar) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i4 & 1, (4793491 & i4) != 4793490)) {
            d9z d9zVarA = f9z.a(fetVar);
            d9z d9zVarA2 = f9z.a(fetVar);
            d9z d9zVar = i2 == 0 ? d9zVarA : d9zVarA2;
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ((57344 & i4) == 16384) | fetVar.g(d9zVarA) | fetVar.g(d9zVarA2);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                bool = boolValueOf;
                xj1 xj1Var = new xj1(z3, (Object) d9zVarA, (Object) d9zVarA2, (yje) null, (byte) 21);
                fetVar.o0(xj1Var);
                objP = xj1Var;
            } else {
                bool = boolValueOf;
            }
            m0x0.t(fetVar, bool, (Function2) objP);
            if (z3) {
                function1.invoke(i6r0.f14256a);
            }
            n0q n0qVar = o7k0.c;
            boolean z4 = (29360128 & i4) == 8388608;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new opm0(function1, (byte) 22);
                fetVar.o0(objP2);
            }
            final d9z d9zVar2 = d9zVar;
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(1564941168, new xdr() { // from class: a.cbo0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ir8) obj).getClass();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        zdo0 zdo0Var2 = zdo0Var;
                        if (zdo0Var2 != null) {
                            boolean z5 = zdo0Var2 instanceof wdo0;
                            Function1 function2 = function1;
                            if (z5) {
                                fetVar2.e0(-707598919);
                                epv0.J(null, (wdo0) zdo0Var2, function2, fetVar2, 0);
                                fetVar2.r(false);
                            } else {
                                boolean z6 = zdo0Var2 instanceof xdo0;
                                int i5 = i2;
                                d9z d9zVar3 = d9zVar2;
                                e2d e2dVar2 = e2dVar;
                                boolean z7 = z2;
                                if (z6) {
                                    fetVar2.e0(-707449158);
                                    xdo0 xdo0Var = (xdo0) zdo0Var2;
                                    epv0.K(null, String.valueOf(i5), d9zVar3, e2dVar2, z7, xdo0Var.b, xdo0Var.f40705a, function2, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (zdo0Var2 instanceof ydo0) {
                                    fetVar2.e0(-707009144);
                                    epv0.K(null, String.valueOf(i5), d9zVar3, e2dVar2, z7, false, ((ydo0) zdo0Var2).f42449a, function2, fetVar2, 196608);
                                    fetVar2.r(false);
                                }
                            }
                        }
                        throw b1j.f(669910191, fetVar2, false);
                    }
                    fetVar2.X();
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i4 >> 3) & 112) | 100663296, 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z26(mm40Var2, zdo0Var, z, z2, z3, i2, e2dVar, function1, i3);
        }
    }

    public static final void J(mm40 mm40Var, wdo0 wdo0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1215449477);
        int i3 = i2 | 6 | (fetVar.g(wdo0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new qkx(0L));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarA0 = wha0.a0(o7k0.c, wha0.T(fetVar), false, 14);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new dbo0(pz40Var, b2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarY = fre0.Y(mm40VarA0, (Function1) objP2);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            float fT = f7k.T((int) (((qkx) pz40Var.getValue()).f28908a >> 32));
            float fT2 = f7k.T((int) (((qkx) pz40Var.getValue()).f28908a & 4294967295L));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, fT, fT2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            mdm mdmVar = wdo0Var.f38984a;
            b2 = (i3 & 896) == 256 ? (byte) 1 : (byte) 0;
            Object objP3 = fetVar.P();
            if (b2 != 0 || objP3 == cl5Var) {
                objP3 = new opm0(function1, (byte) 24);
                fetVar.o0(objP3);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, wdo0Var, function1, i2, (byte) 6);
        }
    }

    public static final void K(mm40 mm40Var, String str, d9z d9zVar, e2d e2dVar, boolean z, boolean z2, a4x a4xVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z3;
        mm40 mm40VarV;
        fetVar.g0(-760041185);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        int i4 = i3 | (fetVar.g(a4xVar) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i4 & 1, (4793491 & i4) != 4793490)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            int i5 = pkd.d(fetVar) ? 2 : 1;
            Object[] objArr = new Object[0];
            int i6 = i4 & 896;
            boolean z4 = i6 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z4 || objP == obj) {
                objP = new md0(d9zVar, (byte) 21);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = {str};
            boolean z5 = ((i4 & 112) == 32) | (i6 == 256);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == obj) {
                objP2 = new o0k0((Object) str, (Object) d9zVar, (byte) 23);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            fetVar.e0(-255111064);
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-107809276);
                d2d d2dVar = (d2d) l7m0VarY2.getValue();
                boolean zG = fetVar.g(l7m0VarY);
                Object objP3 = fetVar.P();
                if (zG || objP3 == obj) {
                    objP3 = new g7o0(l7m0VarY, (byte) 4);
                    fetVar.o0(objP3);
                }
                mm40VarV = cjx.V(jm40Var, e2dVar.a(d2dVar, (Function0) objP3), null);
                z3 = false;
                fetVar.r(false);
            } else {
                z3 = false;
                fetVar.e0(-107541405);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            fetVar.r(z3);
            int i7 = 29360128 & i4;
            boolean z6 = i7 == 8388608;
            Object objP4 = fetVar.P();
            if (z6 || objP4 == obj) {
                objP4 = new opm0(function1, (byte) 25);
                fetVar.o0(objP4);
            }
            mm40 mm40VarA = pzw.A(0, fetVar, mm40VarV, (Function0) objP4);
            ngv ngvVar = new ngv(i5);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 24.0f, fetVar);
            boolean zG2 = fetVar.g(pz40VarF) | ((458752 & i4) == 131072) | (i7 == 8388608);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj) {
                objP5 = new ka2(pz40VarF, z2, function1, (byte) 10);
                fetVar.o0(objP5);
            }
            mm40Var2 = jm40Var;
            g8x.i(ngvVar, mm40VarA, d9zVar, ch80VarF, qw3Var2, qw3Var, null, false, null, (Function1) objP5, fetVar, i6, 912);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bco(mm40Var2, str, d9zVar, e2dVar, z, z2, a4xVar, function1, i2);
        }
    }

    public static final void L(jdv jdvVar, fet fetVar, int i2) {
        fetVar.g0(947504807);
        int i3 = (fetVar.g(jdvVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1794587111, new sjs(jdvVar, (pz40) objP, (byte) 7), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jar(jdvVar, i2, (byte) 25);
        }
    }

    public static final void M(Integer num, long j2, long j3, float f2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-908872261);
        int i3 = i2 | (fetVar2.g(num) ? 4 : 2) | (fetVar2.g(null) ? 32 : 16) | (fetVar2.f(j2) ? 256 : 128) | (fetVar2.f(j3) ? 2048 : 1024);
        if (!fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar2.X();
        } else if (num != null) {
            fetVar2.e0(-739437529);
            j0x.b(a8k0.F(num.intValue(), i3 & 14, fetVar2), null, o2e.e0(o7k0.c, "GAME_IMAGE_TAG"), null, gqw0.A, 0.0f, null, fetVar, 25016, 104);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            fetVar2.e0(-739144703);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_games, 0, fetVar2), null, o2e.e0(o7k0.n(s5x0.J(jr8.f16991a.b(jm40.b, gqw0.b), cla.a(fetVar2)), f2), "GAME_IMAGE_TAG"), j3, fetVar2, 56 | (i3 & 7168), 0);
            fetVar2.r(true);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wan(num, j2, j3, f2, i2, (byte) 0);
        }
    }

    public static final mm40 N(mm40 mm40Var, float f2) {
        return f2 == 1.0f ? mm40Var : i4w0.U(mm40Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 0, null, 1044475);
    }

    public static final mdm O(int i2) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0360 A[LOOP:6: B:108:0x0330->B:122:0x0360, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x0370 A[SYNTHETIC] */
    public static final cpv0 P(Context context, wsd wsdVar) {
        vdg0 vdg0Var;
        String name;
        pa80 pa80VarE;
        rkn0 rkn0Var;
        boolean zContainsKey;
        context.getClass();
        fpv0 fpv0Var = new fpv0(wsdVar.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        xgi0 xgi0Var = fpv0Var.f9946a;
        xgi0Var.getClass();
        s2m0 s2m0Var = wsdVar.d;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            vdg0Var = new vdg0(applicationContext, null);
            vdg0Var.i = true;
        } else {
            if (StringsKt.W("androidx.work.workdb")) {
                jf4.o("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            vdg0 vdg0Var2 = new vdg0(applicationContext, "androidx.work.workdb");
            vdg0Var2.h = new qty(applicationContext);
            vdg0Var = vdg0Var2;
        }
        vdg0Var.f = xgi0Var;
        ioc iocVar = new ioc();
        ArrayList arrayList = vdg0Var.d;
        arrayList.add(iocVar);
        vdg0Var.a(jg40.h);
        vdg0Var.a(new unf0(applicationContext, 2, 3));
        vdg0Var.a(jg40.i);
        vdg0Var.a(jg40.j);
        vdg0Var.a(new unf0(applicationContext, 5, 6));
        vdg0Var.a(jg40.k);
        vdg0Var.a(jg40.l);
        vdg0Var.a(jg40.m);
        vdg0Var.a(new unf0(applicationContext));
        vdg0Var.a(new unf0(applicationContext, 10, 11));
        vdg0Var.a(jg40.d);
        vdg0Var.a(jg40.e);
        vdg0Var.a(jg40.f);
        vdg0Var.a(jg40.g);
        vdg0Var.a(new unf0(applicationContext, 21, 22));
        vdg0Var.n = false;
        vdg0Var.o = true;
        vdg0Var.p = true;
        Executor executor = vdg0Var.f;
        if (executor == null && vdg0Var.g == null) {
            ew3 ew3Var = fw3.c;
            vdg0Var.g = ew3Var;
            vdg0Var.f = ew3Var;
        } else if (executor != null && vdg0Var.g == null) {
            vdg0Var.g = executor;
        } else if (executor == null) {
            vdg0Var.f = vdg0Var.g;
        }
        LinkedHashSet linkedHashSet = vdg0Var.l;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = vdg0Var.k;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    c99.s(twn.m(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        qkn0 sekVar = vdg0Var.h;
        if (sekVar == null) {
            sekVar = new sek();
        }
        qkn0 qkn0Var = sekVar;
        boolean z = vdg0Var.i;
        ydg0 ydg0Var = ydg0.f42436a;
        Context context2 = vdg0Var.b;
        Object systemService = context2.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        ydg0 ydg0Var2 = (activityManager == null || activityManager.isLowRamDevice()) ? ydg0.f42436a : ydg0.b;
        Executor executor2 = vdg0Var.f;
        if (executor2 == null) {
            jf4.o("Required value was null.");
            return null;
        }
        Executor executor3 = vdg0Var.g;
        if (executor3 == null) {
            jf4.o("Required value was null.");
            return null;
        }
        boolean z2 = vdg0Var.n;
        boolean z3 = vdg0Var.o;
        boolean z4 = vdg0Var.p;
        String str = vdg0Var.c;
        ea70 ea70Var = vdg0Var.j;
        ArrayList arrayList2 = vdg0Var.e;
        ArrayList arrayList3 = vdg0Var.m;
        rcj rcjVar = new rcj(context2, str, qkn0Var, ea70Var, arrayList, z, ydg0Var2, executor2, executor3, null, z2, z3, linkedHashSet2, null, null, null, arrayList2, arrayList3, z4, null, null);
        Class clsG = azw.G(vdg0Var.f37231a);
        Package r6 = clsG.getPackage();
        if (r6 == null || (name = r6.getName()) == null) {
            name = "";
        }
        String canonicalName = clsG.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsG.getClassLoader());
            cls.getClass();
            aeg0 aeg0Var = (aeg0) cls.getDeclaredConstructor(null).newInstance(null);
            aeg0Var.getClass();
            aeg0Var.k = true;
            try {
                pa80VarE = aeg0Var.e();
                pa80VarE.getClass();
            } catch (q660 unused) {
                pa80VarE = null;
            }
            if (pa80VarE == null) {
                new udg0(rcjVar, new wtf0(aeg0Var));
                throw null;
            }
            aeg0Var.e = new udg0(rcjVar, pa80VarE);
            aeg0Var.f = aeg0Var.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setI = aeg0Var.i();
            int size = setI.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setI.iterator();
            while (true) {
                int i2 = -1;
                if (!it2.hasNext()) {
                    int size2 = arrayList3.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                jf4.o("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                    for (eg40 eg40Var : aeg0Var.c(linkedHashMap)) {
                        byte b2 = eg40Var.f7744a;
                        byte b3 = eg40Var.b;
                        ea70 ea70Var2 = rcjVar.d;
                        LinkedHashMap linkedHashMap2 = ea70Var2.f7454a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b2));
                            if (map == null) {
                                map = lun.f20680a;
                                map.getClass();
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(b3));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            ea70Var2.a(eg40Var);
                        }
                    }
                    LinkedHashMap linkedHashMapJ = aeg0Var.j();
                    boolean[] zArr2 = new boolean[linkedHashMapJ.size()];
                    for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                        sgy sgyVar = (sgy) entry.getKey();
                        for (sgy sgyVar2 : (List) entry.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (sgyVar2.r(arrayList2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    }
                                    if (i4 >= 0) {
                                        size3 = i4;
                                    }
                                }
                                if (size3 >= 0) {
                                    itt0.m("A required type converter (", sgyVar2.v(), ") for ", sgyVar.v(), " is missing in the database configuration.");
                                    return null;
                                }
                                Object obj = arrayList2.get(size3);
                                sgyVar2.getClass();
                                obj.getClass();
                                aeg0Var.j.put(sgyVar2, obj);
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                itt0.m("A required type converter (", sgyVar2.v(), ") for ", sgyVar.v(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj2 = arrayList2.get(size3);
                            sgyVar2.getClass();
                            obj2.getClass();
                            aeg0Var.j.put(sgyVar2, obj2);
                        }
                    }
                    int size4 = arrayList2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            if (!zArr2[size4]) {
                                jf4.o(f140.k(arrayList2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                return null;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size4 = i5;
                        }
                    }
                    aeg0Var.c = rcjVar.h;
                    aeg0Var.d = new gd3(rcjVar.i);
                    Executor executor4 = aeg0Var.c;
                    if (executor4 == null) {
                        Intrinsics.h("internalQueryExecutor");
                        throw null;
                    }
                    sje sjeVarA = d5c.a(kotlin.coroutines.e.c(obb.Y(executor4), qem0.e()));
                    aeg0Var.f727a = sjeVarA;
                    CoroutineContext coroutineContext = sjeVarA.f32300a;
                    gd3 gd3Var = aeg0Var.d;
                    if (gd3Var == null) {
                        Intrinsics.h("internalTransactionExecutor");
                        throw null;
                    }
                    aeg0Var.b = coroutineContext.plus(obb.Y(gd3Var));
                    aeg0Var.h = rcjVar.f;
                    udg0 udg0Var = aeg0Var.e;
                    if (udg0Var == null) {
                        Intrinsics.h("connectionManager");
                        throw null;
                    }
                    rkn0 rkn0VarC = udg0Var.c();
                    if (rkn0VarC == null) {
                        rkn0VarC = null;
                        break;
                    }
                    while (!(rkn0VarC instanceof srb0)) {
                        if (!(rkn0VarC instanceof g3k)) {
                            rkn0VarC = null;
                            break;
                        }
                        rkn0VarC = ((g3k) rkn0VarC).a();
                    }
                    udg0 udg0Var2 = aeg0Var.e;
                    if (udg0Var2 == null) {
                        Intrinsics.h("connectionManager");
                        throw null;
                    }
                    rkn0 rkn0VarC2 = udg0Var2.c();
                    if (rkn0VarC2 == null) {
                        rkn0Var = null;
                        break;
                    }
                    while (true) {
                        if (rkn0VarC2 instanceof hy4) {
                            rkn0Var = rkn0VarC2;
                            break;
                        }
                        if (!(rkn0VarC2 instanceof g3k)) {
                            rkn0Var = null;
                            break;
                        }
                        rkn0VarC2 = ((g3k) rkn0VarC2).a();
                    }
                    WorkDatabase workDatabase = (WorkDatabase) aeg0Var;
                    Context applicationContext2 = context.getApplicationContext();
                    applicationContext2.getClass();
                    lds0 lds0Var = new lds0(applicationContext2, fpv0Var);
                    ezb0 ezb0Var = new ezb0(context.getApplicationContext(), wsdVar, fpv0Var, workDatabase);
                    return new cpv0(context.getApplicationContext(), wsdVar, fpv0Var, workDatabase, (List) dpv0.f6484a.n(context, wsdVar, fpv0Var, workDatabase, lds0Var, ezb0Var), ezb0Var, lds0Var);
                }
                sgy sgyVar3 = (sgy) it2.next();
                int size5 = arrayList3.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i6 = size5 - 1;
                        if (sgyVar3.r(arrayList3.get(size5))) {
                            zArr[size5] = true;
                            i2 = size5;
                            break;
                        }
                        if (i6 < 0) {
                            break;
                        }
                        size5 = i6;
                    }
                }
                if (i2 < 0) {
                    e9d0.u(sgyVar3.v(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(sgyVar3, arrayList3.get(i2));
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + clsG.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            e9d0.m(ohs0.l(clsG, new StringBuilder("Cannot access the constructor ")), e3);
            return null;
        } catch (InstantiationException e4) {
            e9d0.m(ohs0.l(clsG, new StringBuilder("Failed to create an instance of ")), e4);
            return null;
        }
    }

    public static void Q(k7m0 k7m0Var, int i2) {
        int i3;
        s68 s68Var = k7m0Var.c;
        int[] iArr = k7m0Var.p;
        int i4 = i2 * 2;
        s68.b(s68Var);
        int i5 = i2 * 1080;
        int iW = W(k7m0Var.e, i5, s68Var);
        int[] iArr2 = k7m0Var.n;
        int[] iArr3 = k7m0Var.f;
        s68.b(s68Var);
        int iW2 = W(iArr3, i5, s68Var);
        iArr2[i2] = s68.d(s68Var, fre0.g[iW2]) + fre0.f[iW2];
        if (iW == 1) {
            i3 = iArr[i4 + 1] + 1;
        } else {
            i3 = iW == 0 ? iArr[i4] : iW - 2;
        }
        int i6 = k7m0Var.o[i2];
        if (i3 >= i6) {
            i3 -= i6;
        }
        int i7 = i4 + 1;
        iArr[i4] = iArr[i7];
        iArr[i7] = i3;
    }

    public static int R(int i2, byte[] bArr, s68 s68Var) {
        int iD;
        s68.e(s68Var);
        if (s68.d(s68Var, 1) != 0) {
            int iD2 = s68.d(s68Var, 3);
            iD = iD2 == 0 ? 1 : s68.d(s68Var, iD2) + (1 << iD2);
        } else {
            iD = 0;
        }
        int i3 = iD + 1;
        if (i3 == 1) {
            int i4 = 0;
            while (i4 < i2) {
                int iMin = Math.min(i4 + 1024, i2) - i4;
                System.arraycopy(xf0.v, 0, bArr, i4, iMin);
                i4 += iMin;
            }
        } else {
            int iD3 = s68.d(s68Var, 1) == 1 ? s68.d(s68Var, 4) + 1 : 0;
            int[] iArr = new int[1080];
            V(i3 + iD3, iArr, 0, s68Var);
            int i5 = 0;
            while (i5 < i2) {
                s68.e(s68Var);
                s68.b(s68Var);
                int iW = W(iArr, 0, s68Var);
                if (iW == 0) {
                    bArr[i5] = 0;
                } else if (iW <= iD3) {
                    for (int iD4 = s68.d(s68Var, iW) + (1 << iW); iD4 != 0; iD4--) {
                        if (i5 >= i2) {
                            v4i0.l("Corrupted context map");
                            return 0;
                        }
                        bArr[i5] = 0;
                        i5++;
                    }
                } else {
                    bArr[i5] = (byte) (iW - iD3);
                }
                i5++;
            }
            if (s68.d(s68Var, 1) == 1) {
                int[] iArr2 = new int[256];
                for (int i6 = 0; i6 < 256; i6++) {
                    iArr2[i6] = i6;
                }
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = bArr[i7] & 255;
                    int i9 = iArr2[i8];
                    bArr[i7] = (byte) i9;
                    if (i8 != 0) {
                        while (i8 > 0) {
                            iArr2[i8] = iArr2[i8 - 1];
                            i8--;
                        }
                        iArr2[0] = i9;
                    }
                }
            }
        }
        return i3;
    }

    public static void S(k7m0 k7m0Var) {
        Q(k7m0Var, 0);
        int i2 = k7m0Var.p[1];
        int i3 = i2 << 6;
        k7m0Var.A = i3;
        k7m0Var.v = ((int[]) k7m0Var.k.c)[k7m0Var.z[i3] & 255];
        byte b2 = k7m0Var.y[i2];
        int[] iArr = rq8.k;
        k7m0Var.C = iArr[b2];
        k7m0Var.D = iArr[b2 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0435 A[LOOP:7: B:165:0x0435->B:174:0x047e, LOOP_START, PHI: r8
  0x0435: PHI (r8v115 char) = (r8v71 char), (r8v123 char) binds: [B:164:0x0433, B:174:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x043b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0442  */
    /* JADX WARN: Code duplicated, block: B:174:0x047e A[LOOP:7: B:165:0x0435->B:174:0x047e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0480  */
    /* JADX WARN: Code duplicated, block: B:178:0x0498  */
    /* JADX WARN: Code duplicated, block: B:180:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:184:0x04f7 A[LOOP:8: B:176:0x0492->B:184:0x04f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0503  */
    /* JADX WARN: Code duplicated, block: B:190:0x050c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0511  */
    /* JADX WARN: Code duplicated, block: B:193:0x0515  */
    /* JADX WARN: Code duplicated, block: B:195:0x051d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0542  */
    /* JADX WARN: Code duplicated, block: B:199:0x0544  */
    /* JADX WARN: Code duplicated, block: B:202:0x0557  */
    /* JADX WARN: Code duplicated, block: B:205:0x0583  */
    /* JADX WARN: Code duplicated, block: B:206:0x0594  */
    /* JADX WARN: Code duplicated, block: B:209:0x059a  */
    /* JADX WARN: Code duplicated, block: B:211:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x05b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:222:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:225:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:234:0x0608  */
    /* JADX WARN: Code duplicated, block: B:239:0x0637  */
    /* JADX WARN: Code duplicated, block: B:396:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:? A[LOOP:6: B:232:0x0602->B:418:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x04e8 A[SYNTHETIC] */
    public static void T(k7m0 k7m0Var) {
        boolean z;
        int i2;
        int i3;
        int iD;
        int i4;
        char c2;
        int i5;
        int i6;
        int iW;
        int i7;
        int i8;
        int i9;
        int iW2;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = k7m0Var.f17830a;
        int[] iArr2 = k7m0Var.p;
        zz2 zz2Var = k7m0Var.m;
        zz2 zz2Var2 = k7m0Var.k;
        zz2 zz2Var3 = k7m0Var.l;
        s68 s68Var = k7m0Var.c;
        int[] iArr3 = k7m0Var.n;
        if (i24 == 0) {
            jf4.n("Can't decompress until initialized");
            return;
        }
        if (i24 == 11) {
            jf4.n("Can't decompress after close");
            return;
        }
        int i25 = 1;
        int i26 = k7m0Var.P - 1;
        byte[] bArr = k7m0Var.d;
        while (true) {
            int i27 = k7m0Var.f17830a;
            int i28 = i25;
            if (i27 == 10) {
                if (i27 == 10) {
                    if (k7m0Var.g < 0) {
                        v4i0.l("Invalid metablock length");
                        return;
                    }
                    int i29 = (64 - s68Var.g) & 7;
                    if (i29 == 0 || s68.d(s68Var, i29) == 0) {
                        s68.a(s68Var, true);
                        return;
                    } else {
                        v4i0.l("Corrupted padding bits");
                        return;
                    }
                }
                return;
            }
            if (i27 != 12) {
                switch (i27) {
                    case 1:
                        if (k7m0Var.g < 0) {
                            v4i0.l("Invalid metablock length");
                            return;
                        }
                        if (k7m0Var.h) {
                            k7m0Var.b = (byte) 10;
                            k7m0Var.X = k7m0Var.r;
                            k7m0Var.W = 0;
                            k7m0Var.f17830a = 12;
                        } else {
                            zz2Var2.b = null;
                            zz2Var2.c = null;
                            zz2Var3.b = null;
                            zz2Var3.c = null;
                            zz2Var.b = null;
                            zz2Var.c = null;
                            s68.e(s68Var);
                            boolean z2 = s68.d(s68Var, 1) == 1;
                            k7m0Var.h = z2;
                            k7m0Var.g = 0;
                            k7m0Var.i = false;
                            k7m0Var.j = false;
                            if (!z2 || s68.d(s68Var, 1) == 0) {
                                int iD2 = s68.d(s68Var, 2) + 4;
                                if (iD2 == 7) {
                                    k7m0Var.j = true;
                                    if (s68.d(s68Var, 1) != 0) {
                                        v4i0.l("Corrupted reserved bit");
                                        return;
                                    }
                                    int iD3 = s68.d(s68Var, 2);
                                    if (iD3 != 0) {
                                        for (int i30 = 0; i30 < iD3; i30++) {
                                            int iD4 = s68.d(s68Var, 8);
                                            if (iD4 == 0 && i30 + 1 == iD3 && iD3 > 1) {
                                                v4i0.l("Exuberant nibble");
                                                return;
                                            }
                                            k7m0Var.g = (iD4 << (i30 * 8)) | k7m0Var.g;
                                        }
                                    }
                                } else {
                                    for (int i31 = 0; i31 < iD2; i31++) {
                                        int iD5 = s68.d(s68Var, 4);
                                        if (iD5 == 0 && i31 + 1 == iD2 && iD2 > 4) {
                                            v4i0.l("Exuberant nibble");
                                            return;
                                        }
                                        k7m0Var.g = (iD5 << (i31 * 4)) | k7m0Var.g;
                                    }
                                }
                                k7m0Var.g++;
                                if (!k7m0Var.h) {
                                    k7m0Var.i = s68.d(s68Var, 1) == 1;
                                }
                            }
                            if (k7m0Var.g != 0 || k7m0Var.j) {
                                if (k7m0Var.i || (z = k7m0Var.j)) {
                                    int i32 = (64 - s68Var.g) & 7;
                                    if (i32 != 0 && s68.d(s68Var, i32) != 0) {
                                        v4i0.l("Corrupted padding bits");
                                        return;
                                    } else {
                                        z = k7m0Var.j;
                                        k7m0Var.f17830a = z ? 4 : 5;
                                    }
                                } else {
                                    k7m0Var.f17830a = 2;
                                }
                                if (!z) {
                                    long j2 = k7m0Var.Q + ((long) k7m0Var.g);
                                    k7m0Var.Q = j2;
                                    int i33 = k7m0Var.P;
                                    int i34 = k7m0Var.O;
                                    if (i33 < i34) {
                                        if (i34 > j2) {
                                            int length = ((int) j2) + k7m0Var.R.length;
                                            while (true) {
                                                int i35 = i34 >> 1;
                                                if (i35 > length) {
                                                    i34 = i35;
                                                } else if (!k7m0Var.h && i34 < 16384 && k7m0Var.O >= 16384) {
                                                    i34 = 16384;
                                                }
                                            }
                                        }
                                        int i36 = k7m0Var.P;
                                        if (i34 > i36) {
                                            byte[] bArr2 = new byte[i34 + 37];
                                            byte[] bArr3 = k7m0Var.d;
                                            if (bArr3 != null) {
                                                System.arraycopy(bArr3, 0, bArr2, 0, i36);
                                            } else {
                                                byte[] bArr4 = k7m0Var.R;
                                                if (bArr4.length != 0) {
                                                    int length2 = bArr4.length;
                                                    int i37 = k7m0Var.N;
                                                    if (length2 > i37) {
                                                        int i38 = length2 - i37;
                                                        length2 = i37;
                                                        i2 = i38;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    System.arraycopy(bArr4, i2, bArr2, 0, length2);
                                                    k7m0Var.r = length2;
                                                    k7m0Var.S = length2;
                                                }
                                            }
                                            k7m0Var.d = bArr2;
                                            k7m0Var.P = i34;
                                        }
                                    }
                                }
                            }
                        }
                        i26 = k7m0Var.P - 1;
                        bArr = k7m0Var.d;
                        i25 = 1;
                        break;
                        break;
                    case 2:
                        int i39 = i28;
                        int[] iArr4 = k7m0Var.f;
                        int[] iArr5 = k7m0Var.o;
                        int i40 = 0;
                        while (i40 < 3) {
                            if (s68.d(s68Var, i39) != 0) {
                                int iD6 = s68.d(s68Var, 3);
                                iD = iD6 == 0 ? i39 : s68.d(s68Var, iD6) + (i39 << iD6);
                            } else {
                                iD = 0;
                            }
                            iArr5[i40] = iD + 1;
                            iArr3[i40] = 268435456;
                            int i41 = iArr5[i40];
                            if (i41 > i39) {
                                int i42 = i40 * 1080;
                                V(i41 + 2, k7m0Var.e, i42, s68Var);
                                V(26, iArr4, i42, s68Var);
                                s68.b(s68Var);
                                int iW3 = W(iArr4, i42, s68Var);
                                iArr3[i40] = s68.d(s68Var, fre0.g[iW3]) + fre0.f[iW3];
                            }
                            i40++;
                            i39 = 1;
                        }
                        s68.e(s68Var);
                        k7m0Var.J = s68.d(s68Var, 2);
                        int iD7 = s68.d(s68Var, 4);
                        int i43 = k7m0Var.J;
                        int i44 = (iD7 << i43) + 16;
                        k7m0Var.H = i44;
                        k7m0Var.I = (1 << i43) - 1;
                        int i45 = i44 + (48 << i43);
                        char c3 = 0;
                        k7m0Var.y = new byte[iArr5[0]];
                        int i46 = 0;
                        while (true) {
                            int i47 = iArr5[c3];
                            if (i46 >= i47) {
                                int i48 = i47 << 6;
                                byte[] bArr5 = new byte[i48];
                                k7m0Var.z = bArr5;
                                int iR = R(i48, bArr5, s68Var);
                                k7m0Var.u = true;
                                for (int i49 = 0; i49 < (iArr5[0] << 6); i49++) {
                                    if (k7m0Var.z[i49] != (i49 >> 6)) {
                                        k7m0Var.u = false;
                                        int i50 = iArr5[2] << 2;
                                        byte[] bArr6 = new byte[i50];
                                        k7m0Var.G = bArr6;
                                        int iR2 = R(i50, bArr6, s68Var);
                                        zz2Var2.f45232a = 256;
                                        zz2Var2.b = new int[iR * 1080];
                                        zz2Var2.c = new int[iR];
                                        int i51 = iArr5[1];
                                        zz2Var3.f45232a = 704;
                                        zz2Var3.b = new int[i51 * 1080];
                                        zz2Var3.c = new int[i51];
                                        zz2Var.f45232a = i45;
                                        zz2Var.b = new int[iR2 * 1080];
                                        zz2Var.c = new int[iR2];
                                        zz2.h(zz2Var2, s68Var);
                                        zz2.h(zz2Var3, s68Var);
                                        zz2.h(zz2Var, s68Var);
                                        k7m0Var.A = 0;
                                        k7m0Var.B = 0;
                                        int[] iArr6 = rq8.k;
                                        byte b2 = k7m0Var.y[0];
                                        k7m0Var.C = iArr6[b2];
                                        i3 = 1;
                                        k7m0Var.D = iArr6[b2 + 1];
                                        k7m0Var.v = ((int[]) zz2Var2.c)[0];
                                        k7m0Var.E = ((int[]) zz2Var3.c)[0];
                                        iArr2[4] = 1;
                                        iArr2[2] = 1;
                                        iArr2[0] = 1;
                                        iArr2[5] = 0;
                                        iArr2[3] = 0;
                                        iArr2[1] = 0;
                                        k7m0Var.f17830a = 3;
                                        if (k7m0Var.g > 0) {
                                            s68.e(s68Var);
                                            if (iArr3[i3] == 0) {
                                                Q(k7m0Var, i3);
                                                k7m0Var.E = ((int[]) zz2Var3.c)[iArr2[3]];
                                            }
                                            iArr3[i3] = iArr3[i3] - i3;
                                            s68.b(s68Var);
                                            int iW4 = W((int[]) zz2Var3.b, k7m0Var.E, s68Var);
                                            i4 = iW4 >>> 6;
                                            k7m0Var.F = 0;
                                            if (i4 >= 2) {
                                                i4 -= 2;
                                                k7m0Var.F = -1;
                                            }
                                            int i52 = fre0.l[i4] + ((iW4 >>> 3) & 7);
                                            int i53 = fre0.m[i4] + (iW4 & 7);
                                            k7m0Var.x = s68.d(s68Var, fre0.i[i52]) + fre0.h[i52];
                                            k7m0Var.L = s68.d(s68Var, fre0.k[i53]) + fre0.j[i53];
                                            c2 = 0;
                                            k7m0Var.w = 0;
                                            k7m0Var.f17830a = 6;
                                            if (k7m0Var.u) {
                                                int i54 = k7m0Var.r;
                                                i5 = bArr[(i54 - 1) & i26] & 255;
                                                i6 = bArr[(i54 - 2) & i26] & 255;
                                                while (true) {
                                                    if (k7m0Var.w < k7m0Var.x) {
                                                        s68.e(s68Var);
                                                        if (iArr3[0] == 0) {
                                                            S(k7m0Var);
                                                        }
                                                        byte[] bArr7 = k7m0Var.z;
                                                        int i55 = k7m0Var.A;
                                                        int[] iArr7 = rq8.j;
                                                        int i56 = bArr7[i55 + (iArr7[k7m0Var.D + i6] | iArr7[k7m0Var.C + i5])] & 255;
                                                        iArr3[0] = iArr3[0] - 1;
                                                        s68.b(s68Var);
                                                        iW = W((int[]) zz2Var2.b, ((int[]) zz2Var2.c)[i56], s68Var);
                                                        i7 = k7m0Var.r;
                                                        bArr[i7] = (byte) iW;
                                                        k7m0Var.w++;
                                                        k7m0Var.r = i7 + 1;
                                                        if (i7 == i26) {
                                                            i8 = 6;
                                                            k7m0Var.b = (byte) 6;
                                                            k7m0Var.X = k7m0Var.P;
                                                            k7m0Var.W = 0;
                                                            k7m0Var.f17830a = 12;
                                                        } else {
                                                            int i57 = i5;
                                                            i5 = iW;
                                                            i6 = i57;
                                                        }
                                                    }
                                                }
                                                if (k7m0Var.f17830a == i8) {
                                                    i9 = k7m0Var.g - k7m0Var.x;
                                                    k7m0Var.g = i9;
                                                    if (i9 <= 0) {
                                                        iW2 = k7m0Var.F;
                                                        if (iW2 < 0) {
                                                            s68.e(s68Var);
                                                            if (iArr3[2] == 0) {
                                                                Q(k7m0Var, 2);
                                                                k7m0Var.B = iArr2[5] << 2;
                                                            }
                                                            iArr3[2] = iArr3[2] - 1;
                                                            s68.b(s68Var);
                                                            int[] iArr8 = (int[]) zz2Var.b;
                                                            int[] iArr9 = (int[]) zz2Var.c;
                                                            byte[] bArr8 = k7m0Var.G;
                                                            int i58 = k7m0Var.B;
                                                            i15 = k7m0Var.L;
                                                            if (i15 > 4) {
                                                                i16 = 3;
                                                            } else {
                                                                i16 = i15 - 2;
                                                            }
                                                            iW2 = W(iArr8, iArr9[bArr8[i58 + i16] & 255], s68Var);
                                                            k7m0Var.F = iW2;
                                                            i17 = k7m0Var.H;
                                                            if (iW2 >= i17) {
                                                                int i59 = iW2 - i17;
                                                                int i60 = k7m0Var.I & i59;
                                                                int i61 = i59 >>> k7m0Var.J;
                                                                k7m0Var.F = i61;
                                                                int i62 = (i61 >>> 1) + 1;
                                                                iW2 = ((s68.d(s68Var, i62) + ((((i61 & 1) + 2) << i62) - 4)) << k7m0Var.J) + i17 + i60;
                                                                k7m0Var.F = iW2;
                                                            }
                                                        }
                                                        iArr = k7m0Var.q;
                                                        i10 = k7m0Var.t;
                                                        if (iW2 < 16) {
                                                            i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                                        } else {
                                                            i11 = iW2 - 15;
                                                        }
                                                        k7m0Var.K = i11;
                                                        if (i11 >= 0) {
                                                            v4i0.l("Negative distance");
                                                            return;
                                                        }
                                                        i12 = k7m0Var.s;
                                                        i13 = k7m0Var.N;
                                                        if (i12 != i13 || (i14 = k7m0Var.r) >= i13) {
                                                            k7m0Var.s = i13;
                                                        } else {
                                                            k7m0Var.s = i14;
                                                            i13 = i14;
                                                        }
                                                        k7m0Var.M = k7m0Var.r;
                                                        if (i11 > i13) {
                                                            if (iW2 > 0) {
                                                                iArr[i10 & 3] = i11;
                                                                k7m0Var.t = i10 + 1;
                                                            }
                                                            if (k7m0Var.L <= k7m0Var.g) {
                                                                v4i0.l("Invalid backward reference");
                                                                return;
                                                            }
                                                            k7m0Var.w = 0;
                                                            k7m0Var.f17830a = 7;
                                                            int i63 = k7m0Var.r;
                                                            i19 = (i63 - k7m0Var.K) & i26;
                                                            i20 = k7m0Var.L - k7m0Var.w;
                                                            if (i19 + i20 < i26 || i63 + i20 >= i26) {
                                                                while (true) {
                                                                    i21 = k7m0Var.w;
                                                                    if (i21 < k7m0Var.L) {
                                                                        i22 = k7m0Var.r;
                                                                        bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                                        k7m0Var.g--;
                                                                        k7m0Var.w = i21 + 1;
                                                                        k7m0Var.r = i22 + 1;
                                                                        if (i22 == i26) {
                                                                            i23 = 7;
                                                                            k7m0Var.b = (byte) 7;
                                                                            k7m0Var.X = k7m0Var.P;
                                                                            k7m0Var.W = 0;
                                                                            k7m0Var.f17830a = 12;
                                                                        }
                                                                    }
                                                                }
                                                                if (k7m0Var.f17830a == i23) {
                                                                    k7m0Var.f17830a = 3;
                                                                }
                                                            } else {
                                                                int i64 = 0;
                                                                while (i64 < i20) {
                                                                    bArr[i63] = bArr[i19];
                                                                    i64++;
                                                                    i63++;
                                                                    i19++;
                                                                }
                                                                k7m0Var.w += i20;
                                                                k7m0Var.g -= i20;
                                                                k7m0Var.r += i20;
                                                            }
                                                            i23 = 7;
                                                            if (k7m0Var.f17830a == i23) {
                                                                k7m0Var.f17830a = 3;
                                                            }
                                                        } else {
                                                            k7m0Var.f17830a = 9;
                                                        }
                                                    } else {
                                                        k7m0Var.f17830a = 3;
                                                    }
                                                }
                                                break;
                                            } else {
                                                while (k7m0Var.w < k7m0Var.x) {
                                                    s68.e(s68Var);
                                                    if (iArr3[c2] == 0) {
                                                        S(k7m0Var);
                                                    }
                                                    iArr3[c2] = iArr3[c2] - 1;
                                                    s68.b(s68Var);
                                                    bArr[k7m0Var.r] = (byte) W((int[]) zz2Var2.b, k7m0Var.v, s68Var);
                                                    k7m0Var.w++;
                                                    i18 = k7m0Var.r;
                                                    k7m0Var.r = i18 + 1;
                                                    if (i18 == i26) {
                                                        k7m0Var.b = (byte) 6;
                                                        k7m0Var.X = k7m0Var.P;
                                                        k7m0Var.W = 0;
                                                        k7m0Var.f17830a = 12;
                                                    } else {
                                                        c2 = 0;
                                                    }
                                                }
                                            }
                                            i8 = 6;
                                            if (k7m0Var.f17830a == i8) {
                                                i9 = k7m0Var.g - k7m0Var.x;
                                                k7m0Var.g = i9;
                                                if (i9 <= 0) {
                                                    iW2 = k7m0Var.F;
                                                    if (iW2 < 0) {
                                                        s68.e(s68Var);
                                                        if (iArr3[2] == 0) {
                                                            Q(k7m0Var, 2);
                                                            k7m0Var.B = iArr2[5] << 2;
                                                        }
                                                        iArr3[2] = iArr3[2] - 1;
                                                        s68.b(s68Var);
                                                        int[] iArr10 = (int[]) zz2Var.b;
                                                        int[] iArr11 = (int[]) zz2Var.c;
                                                        byte[] bArr9 = k7m0Var.G;
                                                        int i510 = k7m0Var.B;
                                                        i15 = k7m0Var.L;
                                                        if (i15 > 4) {
                                                            i16 = 3;
                                                        } else {
                                                            i16 = i15 - 2;
                                                        }
                                                        iW2 = W(iArr10, iArr11[bArr9[i510 + i16] & 255], s68Var);
                                                        k7m0Var.F = iW2;
                                                        i17 = k7m0Var.H;
                                                        if (iW2 >= i17) {
                                                            int i511 = iW2 - i17;
                                                            int i65 = k7m0Var.I & i511;
                                                            int i66 = i511 >>> k7m0Var.J;
                                                            k7m0Var.F = i66;
                                                            int i67 = (i66 >>> 1) + 1;
                                                            iW2 = ((s68.d(s68Var, i67) + ((((i66 & 1) + 2) << i67) - 4)) << k7m0Var.J) + i17 + i65;
                                                            k7m0Var.F = iW2;
                                                        }
                                                    }
                                                    iArr = k7m0Var.q;
                                                    i10 = k7m0Var.t;
                                                    if (iW2 < 16) {
                                                        i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                                    } else {
                                                        i11 = iW2 - 15;
                                                    }
                                                    k7m0Var.K = i11;
                                                    if (i11 >= 0) {
                                                        v4i0.l("Negative distance");
                                                        return;
                                                    }
                                                    i12 = k7m0Var.s;
                                                    i13 = k7m0Var.N;
                                                    if (i12 != i13) {
                                                        k7m0Var.s = i13;
                                                    } else {
                                                        k7m0Var.s = i13;
                                                    }
                                                    k7m0Var.M = k7m0Var.r;
                                                    if (i11 > i13) {
                                                        if (iW2 > 0) {
                                                            iArr[i10 & 3] = i11;
                                                            k7m0Var.t = i10 + 1;
                                                        }
                                                        if (k7m0Var.L <= k7m0Var.g) {
                                                            v4i0.l("Invalid backward reference");
                                                            return;
                                                        }
                                                        k7m0Var.w = 0;
                                                        k7m0Var.f17830a = 7;
                                                        int i68 = k7m0Var.r;
                                                        i19 = (i68 - k7m0Var.K) & i26;
                                                        i20 = k7m0Var.L - k7m0Var.w;
                                                        if (i19 + i20 < i26) {
                                                            while (true) {
                                                                i21 = k7m0Var.w;
                                                                if (i21 < k7m0Var.L) {
                                                                    i22 = k7m0Var.r;
                                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                                    k7m0Var.g--;
                                                                    k7m0Var.w = i21 + 1;
                                                                    k7m0Var.r = i22 + 1;
                                                                    if (i22 == i26) {
                                                                        i23 = 7;
                                                                        k7m0Var.b = (byte) 7;
                                                                        k7m0Var.X = k7m0Var.P;
                                                                        k7m0Var.W = 0;
                                                                        k7m0Var.f17830a = 12;
                                                                    }
                                                                } else {
                                                                    i23 = 7;
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                i21 = k7m0Var.w;
                                                                if (i21 < k7m0Var.L) {
                                                                    i22 = k7m0Var.r;
                                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                                    k7m0Var.g--;
                                                                    k7m0Var.w = i21 + 1;
                                                                    k7m0Var.r = i22 + 1;
                                                                    if (i22 == i26) {
                                                                        i23 = 7;
                                                                        k7m0Var.b = (byte) 7;
                                                                        k7m0Var.X = k7m0Var.P;
                                                                        k7m0Var.W = 0;
                                                                        k7m0Var.f17830a = 12;
                                                                    }
                                                                } else {
                                                                    i23 = 7;
                                                                }
                                                            }
                                                        }
                                                        if (k7m0Var.f17830a == i23) {
                                                            k7m0Var.f17830a = 3;
                                                        }
                                                    } else {
                                                        k7m0Var.f17830a = 9;
                                                    }
                                                } else {
                                                    k7m0Var.f17830a = 3;
                                                }
                                            }
                                        } else {
                                            k7m0Var.f17830a = i3;
                                        }
                                    }
                                    break;
                                }
                                int i512 = iArr5[2] << 2;
                                byte[] bArr10 = new byte[i512];
                                k7m0Var.G = bArr10;
                                int iR3 = R(i512, bArr10, s68Var);
                                zz2Var2.f45232a = 256;
                                zz2Var2.b = new int[iR * 1080];
                                zz2Var2.c = new int[iR];
                                int i513 = iArr5[1];
                                zz2Var3.f45232a = 704;
                                zz2Var3.b = new int[i513 * 1080];
                                zz2Var3.c = new int[i513];
                                zz2Var.f45232a = i45;
                                zz2Var.b = new int[iR3 * 1080];
                                zz2Var.c = new int[iR3];
                                zz2.h(zz2Var2, s68Var);
                                zz2.h(zz2Var3, s68Var);
                                zz2.h(zz2Var, s68Var);
                                k7m0Var.A = 0;
                                k7m0Var.B = 0;
                                int[] iArr12 = rq8.k;
                                byte b3 = k7m0Var.y[0];
                                k7m0Var.C = iArr12[b3];
                                i3 = 1;
                                k7m0Var.D = iArr12[b3 + 1];
                                k7m0Var.v = ((int[]) zz2Var2.c)[0];
                                k7m0Var.E = ((int[]) zz2Var3.c)[0];
                                iArr2[4] = 1;
                                iArr2[2] = 1;
                                iArr2[0] = 1;
                                iArr2[5] = 0;
                                iArr2[3] = 0;
                                iArr2[1] = 0;
                                k7m0Var.f17830a = 3;
                                if (k7m0Var.g > 0) {
                                    s68.e(s68Var);
                                    if (iArr3[i3] == 0) {
                                        Q(k7m0Var, i3);
                                        k7m0Var.E = ((int[]) zz2Var3.c)[iArr2[3]];
                                    }
                                    iArr3[i3] = iArr3[i3] - i3;
                                    s68.b(s68Var);
                                    int iW5 = W((int[]) zz2Var3.b, k7m0Var.E, s68Var);
                                    i4 = iW5 >>> 6;
                                    k7m0Var.F = 0;
                                    if (i4 >= 2) {
                                        i4 -= 2;
                                        k7m0Var.F = -1;
                                    }
                                    int i514 = fre0.l[i4] + ((iW5 >>> 3) & 7);
                                    int i515 = fre0.m[i4] + (iW5 & 7);
                                    k7m0Var.x = s68.d(s68Var, fre0.i[i514]) + fre0.h[i514];
                                    k7m0Var.L = s68.d(s68Var, fre0.k[i515]) + fre0.j[i515];
                                    c2 = 0;
                                    k7m0Var.w = 0;
                                    k7m0Var.f17830a = 6;
                                    if (k7m0Var.u) {
                                        int i516 = k7m0Var.r;
                                        i5 = bArr[(i516 - 1) & i26] & 255;
                                        i6 = bArr[(i516 - 2) & i26] & 255;
                                        while (true) {
                                            if (k7m0Var.w < k7m0Var.x) {
                                                s68.e(s68Var);
                                                if (iArr3[0] == 0) {
                                                    S(k7m0Var);
                                                }
                                                byte[] bArr11 = k7m0Var.z;
                                                int i517 = k7m0Var.A;
                                                int[] iArr13 = rq8.j;
                                                int i518 = bArr11[i517 + (iArr13[k7m0Var.D + i6] | iArr13[k7m0Var.C + i5])] & 255;
                                                iArr3[0] = iArr3[0] - 1;
                                                s68.b(s68Var);
                                                iW = W((int[]) zz2Var2.b, ((int[]) zz2Var2.c)[i518], s68Var);
                                                i7 = k7m0Var.r;
                                                bArr[i7] = (byte) iW;
                                                k7m0Var.w++;
                                                k7m0Var.r = i7 + 1;
                                                if (i7 == i26) {
                                                    i8 = 6;
                                                    k7m0Var.b = (byte) 6;
                                                    k7m0Var.X = k7m0Var.P;
                                                    k7m0Var.W = 0;
                                                    k7m0Var.f17830a = 12;
                                                } else {
                                                    int i519 = i5;
                                                    i5 = iW;
                                                    i6 = i519;
                                                }
                                            }
                                        }
                                        if (k7m0Var.f17830a == i8) {
                                            i9 = k7m0Var.g - k7m0Var.x;
                                            k7m0Var.g = i9;
                                            if (i9 <= 0) {
                                                iW2 = k7m0Var.F;
                                                if (iW2 < 0) {
                                                    s68.e(s68Var);
                                                    if (iArr3[2] == 0) {
                                                        Q(k7m0Var, 2);
                                                        k7m0Var.B = iArr2[5] << 2;
                                                    }
                                                    iArr3[2] = iArr3[2] - 1;
                                                    s68.b(s68Var);
                                                    int[] iArr14 = (int[]) zz2Var.b;
                                                    int[] iArr15 = (int[]) zz2Var.c;
                                                    byte[] bArr12 = k7m0Var.G;
                                                    int i5110 = k7m0Var.B;
                                                    i15 = k7m0Var.L;
                                                    if (i15 > 4) {
                                                        i16 = 3;
                                                    } else {
                                                        i16 = i15 - 2;
                                                    }
                                                    iW2 = W(iArr14, iArr15[bArr12[i5110 + i16] & 255], s68Var);
                                                    k7m0Var.F = iW2;
                                                    i17 = k7m0Var.H;
                                                    if (iW2 >= i17) {
                                                        int i5111 = iW2 - i17;
                                                        int i69 = k7m0Var.I & i5111;
                                                        int i610 = i5111 >>> k7m0Var.J;
                                                        k7m0Var.F = i610;
                                                        int i611 = (i610 >>> 1) + 1;
                                                        iW2 = ((s68.d(s68Var, i611) + ((((i610 & 1) + 2) << i611) - 4)) << k7m0Var.J) + i17 + i69;
                                                        k7m0Var.F = iW2;
                                                    }
                                                }
                                                iArr = k7m0Var.q;
                                                i10 = k7m0Var.t;
                                                if (iW2 < 16) {
                                                    i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                                } else {
                                                    i11 = iW2 - 15;
                                                }
                                                k7m0Var.K = i11;
                                                if (i11 >= 0) {
                                                    v4i0.l("Negative distance");
                                                    return;
                                                }
                                                i12 = k7m0Var.s;
                                                i13 = k7m0Var.N;
                                                if (i12 != i13) {
                                                    k7m0Var.s = i13;
                                                } else {
                                                    k7m0Var.s = i13;
                                                }
                                                k7m0Var.M = k7m0Var.r;
                                                if (i11 > i13) {
                                                    if (iW2 > 0) {
                                                        iArr[i10 & 3] = i11;
                                                        k7m0Var.t = i10 + 1;
                                                    }
                                                    if (k7m0Var.L <= k7m0Var.g) {
                                                        v4i0.l("Invalid backward reference");
                                                        return;
                                                    }
                                                    k7m0Var.w = 0;
                                                    k7m0Var.f17830a = 7;
                                                    int i612 = k7m0Var.r;
                                                    i19 = (i612 - k7m0Var.K) & i26;
                                                    i20 = k7m0Var.L - k7m0Var.w;
                                                    if (i19 + i20 < i26) {
                                                        while (true) {
                                                            i21 = k7m0Var.w;
                                                            if (i21 < k7m0Var.L) {
                                                                i22 = k7m0Var.r;
                                                                bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                                k7m0Var.g--;
                                                                k7m0Var.w = i21 + 1;
                                                                k7m0Var.r = i22 + 1;
                                                                if (i22 == i26) {
                                                                    i23 = 7;
                                                                    k7m0Var.b = (byte) 7;
                                                                    k7m0Var.X = k7m0Var.P;
                                                                    k7m0Var.W = 0;
                                                                    k7m0Var.f17830a = 12;
                                                                }
                                                            } else {
                                                                i23 = 7;
                                                            }
                                                        }
                                                    } else {
                                                        while (true) {
                                                            i21 = k7m0Var.w;
                                                            if (i21 < k7m0Var.L) {
                                                                i22 = k7m0Var.r;
                                                                bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                                k7m0Var.g--;
                                                                k7m0Var.w = i21 + 1;
                                                                k7m0Var.r = i22 + 1;
                                                                if (i22 == i26) {
                                                                    i23 = 7;
                                                                    k7m0Var.b = (byte) 7;
                                                                    k7m0Var.X = k7m0Var.P;
                                                                    k7m0Var.W = 0;
                                                                    k7m0Var.f17830a = 12;
                                                                }
                                                            } else {
                                                                i23 = 7;
                                                            }
                                                        }
                                                    }
                                                    if (k7m0Var.f17830a == i23) {
                                                        k7m0Var.f17830a = 3;
                                                    }
                                                } else {
                                                    k7m0Var.f17830a = 9;
                                                }
                                            } else {
                                                k7m0Var.f17830a = 3;
                                            }
                                        }
                                        break;
                                    } else {
                                        while (k7m0Var.w < k7m0Var.x) {
                                            s68.e(s68Var);
                                            if (iArr3[c2] == 0) {
                                                S(k7m0Var);
                                            }
                                            iArr3[c2] = iArr3[c2] - 1;
                                            s68.b(s68Var);
                                            bArr[k7m0Var.r] = (byte) W((int[]) zz2Var2.b, k7m0Var.v, s68Var);
                                            k7m0Var.w++;
                                            i18 = k7m0Var.r;
                                            k7m0Var.r = i18 + 1;
                                            if (i18 == i26) {
                                                k7m0Var.b = (byte) 6;
                                                k7m0Var.X = k7m0Var.P;
                                                k7m0Var.W = 0;
                                                k7m0Var.f17830a = 12;
                                            } else {
                                                c2 = 0;
                                            }
                                        }
                                    }
                                    i8 = 6;
                                    if (k7m0Var.f17830a == i8) {
                                        i9 = k7m0Var.g - k7m0Var.x;
                                        k7m0Var.g = i9;
                                        if (i9 <= 0) {
                                            iW2 = k7m0Var.F;
                                            if (iW2 < 0) {
                                                s68.e(s68Var);
                                                if (iArr3[2] == 0) {
                                                    Q(k7m0Var, 2);
                                                    k7m0Var.B = iArr2[5] << 2;
                                                }
                                                iArr3[2] = iArr3[2] - 1;
                                                s68.b(s68Var);
                                                int[] iArr16 = (int[]) zz2Var.b;
                                                int[] iArr17 = (int[]) zz2Var.c;
                                                byte[] bArr13 = k7m0Var.G;
                                                int i5112 = k7m0Var.B;
                                                i15 = k7m0Var.L;
                                                if (i15 > 4) {
                                                    i16 = 3;
                                                } else {
                                                    i16 = i15 - 2;
                                                }
                                                iW2 = W(iArr16, iArr17[bArr13[i5112 + i16] & 255], s68Var);
                                                k7m0Var.F = iW2;
                                                i17 = k7m0Var.H;
                                                if (iW2 >= i17) {
                                                    int i5113 = iW2 - i17;
                                                    int i613 = k7m0Var.I & i5113;
                                                    int i614 = i5113 >>> k7m0Var.J;
                                                    k7m0Var.F = i614;
                                                    int i615 = (i614 >>> 1) + 1;
                                                    iW2 = ((s68.d(s68Var, i615) + ((((i614 & 1) + 2) << i615) - 4)) << k7m0Var.J) + i17 + i613;
                                                    k7m0Var.F = iW2;
                                                }
                                            }
                                            iArr = k7m0Var.q;
                                            i10 = k7m0Var.t;
                                            if (iW2 < 16) {
                                                i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                            } else {
                                                i11 = iW2 - 15;
                                            }
                                            k7m0Var.K = i11;
                                            if (i11 >= 0) {
                                                v4i0.l("Negative distance");
                                                return;
                                            }
                                            i12 = k7m0Var.s;
                                            i13 = k7m0Var.N;
                                            if (i12 != i13) {
                                                k7m0Var.s = i13;
                                            } else {
                                                k7m0Var.s = i13;
                                            }
                                            k7m0Var.M = k7m0Var.r;
                                            if (i11 > i13) {
                                                if (iW2 > 0) {
                                                    iArr[i10 & 3] = i11;
                                                    k7m0Var.t = i10 + 1;
                                                }
                                                if (k7m0Var.L <= k7m0Var.g) {
                                                    v4i0.l("Invalid backward reference");
                                                    return;
                                                }
                                                k7m0Var.w = 0;
                                                k7m0Var.f17830a = 7;
                                                int i616 = k7m0Var.r;
                                                i19 = (i616 - k7m0Var.K) & i26;
                                                i20 = k7m0Var.L - k7m0Var.w;
                                                if (i19 + i20 < i26) {
                                                    while (true) {
                                                        i21 = k7m0Var.w;
                                                        if (i21 < k7m0Var.L) {
                                                            i22 = k7m0Var.r;
                                                            bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                            k7m0Var.g--;
                                                            k7m0Var.w = i21 + 1;
                                                            k7m0Var.r = i22 + 1;
                                                            if (i22 == i26) {
                                                                i23 = 7;
                                                                k7m0Var.b = (byte) 7;
                                                                k7m0Var.X = k7m0Var.P;
                                                                k7m0Var.W = 0;
                                                                k7m0Var.f17830a = 12;
                                                            }
                                                        } else {
                                                            i23 = 7;
                                                        }
                                                    }
                                                } else {
                                                    while (true) {
                                                        i21 = k7m0Var.w;
                                                        if (i21 < k7m0Var.L) {
                                                            i22 = k7m0Var.r;
                                                            bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                            k7m0Var.g--;
                                                            k7m0Var.w = i21 + 1;
                                                            k7m0Var.r = i22 + 1;
                                                            if (i22 == i26) {
                                                                i23 = 7;
                                                                k7m0Var.b = (byte) 7;
                                                                k7m0Var.X = k7m0Var.P;
                                                                k7m0Var.W = 0;
                                                                k7m0Var.f17830a = 12;
                                                            }
                                                        } else {
                                                            i23 = 7;
                                                        }
                                                    }
                                                }
                                                if (k7m0Var.f17830a == i23) {
                                                    k7m0Var.f17830a = 3;
                                                }
                                            } else {
                                                k7m0Var.f17830a = 9;
                                            }
                                        } else {
                                            k7m0Var.f17830a = 3;
                                        }
                                    }
                                } else {
                                    k7m0Var.f17830a = i3;
                                }
                            } else {
                                int iMin = Math.min(i46 + 96, i47);
                                while (i46 < iMin) {
                                    k7m0Var.y[i46] = (byte) (s68.d(s68Var, 2) << 1);
                                    i46++;
                                }
                                s68.e(s68Var);
                                c3 = 0;
                            }
                            break;
                        }
                        break;
                    case 3:
                        i3 = i28;
                        if (k7m0Var.g > 0) {
                            s68.e(s68Var);
                            if (iArr3[i3] == 0) {
                                Q(k7m0Var, i3);
                                k7m0Var.E = ((int[]) zz2Var3.c)[iArr2[3]];
                            }
                            iArr3[i3] = iArr3[i3] - i3;
                            s68.b(s68Var);
                            int iW6 = W((int[]) zz2Var3.b, k7m0Var.E, s68Var);
                            i4 = iW6 >>> 6;
                            k7m0Var.F = 0;
                            if (i4 >= 2) {
                                i4 -= 2;
                                k7m0Var.F = -1;
                            }
                            int i5114 = fre0.l[i4] + ((iW6 >>> 3) & 7);
                            int i5115 = fre0.m[i4] + (iW6 & 7);
                            k7m0Var.x = s68.d(s68Var, fre0.i[i5114]) + fre0.h[i5114];
                            k7m0Var.L = s68.d(s68Var, fre0.k[i5115]) + fre0.j[i5115];
                            c2 = 0;
                            k7m0Var.w = 0;
                            k7m0Var.f17830a = 6;
                            if (k7m0Var.u) {
                                int i5116 = k7m0Var.r;
                                i5 = bArr[(i5116 - 1) & i26] & 255;
                                i6 = bArr[(i5116 - 2) & i26] & 255;
                                while (true) {
                                    if (k7m0Var.w < k7m0Var.x) {
                                        s68.e(s68Var);
                                        if (iArr3[0] == 0) {
                                            S(k7m0Var);
                                        }
                                        byte[] bArr14 = k7m0Var.z;
                                        int i5117 = k7m0Var.A;
                                        int[] iArr18 = rq8.j;
                                        int i5118 = bArr14[i5117 + (iArr18[k7m0Var.D + i6] | iArr18[k7m0Var.C + i5])] & 255;
                                        iArr3[0] = iArr3[0] - 1;
                                        s68.b(s68Var);
                                        iW = W((int[]) zz2Var2.b, ((int[]) zz2Var2.c)[i5118], s68Var);
                                        i7 = k7m0Var.r;
                                        bArr[i7] = (byte) iW;
                                        k7m0Var.w++;
                                        k7m0Var.r = i7 + 1;
                                        if (i7 == i26) {
                                            i8 = 6;
                                            k7m0Var.b = (byte) 6;
                                            k7m0Var.X = k7m0Var.P;
                                            k7m0Var.W = 0;
                                            k7m0Var.f17830a = 12;
                                        } else {
                                            int i5119 = i5;
                                            i5 = iW;
                                            i6 = i5119;
                                        }
                                    }
                                }
                                if (k7m0Var.f17830a == i8) {
                                    i9 = k7m0Var.g - k7m0Var.x;
                                    k7m0Var.g = i9;
                                    if (i9 <= 0) {
                                        iW2 = k7m0Var.F;
                                        if (iW2 < 0) {
                                            s68.e(s68Var);
                                            if (iArr3[2] == 0) {
                                                Q(k7m0Var, 2);
                                                k7m0Var.B = iArr2[5] << 2;
                                            }
                                            iArr3[2] = iArr3[2] - 1;
                                            s68.b(s68Var);
                                            int[] iArr19 = (int[]) zz2Var.b;
                                            int[] iArr110 = (int[]) zz2Var.c;
                                            byte[] bArr15 = k7m0Var.G;
                                            int i51110 = k7m0Var.B;
                                            i15 = k7m0Var.L;
                                            if (i15 > 4) {
                                                i16 = 3;
                                            } else {
                                                i16 = i15 - 2;
                                            }
                                            iW2 = W(iArr19, iArr110[bArr15[i51110 + i16] & 255], s68Var);
                                            k7m0Var.F = iW2;
                                            i17 = k7m0Var.H;
                                            if (iW2 >= i17) {
                                                int i51111 = iW2 - i17;
                                                int i617 = k7m0Var.I & i51111;
                                                int i618 = i51111 >>> k7m0Var.J;
                                                k7m0Var.F = i618;
                                                int i619 = (i618 >>> 1) + 1;
                                                iW2 = ((s68.d(s68Var, i619) + ((((i618 & 1) + 2) << i619) - 4)) << k7m0Var.J) + i17 + i617;
                                                k7m0Var.F = iW2;
                                            }
                                        }
                                        iArr = k7m0Var.q;
                                        i10 = k7m0Var.t;
                                        if (iW2 < 16) {
                                            i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                        } else {
                                            i11 = iW2 - 15;
                                        }
                                        k7m0Var.K = i11;
                                        if (i11 >= 0) {
                                            v4i0.l("Negative distance");
                                            return;
                                        }
                                        i12 = k7m0Var.s;
                                        i13 = k7m0Var.N;
                                        if (i12 != i13) {
                                            k7m0Var.s = i13;
                                        } else {
                                            k7m0Var.s = i13;
                                        }
                                        k7m0Var.M = k7m0Var.r;
                                        if (i11 > i13) {
                                            if (iW2 > 0) {
                                                iArr[i10 & 3] = i11;
                                                k7m0Var.t = i10 + 1;
                                            }
                                            if (k7m0Var.L <= k7m0Var.g) {
                                                v4i0.l("Invalid backward reference");
                                                return;
                                            }
                                            k7m0Var.w = 0;
                                            k7m0Var.f17830a = 7;
                                            int i6110 = k7m0Var.r;
                                            i19 = (i6110 - k7m0Var.K) & i26;
                                            i20 = k7m0Var.L - k7m0Var.w;
                                            if (i19 + i20 < i26) {
                                                while (true) {
                                                    i21 = k7m0Var.w;
                                                    if (i21 < k7m0Var.L) {
                                                        i22 = k7m0Var.r;
                                                        bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                        k7m0Var.g--;
                                                        k7m0Var.w = i21 + 1;
                                                        k7m0Var.r = i22 + 1;
                                                        if (i22 == i26) {
                                                            i23 = 7;
                                                            k7m0Var.b = (byte) 7;
                                                            k7m0Var.X = k7m0Var.P;
                                                            k7m0Var.W = 0;
                                                            k7m0Var.f17830a = 12;
                                                        }
                                                    } else {
                                                        i23 = 7;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    i21 = k7m0Var.w;
                                                    if (i21 < k7m0Var.L) {
                                                        i22 = k7m0Var.r;
                                                        bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                        k7m0Var.g--;
                                                        k7m0Var.w = i21 + 1;
                                                        k7m0Var.r = i22 + 1;
                                                        if (i22 == i26) {
                                                            i23 = 7;
                                                            k7m0Var.b = (byte) 7;
                                                            k7m0Var.X = k7m0Var.P;
                                                            k7m0Var.W = 0;
                                                            k7m0Var.f17830a = 12;
                                                        }
                                                    } else {
                                                        i23 = 7;
                                                    }
                                                }
                                            }
                                            if (k7m0Var.f17830a == i23) {
                                                k7m0Var.f17830a = 3;
                                            }
                                        } else {
                                            k7m0Var.f17830a = 9;
                                        }
                                    } else {
                                        k7m0Var.f17830a = 3;
                                    }
                                }
                                break;
                            } else {
                                while (k7m0Var.w < k7m0Var.x) {
                                    s68.e(s68Var);
                                    if (iArr3[c2] == 0) {
                                        S(k7m0Var);
                                    }
                                    iArr3[c2] = iArr3[c2] - 1;
                                    s68.b(s68Var);
                                    bArr[k7m0Var.r] = (byte) W((int[]) zz2Var2.b, k7m0Var.v, s68Var);
                                    k7m0Var.w++;
                                    i18 = k7m0Var.r;
                                    k7m0Var.r = i18 + 1;
                                    if (i18 == i26) {
                                        k7m0Var.b = (byte) 6;
                                        k7m0Var.X = k7m0Var.P;
                                        k7m0Var.W = 0;
                                        k7m0Var.f17830a = 12;
                                    } else {
                                        c2 = 0;
                                    }
                                }
                            }
                            i8 = 6;
                            if (k7m0Var.f17830a == i8) {
                                i9 = k7m0Var.g - k7m0Var.x;
                                k7m0Var.g = i9;
                                if (i9 <= 0) {
                                    iW2 = k7m0Var.F;
                                    if (iW2 < 0) {
                                        s68.e(s68Var);
                                        if (iArr3[2] == 0) {
                                            Q(k7m0Var, 2);
                                            k7m0Var.B = iArr2[5] << 2;
                                        }
                                        iArr3[2] = iArr3[2] - 1;
                                        s68.b(s68Var);
                                        int[] iArr111 = (int[]) zz2Var.b;
                                        int[] iArr112 = (int[]) zz2Var.c;
                                        byte[] bArr16 = k7m0Var.G;
                                        int i51112 = k7m0Var.B;
                                        i15 = k7m0Var.L;
                                        if (i15 > 4) {
                                            i16 = 3;
                                        } else {
                                            i16 = i15 - 2;
                                        }
                                        iW2 = W(iArr111, iArr112[bArr16[i51112 + i16] & 255], s68Var);
                                        k7m0Var.F = iW2;
                                        i17 = k7m0Var.H;
                                        if (iW2 >= i17) {
                                            int i51113 = iW2 - i17;
                                            int i6111 = k7m0Var.I & i51113;
                                            int i6112 = i51113 >>> k7m0Var.J;
                                            k7m0Var.F = i6112;
                                            int i6113 = (i6112 >>> 1) + 1;
                                            iW2 = ((s68.d(s68Var, i6113) + ((((i6112 & 1) + 2) << i6113) - 4)) << k7m0Var.J) + i17 + i6111;
                                            k7m0Var.F = iW2;
                                        }
                                    }
                                    iArr = k7m0Var.q;
                                    i10 = k7m0Var.t;
                                    if (iW2 < 16) {
                                        i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                    } else {
                                        i11 = iW2 - 15;
                                    }
                                    k7m0Var.K = i11;
                                    if (i11 >= 0) {
                                        v4i0.l("Negative distance");
                                        return;
                                    }
                                    i12 = k7m0Var.s;
                                    i13 = k7m0Var.N;
                                    if (i12 != i13) {
                                        k7m0Var.s = i13;
                                    } else {
                                        k7m0Var.s = i13;
                                    }
                                    k7m0Var.M = k7m0Var.r;
                                    if (i11 > i13) {
                                        if (iW2 > 0) {
                                            iArr[i10 & 3] = i11;
                                            k7m0Var.t = i10 + 1;
                                        }
                                        if (k7m0Var.L <= k7m0Var.g) {
                                            v4i0.l("Invalid backward reference");
                                            return;
                                        }
                                        k7m0Var.w = 0;
                                        k7m0Var.f17830a = 7;
                                        int i6114 = k7m0Var.r;
                                        i19 = (i6114 - k7m0Var.K) & i26;
                                        i20 = k7m0Var.L - k7m0Var.w;
                                        if (i19 + i20 < i26) {
                                            while (true) {
                                                i21 = k7m0Var.w;
                                                if (i21 < k7m0Var.L) {
                                                    i22 = k7m0Var.r;
                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                    k7m0Var.g--;
                                                    k7m0Var.w = i21 + 1;
                                                    k7m0Var.r = i22 + 1;
                                                    if (i22 == i26) {
                                                        i23 = 7;
                                                        k7m0Var.b = (byte) 7;
                                                        k7m0Var.X = k7m0Var.P;
                                                        k7m0Var.W = 0;
                                                        k7m0Var.f17830a = 12;
                                                    }
                                                } else {
                                                    i23 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i21 = k7m0Var.w;
                                                if (i21 < k7m0Var.L) {
                                                    i22 = k7m0Var.r;
                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                    k7m0Var.g--;
                                                    k7m0Var.w = i21 + 1;
                                                    k7m0Var.r = i22 + 1;
                                                    if (i22 == i26) {
                                                        i23 = 7;
                                                        k7m0Var.b = (byte) 7;
                                                        k7m0Var.X = k7m0Var.P;
                                                        k7m0Var.W = 0;
                                                        k7m0Var.f17830a = 12;
                                                    }
                                                } else {
                                                    i23 = 7;
                                                }
                                            }
                                        }
                                        if (k7m0Var.f17830a == i23) {
                                            k7m0Var.f17830a = 3;
                                        }
                                    } else {
                                        k7m0Var.f17830a = 9;
                                    }
                                } else {
                                    k7m0Var.f17830a = 3;
                                }
                            }
                        } else {
                            k7m0Var.f17830a = i3;
                        }
                        break;
                    case 4:
                        bArr = bArr;
                        while (k7m0Var.g > 0) {
                            s68.e(s68Var);
                            s68.d(s68Var, 8);
                            k7m0Var.g--;
                        }
                        k7m0Var.f17830a = 1;
                        break;
                    case 5:
                        byte[] bArr17 = k7m0Var.d;
                        int i70 = k7m0Var.g;
                        if (i70 > 0) {
                            int iMin2 = Math.min(k7m0Var.P - k7m0Var.r, i70);
                            int i71 = k7m0Var.r;
                            if ((s68Var.g & 7) != 0) {
                                v4i0.l("Unaligned copyBytes");
                                return;
                            }
                            int i72 = iMin2;
                            while (true) {
                                int i73 = s68Var.g;
                                if (i73 != 64 && i72 != 0) {
                                    bArr17[i71] = (byte) (s68Var.f >>> i73);
                                    s68Var.g = i73 + 8;
                                    i72--;
                                    i71++;
                                    bArr = bArr;
                                }
                            }
                            bArr = bArr;
                            if (i72 != 0) {
                                int iMin3 = Math.min(s68.c(s68Var), i72 >> 2);
                                if (iMin3 > 0) {
                                    int i74 = iMin3 << 2;
                                    System.arraycopy(s68Var.f31691a, s68Var.h << 2, bArr17, i71, i74);
                                    i71 += i74;
                                    i72 -= i74;
                                    s68Var.h += iMin3;
                                }
                                if (i72 != 0) {
                                    if (s68.c(s68Var) > 0) {
                                        s68.b(s68Var);
                                        while (i72 != 0) {
                                            long j3 = s68Var.f;
                                            int i75 = s68Var.g;
                                            bArr17[i71] = (byte) (j3 >>> i75);
                                            s68Var.g = i75 + 8;
                                            i72--;
                                            i71++;
                                        }
                                        s68.a(s68Var, false);
                                    } else {
                                        while (i72 > 0) {
                                            try {
                                                int i76 = s68Var.d.read(bArr17, i71, i72);
                                                if (i76 == -1) {
                                                    throw new s89("Unexpected end of input");
                                                }
                                                i71 += i76;
                                                i72 -= i76;
                                            } catch (IOException e2) {
                                                throw new s89("Failed to read input", e2);
                                            }
                                        }
                                    }
                                }
                            }
                            k7m0Var.g -= iMin2;
                            int i77 = k7m0Var.r + iMin2;
                            k7m0Var.r = i77;
                            int i78 = k7m0Var.P;
                            if (i77 == i78) {
                                k7m0Var.b = (byte) 5;
                                k7m0Var.X = i78;
                                k7m0Var.W = 0;
                                k7m0Var.f17830a = 12;
                            } else {
                                if (s68Var.g == 64) {
                                    s68.e(s68Var);
                                    s68.a(s68Var, false);
                                    s68.b(s68Var);
                                    s68.b(s68Var);
                                }
                                k7m0Var.f17830a = 1;
                            }
                        } else {
                            if (s68Var.g == 64) {
                                s68.e(s68Var);
                                s68.a(s68Var, false);
                                s68.b(s68Var);
                                s68.b(s68Var);
                            }
                            k7m0Var.f17830a = i28;
                            bArr = bArr;
                        }
                        break;
                    case 6:
                        bArr = bArr;
                        c2 = 0;
                        if (k7m0Var.u) {
                            int i51114 = k7m0Var.r;
                            i5 = bArr[(i51114 - 1) & i26] & 255;
                            i6 = bArr[(i51114 - 2) & i26] & 255;
                            while (true) {
                                if (k7m0Var.w < k7m0Var.x) {
                                    s68.e(s68Var);
                                    if (iArr3[0] == 0) {
                                        S(k7m0Var);
                                    }
                                    byte[] bArr18 = k7m0Var.z;
                                    int i51115 = k7m0Var.A;
                                    int[] iArr113 = rq8.j;
                                    int i51116 = bArr18[i51115 + (iArr113[k7m0Var.D + i6] | iArr113[k7m0Var.C + i5])] & 255;
                                    iArr3[0] = iArr3[0] - 1;
                                    s68.b(s68Var);
                                    iW = W((int[]) zz2Var2.b, ((int[]) zz2Var2.c)[i51116], s68Var);
                                    i7 = k7m0Var.r;
                                    bArr[i7] = (byte) iW;
                                    k7m0Var.w++;
                                    k7m0Var.r = i7 + 1;
                                    if (i7 == i26) {
                                        i8 = 6;
                                        k7m0Var.b = (byte) 6;
                                        k7m0Var.X = k7m0Var.P;
                                        k7m0Var.W = 0;
                                        k7m0Var.f17830a = 12;
                                    } else {
                                        int i51117 = i5;
                                        i5 = iW;
                                        i6 = i51117;
                                    }
                                }
                            }
                            if (k7m0Var.f17830a == i8) {
                                i9 = k7m0Var.g - k7m0Var.x;
                                k7m0Var.g = i9;
                                if (i9 <= 0) {
                                    iW2 = k7m0Var.F;
                                    if (iW2 < 0) {
                                        s68.e(s68Var);
                                        if (iArr3[2] == 0) {
                                            Q(k7m0Var, 2);
                                            k7m0Var.B = iArr2[5] << 2;
                                        }
                                        iArr3[2] = iArr3[2] - 1;
                                        s68.b(s68Var);
                                        int[] iArr114 = (int[]) zz2Var.b;
                                        int[] iArr115 = (int[]) zz2Var.c;
                                        byte[] bArr19 = k7m0Var.G;
                                        int i51118 = k7m0Var.B;
                                        i15 = k7m0Var.L;
                                        if (i15 > 4) {
                                            i16 = 3;
                                        } else {
                                            i16 = i15 - 2;
                                        }
                                        iW2 = W(iArr114, iArr115[bArr19[i51118 + i16] & 255], s68Var);
                                        k7m0Var.F = iW2;
                                        i17 = k7m0Var.H;
                                        if (iW2 >= i17) {
                                            int i51119 = iW2 - i17;
                                            int i6115 = k7m0Var.I & i51119;
                                            int i6116 = i51119 >>> k7m0Var.J;
                                            k7m0Var.F = i6116;
                                            int i6117 = (i6116 >>> 1) + 1;
                                            iW2 = ((s68.d(s68Var, i6117) + ((((i6116 & 1) + 2) << i6117) - 4)) << k7m0Var.J) + i17 + i6115;
                                            k7m0Var.F = iW2;
                                        }
                                    }
                                    iArr = k7m0Var.q;
                                    i10 = k7m0Var.t;
                                    if (iW2 < 16) {
                                        i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                    } else {
                                        i11 = iW2 - 15;
                                    }
                                    k7m0Var.K = i11;
                                    if (i11 >= 0) {
                                        v4i0.l("Negative distance");
                                        return;
                                    }
                                    i12 = k7m0Var.s;
                                    i13 = k7m0Var.N;
                                    if (i12 != i13) {
                                        k7m0Var.s = i13;
                                    } else {
                                        k7m0Var.s = i13;
                                    }
                                    k7m0Var.M = k7m0Var.r;
                                    if (i11 > i13) {
                                        if (iW2 > 0) {
                                            iArr[i10 & 3] = i11;
                                            k7m0Var.t = i10 + 1;
                                        }
                                        if (k7m0Var.L <= k7m0Var.g) {
                                            v4i0.l("Invalid backward reference");
                                            return;
                                        }
                                        k7m0Var.w = 0;
                                        k7m0Var.f17830a = 7;
                                        int i6118 = k7m0Var.r;
                                        i19 = (i6118 - k7m0Var.K) & i26;
                                        i20 = k7m0Var.L - k7m0Var.w;
                                        if (i19 + i20 < i26) {
                                            while (true) {
                                                i21 = k7m0Var.w;
                                                if (i21 < k7m0Var.L) {
                                                    i22 = k7m0Var.r;
                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                    k7m0Var.g--;
                                                    k7m0Var.w = i21 + 1;
                                                    k7m0Var.r = i22 + 1;
                                                    if (i22 == i26) {
                                                        i23 = 7;
                                                        k7m0Var.b = (byte) 7;
                                                        k7m0Var.X = k7m0Var.P;
                                                        k7m0Var.W = 0;
                                                        k7m0Var.f17830a = 12;
                                                    }
                                                } else {
                                                    i23 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i21 = k7m0Var.w;
                                                if (i21 < k7m0Var.L) {
                                                    i22 = k7m0Var.r;
                                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                    k7m0Var.g--;
                                                    k7m0Var.w = i21 + 1;
                                                    k7m0Var.r = i22 + 1;
                                                    if (i22 == i26) {
                                                        i23 = 7;
                                                        k7m0Var.b = (byte) 7;
                                                        k7m0Var.X = k7m0Var.P;
                                                        k7m0Var.W = 0;
                                                        k7m0Var.f17830a = 12;
                                                    }
                                                } else {
                                                    i23 = 7;
                                                }
                                            }
                                        }
                                        if (k7m0Var.f17830a == i23) {
                                            k7m0Var.f17830a = 3;
                                        }
                                    } else {
                                        k7m0Var.f17830a = 9;
                                    }
                                } else {
                                    k7m0Var.f17830a = 3;
                                }
                            }
                            break;
                        } else {
                            while (k7m0Var.w < k7m0Var.x) {
                                s68.e(s68Var);
                                if (iArr3[c2] == 0) {
                                    S(k7m0Var);
                                }
                                iArr3[c2] = iArr3[c2] - 1;
                                s68.b(s68Var);
                                bArr[k7m0Var.r] = (byte) W((int[]) zz2Var2.b, k7m0Var.v, s68Var);
                                k7m0Var.w++;
                                i18 = k7m0Var.r;
                                k7m0Var.r = i18 + 1;
                                if (i18 == i26) {
                                    k7m0Var.b = (byte) 6;
                                    k7m0Var.X = k7m0Var.P;
                                    k7m0Var.W = 0;
                                    k7m0Var.f17830a = 12;
                                } else {
                                    c2 = 0;
                                }
                            }
                        }
                        i8 = 6;
                        if (k7m0Var.f17830a == i8) {
                            i9 = k7m0Var.g - k7m0Var.x;
                            k7m0Var.g = i9;
                            if (i9 <= 0) {
                                iW2 = k7m0Var.F;
                                if (iW2 < 0) {
                                    s68.e(s68Var);
                                    if (iArr3[2] == 0) {
                                        Q(k7m0Var, 2);
                                        k7m0Var.B = iArr2[5] << 2;
                                    }
                                    iArr3[2] = iArr3[2] - 1;
                                    s68.b(s68Var);
                                    int[] iArr116 = (int[]) zz2Var.b;
                                    int[] iArr117 = (int[]) zz2Var.c;
                                    byte[] bArr110 = k7m0Var.G;
                                    int i511110 = k7m0Var.B;
                                    i15 = k7m0Var.L;
                                    if (i15 > 4) {
                                        i16 = 3;
                                    } else {
                                        i16 = i15 - 2;
                                    }
                                    iW2 = W(iArr116, iArr117[bArr110[i511110 + i16] & 255], s68Var);
                                    k7m0Var.F = iW2;
                                    i17 = k7m0Var.H;
                                    if (iW2 >= i17) {
                                        int i511111 = iW2 - i17;
                                        int i6119 = k7m0Var.I & i511111;
                                        int i61110 = i511111 >>> k7m0Var.J;
                                        k7m0Var.F = i61110;
                                        int i61111 = (i61110 >>> 1) + 1;
                                        iW2 = ((s68.d(s68Var, i61111) + ((((i61110 & 1) + 2) << i61111) - 4)) << k7m0Var.J) + i17 + i6119;
                                        k7m0Var.F = iW2;
                                    }
                                }
                                iArr = k7m0Var.q;
                                i10 = k7m0Var.t;
                                if (iW2 < 16) {
                                    i11 = iArr[(h[iW2] + i10) & 3] + i[iW2];
                                } else {
                                    i11 = iW2 - 15;
                                }
                                k7m0Var.K = i11;
                                if (i11 >= 0) {
                                    v4i0.l("Negative distance");
                                    return;
                                }
                                i12 = k7m0Var.s;
                                i13 = k7m0Var.N;
                                if (i12 != i13) {
                                    k7m0Var.s = i13;
                                } else {
                                    k7m0Var.s = i13;
                                }
                                k7m0Var.M = k7m0Var.r;
                                if (i11 > i13) {
                                    if (iW2 > 0) {
                                        iArr[i10 & 3] = i11;
                                        k7m0Var.t = i10 + 1;
                                    }
                                    if (k7m0Var.L <= k7m0Var.g) {
                                        v4i0.l("Invalid backward reference");
                                        return;
                                    }
                                    k7m0Var.w = 0;
                                    k7m0Var.f17830a = 7;
                                    int i61112 = k7m0Var.r;
                                    i19 = (i61112 - k7m0Var.K) & i26;
                                    i20 = k7m0Var.L - k7m0Var.w;
                                    if (i19 + i20 < i26) {
                                        while (true) {
                                            i21 = k7m0Var.w;
                                            if (i21 < k7m0Var.L) {
                                                i22 = k7m0Var.r;
                                                bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                k7m0Var.g--;
                                                k7m0Var.w = i21 + 1;
                                                k7m0Var.r = i22 + 1;
                                                if (i22 == i26) {
                                                    i23 = 7;
                                                    k7m0Var.b = (byte) 7;
                                                    k7m0Var.X = k7m0Var.P;
                                                    k7m0Var.W = 0;
                                                    k7m0Var.f17830a = 12;
                                                }
                                            } else {
                                                i23 = 7;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i21 = k7m0Var.w;
                                            if (i21 < k7m0Var.L) {
                                                i22 = k7m0Var.r;
                                                bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                                k7m0Var.g--;
                                                k7m0Var.w = i21 + 1;
                                                k7m0Var.r = i22 + 1;
                                                if (i22 == i26) {
                                                    i23 = 7;
                                                    k7m0Var.b = (byte) 7;
                                                    k7m0Var.X = k7m0Var.P;
                                                    k7m0Var.W = 0;
                                                    k7m0Var.f17830a = 12;
                                                }
                                            } else {
                                                i23 = 7;
                                            }
                                        }
                                    }
                                    if (k7m0Var.f17830a == i23) {
                                        k7m0Var.f17830a = 3;
                                    }
                                } else {
                                    k7m0Var.f17830a = 9;
                                }
                            } else {
                                k7m0Var.f17830a = 3;
                            }
                        }
                        break;
                    case 7:
                        bArr = bArr;
                        int i61113 = k7m0Var.r;
                        i19 = (i61113 - k7m0Var.K) & i26;
                        i20 = k7m0Var.L - k7m0Var.w;
                        if (i19 + i20 < i26) {
                            while (true) {
                                i21 = k7m0Var.w;
                                if (i21 < k7m0Var.L) {
                                    i22 = k7m0Var.r;
                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                    k7m0Var.g--;
                                    k7m0Var.w = i21 + 1;
                                    k7m0Var.r = i22 + 1;
                                    if (i22 == i26) {
                                        i23 = 7;
                                        k7m0Var.b = (byte) 7;
                                        k7m0Var.X = k7m0Var.P;
                                        k7m0Var.W = 0;
                                        k7m0Var.f17830a = 12;
                                    }
                                } else {
                                    i23 = 7;
                                }
                            }
                        } else {
                            while (true) {
                                i21 = k7m0Var.w;
                                if (i21 < k7m0Var.L) {
                                    i22 = k7m0Var.r;
                                    bArr[i22] = bArr[(i22 - k7m0Var.K) & i26];
                                    k7m0Var.g--;
                                    k7m0Var.w = i21 + 1;
                                    k7m0Var.r = i22 + 1;
                                    if (i22 == i26) {
                                        i23 = 7;
                                        k7m0Var.b = (byte) 7;
                                        k7m0Var.X = k7m0Var.P;
                                        k7m0Var.W = 0;
                                        k7m0Var.f17830a = 12;
                                    }
                                } else {
                                    i23 = 7;
                                }
                            }
                        }
                        if (k7m0Var.f17830a == i23) {
                            k7m0Var.f17830a = 3;
                        }
                        break;
                    case 8:
                        int i79 = k7m0Var.P;
                        System.arraycopy(bArr, i79, bArr, 0, k7m0Var.M - i79);
                        k7m0Var.f17830a = 3;
                        bArr = bArr;
                        break;
                    case 9:
                        int i80 = k7m0Var.L;
                        if (i80 < 4 || i80 > 24) {
                            v4i0.l("Invalid backward reference");
                            return;
                        }
                        int i81 = wb.k[i80];
                        int i82 = (k7m0Var.K - k7m0Var.s) - 1;
                        int i83 = wb.l[i80];
                        int i84 = i82 & ((i28 << i83) - 1);
                        int i85 = i82 >>> i83;
                        int i86 = (i84 * i80) + i81;
                        fls0[] fls0VarArr = fls0.d;
                        if (i85 >= fls0VarArr.length) {
                            v4i0.l("Invalid backward reference");
                            return;
                        }
                        int i87 = k7m0Var.M;
                        byte[] bArr20 = tlk.f34150a;
                        fls0 fls0Var = fls0VarArr[i85];
                        int i88 = i87;
                        for (byte b4 : fls0Var.f9754a) {
                            bArr[i88] = b4;
                            i88++;
                        }
                        byte b5 = fls0Var.b;
                        int i89 = b5 >= 12 ? b5 - 11 : 0;
                        if (i89 > i80) {
                            i89 = i80;
                        }
                        int i90 = i86 + i89;
                        int i91 = (i80 - i89) - (b5 <= 9 ? b5 : (byte) 0);
                        int i92 = i91;
                        while (i92 > 0) {
                            bArr[i88] = bArr20[i90];
                            i92--;
                            i88++;
                            i90++;
                        }
                        if (b5 == 11 || b5 == 10) {
                            int i93 = i88 - i91;
                            if (b5 == 10) {
                                i91 = i28;
                            }
                            while (i91 > 0) {
                                byte b6 = bArr[i93];
                                int i94 = b6 & 255;
                                if (i94 < 192) {
                                    if (i94 >= 97 && i94 <= 122) {
                                        bArr[i93] = (byte) (b6 ^ 32);
                                    }
                                    i93++;
                                    i91--;
                                } else if (i94 < 224) {
                                    int i95 = i93 + 1;
                                    bArr[i95] = (byte) (bArr[i95] ^ 32);
                                    i93 += 2;
                                    i91 -= 2;
                                } else {
                                    int i96 = i93 + 2;
                                    bArr[i96] = (byte) (bArr[i96] ^ 5);
                                    i93 += 3;
                                    i91 -= 3;
                                }
                            }
                        }
                        byte[] bArr21 = fls0Var.c;
                        for (byte b7 : bArr21) {
                            bArr[i88] = b7;
                            i88++;
                        }
                        int i97 = i88 - i87;
                        int i98 = k7m0Var.M + i97;
                        k7m0Var.M = i98;
                        k7m0Var.r += i97;
                        k7m0Var.g -= i97;
                        int i99 = k7m0Var.P;
                        if (i98 >= i99) {
                            k7m0Var.b = (byte) 8;
                            k7m0Var.X = i99;
                            k7m0Var.W = 0;
                            k7m0Var.f17830a = 12;
                        } else {
                            k7m0Var.f17830a = 3;
                        }
                        bArr = bArr;
                        break;
                        break;
                    default:
                        throw new s89("Unexpected state " + k7m0Var.f17830a);
                }
            } else {
                bArr = bArr;
                int i100 = k7m0Var.S;
                if (i100 != 0) {
                    k7m0Var.W += i100;
                    k7m0Var.S = 0;
                }
                int iMin4 = Math.min(k7m0Var.U - k7m0Var.V, k7m0Var.X - k7m0Var.W);
                if (iMin4 != 0) {
                    System.arraycopy(k7m0Var.d, k7m0Var.W, k7m0Var.Y, k7m0Var.T + k7m0Var.V, iMin4);
                    k7m0Var.V += iMin4;
                    k7m0Var.W += iMin4;
                }
                if (k7m0Var.V >= k7m0Var.U) {
                    return;
                }
                int i101 = k7m0Var.r;
                int i102 = k7m0Var.N;
                if (i101 >= i102) {
                    k7m0Var.s = i102;
                }
                k7m0Var.r = i101 & i26;
                k7m0Var.f17830a = k7m0Var.b;
            }
            bArr = bArr;
            i25 = 1;
        }
    }

    public static Drawable U(int i2, Context context) {
        return dtf0.c().d(i2, context);
    }

    public static void V(int i2, int[] iArr, int i3, s68 s68Var) {
        int i4;
        int i5;
        int i6;
        s68.e(s68Var);
        int[] iArr2 = new int[i2];
        int iD = s68.d(s68Var, 2);
        char c2 = 3;
        boolean z = false;
        boolean z2 = true;
        if (iD == 1) {
            int i7 = i2 - 1;
            int[] iArr3 = new int[4];
            int iD2 = s68.d(s68Var, 2) + 1;
            int i8 = 0;
            while (i7 != 0) {
                i7 >>= 1;
                i8++;
            }
            for (int i9 = 0; i9 < iD2; i9++) {
                int iD3 = s68.d(s68Var, i8) % i2;
                iArr3[i9] = iD3;
                iArr2[iD3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (iD2 != 1) {
                if (iD2 == 2) {
                    int i10 = iArr3[0];
                    int i11 = iArr3[1];
                    z = i10 != i11;
                    iArr2[i11] = 1;
                } else if (iD2 != 3) {
                    int i12 = iArr3[0];
                    int i13 = iArr3[1];
                    boolean z3 = (i12 == i13 || i12 == (i5 = iArr3[2]) || i12 == (i6 = iArr3[3]) || i13 == i5 || i13 == i6 || i5 == i6) ? false : true;
                    if (s68.d(s68Var, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z2 = z3;
                } else {
                    int i14 = iArr3[0];
                    int i15 = iArr3[1];
                    if (i14 != i15 && i14 != (i4 = iArr3[2]) && i15 != i4) {
                        z = true;
                    }
                }
                z2 = z;
            }
        } else {
            int[] iArr4 = new int[18];
            int i16 = 0;
            int i17 = 32;
            while (iD < 18 && i17 > 0) {
                int i18 = g[iD];
                s68.b(s68Var);
                long j2 = s68Var.f;
                char c3 = c2;
                int i19 = s68Var.g;
                int i20 = j[((int) (j2 >>> i19)) & 15];
                s68Var.g = i19 + (i20 >> 16);
                int i21 = i20 & 65535;
                iArr4[i18] = i21;
                if (i21 != 0) {
                    i17 -= 32 >> i21;
                    i16++;
                }
                iD++;
                c2 = c3;
            }
            if (i16 != 1 && i17 != 0) {
                z2 = false;
            }
            int[] iArr5 = new int[32];
            plc.y(0, 5, 18, iArr5, iArr4);
            int i22 = 8;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 32768;
            while (i23 < i2 && i26 > 0) {
                s68.e(s68Var);
                s68.b(s68Var);
                long j3 = s68Var.f;
                int i27 = s68Var.g;
                int i28 = iArr5[((int) (j3 >>> i27)) & 31];
                s68Var.g = i27 + (i28 >> 16);
                int i29 = i28 & 65535;
                if (i29 < 16) {
                    int i30 = i23 + 1;
                    iArr2[i23] = i29;
                    if (i29 != 0) {
                        i26 -= 32768 >> i29;
                        i22 = i29;
                    }
                    i23 = i30;
                    i25 = 0;
                } else {
                    int i31 = i29 - 14;
                    int i32 = i29 == 16 ? i22 : 0;
                    if (i24 != i32) {
                        i24 = i32;
                        i25 = 0;
                    }
                    int iD4 = s68.d(s68Var, i31) + 3 + (i25 > 0 ? (i25 - 2) << i31 : i25);
                    int i33 = iD4 - i25;
                    if (i23 + i33 > i2) {
                        v4i0.l("symbol + repeatDelta > numSymbols");
                        return;
                    }
                    int i34 = 0;
                    while (i34 < i33) {
                        iArr2[i23] = i24;
                        i34++;
                        i23++;
                    }
                    if (i24 != 0) {
                        i26 -= i33 << (15 - i24);
                    }
                    i25 = iD4;
                }
            }
            if (i26 != 0) {
                v4i0.l("Unused space");
                return;
            }
            int i35 = i2 - i23;
            int i36 = 0;
            while (i36 < i35) {
                int iMin = Math.min(i36 + 1024, i35) - i36;
                System.arraycopy(xf0.w, 0, iArr2, i23 + i36, iMin);
                i36 += iMin;
            }
        }
        if (z2) {
            plc.y(i3, 8, i2, iArr, iArr2);
        } else {
            v4i0.l("Can't readHuffmanCode");
        }
    }

    public static int W(int[] iArr, int i2, s68 s68Var) {
        long j2 = s68Var.f;
        int i3 = s68Var.g;
        int i4 = (int) (j2 >>> i3);
        int i5 = i2 + (i4 & 255);
        int i6 = iArr[i5];
        int i7 = i6 >> 16;
        int i8 = i6 & 65535;
        if (i7 <= 8) {
            s68Var.g = i3 + i7;
            return i8;
        }
        int i9 = iArr[i5 + i8 + ((i4 & ((1 << i7) - 1)) >>> 8)];
        s68Var.g = (i9 >> 16) + 8 + i3;
        return i9 & 65535;
    }

    public static final bq8 X(xpj0 xpj0Var, fet fetVar, int i2) {
        if ((i2 & 1) != 0) {
            xpj0Var = Y(null, fetVar, 0, 7);
        }
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new odk0();
            fetVar.o0(objP);
        }
        odk0 odk0Var = (odk0) objP;
        boolean zG = fetVar.g(xpj0Var) | fetVar.g(odk0Var);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            objP2 = new bq8(xpj0Var, odk0Var);
            fetVar.o0(objP2);
        }
        return (bq8) objP2;
    }

    public static final xpj0 Y(ypj0 ypj0Var, fet fetVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            ypj0Var = ypj0.c;
        }
        ypj0 ypj0Var2 = ypj0Var;
        Object objP = fetVar.P();
        char c2 = 1;
        if (objP == ukd.f35823a) {
            objP = new cp8(c2 == true ? 1 : 0);
            fetVar.o0(objP);
        }
        return tpj0.b((Function1) objP, ypj0Var2, (i3 & 4) != 0, fetVar, ((i2 << 6) & 896) | ((i2 << 3) & 7168), 49);
    }

    public static final ku Z(nu nuVar) {
        String str = nuVar.f24124a;
        if (str == null) {
            str = "";
        }
        Double d2 = nuVar.b;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        String str2 = nuVar.c;
        return new ku(dDoubleValue, str, str2 != null ? str2 : "");
    }

    public static final void a(mm40 mm40Var, bdz bdzVar, qj2 qj2Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        ljc ljcVar = jd8.n;
        bdzVar.getClass();
        function1.getClass();
        fetVar.g0(-139611378);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.g(qj2Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ja2(function1, (byte) 21);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 22);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            nde ndeVar = qj2Var.b;
            boolean z4 = ndeVar instanceof xce;
            jm40 jm40Var = jm40.b;
            if (z4) {
                fetVar.e0(1385867166);
                wvb.u(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), (xce) ndeVar, function1, fetVar, (i3 >> 3) & 896, 0);
                fetVar.r(false);
                z = true;
            } else if (ndeVar instanceof cde) {
                fetVar.e0(1386162689);
                z = true;
                w(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, false, ((cde) ndeVar).f4159a, qj2Var.c, qj2Var.d, function1, fetVar, (i3 & 112) | 3456 | ((i3 << 12) & 29360128));
                fetVar.r(false);
            } else {
                z = true;
                if (ndeVar instanceof hde) {
                    fetVar.e0(1386687426);
                    w(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, true, ((hde) ndeVar).f12865a, qj2Var.c, qj2Var.d, function1, fetVar, (i3 & 112) | 3456 | ((i3 << 12) & 29360128));
                    fetVar.r(false);
                } else {
                    if (!(ndeVar instanceof tce)) {
                        throw b1j.f(-370936884, fetVar, false);
                    }
                    fetVar.e0(1387205064);
                    m(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, qj2Var.c, (tce) ndeVar, function1, fetVar, (i3 & 112) | 384 | ((i3 << 6) & 458752));
                    fetVar.r(false);
                }
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 13, i2, mm40Var, bdzVar, qj2Var, function1);
        }
    }

    public static final yx6 a0(m0k0 m0k0Var) {
        long j2 = m0k0Var.f20959a;
        String str = m0k0Var.s;
        long j3 = m0k0Var.w;
        long j4 = m0k0Var.z;
        String str2 = m0k0Var.d;
        String str3 = m0k0Var.h;
        boolean z = m0k0Var.x;
        long j5 = m0k0Var.y;
        List listJ = q3d.j(m0k0Var.e, m0k0Var.f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        List listJ2 = q3d.j(m0k0Var.i, m0k0Var.j);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listJ2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        return new yx6(j2, str, j3, j4, str2, str3, z, j5, "", arrayList, arrayList2);
    }

    public static final void b(sr9 sr9Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-156618465);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(sr9Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, 0.0f, 12.0f, 1), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            String str = sr9Var.b;
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            String str2 = sr9Var.f32664a;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN2, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.k(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            i4w0.k(sr9Var.c, 0, fetVar2);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(sr9Var, i2, (byte) 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b2o0 b0(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        b2o0 w1o0Var;
        boolean z5;
        d0tVar.getClass();
        Date date = d0tVar.P;
        String str3 = d0tVar.c;
        long j2 = d0tVar.v;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        Object d2iVar = null;
        if (iOrdinal == 0) {
            w1o0Var = new w1o0(d0tVar.f5282a, ibm0.u(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new y3o0(new pws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new pws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j2 == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            w1o0Var = new a2o0(d0tVar.f5282a, ibm0.y(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new e5o0(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j2 == 40 ? str3 : kpb.X(d0tVar), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 2) {
            c2m c2mVar = c2m.f3631a;
            if (iOrdinal == 3) {
                String strX = str3;
                z5 = j2 == 40;
                long j3 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                if (!z5) {
                    strX = kpb.X(d0tVar);
                }
                w1o0Var = new y1o0(j3, ibm0.w(d0tVar, str, strX, list, z2, z3, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new o4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                w1o0Var = new x1o0(d0tVar.f5282a, ibm0.v(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new g4o0(new z1m(c2mVar), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, new tws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new tws0(qzb.r0(d0tVar), kbc.V(d0tVar)), j2 == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j4 = d0tVar.f5282a;
            k4i k4iVarX = ibm0.x(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z5 = j2 == 40;
            rws0 rws0Var = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
            rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
            p0n p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
            String strX2 = z5 ? str3 : kpb.X(d0tVar);
            if (d0tVar.S && z4) {
                d2iVar = new d2i();
            }
            w1o0Var = new z1o0(j4, k4iVarX, new w4o0(d2iVar, p0nVar, rws0Var, rws0Var2, strX2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return w1o0Var;
    }

    public static final void c(fr4 fr4Var, Function1 function1, fet fetVar, int i2) throws Throwable {
        fet fetVar2 = fetVar;
        fr4Var.getClass();
        a4x a4xVar = fr4Var.f10002a;
        function1.getClass();
        fetVar2.g0(-1040470836);
        int i3 = 2;
        int i4 = 32;
        int i5 = i2 | (fetVar2.g(fr4Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        byte b2 = 18;
        boolean z = false;
        if (fetVar2.U(i5 & 1, (i5 & 19) != 18)) {
            bk50 bk50VarA0 = x0x.a0(fetVar2);
            jm40 jm40Var = jm40.b;
            Throwable th = null;
            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40Var, bk50VarA0, null), wha0.T(fetVar2), false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarA0, 0.0f, 28.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            boolean z2 = true;
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
            fetVar2.e0(633680018);
            int i6 = 0;
            for (Object obj : a4xVar) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                wq4 wq4Var = (wq4) obj;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, i3);
                boolean z3 = z;
                kvl kvlVar = wq4Var.f39572a;
                boolean zG = ((i5 & 112) == i4 ? z2 : z3) | fetVar2.g(wq4Var);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new ys3(function1, wq4Var, (byte) 22);
                    fetVar2.o0(objP);
                }
                jm40 jm40Var2 = jm40Var;
                dub.x(mm40VarL, kvlVar, (Function1) objP, null, fetVar2, 0, 20);
                if (i6 < a4xVar.size() - 1) {
                    fetVar2.e0(2077408668);
                    vtb.t(null, qqm.f29173a, null, 0L, fetVar, 48, 13);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(2077495158);
                    fetVar2.r(false);
                }
                z = false;
                z2 = z2;
                i6 = i7;
                th = null;
                jm40Var = jm40Var2;
                i3 = 2;
                i4 = 32;
            }
            fetVar2.r(z);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(fr4Var, function1, i2, b2);
        }
    }

    public static final void d(mm40 mm40Var, r370 r370Var, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        r370 r370Var2 = r370Var;
        fet fetVar2 = fetVar;
        r370Var2.getClass();
        function1.getClass();
        fetVar2.g0(462804281);
        int i5 = i3 & 1;
        if (i5 != 0) {
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
            i4 |= fetVar2.g(r370Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                y3d y3dVar = new y3d(y3d.f);
                pz40 pz40Var = s6t0.f31722a;
                objP = q3d.j(y3dVar, new y3d(StaticColors.INSTANCE.m78getBlack800d7_KjU()));
                fetVar2.o0(objP);
            }
            List list = (List) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new m0x(R.drawable.ic_games_placeholder, null, 6);
                fetVar2.o0(objP2);
            }
            m0x m0xVar = (m0x) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            mm40 mm40VarO = ny9.O(1.5f, mm40Var4, false);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP4;
            boolean z = (i4 & 896) == 256;
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new rw1(function1, pz40Var2, b2);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarO, gy40Var, null, false, null, (Function0) objP5, 28), "BANNER_GAME_COLLECTION_ITEM");
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            n0x n0xVar = r370Var2.c;
            n0x n0xVar2 = r370Var2.d;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new we(pz40Var2, (byte) 27);
                fetVar2.o0(objP6);
            }
            mm40 mm40Var5 = mm40Var4;
            y9a.f(n0xVar, n0xVar2, m0xVar, (Function1) objP6, ay3.g, fetVar2, 28032, 0);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(i120.P(o7k0.d(o7k0.e(mm40VarB, 80.0f), 1.0f), yk5.n(list, 0.0f, 0.0f, 14), vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3), 4), 16.0f, 6.0f, 16.0f, 16.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jr8Var.b(jm40Var, zx7Var2), 1.0f);
            r370Var2 = r370Var;
            String str = r370Var2.e;
            long j2 = qmk.w;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, j2, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.p(), fetVar2, 0, 24960, 110568);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) r370Var2, (Object) function1, i2, i3, (byte) 3);
        }
    }

    public static final void e(p18 p18Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(1512924449);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(p18Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            rz7 rz7Var = p18Var.f26187a;
            hz7 hz7Var = new hz7(p18Var.c, p18Var.d);
            cdq0 cdq0Var = zy7.f45192a;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(160.0f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new yy7(fW0, rz7Var, hz7Var);
                fetVar.o0(objP);
            }
            yy7 yy7Var = (yy7) objP;
            x(0, fetVar);
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(yy7Var);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP2 == obj) {
                objP2 = new qv3(yy7Var, yjeVar, (byte) 12);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            Object[] objArr = {Boolean.valueOf(p18Var.e), Boolean.valueOf(p18Var.f), Boolean.valueOf(p18Var.g), Boolean.valueOf(p18Var.i), Integer.valueOf(p18Var.j), Integer.valueOf(p18Var.k)};
            boolean zG2 = ((i3 & 14) == 4) | fetVar.g(yy7Var);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new yp6(yy7Var, p18Var, yjeVar, (byte) 11);
                fetVar.o0(objP3);
            }
            m0x0.w(objArr, (Function2) objP3, fetVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 292.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), StaticColors.INSTANCE.m75getBlack600d7_KjU(), jd8.n).e((mm40) fetVar.k(t0h.f33118a));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-171184803, new mz7(p18Var, yy7Var, (byte) 0), fetVar), fetVar, 56);
            fetVar.r(true);
            cem0.g(o7k0.d(jm40Var, 1.0f), p18Var.b, function1, fetVar, ((i3 << 3) & 896) | 6, 0);
            d18.a(p18Var.l, yy7Var.a().c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) p18Var, (Object) function1, i2, (byte) 24);
        }
    }

    public static final void f(mm40 mm40Var, bln blnVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        blnVar.getClass();
        fetVar2.g0(-1100840896);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(blnVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            float f2 = 1.0f;
            v8q0.a(blnVar.f2803a, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            qxw.o(fetVar2, o7k0.s(jm40.b, 12.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            kkb.q(new x7z(f2, true), blnVar.b, new ykn(), fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, blnVar, i2, (byte) 20);
        }
    }

    public static final void g(final ugd ugdVar, mm40 mm40Var, final bq8 bq8Var, final float f2, float f3, final yjj0 yjj0Var, final long j2, final long j3, float f4, final Function2 function2, boolean z, final Function2 function3, xdr xdrVar, final long j4, final long j5, final ugd ugdVar2, fet fetVar, final int i2) {
        mm40 mm40Var2;
        final float f5;
        final float f6;
        final boolean z2;
        final xdr xdrVar2;
        boolean z3;
        float f7;
        float f8;
        xdr xdrVar3;
        mm40 mm40Var3;
        fetVar.g0(920075480);
        int i3 = i2 | 48 | (fetVar.g(bq8Var) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024) | 24576 | (fetVar.g(yjj0Var) ? 131072 : 65536) | (fetVar.f(j2) ? 1048576 : 524288) | (fetVar.f(j3) ? 8388608 : 4194304) | 905969664;
        if (fetVar.U(i3 & 1, ((306783379 & i3) == 306783378 && (((3510 | (fetVar.f(j4) ? (char) 16384 : (char) 8192)) | (fetVar.f(j5) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                z3 = true;
                f7 = uo8.c;
                f8 = uo8.b;
                xdrVar3 = xgd.f40832a;
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var;
                f7 = f3;
                f8 = f4;
                z3 = z;
                xdrVar3 = xdrVar;
            }
            fetVar.s();
            mm40 mm40VarQ = i120.Q(mm40Var3.e(o7k0.c), j4, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
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
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40Var2 = mm40Var3;
            obc.d(yde.f42431a.a(new y3d(j5)), u1c.M(999829022, new sp8(bq8Var, function3, ugdVar2, f2, f7, z3, yjj0Var, j2, j3, f8, function2, ugdVar, xdrVar3), fetVar), fetVar, 56);
            fetVar.r(true);
            f5 = f7;
            z2 = z3;
            f6 = f8;
            xdrVar2 = xdrVar3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f5 = f3;
            f6 = f4;
            z2 = z;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var4 = mm40Var2;
            yfe0VarU.d = new Function2(mm40Var4, bq8Var, f2, f5, yjj0Var, j2, j3, f6, function2, z2, function3, xdrVar2, j4, j5, ugdVar2, i2) { // from class: a.mp8
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ bq8 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ yjj0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ Function2 l;
                public final /* synthetic */ xdr m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;
                public final /* synthetic */ ugd p;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(7);
                    epv0.g(this.f22166a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void h(Function2 function2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, Function0 function0, xpj0 xpj0Var, fet fetVar, int i2) {
        fetVar.g0(-1217723575);
        int i3 = i2 | (fetVar.i(function2) ? 4 : 2) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.g(xpj0Var) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            List listJ = q3d.j(function2 == null ? xgd.b : function2, ugdVar, ugdVar2, ugdVar3);
            boolean z = ((i3 & 57344) == 16384) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new up8(xpj0Var, function0);
                fetVar.o0(objP);
            }
            sv40 sv40Var = (sv40) objP;
            ugd ugdVarE = l7x.E(listJ);
            boolean zG = fetVar.g(sv40Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new tv40(sv40Var);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v(0, ugdVarE, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(function2, ugdVar, ugdVar2, ugdVar3, function0, xpj0Var, i2, (byte) 8);
        }
    }

    public static final void i(ur9 ur9Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(846494762);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ur9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (ur9Var instanceof tr9) {
            fetVar.e0(-2122247247);
            p((tr9) ur9Var, function0, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else if (ur9Var instanceof sr9) {
            fetVar.e0(-2121997263);
            b((sr9) ur9Var, fetVar, i3 & 14);
            fetVar.r(false);
        } else {
            fetVar.e0(-2121953832);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) ur9Var, (Object) function0, (Object) function1, i2, (byte) 17);
        }
    }

    public static final void j(mm40 mm40Var, w6b w6bVar, xcz xczVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        w6b w6bVar2;
        Function1 function2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(1290567676);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            w6bVar2 = w6bVar;
            i3 |= fetVar.g(w6bVar2) ? 32 : 16;
        } else {
            w6bVar2 = w6bVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(qmk.a(fetVar).d, 0.0f, qmk.a(fetVar).d, 24.0f, 2), fetVar);
            ugd ugdVarM = u1c.M(281362517, new gn(function1, b2), fetVar);
            f6b f6bVar = new f6b(backgroundContent, w6bVar2, function1, (byte) 0);
            function2 = function1;
            tke.o(mm40Var, w6bVar, xczVar, ch80VarG, ugdVar, ugdVarM, u1c.M(-1193022210, f6bVar, fetVar), eeq.c, u1c.M(2138354046, new gn(function2, (byte) 5), fetVar), eeq.f, eeq.g, fetVar, (i4 & 14) | 920322048 | (i4 & 112) | (i4 & 896) | (57344 & i4));
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g6b(mm40Var, w6bVar, xczVar, function2, ugdVar, i2, (byte) 0);
        }
    }

    public static final void k(int i2, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        float f2;
        fetVar.g0(1437748217);
        int i3 = i2 | 6 | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            float f3 = xfn.a(fetVar).c;
            int size = a4xVar.size();
            if (size != 1) {
                f2 = size != 2 ? 206.0f : 136.0f;
            } else {
                f2 = 68.0f;
            }
            float f4 = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ujv0(((int) (jB >> 32)) / f4, ((int) (jB & 4294967295L)) / f4);
                fetVar.o0(objP);
            }
            ujv0 ujv0Var = (ujv0) objP;
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (objP2 == cl5Var) {
                objP2 = o7k0.s(jm40Var, dem0.n(ujv0Var));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            lh80 lh80VarU = s5x0.u(f3, 0.0f, f3, 0.0f, 10);
            d9z d9zVarA = bdzVar.a("FAVORITES_OTHER_CHAMPS_STATE", fetVar);
            if (size > 3) {
                size = 3;
            }
            ngv ngvVar = new ngv(size);
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, f2), 1.0f);
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new g160(a4xVar, mm40Var3, function1, (byte) 3);
                fetVar.o0(objP3);
            }
            g8x.h(ngvVar, mm40VarD, d9zVarA, lh80VarU, qw3Var, qw3Var2, null, false, null, (Function1) objP3, fetVar, 0, 0, 912);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h160(mm40Var2, bdzVar, a4xVar, function1, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r8v11, types: [a.jm40] */
    public static final void l(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, gy40 gy40Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        wim wimVar2;
        ?? r0;
        v2v0 v2v0Var;
        boolean z;
        long j2;
        long jI;
        String str = wimVar.c;
        v2v0 v2v0Var2 = w2v0Var.f38470a;
        function0.getClass();
        fetVar.g0(1419928290);
        int i3 = i2 | 6 | (fetVar.g(wimVar) ? 32 : 16) | (fetVar.g(w2v0Var) ? 256 : 128) | (fetVar.g(gy40Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            ugg0 ugg0Var = cla.f4547a;
            int i4 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                if (i4 >= 360) {
                    zcl zclVar = qmk.f28987a;
                    jI = qbc.i(144.0f, 96.0f);
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    jI = qbc.i(128.0f, 84.0f);
                }
                objP = new bdl(jI);
                fetVar.o0(objP);
            }
            long j3 = ((bdl) objP).f2404a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, function0, 28);
            mm40 mm40VarE0 = o2e.e0(lgb.J(o7k0.o(j3, jm40Var), cla.f4547a), "GAME_BOX_TAG");
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new aim((byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE = pai0.a(mm40VarE0, true, (Function1) objP2).e(mm40VarW);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            int i5 = (i3 & 112) | 6 | (i3 & 896) | ((i3 >> 6) & 7168);
            wimVar2 = wimVar;
            y(wimVar2, w2v0Var, function1, fetVar, i5);
            bjm bjmVar = wimVar2.b;
            if (str == null || StringsKt.W(str) || (bjmVar instanceof yim)) {
                v2v0Var = v2v0Var2;
                z = false;
                fetVar.e0(1890266566);
                fetVar.r(false);
            } else {
                fetVar.e0(1890118572);
                zcl zclVar3 = qmk.f28987a;
                v2v0Var = v2v0Var2;
                t(v2v0Var.f36706a, fetVar, 6);
                z = false;
                fetVar.r(false);
            }
            if (str == null) {
                fetVar.e0(1890304633);
                fetVar.r(z);
                fetVar2 = fetVar;
            } else {
                fetVar.e0(1890304634);
                y9q0 y9q0Var = ((h1t0) fetVar.k(k1t0.f17545a)).n;
                if (bjmVar instanceof zim) {
                    j2 = v2v0Var.e;
                } else if (bjmVar instanceof yim) {
                    j2 = w2v0Var.b.d;
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        t9f.b();
                        return;
                    }
                    j2 = w2v0Var.c.g;
                }
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar4 = qmk.f28987a;
                v8q0.a(str, jr8.f16991a.b(o2e.e0(s5x0.J(mm40VarD, 8.0f), "GAME_NAME_TAG"), gqw0.h), j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(z);
            }
            fetVar2.r(true);
            r0 = jm40Var;
        } else {
            fetVar2 = fetVar;
            wimVar2 = wimVar;
            fetVar2.X();
            r0 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tan(r0, wimVar2, w2v0Var, gy40Var, function0, function1, i2, (byte) 1);
        }
    }

    public static final void m(mm40 mm40Var, bdz bdzVar, boolean z, tce tceVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(186641072);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(tceVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TOURNAMENTS", fetVar);
            fetVar.e0(-1757991494);
            fetVar.r(false);
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z2 = (458752 & i3) == 131072;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ja2(function1, (byte) 23);
                fetVar.o0(objP);
            }
            mom.c(mm40VarE, z, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1416497019, new hj2(mm40Var, xczVarB, tceVar, b2), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) bdzVar, z, (Object) tceVar, (Object) function1, i2, (byte) 1);
        }
    }

    public static final void n(mm40 mm40Var, l7m0 l7m0Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1947591962);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mdmVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 13);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1794587729, new uc80(mdmVar, b2), fetVar), fetVar, 100663296, 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 25, i2, (Object) mm40Var2, (Object) l7m0Var, (Object) mdmVar, (Object) function1);
        }
    }

    public static final void o(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1466484239);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarE, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            byte b2 = 3;
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 8);
        }
    }

    public static final void p(tr9 tr9Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        Function0 function2;
        int i4;
        boolean z;
        mm40 e9nVar;
        float f2;
        b9n b9nVar;
        float f3;
        float f4;
        Function0 function3 = function0;
        fet fetVar2 = fetVar;
        fetVar2.g0(-638599609);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(tr9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, 0.0f, 12.0f, 1), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            int i5 = i3;
            String str = tr9Var.b;
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            String str2 = tr9Var.f34413a;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN2, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.k(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            boolean z2 = tr9Var.d;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar2.e0(-1138203234);
                float fB = pkd.b(10.0f, fetVar2);
                zfn zfnVar3 = m8m0.f21378a;
                a4x a4xVarO0 = dyb.o0(dyb.g0(new y3d(((StaticColors) fetVar2.k(zfnVar3)).m124getWhite00d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar3)).m127getWhite300d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar3)).m124getWhite00d7_KjU())));
                boolean z3 = ((Configuration) fetVar2.k(dy2.f6873a)).getLayoutDirection() == 1;
                boolean zH = fetVar2.h(z3);
                Object objP = fetVar2.P();
                if (zH || objP == cl5Var) {
                    if (z3) {
                        b9nVar = a9n.f487a;
                        f2 = 15.0f;
                        f4 = -1.0f;
                        f3 = 1.0f;
                    } else {
                        f2 = 165.0f;
                        b9nVar = z8n.f43976a;
                        f3 = -1.0f;
                        f4 = 1.0f;
                    }
                    b9n b9nVar2 = b9nVar;
                    float f5 = f2;
                    z73 z73Var = ihn.d;
                    kkf0 kkf0Var = kkf0.f18436a;
                    d1v0 d1v0Var = new d1v0(f3, f4, z73Var, f5, fB, a4xVarO0, b9nVar2);
                    fetVar2.o0(d1v0Var);
                    objP = d1v0Var;
                }
                d1v0 d1v0Var2 = (d1v0) objP;
                i4 = i5;
                boolean z4 = (i4 & 896) == 256;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new pk9(function2, (byte) 5);
                    fetVar2.o0(objP2);
                } else {
                    function2 = function1;
                }
                Function0 function4 = (Function0) objP2;
                d1v0Var2.getClass();
                function4.getClass();
                e9nVar = new e9n(d1v0Var2, function4);
                z = false;
                fetVar2.r(false);
            } else {
                function2 = function1;
                i4 = i5;
                z = false;
                fetVar2.e0(-1137747503);
                fetVar2.r(false);
                e9nVar = jm40Var;
            }
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).e(e9nVar);
            wul wulVar = new wul(nul.e, oe9.c, new ue9(tr9Var.c), true, false, false);
            if ((i4 & 112) == 32) {
                z = true;
            }
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                function3 = function0;
                objP3 = new pk9(function3, (byte) 6);
                fetVar2.o0(objP3);
            } else {
                function3 = function0;
            }
            qzb.n(mm40VarE, wulVar, (Function0) objP3, fetVar2, 0, 0);
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) tr9Var, (Object) function3, (Object) function2, i2, (byte) 18);
        }
    }

    public static final void q(bdz bdzVar, a4x a4xVar, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z2;
        xcz xczVar;
        Function1 function2;
        fetVar.g0(-1713878377);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 112;
            xcz xczVarB = bdzVar.b("FAVORITES_OTHER_LIST_STATE", fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new a7s(xczVarB, (byte) 22));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            int i5 = 57344 & i3;
            boolean z3 = i5 == 16384;
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (z3 || objP2 == cl5Var) {
                objP2 = new dl2(b2, yjeVar, l7m0Var, function1);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xczVarB, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zG = ((i3 & 7168) == 2048) | fetVar.g(xczVarB) | (i5 == 16384);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                boolean z4 = z2;
                xczVar = xczVarB;
                c2p c2pVar = new c2p(z4, xczVar, function1, yjeVar, (byte) 1);
                function2 = function1;
                fetVar.o0(c2pVar);
                objP3 = c2pVar;
            } else {
                function2 = function1;
                xczVar = xczVarB;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean z5 = ((i3 & 896) == 256) | (i4 == 32) | (i5 == 16384);
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new jl40((Object) a4xVar, (Object) bdzVar, (Object) function2, (byte) 19);
                fetVar.o0(objP4);
            }
            b8k0.e(n0qVar, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP4, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(i2, a4xVar, bdzVar, function1, z);
        }
    }

    public static final void r(a4x a4xVar, l7m0 l7m0Var, boolean z, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        bdz bdzVar2;
        fetVar.g0(-26519216);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar.g(bdzVar2) ? 16384 : 8192;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            wom womVarF = mom.f(fetVar);
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            boolean z2 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 18);
                fetVar.o0(objP);
            }
            mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(1579067611, new j160(bdzVar2, a4xVar, z, function1, (byte) 1), fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg(a4xVar, l7m0Var, z, bdzVar, function1, i2);
        }
    }

    public static final void s(bdz bdzVar, boolean z, a4x a4xVar, boolean z2, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        d9z d9zVar;
        fetVar.g0(788457795);
        int i3 = i2 | (fetVar.g(jm40.b) ? 4 : 2) | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024) | (fetVar.h(z2) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288) | (fetVar.i(function2) ? 8388608 : 4194304);
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = bdzVar.a("RECOMMENDED_OTHER_LIST_STATE", fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new md0(d9zVarA, (byte) 13));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            boolean z3 = (3670016 & i3) == 1048576;
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (z3 || objP2 == cl5Var) {
                objP2 = new dl2((byte) 5, yjeVar, l7m0Var, function1);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = ((458752 & i3) == 131072) | ((i3 & 896) == 256) | fetVar.g(d9zVarA);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                ys8 ys8Var = new ys8(z, (Object) d9zVarA, (Object) function0, (yje) null, (byte) 27);
                d9zVar = d9zVarA;
                fetVar.o0(ys8Var);
                objP3 = ys8Var;
            } else {
                d9zVar = d9zVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            n0q n0qVar = o7k0.c;
            ngv ngvVar = new ngv(i4);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 24.0f, 2), fetVar);
            nw3 nw3Var = uc9.e;
            boolean zE = ((i3 & 7168) == 2048) | fetVar.e(i4) | ((57344 & i3) == 16384) | ((i3 & 29360128) == 8388608);
            Object objP4 = fetVar.P();
            if (zE || objP4 == cl5Var) {
                gc0 gc0Var = new gc0((Object) a4xVar, (Object) function2, z2, i4, (byte) 3);
                fetVar.o0(gc0Var);
                objP4 = gc0Var;
            }
            g8x.i(ngvVar, n0qVar, d9zVar, ch80VarG, nw3Var, qw3Var, null, false, null, (Function1) objP4, fetVar, 196608, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q3o(bdzVar, z, a4xVar, z2, function0, function1, function2, i2);
        }
    }

    public static final void t(e900 e900Var, fet fetVar, int i2) {
        fetVar.g0(948407470);
        int i3 = (fetVar.d(48.0f) ? 32 : 16) | i2 | (fetVar.g(e900Var) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zq8.a(0, fetVar, i120.P(jr8.f16991a.b(o7k0.e(o7k0.d(jm40.b, 1.0f), 48.0f), gqw0.h), e900Var, null, 6));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbd(e900Var, i2, b2);
        }
    }

    public static final void u(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1431914892);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object obj = (kdv) l7m0Var.getValue();
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            String strW = rsm0.w(R.string.grand_prix_title, 0, fetVar);
            boolean zG = fetVar.g(obj);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = obj instanceof jdv ? ((jdv) obj).b : fmm.f9790a;
                fetVar.o0(objP);
            }
            gmm gmmVar = (gmm) objP;
            boolean zG2 = fetVar.g(gmmVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                objP2 = new imm(new ilm(secondary), new plm(strW, ha50.TWO_LINES, secondary, fa50.f9191a), gmmVar, backgroundContent, true, null);
                fetVar.o0(objP2);
            }
            imm immVar = (imm) objP2;
            mm40 mm40VarR = knm0.r(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), jd8.n));
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
            Object objP3 = fetVar.P();
            if (z || objP3 == obj2) {
                objP3 = new i8v(function1, (byte) 2);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean z2 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj2) {
                objP4 = new dht(function1, (byte) 8);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP4, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            if (obj instanceof jdv) {
                fetVar.e0(245320755);
                L((jdv) obj, fetVar, 0);
                fetVar.r(false);
                function2 = function1;
            } else if (obj instanceof hdv) {
                fetVar.e0(245323013);
                function2 = function1;
                o(((hdv) obj).f12889a, function2, fetVar, i4);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (!Intrinsics.d(obj, idv.f14603a)) {
                    throw b1j.f(245318957, fetVar, false);
                }
                fetVar.e0(245327720);
                G(6, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function2, i2, (byte) 23);
        }
    }

    public static final void v(int i2, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        mm40 mm40Var2;
        fetVar.g0(818797);
        int i3 = i2 | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(bdzVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarB = bdzVar.b("FAVORITES_OTHER_TEAMS_STATE", fetVar);
            n0q n0qVar = o7k0.c;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new or0(a4xVar2, function1, (byte) 23);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40.b;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h160(mm40Var2, a4xVar2, bdzVar, function1, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, bdz bdzVar, boolean z, a4x a4xVar, boolean z2, boolean z3, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z4;
        fetVar.g0(-2086844918);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i3 |= fetVar.h(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(a4xVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TOURNAMENTS", fetVar);
            fetVar.e0(455214720);
            fetVar.r(false);
            int i4 = i3 >> 12;
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ((i3 & 3670016) == 1048576) | fetVar.g(xczVarB);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new qa2(z3, xczVarB, null, (byte) 2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            if (z3) {
                function1.invoke(bj2.f2684a);
            }
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z5 = (i3 & 29360128) == 8388608;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            mom.c(mm40VarE, z2, womVarF, null, false, null, (Function0) objP2, null, u1c.M(-567778081, new wv50(z4, mm40Var, xczVarB, pz40VarF, function1), fetVar), fetVar, 100663296 | (i4 & 112), 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ij2(mm40Var, bdzVar, z, a4xVar, z2, z3, function1, i2, (byte) 0);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(-182080385);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            View view = (View) fetVar.k(dy2.f);
            boolean zI = fetVar.i(view);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new oz7(view, b2);
                fetVar.o0(objP);
            }
            m0x0.o(view, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i2, (byte) 17);
        }
    }

    public static final void y(wim wimVar, w2v0 w2v0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        u2v0 u2v0Var = w2v0Var.b;
        zx7 zx7Var = gqw0.b;
        fetVar.g0(-581170223);
        int i4 = i2 & 6;
        jr8 jr8Var = jr8.f16991a;
        if (i4 == 0) {
            i3 = (fetVar.g(jr8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wimVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(w2v0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i3 & 1171) != 1170)) {
            bjm bjmVar = wimVar.b;
            if (bjmVar instanceof zim) {
                fetVar.e0(-628657767);
                zim zimVar = (zim) bjmVar;
                ibm0.e(zimVar.c, zimVar.d, function1, rq8.e, u1c.M(-682851289, new uan(bjmVar, w2v0Var, (byte) 2), fetVar), fetVar, ((i5 >> 3) & 896) | 27648);
                fetVar.r(false);
            } else {
                boolean z = bjmVar instanceof yim;
                jm40 jm40Var = jm40.b;
                Function0 function0 = e7z.u1;
                if (z) {
                    fetVar.e0(-627517184);
                    mm40 mm40VarP = i120.P(o7k0.c, u2v0Var.f34965a, null, 6);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar);
                    dww.c(a8k0.F(((yim) bjmVar).f42699a, 0, fetVar), null, o2e.e0(o7k0.n(s5x0.N(jr8Var.b(jm40Var, zx7Var), 0.0f, cla.a(fetVar), 0.0f, 0.0f, 13), cla.b), "GAME_IMAGE_TAG"), u2v0Var.b, fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        throw b1j.f(-158826028, fetVar, false);
                    }
                    fetVar.e0(-626760040);
                    ajm ajmVar = (ajm) bjmVar;
                    ibm0.e(ajmVar.c, ajmVar.d, function1, rq8.f, u1c.M(1980245343, new uan(bjmVar, w2v0Var, (byte) 3), fetVar), fetVar, ((i5 >> 3) & 896) | 27648);
                    zx7 zx7Var2 = gqw0.e;
                    mm40 mm40VarE = jr8Var.b(jm40Var, zx7Var2).e(o7k0.c);
                    g3v0 g3v0Var = w2v0Var.c;
                    long j2 = g3v0Var.f10631a;
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, j2, ljcVar), 0.0f, cla.a(fetVar), 0.0f, 0.0f, 13);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar4);
                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar);
                    mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(jm40Var, cla.e), vgg0.f37379a), g3v0Var.c, ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC3, shdVar4);
                    jpm0.o(fetVar, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar);
                    dww.c(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar), null, o2e.e0(o7k0.n(jr8Var.b(jm40Var, zx7Var2), cla.d), "GAME_IMAGE_TAG"), g3v0Var.b, fetVar, 56, 0);
                    ohs0.x(fetVar, true, true, false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) wimVar, (Object) w2v0Var, (Object) function1, i2, (byte) 27);
        }
    }

    public static final void z(mm40 mm40Var, pz40 pz40Var, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(859774806);
        int i3 = i2 | 6 | (fetVar2.g(pz40Var) ? 32 : 16) | (fetVar2.g(bdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ma70(function1, (byte) 12);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ma70(function1, (byte) 15);
                fetVar2.o0(objP2);
            }
            boolean z3 = true;
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            fetVar2 = fetVar;
            Object[] objArr = new Object[0];
            boolean z4 = (i3 & 112) == 32;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new rip(pz40Var, (byte) 17);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            kd80 kd80Var = ((ld80) pz40Var.getValue()).e;
            boolean z5 = kd80Var instanceof fd80;
            jm40 jm40Var = jm40.b;
            if (z5) {
                fetVar2.e0(-1633158011);
                int i5 = i3 << 6;
                r(((fd80) kd80Var).f9346a, l7m0VarY, ((ld80) pz40Var.getValue()).b, bdzVar, function1, fetVar2, (i5 & 57344) | 6 | (i5 & 458752));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else if (kd80Var instanceof hd80) {
                fetVar2.e0(-1632828388);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                mdm mdmVar = ((hd80) kd80Var).f12858a;
                boolean z6 = i4 == 2048;
                Object objP4 = fetVar2.P();
                if (z6 || objP4 == cl5Var) {
                    objP4 = new ma70(function1, (byte) 16);
                    fetVar2.o0(objP4);
                }
                jcb.l(mm40VarN, mdmVar, false, (Function0) objP4, fetVar2, 0, 4);
                fetVar2.r(false);
            } else if (kd80Var instanceof id80) {
                fetVar2.e0(-1632508716);
                id80 id80Var = (id80) kd80Var;
                a4x a4xVar = id80Var.f14571a;
                boolean z7 = ((ld80) pz40Var.getValue()).b;
                boolean z8 = id80Var.b;
                if (i4 != 2048) {
                    z3 = false;
                }
                Object objP5 = fetVar2.P();
                if (z3 || objP5 == cl5Var) {
                    objP5 = new i160(function1, (byte) 25);
                    fetVar2.o0(objP5);
                }
                E(a4xVar, l7m0VarY, z7, bdzVar, z8, function1, (Function1) objP5, fetVar2, ((i3 << 6) & 57344) | 6 | ((i3 << 9) & 3670016));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else if (kd80Var instanceof jd80) {
                fetVar2.e0(-1631992070);
                q(bdzVar, ((jd80) kd80Var).f16317a, ((ld80) pz40Var.getValue()).b, function1, fetVar2, ((i3 >> 3) & 112) | 6 | ((i3 << 3) & 57344));
                fetVar2.r(false);
            } else {
                if (!(kd80Var instanceof gd80)) {
                    throw b1j.f(1609884276, fetVar2, false);
                }
                fetVar2.e0(-1631662695);
                n(null, l7m0VarY, ((gd80) kd80Var).f11092a, function1, fetVar2, i4);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 13, i2, (Object) mm40Var2, (Object) pz40Var, (Object) bdzVar, (Object) function1);
        }
    }
}
