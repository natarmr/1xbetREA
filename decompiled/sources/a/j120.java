package a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public abstract class j120 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile lmv f15711a;
    public static final ij4 b = new ij4((byte) 19);
    public static final ugd c = new ugd(-1598073375, false, new i5b(27));
    public static final ugd d = new ugd(258051184, false, new ehd(11));
    public static final ugd e = new ugd(-1817036608, false, new ihd(19));
    public static final ugd f = new ugd(641200809, false, new lhd(24));
    public static final l13 g = new l13((byte) 20);

    public j120(int i) {
    }

    public static final void A(kkg0 kkg0Var, fet fetVar, int i) {
        fetVar.g0(-402000604);
        int i2 = i | (fetVar.g(kkg0Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f, 0.0f, 2);
            String str = kkg0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarU, kkg0Var.c ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24576, 113656);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lkg0(kkg0Var, i, (byte) 0);
        }
    }

    public static final void B(int i, fet fetVar) {
        int i2;
        ugd ugdVar = fre0.c;
        fetVar.g0(1277025005);
        int i3 = i & 6;
        byte b2 = 4;
        mm40 mm40VarV = jm40.b;
        byte b3 = 2;
        if (i3 == 0) {
            i2 = (fetVar.g(mm40VarV) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            rah0 rah0VarT = wha0.T(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(rah0VarT);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new pdb(rah0VarT, b3);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            if (e2dVar != null) {
                fetVar.e0(-967997193);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new wda0(l7m0VarY, b2);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-967838659);
                fetVar.r(false);
            }
            mm40 mm40VarQ = i120.Q(wha0.a0(mm40VarV.e(o7k0.c), rah0VarT, false, 14), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, f2, 0.0f, f3, 20.0f, 2);
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
            vqd.t((i2 & 112) | 6, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, (byte) 22);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void C(mm40 mm40Var, String str, boolean z, ugd ugdVar, fet fetVar, int i) {
        Object obj;
        byte b2;
        pzn pznVarD;
        zx7 zx7Var;
        boolean z2 = z;
        fetVar.g0(-1632372162);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = new LinkedHashSet();
                fetVar.o0(objP);
            }
            Set set = (Set) objP;
            boolean zContains = set.contains(str);
            boolean z3 = !zContains;
            int i3 = i2 & 112;
            int i4 = i2 & 896;
            boolean z4 = (i3 == 32) | (i4 == 256);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj2) {
                objP2 = xf0.c((!z2 || zContains) ? 0.0f : 1.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var = (t33) objP2;
            boolean z5 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == obj2) {
                objP3 = new uz40(Boolean.valueOf(zContains));
                fetVar.o0(objP3);
            }
            uz40 uz40Var = (uz40) objP3;
            uz40Var.o1(Boolean.TRUE);
            if (z2) {
                nul0 nul0VarG0 = ro4.g0(0.75f, 200.0f, null, 4);
                lxs0 lxs0Var = kzn.f19160a;
                xx7 xx7Var = gqw0.o;
                gzn gznVar = gzn.c;
                if (xx7Var.equals(gqw0.m)) {
                    zx7Var = gqw0.d;
                } else {
                    zx7Var = xx7Var.equals(xx7Var) ? gqw0.f : gqw0.e;
                }
                pzn pznVarB = kzn.b(nul0VarG0, zx7Var, true, new jzn(gznVar, (byte) 0));
                obj = null;
                b2 = 2;
                pznVarD = pznVarB.a(kzn.d(ro4.m0(Response.BUSY_EVERYWHERE, 0, null, 6), 0.0f, 2));
            } else {
                obj = null;
                b2 = 2;
                pznVarD = kzn.d(new jfk0(), 0.0f, 2);
            }
            b34.g(uz40Var, mm40Var, pznVarD, null, null, u1c.M(-1638733210, new kom(t33Var, fB, ugdVar, b2), fetVar), fetVar, ((i2 << 3) & 112) | 196608, 24);
            boolean zI = fetVar.i(set) | (i3 == 32);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj2) {
                objP4 = new otf(set, str, (byte) 2);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = fetVar.h(z3) | (i4 == 256) | fetVar.i(t33Var);
            Object objP5 = fetVar.P();
            if (zH || objP5 == obj2) {
                z2 = z;
                objP5 = new qtf(z2, z3, t33Var, null);
                fetVar.o0(objP5);
            } else {
                z2 = z;
            }
            m0x0.v(str, boolValueOf, (Function2) objP5, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ptf(mm40Var, str, z2, ugdVar, i, (byte) 2);
        }
    }

    public static final void D(mm40 mm40Var, kpl0 kpl0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        kpl0Var.getClass();
        function1.getClass();
        fetVar2.g0(276334110);
        int i2 = i | 6 | (fetVar2.g(kpl0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new yhl0(function1, (byte) 7);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new yhl0(function1, (byte) 8);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = i120.Q(jm40Var, background, ljcVar).e(o7k0.c);
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
            if (kpl0Var instanceof ipl0) {
                fetVar2.e0(1840621520);
                ipl0 ipl0Var = (ipl0) kpl0Var;
                y4g0 y4g0Var = ipl0Var.b;
                boolean z3 = ipl0Var.f15170a;
                int i4 = (i2 << 3) & 7168;
                if (y4g0Var instanceof m4g0) {
                    fetVar2.e0(525048119);
                    i120.u(jm40Var, ((m4g0) y4g0Var).f21169a, fetVar2, 0);
                    fetVar2.r(false);
                } else if (y4g0Var instanceof p4g0) {
                    fetVar2.e0(525052087);
                    i120.x(jm40Var, ((p4g0) y4g0Var).f26351a, function1, fetVar2, (i4 >> 3) & 896);
                    fetVar2.r(false);
                } else if (y4g0Var.equals(v4g0.f36777a)) {
                    fetVar2.e0(525057006);
                    i120.H(0, fetVar2, null);
                    fetVar2.r(false);
                } else {
                    if (!(y4g0Var instanceof s4g0)) {
                        throw b1j.f(525047112, fetVar2, false);
                    }
                    fetVar2.e0(-903032494);
                    s4g0 s4g0Var = (s4g0) y4g0Var;
                    i120.z(null, s4g0Var.f31604a, z3, s4g0Var.b, function1, fetVar2, (i4 << 3) & 57344);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                if (!(kpl0Var instanceof jpl0)) {
                    throw b1j.f(1840619670, fetVar2, false);
                }
                fetVar2.e0(1840627875);
                dnf0 dnf0Var = ((jpl0) kpl0Var).b;
                if (dnf0Var instanceof xmf0) {
                    fetVar2.e0(-1335971505);
                    lv00.C(null, ((xmf0) dnf0Var).f41121a, function1, fetVar2, i3);
                    fetVar2.r(false);
                } else if (dnf0Var instanceof zmf0) {
                    fetVar2.e0(-1335968437);
                    lv00.F(i3, fetVar2, ((zmf0) dnf0Var).f44624a, jm40Var, function1);
                    fetVar2.r(false);
                } else {
                    if (!dnf0Var.equals(bnf0.f2882a)) {
                        throw b1j.f(-1335972930, fetVar2, false);
                    }
                    fetVar2.e0(-1335963574);
                    lv00.K(0, fetVar2, null);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, kpl0Var, function1, i, (byte) 23);
        }
    }

    public static final void E(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(906344551);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        byte b2 = 3;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 28.0f), 36.0f);
            boolean zF = fetVar2.f(secondary);
            Object objP = fetVar2.P();
            if (zF || objP == ukd.f35823a) {
                objP = new bx(b2, secondary);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, backgroundContent, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, i2 & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 3, i, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v13, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v14, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v16, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v18, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    public static final void F(int i, long j, fet fetVar, String str, Function0 function0) {
        ?? r4;
        ?? r0;
        jm40 jm40Var;
        float f2;
        float f3;
        ?? r5;
        ?? r6;
        ?? r7;
        fetVar.g0(1792159286);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.h(true) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pz40 pz40VarD0 = uc9.d0(j, function0, fetVar, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var2, "TIMER_CELLS");
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1102157414);
            String str2 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str2 == null) {
                fetVar.e0(-192858533);
                fetVar.r(false);
            } else {
                fetVar.e0(-192858532);
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    E(String.valueOf(str2.charAt(i3)), fetVar, 0);
                }
                fetVar.r(false);
            }
            fetVar.r(false);
            String str3 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str3 == null || str3.length() == 0) {
                fet fetVar2 = fetVar;
                r0 = 0;
                jm40Var = jm40Var2;
                f2 = 0.0f;
                f3 = 2.0f;
                fetVar2.e0(-192100024);
                fetVar2.r(false);
                r5 = fetVar2;
            } else {
                fetVar.e0(-192683661);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(o7k0.u(jm40Var2, 0.0f, 18.0f, 1), 2.0f, 0.0f, 2);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                f3 = 2.0f;
                f2 = 0.0f;
                r0 = 0;
                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, i2 & 14, 24576, 113648);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r5 = fetVar3;
            }
            r5.e0(1102182814);
            ?? r8 = ((xnq0) pz40VarD0.getValue()).b;
            for (?? r9 = r0; r9 < r8.length(); r9++) {
                E(String.valueOf(r8.charAt(r9)), r5, r0);
            }
            r5.r(r0);
            if (((xnq0) pz40VarD0.getValue()).b.length() > 0) {
                r5.e0(-191938762);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(jm40Var, f3, f2, 2);
                ((g1t0) r5.k(j1t0.e)).getClass();
                v8q0.a(Separators.COLON, mm40VarL2, ((ThemeColors) r5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 6, 24576, 114680);
                ?? r10 = fetVar;
                r10.r(r0);
                r6 = r10;
            } else {
                r5.e0(-191665528);
                r5.r(r0);
                r6 = r5;
            }
            r6.e0(1102196894);
            ?? r11 = ((xnq0) pz40VarD0.getValue()).c;
            for (?? r12 = r0; r12 < r11.length(); r12++) {
                E(String.valueOf(r11.charAt(r12)), r6, r0);
            }
            r6.r(r0);
            if (((xnq0) pz40VarD0.getValue()).c.length() > 0) {
                r6.e0(-191500298);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarL3 = s5x0.L(jm40Var, f3, f2, 2);
                ((g1t0) r6.k(j1t0.e)).getClass();
                v8q0.a(Separators.COLON, mm40VarL3, ((ThemeColors) r6.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 6, 24576, 114680);
                ?? r13 = fetVar;
                r13.r(r0);
                r7 = r13;
            } else {
                r6.e0(-191227064);
                r6.r(r0);
                r7 = r6;
            }
            r7.e0(1102211038);
            ?? r1 = ((xnq0) pz40VarD0.getValue()).d;
            for (?? r14 = r0; r14 < r1.length(); r14++) {
                E(String.valueOf(r1.charAt(r14)), r7, r0);
            }
            r7.r(r0);
            r7.r(true);
            r4 = r7;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            r4 = fetVar4;
        }
        yfe0 yfe0VarU = r4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dx1(str, j, function0, i, (byte) 1);
        }
    }

    public static final void G(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(268765350);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            zfn zfnVar = zaq0.b;
            hlm.c(mm40VarW, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i2 << 3) & 7168, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fg5(mm40Var, str, function0, i, (byte) 4);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        fet fetVar2;
        boolean z;
        l7m0Var.getClass();
        fetVar.g0(-239080353);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (((cqr) l7m0Var.getValue()).c) {
                fetVar.e0(-2122947534);
                z = fetVar.k(bmd.n) == k6z.b;
                fetVar.r(false);
            } else {
                fetVar.e0(-1386862877);
                fetVar.r(false);
                z = false;
            }
            mm40 mm40VarE0 = o2e.e0(yyw.V(i120.Q(o7k0.c, obc.O(((cqr) l7m0Var.getValue()).b, fetVar), jd8.n), z), "BACKGROUND_IMAGE");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = g2r0.h;
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = (i3 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ufp(l7m0Var, (byte) 28);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function1, mm40VarE0, (Function1) objP2, fetVar2, 6, 0);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf4(l7m0Var, mm40Var, i);
        }
    }

    public static final void I(mm40 mm40Var, yrl yrlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-857052678);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yrlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TIMER_COLUMN");
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            String str = yrlVar.f43127a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            fetVar.e0(2007288431);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            fetVar.r(false);
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarG, fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(129538436, new bx1(yrlVar, function0, b2), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx1(mm40Var, yrlVar, function0, i, (byte) 1);
        }
    }

    public static final void J(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1066063380);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            mm40 mm40VarD = o7k0.d(o7k0.s(o7k0.e(jm40Var, 12.0f), 128.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.s(o7k0.e(jm40Var, 40.0f), 304.0f), 1.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 6);
        }
    }

    public static final mm40 K(mm40 mm40Var, lh80 lh80Var) {
        return mm40Var.e(new ih80(lh80Var));
    }

    public static final mm40 L(mm40 mm40Var, vhv0 vhv0Var) {
        return mm40Var.e(new z7t0(vhv0Var));
    }

    public static void M(Fragment fragment, wdk0 wdk0Var, String str, String str2, String str3, String str4, Integer num, ViewGroup viewGroup, int i) {
        String str5 = (i & 16) != 0 ? "" : str4;
        Integer num2 = (i & 32) != 0 ? null : num;
        ViewGroup viewGroup2 = (i & 64) != 0 ? null : viewGroup;
        fragment.getClass();
        wdk0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        Object systemService = fragment.o0().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
        if (Build.VERSION.SDK_INT <= 32) {
            wdk0.k(wdk0Var, new xdk0(pek0.f26859a, str3, str5, null, null, num2, 88), fragment, null, viewGroup2, false, null, 1012);
        }
    }

    public static final void N(fhl fhlVar, i9q i9qVar, w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, w03 w03Var5, g9q0 g9q0Var, boolean z) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i9qVar.i);
        bigDecimalValueOf.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f);
        long j = i9qVar.g;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j);
        bigDecimalValueOf2.getClass();
        long j2 = i9qVar.j;
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j2);
        bigDecimalValueOf3.getClass();
        float fP = (float) tdc.P(bigDecimalValueOf, fIntBitsToFloat, bigDecimalValueOf3, bigDecimalValueOf2);
        float fP2 = (float) tdc.P(new BigDecimal(String.valueOf(i9qVar.l)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)), new BigDecimal(String.valueOf(i9qVar.f14399a)), new BigDecimal(String.valueOf(i9qVar.b)));
        w03Var.f(fP, fP2);
        w03Var.e(fP, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        w03Var.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        w03Var.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), fP2);
        w03Var.c();
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        fhl.C0(fhlVar, w03Var, staticColors.m100getGreen200d7_KjU(), 0.0f, null, 60);
        w03Var2.f(fP, fP2);
        w03Var2.e(fP, 0.0f);
        w03Var2.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), 0.0f);
        w03Var2.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), fP2);
        w03Var2.c();
        fhl.C0(fhlVar, w03Var2, staticColors.m115getRed200d7_KjU(), 0.0f, null, 60);
        long j3 = i9qVar.d;
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(j3);
        bigDecimalValueOf4.getClass();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j);
        bigDecimalValueOf5.getClass();
        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j2);
        bigDecimalValueOf6.getClass();
        float fP3 = (float) tdc.P(bigDecimalValueOf4, fIntBitsToFloat2, bigDecimalValueOf6, bigDecimalValueOf5);
        w03Var5.f(fP3, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        w03Var5.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        w03Var5.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f), 0.0f);
        w03Var5.e(fP3, 0.0f);
        w03Var5.c();
        fhl.C0(fhlVar, w03Var5, staticColors.m70getBlack200d7_KjU(), 0.0f, null, 60);
        w03Var3.f(fP, fP2);
        w03Var3.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(120.0f), fP2);
        pz40 pz40Var2 = s6t0.f31722a;
        long primary = s6t0.b().f33626a.getPrimary();
        zcl zclVar = qmk.f28987a;
        fhl.C0(fhlVar, w03Var3, primary, 0.0f, new vtm0(fhlVar.w0(1.0f), 0.0f, 0, 0, null, 30), 52);
        w03Var4.f(fP, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
        w03Var4.e(fP, 0.0f);
        fhl.C0(fhlVar, w03Var4, s6t0.b().f33626a.getSeparator(), 0.0f, new vtm0(fhlVar.w0(1.0f), 0.0f, 0, 0, null, 30), 52);
        fhl.E(fhlVar, s6t0.b().f33626a.getPrimary(), fhlVar.w0(4.0f), (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L), 0.0f, null, 120);
        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(j3);
        bigDecimalValueOf7.getClass();
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f);
        BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(j);
        bigDecimalValueOf8.getClass();
        BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(j2);
        bigDecimalValueOf9.getClass();
        float fP4 = (float) tdc.P(bigDecimalValueOf7, fIntBitsToFloat3, bigDecimalValueOf9, bigDecimalValueOf8);
        a9q0 a9q0VarA = g9q0.a(g9q0Var, i9qVar.m, y9q0.a(g1t0.m(), s6t0.b().f33626a.getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0, 0, 0L, null, 1020);
        float fW0 = fhlVar.w0(6.0f) + fP;
        long j4 = a9q0VarA.c;
        float f2 = (((int) (j4 >> 32)) / 2.0f) + fW0;
        float f3 = -(fhlVar.w0(2.0f) + fP2 + ((int) (j4 & 4294967295L)));
        nr nrVarA0 = fhlVar.A0();
        long jP = nrVarA0.p();
        nrVarA0.i().l();
        try {
            fvt0 fvt0Var = (fvt0) nrVarA0.b;
            fvt0Var.z(1.0f, -1.0f, 0L);
            if (z) {
                fvt0Var.z(-1.0f, 1.0f, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            }
            v2n0.o(fhlVar, a9q0VarA, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 250);
            defpackage.c.g(nrVarA0, jP);
            a9q0 a9q0VarA2 = g9q0.a(g9q0Var, i9qVar.e, y9q0.a(g1t0.e(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0, 0, 0L, null, 1020);
            long j5 = a9q0VarA2.c;
            float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f)) - (((Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(124.0f)) - fP4) / 2.0f);
            float f4 = fIntBitsToFloat4 - (((int) (j5 >> 32)) / 2);
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
            float f5 = fIntBitsToFloat5 - (((int) (j5 & 4294967295L)) / 2);
            nr nrVarA1 = fhlVar.A0();
            long jP2 = nrVarA1.p();
            nrVarA1.i().l();
            try {
                fvt0 fvt0Var2 = (fvt0) nrVarA1.b;
                fvt0Var2.z(1.0f, -1.0f, p7x.u(((nr) fvt0Var2.f10231a).p()));
                fvt0Var2.y(z ? 90.0f : -90.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32));
                if (z) {
                    fvt0Var2.z(-1.0f, 1.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L));
                }
                v2n0.o(fhlVar, a9q0VarA2, 0L, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), 250);
            } finally {
                defpackage.c.g(nrVarA1, jP2);
            }
        } catch (Throwable th) {
            defpackage.c.g(nrVarA0, jP);
            throw th;
        }
    }

    public static qu6 O() {
        return new qu6(-1L, 0L, 0L, 0L, 0L, "", "", "", "", "", "", "", "", "", "", "", "", 0L, "", 0.0d, new tv6("", "", "", "", 0L), "", uoy.UNKNOWN, 0L, yfa0.INSTANCE, gwe.DEFAULT, 0, 0L, 0.0d, "", 0, new ic9(0, 0, 0, uyc.IDLE));
    }

    public static final void P(Fragment fragment, Function0 function0) {
        fragment.getClass();
        View viewJ = fragment.J();
        if (viewJ == null) {
            return;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(viewJ);
        if (xiv0VarA == null || !xiv0VarA.f40966a.u(8)) {
            function0.invoke();
        } else {
            X(viewJ);
            viewJ.postDelayed(new fy2(fragment, function0, (byte) 3), 260L);
        }
    }

    public static final Intent Q(Context context) {
        context.getClass();
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    public static final void R(bnk0 bnk0Var, String str) {
        if (!bnk0Var.f2888a.isEmpty()) {
            pzw.E(bnk0Var, ". ", 0, R.color.static_white_60, 0, 0, 54);
        }
        pzw.E(bnk0Var, str, 0, R.color.static_white, 0, 0, 54);
    }

    public static final Activity S(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return S(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static ScheduledExecutorService T() {
        if (f15711a != null) {
            return f15711a;
        }
        synchronized (j120.class) {
            try {
                if (f15711a == null) {
                    f15711a = new lmv(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15711a;
    }

    public static final int U(Activity activity) {
        return activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static final String V() {
        return Build.VERSION.SDK_INT < 30 ? "android.permission.WRITE_EXTERNAL_STORAGE" : "";
    }

    public static final long W(float f2, long j, long j2) {
        float fH = y3d.h(j);
        float fH2 = ((y3d.h(j2) - fH) * f2) + fH;
        float fG = y3d.g(j);
        float fG2 = ((y3d.g(j2) - fG) * f2) + fG;
        float fE = y3d.e(j);
        float fE2 = ((y3d.e(j2) - fE) * f2) + fE;
        float fD = y3d.d(j);
        return fbc.c(fH2, fG2, fE2, ((y3d.d(j2) - fD) * f2) + fD, a5d.e);
    }

    public static final void X(View view) {
        view.getClass();
        Object systemService = view.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void Y(Fragment fragment) {
        fragment.getClass();
        View viewJ = fragment.J();
        if (viewJ != null) {
            X(viewJ);
        }
    }

    public static final int Z(kbz kbzVar, boolean z) {
        int iK;
        int iF;
        if (z) {
            iK = kbzVar.c();
            iF = kbzVar.h();
        } else {
            iK = kbzVar.k();
            iF = kbzVar.f();
        }
        return iF + iK;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        function0.getClass();
        fetVar.g0(1705417221);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new b5(b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dd(z, function0, b3);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40Var, (Function1) objP2, fetVar, ((i2 << 3) & 112) | 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var, function0, z, i, (byte) 0);
        }
    }

    public static final mm40 a0(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new pbe(function1));
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        function0.getClass();
        fetVar.g0(-179311283);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new b5((byte) 5);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dd(z, function0, b2);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40Var, (Function1) objP2, fetVar, ((i2 << 3) & 112) | 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var, function0, z, i, (byte) 1);
        }
    }

    public static final mm40 b0(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new hpq(function1));
    }

    public static final void c(mm40 mm40Var, sql sqlVar, sql sqlVar2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-935605792);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(sqlVar) ? 32 : 16) | (fetVar2.g(sqlVar2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 40.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarN2, null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVar);
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
            String strQ = w6x.q(sqlVar.c, Separators.SP, sqlVar.b);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(strQ, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.r, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110578);
            String strQ2 = w6x.q(sqlVar2.c, Separators.SP, sqlVar2.b);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(strQ2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mql(mm40Var, sqlVar, sqlVar2, i, (byte) 2);
        }
    }

    public static final void c0(Context context, String str) {
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(context.getString(R.string.deeplink_scheme) + "://" + str));
            intent.setPackage(context.getPackageName());
            if (S(context) == null) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static final void d(String str, unm unmVar, fet fetVar, int i) {
        unm unmVar2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-1316864263);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(unmVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarU = o7k0.u(jm40Var, 20.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), new n05(qmk.q, qmk.s, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, i2 & 14, 24576, 113648);
            fetVar2 = fetVar;
            unmVar2 = unmVar;
            snm.b(o7k0.c, unmVar2, fetVar2, (i2 & 112) | 6);
            fetVar2.r(true);
        } else {
            unmVar2 = unmVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(str, unmVar2, i, (byte) 29);
        }
    }

    public static final void d0(Context context, String str) {
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(context.getString(R.string.deeplink_scheme) + "://" + str));
            intent.setPackage(context.getPackageName());
            intent.putExtra("DISMISS_DIALOGS", false);
            if (S(context) == null) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static final void e(mm40 mm40Var, asl aslVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(-778920385);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (aslVar instanceof yrl) {
            fetVar.e0(-1218172841);
            I(mm40Var, (yrl) aslVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!aslVar.equals(zrl.f44860a)) {
                throw b1j.f(-1218175037, fetVar, false);
            }
            fetVar.e0(-1218166332);
            J(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ax1(mm40Var, aslVar, function0, i, (byte) 1);
        }
    }

    public static final void e0(Context context, String str, String str2) {
        str2.getClass();
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(str));
            intent.putExtra("WIN_BACK_ANALYTICS", str2);
            intent.setPackage(context.getPackageName());
            if (S(context) == null) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static final void f(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1849997779);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.f;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "AUTH_LOGIN_SIMPLE_REGISTER_LABEL"), fetVar, Integer.valueOf((i2 & 112) | 6));
            ugdVar2.F(mrv.k0(jm40Var, "AUTH_LOGIN_SIMPLE_REGISTER_BUTTON"), fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf4(mm40Var, ugdVar, ugdVar2, i, (byte) 0);
        }
    }

    public static final boolean f0(yc3 yc3Var, Intent intent) {
        intent.getClass();
        if (!StringsKt.W("")) {
            try {
                yc3Var.getPackageManager().getPackageInfo("", 0);
                Intent launchIntentForPackage = yc3Var.getPackageManager().getLaunchIntentForPackage("");
                if (launchIntentForPackage != null) {
                    Intent intent2 = new Intent(intent.getAction());
                    intent2.setPackage("");
                    intent2.setComponent(launchIntentForPackage.getComponent());
                    Uri data = intent.getData();
                    if (data != null) {
                        intent2.setData(data);
                    }
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        intent2.putExtras(extras);
                    }
                    intent2.addFlags(268468224);
                    if (Build.VERSION.SDK_INT < 26) {
                        yc3Var.moveTaskToBack(true);
                    }
                    yc3Var.startActivity(intent2);
                    yc3Var.finishAndRemoveTask();
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i2;
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(1244201621);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar), fetVar), null, o2e.e0(y860.W(mm40Var, null, null, true, null, function0, 24), "BACK_ICON"), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var, function0, i, b2);
        }
    }

    public static final void g0(Context context, Bundle bundle) {
        Intent intentQ = Q(context);
        if (intentQ == null) {
            return;
        }
        context.startActivity(new Intent(intentQ).setAction("RESTART"));
        Activity activityS = S(context);
        if (activityS != null) {
            activityS.finish();
        }
        context.startActivity(intentQ.setFlags(335577088).putExtras(bundle));
    }

    public static final dn8 h(float f2, long j) {
        return new dn8(f2, new skk0(j));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void i(final mm40 mm40Var, final a4x a4xVar, final float f2, final boolean z, String str, final Function1 function1, fet fetVar, final int i, final int i2) {
        String str2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        final String str3;
        yfe0 yfe0VarU;
        String str4;
        float f3;
        jm40 jm40Var;
        mm40 mm40VarE0;
        Iterator itO;
        int i5;
        Object next;
        int i6;
        mm40 mm40VarD;
        boolean z4;
        boolean zE;
        Object objP;
        char c2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(2124289821);
        int i7 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                i7 |= fetVar.g(str2) ? 16384 : 8192;
            }
            if (fetVar.i(function1)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i4 = i7 | i3;
            z2 = true;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i8 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                f3 = 1.0f;
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD2, 16.0f, 8.0f);
                jm40Var = jm40.b;
                if (str4 != null) {
                    mm40VarE0 = o2e.e0(jm40Var, str4);
                } else {
                    mm40VarE0 = jm40Var;
                }
                mm40 mm40VarE = mm40VarK.e(mm40VarE0);
                thg0 thg0VarA = shg0.a(new qw3(f2, true, new jf4((byte) 14)), gqw0.j, fetVar, 48);
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
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                itO = h97.o(fetVar, mm40VarC0, gqw0.v, -442305854, a4xVar);
                i5 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i6 = i5 + 1;
                    if (i5 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    wul wulVar = (wul) next;
                    if (z) {
                        mm40VarD = o7k0.d(new x7z(f3, z2), f3);
                    } else {
                        mm40VarD = o7k0.d(jm40Var, f3);
                    }
                    if ((i4 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zE = z4 | fetVar.e(i5);
                    objP = fetVar.P();
                    if (!zE || objP == ukd.f35823a) {
                        c2 = 2;
                        objP = new re1(function1, i5, (byte) 2);
                        fetVar.o0(objP);
                    } else {
                        c2 = 2;
                    }
                    qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 0, 0);
                    i5 = i6;
                    str4 = str4;
                    jm40Var = jm40Var;
                    f3 = 1.0f;
                    z2 = true;
                }
                fetVar.r(false);
                fetVar.r(true);
                str3 = str4;
            } else {
                fetVar.X();
                str3 = str2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ce9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j120.i(mm40Var, a4xVar, f2, z, str3, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 |= 24576;
        str2 = str;
        if (fetVar.i(function1)) {
            i3 = 131072;
        } else {
            i3 = 65536;
        }
        i4 = i7 | i3;
        z2 = true;
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i8 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            f3 = 1.0f;
            mm40 mm40VarD3 = o7k0.d(mm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarK2 = s5x0.K(mm40VarD3, 16.0f, 8.0f);
            jm40Var = jm40.b;
            if (str4 != null) {
                mm40VarE0 = o2e.e0(jm40Var, str4);
            } else {
                mm40VarE0 = jm40Var;
            }
            mm40 mm40VarE2 = mm40VarK2.e(mm40VarE0);
            thg0 thg0VarA2 = shg0.a(new qw3(f2, true, new jf4((byte) 14)), gqw0.j, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            itO = h97.o(fetVar, mm40VarC1, gqw0.v, -442305854, a4xVar);
            i5 = 0;
            while (itO.hasNext()) {
                next = itO.next();
                i6 = i5 + 1;
                if (i5 >= 0) {
                    q3d.p();
                    throw null;
                }
                wul wulVar2 = (wul) next;
                if (z) {
                    mm40VarD = o7k0.d(new x7z(f3, z2), f3);
                } else {
                    mm40VarD = o7k0.d(jm40Var, f3);
                }
                if ((i4 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zE = z4 | fetVar.e(i5);
                objP = fetVar.P();
                if (zE) {
                    c2 = 2;
                    objP = new re1(function1, i5, (byte) 2);
                    fetVar.o0(objP);
                } else {
                    c2 = 2;
                    objP = new re1(function1, i5, (byte) 2);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarD, wulVar2, (Function0) objP, fetVar, 0, 0);
                i5 = i6;
                str4 = str4;
                jm40Var = jm40Var;
                f3 = 1.0f;
                z2 = true;
            }
            fetVar.r(false);
            fetVar.r(true);
            str3 = str4;
        } else {
            fetVar.X();
            str3 = str2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ce9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j120.i(mm40Var, a4xVar, f2, z, str3, function1, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x018a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x01de  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0259  */
    /* JADX WARN: Code duplicated, block: B:176:0x0263  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    public static final gj0 i0(jj0 jj0Var, mi0 mi0Var) throws g2 {
        Object obj;
        Object next;
        String strValueOf;
        Integer num;
        pc0 pc0Var;
        String strValueOf2;
        String strValueOf3;
        pc0 pc0Var2;
        String strValueOf4;
        Integer num2;
        pc0 pc0Var3;
        String strValueOf5;
        String strValueOf6;
        String strValueOf7;
        String strValueOf8;
        String strValueOf9;
        nw80 nw80Var;
        String strValueOf10;
        pc0 pc0Var4;
        String strValueOf11;
        jj0Var.getClass();
        mi0Var.getClass();
        Integer num3 = jj0Var.f16598a;
        pi0 pi0Var = jj0Var.e;
        if (num3 == null) {
            throw new g2((byte) 4);
        }
        Integer num4 = jj0Var.b;
        Iterator it = kj0.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            byte b2 = ((kj0) next).f18362a;
            if (num4 != null && b2 == num4.intValue()) {
                break;
            }
        }
        kj0 kj0Var = (kj0) next;
        if (kj0Var == null) {
            throw new g2((byte) 9);
        }
        switch (kj0Var.ordinal()) {
            case 0:
                if (num3 == null || (strValueOf = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                ti0 ti0VarE0 = i120.e0(jj0Var);
                if (pi0Var == null || (num = pi0Var.c) == null) {
                    throw new g2((byte) 4);
                }
                Integer num5 = pi0Var.f27022a;
                if (num5 == null) {
                    throw new g2((byte) 4);
                }
                int iIntValue = num5.intValue();
                String str = pi0Var.d;
                if (str == null) {
                    throw new g2((byte) 4);
                }
                Boolean bool = pi0Var.e;
                if (bool == null) {
                    throw new g2((byte) 4);
                }
                boolean zBooleanValue = bool.booleanValue();
                for (Object obj2 : pc0.e) {
                    if (((pc0) obj2).f26734a.equals(pi0Var.f)) {
                        obj = obj2;
                        pc0Var = (pc0) obj;
                        if (pc0Var != null) {
                            return new xi0(strValueOf, ti0VarE0, num, iIntValue, str, zBooleanValue, pc0Var, pi0Var.b);
                        }
                        throw new g2((byte) 4);
                    }
                }
                pc0Var = (pc0) obj;
                if (pc0Var != null) {
                    return new xi0(strValueOf, ti0VarE0, num, iIntValue, str, zBooleanValue, pc0Var, pi0Var.b);
                }
                throw new g2((byte) 4);
            case 1:
                if (num3 == null || (strValueOf2 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new fj0(strValueOf2, i120.e0(jj0Var));
            case 2:
                if (num3 == null || (strValueOf3 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                ti0 ti0VarE1 = i120.e0(jj0Var);
                for (Object obj3 : pc0.e) {
                    if (((pc0) obj3).f26734a.equals(pi0Var != null ? pi0Var.f : null)) {
                        obj = obj3;
                        pc0Var2 = (pc0) obj;
                        if (pc0Var2 != null) {
                            return new dj0(strValueOf3, ti0VarE1, pc0Var2);
                        }
                        throw new g2((byte) 4);
                    }
                }
                pc0Var2 = (pc0) obj;
                if (pc0Var2 != null) {
                    return new dj0(strValueOf3, ti0VarE1, pc0Var2);
                }
                throw new g2((byte) 4);
            case 3:
                if (num3 == null || (strValueOf4 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                ti0 ti0VarE2 = i120.e0(jj0Var);
                if (pi0Var == null || (num2 = pi0Var.c) == null) {
                    throw new g2((byte) 4);
                }
                int iIntValue2 = num2.intValue();
                Integer num6 = pi0Var.f27022a;
                if (num6 == null) {
                    throw new g2((byte) 4);
                }
                int iIntValue3 = num6.intValue();
                for (Object obj4 : pc0.e) {
                    if (((pc0) obj4).f26734a.equals(pi0Var.f)) {
                        obj = obj4;
                        pc0Var3 = (pc0) obj;
                        if (pc0Var3 != null) {
                            return new cj0(strValueOf4, ti0VarE2, iIntValue2, iIntValue3, pc0Var3);
                        }
                        throw new g2((byte) 4);
                    }
                }
                pc0Var3 = (pc0) obj;
                if (pc0Var3 != null) {
                    return new cj0(strValueOf4, ti0VarE2, iIntValue2, iIntValue3, pc0Var3);
                }
                throw new g2((byte) 4);
            case 4:
                if (num3 == null || (strValueOf5 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new bj0(strValueOf5, i120.e0(jj0Var));
            case 5:
                if (num3 == null || (strValueOf6 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new vi0(strValueOf6, i120.e0(jj0Var));
            case 6:
                if (num3 == null || (strValueOf7 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new yi0(strValueOf7, i120.e0(jj0Var));
            case 7:
                if (num3 == null || (strValueOf8 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new zi0(strValueOf8, i120.e0(jj0Var));
            case 8:
                if (num3 == null || (strValueOf9 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                ti0 ti0VarE3 = i120.e0(jj0Var);
                int iOrdinal = mi0Var.ordinal();
                if (iOrdinal == 0) {
                    nw80Var = nw80.u;
                } else {
                    if (iOrdinal != 1) {
                        throw new g2((byte) 4);
                    }
                    nw80Var = nw80.t;
                }
                return new aj0(strValueOf9, ti0VarE3, nw80Var);
            case 9:
                if (num3 == null || (strValueOf10 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                ti0 ti0VarE4 = i120.e0(jj0Var);
                for (Object obj5 : pc0.e) {
                    if (((pc0) obj5).f26734a.equals(pi0Var != null ? pi0Var.f : null)) {
                        obj = obj5;
                        pc0Var4 = (pc0) obj;
                        if (pc0Var4 != null) {
                            return new ej0(strValueOf10, ti0VarE4, pc0Var4);
                        }
                        throw new g2((byte) 4);
                    }
                }
                pc0Var4 = (pc0) obj;
                if (pc0Var4 != null) {
                    return new ej0(strValueOf10, ti0VarE4, pc0Var4);
                }
                throw new g2((byte) 4);
            case 10:
                if (num3 == null || (strValueOf11 = String.valueOf(num3.intValue())) == null) {
                    throw new g2((byte) 4);
                }
                return new wi0(strValueOf11, i120.e0(jj0Var));
            default:
                t9f.b();
                return null;
        }
    }

    public static final void j(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-839272158);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            a4xVar2 = a4xVar;
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1987641318, a4xVar2);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                wul wulVar = (wul) next;
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                boolean zE = ((i2 & 896) == 256) | fetVar.e(i3);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new re1(function1, i3, (byte) 3);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarD2, wulVar, (Function0) objP, fetVar, 6, 0);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar2, function1, i, (byte) 0);
        }
    }

    public static final List j0(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayListN0 = CollectionsKt.N0(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            kbz kbzVar = (kbz) arrayList.get(i3);
            int index = kbzVar.getIndex();
            if (i <= index && index <= i2) {
                arrayListN0.add(kbzVar);
            }
        }
        v3d.t(g, arrayListN0);
        return arrayListN0;
    }

    public static final void k(mm40 mm40Var, xcz xczVar, fet fetVar, int i) {
        int i2;
        byte b2;
        int i3;
        Object jtaVar;
        t33 t33Var;
        int i4;
        fetVar.g0(-1804530116);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var2 = (t33) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = jgk0.b(new eb(xczVar, (byte) 7));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var = (cgk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP4);
            }
            cgk0 cgk0Var2 = (cgk0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.b(-1);
                fetVar.o0(objP5);
            }
            cgk0 cgk0Var3 = (cgk0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = androidx.compose.runtime.e.b(-1);
                fetVar.o0(objP6);
            }
            cgk0 cgk0Var4 = (cgk0) objP6;
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objP7 = fetVar.P();
            if (z || objP7 == obj) {
                i3 = i5;
                Object htaVar = new hta(xczVar, cgk0Var2, cgk0Var3, cgk0Var4, null, (byte) 0);
                fetVar.o0(htaVar);
                objP7 = htaVar;
            } else {
                i3 = i5;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP7);
            boolean zI = (i3 == 32) | fetVar.i(t33Var2);
            Object objP8 = fetVar.P();
            if (zI || objP8 == obj) {
                t33Var = t33Var2;
                jtaVar = new jta(xczVar, cgk0Var, cgk0Var2, t33Var, null, (byte) 0);
                fetVar.o0(jtaVar);
            } else {
                jtaVar = objP8;
                t33Var = t33Var2;
            }
            m0x0.t(fetVar, xczVar, (Function2) jtaVar);
            Object objP9 = fetVar.P();
            if (objP9 == obj) {
                objP9 = jgk0.b(new eb(xczVar, (byte) 9));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var2 = (l7m0) objP9;
            if (((Number) l7m0Var2.getValue()).intValue() > 1) {
                fetVar.e0(1351306528);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
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
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                fetVar.e0(-2022758727);
                int iIntValue = ((Number) l7m0Var2.getValue()).intValue();
                int i6 = 0;
                while (i6 < iIntValue) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 8.0f), 2.0f);
                    boolean zE = fetVar.e(i6) | fetVar.i(t33Var);
                    Object objP10 = fetVar.P();
                    if (zE || objP10 == obj) {
                        i4 = i6;
                        Object etaVar = new eta(cgk0Var4, cgk0Var3, i4, t33Var, l7m0Var, (byte) 0);
                        fetVar.o0(etaVar);
                        objP10 = etaVar;
                    } else {
                        i4 = i6;
                    }
                    zq8.a(0, fetVar, rq8.K(mm40VarE, (Function1) objP10));
                    i6 = i4 + 1;
                }
                b2 = 0;
                ohs0.x(fetVar, false, true, false);
            } else {
                b2 = 0;
                fetVar.e0(1352518938);
                zq8.a(0, fetVar, o7k0.d(mm40Var, 1.0f));
                fetVar.r(false);
            }
        } else {
            b2 = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fta(mm40Var, xczVar, i, b2);
        }
    }

    public static final mm40 k0(mm40 mm40Var, vhv0 vhv0Var) {
        return mm40Var.e(new zfx(vhv0Var));
    }

    public static final void l(final i9q i9qVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z2;
        function1.getClass();
        fetVar.g0(-838047748);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(i9qVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            final pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(-1);
                fetVar.o0(objP);
            }
            final cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = z03.a();
                fetVar.o0(objP2);
            }
            final w03 w03Var = (w03) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = z03.a();
                fetVar.o0(objP3);
            }
            final w03 w03Var2 = (w03) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = z03.a();
                fetVar.o0(objP4);
            }
            final w03 w03Var3 = (w03) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = z03.a();
                fetVar.o0(objP5);
            }
            final w03 w03Var4 = (w03) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = z03.a();
                fetVar.o0(objP6);
            }
            final w03 w03Var5 = (w03) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = z03.a();
                fetVar.o0(objP7);
            }
            final w03 w03Var6 = (w03) objP7;
            final g9q0 g9q0VarN = pym0.n(fetVar);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            final boolean z3 = z2;
            nnw0.g(s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, 4.0f, 7), null, false, u1c.M(1290120914, new xdr() { // from class: a.ric
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    lr8 lr8Var = (lr8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lr8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(lr8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        n0q n0qVar2 = o7k0.c;
                        Unit unit = Unit.f46060a;
                        pz40 pz40Var = pz40VarF;
                        boolean zG = fetVar2.g(pz40Var);
                        boolean z4 = z3;
                        boolean zH = zG | fetVar2.h(z4);
                        Object objP8 = fetVar2.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (zH || objP8 == cl5Var2) {
                            objP8 = new uic(z4, cgk0Var, pz40Var);
                            fetVar2.o0(objP8);
                        }
                        mm40 mm40VarF = tdc.F(fnn0.a(n0qVar2, unit, (PointerInputEventHandler) objP8), lr8Var.c());
                        w03 w03Var7 = w03Var3;
                        boolean zI = fetVar2.i(w03Var7);
                        w03 w03Var8 = w03Var4;
                        boolean zI2 = zI | fetVar2.i(w03Var8);
                        w03 w03Var9 = w03Var;
                        boolean zI3 = zI2 | fetVar2.i(w03Var9);
                        w03 w03Var10 = w03Var2;
                        boolean zI4 = zI3 | fetVar2.i(w03Var10);
                        w03 w03Var11 = w03Var5;
                        boolean zI5 = zI4 | fetVar2.i(w03Var11);
                        w03 w03Var12 = w03Var6;
                        boolean zI6 = zI5 | fetVar2.i(w03Var12) | fetVar2.h(z4);
                        i9q i9qVar2 = i9qVar;
                        boolean zG2 = zI6 | fetVar2.g(i9qVar2);
                        g9q0 g9q0Var = g9q0VarN;
                        boolean zG3 = zG2 | fetVar2.g(g9q0Var);
                        Object objP9 = fetVar2.P();
                        if (zG3 || objP9 == cl5Var2) {
                            sic sicVar = new sic(w03Var7, w03Var8, w03Var9, w03Var10, w03Var11, w03Var12, z4, i9qVar2, g9q0Var);
                            fetVar2.o0(sicVar);
                            objP9 = sicVar;
                        }
                        p8a.k(mm40VarF, (Function1) objP9, fetVar2, 0);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) i9qVar, z, (Object) function1, i, (byte) 4);
        }
    }

    public static final void m(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-818343339);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        byte b4 = 29;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new afd(function1, (byte) 25);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new afd(function1, (byte) 26);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new eka(l7m0Var, b4));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new plh(l7m0Var, b2));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new plh(l7m0Var, b3));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var4 = (l7m0) objP5;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            H(0, fetVar, null, (l7m0) l7m0Var4.getValue());
            mm40 mm40VarE0 = o2e.e0(yyw.X(n0qVar, null, fetVar, 1), "CYBER_TOURNAMENT_BRACKET_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = (imm) l7m0Var2.getValue();
            boolean z4 = i3 == 32;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var) {
                objP6 = new afd(function1, (byte) 27);
                fetVar.o0(objP6);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            n((jjh) l7m0Var3.getValue(), function1, fetVar, 8 | i3);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(jjh jjhVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(-60542051);
        int i2 = (fetVar2.i(jjhVar) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (jjhVar != null) {
                boolean z3 = jjhVar instanceof ijh;
                jm40 jm40Var = jm40.b;
                pcy pcyVar = e7z.u1;
                cl5 cl5Var = ukd.f35823a;
                if (z3) {
                    fetVar2.e0(278287380);
                    mm40 mm40VarR = knm0.r(o7k0.c);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, shdVar);
                    mdm mdmVar = ((ijh) jjhVar).f14873a;
                    boolean z4 = (i2 & 112) == 32;
                    Object objP = fetVar2.P();
                    if (z4 || objP == cl5Var) {
                        objP = new afd(function1, (byte) 28);
                        fetVar2.o0(objP);
                    }
                    jcb.l(jm40Var, mdmVar, false, (Function0) objP, fetVar2, 6, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else if (jjhVar instanceof hjh) {
                    fetVar2.e0(278804181);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar);
                    mm40 mm40VarR2 = knm0.r(jm40Var);
                    mdm mdmVar2 = ((hjh) jjhVar).f13159a;
                    boolean z5 = (i2 & 112) == 32;
                    Object objP2 = fetVar2.P();
                    if (z5 || objP2 == cl5Var) {
                        objP2 = new afd(function1, (byte) 29);
                        fetVar2.o0(objP2);
                    }
                    jcb.l(mm40VarR2, mdmVar2, false, (Function0) objP2, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else if (jjhVar instanceof gjh) {
                    fetVar2.e0(279284247);
                    gjh gjhVar = (gjh) jjhVar;
                    pwr0 pwr0Var = gjhVar.b;
                    nsm0 nsm0Var = gjhVar.f11395a;
                    n0q n0qVar2 = o7k0.c;
                    long j = pwr0Var.d;
                    int i3 = i2 & 112;
                    boolean z6 = i3 == 32;
                    Object objP3 = fetVar2.P();
                    if (z6 || objP3 == cl5Var) {
                        objP3 = new ag0(function1, (byte) 25);
                        fetVar2.o0(objP3);
                    }
                    Function2 function2 = (Function2) objP3;
                    boolean z7 = i3 == 32;
                    Object objP4 = fetVar2.P();
                    if (z7 || objP4 == cl5Var) {
                        objP4 = new omf(function1, (byte) 29);
                        fetVar2.o0(objP4);
                    }
                    Function1 function3 = (Function1) objP4;
                    boolean z8 = i3 == 32;
                    Object objP5 = fetVar2.P();
                    if (z8 || objP5 == cl5Var) {
                        z2 = false;
                        objP5 = new olh(function1, 0 == true ? 1 : 0);
                        fetVar2.o0(objP5);
                    } else {
                        z2 = false;
                    }
                    jpm0.g(n0qVar2, nsm0Var, j, pwr0Var, function2, function3, (Function1) objP5, fetVar, 6);
                    fetVar2 = fetVar;
                    fetVar2.r(z2);
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            throw b1j.f(1948638045, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(jjhVar, function1, i, (byte) 2);
        }
    }

    public static final void o(mm40 mm40Var, wql wqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-717393715);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wqlVar) ? 32 : 16;
        }
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
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            c(s5x0.J(i120.Q(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f), wqlVar.f39596a, wqlVar.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lql(mm40Var, wqlVar, i, b2);
        }
    }

    public static final void p(mm40 mm40Var, xql xqlVar, fet fetVar, int i) {
        int i2;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        tql tqlVar;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1398040531);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(xqlVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            kjm kjmVar = kjm.f18392a;
            String str = xqlVar.e;
            tql tqlVar2 = xqlVar.d;
            shd shdVar8 = shdVar4;
            nkb.h(mm40VarN, new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190), kjmVar, null, null, null, fetVar2, 384, 56);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var2), afn0.m(fetVar2).getBackgroundContent(), jd8.n), 12.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar8);
            jpm0.o(fetVar2, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar7);
            c(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), xqlVar.f41326a, xqlVar.c, fetVar2, 0);
            byte b2 = 14;
            if (tqlVar2.f == uql.f36124a) {
                fetVar2.e0(-175477438);
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.k, fetVar2, 48);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar8);
                jpm0.o(fetVar2, bh90VarM3, shdVar5);
                vqd.u(iHashCode3, fetVar2, shdVar6, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar7);
                String str2 = tqlVar2.f34386a;
                if (str2 == null) {
                    fetVar2.e0(836259522);
                    fetVar2.r(false);
                    shdVar = shdVar7;
                    shdVar2 = shdVar5;
                    shdVar3 = shdVar6;
                    z2 = false;
                    tqlVar = tqlVar2;
                    jm40Var = jm40Var2;
                    z = true;
                } else {
                    x7z x7zVarF = rz4.f(fetVar2, 836259523, 1.0f, true);
                    y9q0 y9q0VarG = h97.g(fetVar2);
                    long secondary = afn0.m(fetVar2).getSecondary();
                    long j = qmk.q;
                    long j2 = qmk.r;
                    long j3 = qmk.n;
                    z = true;
                    jm40Var = jm40Var2;
                    shdVar = shdVar7;
                    shdVar3 = shdVar6;
                    shdVar2 = shdVar5;
                    v8q0.a(str2, x7zVarF, secondary, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110576);
                    tqlVar = tqlVar2;
                    v8q0.a(tqlVar2.e, o7k0.u(jm40Var, 0.0f, 68.0f, 1), afn0.m(fetVar).getSecondary(), new n05(j, j2, j3), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 109552);
                    fetVar2 = fetVar;
                    z2 = false;
                    fetVar2.r(false);
                }
                fetVar2.r(z);
                fetVar2.r(z2);
            } else {
                shdVar = shdVar7;
                shdVar2 = shdVar5;
                shdVar3 = shdVar6;
                pcyVar = pcyVar;
                tqlVar = tqlVar2;
                shdVar8 = shdVar8;
                jm40Var = jm40Var2;
                z = true;
                fetVar2.e0(-173740477);
                fetVar2.r(false);
            }
            n0q n0qVar = o7k0.c;
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            tql tqlVar3 = tqlVar;
            snm.b(n0qVar, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m132getYellow0d7_KjU(), afn0.m(fetVar2).getBackground(), 6.0f, 6.0f, tqlVar3.b, 0, true, 640), fetVar2, 6);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, z, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar8);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z);
            String str3 = tqlVar3.c;
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long textPrimary = afn0.m(fetVar2).getTextPrimary();
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
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kql(mm40Var, xqlVar, i, (byte) 2);
        }
    }

    public static final void q(mm40 mm40Var, String str, mq50 mq50Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        str.getClass();
        mq50Var.getClass();
        function1.getClass();
        fetVar2.g0(1265747371);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(mq50Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            int i3 = i2 & 7168;
            boolean z3 = i3 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new w250(function1, (byte) 17);
                fetVar2.o0(objP);
            }
            G(mm40VarD, str, (Function0) objP, fetVar2, (i2 & 112) | 6);
            boolean z4 = mq50Var instanceof jq50;
            if (z4 || (mq50Var instanceof lq50)) {
                fetVar2.e0(-1571792897);
                mm40 mm40VarE = o2e.e0(jm40Var, "PROMOTION_CARD_COLLECTION").e(o7k0.c);
                jq50 jq50Var = z4 ? (jq50) mq50Var : null;
                List list = jq50Var != null ? jq50Var.f16934a : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                hzc0 hzc0Var = new hzc0(ma80.f21447a);
                boolean z5 = mq50Var instanceof lq50;
                float f2 = xfn.a(fetVar2).c;
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarF = h97.f(f2, 8.0f, xfn.a(fetVar2).c, 32.0f, fetVar2);
                Integer numValueOf2 = Integer.valueOf(pkd.c(fetVar2) ? R.drawable.news_catalog_placeholder_square_dark : R.drawable.news_catalog_placeholder_square);
                boolean z6 = i3 == 2048;
                Object objP2 = fetVar2.P();
                if (z6 || objP2 == cl5Var) {
                    objP2 = new x6s(function1, (byte) 19);
                    fetVar2.o0(objP2);
                }
                z = true;
                uzb.u(mm40VarE, list, hzc0Var, z5, ch80VarF, 0.0f, 0.0f, numValueOf2, (Function2) objP2, fetVar2, 390, 96);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (!(mq50Var instanceof kq50)) {
                    throw b1j.f(-327800987, fetVar2, false);
                }
                fetVar2.e0(-327751986);
                n0q n0qVar = o7k0.c;
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
                mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                mdm mdmVar = ((kq50) mq50Var).f18704a;
                boolean z7 = i3 == 2048;
                Object objP3 = fetVar2.P();
                if (z7 || objP3 == cl5Var) {
                    objP3 = new w250(function1, (byte) 18);
                    fetVar2.o0(objP3);
                }
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar2, 0, 4);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 5, i, (Object) mm40Var, (Object) str, (Object) mq50Var, (Object) function1);
        }
    }

    public static final void r(hn8 hn8Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(698981474);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hn8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (hn8Var.f13337a) {
            fetVar.e0(1355794316);
            mtl mtlVar = hn8Var.b;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rpa0(function1, b2);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            y860.n(null, mtlVar, lh80VarU, (Function1) objP, fetVar2, 1);
            fetVar2.r(false);
        } else {
            fetVar2 = fetVar;
            fetVar2.e0(1356244064);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sdb(hn8Var, function1, i, b2);
        }
    }

    public static final void s(mm40 mm40Var, kra0 kra0Var, hn8 hn8Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(-692818372);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kra0Var) ? 32 : 16) | (fetVar.g(hn8Var) ? 256 : 128) | (fetVar.g(zczVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
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
            if (kra0Var instanceof jra0) {
                fetVar.e0(-1038245837);
                v(0, fetVar, null);
                fetVar.r(false);
            } else if (kra0Var instanceof gra0) {
                fetVar.e0(-1038242753);
                gra0 gra0Var = (gra0) kra0Var;
                int i3 = i2 << 3;
                y860.K(null, gra0Var, gra0Var.f11770a, hn8Var.f13337a, zczVar, function1, fetVar, (i2 & 112) | (57344 & i3) | (i3 & 458752));
                fetVar.r(false);
            } else if (kra0Var instanceof hra0) {
                fetVar.e0(-1038230440);
                t(null, ((hra0) kra0Var).f13521a, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(kra0Var instanceof ira0)) {
                    throw b1j.f(-1038247689, fetVar, false);
                }
                fetVar.e0(-1038224949);
                u(null, ((ira0) kra0Var).f15247a, function1, fetVar, (i2 >> 6) & 896);
                fetVar.r(false);
            }
            fetVar.r(true);
            r(hn8Var, function1, fetVar, ((i2 >> 6) & 14) | ((i2 >> 9) & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) kra0Var, (Object) hn8Var, (Object) zczVar, function1, i, (byte) 20);
        }
    }

    public static final void t(mm40 mm40Var, mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1920414036);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        byte b2 = 1;
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
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i, b2);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-26570175);
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
                objP = new i0a0(function1, (byte) 25);
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
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i, (byte) 25);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-381463813);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            B(54, fetVar);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 5);
        }
    }

    public static final void w(kkg0 kkg0Var, fet fetVar, int i) {
        h4d h4dVar;
        fetVar.g0(-1802945396);
        byte b2 = 2;
        int i2 = (fetVar.g(kkg0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                g4d g4dVar = new g4d(fArrA);
                fetVar.o0(g4dVar);
                objP = g4dVar;
            }
            float[] fArr = ((g4d) objP).f10660a;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 28.0f), vgg0.a(8.0f));
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, jM125getWhite100d7_KjU, ljcVar);
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
            o0x o0xVar = kkg0Var.f18438a;
            boolean z = kkg0Var.c;
            Object objA = o0xVar.a();
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            pge pgeVar = gqw0.B;
            if (z) {
                h4dVar = null;
            } else {
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArr));
                h4dVar2.b = fArr;
                h4dVar = h4dVar2;
            }
            k7x.a(objA, null, mm40VarN, pgeVar, h4dVar, fetVar, 1572912, 1720);
            if (z) {
                fetVar.e0(-572232804);
                fetVar.r(false);
            } else {
                fetVar.e0(-572453834);
                qxw.o(fetVar, i120.Q(lgb.J(o7k0.c, vgg0.a(8.0f)), staticColors.m71getBlack300d7_KjU(), ljcVar));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lkg0(kkg0Var, i, b2);
        }
    }

    public static final void x(kkg0 kkg0Var, fet fetVar, int i) {
        fetVar.g0(2081899256);
        int i2 = (fetVar.g(kkg0Var) ? 4 : 2) | i;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.p(jm40.b, 58.0f, 36.0f), vgg0.a(12.0f));
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            mm40 mm40VarJ2 = s5x0.J(i120.S(mm40VarJ, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ2);
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
            int i3 = i2 & 14;
            w(kkg0Var, fetVar, i3);
            A(kkg0Var, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lkg0(kkg0Var, i, b2);
        }
    }

    public static final void y(String str, a4x a4xVar, fet fetVar, int i) {
        fetVar.g0(1004059781);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            zdx.m(str, fetVar, i2 & 14);
            fetVar.e0(1797634813);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                x((kkg0) it.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new djg0(str, a4xVar, i, b2);
        }
    }

    public static final void z(x7z x7zVar, a4x a4xVar, xcz xczVar, boolean z, fet fetVar, int i) {
        a4xVar.getClass();
        xczVar.getClass();
        fetVar.g0(773276341);
        int i2 = i | (fetVar.g(x7zVar) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new gne(gqw0.o, (byte) 12));
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ij90((Object) a4xVar, z, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.f(x7zVar, xczVar, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | ((i2 >> 3) & 112), 492);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(x7zVar, a4xVar, xczVar, z, i);
        }
    }
}
