package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Trace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;

/* JADX INFO: loaded from: classes5.dex */
public final class pwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f27712a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;
    public Object j;
    public Object k;

    public pwi(byte b) {
        switch (b) {
            case 12:
                this.h = new gb10[4];
                this.b = new Matrix[4];
                this.f = new Matrix[4];
                this.c = new PointF();
                this.g = new Path();
                this.i = new Path();
                this.d = new gb10();
                this.f27712a = new float[2];
                this.e = new float[2];
                this.j = new Path();
                this.k = new Path();
                for (int i = 0; i < 4; i++) {
                    ((gb10[]) this.h)[i] = new gb10();
                    ((Matrix[]) this.b)[i] = new Matrix();
                    ((Matrix[]) this.f)[i] = new Matrix();
                }
                break;
            default:
                xz40 xz40Var = new xz40(new jet[16]);
                this.f = xz40Var;
                iz40 iz40Var = v1h0.f36630a;
                this.c = new iz40();
                this.g = xz40Var;
                this.i = new xz40(new Object[16]);
                this.d = new xz40(new Function0[16]);
                break;
        }
    }

    public static final boolean h(jet jetVar, xz40 xz40Var) {
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            jff0 jff0Var = ((jet) objArr[i2]).f16392a;
            if (jff0Var instanceof i390) {
                xz40 xz40Var2 = ((i390) jff0Var).b;
                if (xz40Var2.j(jetVar) || h(jetVar, xz40Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static pwi j() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? bkj0.f2751a : new pwi((byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r6 == r7) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.zje r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            a.e1u r0 = (a.e1u) r0
            boolean r1 = r7 instanceof a.wzu
            if (r1 == 0) goto L17
            r1 = r7
            a.wzu r1 = (a.wzu) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.wzu r1 = new a.wzu
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r7 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L36:
            a.z1x.P(r6)
            goto L46
        L3a:
            a.z1x.P(r6)
            r1.k = r5
            java.util.List r6 = r0.e(r5)
            if (r6 != r7) goto L46
            goto L56
        L46:
            java.util.List r6 = (java.util.List) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L60
            r1.k = r4
            java.util.List r6 = r0.e(r3)
            if (r6 != r7) goto L57
        L56:
            return r7
        L57:
            java.util.List r6 = (java.util.List) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L60
            r3 = r5
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r11v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v16 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: a.gb10
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: android.graphics.Matrix
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v14 ??, new type: a.qzb
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v16 ??, new type: a.qzb
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: a.qzb
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
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v8 ??, new type: a.qzb
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
    /* JADX WARN: Failed to calculate best type for var: r13v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: a.qzb
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
    /* JADX WARN: Failed to calculate best type for var: r14v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v12 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r14v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v17 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r15v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v16 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r15v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r15v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v9 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: android.graphics.RectF
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
    /* JADX WARN: Failed to calculate best type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: android.graphics.Path
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
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v23 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r2v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: float[]
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
    /* JADX WARN: Failed to calculate best type for var: r2v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v18 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: float
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: android.graphics.Matrix[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: android.graphics.Matrix[]
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
    /* JADX WARN: Failed to calculate best type for var: r5v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v10 ??, new type: a.gb10
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
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r5v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v14 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r5v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v16 ??, new type: android.graphics.Matrix[]
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
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r5v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v9 ??, new type: android.graphics.Matrix
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
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: float[]
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
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: a.gb10[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: a.gb10[]
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v10 ??, new type: a.gb10[]
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
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: android.graphics.Matrix[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: android.graphics.Matrix[]
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
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: android.graphics.Matrix[]
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
    /* JADX WARN: Failed to calculate best type for var: r8v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v15 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: android.graphics.Path
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: android.graphics.Path
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
    /* JADX WARN: Failed to set immutable type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: android.graphics.Path
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public void b(a.akj0 r22, float[] r23, float r24, android.graphics.RectF r25, a.pyu r26, android.graphics.Path r27) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.b(a.akj0, float[], float, android.graphics.RectF, a.pyu, android.graphics.Path):void");
    }

    public void c() {
        this.h = null;
        this.b = null;
        xz40 xz40Var = (xz40) this.f;
        xz40Var.g();
        ((iz40) this.c).b();
        this.g = xz40Var;
        ((xz40) this.i).g();
        ((xz40) this.d).g();
        this.f27712a = null;
        this.e = null;
        this.j = null;
    }

    public void d() {
        Set set = (Set) this.h;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jff0 jff0Var = (jff0) it.next();
                it.remove();
                jff0Var.f();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0070 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            a.xz40 r0 = (a.xz40) r0
            java.lang.Object r1 = r8.i
            a.xz40 r1 = (a.xz40) r1
            java.lang.Object r2 = r8.h
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L10
            goto Lb8
        L10:
            r3 = 0
            r8.k = r3
            int r3 = r1.c
            r4 = 18
            if (r3 == 0) goto L75
            java.lang.String r3 = "Compose:onForgotten"
            android.os.Trace.beginSection(r3)
            java.lang.Object r3 = r8.f27712a     // Catch: java.lang.Throwable -> L70
            a.iz40 r3 = (a.iz40) r3     // Catch: java.lang.Throwable -> L70
            int r5 = r1.c     // Catch: java.lang.Throwable -> L70
            int r5 = r5 + (-1)
        L26:
            r6 = -1
            if (r6 >= r5) goto L6c
            java.lang.Object[] r6 = r1.f41739a     // Catch: java.lang.Throwable -> L70
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L70
            boolean r7 = r6 instanceof a.jet     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L3f
            r7 = r6
            a.jet r7 = (a.jet) r7     // Catch: java.lang.Throwable -> L3d
            a.jff0 r7 = r7.f16392a     // Catch: java.lang.Throwable -> L3d
            r2.remove(r7)     // Catch: java.lang.Throwable -> L3d
            r7.g()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L5b
        L3f:
            boolean r7 = r6 instanceof a.zjd     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L58
            if (r3 == 0) goto L52
            boolean r7 = r3.c(r6)     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L52
            r7 = r6
            a.zjd r7 = (a.zjd) r7     // Catch: java.lang.Throwable -> L3d
            r7.f()     // Catch: java.lang.Throwable -> L3d
            goto L58
        L52:
            r7 = r6
            a.zjd r7 = (a.zjd) r7     // Catch: java.lang.Throwable -> L3d
            r7.a()     // Catch: java.lang.Throwable -> L3d
        L58:
            int r5 = r5 + (-1)
            goto L26
        L5b:
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L70
            a.qld r8 = (a.qld) r8     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L6b
            a.rld r8 = (a.rld) r8     // Catch: java.lang.Throwable -> L70
            a.yw9 r1 = new a.yw9     // Catch: java.lang.Throwable -> L70
            r1.<init>(r8, r6, r4)     // Catch: java.lang.Throwable -> L70
            a.sac.t0(r0, r1)     // Catch: java.lang.Throwable -> L70
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L70
        L6c:
            android.os.Trace.endSection()
            goto L75
        L70:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        L75:
            int r1 = r0.c
            if (r1 == 0) goto Lb8
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r8.h     // Catch: java.lang.Throwable -> Lad
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L85
            goto Lb0
        L85:
            java.lang.Object[] r2 = r0.f41739a     // Catch: java.lang.Throwable -> Lad
            int r0 = r0.c     // Catch: java.lang.Throwable -> Lad
            r3 = 0
        L8a:
            if (r3 >= r0) goto Lb0
            r5 = r2[r3]     // Catch: java.lang.Throwable -> Lad
            a.jet r5 = (a.jet) r5     // Catch: java.lang.Throwable -> Lad
            a.jff0 r6 = r5.f16392a     // Catch: java.lang.Throwable -> Lad
            r1.remove(r6)     // Catch: java.lang.Throwable -> Lad
            r6.c()     // Catch: java.lang.Throwable -> L9b
            int r3 = r3 + 1
            goto L8a
        L9b:
            r0 = move-exception
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> Lad
            a.qld r8 = (a.qld) r8     // Catch: java.lang.Throwable -> Lad
            if (r8 == 0) goto Laf
            a.rld r8 = (a.rld) r8     // Catch: java.lang.Throwable -> Lad
            a.yw9 r1 = new a.yw9     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r8, r5, r4)     // Catch: java.lang.Throwable -> Lad
            a.sac.t0(r0, r1)     // Catch: java.lang.Throwable -> Lad
            goto Laf
        Lad:
            r8 = move-exception
            goto Lb4
        Laf:
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lb0:
            android.os.Trace.endSection()
            return
        Lb4:
            android.os.Trace.endSection()
            throw r8
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.e():void");
    }

    public void f() {
        xz40 xz40Var = (xz40) this.d;
        if (xz40Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = xz40Var.f41739a;
                int i = xz40Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                xz40Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void g(jet jetVar) {
        xz40 xz40Var = (xz40) this.f;
        if (!((iz40) this.c).c(jetVar)) {
            iz40 iz40Var = (iz40) this.k;
            if (iz40Var == null || !iz40Var.c(jetVar)) {
                ((xz40) this.i).b(jetVar);
                return;
            }
            return;
        }
        ((iz40) this.c).l(jetVar);
        if (!((xz40) this.g).j(jetVar) && !xz40Var.j(jetVar)) {
            h(jetVar, xz40Var);
        }
        Set set = (Set) this.h;
        if (set == null) {
            return;
        }
        set.add(jetVar.f16392a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(int i, sip sipVar, int i2, boolean z, zje zjeVar) {
        o7u o7uVar;
        int i3;
        int i4;
        boolean z2;
        long j;
        long j2;
        sip sipVar2;
        or30 or30Var;
        Map map;
        boolean z3;
        if (zjeVar instanceof o7u) {
            o7uVar = (o7u) zjeVar;
            int i5 = o7uVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                o7uVar.r = i5 - Integer.MIN_VALUE;
            } else {
                o7uVar = new o7u(this, zjeVar);
            }
        } else {
            o7uVar = new o7u(this, zjeVar);
        }
        Object objA = o7uVar.p;
        Object obj = wne.f39444a;
        int i6 = o7uVar.r;
        yje yjeVar = null;
        if (i6 == 0) {
            z1x.P(objA);
            long jA = ((viu) this.e).a();
            long jF = ynq0.f(jA);
            b3u b3uVar = (b3u) this.k;
            o7uVar.k = sipVar;
            i3 = i;
            o7uVar.i = i3;
            i4 = i2;
            o7uVar.j = i4;
            z2 = z;
            o7uVar.m = z2;
            o7uVar.n = jA;
            o7uVar.o = jF;
            o7uVar.r = 1;
            objA = b3uVar.a(o7uVar);
            if (objA != obj) {
                j = jF;
                j2 = jA;
                sipVar2 = sipVar;
            }
            return obj;
        }
        if (i6 == 1) {
            long j3 = o7uVar.o;
            long j4 = o7uVar.n;
            boolean z4 = o7uVar.m;
            int i7 = o7uVar.j;
            int i8 = o7uVar.i;
            sip sipVar3 = o7uVar.k;
            z1x.P(objA);
            j = j3;
            j2 = j4;
            i4 = i7;
            i3 = i8;
            sipVar2 = sipVar3;
            z2 = z4;
        } else {
            if (i6 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = o7uVar.m;
            map = o7uVar.l;
            z1x.P(objA);
        }
        byte b = 3;
        return new dnq(new ewt(aoq.c((gmq) objA, new xpp(yjeVar, this, z3, b)), map, b), new rl2(b, yjeVar, (byte) 19), (byte) 1);
        Map map2 = (Map) objA;
        phf0 phf0Var = (phf0) this.b;
        o7uVar.k = null;
        o7uVar.l = map2;
        o7uVar.i = i3;
        o7uVar.j = i4;
        o7uVar.m = z2;
        o7uVar.n = j2;
        o7uVar.o = j;
        o7uVar.r = 2;
        gst0 gst0Var = (gst0) phf0Var.b;
        boolean zA = gst0Var.a();
        ali aliVar = (ali) phf0Var.f26994a;
        long j5 = zA ? gst0Var.f11847a.a().f18785a : 0L;
        boolean zD = zA ? gst0Var.d(kpb.u(sipVar2)) : false;
        jvn jvnVarB = ((uzc) phf0Var.c).b();
        knf0 knf0Var = (knf0) aliVar.c;
        knf0Var.getClass();
        int iB = knf0Var.b();
        String strA = ((kuy) aliVar.d).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qbt.a(linkedHashMap, jvnVarB);
        Integer numValueOf = Integer.valueOf(i4);
        if (i4 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iB = numValueOf.intValue();
        }
        qbt.c(iB, linkedHashMap);
        qbt.h(linkedHashMap);
        linkedHashMap.put(ParameterNames.ID, Integer.valueOf(i3));
        qbt.j(strA, linkedHashMap);
        qbt.l(linkedHashMap);
        qbt.o(linkedHashMap, zD, j5);
        qbt.p(linkedHashMap);
        o8o o8oVar = (o8o) aliVar.b;
        sipVar2.getClass();
        int iOrdinal = sipVar2.ordinal();
        if (iOrdinal == 0) {
            or30Var = o8oVar.b;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            or30Var = o8oVar.f24840a;
        }
        Object objR = gfx.R(or30Var, kpb.v(sipVar2), null, new em4(sipVar2, aliVar, linkedHashMap, yjeVar, (byte) 1), 252);
        if (objR != obj) {
            map = map2;
            objA = objR;
            z3 = z2;
            byte b2 = 3;
            return new dnq(new ewt(aoq.c((gmq) objA, new xpp(yjeVar, this, z3, b2)), map, b2), new rl2(b2, yjeVar, (byte) 19), (byte) 1);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(zje zjeVar) {
        p7u p7uVar;
        int iX;
        if (zjeVar instanceof p7u) {
            p7uVar = (p7u) zjeVar;
            int i = p7uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7uVar.k = i - Integer.MIN_VALUE;
            } else {
                p7uVar = new p7u(this, zjeVar);
            }
        } else {
            p7uVar = new p7u(this, zjeVar);
        }
        Object objA = p7uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = p7uVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iX = 0;
            if (((iqt) this.d).f15225a.a()) {
                rou rouVar = (rou) this.f27712a;
                p7uVar.k = 1;
                objA = rouVar.a(false, p7uVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iX);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        iX = wvb.X(((m2c0) objA).c);
        return new Integer(iX);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(l9s l9sVar, zje zjeVar) {
        clv clvVar;
        if (zjeVar instanceof clv) {
            clvVar = (clv) zjeVar;
            int i = clvVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                clvVar.l = i - Integer.MIN_VALUE;
            } else {
                clvVar = new clv(this, zjeVar);
            }
        } else {
            clvVar = new clv(this, zjeVar);
        }
        Object obj = clvVar.j;
        wne wneVar = wne.f39444a;
        int i2 = clvVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            rbu rbuVar = (rbu) this.c;
            rbuVar.f30207a.a(new s5s(l9sVar.a(), l9sVar.e(), l9sVar.b()));
            g090 g090Var = (g090) this.g;
            clvVar.i = l9sVar;
            clvVar.l = 1;
            if (g090Var.p(l9sVar, clvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9sVar = clvVar.i;
            z1x.P(obj);
        }
        ((pv00) this.f).n(xcm0.t(l9sVar));
        return Unit.f46060a;
    }

    public void m() {
        v3c.N((c4m0) this.k);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object n(int i, bvc bvcVar, boolean z, boolean z2, boolean z3, zje zjeVar) {
        vvu vvuVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        bvc bvcVar2;
        if (zjeVar instanceof vvu) {
            vvuVar = (vvu) zjeVar;
            int i3 = vvuVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vvuVar.q = i3 - Integer.MIN_VALUE;
            } else {
                vvuVar = new vvu(this, zjeVar);
            }
        } else {
            vvuVar = new vvu(this, zjeVar);
        }
        Object obj = vvuVar.o;
        wne wneVar = wne.f39444a;
        int i4 = vvuVar.q;
        yje yjeVar = null;
        if (i4 == 0) {
            z1x.P(obj);
            boolean z8 = ((cnv) this.f27712a).f4674a.f523a.f44017a.get();
            ((fmt0) this.e).a(false);
            kzj kzjVarM = qjj.M(bvcVar, null, new gkr(this, yjeVar, (byte) 16), 3);
            vvuVar.j = bvcVar;
            vvuVar.i = i;
            vvuVar.k = z;
            vvuVar.l = z2;
            vvuVar.m = z3;
            vvuVar.n = z8;
            vvuVar.q = 1;
            Object objQ = kzjVarM.q(vvuVar);
            if (objQ == wneVar) {
                return wneVar;
            }
            z4 = z;
            z5 = z8;
            obj = objQ;
            z6 = z2;
            z7 = z3;
            i2 = i;
            bvcVar2 = bvcVar;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z5 = vvuVar.n;
            boolean z9 = vvuVar.m;
            boolean z10 = vvuVar.l;
            boolean z11 = vvuVar.k;
            int i5 = vvuVar.i;
            bvc bvcVar3 = vvuVar.j;
            z1x.P(obj);
            z6 = z10;
            z4 = z11;
            bvcVar2 = bvcVar3;
            i2 = i5;
            z7 = z9;
        }
        v3c.N((c4m0) this.k);
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z5;
        this.k = sac.T(aoq.c(((uzc) this.g).c(), new wvu(null, this, i2, (Integer) obj, z4, z6, z7, hie0Var)), d5c.S(bvcVar2, ((mne) this.h).f22085a), new f1e(2, yjeVar, (byte) 29));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a A[PHI: r11
  0x009a: PHI (r11v3 a.l9s) = (r11v2 a.l9s), (r11v6 a.l9s) binds: [B:30:0x0097, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (w(r11, r0) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(a.l9s r11, a.o3w0 r12, a.zje r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof a.dlv
            if (r0 == 0) goto L13
            r0 = r13
            a.dlv r0 = (a.dlv) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.dlv r0 = new a.dlv
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            a.z1x.P(r13)
            goto Lab
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r7
        L38:
            a.l9s r11 = r0.i
            a.z1x.P(r13)
            goto L9a
        L3e:
            a.l9s r11 = r0.i
            a.z1x.P(r13)
            goto L8f
        L44:
            a.l9s r11 = r0.i
            a.z1x.P(r13)
            goto L84
        L4a:
            a.z1x.P(r13)
            boolean r13 = r11.e()
            if (r13 == 0) goto L66
            java.lang.Object r13 = r10.j
            a.qbu r13 = (a.qbu) r13
            java.lang.Object r2 = r10.k
            a.sff0 r2 = (a.sff0) r2
            boolean r8 = r2.J
            java.util.List r2 = r2.b1
            a.fsr r12 = a.aac.d0(r11, r12, r8, r2)
            r13.b(r12)
        L66:
            java.lang.Object r12 = r10.h
            a.drm0 r12 = (a.drm0) r12
            java.lang.Object r13 = r10.b
            a.viu r13 = (a.viu) r13
            long r8 = r13.a()
            a.anq0 r13 = a.osm0.p(r11, r8)
            r12.j(r13)
            r0.i = r11
            r0.l = r6
            java.lang.Object r12 = r10.l(r11, r0)
            if (r12 != r1) goto L84
            goto Laa
        L84:
            r0.i = r11
            r0.l = r5
            java.lang.Object r12 = r10.v(r11, r0)
            if (r12 != r1) goto L8f
            goto Laa
        L8f:
            r0.i = r11
            r0.l = r4
            java.lang.Object r12 = r10.x(r11, r0)
            if (r12 != r1) goto L9a
            goto Laa
        L9a:
            boolean r12 = r11.e()
            if (r12 == 0) goto Lae
            r0.i = r7
            r0.l = r3
            java.lang.Object r10 = r10.w(r11, r0)
            if (r10 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        Lae:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.o(a.l9s, a.o3w0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r0 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(a.noj0 r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.p(a.noj0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Type inference failed for: r14v15, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r14v3, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte, int] */
    public Object q(List list, jg7 jg7Var, double d, long j, String str, boolean z, boolean z2, boolean z3, zje zjeVar) {
        sa20 sa20Var;
        long jB;
        sa20 sa20Var2;
        Object objG;
        jg7 jg7Var2;
        boolean z4;
        List list2;
        boolean z5;
        double d2;
        Object objA;
        boolean z6;
        ql5 ql5Var;
        List list3;
        Object objD0;
        boolean z7;
        ql5 ql5Var2;
        boolean z8;
        long j2;
        boolean z9;
        double d3;
        long j3;
        ch20 ch20Var;
        ch20 ch20Var2;
        long j4;
        List list4 = list;
        long j5 = j;
        String str2 = str;
        boolean z10 = z3;
        if (zjeVar instanceof sa20) {
            sa20Var = (sa20) zjeVar;
            int i = sa20Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa20Var.v = i - Integer.MIN_VALUE;
            } else {
                sa20Var = new sa20(this, zjeVar);
            }
        } else {
            sa20Var = new sa20(this, zjeVar);
        }
        Object obj = sa20Var.t;
        Object obj2 = wne.f39444a;
        int i2 = sa20Var.v;
        if (i2 == 0) {
            z1x.P(obj);
            sa20 sa20Var3 = sa20Var;
            jB = ((ort) this.f).b();
            if (z) {
                nrt nrtVar = (nrt) this.f27712a;
                sa20Var2 = sa20Var3;
                sa20Var2.i = list4;
                sa20Var2.j = jg7Var;
                sa20Var2.k = str2;
                sa20Var2.n = d;
                sa20Var2.o = (int) j5;
                sa20Var2.q = z;
                sa20Var2.r = z2;
                sa20Var2.s = z10;
                sa20Var2.p = jB;
                sa20Var2.v = 1;
                objA = nrt.a(nrtVar, jB, sa20Var2);
                if (objA != obj2) {
                    jg7Var2 = jg7Var;
                    z6 = z;
                    z4 = z2;
                    d2 = d;
                    ql5Var = (ql5) objA;
                    list3 = list4;
                }
            } else {
                sa20Var2 = sa20Var3;
                khf0 khf0Var = (khf0) this.e;
                bm5 bm5Var = bm5.k;
                sa20Var2.i = list4;
                sa20Var2.j = jg7Var;
                sa20Var2.k = str2;
                sa20Var2.n = d;
                sa20Var2.o = (int) j5;
                sa20Var2.q = z;
                sa20Var2.r = z2;
                sa20Var2.s = z10;
                sa20Var2.p = jB;
                sa20Var2.v = 2;
                objG = khf0.G(khf0Var, bm5Var, sa20Var2);
                if (objG != obj2) {
                    jg7Var2 = jg7Var;
                    z4 = z2;
                    list2 = list;
                    z5 = z;
                    d2 = d;
                    ql5Var = (ql5) objG;
                    ((ot) this.j).a(bm5.k, ql5Var);
                    list3 = list2;
                    z6 = z5;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            long j6 = sa20Var.p;
            boolean z11 = sa20Var.s;
            z4 = sa20Var.r;
            boolean z12 = sa20Var.q;
            long j7 = sa20Var.o;
            d2 = sa20Var.n;
            String str3 = sa20Var.k;
            jg7Var2 = sa20Var.j;
            List list5 = sa20Var.i;
            z1x.P(obj);
            sa20Var2 = sa20Var;
            jB = j6;
            list4 = list5;
            z6 = z12;
            j5 = j7;
            str2 = str3;
            z10 = z11;
            objA = obj;
            ql5Var = (ql5) objA;
            list3 = list4;
        } else if (i2 == 2) {
            long j8 = sa20Var.p;
            boolean z13 = sa20Var.s;
            z4 = sa20Var.r;
            boolean z14 = sa20Var.q;
            long j9 = sa20Var.o;
            d2 = sa20Var.n;
            String str4 = sa20Var.k;
            jg7Var2 = sa20Var.j;
            List list6 = sa20Var.i;
            z1x.P(obj);
            sa20Var2 = sa20Var;
            jB = j8;
            list2 = list6;
            z5 = z14;
            j5 = j9;
            str2 = str4;
            z10 = z13;
            objG = obj;
            ql5Var = (ql5) objG;
            ((ot) this.j).a(bm5.k, ql5Var);
            list3 = list2;
            z6 = z5;
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch20Var2 = sa20Var.m;
                try {
                    z1x.P(obj);
                    e0g0 e0g0Var = j0g0.b;
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                ((ilt0) this.d).a(ch20Var2.c, ch20Var2.b);
                return ch20Var2;
            }
            j2 = sa20Var.p;
            z8 = sa20Var.s;
            z9 = sa20Var.r;
            z7 = sa20Var.q;
            j3 = sa20Var.o;
            d3 = sa20Var.n;
            ql5Var2 = sa20Var.l;
            z1x.P(obj);
            sa20Var2 = sa20Var;
            objD0 = obj;
            ch20Var = (ch20) objD0;
            try {
                e0g0 e0g0Var3 = j0g0.b;
                j4 = Long.parseLong(ch20Var.f4343a);
                sa20Var2.i = null;
                sa20Var2.j = null;
                sa20Var2.k = null;
                sa20Var2.l = null;
                sa20Var2.m = ch20Var;
                sa20Var2.n = d3;
                sa20Var2.o = (int) j3;
                sa20Var2.q = z7;
                sa20Var2.r = z9;
                sa20Var2.s = z8;
                sa20Var2.p = j2;
                sa20Var2.v = 4;
                if (u(ql5Var2, j4, sa20Var2) == obj2) {
                    return obj2;
                }
                ch20Var2 = ch20Var;
                e0g0 e0g0Var4 = j0g0.b;
                ((ilt0) this.d).a(ch20Var2.c, ch20Var2.b);
                return ch20Var2;
            } catch (Throwable unused2) {
                ch20Var2 = ch20Var;
                e0g0 e0g0Var5 = j0g0.b;
            }
        }
        String str5 = str2;
        jg7 jg7Var3 = jg7Var2;
        so6 so6Var = (so6) this.h;
        byte b = ((vyt) this.b).a().f8665a;
        int iA = ((rpt) this.k).a();
        sa20Var2.i = null;
        sa20Var2.j = null;
        sa20Var2.k = null;
        sa20Var2.l = ql5Var;
        sa20Var2.n = d2;
        sa20Var2.o = (int) j5;
        sa20Var2.q = z6;
        sa20Var2.r = z4;
        sa20Var2.s = z10;
        sa20Var2.p = jB;
        sa20Var2.v = 3;
        ql5 ql5Var3 = ql5Var;
        boolean z15 = z4;
        long j10 = j5;
        double d4 = d2;
        boolean z16 = z10;
        long j11 = jB;
        objD0 = qjj.d0(so6Var.e.b, new ro6(so6Var, ql5Var3, str5, list3, jg7Var3, z16, j11, z15, d4, b, iA, j10, null), sa20Var2);
        if (objD0 != obj2) {
            z7 = z6;
            ql5Var2 = ql5Var3;
            z8 = z16;
            j2 = j11;
            z9 = z15;
            d3 = d4;
            j3 = j10;
            ch20Var = (ch20) objD0;
            e0g0 e0g0Var6 = j0g0.b;
            j4 = Long.parseLong(ch20Var.f4343a);
            sa20Var2.i = null;
            sa20Var2.j = null;
            sa20Var2.k = null;
            sa20Var2.l = null;
            sa20Var2.m = ch20Var;
            sa20Var2.n = d3;
            sa20Var2.o = (int) j3;
            sa20Var2.q = z7;
            sa20Var2.r = z9;
            sa20Var2.s = z8;
            sa20Var2.p = j2;
            sa20Var2.v = 4;
            if (u(ql5Var2, j4, sa20Var2) == obj2) {
                return obj2;
            }
            ch20Var2 = ch20Var;
            e0g0 e0g0Var7 = j0g0.b;
            ((ilt0) this.d).a(ch20Var2.c, ch20Var2.b);
            return ch20Var2;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public boolean r(fk60 fk60Var) {
        boolean z;
        pru pruVar = (pru) this.j;
        boolean zA = ((ort) this.h).f25751a.a();
        switch (fk60Var.ordinal()) {
            case 10:
                if (((xlu) this.b).f41092a.a() >= 1) {
                    z = false;
                } else {
                    z = true;
                }
                break;
            case 11:
                if (((mp1) ((ivn) this.c).f15453a).a() >= 1) {
                    z = false;
                } else {
                    z = true;
                }
                break;
            case 12:
                if (((rh00) ((x4u) this.f).f40284a).a() >= 1) {
                    z = false;
                } else {
                    z = true;
                }
                break;
            case 13:
                if (((yf1) this.g).f42519a.a() >= 1) {
                    z = false;
                } else {
                    z = true;
                }
                break;
            case 14:
                if (((iz1) ((lsn) this.i).f20589a).a() >= 1) {
                    z = false;
                } else {
                    z = true;
                }
                break;
            default:
                z = true;
                break;
        }
        return ((gxu) this.d).s(fk60Var, pruVar.a().e1, ((t91) ((nmo) this.e).f23782a).f33539a.o) && pruVar.a().z && !pruVar.a().b.f13233a.f8987a && (((ocl) this.f27712a).m() || (((toc) this.k).f34277a.f33539a.p < 2 && zA && z));
    }

    public boolean s(Path path, int i) {
        Path path2 = (Path) this.k;
        path2.reset();
        ((gb10[]) this.h)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void t(Set set, rld rldVar) {
        c();
        this.h = set;
        this.b = rldVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r1.m(r7, (a.ql5) r11, r5, r6) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(a.ql5 r8, long r9, a.zje r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof a.ta20
            if (r0 == 0) goto L14
            r0 = r11
            a.ta20 r0 = (a.ta20) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.ta20 r0 = new a.ta20
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.k
            a.wne r0 = a.wne.f39444a
            int r1 = r6.m
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r11)
            goto L79
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L33:
            long r9 = r6.j
            a.ql5 r8 = r6.i
            a.z1x.P(r11)
            goto L5c
        L3b:
            a.z1x.P(r11)
            java.lang.Object r11 = r7.c
            a.zlt0 r11 = (a.zlt0) r11
            boolean r11 = r11.n()
            if (r11 != 0) goto L4b
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L4b:
            java.lang.Object r11 = r7.i
            a.ahu r11 = (a.ahu) r11
            r6.i = r8
            r6.j = r9
            r6.m = r3
            java.io.Serializable r11 = a.ahu.c(r11, r6)
            if (r11 != r0) goto L5c
            goto L78
        L5c:
            a.ql5 r11 = (a.ql5) r11
            java.lang.Object r7 = r7.g
            r1 = r7
            a.nw20 r1 = (a.nw20) r1
            long r7 = r8.f28916a
            long[] r5 = new long[r3]
            r3 = 0
            r5[r3] = r9
            r6.i = r4
            r6.j = r9
            r6.m = r2
            r2 = r7
            r4 = r11
            java.lang.Object r7 = r1.m(r2, r4, r5, r6)
            if (r7 != r0) goto L79
        L78:
            return r0
        L79:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwi.u(a.ql5, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(l9s l9sVar, zje zjeVar) {
        elv elvVar;
        if (zjeVar instanceof elv) {
            elvVar = (elv) zjeVar;
            int i = elvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                elvVar.k = i - Integer.MIN_VALUE;
            } else {
                elvVar = new elv(this, zjeVar);
            }
        } else {
            elvVar = new elv(this, zjeVar);
        }
        Object obj = elvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = elvVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (!l9sVar.l()) {
                return Unit.f46060a;
            }
            hlv hlvVar = new hlv(this, l9sVar, yjeVar, (byte) 0);
            elvVar.k = 1;
            if (d5c.J(elvVar, hlvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(l9s l9sVar, zje zjeVar) {
        ilv ilvVar;
        if (zjeVar instanceof ilv) {
            ilvVar = (ilv) zjeVar;
            int i = ilvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilvVar.k = i - Integer.MIN_VALUE;
            } else {
                ilvVar = new ilv(this, zjeVar);
            }
        } else {
            ilvVar = new ilv(this, zjeVar);
        }
        Object obj = ilvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ilvVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            if (!l9sVar.T()) {
                return Unit.f46060a;
            }
            hlv hlvVar = new hlv(this, l9sVar, yjeVar, b);
            ilvVar.k = 1;
            if (d5c.J(ilvVar, hlvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(l9s l9sVar, zje zjeVar) {
        klv klvVar;
        if (zjeVar instanceof klv) {
            klvVar = (klv) zjeVar;
            int i = klvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                klvVar.k = i - Integer.MIN_VALUE;
            } else {
                klvVar = new klv(this, zjeVar);
            }
        } else {
            klvVar = new klv(this, zjeVar);
        }
        Object obj = klvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = klvVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            Long lB = l9sVar.B();
            if (((sff0) this.k).m0 || lB == null) {
                return Unit.f46060a;
            }
            ah0 ah0Var = new ah0(this, lB, l9sVar, null, (byte) 8);
            klvVar.k = 1;
            if (d5c.J(klvVar, ah0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public pwi(so6 so6Var, vyt vytVar, ort ortVar, zlt0 zlt0Var, nw20 nw20Var, ahu ahuVar, ilt0 ilt0Var, nrt nrtVar, khf0 khf0Var, ot otVar, rpt rptVar) {
        this.h = so6Var;
        this.b = vytVar;
        this.f = ortVar;
        this.c = zlt0Var;
        this.g = nw20Var;
        this.i = ahuVar;
        this.d = ilt0Var;
        this.f27712a = nrtVar;
        this.e = khf0Var;
        this.j = otVar;
        this.k = rptVar;
    }

    public pwi(drm0 drm0Var, viu viuVar, pv00 pv00Var, rbu rbuVar, g090 g090Var, ntu ntuVar, fck0 fck0Var, afm0 afm0Var, glt0 glt0Var, qbu qbuVar, pru pruVar) {
        this.h = drm0Var;
        this.b = viuVar;
        this.f = pv00Var;
        this.c = rbuVar;
        this.g = g090Var;
        this.i = ntuVar;
        this.d = fck0Var;
        this.f27712a = afm0Var;
        this.e = glt0Var;
        this.j = qbuVar;
        this.k = pruVar.a();
    }

    public pwi(lbu lbuVar, zri zriVar, yiu yiuVar, pru pruVar, n4u n4uVar, e1u e1uVar, ieu ieuVar, rou rouVar, x4v x4vVar, wsc wscVar, t4v t4vVar) {
        this.h = lbuVar;
        this.b = zriVar;
        this.f = yiuVar;
        this.j = pruVar;
        this.c = n4uVar;
        this.g = e1uVar;
        this.i = ieuVar;
        this.d = rouVar;
        this.f27712a = x4vVar;
        this.e = wscVar;
        this.k = t4vVar;
    }

    public pwi(us00 us00Var, ajc ajcVar, List list, xdg0 xdg0Var, LinkedHashSet linkedHashSet, List list2, List list3, List list4, spg0 spg0Var, CoroutineContext coroutineContext, u1e u1eVar) {
        coroutineContext.getClass();
        this.h = us00Var;
        this.b = ajcVar;
        this.f = list;
        this.c = xdg0Var;
        this.g = linkedHashSet;
        this.i = list2;
        this.d = list3;
        this.f27712a = list4;
        this.e = spg0Var;
        this.j = coroutineContext;
        this.k = u1eVar;
    }

    public pwi(f4u f4uVar, rou rouVar, gxu gxuVar, pru pruVar, lbu lbuVar, epc epcVar, iqt iqtVar, jqt jqtVar, jcl jclVar, phf0 phf0Var, r9u r9uVar) {
        rouVar.getClass();
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.h = f4uVar;
        this.b = rouVar;
        this.f = gxuVar;
        this.j = pruVar;
        this.c = lbuVar;
        this.g = epcVar;
        this.i = iqtVar;
        this.d = jqtVar;
        this.f27712a = jclVar;
        this.e = phf0Var;
        this.k = r9uVar;
    }

    public pwi(mne mneVar, phf0 phf0Var, v7i v7iVar, n2u n2uVar, luu luuVar, iqt iqtVar, rou rouVar, viu viuVar, b3u b3uVar, m1e m1eVar, pru pruVar) {
        m1eVar.getClass();
        this.h = mneVar;
        this.b = phf0Var;
        this.f = v7iVar;
        this.c = n2uVar;
        this.i = luuVar;
        this.d = iqtVar;
        this.f27712a = rouVar;
        this.e = viuVar;
        this.k = b3uVar;
        this.g = m1eVar;
        this.j = pruVar;
    }

    public pwi(mne mneVar, a6u a6uVar, ani0 ani0Var, yox yoxVar, uzc uzcVar, rou rouVar, iqt iqtVar, cnv cnvVar, fmt0 fmt0Var, cyu cyuVar) {
        this.h = mneVar;
        this.b = a6uVar;
        this.f = ani0Var;
        this.c = yoxVar;
        this.g = uzcVar;
        this.i = rouVar;
        this.d = iqtVar;
        this.f27712a = cnvVar;
        this.e = fmt0Var;
        this.j = cyuVar;
    }

    public pwi(rtu rtuVar, ieu ieuVar, uzc uzcVar, rpt rptVar, e1u e1uVar, v7i v7iVar, s4v s4vVar, viu viuVar, r9u r9uVar, j9u j9uVar, pru pruVar) {
        this.h = rtuVar;
        this.b = ieuVar;
        this.f = uzcVar;
        this.c = rptVar;
        this.g = e1uVar;
        this.i = v7iVar;
        this.d = s4vVar;
        this.f27712a = viuVar;
        this.e = r9uVar;
        this.j = j9uVar;
        this.k = maz.b(new b6u(pruVar, (byte) 21));
    }

    public pwi(ort ortVar, xlu xluVar, x4u x4uVar, ivn ivnVar, yf1 yf1Var, lsn lsnVar, gxu gxuVar, ocl oclVar, pru pruVar, nmo nmoVar, toc tocVar) {
        this.h = ortVar;
        this.b = xluVar;
        this.f = x4uVar;
        this.c = ivnVar;
        this.g = yf1Var;
        this.i = lsnVar;
        this.d = gxuVar;
        this.f27712a = oclVar;
        this.j = pruVar;
        this.e = nmoVar;
        this.k = tocVar;
    }

    public pwi(cad cadVar, gii0 gii0Var, String str, i1w0 i1w0Var, duj dujVar, ocl oclVar, m1e m1eVar, knf0 knf0Var, ctf0 ctf0Var, pru pruVar) {
        this.h = str;
        this.b = gii0Var;
        this.f = cadVar;
        this.c = knf0Var;
        this.g = m1eVar;
        this.i = oclVar;
        this.d = dujVar;
        this.f27712a = i1w0Var;
        this.e = ctf0Var;
        this.j = pruVar;
        this.k = n0k0.a(new xvi(this, (byte) 9));
    }

    public pwi(cad cadVar, pyg pygVar, ctf0 ctf0Var, UniversalChampInfoParams universalChampInfoParams, g2v g2vVar, m1e m1eVar, zr1 zr1Var, ih5 ih5Var, gii0 gii0Var, vby vbyVar) {
        this.h = universalChampInfoParams;
        this.f = cadVar;
        this.c = g2vVar;
        this.e = ctf0Var;
        this.i = pygVar;
        this.g = m1eVar;
        this.b = gii0Var;
        this.d = vbyVar;
        this.f27712a = zr1Var;
        this.j = ih5Var;
        this.k = new yxi(this, (byte) 11);
    }

    public pwi(cad cadVar, Integer num, ulr0 ulr0Var, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, knf0 knf0Var, g2v g2vVar, ctf0 ctf0Var) {
        this.f27712a = i1w0Var;
        this.h = num;
        this.i = ulr0Var;
        this.b = gii0Var;
        this.c = knf0Var;
        this.j = g2vVar;
        this.d = dujVar;
        this.e = ctf0Var;
        this.f = cadVar;
        this.g = m1eVar;
        this.k = new xvi(this, (byte) 23);
    }
}
