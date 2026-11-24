package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class zgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f44338a = new ugd(-306544072, false, new wgd(26));
    public static final ugd b = new ugd(-1790337411, false, new bhd(18));
    public static final ugd c = new ugd(2147056063, false, new ihd(12));
    public static final ugd d = new ugd(-620175734, false, new lhd(20));
    public static final StackTraceElement[] e = new StackTraceElement[0];
    public static final int[] f = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static final void A(int i, fet fetVar, Function0 function0) {
        int i2;
        fetVar.g0(-1638688441);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarW = o050.W(jm40.b);
            zfn zfnVar = zaq0.b;
            hlm.c(mm40VarW, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.recommended_games, 0, fetVar), ha50.THREE_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i2 << 9) & 7168, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sxf((byte) 2, i, function0);
        }
    }

    public static final void B(mm40 mm40Var, okl oklVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1587615719);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(oklVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                wul wulVar = new wul(nul.e, oe9.c, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, false);
                fetVar2.o0(wulVar);
                objP = wulVar;
            }
            wul wulVar2 = (wul) objP;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE = x7zVar.e(new ecu0(yx7Var));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarE, 0.0f, 0.0f, 16.0f, 0.0f, 11);
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
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            n05 n05Var = new n05(j, j2, j3);
            int i3 = i2;
            String str = oklVar.f;
            y9q0 y9q0VarL = g1t0.l();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            if (oklVar.g.length() > 0) {
                fetVar2.e0(-191535493);
                v8q0.a(oklVar.g, s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), new n05(qmk.p, j, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-190943083);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            qzb.n(o2e.e0(new ecu0(yx7Var), "AGGREGATOR_BONUSES_BUTTON_CARD_STYLE"), wulVar2, function0, fetVar2, (i3 & 896) | 48, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) oklVar, (Object) function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r12v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v7 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v11 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v15 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v16 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v20 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r13v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v22 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v24 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v8 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r5v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v38 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r5v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v39 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r7v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v10 ??, new type: boolean
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void C(a.mm40 r30, a.y9f0 r31, boolean r32, a.rv2 r33, a.cqq r34, kotlin.jvm.functions.Function1 r35, a.fet r36, int r37) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zgc.C(a.mm40, a.y9f0, boolean, a.rv2, a.cqq, kotlin.jvm.functions.Function1, a.fet, int):void");
    }

    public static final void D(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-635957525);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 20;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new x000(l7m0Var, (byte) 19));
                fetVar.o0(objP);
            }
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            fb40 fb40Var = (fb40) ((l7m0) objP).getValue();
            if (Intrinsics.d(fb40Var, db40.f5784a)) {
                fetVar.e0(-709537076);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new x000(l7m0Var, b2));
                    fetVar.o0(objP2);
                }
                E(((i2 << 3) & 896) | 6, fetVar, xczVarA, (l7m0) objP2, function1);
                fetVar.r(false);
            } else {
                if (!(fb40Var instanceof eb40)) {
                    throw b1j.f(-1269816396, fetVar, false);
                }
                fetVar.e0(-709217435);
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
                mdm mdmVar = ((eb40) fb40Var).f7502a;
                boolean z = (i2 & 112) == 32;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new m040(function1, (byte) 14);
                    fetVar.o0(objP3);
                }
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, b2);
        }
    }

    public static final void E(int i, fet fetVar, xcz xczVar, l7m0 l7m0Var, Function1 function1) {
        int i2;
        fetVar.g0(122706051);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), false, null, u1c.M(-637252159, new nc40(function1, b2), fetVar), fetVar, (i2 & 112) | 100663302 | ((i2 << 6) & 896), Response.OK);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyy(l7m0Var, xczVar, function1, i, (byte) 1);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1223931010);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            x7z x7zVar = new x7z(1.0f, true);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, x7zVar, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar2, (i2 >> 3) & 14, 24960, 110584);
            qxw.o(fetVar2, o7k0.s(jm40.b, 16.0f));
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, (i2 >> 6) & 14, 0, 131066);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 25);
        }
    }

    public static final void G(lzp0 lzp0Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        gmm dmmVar;
        long secondary;
        fet fetVar2 = fetVar;
        lzp0Var.getClass();
        function1.getClass();
        fetVar2.g0(20445043);
        int i2 = i | (fetVar2.g(lzp0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 6);
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
            zfn zfnVar = zaq0.b;
            ilm ilmVar = new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary());
            plm plmVar = new plm(rsm0.w(R.string.tennis_summary_title, 0, fetVar2), ha50.TWO_LINES, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50.f9191a);
            int i3 = i2 & 14;
            boolean z = lzp0Var instanceof hzp0;
            if (z) {
                fetVar2.e0(685952271);
                boolean z2 = ((hzp0) lzp0Var).c;
                int i4 = z2 ? R.drawable.ic_filter_active : R.drawable.ic_filter_inactive;
                if (z2) {
                    fetVar2.e0(686496011);
                    secondary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(686574441);
                    secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                    fetVar2.r(false);
                }
                dmmVar = new dmm(new ta50(new wkm(0, i4, true, ra50.f30118a, secondary)));
                fetVar2.r(false);
            } else {
                fetVar2.e0(686702502);
                fetVar2.r(false);
                dmmVar = fmm.f9790a;
            }
            imm immVar = new imm(ilmVar, plmVar, dmmVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
            int i5 = i2 & 112;
            boolean z3 = i5 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new g4p0(function1, (byte) 27);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i5 == 32;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new coo0(function1, (byte) 20);
                fetVar2.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar2, 0, 0, 4053);
            mbc.o(zfi0.f44303a, jm40.b, false, fetVar, 54, 4);
            fetVar2 = fetVar;
            if (lzp0Var instanceof kzp0) {
                fetVar2.e0(139372861);
                osm0.b(0, fetVar2);
                fetVar2.r(false);
                function2 = function1;
            } else if (lzp0Var instanceof jzp0) {
                fetVar2.e0(139480834);
                function2 = function1;
                r(((jzp0) lzp0Var).f17428a, function2, fetVar2, i5);
                fetVar2.r(false);
            } else {
                function2 = function1;
                if (lzp0Var instanceof izp0) {
                    fetVar2.e0(139675018);
                    q(((izp0) lzp0Var).f15646a, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    if (!z) {
                        throw b1j.f(-1796618429, fetVar2, false);
                    }
                    fetVar2.e0(139908727);
                    mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    byte b2 = 7;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7);
                    boolean z5 = i3 == 4;
                    Object objP3 = fetVar2.P();
                    if (z5 || objP3 == cl5Var) {
                        objP3 = new nop0(lzp0Var, b2);
                        fetVar2.o0(objP3);
                    }
                    b8k0.e(mm40VarQ, null, lh80VarU, null, null, null, false, null, (Function1) objP3, fetVar2, 0, 506);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) lzp0Var, (Object) function2, i, (byte) 9);
        }
    }

    public static final void H(g2v g2vVar, esu0 esu0Var, fet fetVar, int i) {
        int i2;
        cl5 cl5Var;
        esu0 esu0Var2 = esu0Var;
        g2vVar.getClass();
        fetVar.g0(-62751013);
        byte b2 = 2;
        int i3 = (fetVar.g(g2vVar) ? 4 : 2) | i | (fetVar.i(esu0Var2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            pz40 pz40VarQ = gkb.Q(esu0Var2.l, null, fetVar, 0, 7);
            int i4 = i3 & 112;
            boolean z = i4 == 32 || fetVar.i(esu0Var2);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z || objP == cl5Var2) {
                i2 = i4;
                cl5Var = cl5Var2;
                avs0 avs0Var = new avs0(0, esu0Var2, esu0.class, "onBackClick", "onBackClick()V", 0, (byte) 7);
                fetVar.o0(avs0Var);
                objP = avs0Var;
            } else {
                i2 = i4;
                cl5Var = cl5Var2;
            }
            jhy jhyVar = (jhy) objP;
            boolean z2 = i2 == 32 || fetVar.i(esu0Var2);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new las0(1, esu0Var2, esu0.class, "onItemClick", "onItemClick(Lorg/xplatform/ui_core/viewcomponents/recycler/adapters/UiItem;)V", 0, (byte) 24);
                fetVar.o0(objP2);
            }
            m((och) pz40VarQ.getValue(), g2vVar, xczVarA, (Function1) ((jhy) objP2), (Function0) jhyVar, fetVar, (i3 << 3) & 112);
        } else {
            esu0Var2 = esu0Var2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(g2vVar, esu0Var2, i, b2);
        }
    }

    public static j04 I() throws InterruptedException {
        y78 y78Var = j04.h;
        j04 j04Var = ((j04[]) y78Var.c)[1];
        if (j04Var == null) {
            long jNanoTime = System.nanoTime();
            j04.k.await(j04.l, TimeUnit.MILLISECONDS);
            if (((j04[]) y78Var.c)[1] != null || System.nanoTime() - jNanoTime < j04.m) {
                return null;
            }
            return j04.i;
        }
        long jNanoTime2 = j04Var.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            j04.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        y78Var.v(j04Var);
        j04Var.e = (byte) 2;
        return j04Var;
    }

    public static final String J(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final int K(psq psqVar, int i) {
        boolean z = psqVar.compareTo(psq.d) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static void L(j04 j04Var) {
        if (j04.i == null) {
            j04.i = new j04();
            i04 i04Var = new i04("Okio Watchdog");
            i04Var.setDaemon(true);
            i04Var.start();
        }
        long jNanoTime = System.nanoTime();
        long j = j04Var.c;
        boolean z = j04Var.f9798a;
        if (j != 0 && z) {
            j04Var.g = Math.min(j, j04Var.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            j04Var.g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            j04Var.g = j04Var.c();
        }
        y78 y78Var = j04.h;
        int i = y78Var.b + 1;
        y78Var.b = i;
        j04[] j04VarArr = (j04[]) y78Var.c;
        if (i == j04VarArr.length) {
            j04[] j04VarArr2 = new j04[i * 2];
            qx3.i(0, 0, 14, j04VarArr, j04VarArr2);
            y78Var.c = j04VarArr2;
        }
        y78Var.r(i, j04Var);
        if (j04Var.f == 1) {
            j04.k.signal();
        }
    }

    public static final boolean M(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static qgk0 O(guo guoVar, boolean z) {
        qgk0 qgk0Var;
        boolean z2;
        long jT;
        int i;
        int i2;
        long j;
        boolean z3;
        int[] iArr;
        long length = guoVar.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i3 = (int) j3;
        fq80 fq80Var = new fq80(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < i3) {
                fq80Var.J(8);
                if (guoVar.b(fq80Var.f9961a, i4, 8, true)) {
                    long jB = fq80Var.B();
                    int iM = fq80Var.m();
                    if (jB == 1) {
                        guoVar.n(fq80Var.f9961a, 8, 8);
                        i = 16;
                        fq80Var.L(16);
                        jT = fq80Var.t();
                    } else {
                        if (jB == 0) {
                            long length2 = guoVar.getLength();
                            if (length2 != j2) {
                                jB = (length2 - guoVar.i()) + 8;
                            }
                        }
                        jT = jB;
                        i = 8;
                    }
                    long j4 = i;
                    if (jT < j4) {
                        qgk0Var = null;
                        if (iM != 1718773093 || i != 8) {
                            return new w04(iM, i, jT);
                        }
                        jT = j4;
                    } else {
                        qgk0Var = null;
                    }
                    int i6 = i5 + i;
                    if (iM == 1836019574 || iM == 1970628964) {
                        i3 += (int) jT;
                        i2 = iM;
                        if (length != -1 && i3 > length) {
                            i3 = (int) length;
                        }
                        if (i2 == 1836019574) {
                            i5 = i6;
                        }
                        j2 = -1;
                        i4 = 0;
                    } else {
                        i2 = iM;
                    }
                    if (i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086) {
                        j = length;
                        i5 = i6;
                    } else if (i2 == 1836019558 || i2 == 1836475768) {
                        z2 = true;
                    } else {
                        if (i2 == 1835295092) {
                            z4 = true;
                        }
                        if (i2 != 1937007212 || jT <= 1000000) {
                            j = length;
                            if ((((long) i6) + jT) - j4 < i3) {
                                int i7 = (int) (jT - j4);
                                i5 = i6 + i7;
                                if (i2 == 1718909296) {
                                    if (i7 < 8) {
                                        return new w04(i2, 8, i7);
                                    }
                                    fq80Var.J(i7);
                                    int i8 = 0;
                                    guoVar.n(fq80Var.f9961a, 0, i7);
                                    int iM2 = fq80Var.m();
                                    int i9 = iM2 >>> 8;
                                    int[] iArr2 = f;
                                    if (i9 == 3368816) {
                                        z4 = true;
                                        break;
                                    }
                                    for (int i10 = 0; i10 < 29; i10++) {
                                        if (iArr2[i10] == iM2) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                    fq80Var.N(4);
                                    int iA = fq80Var.a() / 4;
                                    if (!z4 && iA > 0) {
                                        int[] iArr3 = new int[iA];
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= iA) {
                                                iArr = iArr3;
                                                z3 = z4;
                                                break;
                                            }
                                            int iM3 = fq80Var.m();
                                            iArr3[i11] = iM3;
                                            if ((iM3 >>> 8) != 3368816) {
                                                int i12 = i8;
                                                while (true) {
                                                    if (i12 >= 29) {
                                                        i11++;
                                                        i8 = 0;
                                                    } else if (iArr2[i12] != iM3) {
                                                        i12++;
                                                    }
                                                }
                                            }
                                            iArr = iArr3;
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    z3 = z4;
                                    iArr = qgk0Var;
                                    if (!z3) {
                                        return new y78(iArr, iM2);
                                    }
                                    z4 = z3;
                                } else if (i7 != 0) {
                                    guoVar.j(i7);
                                }
                            }
                        }
                        z2 = false;
                    }
                    length = j;
                    j2 = -1;
                    i4 = 0;
                }
                if (!z4) {
                    return lwf.v;
                }
                if (z != z2) {
                    return z2 ? nqd.d : nqd.e;
                }
                return qgk0Var;
            }
            qgk0Var = null;
            z2 = false;
            if (!z4) {
                return lwf.v;
            }
            if (z != z2) {
                if (z2) {
                }
            }
            return qgk0Var;
        }
    }

    public static final ob7 P(hao haoVar) {
        haoVar.getClass();
        long j = haoVar.c;
        String str = haoVar.l;
        long j2 = haoVar.e;
        long j3 = haoVar.b;
        double d2 = haoVar.f;
        long j4 = haoVar.m.f30476a;
        String str2 = haoVar.k;
        return new ob7(j, j2, j3, false, d2, j4, (str2.length() <= 0 || str.length() <= 0) ? "" : kng0.l(str2, ": ", str), haoVar.h, false, haoVar.d, haoVar.i, iun.f15405a);
    }

    public static final lla Q(y1w y1wVar, v5l0 v5l0Var, ctf0 ctf0Var, List list, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        int i;
        y1wVar.getClass();
        List list2 = y1wVar.n;
        boolean z6 = y1wVar.q;
        a2w a2wVar = y1wVar.o;
        v5l0Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            dem demVar = null;
            tma tmaVar = new tma(o2e.k0(y1wVar, list, z2, z3, str2, z5), null, 14);
            qla qlaVar = new qla(a2wVar.f144a, new jwm(j2e.N(y1wVar, ctf0Var)), new jwm(j2e.O(y1wVar, z4), Integer.MAX_VALUE), null);
            if (z6 && (!cy7.c() || !z4)) {
                demVar = new dem(y1wVar.f41880a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), cfx0.N(list2), z);
            }
            return new gla(tmaVar, qlaVar, demVar, y1wVar.f41880a);
        }
        if (iOrdinal == 1) {
            return new kla(new xma(o2e.k0(y1wVar, list, z2, z3, str2, z5), null, dj8.Z(y1wVar, z, z4), 6), new oma(a2wVar.f144a, new jwm(j2e.N(y1wVar, ctf0Var)), new jwm(j2e.O(y1wVar, z4), Integer.MAX_VALUE), null), (z6 && z && (!cy7.c() || !z4)) ? new eem(cfx0.N(list2)) : null, y1wVar.f41880a);
        }
        int i2 = 2;
        if (iOrdinal == 2) {
            return new jla(new wma(o2e.k0(y1wVar, list, z2, z3, str2, z5), null, dj8.Z(y1wVar, z, z4), 6), new ima(a2wVar.f144a, j2e.N(y1wVar, ctf0Var), new jwm(j2e.O(y1wVar, z4), Integer.MAX_VALUE), null), y9a.V(y1wVar, z, z4), y1wVar.f41880a);
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return new hla(new uma(o2e.k0(y1wVar, list, z2, z3, str2, z5), null, dj8.Z(y1wVar, z, z4), 6), new wla(a2wVar.f144a, j2e.N(y1wVar, ctf0Var), new jwm(j2e.O(y1wVar, z4), Integer.MAX_VALUE), null), y9a.V(y1wVar, z, z4), y1wVar.f41880a);
            }
            t9f.b();
            return null;
        }
        vma vmaVar = new vma(o2e.k0(y1wVar, list, z2, z3, str2, z5), new b4i(j2e.N(y1wVar, ctf0Var), i2), dj8.Z(y1wVar, z, z4));
        cma cmaVar = new cma(a2wVar.f144a, new jwm(j2e.O(y1wVar, z4), Integer.MAX_VALUE), null);
        gem gemVar = (z6 && z && (!cy7.c() || !z4)) ? new gem(cfx0.N(list2)) : null;
        long j = y1wVar.f41880a;
        StringBuilder sb = new StringBuilder(ujn.h);
        if (str.length() == 0) {
            sb.setLength(0);
        } else {
            if (StringsKt.O(str, ujn.h, false)) {
                i = 0;
            } else if (kotlin.text.c.x(str, "https://", false)) {
                i = 0;
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str, '/'));
            }
            sb.setLength(i);
            sb.append(str);
        }
        return new ila(j, gemVar, vmaVar, cmaVar, new n0x(sb.toString()));
    }

    public static final ef6 R(an5 an5Var, ctf0 ctf0Var, double d2, fo7 fo7Var, boolean z) {
        v30 g30Var;
        ctf0Var.getClass();
        ql5 ql5Var = an5Var.c;
        String str = ql5Var.f;
        boolean z2 = false;
        String strA = ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        g40 g40Var = an5Var.d;
        e40 e40Var = g40Var.b;
        double d3 = g40Var.f10638a;
        if (e40Var == e40.f7159a || !(fo7Var instanceof co7)) {
            g30Var = new g30();
        } else if (z) {
            g30Var = new d30(strA);
        } else if (e40Var == e40.b) {
            g30Var = new j30(strA);
        } else if (e40Var == e40.c) {
            str.getClass();
            if (d3 == -1.0d) {
                g30Var = new a30(strA);
            } else {
                int i = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                g30Var = new s30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
            }
        } else if (e40Var == e40.d) {
            int i2 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            g30Var = new p30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
        } else if (e40Var == e40.f) {
            int i3 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            g30Var = new m30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
        } else {
            g30Var = e40Var == e40.e ? new d30(strA) : new g30();
        }
        pn40 pn40Var4 = pn40.f27267a;
        String strC = pn40.c(ql5Var.b, p3u0.c);
        double d4 = ql5Var.b;
        if ((d4 == 0.0d || d2 > d4) && ql5Var.f28916a != 0 && ctf0Var.i()) {
            z2 = true;
        }
        return new ef6(g30Var, new rw7(strC, str, z2, an5Var.e));
    }

    public static final String S(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final CharSequence T(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? ttm0.K(4999, charSequence) : ttm0.K(5000, charSequence);
    }

    public static final void a(mm40 mm40Var, ph0 ph0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ph0Var.getClass();
        fetVar.g0(-1054926362);
        int i2 = i | 6 | (fetVar.g(ph0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.s(mm40Var2, 148.0f), 64.0f), "CATEGORY_ICON_LEFT");
            if (ph0Var instanceof nh0) {
                fetVar.e0(-1035170811);
                b(mm40VarE0, (nh0) ph0Var, function1, fetVar, i2 & 1008);
                fetVar.r(false);
            } else {
                if (!ph0Var.equals(oh0.f25241a)) {
                    throw b1j.f(-171941966, fetVar, false);
                }
                fetVar.e0(-1034942651);
                mrv.b(0, fetVar, null);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ih0(mm40Var2, ph0Var, function1, i, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, nh0 nh0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1460435062);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 148.0f), 64.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new jh0(function1, nh0Var, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.m;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "CATEGORY_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
            k1xVar.c = nh0Var.c;
            t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
            t1x.c(k1xVar, R.drawable.ic_glyph_category_new);
            k1xVar.c((int) pkd.b(24.0f, fetVar2));
            o1x o1xVarA = k1xVar.a();
            Object objP4 = fetVar2.P();
            byte b3 = 5;
            if (objP4 == cl5Var) {
                objP4 = new we(pz40Var, b3);
                fetVar2.o0(objP4);
            }
            mz3 mz3VarX = l7x.X(o1xVarA, (Function1) objP4, null, fetVar2, 384, 26);
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 24.0f), "CATEGORY_CARD_IMAGE");
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new we(pz40Var, (byte) 6);
                fetVar2.o0(objP5);
            }
            j0x.b(mz3VarX, null, pai0.a(mm40VarE1, false, (Function1) objP5), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24624, 40);
            fetVar2.r(true);
            mm40 mm40VarE2 = o2e.e0(s5x0.M(jm40Var, 8.0f, 8.0f, 12.0f, 8.0f), "CATEGORY_CARD_TITLE");
            String str = nh0Var.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            qrq qrqVar = j1t0.b;
            long j = qmk.q;
            v8q0.a(str, mm40VarE2, textPrimary, new n05(j, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, true, 3, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 28032, 101360);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lh0(mm40Var, nh0Var, function1, i, (byte) 1);
        }
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, d9z d9zVar, d9z d9zVar2, xcz xczVar, xcz xczVar2, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        d9zVar.getClass();
        d9zVar2.getClass();
        xczVar.getClass();
        xczVar2.getClass();
        fetVar2.g0(-172720566);
        int i2 = i | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.g(d9zVar) ? 256 : 128) | (fetVar2.g(d9zVar2) ? 2048 : 1024) | (fetVar2.g(xczVar) ? 16384 : 8192) | (fetVar2.g(xczVar2) ? 131072 : 65536) | (fetVar2.i(function1) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            yk0 yk0Var = yk0.FAVORITES;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new mg0((byte) 3);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar2, 384, 2);
            int i3 = 3670016 & i2;
            boolean z2 = i3 == 1048576;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dn(function1, (byte) 22);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i3 == 1048576;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dn(function1, (byte) 23);
                fetVar2.o0(objP3);
            }
            v3c.z(function0, (Function0) objP3, null, fetVar2, 0, 4);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarW = o050.W(mm40VarQ.e(n0qVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            y860.c(l7m0Var, function1, fetVar2, ((i2 >> 15) & 112) | ((i2 >> 3) & 14));
            xn0 xn0Var = (xn0) l7m0Var.getValue();
            if (xn0Var != null) {
                if (xn0Var instanceof wn0) {
                    fetVar2.e0(-753814988);
                    mm40 mm40VarE = tfx.E(o7k0.d(new x7z(1.0f, true), 1.0f));
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
                    mdm mdmVar = ((wn0) xn0Var).f39425a;
                    boolean z5 = i3 == 1048576;
                    Object objP4 = fetVar2.P();
                    if (z5 || objP4 == cl5Var) {
                        objP4 = new dn(function1, (byte) 24);
                        fetVar2.o0(objP4);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP4, fetVar2, 0, 5);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z = false;
                    if (xn0Var instanceof vn0) {
                        fetVar2.e0(-753165352);
                        Integer numValueOf2 = Integer.valueOf(((vn0) xn0Var).c ? 1 : 0);
                        boolean zG = fetVar2.g(kwjVarB) | fetVar2.g(xn0Var);
                        Object objP5 = fetVar2.P();
                        if (zG || objP5 == cl5Var) {
                            objP5 = new l1(kwjVarB, xn0Var, null, (byte) 16);
                            fetVar2.o0(objP5);
                        }
                        m0x0.t(fetVar2, numValueOf2, (Function2) objP5);
                        q5x.e(kwjVarB, n0qVar, null, null, q3d.i(yk0.e), 0.0f, null, null, false, null, null, null, null, u1c.M(-1015142046, new en0(xn0Var, d9zVar, xczVar, function1, d9zVar2, xczVar2), fetVar2), fetVar, 100663344, 24576, 16108);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-1548337938, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var, (Object) l7m0Var, (Object) d9zVar, (Object) d9zVar2, (Object) xczVar, (Object) xczVar2, (wdr) function1, i, (byte) 0);
        }
    }

    public static final void d(mm40 mm40Var, cv1 cv1Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i) {
        cv1Var.getClass();
        bv1 bv1Var = cv1Var.b;
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(1098892932);
        int i2 = i | (fetVar.g(cv1Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(xczVar3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int iOrdinal = bv1Var.ordinal();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new c51((byte) 13);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(iOrdinal, (Function0) objP, fetVar, 384, 2);
            boolean zG = fetVar.g(kwjVarB) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new wt1(cv1Var, kwjVarB, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, bv1Var, (Function2) objP2);
            q5x.e(kwjVarB, mm40Var, null, null, q3d.i(bv1.g), 0.0f, null, null, false, null, null, null, null, u1c.M(1748474373, new ut1(cv1Var, xczVar, function1, d9zVar, xczVar2, xczVar3, (byte) 0), fetVar), fetVar, 100663344, 24576, 16108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vt1(mm40Var, cv1Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i, (byte) 0);
        }
    }

    public static final void e(final mm40 mm40Var, final xn4 xn4Var, final boolean z, final boolean z2, final Function0 function0, final Function0 function1, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        Object o54Var;
        boolean z3;
        na10 na10Var;
        Function0 function3;
        na10 na10Var2;
        xn4 xn4Var2;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        wx7 wx7Var = aad.c;
        wx7 wx7Var2 = aad.b;
        pge pgeVar = gqw0.A;
        zx7 zx7Var = gqw0.f11754a;
        xn4Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-682660848);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(xn4Var.ordinal()) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.h(z2) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (i2 & 74899) != 74898)) {
            jm40 jm40Var = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            Function0 function4 = e7z.u1;
            Object obj = ukd.f35823a;
            if (z2) {
                fetVar.e0(-477465006);
                fetVar.r(false);
                na10 na10VarW = x8x.w(new pa10(R.raw.authorization), fetVar);
                na10 na10VarW2 = x8x.w(new pa10(R.raw.registration), fetVar);
                u910 u910VarU = xww.U(fetVar);
                boolean zG = fetVar.g(na10VarW) | ((i2 & 112) == 32) | fetVar.g(na10VarW2) | ((i2 & 896) == 256) | fetVar.g(u910VarU) | ((i2 & 57344) == 16384);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    z3 = false;
                    na10Var = na10VarW2;
                    function3 = function4;
                    na10Var2 = na10VarW;
                    xn4Var2 = xn4Var;
                    o54Var = new o54(xn4Var2, na10Var2, na10Var, z, u910VarU, function0, null);
                    fetVar.o0(o54Var);
                } else {
                    o54Var = objP;
                    na10Var2 = na10VarW;
                    z3 = false;
                    na10Var = na10VarW2;
                    function3 = function4;
                    xn4Var2 = xn4Var;
                }
                m0x0.t(fetVar, xn4Var2, (Function2) o54Var);
                fa10 fa10VarC = u910VarU.c();
                wx7 wx7Var3 = (!Intrinsics.d(fa10VarC, na10Var.getValue()) && (Intrinsics.d(fa10VarC, na10Var2.getValue()) || xn4Var2 == xn4.f41154a)) ? wx7Var : wx7Var2;
                tj30 tj30VarC = zq8.c(zx7Var, z3);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function3);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                fa10 fa10VarC2 = u910VarU.c();
                boolean zG2 = fetVar.g(u910VarU);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new a13(u910VarU, (byte) 21);
                    fetVar.o0(objP2);
                }
                Function0 function5 = (Function0) objP2;
                mm40 mm40VarK = lgb.K(jr8Var.b(ny9.O(1.0f, o7k0.c(jm40Var, 1.0f), true), wx7Var3));
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = dw9.j(fetVar);
                }
                piz.j(fa10VarC2, function5, o2e.e0(y860.W(mm40VarK, (gy40) objP3, null, false, null, function1, 28), "AUTH_DEFAULT_SCREEN_LOTTIE_ANIMATION"), pgeVar, fetVar, 0, 48, 129016);
                fetVar.r(true);
            } else {
                fetVar.e0(-478876715);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function4);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                n0q n0qVar = o7k0.c;
                androidx.compose.runtime.d dVar = zaq0.b;
                zq8.a(0, fetVar, i120.Q(n0qVar, ((ThemeColors) fetVar.k(dVar)).getBackgroundLight60(), jd8.n));
                j0x.b(a8k0.F(R.drawable.background_auth, 0, fetVar), null, epv0.N(n0qVar, 0.4f), null, pgeVar, 0.0f, new m78(((ThemeColors) fetVar.k(dVar)).getSecondary(), 5), fetVar, 25016, 40);
                mm40 mm40VarD = o7k0.d(jr8Var.b(jm40Var, gqw0.h), 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 24.0f);
                long background = ((ThemeColors) fetVar.k(dVar)).getBackground();
                zcl zclVar2 = qmk.l;
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(mm40VarE, background, new ugg0(zclVar2, zclVar2, zclVar3, zclVar3));
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = dw9.j(fetVar);
                }
                zq8.a(0, fetVar, y860.W(mm40VarQ, (gy40) objP4, null, false, null, function1, 28));
                fetVar.r(true);
                fetVar.r(false);
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2(mm40Var, xn4Var, z, z2, function0, function1, i, b2) { // from class: a.n54

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f22925a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ xn4 c;
                    public final /* synthetic */ boolean d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ Function0 f;
                    public final /* synthetic */ Function0 g;

                    {
                        this.f22925a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (this.f22925a) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iL = x8x.L(1);
                                zgc.e(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj2, iL);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iL2 = x8x.L(1);
                                zgc.e(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj2, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            }
            yfe0VarU.d = function2;
        }
        mm40Var = mm40Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final mm40 mm40Var2 = mm40Var;
            function2 = new Function2(mm40Var2, xn4Var, z, z2, function0, function1, i, b3) { // from class: a.n54

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f22925a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ xn4 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;

                {
                    this.f22925a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.f22925a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iL = x8x.L(1);
                            zgc.e(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj2, iL);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iL2 = x8x.L(1);
                            zgc.e(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj2, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void f(mm40 mm40Var, ArrayList arrayList, String str, Function1 function1, fet fetVar, int i) {
        int i2;
        xcz xczVar;
        function1.getClass();
        fetVar.g0(-800510652);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(arrayList) : fetVar.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            int i3 = i2 & 112;
            boolean z = i3 == 32 || ((i2 & 64) != 0 && fetVar.g(arrayList));
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (((bh8) it.next()).d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                objP = Integer.valueOf(i4);
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            pfk0 pfk0VarP = idx.P(xczVarA, null, fetVar, 0, 30);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                zcl zclVar = qmk.f28987a;
                objP2 = Integer.valueOf(w6kVar.T(240.0f));
                fetVar.o0(objP2);
            }
            int iIntValue2 = ((Number) objP2).intValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP3 = Integer.valueOf(w6kVar.T(12.0f));
                fetVar.o0(objP3);
            }
            int iIntValue3 = ((Number) objP3).intValue() + iIntValue2;
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(xczVarA);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new eb(xczVarA, (byte) 4);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(xczVarA);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj) {
                objP5 = new eb(xczVarA, (byte) 5);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP5, fetVar);
            Boolean bool = (Boolean) l7m0VarY.getValue();
            bool.booleanValue();
            boolean zE = fetVar.e(iIntValue) | fetVar.g(l7m0VarY) | fetVar.g(xczVarA) | fetVar.g(l7m0VarY2);
            Object objP6 = fetVar.P();
            if (zE || objP6 == obj) {
                xczVar = xczVarA;
                Object ud8Var = new ud8(iIntValue, xczVar, iIntValue2, iIntValue3, l7m0VarY, l7m0VarY2, null);
                fetVar.o0(ud8Var);
                objP6 = ud8Var;
            } else {
                xczVar = xczVarA;
            }
            m0x0.u(str, arrayList, bool, (Function2) objP6, fetVar);
            yx7 yx7Var = gqw0.l;
            zcl zclVar3 = qmk.f28987a;
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
            boolean z2 = (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(arrayList))) | ((i2 & 7168) == 2048);
            Object objP7 = fetVar.P();
            if (z2 || objP7 == obj) {
                objP7 = new td8(arrayList, function1, (byte) 0);
                fetVar.o0(objP7);
            }
            b8k0.f(mm40Var, xczVar, lh80VarT, false, qw3Var, yx7Var, pfk0VarP, false, null, (Function1) objP7, fetVar, (14 & i2) | 196608, 392);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 8, i, (Object) mm40Var, (Object) arrayList, (Object) str, (Object) function1);
        }
    }

    public static final void g(mm40 mm40Var, kc9 kc9Var, uwe uweVar, fet fetVar, int i) {
        mm40 mm40Var2;
        shd shdVar;
        shd shdVar2;
        pcy pcyVar;
        int i2;
        shd shdVar3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1652938060);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(kc9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.i(uweVar) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar7, 1.0f, true);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(x7zVarI, background, vgg0.a(10.0f)), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar7);
            boolean z2 = kc9Var.d;
            mm40 mm40VarN = epv0.N(jm40Var, z2 ? 1.0f : 0.5f);
            boolean zH = fetVar2.h(z2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = new jwx(z2);
                fetVar2.o0(objP);
            }
            jwx jwxVar = (jwx) objP;
            int i4 = i3;
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, jwxVar, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar5);
            vqd.u(iHashCode3, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar7);
            if (z2) {
                shdVar = shdVar5;
                shdVar2 = shdVar4;
                pcyVar = pcyVar2;
                i2 = 0;
                shdVar3 = shdVar7;
                fetVar2.e0(-761222473);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-761626775);
                mm40 mm40VarN2 = o7k0.n(mrv.k0(jm40Var, "ICON_BUILDER"), 16.0f);
                i2 = 0;
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar2);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                shdVar = shdVar5;
                pcyVar = pcyVar2;
                shdVar3 = shdVar7;
                shdVar2 = shdVar4;
                dww.c(pm80VarF, null, mm40VarN2, secondary, fetVar2, 56, 0);
                fetVar2.r(false);
            }
            mm40 mm40VarK0 = mrv.k0(jm40Var, "COLUMN_BUILDER");
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, i2);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarK0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar2);
            jpm0.o(fetVar2, bh90VarM4, shdVar);
            vqd.u(iHashCode4, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar3);
            j2e.k(null, kc9Var.b, fetVar2, 0);
            shd shdVar8 = shdVar3;
            shd shdVar9 = shdVar2;
            shd shdVar10 = shdVar;
            pcy pcyVar3 = pcyVar;
            v8q0.a(kc9Var.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
            mm40 mm40VarN3 = o7k0.n(jm40Var, 40.0f);
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new gj4(uweVar, kc9Var, (byte) 24);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN3, null, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar9);
            jpm0.o(fetVar2, bh90VarM5, shdVar10);
            vqd.u(iHashCode5, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar8);
            dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var2, (Object) kc9Var, (Object) uweVar, i, (byte) 16);
        }
    }

    public static final void h(mm40 mm40Var, boolean z, String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(842638101);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.c(12.0f, 12.0f, 0.0f, 0.0f, 12));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n), xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, 12.0f);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            nul nulVar = nul.e;
            oe9 oe9Var = oe9.b;
            qzb.n(x7zVar, new wul(nulVar, oe9Var, new ue9(str), true, false, false), function0, fetVar2, (i2 >> 6) & 896, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            qzb.n(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), new wul(lul.e, oe9Var, new ue9(str2), z, false, false), function1, fetVar2, (i2 >> 9) & 896, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cya(mm40Var, z, str, str2, function0, function1, i, (byte) 0);
        }
    }

    public static final void i(bya byaVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1203323669);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(byaVar) : fetVar.i(byaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = z ? byaVar.b : byaVar.f3407a;
            boolean z2 = (i2 & 112) == 32;
            int i3 = i2 & 896;
            boolean z3 = z2 | (i3 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new fya(z, function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new xz8(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            b2 = i3 == 256 ? (byte) 1 : (byte) 0;
            Object objP3 = fetVar.P();
            if (b2 != 0 || objP3 == cl5Var) {
                objP3 = new xz8(function1, (byte) 15);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, function2, (Function1) objP3, null, null, null, null, null, fetVar, 6, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) byaVar, z, (Object) function1, i, (byte) 3);
        }
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1089634786);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            qya qyaVar = (qya) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarS = o050.S(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            i(qyaVar.a(), qyaVar.e() != null, function1, fetVar, (i2 << 3) & 896);
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
            qya qyaVar2 = (qya) l7m0Var.getValue();
            if (qyaVar2 != null) {
                boolean z3 = qyaVar2 instanceof pya;
                cl5 cl5Var = ukd.f35823a;
                if (z3) {
                    fetVar.e0(-1429857362);
                    l(new gtr(true), function1, fetVar, i2 & 112);
                    fetVar.r(false);
                } else if (qyaVar2 instanceof oya) {
                    fetVar.e0(-1429588406);
                    mdm mdmVar = ((oya) qyaVar2).e;
                    boolean z4 = (i2 & 112) == 32;
                    Object objP = fetVar.P();
                    if (z4 || objP == cl5Var) {
                        objP = new n19(function1, (byte) 22);
                        fetVar.o0(objP);
                    }
                    k(mdmVar, (Function0) objP, fetVar, 0);
                    fetVar.r(false);
                } else if (qyaVar2 instanceof nya) {
                    fetVar.e0(-1429305779);
                    nya nyaVar = (nya) qyaVar2;
                    if (nyaVar.f) {
                        fetVar.e0(-1429266781);
                        k(nyaVar.g, null, fetVar, 48);
                        z = false;
                        fetVar.r(false);
                    } else {
                        z = false;
                        fetVar.e0(-1429065126);
                        l(nyaVar.e, function1, fetVar, i2 & 112);
                        fetVar.r(false);
                    }
                    fetVar.r(z);
                }
                fetVar.r(true);
                if (qyaVar instanceof oya) {
                    fetVar.e0(2029341966);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2028762483);
                    mm40 mm40VarR = a8k0.R(0.0f, g8x.U(null, fetVar, 1), 14);
                    boolean zC = qyaVar.c();
                    String strB = qyaVar.b();
                    String strD = qyaVar.d();
                    int i3 = i2 & 112;
                    boolean z5 = i3 == 32;
                    Object objP2 = fetVar.P();
                    if (z5 || objP2 == cl5Var) {
                        objP2 = new n19(function1, (byte) 23);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean z6 = i3 == 32;
                    Object objP3 = fetVar.P();
                    if (z6 || objP3 == cl5Var) {
                        objP3 = new n19(function1, (byte) 24);
                        fetVar.o0(objP3);
                    }
                    h(mm40VarR, zC, strB, strD, function0, (Function0) objP3, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-1015957696, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 20);
        }
    }

    public static final void k(mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        Function0 function1;
        fetVar.g0(-1015355085);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        } else {
            if (mdmVar == null) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new dya(mdmVar, function0, i, b2);
                    return;
                }
                return;
            }
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 24.0f, 2);
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
            if (function0 == null) {
                fetVar.e0(-336263097);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new mn9((byte) 28);
                    fetVar.o0(objP);
                }
                fetVar.r(false);
                function1 = (Function0) objP;
            } else {
                fetVar.e0(-287942388);
                fetVar.r(false);
                function1 = function0;
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, function1, fetVar2, (i2 << 3) & 112, 5);
            fetVar2.r(true);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new dya(mdmVar2, function0, i, b3);
        }
    }

    public static final void l(htr htrVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-982987708);
        int i2 = (fetVar.g(htrVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            d9z d9zVarA = f9z.a(fetVar);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eya(htrVar, function1, b2);
                fetVar.o0(objP);
            }
            uzb.z(n0qVar, lh80Var, d9zVarA, false, (Function2) objP, fetVar, 6, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eya(htrVar, function1, i);
        }
    }

    public static final void m(och ochVar, g2v g2vVar, xcz xczVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(1068840284);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(ochVar) : fetVar.i(ochVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g2vVar) : fetVar.i(g2vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
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
            A((i2 >> 12) & 14, fetVar, function0);
            if (ochVar != null) {
                boolean z = ochVar instanceof nch;
                cl5 cl5Var = ukd.f35823a;
                byte b2 = 8;
                if (z) {
                    fetVar.e0(-154460178);
                    boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(g2vVar));
                    Object objP = fetVar.P();
                    if (z2 || objP == cl5Var) {
                        objP = new rib(g2vVar, b2);
                        fetVar.o0(objP);
                    }
                    vbw0.n(null, (Function1) objP, fetVar, 0);
                    fetVar.r(false);
                } else if (ochVar instanceof mch) {
                    fetVar.e0(-154189920);
                    boolean z3 = (i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(ochVar));
                    Object objP2 = fetVar.P();
                    if (z3 || objP2 == cl5Var) {
                        objP2 = new npt0(ochVar, (byte) 16);
                        fetVar.o0(objP2);
                    }
                    vbw0.n(null, (Function1) objP2, fetVar, 0);
                    fetVar.r(false);
                } else if (ochVar instanceof lch) {
                    fetVar.e0(-153786021);
                    s(((lch) ochVar).f19799a, xczVar, function1, fetVar, (i2 >> 3) & 1008);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-1667551941, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p4t0(ochVar, g2vVar, xczVar, function1, function0, i);
        }
    }

    public static final void n(jkm jkmVar, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(204212562);
        int i2 = (fetVar.g(jkmVar) ? 4 : 2) | i | 48;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarN.e(n0qVar);
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
            zq8.a(0, fetVar, wha0.a0(n0qVar, wha0.T(fetVar), false, 14));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = mxf.f22552a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new kxf(jkmVar, b2);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, n0qVar, (Function1) objP2, fetVar, 54, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lxf(jkmVar, mm40Var2, i, b2);
        }
    }

    public static final void o(mm40 mm40Var, okl oklVar, Function0 function0, fet fetVar, int i) {
        Function0 function1 = function0;
        fetVar.g0(-1707638791);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(oklVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function1, 28);
            function1 = function1;
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarW), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f);
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
            jm40 jm40Var = jm40.b;
            B(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), oklVar, function1, fetVar, i2 & 1008);
            u(o7k0.d(jm40Var, 1.0f), oklVar, fetVar, (i2 & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, oklVar, function1, i, (byte) 15);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-268502344);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 148.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 24);
        }
    }

    public static final void q(mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-464614905);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new mhp0((byte) 28);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(mm40VarB, mdmVar2, false, (Function0) objP, fetVar2, ((i2 << 3) & 112) | 3072, 4);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i, (byte) 15);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        byte b2;
        Function1 function2 = function1;
        fetVar.g0(-1409463275);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
            mkd.c0.getClass();
            fetVar.i0();
            b2 = 3;
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
            mm40 mm40VarC2 = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC2);
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
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                function2 = function1;
                objP = new g4p0(function2, (byte) 28);
                fetVar.o0(objP);
            } else {
                function2 = function1;
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b2 = 3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function2, i, b2);
        }
    }

    public static final void s(List list, xcz xczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        xcz xczVar2 = xczVar;
        fetVar.g0(-1609966917);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(list) : fetVar.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).c;
            float f3 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 28.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(list))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new rb(list, function1, (byte) 15);
                fetVar.o0(objP);
            }
            int i3 = i2 & 112;
            b8k0.e(n0qVar, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, i3 | 6, Response.NOT_ACCEPTABLE_HERE);
            xczVar2 = xczVar;
            Unit unit = Unit.f46060a;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wi6(xczVar2, null, (byte) 16);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(list, xczVar2, function1, i, (byte) 23);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var2;
        Function1 function2 = function1;
        l7m0Var.getClass();
        function2.getClass();
        fetVar.g0(-320532747);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            imm immVar = ((ihp) l7m0Var.getValue()).f14790a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function2, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qyo(function2, (byte) 11);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            boolean z3 = false;
            hlm.c(jm40Var, immVar, null, function0, null, null, (Function1) objP2, null, null, null, null, null, fetVar, 6, 0, 4020);
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).c;
            ch80 ch80VarF = knm0.f(new lh80(f2, 16.0f, f2, 16.0f), fetVar);
            boolean z4 = (i2 & 14) == 4;
            if (i3 == 32) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                l7m0Var2 = l7m0Var;
                objP3 = new ys4(l7m0Var2, function1, (byte) 9);
                fetVar.o0(objP3);
            } else {
                l7m0Var2 = l7m0Var;
            }
            Function1 function3 = (Function1) objP3;
            function2 = function1;
            b8k0.e(jm40Var, null, ch80VarF, null, null, null, false, null, function3, fetVar, 6, 506);
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var2, function2, i, (byte) 13);
        }
    }

    public static final void u(mm40 mm40Var, okl oklVar, fet fetVar, int i) {
        int i2;
        Object objG;
        fet fetVar2 = fetVar;
        fetVar2.g0(1680410914);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(oklVar) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar2.k(zfnVar);
            k6z k6zVar2 = k6z.b;
            boolean z = k6zVar == k6zVar2;
            qc0 qc0Var = oklVar.b;
            boolean zE = fetVar2.e(qc0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = qc0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    List listJ = q3d.j(new y3d(hi0.h), new y3d(hi0.s));
                    objG = z ? yk5.g(CollectionsKt.t0(listJ), 0.0f, 0.0f, 14) : yk5.g(listJ, 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    objG = new skk0(secondary);
                }
                objP = objG;
                fetVar2.o0(objP);
            }
            t89 t89Var = (t89) objP;
            boolean zE2 = fetVar2.e(qc0Var.ordinal());
            Object objP2 = fetVar2.P();
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = qc0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    objP2 = null;
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return;
                    }
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar.b = fArrA;
                    objP2 = h4dVar;
                }
                fetVar2.o0(objP2);
            }
            a4d a4dVar = (a4d) objP2;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            mm40 mm40VarE = o7k0.e(mm40VarD, 72.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarP = i120.P(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), t89Var, null, 6);
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
            j0x.b(l7x.X(oklVar.f25409a.a(), null, null, fetVar2, 0, 30), null, o2e.e0(yyw.V(jr8.f16991a.b(o7k0.s(o7k0.c(jm40Var, 1.0f), 144.0f), gqw0.f), fetVar2.k(zfnVar) == k6zVar2), "AGGREGATOR_BONUSES_IMAGE_CARD_STYLE"), null, gqw0.A, 0.0f, a4dVar, fetVar, 24624, 40);
            fetVar2 = fetVar;
            v(s5x0.N(jm40Var, 16.0f, 0.0f, 144.0f, 0.0f, 10).e(o7k0.c), oklVar, fetVar2, i3 & 112);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jkl(mm40Var, oklVar, i, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, okl oklVar, fet fetVar, int i) {
        int i2;
        byte b2;
        boolean z;
        String str;
        float f2;
        fet fetVar2 = fetVar;
        fetVar2.g0(447349615);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(oklVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            qc0 qc0Var = oklVar.b;
            String str2 = oklVar.e;
            int iOrdinal = qc0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar2.e0(-552746645);
                mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
                zcl zclVar = qmk.f28987a;
                j6n.h(oklVar.e, dqo0.f6527a, s5x0.N(mm40VarA, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0, 0, fetVar2, 48, 24);
                long j = qmk.r;
                long j2 = qmk.u;
                v8q0.a(oklVar.d, null, jM123getWhite0d7_KjU, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2.e0(-551899818);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                long j3 = qmk.p;
                long j4 = qmk.q;
                long j5 = qmk.n;
                v8q0.a(oklVar.e, mm40VarN, jM123getWhite0d7_KjU, new n05(j3, j4, j5), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110576);
                v8q0.a(oklVar.d, null, jM123getWhite0d7_KjU, new n05(qmk.r, qmk.u, j5), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-17829246, fetVar2, false);
                }
                fetVar2.e0(-550740728);
                if (oklVar.c.length() > 0) {
                    fetVar2.e0(-550688183);
                    if (str2.length() > 0) {
                        zcl zclVar3 = qmk.f28987a;
                        f2 = 8.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f2 = 0.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f2, 7);
                    long j6 = qmk.r;
                    long j7 = qmk.u;
                    str = str2;
                    z = false;
                    v8q0.a(oklVar.c, mm40VarN2, jM123getWhite0d7_KjU, new n05(j6, j7, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j7, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 110576);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    z = false;
                    str = str2;
                    fetVar2.e0(-550005315);
                    fetVar2.r(false);
                }
                if (str.length() > 0) {
                    fetVar2.e0(-549914299);
                    long j8 = qmk.p;
                    long j9 = qmk.q;
                    v8q0.a(oklVar.e, null, jM123getWhite0d7_KjU, new n05(j8, j9, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j9, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110578);
                    fetVar2 = fetVar;
                    fetVar2.r(z);
                } else {
                    fetVar2.e0(-549381347);
                    fetVar2.r(z);
                }
                fetVar2.r(z);
            }
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jkl(mm40Var, oklVar, i, b2);
        }
    }

    public static final void w(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        float f2;
        float f3;
        fetVar.g0(-336298864);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 152.0f), 12.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            mm40 mm40Var4 = mm40Var3;
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            if (0.5f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
                f3 = Float.MAX_VALUE;
            } else {
                f2 = 0.5f;
                f3 = Float.MAX_VALUE;
            }
            x7z x7zVar = new x7z(f2, true);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar);
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
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(jm40Var, 32.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarE2 = o7k0.e(o7k0.s(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 84.0f), 12.0f);
            zcl zclVar3 = qmk.i;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(0.5f > f3 ? f3 : 0.5f, true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.s(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 84.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(jm40Var, 32.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            fetVar.r(true);
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 60.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var2 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var2, i, i2, (byte) 9);
        }
    }

    public static final void x(int i, fet fetVar) {
        fetVar.g0(322366929);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            w(0, 1, fetVar, null);
            zcl zclVar = qmk.f28987a;
            w(0, 0, fetVar, s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v1x(i, (byte) 26);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(18939815);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new b4f0(b2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarW, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 17);
        }
    }

    public static final void z(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2009608589);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarX = yyw.X(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), null, fetVar, 1);
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
            d7x.d(((ad40) l7m0Var.getValue()).f661a, function1, fetVar, i2 & 112);
            D(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 19);
        }
    }

    public aty N(aty atyVar) {
        atyVar.getClass();
        return atyVar;
    }
}
