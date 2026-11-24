package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.provider.Settings;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.Window;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f11720a = new ugd(-1206404827, false, new bhd(0));
    public static final ugd b = new ugd(-1217957624, false, new bhd(27));
    public static final ugd c = new ugd(-826462350, false, new lhd(3));
    public static final ugd d = new ugd(-1384446413, false, new lhd(7));
    public static final ugd e = new ugd(-1942430476, false, new lhd(11));
    public static final ugd f = new ugd(-1127827643, false, new qhd(6));
    public static final v0h0 g = new v0h0(new w0h0(11), new x0h0(4));
    public static final v0h0 h = new v0h0(new w0h0(12), new x0h0(5));
    public static final v0h0 i = new v0h0(new w0h0(13), new x0h0(6));
    public static final v0h0 j = new v0h0(new w0h0(14), new x0h0(7));
    public static final v0h0 k = new v0h0(new w0h0(15), new x0h0(8));

    public static final void A(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1923165845);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n(l7m0Var, function1, fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 7);
        }
    }

    public static final void B(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        fetVar.g0(-1184589361);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(hh80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            voz vozVar = (voz) l7m0Var2.getValue();
            vozVar.getClass();
            fetVar.e0(1644833939);
            fetVar.r(false);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, hh80Var.d(), 0.0f, 0.0f, 13);
            boolean zG = ((i3 & 14) == 4) | fetVar.g(vozVar) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new k9v((Object) vozVar, (Object) hh80Var, (Object) function1, (byte) 15);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void C(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-514250940);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            p3c0.a(o7k0.n(mm40Var2, 48.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0.0f, 0L, 0, 0.0f, fetVar, 0, 60);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, (byte) 5);
        }
    }

    public static final void D(int i2, fet fetVar) {
        fetVar.g0(-352069980);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(s5x0.N(n0qVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar, 6, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13)), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13)), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuq(i2, b2);
        }
    }

    public static final void E(int i2, fet fetVar) {
        fetVar.g0(-1426190700);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
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
            knm0.b(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            knm0.b(s6t0.b().f33626a.getBackgroundContent(), fqj0VarD0, fetVar, 0);
            knm0.b(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            knm0.b(s6t0.b().f33626a.getBackgroundContent(), fqj0VarD0, fetVar, 0);
            knm0.b(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i2, (byte) 9);
        }
    }

    public static final void F(mm40 mm40Var, String str, Function0 function0, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        mm40 mm40Var2;
        fetVar.g0(-1411401492);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            long secondary = s6t0.b().f33626a.getSecondary();
            hlm.c(null, new imm(new ilm(secondary), new plm(str, ha50.THREE_LINES, secondary, fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 3) & 7168, 0, 4085);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, 6);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 4, i2, mm40Var2, str, function0, ugdVar2);
        }
    }

    public static final void G(String str, Function0 function0, Function0 function1, mm40 mm40Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(966101970);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | 3072;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ha50.THREE_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new a2z(function1, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean z2 = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new r3w(function0, (byte) 15);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar, null, function2, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 805306374, 54, 468);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 7, i2, (Object) str, (Object) function0, (Object) function1, (Object) mm40Var2);
        }
    }

    public static final void H(Fragment fragment, l7m0 l7m0Var, w2d w2dVar, boolean z, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1568067783);
        int i3 = (fetVar.i(function1) ? 16384 : 8192) | i2 | (fetVar.i(fragment) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(w2dVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            v2n0.b(o7k0.c, w2dVar, 0L, 0.0f, u1c.M(-292689884, new vv50(w2dVar, function1, l7m0Var), fetVar), u1c.M(256910048, new wv50(w2dVar, fragment, z, function1, l7m0Var), fetVar), fetVar, ((i3 >> 3) & 112) | 224326, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 27, i2, (wdr) function1, (Object) fragment, (Object) l7m0Var, (Object) w2dVar, z);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: a.fet
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
    /* JADX WARN: Failed to set immutable type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void I(aw50 aw50Var, Fragment fragment, boolean z, Function1 function1, Function0 function0, Function0 function2, Function1 function3, fet fetVar, int i2) {
        fet fetVar2;
        jm40 jm40Var;
        jr8 jr8Var;
        float f2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(-1715673120);
        int i3 = i2 | (fetVar4.g(aw50Var) ? 4 : 2) | (fetVar4.i(fragment) ? 32 : 16) | (fetVar4.h(z) ? 256 : 128) | (fetVar4.i(function1) ? 2048 : 1024) | (fetVar4.i(function0) ? 16384 : 8192) | (fetVar4.i(function2) ? 131072 : 65536) | (fetVar4.i(function3) ? 1048576 : 524288);
        byte b2 = 1;
        if (fetVar4.U(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = aw50Var.g;
            rv50 rv50Var = aw50Var.h;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object objP = fetVar4.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new pu50(aw50Var, b2);
                fetVar4.o0(objP);
            }
            kwj kwjVarB = zk80.b(i4, (Function0) objP, fetVar4, 0, 2);
            w6k w6kVar = (w6k) fetVar4.k(bmd.h);
            Object objP2 = fetVar4.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(rv50Var);
                fetVar4.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            qv50 qv50Var = qv50.d;
            boolean zEquals = rv50Var.equals(qv50Var);
            boolean z3 = !zEquals;
            boolean zIsEmpty = aw50Var.j.f22376a.isEmpty();
            boolean z4 = !zIsEmpty;
            Object objP3 = fetVar4.P();
            if (objP3 == obj) {
                zcl zclVar = qmk.f28987a;
                objP3 = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar4.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar4.P();
            if (objP4 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP4 = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar4.o0(objP4);
            }
            pz40 pz40Var3 = (pz40) objP4;
            zcl zclVar3 = qmk.f28987a;
            float f3 = z ? 56.0f : 0.0f;
            ycl yclVar = new ycl(!zEquals ? ((ycl) pz40Var2.getValue()).f42389a : 0.0f);
            if (!zIsEmpty) {
                f3 += ((ycl) pz40Var3.getValue()).f42389a;
            }
            float f4 = ((ycl) idd.d(yclVar, new ycl(f3))).f42389a;
            if (!rv50Var.equals(qv50Var)) {
                pz40Var.setValue(rv50Var);
            }
            Integer numValueOf = Integer.valueOf(kwjVarB.k());
            Boolean boolValueOf = Boolean.valueOf(kwjVarB.k.a());
            boolean zG = ((i3 & 7168) == 2048) | fetVar4.g(kwjVarB);
            Object objP5 = fetVar4.P();
            yje yjeVar = null;
            if (zG || objP5 == obj) {
                objP5 = new fc30(kwjVarB, function1, yjeVar, (byte) 2);
                fetVar4.o0(objP5);
            }
            m0x0.v(numValueOf, boolValueOf, (Function2) objP5, fetVar4);
            Integer numValueOf2 = Integer.valueOf(aw50Var.g);
            boolean zG2 = fetVar4.g(kwjVarB) | (i5 == 4);
            Object objP6 = fetVar4.P();
            if (zG2 || objP6 == obj) {
                objP6 = new j940(kwjVarB, aw50Var, yjeVar, (byte) 15);
                fetVar4.o0(objP6);
            }
            m0x0.t(fetVar4, numValueOf2, (Function2) objP6);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar4, jm40Var2);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z5 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf3, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(jm40Var2, 1.0f), 40.0f), ((CustomColors) fetVar4.k(gxf.f12075a)).m44getNewsShadowStart0d7_KjU(), jd8.n);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var2 = jr8.f16991a;
            qxw.o(fetVar4, jr8Var2.b(mm40VarQ, zx7Var));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var2);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            if (aw50Var.e.size() > 1) {
                fetVar4.e0(629350973);
                long backgroundContent = ((ThemeColors) fetVar4.k(zaq0.b)).getBackgroundContent();
                boolean z6 = aw50Var.f;
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                f2 = 0.0f;
                hxm0.c(aw50Var.g, i120.Q(jm40Var2, backgroundContent, vgg0.c(!z6 ? 16.0f : 0.0f, z6 ? 0.0f : 16.0f, 0.0f, 0.0f, 12)), y3d.f, 0L, 12.0f, u1c.M(381601033, new p0z((Object) aw50Var, (byte) 20), fetVar4), null, u1c.M(1781912329, new jt50(aw50Var, function1, (byte) 2), fetVar4), fetVar, 12779904);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                f2 = 0.0f;
                fetVar4.e0(631303198);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            q5x.e(kwjVarB, o7k0.c, s5x0.u(f2, f2, f2, f4, 7), null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(584859907, new ec30(aw50Var, fragment, (byte) 2), fetVar3), fetVar, 48, 24576, 16376);
            fetVar.r(r3);
            zx7 zx7Var2 = gqw0.h;
            jm40 jm40Var3 = jm40Var;
            fet fetVar6 = fetVar;
            b34.h(z3, jr8Var.b(jm40Var3, zx7Var2), kzn.d(null, f2, 3), kzn.e(null, 3), null, u1c.M(-268616126, new hgs0(pz40Var, w6kVar, function0, function2, pz40Var2, (byte) 10), fetVar), fetVar6, 200064, 16);
            mm40 mm40VarB = jr8Var.b(jm40Var3, zx7Var2);
            Object objP7 = fetVar6.P();
            byte b3 = 19;
            if (objP7 == obj) {
                objP7 = new or3(b3);
                fetVar6.o0(objP7);
            }
            pzn pznVarA = kzn.k(null, (Function1) objP7, r3).a(kzn.d(null, 0.3f, r3));
            Object objP8 = fetVar6.P();
            if (objP8 == obj) {
                objP8 = new or3(b3);
                fetVar6.o0(objP8);
            }
            b34.h(z4, mm40VarB, pznVarA, kzn.m((Function1) objP8).a(kzn.e(null, r3)), null, u1c.M(629411307, new wv50(aw50Var, z, w6kVar, function3, pz40Var3), fetVar6), fetVar6, 200064, 16);
            fetVar6.r(true);
            fetVar2 = fetVar6;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(aw50Var, fragment, z, function1, function0, function2, function3, i2);
        }
    }

    public static final void J(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1651743904);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 52.0f, 0.0f, 2);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarG, s6t0.b().f33626a.getBackground(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            v8q0.a(rsm0.w(R.string.season_header, 0, fetVar2), zhg0Var.a(0.2f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            v8q0.a(rsm0.w(R.string.statistic_shooting, 0, fetVar), zhg0Var.a(0.28f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            v8q0.a(rsm0.w(R.string.statistic_lying, 0, fetVar), zhg0Var.a(0.16f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            v8q0.a(rsm0.w(R.string.statistic_standing, 0, fetVar), zhg0Var.a(0.16f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            v8q0.a(rsm0.w(R.string.statistic_skiing, 0, fetVar), zhg0Var.a(0.2f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i2, (byte) 10);
        }
    }

    public static final void K(nmv0 nmv0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1556762325);
        int i3 = i2 | (fetVar2.g(nmv0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.g(mm40VarD, 52.0f, 0.0f, 2), nmv0Var.f23791a, jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.2f, jm40Var, true);
            String str = nmv0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarA, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(nmv0Var.c, zhg0Var.a(0.28f, jm40Var, true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(nmv0Var.d, zhg0Var.a(0.16f, jm40Var, true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(nmv0Var.e, zhg0Var.a(0.16f, jm40Var, true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(nmv0Var.f, zhg0Var.a(0.2f, jm40Var, true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ggt0(nmv0Var, i2, (byte) 25);
        }
    }

    public static final void L(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function3 = function1;
        l7m0Var.getClass();
        fetVar.g0(-1817183802);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function3) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 896;
            boolean z = ((i3 & 112) == 32) | (i4 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new gee(function3, l7m0Var);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wta0(function3, (byte) 2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            x2b0 x2b0Var = (x2b0) l7m0Var.getValue();
            if (x2b0Var != null) {
                if (x2b0Var instanceof v2b0) {
                    fetVar.e0(201905149);
                    M(null, (v2b0) x2b0Var, function1, function2, fetVar, i3 & 8064);
                    function3 = function1;
                    fetVar.r(false);
                } else if (x2b0Var instanceof w2b0) {
                    fetVar.e0(202187218);
                    N(null, (w2b0) x2b0Var, function3, fetVar, i4);
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(-270584452, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 28, i2, (Object) mm40Var2, (Object) l7m0Var, (Object) function3, (Object) function2);
        }
    }

    public static final void M(mm40 mm40Var, v2b0 v2b0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1774914751);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(v2b0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            Object obj2 = (vne) objP;
            boolean zI = ((i3 & 7168) == 2048) | fetVar.i(obj2) | fetVar.g(xczVarA);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zI || objP2 == obj) {
                Object khxVar = new khx(function2, obj2, xczVarA, yjeVar, (byte) 29);
                fetVar.o0(khxVar);
                objP2 = khxVar;
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP2);
            mm40 mm40VarE0 = o2e.e0(cjx.V(o7k0.c, x0x.a0(fetVar), yjeVar), "POPULAR_AGGREGATOR_TAB_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean z = (i3 & 112) == 32;
            int i4 = i3 & 896;
            boolean z2 = z | (i4 == 256);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new zga0((Object) v2b0Var, (Object) function1, (byte) 10);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP3, fetVar, 0, Response.SERVER_TIMEOUT);
            Unit unit = Unit.f46060a;
            boolean z3 = i4 == 256;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new p2b0(function1, null, (byte) 0);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, unit, (Function2) objP4);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(mm40Var2, (Object) v2b0Var, function1, function2, i2, (byte) 2);
        }
    }

    public static final void N(mm40 mm40Var, w2b0 w2b0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(2094767564);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(w2b0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            mdm mdmVar = w2b0Var.f38439a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 3);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
            Unit unit = Unit.f46060a;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new p2b0(function1, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, w2b0Var, function1, i2, (byte) 13);
        }
    }

    public static final void O(mm40 mm40Var, ArrayList arrayList, skb0 skb0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        float f2;
        fetVar.g0(-1235670930);
        int i3 = i2 | 6 | (fetVar.g(arrayList) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(skb0Var == null ? -1 : skb0Var.ordinal()) ? 256 : 128;
        }
        int i4 = i3 | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            float f3 = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            boolean zF = fetVar.f(jB) | fetVar.d(f3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zF || objP == obj) {
                objP = new ujv0(((int) (jB >> 32)) / f3, ((int) (jB & 4294967295L)) / f3);
                fetVar.o0(objP);
            }
            ujv0 ujv0Var = (ujv0) objP;
            boolean zG = fetVar.g(ujv0Var);
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (zG || objP2 == obj) {
                zcl zclVar = qmk.f28987a;
                ujv0Var.getClass();
                boolean zA = ujv0Var.a(Response.BUSY_EVERYWHERE);
                int i5 = ujv0Var.f35801a;
                if (zA) {
                    f2 = ((ycl) idd.e(new ycl(i5 * 0.9f), new ycl(400.0f))).f42389a;
                } else {
                    f2 = ujv0Var.a(360) ? ((ycl) idd.e(new ycl(i5 * 0.9f), new ycl(370.0f))).f42389a : ((ycl) idd.e(new ycl(i5 * 0.9f), new ycl(324.0f))).f42389a;
                }
                objP2 = o7k0.s(jm40Var, f2);
                fetVar.o0(objP2);
            }
            Object obj2 = (mm40) objP2;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), "SPORTS_TAB_GAME_LAZY_ROW");
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            boolean zG2 = ((i4 & 112) == 32) | fetVar.g(obj2) | ((i4 & 896) == 256) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                Object cw6Var = new cw6((Object) arrayList, obj2, (Object) skb0Var, (Object) function1, z, (byte) 9);
                fetVar.o0(cw6Var);
                objP3 = cw6Var;
            }
            b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, 490);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iln0((byte) 1, i2, mm40Var2, arrayList, skb0Var, function1, z);
        }
    }

    public static final void P(mm40 mm40Var, lcb0 lcb0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-213171196);
        int i3 = i2 | 6 | (fetVar.g(lcb0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            hjm hjmVar = lcb0Var.c;
            boolean z = false;
            kjm kjmVar = kjm.f18392a;
            boolean z2 = (i3 & 896) == 256;
            if ((i3 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yip0((Object) function1, (Object) lcb0Var, (byte) 20);
                fetVar.o0(objP);
            }
            nkb.h(mm40VarL, hjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, lcb0Var, function1, i2, (byte) 28);
        }
    }

    public static final void Q(mm40 mm40Var, List list, skb0 skb0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1955015794);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(skb0Var == null ? -1 : skb0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            byte b2 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            rdo0 rdo0Var = (rdo0) fetVar.k(sdo0.f32043a);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(rdo0Var);
            Object objP = fetVar.P();
            yje yjeVar = null;
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new fkg(xczVarA, rdo0Var, yjeVar, b2);
                fetVar.o0(objP);
            }
            pvm0.e((Function2) objP, fetVar, 0);
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean zG2 = (i4 == 256) | fetVar.g(xczVarA) | (i5 == 32 || ((i3 & 64) != 0 && fetVar.i(list)));
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new kpb0(skb0Var, xczVarA, list, (yje) null);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, skb0Var, (Function2) objP2);
            mm40 mm40VarE0 = o2e.e0(mm40Var.e(o7k0.c), "SPORT_POPULAR_LAZY_COLUMN");
            boolean z = skb0Var == null;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z2 = (i5 == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | (i4 == 256) | ((i3 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new nej0((Object) list, (Object) skb0Var, (Object) function1, (byte) 28);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarG, null, null, null, z, null, (Function1) objP3, fetVar, 0, 376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 15, i2, (Object) mm40Var, (Object) list, (Object) skb0Var, (Object) function1);
        }
    }

    public static final void R(fop0 fop0Var, int i2, Function1 function1, ugd ugdVar, fet fetVar, int i3) {
        int i4;
        fet fetVar2;
        fetVar.g0(-1398706376);
        int i5 = i3 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i5 == 0) {
            i4 = (fetVar.g(y5dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(fop0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).c;
            float f3 = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, f2, 4.0f, f3, 0.0f, 8);
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
            hfm0.n(fop0Var, i2, function1, fetVar, (i4 >> 3) & 1022);
            fetVar.r(true);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 16.0f, 32.0f);
            String strW = rsm0.w(R.string.no_available_bets_hint, 0, fetVar);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(strW, mm40VarK, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.t(g1t0.n(), fetVar), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            ugdVar.F(s5x0.L(o7k0.d(y5dVar.b(jm40Var, true), 1.0f), qmk.a(fetVar2).c, 0.0f, 2), fetVar2, Integer.valueOf((i4 >> 9) & 112));
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) fop0Var, i2, (Object) function1, ugdVar, i3, (byte) 0);
        }
    }

    public static final void S(mm40 mm40Var, sok0 sok0Var, Function1 function1, fet fetVar, int i2) {
        Object obj;
        fet fetVar2 = fetVar;
        fetVar2.g0(226349686);
        int i3 = i2 | 6 | (fetVar2.g(sok0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = sok0Var.f32547a;
            int i4 = sok0Var.b;
            int size = arrayList.size();
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (size == 1) {
                fetVar2.e0(85034224);
                upk0 upk0Var = (upk0) CollectionsKt.U(sok0Var.f32547a);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(s5x0.N(mm40VarL, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f);
                gy30 gy30Var = upk0Var.c;
                boolean zG = fetVar2.g(upk0Var) | ((i3 & 896) == 256);
                Object objP = fetVar2.P();
                if (zG || objP == cl5Var) {
                    objP = new yip0((Object) function1, (Object) upk0Var, (byte) 22);
                    fetVar2.o0(objP);
                }
                jiq0.y(mm40VarD, gy30Var, (Function0) objP, null, null, fetVar2, 0, 24);
                fetVar2.r(false);
                fetVar2 = fetVar2;
            } else {
                fetVar2.e0(85533045);
                ycl yclVar = new ycl(((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp * 0.9f);
                zcl zclVar2 = qmk.f28987a;
                float f2 = ((ycl) idd.e(yclVar, new ycl(400.0f))).f42389a;
                ngv ngvVar = new ngv(i4);
                mm40 mm40VarD2 = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 66.0f * i4), 1.0f);
                byte b2 = 14;
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
                qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
                lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
                boolean zD = ((i3 & 112) == 32) | fetVar2.d(f2) | ((i3 & 896) == 256);
                Object objP2 = fetVar2.P();
                if (zD || objP2 == cl5Var) {
                    objP2 = new ny2((Object) sok0Var, f2, (Object) function1, (byte) 20);
                    fetVar2.o0(objP2);
                }
                fetVar2 = fetVar2;
                g8x.h(ngvVar, mm40VarD2, null, lh80VarT, qw3Var, qw3Var2, null, false, null, (Function1) objP2, fetVar2, 0, 0, 916);
                fetVar2.r(false);
            }
            obj = jm40Var;
        } else {
            fetVar2.X();
            obj = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(obj, sok0Var, function1, i2, (byte) 1);
        }
    }

    public static final void T(mm40 mm40Var, olw olwVar, skb0 skb0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        xdr xdrVar;
        fetVar.g0(1299192116);
        int i3 = i2 | 6 | (fetVar.g(olwVar) ? 32 : 16) | (fetVar.e(skb0Var == null ? -1 : skb0Var.ordinal()) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            tsm tsmVar = olwVar.f25477a;
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object objP = fetVar.P();
            byte b2 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xar0(function1, b2);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new sbr0(function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i4 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new sbr0(function1, (byte) 4);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            if (skb0Var == skb0.ShowSports) {
                fetVar.e0(-2012103291);
                boolean z4 = ((i3 & 112) == 32) | (i4 == 2048);
                Object objP4 = fetVar.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new nhl0(function1, olwVar, (byte) 25);
                    fetVar.o0(objP4);
                }
                xdrVar = (xdr) objP4;
                fetVar.r(false);
            } else {
                fetVar.e0(-2009965934);
                fetVar.r(false);
                xdrVar = null;
            }
            hic.m(mm40VarN, tsmVar, function2, function0, function3, xdrVar, fetVar, 0, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 18, i2, mm40Var2, olwVar, skb0Var, function1);
        }
    }

    public static final void U(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1814770251);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String title = ((xxl0) l7m0Var.getValue()).getTitle();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            byte b2 = 13;
            if (z || objP == ukd.f35823a) {
                objP = new yhl0(function1, b2);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            F(null, title, (Function0) objP, u1c.M(-1558253436, new u7i0(l7m0Var, function1, b2), fetVar), fetVar2, 3072);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 14);
        }
    }

    public static final void V(kpm kpmVar, List list, boolean z, fet fetVar, int i2) {
        fetVar.g0(-1999139223);
        int i3 = i2 | (fetVar.g(kpmVar) ? 4 : 2) | (fetVar.g(list) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new r91((Object) list, (Object) kpmVar, z, (byte) 17);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, lh80VarU, null, xx7Var, null, false, null, (Function1) objP, fetVar, 196608, 474);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) kpmVar, (Object) list, z, i2, (byte) 3);
        }
    }

    public static final void W(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1119477509);
        int i3 = i2 | (fetVar2.g(str) ? 32 : 16) | 384;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zx7 zx7Var = gqw0.g;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarB, 16.0f, 4.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            j0x.b(a8k0.F(R.drawable.ic_glyph_checkmark, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 16.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(str2, mm40Var2, i2);
        }
    }

    public static final void X(mm40 mm40Var, llb0 llb0Var, Function1 function1, fet fetVar, int i2) {
        llb0Var.getClass();
        function1.getClass();
        fetVar.g0(662625048);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(llb0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (llb0Var instanceof jlb0) {
            fetVar.e0(593332034);
            ucx.B(mm40Var, (jlb0) llb0Var, fetVar, i3 & 126);
            fetVar.r(false);
        } else if (llb0Var instanceof ilb0) {
            fetVar.e0(593514500);
            ilb0 ilb0Var = (ilb0) llb0Var;
            Q(mm40Var, ilb0Var.b, ilb0Var.f14969a, function1, fetVar, ((i3 << 3) & 7168) | (i3 & 14));
            fetVar.r(false);
        } else if (llb0Var instanceof hlb0) {
            fetVar.e0(593784107);
            s(mm40Var, llb0Var, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!(llb0Var instanceof klb0)) {
                throw b1j.f(1127517180, fetVar, false);
            }
            fetVar.e0(594000363);
            s(mm40Var, llb0Var, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, llb0Var, function1, i2, (byte) 0);
        }
    }

    public static final void Y(int i2, fet fetVar) {
        k3t0 k3t0Var;
        clz clzVar;
        fetVar.g0(1011337406);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            Fragment fragment = (Fragment) fetVar.k(mr00.f22246a);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = a4n0.f(fragment);
                fetVar.o0(objP);
            }
            i1w0 i1w0Var = (i1w0) objP;
            String name = vxi.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP2 = fetVar.P();
            byte b3 = 2;
            if (objP2 == obj) {
                objP2 = new rlb0(application, i1w0Var, b3);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 9);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP3);
            }
            Object obj2 = ((kgd) objP3).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.feed.di.popular.TopPopularSportScreenComponent");
                return;
            }
            vxi vxiVar = (vxi) obj2;
            sgy sgyVarB = sre0.f32672a.b(zco0.class);
            q0h0 q0h0Var = new q0h0((uxi) vxiVar.D.get());
            int i3 = zco0.r0;
            k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            boolean zI = fetVar.i(vxiVar) | fetVar.i(fragment) | fetVar.i(k3t0VarX);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new ck60(vxiVar, fragment, k3t0VarX, (byte) 22);
                fetVar.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            boolean zI2 = fetVar.i(vxiVar) | fetVar.i(fragment);
            Object objP5 = fetVar.P();
            byte b4 = 21;
            if (zI2 || objP5 == obj) {
                objP5 = new yip0(vxiVar, fragment, b4);
                fetVar.o0(objP5);
            }
            v3c.A(function1, (Function0) objP5, null, fetVar, 0, 4);
            boolean zI3 = fetVar.i(fragment) | fetVar.i(vxiVar) | fetVar.i(k3t0VarX);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new nej0((Object) fragment, (Object) vxiVar, (Object) k3t0VarX, (byte) 27);
                fetVar.o0(objP6);
            }
            clz clzVar2 = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP6, fetVar);
            boolean zI4 = fetVar.i(k3t0VarX) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP7 = fetVar.P();
            if (zI4 || objP7 == obj) {
                k3t0Var = k3t0VarX;
                clzVar = clzVar2;
                Object kc70Var = new kc70(k3t0Var, clzVar, pz40VarF, null, (byte) 25);
                fetVar.o0(kc70Var);
                objP7 = kc70Var;
            } else {
                k3t0Var = k3t0VarX;
                clzVar = clzVar2;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP7);
            boolean zI5 = fetVar.i(k3t0Var);
            Object objP8 = fetVar.P();
            if (zI5 || objP8 == obj) {
                objP8 = new s9r0(k3t0Var, b2);
                fetVar.o0(objP8);
            }
            Function0 function2 = (Function0) objP8;
            boolean zI6 = fetVar.i(k3t0Var);
            Object objP9 = fetVar.P();
            if (zI6 || objP9 == obj) {
                objP9 = new s9r0(k3t0Var, b3);
                fetVar.o0(objP9);
            }
            v3c.z(function2, (Function0) objP9, null, fetVar, 0, 4);
            Unit unit = Unit.f46060a;
            boolean zI7 = fetVar.i(k3t0Var);
            Object objP10 = fetVar.P();
            if (zI7 || objP10 == obj) {
                objP10 = new ebh(k3t0Var, (byte) 8);
                fetVar.o0(objP10);
            }
            m0x0.o(unit, (Function1) objP10, fetVar);
            i3t0 i3t0Var = (i3t0) k3t0Var;
            r8x.s(zdx.H(fetVar), u1c.M(940843021, new a6p0(i3t0Var, i3t0Var.y(fetVar), b4), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i2, (byte) 23);
        }
    }

    public static final void Z(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1872644811);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
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
            imm immVarA = ((rmv0) l7m0Var.getValue()).a();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            rmv0 rmv0Var = (rmv0) l7m0Var.getValue();
            if (rmv0Var != null) {
                if (rmv0Var instanceof omv0) {
                    fetVar.e0(-1497926878);
                    o((omv0) rmv0Var, fetVar, 0);
                    fetVar.r(false);
                } else if (rmv0Var instanceof pmv0) {
                    fetVar.e0(-1497923113);
                    x(((pmv0) rmv0Var).b, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (rmv0Var instanceof qmv0) {
                    fetVar.e0(-1497917735);
                    E(0, fetVar);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-1497929629, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 21);
        }
    }

    public static final void a(final mm40 mm40Var, String str, double d2, final String str2, Function0 function0, fet fetVar, final int i2) {
        final String str3;
        final double d3;
        final Function0 function1 = function0;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        function1.getClass();
        fetVar2.g0(827883442);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.c(d2) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 56.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long jM82getDarkBlue100d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m82getDarkBlue100d7_KjU();
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(i120.Q(jm40Var, jM82getDarkBlue100d7_KjU, ugg0Var), 40.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            boolean z2 = false;
            j0x.b(a8k0.F(R.drawable.ic_glyph_wallet_alt, 0, fetVar2), null, o2e.e0(jr8.f16991a.b(jm40Var, zx7Var), "WalletImage"), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                str3 = str;
                d3 = d2;
                objP = new Function1() { // from class: a.me
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        DsAccountInfo dsAccountInfo = new DsAccountInfo(new tje(context, R.style.Widget_DSAccountInfo_Small_WithButton_Right), null);
                        dsAccountInfo.setButtonText(R.string.all_balances);
                        dsAccountInfo.setButtonIconRes(R.drawable.glyph_chevron_right_small);
                        dsAccountInfo.setLabel(str3);
                        pn40 pn40Var = pn40.f27267a;
                        dsAccountInfo.setModel(new ke(pn40.k("", d3), str2));
                        return dsAccountInfo;
                    }
                };
                fetVar2.o0(objP);
            } else {
                str3 = str;
                d3 = d2;
            }
            Function1 function2 = (Function1) objP;
            if ((i3 & 57344) == 16384) {
                z2 = true;
            }
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                function1 = function0;
                objP2 = new y(function1, (byte) 3);
                fetVar2.o0(objP2);
            } else {
                function1 = function0;
            }
            dwi0.b(function2, mm40VarN2, (Function1) objP2, fetVar2, 0, 0);
            fetVar2.r(true);
        } else {
            str3 = str;
            d3 = d2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final String str4 = str3;
            final double d4 = d3;
            yfe0VarU.d = new Function2(str4, d4, str2, function1, i2) { // from class: a.ne
                public final /* synthetic */ String b;
                public final /* synthetic */ double c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    gq80.a(this.f23358a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final u910 a0(fa10 fa10Var, fet fetVar, int i2) {
        fetVar.f0(683659508);
        ea10 ea10Var = ea10.f7448a;
        boolean z = (i2 & 256) == 0;
        float f2 = 1.0f;
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            c99.s("Speed must be a finite number. It is 1.0.");
            return null;
        }
        u910 u910VarU = xww.U(fetVar);
        fetVar.f0(-180606964);
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = androidx.compose.runtime.e.e(true);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.r(false);
        fetVar.f0(-180606834);
        if (!z) {
            Context context = (Context) fetVar.k(dy2.b);
            Matrix matrix = cut0.f5002a;
            f2 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        float f3 = f2;
        fetVar.r(false);
        m0x0.w(new Object[]{fa10Var, true, null, Float.valueOf(f3), Integer.MAX_VALUE}, new f43(u910VarU, fa10Var, f3, pz40Var, null), fetVar);
        fetVar.r(false);
        return u910VarU;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x039e  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(mm40 mm40Var, azh azhVar, final ezh ezhVar, final Function1 function1, final Function1 function2, fet fetVar, int i2) {
        int i3;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        jr8 jr8Var;
        int i4;
        boolean z4;
        Object objP;
        cl5 cl5Var;
        cl5 cl5Var2;
        jm40 jm40Var;
        zx7 zx7Var;
        cl5 cl5Var3;
        shd shdVar;
        float f3;
        int i5;
        int i6;
        boolean z5;
        fet fetVar2 = fetVar;
        zx7 zx7Var2 = gqw0.e;
        fetVar2.g0(907394631);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(azhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar2.g(ezhVar) : fetVar2.i(ezhVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            aik aikVarH0 = h0(fetVar2);
            boolean zE = fetVar2.e(aikVarH0.ordinal());
            Object objP2 = fetVar2.P();
            zyh zyhVar = zyh.f45205a;
            xyh xyhVar = xyh.f41705a;
            cl5 cl5Var4 = ukd.f35823a;
            if (zE || objP2 == cl5Var4) {
                float f4 = 36.0f;
                if (Intrinsics.d(azhVar, xyhVar)) {
                    int iOrdinal = aikVarH0.ordinal();
                    if (iOrdinal == 0) {
                        zcl zclVar = qmk.f28987a;
                        f4 = 22.0f;
                    } else {
                        if (iOrdinal != 1 && iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        zcl zclVar2 = qmk.f28987a;
                    }
                } else {
                    if (!Intrinsics.d(azhVar, zyhVar) && (azhVar instanceof yyh)) {
                        f2 = ((yyh) azhVar).f43465a;
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                    }
                    objP2 = twn.j(f2, fetVar2);
                }
                f2 = f4;
                objP2 = twn.j(f2, fetVar2);
            }
            float f5 = ((ycl) objP2).f42389a;
            aik aikVarH1 = h0(fetVar2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            Object objJ = g1t0.j();
            boolean zE2 = fetVar2.e(aikVarH1.ordinal());
            Object objP3 = fetVar2.P();
            if (zE2 || objP3 == cl5Var4) {
                if (Intrinsics.d(azhVar, xyhVar)) {
                    int iOrdinal2 = aikVarH1.ordinal();
                    if (iOrdinal2 != 0) {
                        z = true;
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return;
                            }
                        }
                    } else {
                        z = true;
                        objJ = y9q0VarD;
                    }
                } else {
                    z = true;
                    objJ = (!Intrinsics.d(azhVar, zyhVar) && (azhVar instanceof yyh)) ? ((yyh) azhVar).b : y9q0VarM;
                }
                fetVar2.o0(objJ);
            } else {
                objJ = objP3;
                z = true;
            }
            y9q0 y9q0Var = (y9q0) objJ;
            mm40 mm40VarE0 = o2e.e0(ny9.O(0.75f, mm40Var, false), "AGGREGATOR_CARD_TALL_CONTENT");
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarE0, backgroundContent, vgg0.a(16.0f));
            int i7 = i3 & 896;
            boolean z6 = ((i3 & 7168) == 2048 ? z : false) | ((i7 == 256 || ((i3 & 512) != 0 && fetVar2.i(ezhVar))) ? z : false);
            Object objP4 = fetVar2.P();
            if (z6 || objP4 == cl5Var4) {
                z2 = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                objP4 = new Function0() { // from class: a.czh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = objArr;
                        ezh ezhVar2 = ezhVar;
                        Function1 function3 = function1;
                        switch (b2) {
                            case 0:
                                function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                break;
                            default:
                                if (function3 != null) {
                                    function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP4);
            } else {
                z2 = false;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP4, 28);
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, z2);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            int i8 = i3;
            j0x.b(lv00.T(ezhVar.c, ezhVar.d, null, null, fetVar2, 0, 12), null, lgb.J(o7k0.c, vgg0.a(16.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40Var2, 1.0f), 6.0f, 6.0f, 6.0f, 0.0f, 8), 24.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar2);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar, shdVar4, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar5, 1.0f, true);
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar2);
            jpm0.o(fetVar, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar, shdVar4, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar5);
            dzh dzhVar = ezhVar.f;
            jr8 jr8Var2 = jr8.f16991a;
            if (dzhVar == null) {
                fetVar.e0(-798552570);
                fetVar.r(false);
                z3 = false;
            } else {
                fetVar.e0(-798552569);
                z3 = false;
                d(o2e.e0(s5x0.N(jr8Var2.b(jm40Var2, gqw0.d), 2.0f, 0.0f, 0.0f, 0.0f, 14), "AGGREGATOR_CARD_TALL_TAG"), dzhVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            Integer num = ezhVar.g;
            if (num == null) {
                fetVar.e0(1842357399);
                fetVar.r(z3);
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                f3 = 1.0f;
                shdVar = shdVar5;
                zx7Var = zx7Var2;
                i6 = i7;
                cl5Var3 = cl5Var4;
                z5 = true;
                i5 = i8;
            } else {
                fetVar.e0(1842357400);
                int iIntValue = num.intValue();
                jr8Var = jr8Var2;
                mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var2, 6.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                zcl zclVar5 = qmk.e;
                mm40 mm40VarQ2 = i120.Q(mm40VarN, jM73getBlack400d7_KjU, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
                boolean z8 = (i8 & 57344) == 16384;
                if (i7 != 256) {
                    i4 = i8;
                    boolean z9 = (i4 & 512) != 0 && fetVar.i(ezhVar);
                    z4 = z8 | z9;
                    objP = fetVar.P();
                    if (z4) {
                        cl5Var = cl5Var4;
                    } else {
                        cl5Var = cl5Var4;
                        if (objP == cl5Var) {
                            cl5Var2 = cl5Var;
                        }
                        mm40 mm40VarE1 = o2e.e0(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP, 28), "AGGREGATOR_CARD_TALL_ACTION_ICON");
                        tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                        int i9 = i4;
                        int iHashCode4 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM4 = fetVar.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE1);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC3, shdVar2);
                        jpm0.o(fetVar, bh90VarM4, shdVar3);
                        vqd.u(iHashCode4, fetVar, shdVar4, fetVar);
                        jpm0.o(fetVar, mm40VarC3, shdVar5);
                        jm40Var = jm40Var2;
                        zx7Var = zx7Var2;
                        cl5Var3 = cl5Var2;
                        shdVar = shdVar5;
                        f3 = 1.0f;
                        i5 = i9;
                        i6 = i7;
                        j0x.b(a8k0.F(iIntValue, 0, fetVar), null, o7k0.n(jm40Var2, 16.0f), null, gqw0.f1, 0.0f, new m78(staticColors.m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
                        z5 = true;
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                    cl5Var2 = cl5Var;
                    final byte b2 = 1;
                    objP = new Function0() { // from class: a.czh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            ezh ezhVar2 = ezhVar;
                            Function1 function3 = function2;
                            switch (b3) {
                                case 0:
                                    function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                    break;
                                default:
                                    if (function3 != null) {
                                        function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                    mm40 mm40VarE2 = o2e.e0(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP, 28), "AGGREGATOR_CARD_TALL_ACTION_ICON");
                    tj30 tj30VarC4 = zq8.c(zx7Var2, false);
                    int i10 = i4;
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC4, shdVar2);
                    jpm0.o(fetVar, bh90VarM5, shdVar3);
                    vqd.u(iHashCode5, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC4, shdVar5);
                    jm40Var = jm40Var2;
                    zx7Var = zx7Var2;
                    cl5Var3 = cl5Var2;
                    shdVar = shdVar5;
                    f3 = 1.0f;
                    i5 = i10;
                    i6 = i7;
                    j0x.b(a8k0.F(iIntValue, 0, fetVar), null, o7k0.n(jm40Var2, 16.0f), null, gqw0.f1, 0.0f, new m78(staticColors.m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
                    z5 = true;
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    i4 = i8;
                }
                z4 = z8 | z9;
                objP = fetVar.P();
                if (z4) {
                    cl5Var = cl5Var4;
                    if (objP == cl5Var) {
                        cl5Var2 = cl5Var;
                    }
                    mm40 mm40VarE3 = o2e.e0(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP, 28), "AGGREGATOR_CARD_TALL_ACTION_ICON");
                    tj30 tj30VarC5 = zq8.c(zx7Var2, false);
                    int i11 = i4;
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarE3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC5, shdVar2);
                    jpm0.o(fetVar, bh90VarM6, shdVar3);
                    vqd.u(iHashCode6, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC5, shdVar5);
                    jm40Var = jm40Var2;
                    zx7Var = zx7Var2;
                    cl5Var3 = cl5Var2;
                    shdVar = shdVar5;
                    f3 = 1.0f;
                    i5 = i11;
                    i6 = i7;
                    j0x.b(a8k0.F(iIntValue, 0, fetVar), null, o7k0.n(jm40Var2, 16.0f), null, gqw0.f1, 0.0f, new m78(staticColors.m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
                    z5 = true;
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    cl5Var = cl5Var4;
                }
                cl5Var2 = cl5Var;
                final byte b3 = 1;
                objP = new Function0() { // from class: a.czh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        ezh ezhVar2 = ezhVar;
                        Function1 function3 = function2;
                        switch (b4) {
                            case 0:
                                function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                break;
                            default:
                                if (function3 != null) {
                                    function3.invoke(Long.valueOf(ezhVar2.f8671a));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
                mm40 mm40VarE4 = o2e.e0(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP, 28), "AGGREGATOR_CARD_TALL_ACTION_ICON");
                tj30 tj30VarC6 = zq8.c(zx7Var2, false);
                int i12 = i4;
                int iHashCode7 = Long.hashCode(fetVar.T);
                bh90 bh90VarM7 = fetVar.m();
                mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarE4);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC6, shdVar2);
                jpm0.o(fetVar, bh90VarM7, shdVar3);
                vqd.u(iHashCode7, fetVar, shdVar4, fetVar);
                jpm0.o(fetVar, mm40VarC6, shdVar5);
                jm40Var = jm40Var2;
                zx7Var = zx7Var2;
                cl5Var3 = cl5Var2;
                shdVar = shdVar5;
                f3 = 1.0f;
                i5 = i12;
                i6 = i7;
                j0x.b(a8k0.F(iIntValue, 0, fetVar), null, o7k0.n(jm40Var2, 16.0f), null, gqw0.f1, 0.0f, new m78(staticColors.m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
                z5 = true;
                fetVar.r(true);
                fetVar.r(false);
            }
            fetVar.r(z5);
            mm40 mm40VarB = jr8Var.b(o7k0.e(o7k0.d(jm40Var, f3), f5), gqw0.h);
            boolean z10 = i6 == 256 || ((i5 & 512) != 0 && fetVar.i(ezhVar));
            Object objP5 = fetVar.P();
            if (z10 || objP5 == cl5Var3) {
                objP5 = new hfg(ezhVar, (byte) 24);
                fetVar.o0(objP5);
            }
            mm40 mm40VarK = rq8.K(mm40VarB, (Function1) objP5);
            tj30 tj30VarC7 = zq8.c(zx7Var3, false);
            int iHashCode8 = Long.hashCode(fetVar.T);
            bh90 bh90VarM8 = fetVar.m();
            mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC7, shdVar2);
            jpm0.o(fetVar, bh90VarM8, shdVar3);
            vqd.u(iHashCode8, fetVar, shdVar4, fetVar);
            jpm0.o(fetVar, mm40VarC7, shdVar);
            v8q0.a(ezhVar.b, o7k0.w(o7k0.d(s5x0.L(jr8Var.b(jm40Var, zx7Var), 8.0f, 0.0f, 2), f3), null, false, 3), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) azhVar, (Object) ezhVar, (Object) function1, (Object) function2, i2, (byte) 13);
        }
    }

    public static final void b0(View view, View view2, View view3, int i2, int i3, int i4) {
        ViewGroupOverlay overlay;
        view2.getClass();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (view3 == null) {
            ViewParent parent = view2.getParent();
            view3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view3 == null) {
                return;
            }
        }
        View view4 = view3;
        ViewGroup viewGroup = view4 instanceof ViewGroup ? (ViewGroup) view4 : null;
        if (viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
            overlay.add(view);
        }
        l0(view, view2, view4, i2, i3, i4);
    }

    public static final void c(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1990698036);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarO = ny9.O(0.75f, o7k0.g(mm40Var, 76.0f, 0.0f, 2), false);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 18);
        }
    }

    public static byte[] c0(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final void d(mm40 mm40Var, dzh dzhVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(347890277);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(dzhVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            long j2 = dzhVar.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(i120.Q(mm40Var, j2, vgg0.a(8.0f)), 18.0f), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            v8q0.a(dzhVar.f6942a, null, dzhVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, dzhVar, i2, (byte) 18);
        }
    }

    public static final mtl d0(ctf0 ctf0Var, boolean z, boolean z2) {
        return new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), z, z2, false), rk.q)));
    }

    public static final void e(mm40 mm40Var, xcz xczVar, pp0 pp0Var, lh80 lh80Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        xcz xczVar2;
        mm40 mm40Var2;
        float fA;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        xczVar.getClass();
        pp0Var.getClass();
        fetVar2.g0(1858693306);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar2.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(pp0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(lh80Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            boolean z3 = pp0Var instanceof np0;
            np0 np0Var = z3 ? (np0) pp0Var : null;
            boolean z4 = np0Var != null && np0Var.b;
            float f2 = lh80Var.c;
            if (z4) {
                fA = s5x0.A(lh80Var, k6zVar);
            } else {
                zcl zclVar = qmk.f28987a;
                fA = 0.0f;
            }
            float f3 = lh80Var.e;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, f2, fA, f3, 1);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40VarN, 48.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (z3) {
                fetVar2.e0(-585317974);
                zx7 zx7Var = gqw0.f;
                jr8 jr8Var = jr8.f16991a;
                mm40 mm40VarA = o7k0.A(jr8Var.b(jm40Var2, zx7Var), null, 3);
                np0 np0Var2 = (np0) pp0Var;
                boolean z5 = np0Var2.b;
                mm40 mm40VarN2 = s5x0.N(mm40VarA, 0.0f, 0.0f, z5 ? 40.0f : 0.0f, 0.0f, 11);
                a4x a4xVar = np0Var2.f23889a.f10362a;
                lh80 lh80VarU = s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, z5 ? 8.0f : s5x0.A(lh80Var, k6zVar), 0.0f, 10);
                boolean z6 = z5 && np0Var2.d;
                int i4 = i3;
                xcz xczVar3 = xczVar2;
                jm40Var = jm40Var2;
                n4c.j(mm40VarN2, xczVar3, a4xVar, lh80VarU, z6, np0Var2.e, function1, fetVar, (i3 & 112) | ((i3 << 3) & 3670016));
                fetVar2 = fetVar;
                if (z5) {
                    fetVar2.e0(-584350681);
                    gkb.j(jr8Var.b(o7k0.s(o7k0.c(jm40Var, 1.0f), 56.0f), zx7Var), mp0.b, np0Var2.d, function0, fetVar2, ((i4 >> 3) & 7168) | 48);
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    fetVar2.e0(-583913426);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                z = true;
            } else {
                jm40Var = jm40Var2;
                if (!(pp0Var instanceof op0)) {
                    throw b1j.f(1089496374, fetVar2, false);
                }
                fetVar2.e0(-583802384);
                yx7 yx7Var = gqw0.k;
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                lh80 lh80VarU2 = s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, s5x0.A(lh80Var, k6zVar), 0.0f, 10);
                Object objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new eo0((byte) 2);
                    fetVar2.o0(objP);
                }
                z = true;
                b8k0.f(null, null, lh80VarU2, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar2, 805502976, 459);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var2, (Object) xczVar, (Object) pp0Var, (Object) lh80Var, (Object) function0, (Object) function1, i2, (byte) 1);
        }
    }

    public static final Integer e0(View view) {
        ColorStateList cardBackgroundColor;
        ColorStateList colorStateList;
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        ki30 ki30Var = background instanceof ki30 ? (ki30) background : null;
        if (ki30Var != null && (colorStateList = ki30Var.b.c) != null) {
            return Integer.valueOf(colorStateList.getDefaultColor());
        }
        Drawable background2 = view.getBackground();
        ColorDrawable colorDrawable = background2 instanceof ColorDrawable ? (ColorDrawable) background2 : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        AtomicLong atomicLong = jmu0.f16783a;
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        Integer numValueOf = backgroundTintList != null ? Integer.valueOf(backgroundTintList.getDefaultColor()) : null;
        if (numValueOf == null) {
            CardView cardView = view instanceof CardView ? (CardView) view : null;
            numValueOf = (cardView == null || (cardBackgroundColor = cardView.getCardBackgroundColor()) == null) ? null : Integer.valueOf(cardBackgroundColor.getDefaultColor());
            if (numValueOf == null) {
                Object parent = view.getParent();
                return e0(parent instanceof View ? (View) parent : null);
            }
        }
        return numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x046c  */
    /* JADX WARN: Code duplicated, block: B:104:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x0529  */
    /* JADX WARN: Code duplicated, block: B:79:0x0301  */
    /* JADX WARN: Code duplicated, block: B:81:0x030b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0329  */
    /* JADX WARN: Code duplicated, block: B:85:0x034c  */
    /* JADX WARN: Code duplicated, block: B:88:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:89:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0452  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r15v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void f(mm40 mm40Var, l7m0 l7m0Var, float f2, fu1 fu1Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        jm40 jm40Var;
        int i4;
        ?? r0;
        ?? r15;
        Object obj;
        pcy pcyVar2;
        shd shdVar4;
        shd shdVar5;
        shd shdVar6;
        pcy pcyVar3;
        boolean z;
        Object objP;
        fmm fmmVar;
        int i5;
        boolean z2;
        l7m0 l7m0Var3;
        boolean zG;
        Object objP2;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        fu1Var.getClass();
        String str = fu1Var.b;
        String str2 = fu1Var.c;
        function0.getClass();
        fetVar2.g0(1732587404);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(fu1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = {l7m0Var.getValue()};
            int i6 = i3 & 112;
            boolean z3 = i6 == 32;
            Object objP3 = fetVar2.P();
            Object obj2 = ukd.f35823a;
            if (z3 || objP3 == obj2) {
                objP3 = new jb(l7m0Var, b2);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.e(mm40Var, (((Number) l7m0Var.getValue()).floatValue() * (-124.0f)) + 180.0f + f2));
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarK, backgroundContent, ljcVar);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int i7 = i3;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar4 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar4);
            } else {
                fetVar2.r0();
            }
            shd shdVar7 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar7);
            shd shdVar8 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar9 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar9);
            jpm0.n(fetVar2);
            shd shdVar10 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar10);
            zx7 zx7Var2 = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jr8Var.b(jm40Var2, zx7Var2), 1.0f), f2 + 148.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar4);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar7);
            jpm0.o(fetVar2, bh90VarM2, shdVar8);
            vqd.u(iHashCode2, fetVar2, shdVar9, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar10);
            a4x a4xVar = fu1Var.d;
            if (str2.length() == 0) {
                fetVar2.e0(1927110041);
                l7m0Var2 = l7m0VarY;
                shdVar3 = shdVar8;
                jm40Var = jm40Var2;
                pcyVar = pcyVar4;
                shdVar2 = shdVar9;
                shdVar = shdVar10;
                j0x.b(a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar2, 25016, 104);
                fetVar2.r(false);
                i4 = i6;
                r0 = 0;
                r15 = fetVar2;
            } else {
                l7m0Var2 = l7m0VarY;
                pcyVar = pcyVar4;
                shdVar = shdVar10;
                shdVar2 = shdVar9;
                shdVar3 = shdVar8;
                jm40Var = jm40Var2;
                fetVar2.e0(1927417809);
                i4 = i6;
                r0 = 0;
                k7x.b(Uri.parse(str2), null, o7k0.c, a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), null, null, null, null, pgeVar, null, fetVar, 299440, 6, 31680);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r15 = fetVar3;
            }
            zq8.a(r0, r15, i120.P(o7k0.e(o7k0.d(r30.b(jm40Var, r26), 1.0f), 64.0f), yk5.o(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(afn0.p(r15).m71getBlack300d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(afn0.p(r15).m121getTransparent0d7_KjU()))}), null, 6));
            byte b3 = 1;
            r15.r(true);
            zx7 zx7Var3 = gqw0.h;
            mm40 mm40VarB = r30.b(jm40Var, zx7Var3);
            int i8 = i4;
            ?? r10 = i8 == 32 ? 1 : r0;
            Object objP4 = r15.P();
            if (r10 == 0) {
                obj = obj2;
                if (objP4 == obj) {
                }
                mm40 mm40VarN = s5x0.N(s5x0.L(i120.Q(lgb.J(o7k0.d(i4w0.T(mm40VarB, (Function1) objP4), 1.0f), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), afn0.m(r15).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, r15, r0);
                int iHashCode3 = Long.hashCode(r15.T);
                bh90 bh90VarM3 = r15.m();
                mm40 mm40VarC2 = kbc.c0(r15, mm40VarN);
                r15.i0();
                if (r15.S) {
                    pcyVar2 = pcyVar;
                    r15.l(pcyVar2);
                } else {
                    pcyVar2 = pcyVar;
                    r15.r0();
                }
                jpm0.o(r15, x5dVarA, shdVar7);
                shdVar4 = shdVar3;
                jpm0.o(r15, bh90VarM3, shdVar4);
                shdVar5 = shdVar2;
                vqd.u(iHashCode3, r15, shdVar5, r15);
                shdVar6 = shdVar;
                jpm0.o(r15, mm40VarC2, shdVar6);
                if (a4xVar.isEmpty()) {
                    r15.e0(-1764021390);
                    r15.r(r0);
                } else {
                    r15.e0(-1764274133);
                    i120.e(r0, r15, a4xVar, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7));
                    r15.r(r0);
                }
                afn0.v(r15).getClass();
                pcyVar3 = pcyVar2;
                Object obj3 = obj;
                v8q0.a(str, null, afn0.m(r15).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.p(), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                mm40 mm40VarB2 = r30.b(jm40Var, zx7Var);
                if (i8 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == obj3) {
                    objP = new yd1(l7m0Var, (byte) 2);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarN2 = s5x0.N(i4w0.T(mm40VarB2, (Function1) objP), 0.0f, f2, 0.0f, 0.0f, 13);
                long jM121getTransparent0d7_KjU = afn0.p(fetVar2).m121getTransparent0d7_KjU();
                jlm jlmVar = jlm.f16723a;
                mlm mlmVar = mlm.f21997a;
                fmmVar = fmm.f9790a;
                i5 = (i7 >> 3) & 7168;
                hlm.c(mm40VarN2, new imm(jlmVar, mlmVar, fmmVar, jM121getTransparent0d7_KjU, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i5, 0, 4084);
                if (((Number) l7m0Var2.getValue()).floatValue() > 0.0f) {
                    fetVar2.e0(1871470971);
                    mm40 mm40VarB3 = jr8Var.b(jm40Var, zx7Var2);
                    l7m0Var3 = l7m0Var2;
                    zG = fetVar2.g(l7m0Var3);
                    objP2 = fetVar2.P();
                    if (zG || objP2 == obj3) {
                        objP2 = new yd1(l7m0Var3, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarQ2 = i120.Q(o7k0.e(o7k0.d(i4w0.T(mm40VarB3, (Function1) objP2), 1.0f), f2 + 56.0f), afn0.m(fetVar2).getBackgroundContent(), ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar3);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar7);
                    jpm0.o(fetVar2, bh90VarM4, shdVar4);
                    vqd.u(iHashCode4, fetVar2, shdVar5, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar6);
                    hlm.c(jr8Var.b(jm40Var, zx7Var3), new imm(new ilm(afn0.m(fetVar2).getSecondary()), new plm(str, afn0.m(fetVar2).getSecondary(), fa50.f9191a), fmmVar, afn0.m(fetVar2).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i5, 0, 4084);
                    z2 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z2 = true;
                    fetVar2.e0(1872794268);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
            } else {
                obj = r24;
            }
            objP4 = new yd1(l7m0Var, b3);
            r15.o0(objP4);
            mm40 mm40VarN3 = s5x0.N(s5x0.L(i120.Q(lgb.J(o7k0.d(i4w0.T(mm40VarB, (Function1) objP4), 1.0f), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), afn0.m(r15).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, r15, r0);
            int iHashCode5 = Long.hashCode(r15.T);
            bh90 bh90VarM5 = r15.m();
            mm40 mm40VarC4 = kbc.c0(r15, mm40VarN3);
            r15.i0();
            if (r15.S) {
                pcyVar2 = pcyVar;
                r15.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                r15.r0();
            }
            jpm0.o(r15, x5dVarA2, shdVar7);
            shdVar4 = shdVar3;
            jpm0.o(r15, bh90VarM5, shdVar4);
            shdVar5 = shdVar2;
            vqd.u(iHashCode5, r15, shdVar5, r15);
            shdVar6 = shdVar;
            jpm0.o(r15, mm40VarC4, shdVar6);
            if (a4xVar.isEmpty()) {
                r15.e0(-1764274133);
                i120.e(r0, r15, a4xVar, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7));
                r15.r(r0);
            } else {
                r15.e0(-1764021390);
                r15.r(r0);
            }
            afn0.v(r15).getClass();
            pcyVar3 = pcyVar2;
            Object obj4 = obj;
            v8q0.a(str, null, afn0.m(r15).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.p(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarB4 = r30.b(jm40Var, zx7Var);
            if (i8 == 32) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                objP = new yd1(l7m0Var, (byte) 2);
                fetVar2.o0(objP);
            } else {
                objP = new yd1(l7m0Var, (byte) 2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarN4 = s5x0.N(i4w0.T(mm40VarB4, (Function1) objP), 0.0f, f2, 0.0f, 0.0f, 13);
            long jM121getTransparent0d7_KjU2 = afn0.p(fetVar2).m121getTransparent0d7_KjU();
            jlm jlmVar2 = jlm.f16723a;
            mlm mlmVar2 = mlm.f21997a;
            fmmVar = fmm.f9790a;
            i5 = (i7 >> 3) & 7168;
            hlm.c(mm40VarN4, new imm(jlmVar2, mlmVar2, fmmVar, jM121getTransparent0d7_KjU2, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i5, 0, 4084);
            if (((Number) l7m0Var2.getValue()).floatValue() > 0.0f) {
                fetVar2.e0(1871470971);
                mm40 mm40VarB5 = jr8Var.b(jm40Var, zx7Var2);
                l7m0Var3 = l7m0Var2;
                zG = fetVar2.g(l7m0Var3);
                objP2 = fetVar2.P();
                if (zG) {
                    objP2 = new yd1(l7m0Var3, (byte) 3);
                    fetVar2.o0(objP2);
                } else {
                    objP2 = new yd1(l7m0Var3, (byte) 3);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarQ3 = i120.Q(o7k0.e(o7k0.d(i4w0.T(mm40VarB5, (Function1) objP2), 1.0f), f2 + 56.0f), afn0.m(fetVar2).getBackgroundContent(), ljcVar);
                tj30 tj30VarC4 = zq8.c(zx7Var, false);
                int iHashCode6 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM6 = fetVar2.m();
                mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarQ3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC4, shdVar7);
                jpm0.o(fetVar2, bh90VarM6, shdVar4);
                vqd.u(iHashCode6, fetVar2, shdVar5, fetVar2);
                jpm0.o(fetVar2, mm40VarC5, shdVar6);
                hlm.c(jr8Var.b(jm40Var, zx7Var3), new imm(new ilm(afn0.m(fetVar2).getSecondary()), new plm(str, afn0.m(fetVar2).getSecondary(), fa50.f9191a), fmmVar, afn0.m(fetVar2).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i5, 0, 4084);
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(1872794268);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, l7m0Var, f2, fu1Var, function0, i2, (byte) 0);
        }
    }

    public static final long f0(Long l, Long l2, Double d2, String str) {
        return str.hashCode() + ((Double.hashCode(d2.doubleValue()) + ((Long.hashCode(l2.longValue()) + (Long.hashCode(l.longValue()) * 31)) * 31)) * 31);
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-278107803);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Unit unit = Unit.f46060a;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = i54.h;
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40Var, unit, (PointerInputEventHandler) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 9);
        }
    }

    public static final int g0(int i2, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ueo) next).f35538a != i2);
        ueo ueoVar = (ueo) next;
        if (ueoVar != null) {
            return ueoVar.c;
        }
        return 0;
    }

    public static final void h(dw50 dw50Var, w2d w2dVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        w2d w2dVar2;
        fet fetVar2;
        fetVar.g0(-757770651);
        int i3 = (fetVar.g(dw50Var) ? 4 : 2) | i2 | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            w2dVar2 = w2dVar;
            fetVar2 = fetVar;
            pzb.c(u1c.M(1993329835, new pi40(dw50Var, (byte) 20), fetVar), w2dVar2, jm40.b, u1c.M(711520648, new dr50((Object) dw50Var, (Object) function0, (Object) function1, (byte) 3), fetVar), fetVar2, 3526 | (i3 & 112), 0);
        } else {
            w2dVar2 = w2dVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50(dw50Var, w2dVar2, function0, function1, i2);
        }
    }

    public static final aik h0(fet fetVar) {
        aik aikVar;
        int i2 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
        boolean zE = fetVar.e(i2);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            if (i2 < 360) {
                aikVar = aik.f927a;
            } else {
                aikVar = i2 < 560 ? aik.b : aik.c;
            }
            objP = aikVar;
            fetVar.o0(objP);
        }
        return (aik) objP;
    }

    public static final void i(int i2, fet fetVar, mm40 mm40Var, String str) {
        byte b2;
        fetVar.g0(565615662);
        int i3 = i2 | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            k7x.b(str, null, mm40Var, a8k0.F(R.drawable.plug_news, 0, fetVar), a8k0.F(R.drawable.plug_news, 0, fetVar), null, null, null, null, null, null, null, fetVar, ((i3 >> 6) & 14) | 37296, 0, 32736);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 40.0f);
            zfn zfnVar = gxf.f12075a;
            b2 = 6;
            qxw.o(fetVar, jr8.f16991a.b(i120.P(mm40VarE, yk5.n(q3d.j(new y3d(((CustomColors) fetVar.k(zfnVar)).m43getNewsShadowEnd0d7_KjU()), new y3d(((CustomColors) fetVar.k(zfnVar)).m44getNewsShadowStart0d7_KjU())), 0.0f, 0.0f, 14), null, 6), gqw0.h));
        } else {
            b2 = 6;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str, i2, b2);
        }
    }

    public static byte[] i0(cg9 cg9Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = cg9Var.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return c0(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j2 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j2 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
            }
        }
        if (cg9Var.read() == -1) {
            return c0(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void j(mm40 mm40Var, l7m0 l7m0Var, int i2, Function1 function1, ugd ugdVar, fet fetVar, int i3) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-2048115355);
        int i4 = i3 | 6 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.e(i2) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            np6 np6Var = (np6) l7m0Var.getValue();
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.c, null, fetVar2, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVarC = np6Var.c();
            int i5 = i4 & 7168;
            boolean z2 = i5 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new to6(function1, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i5 == 2048;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new uo6(function1, b2);
                fetVar2.o0(objP2);
            }
            hlm.c(mm40VarD, immVarC, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 6, 0, 4052);
            fetVar2 = fetVar;
            if (np6Var instanceof lp6) {
                fetVar2.e0(-906575043);
                ro4.j(0, fetVar2);
                fetVar2.r(false);
            } else if (np6Var instanceof kp6) {
                fetVar2.e0(-906572876);
                t(((kp6) np6Var).b, function1, fetVar2, ((i4 >> 3) & 896) | 6);
                fetVar2.r(false);
            } else {
                if (!(np6Var instanceof mp6)) {
                    throw b1j.f(-906576306, fetVar2, false);
                }
                fetVar2.e0(-906567450);
                mp6 mp6Var = (mp6) np6Var;
                fop0 fop0Var = mp6Var.b;
                if (mp6Var.d) {
                    fetVar2.e0(1961198042);
                    z = false;
                    R(fop0Var, i2, function1, ugdVar, fetVar2, (i4 & 896) | 6 | i5 | 24576);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    z = false;
                    fetVar2.e0(1961482839);
                    ffb0.e(null, fop0Var, mp6Var.c, i2, function1, fetVar2, (i4 << 3) & 64512);
                    fetVar2.r(false);
                }
                fetVar2.r(z);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0(mm40Var2, l7m0Var, i2, function1, ugdVar, i3);
        }
    }

    public static final xca j0(l9s l9sVar) {
        Object next;
        Object next2;
        Object next3;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Integer intOrNull4;
        Integer intOrNull5;
        Integer intOrNull6;
        List listP = l9sVar.P();
        ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0.c);
        bno0 bno0Var = (bno0) next;
        Pair pair = new Pair(Integer.valueOf((bno0Var == null || (intOrNull6 = StringsKt.toIntOrNull(bno0Var.c)) == null) ? 0 : intOrNull6.intValue()), Integer.valueOf((bno0Var == null || (intOrNull5 = StringsKt.toIntOrNull(bno0Var.d)) == null) ? 0 : intOrNull5.intValue()));
        List listP2 = l9sVar.P();
        ArrayList arrayList2 = new ArrayList(r3d.q(listP2, 10));
        Iterator it3 = listP2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((cno0) it3.next()).f4666a);
        }
        Iterator it4 = r3d.r(arrayList2).iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((bno0) next2).f2894a != ano0.b);
        bno0 bno0Var2 = (bno0) next2;
        Pair pair2 = new Pair(Integer.valueOf((bno0Var2 == null || (intOrNull4 = StringsKt.toIntOrNull(bno0Var2.c)) == null) ? 0 : intOrNull4.intValue()), Integer.valueOf((bno0Var2 == null || (intOrNull3 = StringsKt.toIntOrNull(bno0Var2.d)) == null) ? 0 : intOrNull3.intValue()));
        List listP3 = l9sVar.P();
        ArrayList arrayList3 = new ArrayList(r3d.q(listP3, 10));
        Iterator it5 = listP3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((cno0) it5.next()).f4666a);
        }
        Iterator it6 = r3d.r(arrayList3).iterator();
        do {
            if (!it6.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it6.next();
        } while (((bno0) next3).f2894a != ano0.d);
        bno0 bno0Var3 = (bno0) next3;
        Integer numValueOf = Integer.valueOf((bno0Var3 == null || (intOrNull2 = StringsKt.toIntOrNull(bno0Var3.c)) == null) ? 0 : intOrNull2.intValue());
        Integer numValueOf2 = Integer.valueOf((bno0Var3 == null || (intOrNull = StringsKt.toIntOrNull(bno0Var3.d)) == null) ? 0 : intOrNull.intValue());
        return new xca(ihm0.l(l9sVar), ((Number) pair.f46059a).intValue(), ((Number) pair2.f46059a).intValue(), numValueOf.intValue(), ((Number) pair.b).intValue(), ((Number) pair2.b).intValue(), numValueOf2.intValue(), l9sVar.G(), l9sVar.v(), l9sVar.y().f21442a, l9sVar.y().d, l9sVar.E(), l9sVar.y().g, l9sVar.y().c, l9sVar.L(), l9sVar.f(), l9sVar.getType() == s9s.f31862a, l9sVar.y().j, l9sVar.t() ? null : l9sVar.D());
    }

    public static final void k(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1292241504);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(i120.Q(qcc.F(mm40Var, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), 1.0f), null, false, 3);
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
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i2, b2);
        }
    }

    public static final Throwable k0(Throwable th) {
        List list;
        i1o i1oVar;
        String message = null;
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        if (zhi0Var == null) {
            return th;
        }
        kuw kuwVar = zhi0Var.c;
        i2o i2oVar = i2o.l1;
        uhi0 uhi0Var = zhi0Var.d;
        if (kuwVar == i2oVar) {
            if (uhi0Var != null) {
                message = uhi0Var.b;
            }
        } else if (uhi0Var != null && (list = uhi0Var.d) != null && (i1oVar = (i1o) CollectionsKt.firstOrNull(list)) != null) {
            message = i1oVar.b;
        }
        if (message == null) {
            message = zhi0Var.getMessage();
        }
        int errorCode = zhi0Var.c.getErrorCode();
        if (message == null) {
            message = "";
        }
        return new cii0(errorCode, message);
    }

    public static final void l(boolean z, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1718618745);
        byte b2 = 2;
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xia0.k(o7k0.d(jm40.b, 1.0f), u1c.M(153689716, new ldc(z, function1, b2), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i2, b2);
        }
    }

    public static final void l0(View view, View view2, View view3, int i2, int i3, int i4) {
        int measuredWidth;
        int bottom;
        int measuredHeight;
        int top;
        int i5;
        view2.getClass();
        if (view3 == null) {
            Object parent = view2.getParent();
            view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                return;
            }
        }
        if (Intrinsics.d(view2.getParent(), view3)) {
            measuredWidth = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3 ? view2.getLeft() - i3 : (view2.getRight() - view.getMeasuredWidth()) + i3;
            if ((i2 & 48) == 48) {
                top = view2.getTop();
                i5 = top - i4;
            } else {
                bottom = view2.getBottom();
                measuredHeight = view.getMeasuredHeight();
                i5 = (bottom - measuredHeight) + i4;
            }
        } else {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view2, rect);
            }
            measuredWidth = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3 ? rect.left - i3 : (rect.right - view.getMeasuredWidth()) + i3;
            if ((i2 & 48) == 48) {
                top = rect.top;
                i5 = top - i4;
            } else {
                bottom = rect.bottom;
                measuredHeight = view.getMeasuredHeight();
                i5 = (bottom - measuredHeight) + i4;
            }
        }
        view.layout(measuredWidth, i5, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + i5);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [a.ghn, a.yj50, a.yje] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final void m(final mm40 mm40Var, final float f2, final rv2 rv2Var, final l7m0 l7m0Var, final long j2, final long j3, long j4, float f3, l7m0 l7m0Var2, final ugd ugdVar, final ugd ugdVar2, final Function2 function2, fet fetVar, final int i2) {
        final long j5;
        final float f4;
        final l7m0 l7m0Var3;
        l7m0 l7m0VarU;
        int i3;
        long j6;
        int i4;
        float f5;
        byte b2;
        Object ys8Var;
        l7m0 l7m0Var4;
        ?? r8;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(793360591);
        int i5 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.d(f2) ? 32 : 16) | (fetVar2.g(rv2Var) ? 256 : 128) | (fetVar2.g(l7m0Var) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192) | (fetVar2.f(j3) ? 131072 : 65536) | (fetVar2.d(16.0f) ? 8388608 : 4194304) | 301989888;
        int i6 = 434 | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                l7m0VarU = g8x.U((View) fetVar2.k(dy2.f), fetVar2, 0);
                i3 = i6 & (-15);
                j6 = j2;
                i4 = i5 & (-2113929217);
                f5 = 16.0f;
            } else {
                fetVar2.X();
                j6 = j4;
                l7m0VarU = l7m0Var2;
                i3 = i6 & (-15);
                i4 = i5 & (-2113929217);
                f5 = f3;
            }
            fetVar2.s();
            fetVar2.b0(-2084623346, new ycl(f2));
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            Activity activity = (Activity) fetVar2.k(cr00.f4820a);
            boolean zR = qem0.r(activity);
            Window window = activity != null ? activity.getWindow() : null;
            float fW0 = w6kVar.w0(f2) + w6kVar.w0(f5);
            Object[] objArr = new Object[0];
            boolean zD = fetVar2.d(fW0);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zD || objP == cl5Var) {
                objP = new rt2(fW0, (byte) 4);
                fetVar2.o0(objP);
            }
            agk0 agk0Var = (agk0) e9x.Q(objArr, (Function0) objP, fetVar2, 0);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new eka(l7m0Var, (byte) 9));
                fetVar2.o0(objP2);
            }
            final l7m0 l7m0Var5 = (l7m0) objP2;
            int i7 = i4 & 7168;
            boolean zI = fetVar2.i(window) | fetVar2.h(zR) | (i7 == 2048);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                b2 = 1;
                objP3 = new lf2(window, zR, l7m0Var, b2);
                fetVar2.o0(objP3);
            } else {
                b2 = 1;
            }
            int i8 = i4;
            byte b3 = b2;
            v3c.z((Function0) objP3, null, null, fetVar2, 0, 6);
            int i9 = (fetVar2.i(window) ? 1 : 0) | (i7 == 2048 ? b3 : (byte) 0) | (fetVar2.h(zR) ? 1 : 0);
            Object objP4 = fetVar2.P();
            if (i9 != 0 || objP4 == cl5Var) {
                l7m0Var4 = l7m0Var;
                yje yjeVar = null;
                ys8Var = new ys8((Object) l7m0Var4, (Object) window, zR, yjeVar, (byte) 1);
                fetVar2.o0(ys8Var);
                r8 = yjeVar;
            } else {
                ys8Var = objP4;
                r8 = 0;
                l7m0Var4 = l7m0Var;
            }
            m0x0.t(fetVar2, l7m0Var4, (Function2) ys8Var);
            Unit unit = Unit.f46060a;
            int i10 = i8 & 896;
            int i11 = (fetVar2.g(agk0Var) ? 1 : 0) | (i10 == 256 ? b3 : (byte) 0);
            Object objP5 = fetVar2.P();
            byte b4 = 3;
            if (i11 != 0 || objP5 == cl5Var) {
                objP5 = new du2(rv2Var, agk0Var, r8, b4);
                fetVar2.o0(objP5);
            }
            m0x0.t(fetVar2, unit, (Function2) objP5);
            int i12 = (fetVar2.g(agk0Var) ? 1 : 0) | (i10 == 256 ? b3 : (byte) 0);
            Object objP6 = fetVar2.P();
            if (i12 != 0 || objP6 == cl5Var) {
                objP6 = new ut2(agk0Var, rv2Var, b4);
                fetVar2.o0(objP6);
            }
            m0x0.o(unit, (Function1) objP6, fetVar2);
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = new w1d(rv2Var);
                fetVar2.o0(objP7);
            }
            w1d w1dVar = (w1d) objP7;
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            ma80 ma80Var = ma80.f21447a;
            uts0 uts0Var = nu2.f24127a;
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var) {
                objP8 = new e6c((byte) 23);
                fetVar2.o0(objP8);
            }
            mm40 mm40VarV = cjx.V(dv2.b(mm40VarE, rv2Var, false, nu2.a(rv2Var, (Function1) objP8, ro4.m0(0, 0, r8, 7), fetVar2, ((i8 >> 6) & 14) | 3504), 48), w1dVar, r8);
            niq niqVar = i120.m;
            ugd ugdVarM = u1c.M(431523377, new zv(ugdVar, l7m0Var4, f5), fetVar2);
            final long j7 = j6;
            final l7m0 l7m0Var6 = l7m0Var4;
            final float f6 = f5;
            int i13 = i8 >> 3;
            l7m0 l7m0Var7 = l7m0VarU;
            u7x.k(mm40VarV, l7m0Var7, niqVar, j2, j3, ugdVarM, u1c.M(694369781, new xdr() { // from class: a.q1d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    hh80 hh80Var = (hh80) obj;
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    hh80Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar3.g(hh80Var) ? 4 : 2;
                    }
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        n0q n0qVar = o7k0.c;
                        ycl yclVar = new ycl(hh80Var.d() - f6);
                        ycl yclVar2 = new ycl(0.0f);
                        if (yclVar.compareTo(yclVar2) < 0) {
                            yclVar = yclVar2;
                        }
                        mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, yclVar.f42389a, 0.0f, 0.0f, 13);
                        l7m0 l7m0Var8 = l7m0Var5;
                        mm40 mm40VarQ = i120.Q(k7n0.H(lgb.J(mm40VarN, vgg0.c(((ycl) l7m0Var8.getValue()).f42389a, ((ycl) l7m0Var8.getValue()).f42389a, 0.0f, 0.0f, 12)), 1.0f), j7, jd8.n);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM = fetVar3.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                        ugdVar2.F(l7m0Var6, fetVar3, 0);
                        fetVar3.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), function2, fetVar2, (i13 & 57344) | (i13 & 7168) | 1769472 | ((i3 << 12) & 29360128));
            fetVar2 = fetVar2;
            fetVar2.r(false);
            l7m0Var3 = l7m0Var7;
            f4 = f6;
            j5 = j7;
        } else {
            fetVar2.X();
            j5 = j4;
            f4 = f3;
            l7m0Var3 = l7m0Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(f2, rv2Var, l7m0Var, j2, j3, j5, f4, l7m0Var3, ugdVar, ugdVar2, function2, i2) { // from class: a.r1d
                public final /* synthetic */ float b;
                public final /* synthetic */ rv2 c;
                public final /* synthetic */ l7m0 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ float h;
                public final /* synthetic */ l7m0 i;
                public final /* synthetic */ ugd j;
                public final /* synthetic */ ugd k;
                public final /* synthetic */ Function2 l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1572865);
                    gq80.m(this.f29673a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m0(Drawable drawable, int i2, int i3) {
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            gradientDrawable.setStroke(i3, i2);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1579812847);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(-2131477299, new x6s(function1, (byte) 7), fetVar), u1c.M(2031166252, new p7y(l7m0Var, function1, (byte) 8), fetVar), null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(493938210, new xs4(l7m0Var, function1, (byte) 28), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void o(omv0 omv0Var, fet fetVar, int i2) {
        fetVar.g0(584746653);
        byte b2 = 2;
        int i3 = (fetVar.g(omv0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gdv0(omv0Var, b2);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ggt0(omv0Var, i2, (byte) 24);
        }
    }

    public static final void p(mm40 mm40Var, gzh gzhVar, azh azhVar, Function1 function1, Function1 function2, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        mm40 mm40Var2;
        Function1 function3;
        gzhVar.getClass();
        fetVar.g0(-1844757232);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | (fetVar.g(gzhVar) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i2 & 384) == 0) {
            i7 |= fetVar.g(azhVar) ? 256 : 128;
        }
        int i9 = i7 | (fetVar.i(function1) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
        } else {
            i5 = i9 | (fetVar.i(function2) ? 16384 : 8192);
        }
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            if (i6 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var3 = mm40Var;
            if (i8 != 0) {
                azhVar = zyh.f45205a;
            }
            Function1 function4 = i10 != 0 ? null : function2;
            if (gzhVar instanceof ezh) {
                fetVar.e0(1009806041);
                b(mm40Var3, azhVar, (ezh) gzhVar, function1, function4, fetVar, (i5 & 14) | ((i5 >> 3) & 112) | ((i5 << 3) & 896) | (i5 & 7168) | (i5 & 57344));
                fetVar.r(false);
            } else {
                if (!gzhVar.equals(fzh.f10407a)) {
                    throw b1j.f(1009804087, fetVar, false);
                }
                fetVar.e0(1009814869);
                c(i5 & 14, fetVar, mm40Var3);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
            function3 = function4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function3 = function2;
        }
        azh azhVar2 = azhVar;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g04(mm40Var2, gzhVar, azhVar2, function1, function3, i2, i3, (byte) 1);
        }
    }

    public static final void q(mm40 mm40Var, gij gijVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1345075546);
        int i3 = i2 | 6 | (fetVar.g(gijVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            ycl yclVar = new ycl(((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp * 0.9f);
            zcl zclVar = qmk.f28987a;
            float f2 = ((ycl) idd.e(yclVar, new ycl(400.0f))).f42389a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), "SPORT_EXPRESS_LAZY_ROW");
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            boolean zD = ((i3 & 112) == 32) | fetVar.d(f2) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new ny2((Object) gijVar, f2, (Object) function1, (byte) 19);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, gijVar, function1, i2, (byte) 29);
        }
    }

    public static final void r(mm40 mm40Var, String str, y9q0 y9q0Var, String str2, boolean z, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(459835995);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(y9q0Var) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z3 = fetVar2.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.h(mm40VarD, 56.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z5 = z3;
            mm40 mm40VarL = s5x0.L(o7k0.c, 8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarU = o7k0.u(s5x0.N(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), 0.0f, 220.0f, 1);
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar2, (i3 >> 3) & 14, ((i3 << 15) & 29360128) | 24960, 110584);
            mm40 mm40VarU2 = o7k0.u(jm40Var, 0.0f, 220.0f, 1);
            thg0 thg0VarA2 = shg0.a(uc9.b, yx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarU2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.j(), 0L, 0L, null, null, null, 0L, null, null, z5 ? 2 : 1, 1, 0L, null, null, 16678911), fetVar2, (i3 >> 9) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(1949301653);
                mm40Var2 = jm40Var;
                z2 = true;
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 8.0f, 0.0f, 2), false, fetVar2, 6, 4);
                fetVar2.r(false);
            } else {
                z2 = true;
                mm40Var2 = jm40Var;
                fetVar2.e0(1949569121);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 9, i2, mm40Var2, (Object) str, (Object) y9q0Var, (Object) str2, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    public static final void s(mm40 mm40Var, llb0 llb0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        mdm mdmVar;
        fetVar.g0(599506336);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(llb0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (llb0Var == null) {
                mdmVar = null;
            } else if (llb0Var instanceof hlb0) {
                mdmVar = ((hlb0) llb0Var).f13251a;
            } else if (llb0Var instanceof klb0) {
                mdmVar = ((klb0) llb0Var).f18479a;
            } else {
                mdmVar = null;
            }
            if (mdmVar != null) {
                fetVar.e0(1419600191);
                mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
                boolean z = (i3 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new sbr0(function1, (byte) 5);
                    fetVar.o0(objP);
                }
                jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1419818338);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, llb0Var, function1, i2, (byte) 9);
        }
    }

    public static final void t(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1262769069);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(y5dVar.b(jm40Var, true), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new to6(function1, b3);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, b2);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-664778193);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jcb.l(mm40Var, mdmVar, false, function0, fetVar, (i3 & 126) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 8);
        }
    }

    public static final void v(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-655048950);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
                objP = new yhl0(function1, (byte) 14);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 27);
        }
    }

    public static final void w(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1704901824);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new z9q(function1, (byte) 11);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i2, (byte) 2);
        }
    }

    public static final void x(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1380044003);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
                objP = new ntu0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i2, (byte) 9);
        }
    }

    public static final void y(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-941246850);
        byte b2 = 16;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ((ruq) l7m0Var.getValue()).getClass();
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_forecast, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarE = ((ruq) l7m0Var.getValue()).e();
            j9m0 j9m0VarD = ((ruq) l7m0Var.getValue()).d();
            boolean zA = ((ruq) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new z9q(function1, (byte) 10);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0VarE, j9m0VarD, zA, (Function0) objP, null, null, u1c.M(-1816143312, new xs4(l7m0Var, function1, (byte) 23), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, b2);
        }
    }

    public static final void z(mm40 mm40Var, int i2, a4x a4xVar, Function1 function1, fet fetVar, int i3) {
        mm40 mm40Var2;
        fetVar.g0(1253439528);
        int i4 = i3 | 6 | (fetVar.e(i2) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            boolean z = (i4 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = twn.j((70.0f * i2) - 4.0f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            ngv ngvVar = new ngv(i2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), f2), 1.0f);
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            boolean zD = ((i4 & 896) == 256) | fetVar.d(66.0f) | ((i4 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                objP2 = new a7j0(a4xVar, function1, (byte) 6);
                fetVar.o0(objP2);
            }
            g8x.h(ngvVar, mm40VarD, null, lh80VarT, qw3Var, qw3Var2, null, false, null, (Function1) objP2, fetVar, 0, 0, 916);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, i2, a4xVar, function1, i3, (byte) 17);
        }
    }
}
