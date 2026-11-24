package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.javax.sip.message.Response;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ffb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f9442a = new ugd(-733428169, false, new zgd(17));
    public static final ugd b = new ugd(-132517295, false, new fhd(2));
    public static final ugd c = new ugd(1763171781, false, new jhd(24));
    public static final ugd d = new ugd(-1447482772, false, new qhd(10));
    public static final byte[] e = new byte[0];

    public static final void A(int i, fet fetVar) {
        fet fetVar2;
        k3t0 k3t0Var;
        clz clzVar;
        yje yjeVar;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(641913447);
        byte b2 = 1;
        byte b3 = 0;
        if (fetVar4.U(i & 1, i != 0)) {
            Fragment fragment = (Fragment) fetVar4.k(mr00.f22246a);
            rdo0 rdo0Var = (rdo0) fetVar4.k(sdo0.f32043a);
            Object objP = fetVar4.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = a4n0.f(fragment);
                fetVar4.o0(objP);
            }
            i1w0 i1w0Var = (i1w0) objP;
            String name = fpi.class.getName();
            Context applicationContext = ((Context) fetVar4.k(dy2.b)).getApplicationContext();
            yje yjeVar2 = null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar4);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP2 = fetVar4.P();
            if (objP2 == obj) {
                objP2 = new rlb0(application, i1w0Var, b2);
                fetVar4.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar4.g(riu0VarA) | fetVar4.g(name);
            Object objP3 = fetVar4.P();
            if (zG || objP3 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 6);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar4.o0(objP3);
            }
            Object obj2 = ((kgd) objP3).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.games_section.feature.popular.impl.di.PopularOneXGamesComponent");
                return;
            }
            fpi fpiVar = (fpi) obj2;
            Object objP4 = fetVar4.P();
            if (objP4 == obj) {
                objP4 = (epi) fpiVar.T.get();
                fetVar4.o0(objP4);
            }
            epi epiVar = (epi) objP4;
            Object objP5 = fetVar4.P();
            if (objP5 == obj) {
                objP5 = fpiVar.P;
                fetVar4.o0(objP5);
            }
            Object obj3 = (wdk0) objP5;
            sgy sgyVarB = sre0.f32672a.b(kgb0.class);
            q0h0 q0h0Var = new q0h0(epiVar);
            int i2 = kgb0.k0;
            k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar4, 14);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar4.i(k3t0VarX);
            Object objP6 = fetVar4.P();
            if (zI || objP6 == obj) {
                objP6 = new w480(k3t0VarX, yjeVar2, b2);
                fetVar4.o0(objP6);
            }
            m0x0.t(fetVar4, unit, (Function2) objP6);
            boolean zI2 = fetVar4.i(k3t0VarX);
            Object objP7 = fetVar4.P();
            if (zI2 || objP7 == obj) {
                objP7 = new dbh(k3t0VarX, (byte) 16);
                fetVar4.o0(objP7);
            }
            Function0 function1 = (Function0) objP7;
            boolean zI3 = fetVar4.i(k3t0VarX);
            Object objP8 = fetVar4.P();
            if (zI3 || objP8 == obj) {
                objP8 = new dbh(k3t0VarX, (byte) 17);
                fetVar4.o0(objP8);
            }
            v3c.z(function1, (Function0) objP8, null, fetVar4, 0, 4);
            fet fetVar5 = fetVar4;
            boolean zI4 = fetVar5.i(k3t0VarX) | fetVar5.i(obj3) | fetVar5.i(fragment);
            Object objP9 = fetVar5.P();
            if (zI4 || objP9 == obj) {
                objP9 = new zlb0(k3t0VarX, obj3, fragment, b3);
                fetVar5.o0(objP9);
            }
            clz clzVar2 = (clz) fetVar5.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP9, fetVar5);
            boolean zI5 = fetVar5.i(k3t0VarX) | fetVar5.i(clzVar2) | fetVar5.e(3) | fetVar5.g(pz40VarF);
            Object objP10 = fetVar5.P();
            if (zI5 || objP10 == obj) {
                k3t0Var = k3t0VarX;
                clzVar = clzVar2;
                Object kc70Var = new kc70(k3t0Var, clzVar, pz40VarF, null, (byte) 5);
                yjeVar = null;
                fetVar5.o0(kc70Var);
                objP10 = kc70Var;
            } else {
                k3t0Var = k3t0VarX;
                clzVar = clzVar2;
                yjeVar = null;
            }
            m0x0.t(fetVar5, clzVar, (Function2) objP10);
            i3t0 i3t0Var = (i3t0) k3t0Var;
            vfb0 vfb0Var = (vfb0) i3t0Var.y(fetVar5).getValue();
            n0q n0qVar = o7k0.c;
            Object objP11 = fetVar5.P();
            byte b4 = 9;
            if (objP11 == obj) {
                objP11 = new peb0(b4);
                fetVar5.o0(objP11);
            }
            mm40 mm40VarQ = i120.Q(rq8.K(n0qVar, (Function1) objP11).e(n0qVar), vfb0Var.f37322a, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarQ);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            if (vfb0Var.c != null) {
                fetVar5.e0(1738313853);
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar5, false), 7);
                mdm mdmVar = vfb0Var.c;
                boolean zI6 = fetVar5.i(i3t0Var);
                Object objP12 = fetVar5.P();
                if (zI6 || objP12 == obj) {
                    objP12 = new ui6(i3t0Var, b4);
                    fetVar5.o0(objP12);
                }
                jcb.l(mm40VarN, mdmVar, false, (Function0) objP12, fetVar, 0, 4);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(1738608477);
                xcz xczVarA = ddz.a(0, 0, fetVar5, 0, 3);
                boolean zG2 = fetVar5.g(xczVarA) | fetVar5.g(rdo0Var);
                Object objP13 = fetVar5.P();
                if (zG2 || objP13 == obj) {
                    objP13 = new fkg(xczVarA, rdo0Var, yjeVar, (byte) 2);
                    fetVar5.o0(objP13);
                }
                pvm0.e((Function2) objP13, fetVar5, 0);
                List list = vfb0Var.b;
                boolean zI7 = fetVar5.i(i3t0Var);
                Object objP14 = fetVar5.P();
                if (zI7 || objP14 == obj) {
                    Object e9b0Var = new e9b0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                    fetVar5.o0(e9b0Var);
                    objP14 = e9b0Var;
                }
                nia0.S(6, fetVar5, xczVarA, n0qVar, list, (Function1) ((jhy) objP14));
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3b0(i, (byte) 10);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: a.fet
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
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void B(a4x a4xVar, boolean z, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        a4x a4xVar2;
        int i2;
        fet fetVar2;
        Object obj;
        float f;
        char c2;
        boolean z2;
        fet fetVar3;
        int i3;
        Function1 function2;
        xcz xczVar2 = xczVar;
        fet fetVar4 = fetVar;
        a4xVar.getClass();
        xczVar2.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar4.g0(-1397343458);
        if ((i & 6) == 0) {
            a4xVar2 = a4xVar;
            i2 = (fetVar4.g(a4xVar2) ? 4 : 2) | i;
        } else {
            a4xVar2 = a4xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar4.g(xczVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar4.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar4.i(function1) ? 16384 : 8192;
        }
        if (fetVar4.U(i2 & 1, (i2 & 9363) != 9362)) {
            h5m h5mVarL = zjb.L(1, fetVar4);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : a4xVar2) {
                if (obj2 instanceof zog) {
                    arrayList.add(obj2);
                }
            }
            zog zogVar = (zog) CollectionsKt.firstOrNull(arrayList);
            float f2 = xfn.a(fetVar4).c;
            mm40 mm40VarV = cjx.V(o7k0.c, h5mVarL.e, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarV);
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
            m5m m5mVar = zogVar != null ? zogVar.b : null;
            m5m m5mVar2 = m5mVar != null ? m5mVar : null;
            b6m b6mVar = m5mVar2 != null ? m5mVar2.f21226a.i : null;
            Object obj3 = ukd.f35823a;
            if (b6mVar != null) {
                fetVar4.e0(-1261359076);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40.b, f2, 4.0f, f2, 0.0f, 8);
                m5m m5mVar3 = zogVar.b;
                int i4 = i2 & 57344;
                boolean z3 = i4 == 16384;
                Object objP = fetVar4.P();
                if (z3 || objP == obj3) {
                    function2 = function1;
                    objP = new a9g0(function2, (byte) 21);
                    fetVar4.o0(objP);
                } else {
                    function2 = function1;
                }
                Function1 function3 = (Function1) objP;
                boolean z4 = i4 == 16384;
                Object objP2 = fetVar4.P();
                if (z4 || objP2 == obj3) {
                    objP2 = new dng0(function2, (byte) 16);
                    fetVar4.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean zG = (i4 == 16384) | fetVar4.g(zogVar);
                Object objP3 = fetVar4.P();
                if (zG || objP3 == obj3) {
                    objP3 = new mk40(function2, zogVar, (byte) 3);
                    fetVar4.o0(objP3);
                }
                Function0 function4 = (Function0) objP3;
                boolean z5 = i4 == 16384;
                Object objP4 = fetVar4.P();
                if (z5 || objP4 == obj3) {
                    objP4 = new a9g0(function2, (byte) 28);
                    fetVar4.o0(objP4);
                }
                Function1 function5 = (Function1) objP4;
                boolean z6 = i4 == 16384;
                Object objP5 = fetVar4.P();
                if (z6 || objP5 == obj3) {
                    objP5 = new a9g0(function2, (byte) 29);
                    fetVar4.o0(objP5);
                }
                obj = obj3;
                f = f2;
                c2 = ' ';
                j5m.a(mm40VarN, m5mVar3, h5mVarL, function3, function0, function4, null, function5, (Function1) objP5, fetVar4, 0, 64);
                fet fetVar5 = fetVar4;
                z2 = false;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                obj = obj3;
                f = f2;
                c2 = ' ';
                z2 = false;
                fetVar4.e0(-1260173202);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar2 = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f, 0.0f, f, 28.0f, 2);
            int i5 = i2 & 896;
            boolean zG2 = ((i2 & 14) == 4 ? true : z2) | ((i2 & 112) == c2 ? true : z2) | (i5 == 256 ? true : z2) | ((i2 & 7168) == 2048 ? true : z2) | fetVar3.g(m5mVar2) | ((i2 & 57344) == 16384 ? true : z2);
            Object objP6 = fetVar3.P();
            Object obj4 = obj;
            if (zG2 || objP6 == obj4) {
                i3 = i2;
                xah0 xah0Var = new xah0(a4xVar2, z, xczVar2, qdzVar, m5mVar2, function1, (byte) 2);
                fetVar3.o0(xah0Var);
                objP6 = xah0Var;
            } else {
                i3 = i2;
            }
            b8k0.e(x7zVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP6, fetVar3, (i3 >> 3) & 112, Response.SERVER_TIMEOUT);
            xczVar2 = xczVar;
            fetVar3.r(r10);
            Unit unit = Unit.f46060a;
            boolean z7 = i5 == 256 ? true : z2;
            Object objP7 = fetVar3.P();
            if (z7 || objP7 == obj4) {
                objP7 = new wi6(xczVar2, null, (byte) 14);
                fetVar3.o0(objP7);
            }
            m0x0.t(fetVar3, unit, (Function2) objP7);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yah0(a4xVar, z, xczVar2, qdzVar, function1, i, (byte) 2);
        }
    }

    public static final void C(zdm0 zdm0Var, j9m0 j9m0Var, fet fetVar, int i) {
        m78 m78Var;
        fetVar.g0(-1648050881);
        int i2 = (fetVar.g(zdm0Var) ? 4 : 2) | i | (fetVar.g(j9m0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            eme emeVarA = zdm0Var.a();
            eme emeVar = eme.b;
            m78 m78Var2 = null;
            if (emeVarA == emeVar) {
                fetVar.e0(-1312392346);
                m78Var = new m78(((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), 16);
                fetVar.r(false);
            } else {
                fetVar.e0(-1312235394);
                fetVar.r(false);
                m78Var = null;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 256.0f), 1.0f);
            pge pgeVar = gqw0.A;
            String str = j9m0Var.b;
            int i3 = j9m0Var.c;
            i4 i4VarG0 = dyb.g0(str, j9m0Var.f16147a);
            if (zdm0Var.a() == emeVar) {
                fetVar.e0(-1311810042);
                m78Var2 = new m78(((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), 16);
                fetVar.r(false);
            } else {
                fetVar.e0(-1311653090);
                fetVar.r(false);
            }
            p8a.d(mm40VarD, i4VarG0, m78Var2, new gfm0(a8k0.F(i3, 0, fetVar), m78Var), new gfm0(a8k0.F(i3, 0, fetVar), m78Var), pgeVar, fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bgm0(zdm0Var, j9m0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0227  */
    /* JADX WARN: Code duplicated, block: B:128:0x022b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0286  */
    /* JADX WARN: Code duplicated, block: B:132:0x028a  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:140:0x034c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0350  */
    /* JADX WARN: Code duplicated, block: B:143:0x0379  */
    /* JADX WARN: Code duplicated, block: B:146:0x0386  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public static final void D(mm40 mm40Var, f9m0 f9m0Var, zdm0 zdm0Var, j9m0 j9m0Var, boolean z, Function0 function0, Function1 function1, Function0 function2, ugd ugdVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Function1 function3;
        int i4;
        Function0 function4;
        int i5;
        int i6;
        boolean z2;
        zdm0 zdm0Var2;
        mm40 mm40Var3;
        Function0 function5;
        Function1 function6;
        yfe0 yfe0VarU;
        Function1 function7;
        boolean z3;
        Activity activity;
        Window window;
        Object objP;
        cl5 cl5Var;
        eme emeVar;
        boolean zI;
        Object objP2;
        int iOrdinal;
        boolean z4;
        long jE;
        int iOrdinal2;
        long jM123getWhite0d7_KjU;
        k6z k6zVar;
        boolean z5;
        pcy pcyVar;
        ga50 ea50Var;
        int i7;
        ugd ugdVar2 = ugdVar;
        fet fetVar2 = fetVar;
        f9m0Var.getClass();
        zdm0Var.getClass();
        j9m0Var.getClass();
        fetVar2.g0(-1428779078);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar2.g(f9m0Var) : fetVar2.i(f9m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.g(zdm0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.g(j9m0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        int i9 = i2 & 64;
        if (i9 == 0) {
            if ((1572864 & i) == 0) {
                function3 = function1;
                i3 |= fetVar2.i(function3) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                i3 |= 12582912;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i & 12582912) == 0) {
                    if (fetVar2.i(function4)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
            }
            if ((i & 100663296) == 0) {
                if (fetVar2.i(ugdVar2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar2.U(i6 & 1, z2)) {
                if (i8 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i9 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                z3 = !pkd.c(fetVar2);
                activity = (Activity) fetVar2.k(cr00.f4820a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = zdm0Var.a();
                    fetVar2.o0(objP);
                }
                emeVar = (eme) objP;
                zI = fetVar2.i(window) | fetVar2.h(z3);
                objP2 = fetVar2.P();
                if (zI || objP2 == cl5Var) {
                    objP2 = new agm0(window, emeVar, z3, (byte) 0);
                    fetVar2.o0(objP2);
                }
                v3c.z((Function0) objP2, null, null, fetVar2, 0, 6);
                iOrdinal = zdm0Var.a().ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    z4 = false;
                    jE = b1j.e(fetVar2, 1332872357, fetVar2, false);
                } else {
                    if (iOrdinal != 2) {
                        throw b1j.f(1332867600, fetVar2, false);
                    }
                    fetVar2.e0(1332874724);
                    jE = afn0.m(fetVar2).getBackground();
                    z4 = false;
                    fetVar2.r(false);
                }
                iOrdinal2 = zdm0Var.a().ordinal();
                if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                    fetVar2.e0(1332881183);
                    jM123getWhite0d7_KjU = afn0.p(fetVar2).m123getWhite0d7_KjU();
                    fetVar2.r(z4);
                } else {
                    if (iOrdinal2 != 2) {
                        throw b1j.f(1332876425, fetVar2, z4);
                    }
                    fetVar2.e0(1332883363);
                    jM123getWhite0d7_KjU = afn0.m(fetVar2).getSecondary();
                    fetVar2.r(z4);
                }
                if (z) {
                    fetVar2.e0(1332885729);
                    k6zVar = (k6z) fetVar2.k(bmd.n);
                    fetVar2.r(z4);
                } else {
                    fetVar2.e0(1332886653);
                    fetVar2.r(z4);
                    k6zVar = k6z.f17794a;
                }
                n0q n0qVar = o7k0.c;
                mm40 mm40VarE = mm40Var2.e(n0qVar);
                Function1 function8 = function7;
                ljc ljcVar = jd8.n;
                Function0 function9 = function4;
                mm40 mm40VarS = knm0.s(0, fetVar2, i120.Q(mm40VarE, jE, ljcVar));
                long j = jE;
                zx7 zx7Var = gqw0.f11754a;
                tj30 tj30VarC = zq8.c(zx7Var, false);
                mm40 mm40Var4 = mm40Var2;
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
                mkd.c0.getClass();
                fetVar2.i0();
                z5 = fetVar2.S;
                pcyVar = e7z.u1;
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
                obc.d(bmd.n.a(k6zVar), u1c.M(-146879232, new bgm0(j9m0Var, zdm0Var), fetVar2), fetVar2, 56);
                mm40 mm40VarX = yyw.X(n0qVar, null, fetVar2, 1);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarX);
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
                ilm ilmVar = new ilm(jM123getWhite0d7_KjU);
                String strW = rsm0.w(f9m0Var.f9161a, 0, fetVar2);
                ha50 ha50Var = ha50.THREE_LINES;
                if (f9m0Var.h) {
                    ea50Var = new ea50(jM123getWhite0d7_KjU);
                } else {
                    ea50Var = fa50.f9191a;
                }
                imm immVar = new imm(ilmVar, new plm(strW, ha50Var, jM123getWhite0d7_KjU, ea50Var), f9m0Var.b, j, false, null);
                int i10 = i6 >> 6;
                int i11 = i6 >> 9;
                hlm.c(null, immVar, null, function0, function9, function8, null, null, null, null, null, null, fetVar2, (i10 & 7168) | (57344 & i11) | ((i6 >> 3) & 458752), 0, 4037);
                fetVar2 = fetVar2;
                zdm0Var2 = zdm0Var;
                zcm0.a(zdm0Var2, z, fetVar2, (i11 & 112) | (i10 & 14));
                zcl zclVar = qmk.l;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar2, zclVar2)), afn0.m(fetVar2).getBackground(), ljcVar);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                ugdVar2 = ugdVar;
                ua80.p(((i6 >> 21) & 112) | 6, ugdVar2, jr8.f16991a, fetVar2, true);
                fetVar2.r(true);
                fetVar2.r(true);
                function6 = function8;
                function5 = function9;
                mm40Var3 = mm40Var4;
            } else {
                zdm0Var2 = zdm0Var;
                fetVar2.X();
                mm40Var3 = mm40Var2;
                function5 = function4;
                function6 = function3;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var3, f9m0Var, zdm0Var2, j9m0Var, z, function0, function6, function5, ugdVar2, i, i2);
            }
        }
        i3 |= 1572864;
        function3 = function1;
        i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i & 12582912) == 0) {
                if (fetVar2.i(function4)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
        }
        if ((i & 100663296) == 0) {
            if (fetVar2.i(ugdVar2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((i6 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar2.U(i6 & 1, z2)) {
            if (i8 != 0) {
                mm40Var2 = jm40.b;
            }
            if (i9 != 0) {
                function7 = null;
            } else {
                function7 = function3;
            }
            if (i4 != 0) {
                function4 = null;
            }
            z3 = !pkd.c(fetVar2);
            activity = (Activity) fetVar2.k(cr00.f4820a);
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            objP = fetVar2.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = zdm0Var.a();
                fetVar2.o0(objP);
            }
            emeVar = (eme) objP;
            zI = fetVar2.i(window) | fetVar2.h(z3);
            objP2 = fetVar2.P();
            if (zI) {
                objP2 = new agm0(window, emeVar, z3, (byte) 0);
                fetVar2.o0(objP2);
            } else {
                objP2 = new agm0(window, emeVar, z3, (byte) 0);
                fetVar2.o0(objP2);
            }
            v3c.z((Function0) objP2, null, null, fetVar2, 0, 6);
            iOrdinal = zdm0Var.a().ordinal();
            if (iOrdinal != 0) {
                z4 = false;
                jE = b1j.e(fetVar2, 1332872357, fetVar2, false);
            } else {
                z4 = false;
                jE = b1j.e(fetVar2, 1332872357, fetVar2, false);
            }
            iOrdinal2 = zdm0Var.a().ordinal();
            if (iOrdinal2 != 0) {
                fetVar2.e0(1332881183);
                jM123getWhite0d7_KjU = afn0.p(fetVar2).m123getWhite0d7_KjU();
                fetVar2.r(z4);
            } else {
                fetVar2.e0(1332881183);
                jM123getWhite0d7_KjU = afn0.p(fetVar2).m123getWhite0d7_KjU();
                fetVar2.r(z4);
            }
            if (z) {
                fetVar2.e0(1332885729);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(z4);
            } else {
                fetVar2.e0(1332886653);
                fetVar2.r(z4);
                k6zVar = k6z.f17794a;
            }
            n0q n0qVar2 = o7k0.c;
            mm40 mm40VarE2 = mm40Var2.e(n0qVar2);
            Function1 function10 = function7;
            ljc ljcVar2 = jd8.n;
            Function0 function11 = function4;
            mm40 mm40VarS2 = knm0.s(0, fetVar2, i120.Q(mm40VarE2, jE, ljcVar2));
            long j2 = jE;
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
            mm40 mm40Var5 = mm40Var2;
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarS2);
            mkd.c0.getClass();
            fetVar2.i0();
            z5 = fetVar2.S;
            pcyVar = e7z.u1;
            if (z5) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC3, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM4, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf2, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC3, shdVar8);
            obc.d(bmd.n.a(k6zVar), u1c.M(-146879232, new bgm0(j9m0Var, zdm0Var), fetVar2), fetVar2, 56);
            mm40 mm40VarX2 = yyw.X(n0qVar2, null, fetVar2, 1);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarX2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar5);
            jpm0.o(fetVar2, bh90VarM5, shdVar6);
            vqd.u(iHashCode5, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar8);
            ilm ilmVar2 = new ilm(jM123getWhite0d7_KjU);
            String strW2 = rsm0.w(f9m0Var.f9161a, 0, fetVar2);
            ha50 ha50Var2 = ha50.THREE_LINES;
            if (f9m0Var.h) {
                ea50Var = new ea50(jM123getWhite0d7_KjU);
            } else {
                ea50Var = fa50.f9191a;
            }
            imm immVar2 = new imm(ilmVar2, new plm(strW2, ha50Var2, jM123getWhite0d7_KjU, ea50Var), f9m0Var.b, j2, false, null);
            int i12 = i6 >> 6;
            int i13 = i6 >> 9;
            hlm.c(null, immVar2, null, function0, function11, function10, null, null, null, null, null, null, fetVar2, (i12 & 7168) | (57344 & i13) | ((i6 >> 3) & 458752), 0, 4037);
            fetVar2 = fetVar2;
            zdm0Var2 = zdm0Var;
            zcm0.a(zdm0Var2, z, fetVar2, (i13 & 112) | (i12 & 14));
            zcl zclVar3 = qmk.l;
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarQ2 = i120.Q(lgb.J(n0qVar2, new ugg0(zclVar3, zclVar3, zclVar4, zclVar4)), afn0.m(fetVar2).getBackground(), ljcVar2);
            tj30 tj30VarC4 = zq8.c(zx7Var2, false);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarQ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC4, shdVar5);
            jpm0.o(fetVar2, bh90VarM6, shdVar6);
            vqd.u(iHashCode6, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar8);
            ugdVar2 = ugdVar;
            ua80.p(((i6 >> 21) & 112) | 6, ugdVar2, jr8.f16991a, fetVar2, true);
            fetVar2.r(true);
            fetVar2.r(true);
            function6 = function10;
            function5 = function11;
            mm40Var3 = mm40Var5;
        } else {
            zdm0Var2 = zdm0Var;
            fetVar2.X();
            mm40Var3 = mm40Var2;
            function5 = function4;
            function6 = function3;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wpm(mm40Var3, f9m0Var, zdm0Var2, j9m0Var, z, function0, function6, function5, ugdVar2, i, i2);
        }
    }

    public static final void E(mm40 mm40Var, f9m0 f9m0Var, zdm0 zdm0Var, j9m0 j9m0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function0 function3, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        zdm0 zdm0Var2;
        mm40 mm40Var2;
        boolean z2;
        k6z k6zVar;
        boolean z3;
        long jE;
        boolean z4;
        boolean z5;
        tlm nlmVar;
        fet fetVar2 = fetVar;
        long jM123getWhite0d7_KjU = f9m0Var.c;
        fetVar2.g0(-210847399);
        int i2 = i | 6 | (fetVar2.g(f9m0Var) ? 32 : 16) | (fetVar2.g(zdm0Var) ? 256 : 128) | (fetVar2.g(j9m0Var) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.i(function0) ? 131072 : 65536) | (fetVar2.i(function1) ? 1048576 : 524288) | (fetVar2.i(function2) ? 8388608 : 4194304) | (fetVar2.i(function3) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            boolean z6 = !pkd.c(fetVar2);
            Activity activity = (Activity) fetVar2.k(cr00.f4820a);
            Window window = activity != null ? activity.getWindow() : null;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = zdm0Var.a();
                fetVar2.o0(objP);
            }
            eme emeVar = (eme) objP;
            boolean zI = fetVar2.i(window) | fetVar2.h(z6);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                z2 = true;
                objP2 = new agm0(window, emeVar, z6, (byte) 1);
                fetVar2.o0(objP2);
            } else {
                z2 = true;
            }
            v3c.z((Function0) objP2, null, null, fetVar2, 0, 6);
            if (z) {
                fetVar2.e0(-760858016);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-760857092);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE0 = o2e.e0(knm0.s(0, fetVar2, n0qVar), "STATISTIC_SCREEN_WITH_SEARCH");
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
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
            obc.d(bmd.n.a(k6zVar), u1c.M(-1643142189, new cgm0(zdm0Var, f9m0Var, j9m0Var, (byte) 0), fetVar2), fetVar2, 56);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int iOrdinal = zdm0Var.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                z3 = false;
                jE = b1j.e(fetVar2, 1090976424, fetVar2, false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1090971187, fetVar2, false);
                }
                fetVar2.e0(1090979047);
                jE = afn0.m(fetVar2).getBackground();
                z3 = false;
                fetVar2.r(false);
            }
            boolean z8 = f9m0Var.d;
            long j = jE;
            if (h2t0.a(jM123getWhite0d7_KjU, y3d.g)) {
                fetVar2.e0(-539170227);
                int iOrdinal2 = zdm0Var.a().ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    z4 = false;
                    fetVar2.e0(1090992322);
                    jM123getWhite0d7_KjU = afn0.p(fetVar2).m123getWhite0d7_KjU();
                    fetVar2.r(false);
                } else {
                    if (iOrdinal2 != 2) {
                        throw b1j.f(1090986069, fetVar2, false);
                    }
                    fetVar2.e0(1090994886);
                    jM123getWhite0d7_KjU = afn0.m(fetVar2).getSecondary();
                    z4 = false;
                    fetVar2.r(false);
                }
                fetVar2.r(z4);
            } else {
                fetVar2.e0(-539265211);
                fetVar2.r(z3);
            }
            long j2 = jM123getWhite0d7_KjU;
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarD = o7k0.d(y860.j0(jm40Var, zcm0.i(fetVar2).f), 1.0f);
            ljc ljcVar = jd8.n;
            qxw.o(fetVar2, i120.Q(mm40VarD, j, ljcVar));
            if (z8) {
                fetVar2.e0(-538543872);
                fetVar2.r(false);
                nlmVar = new nlm(new hmm(f9m0Var.f, qfh0.f28634a, f9m0Var.g, f9m0Var.e));
                z5 = false;
            } else {
                fetVar2.e0(-538123016);
                z5 = false;
                plm plmVar = new plm(rsm0.w(f9m0Var.f9161a, 0, fetVar2), ha50.THREE_LINES, j2, fa50.f9191a);
                fetVar2.r(false);
                nlmVar = plmVar;
            }
            int i3 = i2 >> 6;
            int i4 = i2 >> 3;
            boolean z9 = z5;
            hlm.c(null, new imm(new ilm(j2), nlmVar, f9m0Var.b, j, false, null), null, function0, null, function1, function2, null, function3, null, null, null, fetVar2, (i3 & 7168) | (458752 & i4) | (i4 & 3670016) | (i2 & 234881024), 0, 3733);
            fetVar2 = fetVar2;
            if (z8) {
                zdm0Var2 = zdm0Var;
                fetVar2.e0(-536934011);
                fetVar2.r(z9);
            } else {
                fetVar2.e0(-537050292);
                zdm0Var2 = zdm0Var;
                zcm0.a(zdm0Var2, z, fetVar2, (i3 & 14) | ((i2 >> 9) & 112));
                fetVar2.r(z9);
            }
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar2, zclVar2)), afn0.m(fetVar2).getBackground(), ljcVar);
            tj30 tj30VarC2 = zq8.c(zx7Var, z9);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar2, 6);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            zdm0Var2 = zdm0Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wum(mm40Var2, f9m0Var, zdm0Var2, j9m0Var, z, function0, function1, function2, function3, ugdVar2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    public static final void F(boolean z, String str, th90 th90Var, k3t0 k3t0Var, fet fetVar, int i) {
        int i2;
        int i3;
        cl5 cl5Var;
        boolean z2;
        cl5 cl5Var2;
        boolean z3;
        boolean z4;
        Object objP;
        fetVar.g0(-450049020);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(th90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(k3t0Var) : fetVar.i(k3t0Var) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP2 = fetVar.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (objP2 == cl5Var3) {
                i3 = i2;
                cl5Var = cl5Var3;
                z2 = false;
                ocr ocrVar = new ocr(new pop(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24));
                fetVar.o0(ocrVar);
                objP2 = ocrVar;
            } else {
                i3 = i2;
                cl5Var = cl5Var3;
                z2 = false;
            }
            ocr ocrVar2 = (ocr) objP2;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z2);
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
            boolean zI = fetVar.i(ocrVar2) | ((i3 & 14) == 4 ? true : z2);
            Object objP3 = fetVar.P();
            if (zI) {
                cl5Var2 = cl5Var;
            } else {
                cl5Var2 = cl5Var;
                if (objP3 == cl5Var2) {
                }
                Function1 function1 = (Function1) objP3;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i3 & 896) == 256) {
                    z2 = true;
                }
                z4 = z3 | z2;
                objP = fetVar.P();
                if (z4 || objP == cl5Var2) {
                    objP = new f5p(str, th90Var, (byte) 21);
                    fetVar.o0(objP);
                }
                dwi0.b(function1, n0qVar, (Function1) objP, fetVar, 48, 0);
                fetVar.r(true);
            }
            objP3 = new x9(z, (Object) ocrVar2, (byte) 23);
            fetVar.o0(objP3);
            Function1 function2 = (Function1) objP3;
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            z4 = z3 | z2;
            objP = fetVar.P();
            if (z4) {
                objP = new f5p(str, th90Var, (byte) 21);
                fetVar.o0(objP);
            } else {
                objP = new f5p(str, th90Var, (byte) 21);
                fetVar.o0(objP);
            }
            dwi0.b(function2, n0qVar, (Function1) objP, fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(z, str, th90Var, k3t0Var, i);
        }
    }

    public static final void G(mm40 mm40Var, hvz hvzVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        pvi0 jvi0Var;
        fetVar.g0(-568415491);
        int i2 = i | 6 | (fetVar.g(hvzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f, 0.0f, 2);
            String str = hvzVar.f13746a;
            String str2 = hvzVar.b;
            boolean z2 = hvzVar.d;
            tui0 tui0Var = new tui0(str, null);
            if (z2) {
                z = true;
                fetVar.e0(1390871942);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            } else {
                fetVar.e0(1390650137);
                zfn zfnVar = zaq0.b;
                z = true;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, hvzVar.c, !z2, (e900) null, 314);
            boolean z3 = (i2 & 896) == 256 ? z : false;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yqz(function1, (byte) 8);
                fetVar.o0(objP);
            }
            obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 232);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, hvzVar, function1, i, (byte) 1);
        }
    }

    public static final void H(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(7081611);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 2);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 2);
        }
    }

    public static final void I(k3t0 k3t0Var, int i, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        k3t0Var.getClass();
        fetVar.g0(1910656273);
        int i4 = (fetVar.i(k3t0Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            int i5 = i4 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            String str = ((asr0) pz40VarY.getValue()).c;
            boolean z = i5 == 4 || fetVar.i(i3t0Var);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ebh(i3t0Var, (byte) 15);
                fetVar.o0(objP);
            }
            i3 = i;
            fetVar2 = fetVar;
            l(pz40VarY, str, i3, (Function1) objP, fetVar2, (i4 << 3) & 896);
        } else {
            i3 = i;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lqr0(k3t0Var, i3, i2, b2);
        }
    }

    public static final mm40 J(mm40 mm40Var, float f, float f2) {
        return mm40Var.e(new oe60(f, f2, false, new mb50((byte) 27)));
    }

    public static final t53 K(fet fetVar) {
        TypedArray typedArrayObtainAttributes;
        TypedArray typedArrayObtainAttributes2;
        Context context = (Context) fetVar.k(dy2.b);
        Resources resources = (Resources) fetVar.k(dy2.c);
        Resources.Theme theme = context.getTheme();
        boolean zE = fetVar.e(R.drawable.ic_glyph_live_indicator_animated);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            XmlResourceParser xml = resources.getXml(R.drawable.ic_glyph_live_indicator_animated);
            j5n0.C(xml);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            int[] iArr = cy2.c;
            if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
            }
            try {
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                ArrayList arrayList = new ArrayList();
                xml.next();
                while (!j5n0.B(xml) && (xml.getEventType() != 3 || !Intrinsics.d(xml.getName(), "animated-vector"))) {
                    if (xml.getEventType() == 2 && Intrinsics.d(xml.getName(), "target")) {
                        int[] iArr2 = cy2.d;
                        if (theme == null || (typedArrayObtainAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                            typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArrayObtainAttributes2.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            n63 n63Var = new n63(string, c83.a(typedArrayObtainAttributes2.getResourceId(1, 0), theme, resources));
                            typedArrayObtainAttributes2.recycle();
                            arrayList.add(n63Var);
                        } catch (Throwable th) {
                            typedArrayObtainAttributes2.recycle();
                            throw th;
                        }
                    }
                    xml.next();
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(resourceId, typedValue, true);
                XmlResourceParser xml2 = resources.getXml(resourceId);
                k5n0.y(xml2);
                t53 t53Var = new t53(jpm0.m(theme, resources, xml2, typedValue.changingConfigurations).f31526a, arrayList);
                typedArrayObtainAttributes.recycle();
                fetVar.o0(t53Var);
                objP = t53Var;
            } catch (Throwable th2) {
                typedArrayObtainAttributes.recycle();
                throw th2;
            }
        }
        return (t53) objP;
    }

    public static final u5d0 L(ur0 ur0Var) {
        ur0Var.getClass();
        y5d0 y5d0Var = ur0Var.d;
        if (y5d0Var instanceof u5d0) {
            return (u5d0) y5d0Var;
        }
        return null;
    }

    public static final vae0 M(gmq gmqVar, vne vneVar) {
        vneVar.getClass();
        yje yjeVar = null;
        byte b2 = 1;
        gmq gmqVarS = idx.S(new qmq(gmqVar, new zo1(yjeVar, (Object) vneVar, (byte) 7), yjeVar, b2));
        int i = 3;
        ko0 ko0Var = new ko0(i, yjeVar);
        gmqVarS.getClass();
        byte b3 = 0;
        return vtb.g0(new dnq(new fnq(new ak9(new vsg0(new qmq(gmqVarS, ko0Var, yjeVar, b3)), (byte) 0), new p23(2, yjeVar, b2)), new bk9(i, yjeVar, b3), (byte) 0), vneVar, kpj0.b, 1);
    }

    public static final void N(Window window, eme emeVar, boolean z) {
        int iA;
        boolean z2;
        boolean z3;
        Context context = window.getContext();
        context.getClass();
        int iOrdinal = emeVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iA = R.color.static_transparent;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            TypedValue typedValue = j5d.f15927a;
            Context context2 = window.getContext();
            context2.getClass();
            iA = j5d.a(context2, R.attr.uikitBackground, true);
        }
        TypedValue typedValue2 = j5d.f15927a;
        Context context3 = window.getContext();
        context3.getClass();
        int iA2 = j5d.a(context3, R.attr.uikitBackgroundContent, true);
        int iOrdinal2 = emeVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            z2 = z;
            z3 = false;
        } else if (iOrdinal2 != 2) {
            t9f.b();
            return;
        } else {
            z2 = z;
            z3 = z2;
        }
        ofm0.A(window, context, iA, iA2, z3, z2);
    }

    public static final qzl O(ygs ygsVar, ctf0 ctf0Var) {
        BetGroupZip betGroupZip;
        tzl rzlVar;
        k0d k0dVar;
        ygsVar.getClass();
        ctf0Var.getClass();
        List list = ygsVar.x;
        boolean z = ygsVar.v;
        if (list == null || (betGroupZip = (BetGroupZip) CollectionsKt.firstOrNull(list)) == null) {
            long j = ygsVar.f42600a;
            return new qzl(j, 0L, j, "", z ? uzl.f36540a : uzl.b, new rzl(ctf0Var.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0))));
        }
        List list2 = betGroupZip.f;
        long j2 = ygsVar.f42600a;
        long j3 = betGroupZip.b;
        String str = betGroupZip.c;
        uzl uzlVar = z ? uzl.f36540a : uzl.b;
        if (list2.isEmpty()) {
            rzlVar = new rzl(ctf0Var.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0)));
        } else {
            List<BetZip> listD0 = CollectionsKt.D0(list2, 3);
            ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
            for (BetZip betZip : listD0) {
                String str2 = betZip.t;
                String str3 = betZip.g;
                izc izcVar = betZip.v;
                boolean z2 = betZip.f;
                int iOrdinal = izcVar.ordinal();
                if (iOrdinal == 0) {
                    k0dVar = k0d.c;
                } else if (iOrdinal == 1) {
                    k0dVar = k0d.d;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    k0dVar = k0d.f17460a;
                }
                if (z2) {
                    k0dVar = k0d.b;
                }
                k0d k0dVar2 = k0dVar;
                a65 a65Var = a65.f301a;
                arrayList.add(new d4l0(str2, str3, k0dVar2, betZip.y, betZip.w, betZip.h1, new xgl0(betZip.f46426a, betZip.d, betZip.b, betZip.t, 0, 0L, 0, 0L, false)));
            }
            rzlVar = new szl(dyb.r0(arrayList));
        }
        return new qzl(j2, j3, j2, str, uzlVar, rzlVar);
    }

    public static final mm40 P(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new ze60(function1, new i160(function1, (byte) 1)));
    }

    public static final mm40 Q(mm40 mm40Var, float f, float f2) {
        return mm40Var.e(new oe60(f, f2, true, new mb50((byte) 28)));
    }

    public static mm40 R(mm40 mm40Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return Q(mm40Var, f, f2);
    }

    public static final ijl S(kg kgVar) {
        int iOrdinal = kgVar.ordinal();
        if (iOrdinal == 0) {
            return ijl.f14880a;
        }
        if (iOrdinal == 1) {
            return ijl.b;
        }
        if (iOrdinal == 2) {
            return ijl.c;
        }
        if (iOrdinal == 3) {
            return ijl.d;
        }
        if (iOrdinal == 4) {
            return ijl.e;
        }
        t9f.b();
        return null;
    }

    public static final co4 T(wrd wrdVar) {
        kse0 kse0Var;
        wrdVar.getClass();
        Boolean bool = wrdVar.j2.u;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(wrdVar.k2.v, bool2);
        boolean zD3 = Intrinsics.d(wrdVar.l2.w, bool2);
        boolean zD4 = Intrinsics.d(wrdVar.o2.z, bool2);
        boolean zD5 = Intrinsics.d(wrdVar.p2.A, bool2);
        boolean zD6 = Intrinsics.d(wrdVar.q2.B, bool2);
        boolean zD7 = Intrinsics.d(wrdVar.r2.C, bool2);
        boolean zD8 = Intrinsics.d(wrdVar.s2.D, bool2);
        boolean zD9 = Intrinsics.d(wrdVar.x2.K, bool2);
        boolean zD10 = Intrinsics.d(wrdVar.y2.N, bool2);
        List list = wrdVar.H6.h;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = wrdVar.I6.i;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        boolean zD11 = Intrinsics.d(wrdVar.z2.O, bool2);
        Integer num = wrdVar.A2.P;
        int iIntValue = num != null ? num.intValue() : 18;
        boolean zD12 = Intrinsics.d(wrdVar.f1.T0, bool2);
        Boolean bool3 = wrdVar.t2.E;
        boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : false;
        String str = wrdVar.c6.t0;
        kse0[] kse0VarArrValues = kse0.values();
        boolean z = zBooleanValue;
        int length = kse0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kse0Var = null;
                break;
            }
            int i2 = i;
            kse0Var = kse0VarArrValues[i2];
            int i3 = length;
            if (kse0Var.f18810a.equals(str)) {
                break;
            }
            i = i2 + 1;
            length = i3;
        }
        if (kse0Var == null) {
            kse0Var = kse0.DEFAULT;
        }
        List list3 = wrdVar.a2.F;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        return new co4(zD, zD2, zD3, zD4, zD5, zD6, zD7, zD8, zD9, zD10, list, list2, zD11, iIntValue, zD12, z, kse0Var, list3);
    }

    public static final ru6 U(pln plnVar) {
        plnVar.getClass();
        String plainString = new BigDecimal(String.valueOf(plnVar.l)).toPlainString();
        plainString.getClass();
        double d2 = plnVar.l;
        long j = plnVar.c;
        uoy uoyVar = plnVar.g ? uoy.LIVE : uoy.LINE;
        double d3 = plnVar.e;
        long j2 = plnVar.f;
        long j3 = plnVar.b;
        std stdVar = gwe.b;
        return new ru6(-1L, plainString, d2, j, uoyVar, d3, j2, j3, 0, (Double) null, (String) null, 3328);
    }

    public static final void a(mm40 mm40Var, l7m0 l7m0Var, fu1 fu1Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        pcy pcyVar;
        ugd ugdVar2 = ugdVar;
        fu1Var.getClass();
        function1.getClass();
        fetVar.g0(361847271);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(fu1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(s5x0.N(n0qVar, 0.0f, ((Number) l7m0Var2.getValue()).floatValue() * 24.0f, 0.0f, 0.0f, 13), vgg0.c((1.0f - ((Number) l7m0Var2.getValue()).floatValue()) * 16.0f, (1.0f - ((Number) l7m0Var2.getValue()).floatValue()) * 16.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar.l(pcyVar2);
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
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            int i3 = i2;
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            z5n.h(fu1Var.e.b, fu1Var.f, aoo0.b, null, b6n.f2063a, true, function1, fetVar, ((i3 << 9) & 3670016) | 221568, 8);
            fetVar.r(true);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, Integer.valueOf((i3 >> 12) & 14));
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bu1(mm40Var2, l7m0Var, fu1Var, function1, ugdVar2, i, (byte) 1);
        }
    }

    public static final void b(a4x a4xVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.n;
        a4xVar.getClass();
        function2.getClass();
        fetVar2.g0(85906411);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                if (z) {
                    zcl zclVar = qmk.f28987a;
                    objP = new qw3(8.0f, true, new gne(xx7Var, (byte) 12));
                } else {
                    objP = uc9.g;
                }
                fetVar2.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).c, 0.0f, 2);
            thg0 thg0VarA = shg0.a((ow3) objP, gqw0.j, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            jm40 jm40Var2 = jm40Var;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, 1358298013, a4xVar);
            while (itO.hasNext()) {
                r02 r02Var = (r02) itO.next();
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = dw9.j(fetVar2);
                }
                gy40 gy40Var = (gy40) objP2;
                boolean zI = ((i2 & 896) == 256) | fetVar2.i(r02Var);
                Object objP3 = fetVar2.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new mc((Object) function2, (Object) r02Var, (byte) 17);
                    fetVar2.o0(objP3);
                }
                mm40 mm40VarW = y860.W(jm40Var2, gy40Var, null, false, null, (Function0) objP3, 28);
                jm40 jm40Var3 = jm40Var2;
                zcl zclVar2 = qmk.f28987a;
                Iterator it = itO;
                mm40 mm40VarT = o7k0.t(mm40VarW, 56.0f, 64.0f);
                if (!z) {
                    mm40VarT.getClass();
                }
                x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarT);
                mkd.c0.getClass();
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
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                mm40 mm40VarN = o7k0.n(jm40Var3, 64.0f);
                long j = r02Var.f;
                String str = r02Var.d;
                shd shdVar5 = shdVar2;
                boolean z3 = r02Var.e;
                zcl zclVar3 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, i120.S(i120.Q(mm40VarN, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 2.0f, z3 ? y3d.c : y3d.f, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)));
                k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
                k1xVar.c = r02Var.c;
                lls0[] lls0VarArr = {new mrs0()};
                kuo kuoVar = q1x.f27974a;
                q1x.b(k1xVar, tx3.g0(lls0VarArr));
                shd shdVar6 = shdVar4;
                int i3 = i2;
                pcy pcyVar2 = pcyVar;
                cl5 cl5Var2 = cl5Var;
                shd shdVar7 = shdVar;
                shd shdVar8 = shdVar3;
                xx7 xx7Var2 = xx7Var;
                k7x.b(k1xVar.a(), null, mm40VarE, a8k0.F(R.drawable.cyber_composition_player_placeholder, 0, fetVar2), a8k0.F(R.drawable.cyber_composition_player_placeholder, 0, fetVar2), null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
                if (str.length() > 0) {
                    fetVar.e0(1822140263);
                    mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var3, 14.0f), gqw0.g);
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    k7x.a(str, null, i120.S(lgb.J(mm40VarB, ugg0Var2), 2.0f, StaticColors.INSTANCE.m62getBlack0d7_KjU(), ugg0Var2), null, null, fetVar, 48, 2040);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1822592615);
                    fetVar.r(false);
                }
                fetVar.r(true);
                v8q0.a(r02Var.b, s5x0.N(jm40Var3, 0.0f, 2.0f, 0.0f, 0.0f, 13), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, z3 ? new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109) : new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(true);
                jm40Var2 = jm40Var3;
                shdVar4 = shdVar6;
                itO = it;
                xx7Var = xx7Var2;
                shdVar2 = shdVar5;
                i2 = i3;
                shdVar = shdVar7;
                shdVar3 = shdVar8;
                pcyVar = pcyVar2;
                cl5Var = cl5Var2;
                function2 = function1;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) a4xVar, z, (Object) function1, i, (byte) 0);
        }
    }

    public static final void c(mm40 mm40Var, on5 on5Var, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        on5Var.getClass();
        function0.getClass();
        fetVar.g0(-1267764498);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(on5Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = on5Var instanceof dn5;
            mm40 mm40VarW = y860.W(mm40Var, null, null, z, null, function0, 24);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v8q0.a(on5Var.b(), o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, 48, 24960, 109564);
            fetVar2 = fetVar;
            if (on5Var instanceof cn5) {
                fetVar2.e0(939478390);
                mm40 mm40VarP = o7k0.p(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 128.0f, 28.0f);
                zcl zclVar = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
            } else {
                if (!z) {
                    throw b1j.f(1692871841, fetVar2, false);
                }
                fetVar2.e0(939892023);
                dn5 dn5Var = (dn5) on5Var;
                d(0, fetVar2, s5x0.N(jm40Var, 16.0f, 2.0f, 0.0f, 0.0f, 12), dn5Var.f6351a, dn5Var.b);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var, (Object) on5Var, function0, i, (byte) 14);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fetVar.g0(-1514921436);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(new daq0(qmk.w));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40Var2 = mm40Var;
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "CURRENCY_ROW_NEW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-464778168, new sg5(str, str2, pz40Var, b2), fetVar), fetVar, 56);
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small_16_secondary, 0, fetVar), null, s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 3);
        }
    }

    public static final void e(mm40 mm40Var, fop0 fop0Var, a4x a4xVar, int i, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        mm40 mm40Var2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1447043129);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(fop0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 = i;
            i4 |= fetVar.e(i3) ? 2048 : 1024;
        } else {
            i3 = i;
        }
        if ((i2 & 24576) == 0) {
            obj = function1;
            i4 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function1;
        }
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 4.0f, qmk.a(fetVar).c, 24.0f);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                ec3 ec3Var = new ec3((Object) a4xVar, (Object) fop0Var, i3, obj, (byte) 2);
                fetVar.o0(ec3Var);
                objP = ec3Var;
            }
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k53((byte) 1, i, i2, function1, mm40Var2, fop0Var, a4xVar);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-125283323);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            qwh0 qwh0Var = (qwh0) l7m0Var.getValue();
            if (qwh0Var instanceof nwh0) {
                fetVar.e0(11360390);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40Var, qmk.a(fetVar).e, 0.0f, qmk.a(fetVar).e, 12.0f, 2);
                nwh0 nwh0Var = (nwh0) qwh0Var;
                dxh0 dxh0Var = nwh0Var.c;
                a4x a4xVar = nwh0Var.f24234a;
                boolean zG = fetVar.g(qwh0Var);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new zo4(nwh0Var, (byte) 26);
                    fetVar.o0(objP);
                }
                ibc.n(mm40VarN, a4xVar, fxh0.f10310a, dxh0Var, false, (Function0) objP, function1, fetVar, ((i2 << 12) & 3670016) | 384, 16);
                fetVar.r(false);
            } else if (Intrinsics.d(qwh0Var, pwh0.f27711a)) {
                fetVar.e0(-138161559);
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar, o7k0.e(mm40Var, 48.0f));
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(qwh0Var, owh0.f25965a)) {
                    throw b1j.f(-138183488, fetVar, false);
                }
                fetVar.e0(-138158167);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x74(mm40Var, l7m0Var, function1, i, (byte) 1);
        }
    }

    public static final void g(ra10 ra10Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(329473094);
        byte b2 = 2;
        int i2 = (fetVar.g(ra10Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 1;
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, b2);
                fetVar.o0(objP);
            }
            vbw0.y(0, 1, fetVar, null, (Function1) objP);
            ju70.h(jr8.f16991a.b(jm40.b, gqw0.h), u1c.M(-1527555215, new gn(function1, (byte) 25), fetVar), fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new otz(ra10Var, function1, i, b3);
        }
    }

    public static final void h(e900 e900Var, fet fetVar, int i) {
        byte b2;
        fetVar.g0(824249902);
        int i2 = (fetVar.g(e900Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(n0qVar, background, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12));
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
            float f = xfn.a(fetVar).d;
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ2 = i120.Q(s5x0.N(jm40Var, f, 0.0f, f2, 0.0f, 10), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
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
            zq8.a(0, fetVar, i120.P(o7k0.p(s5x0.N(jm40Var, 12.0f, 14.0f, 0.0f, 10.0f, 4), 128.0f, 20.0f), e900Var, vgg0.f37379a, 4));
            int i3 = (i2 & 14) | 48;
            w(i3, fetVar, e900Var, false);
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            rcb.p(0, fetVar, s5x0.N(i120.Q(jm40Var, backgroundContent, ljcVar), 64.0f, 0.0f, 0.0f, 0.0f, 14));
            w(i3, fetVar, e900Var, true);
            b2 = 0;
            rcb.p(0, fetVar, s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 64.0f, 0.0f, 0.0f, 0.0f, 14));
            w(i3, fetVar, e900Var, false);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b2 = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbd(e900Var, i, b2);
        }
    }

    public static final void i(mm40 mm40Var, nea neaVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        nea neaVar2;
        t33 t33Var;
        t33 t33Var2;
        t33 t33Var3;
        t33 t33Var4;
        t33 t33Var5;
        t33 t33Var6;
        t33 t33Var7;
        pcy pcyVar;
        String str = neaVar.c;
        String str2 = neaVar.b;
        function1.getClass();
        fetVar.g0(1551619330);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(neaVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(str2);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(str);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            hea heaVar = neaVar.e;
            boolean z = neaVar.d;
            if (str2.length() > 0 && !z) {
                pz40Var.setValue(str2);
            }
            if (str.length() > 0 && !z) {
                pz40Var2.setValue(str);
            }
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var8 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = xf0.c(0.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var9 = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = xf0.c(1.0f);
                fetVar.o0(objP5);
            }
            t33 t33Var10 = (t33) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = xf0.c(1.0f);
                fetVar.o0(objP6);
            }
            t33 t33Var11 = (t33) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = xf0.c(0.0f);
                fetVar.o0(objP7);
            }
            t33 t33Var12 = (t33) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = xf0.c(1.0f);
                fetVar.o0(objP8);
            }
            t33 t33Var13 = (t33) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = xf0.c(1.0f);
                fetVar.o0(objP9);
            }
            t33 t33Var14 = (t33) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = xf0.c(0.0f);
                fetVar.o0(objP10);
            }
            t33 t33Var15 = (t33) objP10;
            Object objP11 = fetVar.P();
            if (objP11 == cl5Var) {
                objP11 = new xcf();
                fetVar.o0(objP11);
            }
            xcf xcfVar = (xcf) objP11;
            boolean zI = ((i2 & 112) == 32) | fetVar.i(xcfVar) | fetVar.i(t33Var8) | fetVar.i(t33Var9) | fetVar.i(t33Var10) | fetVar.i(t33Var11) | fetVar.i(t33Var12) | fetVar.i(t33Var13) | fetVar.i(t33Var14) | fetVar.i(t33Var15);
            Object objP12 = fetVar.P();
            if (zI || objP12 == cl5Var) {
                fea feaVar = new fea(neaVar, xcfVar, t33Var8, t33Var9, t33Var10, t33Var11, t33Var12, function1, t33Var13, t33Var14, t33Var15, pz40Var, pz40Var2, null);
                neaVar2 = neaVar;
                t33Var = t33Var11;
                t33Var2 = t33Var13;
                t33Var3 = t33Var14;
                t33Var4 = t33Var15;
                t33Var5 = t33Var8;
                t33Var6 = t33Var9;
                t33Var7 = t33Var10;
                fetVar.o0(feaVar);
                objP12 = feaVar;
            } else {
                t33Var = t33Var11;
                t33Var4 = t33Var15;
                t33Var2 = t33Var13;
                t33Var3 = t33Var14;
                neaVar2 = neaVar;
                t33Var7 = t33Var10;
                t33Var6 = t33Var9;
                t33Var5 = t33Var8;
            }
            m0x0.t(fetVar, r20, (Function2) objP12);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = i4w0.U(o7k0.p(J(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 26.0f, 7), -128.0f, 0.0f), 18.0f, 84.0f), 0.0f, 0.0f, ((Number) t33Var12.d()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            fetVar2 = fetVar;
            t33 t33Var16 = t33Var6;
            t33 t33Var17 = t33Var7;
            t33 t33Var18 = t33Var5;
            k7x.a(neaVar2.f23376a, null, jr8Var.b(mm40VarU, zx7Var2), null, null, fetVar2, 48, 2040);
            mm40 mm40VarB = jr8Var.b(o7k0.p(J(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 26.0f, 7), heaVar == hea.f12913a ? -120.0f : -96.0f, 0.0f), 78.0f, 116.0f), zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            k7x.a((String) pz40Var.getValue(), null, i4w0.U(jm40Var, ((Number) t33Var2.d()).floatValue(), 0.0f, ((Number) t33Var17.d()).floatValue(), ((Number) t33Var18.d()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048562), null, null, fetVar2, 48, 2040);
            if (((String) pz40Var.getValue()).length() > 0) {
                fetVar2.e0(-1295332480);
                mm40 mm40VarU2 = i4w0.U(o7k0.e(o7k0.s(jm40Var, 50.0f), 8.0f), ((Number) t33Var2.d()).floatValue(), 0.0f, ((Number) t33Var17.d()).floatValue(), ((Number) t33Var18.d()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048562);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
                long j = kkg.z;
                zq8.a(0, fetVar2, jr8Var.b(bww.U(mm40VarU2, 4.0f, ugg0Var2, j, j, 4), zx7Var2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1294521396);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarB2 = jr8Var.b(o7k0.p(J(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 36.0f, 7), 96.0f, 0.0f), 104.0f, 116.0f), zx7Var2);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarB2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            k7x.a((String) pz40Var2.getValue(), null, i4w0.U(i4w0.U(jm40Var, ((Number) t33Var3.d()).floatValue(), 0.0f, ((Number) t33Var.d()).floatValue(), ((Number) t33Var16.d()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048562), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) t33Var4.d()).floatValue(), osm0.e(0.0f, 0.5f), null, false, 0L, 0L, 0, null, 1047295), null, null, fetVar2, 48, 2040);
            if (((String) pz40Var2.getValue()).length() > 0) {
                fetVar2.e0(-411236778);
                mm40 mm40VarU3 = i4w0.U(o7k0.e(o7k0.s(jm40Var, 52.0f), 8.0f), ((Number) t33Var3.d()).floatValue(), 0.0f, ((Number) t33Var.d()).floatValue(), ((Number) t33Var16.d()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048562);
                zcl zclVar3 = qmk.m;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0 ugg0Var4 = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
                long j2 = kkg.z;
                zq8.a(0, fetVar2, jr8Var.b(bww.U(mm40VarU3, 4.0f, ugg0Var4, j2, j2, 4), zx7Var2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-410424733);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, neaVar, function1, i, (byte) 21);
        }
    }

    public static final void j(mm40 mm40Var, axa axaVar, Function1 function1, fet fetVar, int i) {
        shd shdVar;
        shd shdVar2;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        axaVar.getClass();
        fetVar2.g0(838421990);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(axaVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            ThemeColors themeColors = (ThemeColors) fetVar2.k(zfnVar);
            g1t0 g1t0Var = (g1t0) fetVar2.k(j1t0.e);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean z3 = axaVar.d;
            long primary = z3 ? themeColors.getPrimary() : themeColors.getTextPrimary();
            g1t0Var.getClass();
            y9q0 y9q0VarJ = z3 ? g1t0.j() : g1t0.k();
            boolean zH = fetVar2.h(z3);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Integer.valueOf(z3 ? 2 : 3);
                fetVar2.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarQ = i120.Q(o7k0.d(o7k0.e(lgb.J(mm40Var, xwa.d), xwa.f41600a), 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 4.0f, 0.0f, 2);
            boolean z4 = axaVar.e;
            boolean zG = ((i2 & 112) == 32) | fetVar2.g(pz40VarF);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new yw9(pz40VarF, axaVar, (byte) 5);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(phu0.F(mm40VarL, null, null, z4, null, (Function0) objP2, fetVar, 0, 11), "CASHBACK_CELL");
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar5);
            jpm0.n(fetVar);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar6);
            o0x o0xVar = axaVar.c;
            jm40 jm40Var = jm40.b;
            k(lgb.J(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), xwa.b), xwa.c), o0xVar, fetVar, 0);
            nw3 nw3Var = uc9.e;
            mm40 mm40VarL2 = s5x0.L(s5x0.N(new x7z(1.0f, true), 4.0f, 0.0f, 16.0f, 0.0f, 10), 0.0f, 12.0f, 1);
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar3);
            jpm0.o(fetVar, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar6);
            if (z3) {
                fetVar.e0(163473087);
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                z2 = true;
                j6n.h(rsm0.w(R.string.select_cashback_active, 0, fetVar), dqo0.f6527a, s5x0.N(new wkw(xx7Var), 0.0f, 0.0f, 0.0f, 2.0f, 7), 0, 0, fetVar, 48, 24);
                z = false;
                fetVar.r(false);
            } else {
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                z = false;
                z2 = true;
                fetVar.e0(163802710);
                fetVar.r(false);
            }
            boolean z6 = z2;
            v8q0.a(axaVar.b, o2e.e0(o7k0.d(jm40Var, 1.0f), "CASHBACK_CELL_TEXT"), primary, null, 0L, null, null, null, 0L, null, 0L, 2, false, iIntValue, 0, null, y9q0VarJ, fetVar, 48, 384, 110584);
            fetVar2 = fetVar;
            fetVar2.r(z6);
            if (axaVar.e) {
                fetVar2.e0(270991602);
                mm40 mm40VarL3 = twn.l(yx7Var, o7k0.n(jm40Var, 40.0f));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar3);
                jpm0.o(fetVar2, bh90VarM3, shdVar4);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                yom.b(null, axaVar.d, false, null, fetVar2, 0, 29);
                fetVar2.r(z6);
                fetVar2.r(false);
            } else {
                fetVar2.e0(271281824);
                fetVar2.r(false);
            }
            fetVar2.r(z6);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, axaVar, function1, i, (byte) 0);
        }
    }

    public static final void k(mm40 mm40Var, o0x o0xVar, fet fetVar, int i) {
        fetVar.g0(235471596);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(o0xVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mz3 mz3VarX = l7x.X(o0xVar.a(), null, null, fetVar, 0, 30);
            if (((lz3) ydx.F(mz3VarX.u, fetVar).getValue()) instanceof kz3) {
                fetVar.e0(1253025405);
                j0x.b(mz3VarX, null, mm40Var, null, gqw0.A, 0.0f, null, fetVar, ((i2 << 6) & 896) | 24624, 104);
                fetVar.r(false);
            } else {
                fetVar.e0(1253258091);
                zx7 zx7Var = gqw0.e;
                zfn zfnVar = zaq0.b;
                mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
                tj30 tj30VarC = zq8.c(zx7Var, false);
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
                zcl zclVar = qmk.f28987a;
                dww.c(a8k0.F(R.drawable.ic_glyph_currency_usd, 0, fetVar), null, o7k0.n(jm40.b, 32.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwa(mm40Var, o0xVar, i, b2);
        }
    }

    public static final void l(pz40 pz40Var, String str, int i, Function1 function1, fet fetVar, int i2) {
        int i3;
        agk0 agk0Var;
        pz40 pz40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1392703496);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(pz40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i4 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new y02(i, (byte) 6);
                fetVar2.o0(objP);
            }
            float fIntValue = ((Number) e9x.Q(objArr, (Function0) objP, fetVar2, 0)).intValue();
            zfn zfnVar = bmd.h;
            float fCeil = (int) Math.ceil(fIntValue / ((w6k) fetVar2.k(zfnVar)).getDensity());
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = androidx.compose.runtime.e.a(266.0f);
                fetVar2.o0(objP2);
            }
            agk0 agk0Var2 = (agk0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.a(agk0Var2.l());
                fetVar2.o0(objP3);
            }
            agk0 agk0Var3 = (agk0) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP4);
            }
            agk0 agk0Var4 = (agk0) objP4;
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            l7m0 l7m0VarB = d43.b(agk0Var4.l(), null, null, null, fetVar2, 0, 30);
            l7m0 l7m0VarB2 = d43.b(agk0Var3.l(), null, null, null, fetVar, 0, 30);
            boolean zD = fetVar.d(agk0Var2.l());
            Object objP5 = fetVar.P();
            if (zD || objP5 == cl5Var) {
                agk0Var = agk0Var3;
                objP5 = androidx.compose.runtime.e.e(new eh80(agk0Var3.l(), agk0Var2.l(), xczVarA, new fc3(agk0Var, (byte) 8), new t9r0((byte) 18)));
                fetVar.o0(objP5);
            } else {
                agk0Var = agk0Var3;
            }
            pz40 pz40Var3 = (pz40) objP5;
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            byte b2 = 14;
            atm0.d(str, fetVar, (i4 >> 3) & 14);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), fCeil);
            int i5 = i4 & 14;
            boolean zG = (i5 == 4) | fetVar.g(l7m0VarB);
            Object objP6 = fetVar.P();
            if (zG || objP6 == cl5Var) {
                objP6 = new b8q0((Object) pz40Var, (Object) l7m0VarB, (byte) 20);
                fetVar.o0(objP6);
            }
            mm40 mm40VarT = i4w0.T(mm40VarE, (Function1) objP6);
            zfn zfnVar2 = zaq0.b;
            long backgroundDark = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark();
            ljc ljcVar = jd8.n;
            zq8.a(0, fetVar, i120.Q(mm40VarT, backgroundDark, ljcVar));
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, fCeil, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 64.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD);
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
            n0q n0qVar = o7k0.c;
            boolean zG2 = fetVar.g(l7m0VarB);
            Object objP7 = fetVar.P();
            if (zG2 || objP7 == cl5Var) {
                objP7 = new mqr0(l7m0VarB, (byte) 3);
                fetVar.o0(objP7);
            }
            zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP7), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark(), ljcVar));
            int i6 = i4 & 7168;
            boolean z3 = i6 == 2048;
            Object objP8 = fetVar.P();
            if (z3 || objP8 == cl5Var) {
                objP8 = new sbr0(function1, b2);
                fetVar.o0(objP8);
            }
            yum0.a(0, fetVar, (Function0) objP8);
            fetVar.r(true);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            agk0Var4.m(1.0f - (agk0Var.l() / agk0Var2.l()));
            boolean z4 = i5 == 4;
            Object objP9 = fetVar.P();
            if (z4 || objP9 == cl5Var) {
                pz40Var2 = pz40Var;
                objP9 = new hu7(pz40Var2, agk0Var2, agk0Var);
                fetVar.o0(objP9);
            } else {
                pz40Var2 = pz40Var;
            }
            mm40 mm40VarD2 = o7k0.d(ro4.d0(jm40Var, (Function1) objP9), 1.0f);
            tj30 tj30VarC4 = zq8.c(zx7Var, false);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            irq0 irq0Var = ((asr0) pz40Var2.getValue()).f1404a;
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2);
            boolean z5 = i6 == 2048;
            Object objP10 = fetVar.P();
            if (z5 || objP10 == cl5Var) {
                objP10 = new sbr0(function1, (byte) 15);
                fetVar.o0(objP10);
            }
            k7n0.k(mm40VarL, irq0Var, (Function0) objP10, fetVar, 0);
            fetVar.r(true);
            boolean zG3 = fetVar.g(l7m0VarB);
            Object objP11 = fetVar.P();
            if (zG3 || objP11 == cl5Var) {
                objP11 = new mqr0(l7m0VarB, (byte) 4);
                fetVar.o0(objP11);
            }
            zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP11), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark(), ljcVar));
            float fS0 = ((w6k) fetVar.k(zfnVar)).s0(((Number) l7m0VarB2.getValue()).floatValue());
            ro4.R(null, ((asr0) pz40Var2.getValue()).b, (eh80) pz40Var3.getValue(), ycl.a(fS0, 0.0f) >= 0 ? fS0 : 0.0f, xczVarA, fetVar, 0);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) pz40Var, (Object) str, i, function1, i2, (byte) 10);
        }
    }

    public static final void m(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(516622643);
        int i4 = i2 & 1;
        byte b2 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            e900 e900VarJ = yyw.J(fetVar);
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
            h(e900VarJ, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, b2);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1345626088);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(82255524, new p7y(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(1891590009, new xs4(l7m0Var, function1, (byte) 3), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 23);
        }
    }

    public static final void o(mm40 mm40Var, cql cqlVar, Function2 function2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        pcy pcyVar;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        cqlVar.getClass();
        fetVar2.g0(-526074474);
        int i2 = i | 6 | (fetVar2.g(cqlVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var2, 186.0f), 256.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            byte b2 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new nme(b2, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new vef(function2, cqlVar, (byte) 13);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarK, null, null, false, null, (Function0) objP2, fetVar2, 0, 15);
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
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
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(jm40Var2, 98.0f), 1.0f), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            n0q n0qVar = o7k0.c;
            k7x.b(cqlVar.f.a(), null, yyw.V(n0qVar, k6zVar == k6z.b), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar2), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            mm40 mm40VarP = i120.P(o7k0.d(o7k0.e(jm40Var2, 48.0f), 1.0f), yk5.n(q3d.j(new y3d(afn0.p(fetVar).m75getBlack600d7_KjU()), new y3d(afn0.p(fetVar).m121getTransparent0d7_KjU())), 0.0f, 0.0f, 14), null, 6);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            zq8.a(0, fetVar, jr8Var.b(mm40VarP, zx7Var));
            zq8.a(0, fetVar, jr8Var.b(i120.P(o7k0.d(o7k0.e(jm40Var2, 40.0f), 1.0f), yk5.n(q3d.j(new y3d(afn0.p(fetVar).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar).m75getBlack600d7_KjU())), 0.0f, 0.0f, 14), null, 6), gqw0.h));
            mm40 mm40VarM = s5x0.M(n0qVar, 8.0f, 12.0f, 8.0f, 8.0f);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            wzr0 wzr0Var = cqlVar.g;
            if (wzr0Var == null) {
                fetVar.e0(1103816450);
                fetVar.r(false);
            } else {
                fetVar.e0(1103816451);
                ozb.n(jr8Var.b(jm40Var2, zx7Var2), wzr0Var, function0, fetVar, (i2 >> 3) & 896);
                fetVar.r(false);
            }
            mm40 mm40VarB = jr8Var.b(jm40Var2, gqw0.g);
            pcy pcyVar3 = pcyVar;
            String str = cqlVar.b;
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            v8q0.a(str, mm40VarB, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.u, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.q(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40 mm40VarM2 = s5x0.M(o7k0.c(jm40Var2, 1.0f), 8.0f, 8.0f, 8.0f, 12.0f);
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarM2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            ahb.n(null, u1c.M(-542664955, new yfg(cqlVar, (byte) 14), fetVar2), fetVar2, 384);
            if (cqlVar.c.length() > 0) {
                fetVar2.e0(830458915);
                String str2 = cqlVar.c;
                long textPrimary = afn0.m(fetVar2).getTextPrimary();
                afn0.v(fetVar2).getClass();
                jm40Var = jm40Var2;
                v8q0.a(str2, jm40Var, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.i(), fetVar, 48, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(830777440);
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
            yfe0VarU.d = new gf9((byte) 26, i, (Object) mm40Var2, (Object) cqlVar, (Object) function2, (Object) function0);
        }
    }

    public static final void p(long j, y8m y8mVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        y8mVar.getClass();
        n0x n0xVar = y8mVar.c;
        function1.getClass();
        fetVar2.g0(1063095515);
        int i2 = i | (fetVar2.f(j) ? 4 : 2) | (fetVar2.g(y8mVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40Var, 64.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new z8m(function1, y8mVar, (byte) 0);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(phu0.F(mm40VarS, null, null, false, null, (Function0) objP, fetVar2, 24960, 5), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM" + y8mVar.d);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 64.0f), 80.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            n0q n0qVar = o7k0.c;
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(lgb.J(n0qVar, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), j, jd8.n);
            zx7 zx7Var2 = gqw0.e;
            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ);
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
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = o2e.e0(o7k0.n(jm40Var, 44.0f), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_IMAGE");
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 36.0f), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_IMAGE");
            zfn zfnVar = zaq0.b;
            rq8.b((mm40) objP2, mm40VarE1, n0xVar, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, 12582918, 352);
            fetVar.r(true);
            fetVar.e0(315642217);
            fetVar.r(false);
            fetVar.r(true);
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f), 1.0f);
            tj30 tj30VarC4 = zq8.c(zx7Var2, false);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarE2 = o2e.e0(jm40Var, "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_LABEL");
            String str = y8mVar.d;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE2, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (y8mVar.e) {
                fetVar2.e0(-1488558176);
                n4c.k(y8mVar.f, fetVar2, 6);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1488484179);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2(j, (Object) y8mVar, function1, i, (byte) 3);
        }
    }

    public static final void q(mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(386843727);
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(jr8.f16991a.b(jm40Var, gqw0.e), mdmVar2, false, null, fetVar2, (i2 << 3) & 112, 12);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i, (byte) 7);
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1913930417);
        byte b2 = 16;
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i2 & 112, 0, fetVar, s5x0.L(jm40Var, f, 0.0f, 2), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i, b2);
        }
    }

    public static final void s(k3t0 k3t0Var, fet fetVar, int i) {
        byte b2;
        boolean z;
        k3t0Var.getClass();
        fetVar.g0(827721062);
        int i2 = i | (fetVar.g(k3t0Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            String strW = rsm0.w(R.string.web_statistic, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                objP = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                fetVar.o0(objP);
            }
            imm immVar = (imm) objP;
            n0q n0qVar = o7k0.c;
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarS = o050.S(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
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
            boolean z3 = i3 == 4;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new dbh(i3t0Var, (byte) 5);
                fetVar.o0(objP2);
            }
            b2 = 0;
            hlm.c(null, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4085);
            vcr vcrVar = (vcr) pz40VarY.getValue();
            if (vcrVar != null) {
                if (vcrVar instanceof tcr) {
                    fetVar.e0(2004421399);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
                    tcr tcrVar = (tcr) vcrVar;
                    F(tcrVar.b, tcrVar.d, tcrVar.c, i3t0Var, fetVar, (i2 << 9) & 7168);
                    if (tcrVar.f33731a) {
                        fetVar.e0(-209965476);
                        kpb.j(jr8.f16991a.b(jm40.b, gqw0.e), new dkm((ycl) null, new y3d(s6t0.b().f33626a.getPrimary()), 3), fetVar, 0, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-209730992);
                        fetVar.r(false);
                    }
                    z = true;
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    z = true;
                    if (vcrVar instanceof ucr) {
                        fetVar.e0(341776593);
                        q(((ucr) vcrVar).f35443a, fetVar, 0);
                        fetVar.r(false);
                    }
                }
                fetVar.r(z);
            }
            throw b1j.f(341750966, fetVar, false);
        }
        b2 = 0;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, b2);
        }
    }

    public static final void t(String str, fet fetVar, int i) {
        fetVar.g0(397556894);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, 16.0f, 4.0f, 0.0f, 0.0f, 12), new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 26, i, str);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(314242349);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 17);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-9052735);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((jvz) l7m0Var.getValue()).h) {
            fetVar.e0(893132636);
            g(((jvz) l7m0Var.getValue()).i, function1, fetVar, i2 & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(893063010);
            n(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 21);
        }
    }

    public static final void w(int i, fet fetVar, e900 e900Var, boolean z) {
        fetVar.g0(-1383753731);
        int i2 = (fetVar.g(e900Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14), 60.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 10.0f, 5), 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.P(mm40VarN, e900Var, ugg0Var, 4));
            zq8.a(0, fetVar, i120.P(s5x0.N(o7k0.p(jm40Var, z ? 96.0f : 128.0f, 16.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), e900Var, ugg0Var, 4));
            qxw.o(fetVar, new x7z(1.0f, true));
            zq8.a(0, fetVar, i120.P(s5x0.N(o7k0.p(jm40Var, 64.0f, 16.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), e900Var, ugg0Var, 4));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(e900Var, z, i, (byte) 3);
        }
    }

    public static final void x(int i, fet fetVar) {
        fetVar.g0(395918402);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jtz((byte) 1);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i, (byte) 28);
        }
    }

    public static final void y(final cvz cvzVar, final Function1 function1, fet fetVar, int i) {
        boolean z;
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(443922086);
        int i2 = (fetVar.g(cvzVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            qy qyVar = cvzVar.e;
            wui0 wui0Var = cvzVar.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (qyVar == null) {
                fetVar.e0(678710366);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar = new rqm((vui0) new rui0(cvzVar.c, null, cvzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new Function0() { // from class: a.fvz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            cvz cvzVar2 = cvzVar;
                            Function1 function2 = function1;
                            switch (b3) {
                                case 0:
                                    function2.invoke(new ouz(cvzVar2.f5053a));
                                    break;
                                default:
                                    function2.invoke(new ouz(cvzVar2.f5053a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 232);
                fetVar.r(false);
            } else {
                fetVar.e0(679321686);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
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
                mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar2 = new rqm((vui0) new rui0(cvzVar.c, null, cvzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    final byte b3 = 1;
                    objP2 = new Function0() { // from class: a.fvz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            cvz cvzVar2 = cvzVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new ouz(cvzVar2.f5053a));
                                    break;
                                default:
                                    function2.invoke(new ouz(cvzVar2.f5053a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                obc.q(mm40VarL2, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar, 384, 232);
                mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                zfn zfnVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                int iOrdinal = qyVar.b.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal == 2) {
                        yjj0VarA = ljcVar;
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                } else {
                    z = true;
                    zcl zclVar3 = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                }
                mm40 mm40VarQ = i120.Q(mm40VarL3, backgroundContent, yjj0VarA);
                zcl zclVar4 = qmk.f28987a;
                u(0, fetVar, s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), qyVar.f29510a);
                if (qyVar.b != wui0.d) {
                    fetVar.e0(505781998);
                    jcb.v(s5x0.N(i120.Q(s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(506200994);
                    fetVar.r(false);
                }
                fetVar.r(z);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(cvzVar, function1, i, (byte) 15);
        }
    }

    public static final void z(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(772529122);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            byte b2 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 3);
        }
    }
}
