package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ekf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw20 f7949a;
    public final vne b;
    public final pz40 c;
    public final float d;
    public final r0 e;
    public final jch0 f;
    public final k6z g;
    public final Function2 h;
    public final k050 i = new k050();
    public final pz40 j = androidx.compose.runtime.e.e(null);
    public final pz40 k;
    public final pz40 l;
    public final pz40 m;
    public final pz40 n;
    public long o;
    public final HashSet p;
    public final pz40 q;
    public final t33 r;
    public final vsg0 s;

    public ekf0(jw20 jw20Var, vne vneVar, pz40 pz40Var, float f, r0 r0Var, jch0 jch0Var, k6z k6zVar, Function2 function2) {
        this.f7949a = jw20Var;
        this.b = vneVar;
        this.c = pz40Var;
        this.d = f;
        this.e = r0Var;
        this.f = jch0Var;
        this.g = k6zVar;
        this.h = function2;
        jgk0.b(new yjf0(this, (byte) 2));
        this.k = androidx.compose.runtime.e.e(new ne60(0L));
        this.l = androidx.compose.runtime.e.e(new ikx(0L));
        this.m = androidx.compose.runtime.e.e(null);
        this.n = androidx.compose.runtime.e.e(null);
        this.o = 0L;
        this.p = new HashSet();
        this.q = androidx.compose.runtime.e.e(null);
        this.r = new t33(new ne60(0L), hp4.o, null, 12);
        this.s = ydx.V(null, new yjf0(this, (byte) 3));
    }

    public static gkf0 a(ekf0 ekf0Var, jge0 jge0Var, ArrayList arrayList, dch0 dch0Var, eme0 eme0Var, int i) {
        if ((i & 4) != 0) {
            dch0Var = dch0.b;
        }
        Object bue0Var = eme0Var;
        if ((i & 8) != 0) {
            bue0Var = new bue0((byte) 21);
        }
        ekf0Var.getClass();
        zlb0 zlb0Var = new zlb0(ekf0Var, jge0Var, bue0Var, (byte) 18);
        int iOrdinal = dch0Var.ordinal();
        Object obj = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((Boolean) zlb0Var.invoke(objPrevious)).booleanValue()) {
                    obj = objPrevious;
                    break;
                }
            }
            return (gkf0) obj;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        for (Object obj2 : arrayList) {
            if (((Boolean) zlb0Var.invoke(obj2)).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        return (gkf0) obj;
    }

    public final gkf0 b() {
        Object value = ((hgk0) this.j).getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        for (Object obj2 : this.f7949a.e().g()) {
            if (((gkf0) obj2).f11441a.l.equals(value)) {
                obj = obj2;
                break;
            }
        }
        return (gkf0) obj;
    }

    public final long c() {
        long jA;
        gkf0 gkf0VarB = b();
        if (gkf0VarB == null) {
            return 0L;
        }
        int i = gkf0VarB.f11441a.f23317a;
        pz40 pz40Var = this.m;
        Integer num = (Integer) ((hgk0) pz40Var).getValue();
        pz40 pz40Var2 = this.n;
        if (num == null || i != num.intValue() || ((Integer) ((hgk0) pz40Var).getValue()) == null) {
            ((hgk0) pz40Var).setValue(null);
            ((hgk0) pz40Var2).setValue(null);
            jA = gkf0VarB.a();
        } else {
            ikx ikxVar = (ikx) ((hgk0) pz40Var2).getValue();
            jA = ikxVar != null ? ikxVar.f14950a : gkf0VarB.a();
        }
        long j = ((ne60) ((hgk0) this.k).getValue()).f23370a;
        long j2 = ((ikx) ((hgk0) this.l).getValue()).f14950a;
        long j3 = j(ne60.e((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32), (((long) Float.floatToRawIntBits((int) (jA & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jA >> 32))) << 32)));
        k(j3);
        return ne60.f(j, j3);
    }

    public final ma80 d() {
        return ((mcz) this.f7949a.e().f15470a).q;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:104:0x0232  */
    /* JADX WARN: Code duplicated, block: B:106:0x023a  */
    /* JADX WARN: Code duplicated, block: B:108:0x023d  */
    /* JADX WARN: Code duplicated, block: B:111:0x024b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:119:0x0269  */
    /* JADX WARN: Code duplicated, block: B:122:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x028f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0297  */
    /* JADX WARN: Code duplicated, block: B:133:0x029a  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a0 A[PHI: r9
  0x02a0: PHI (r9v12 boolean) = (r9v11 boolean), (r9v13 boolean) binds: [B:140:0x02ad, B:134:0x029e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:163:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Code duplicated, block: B:95:0x0217  */
    /* JADX WARN: Code duplicated, block: B:97:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02db, code lost:
    
        if (r0.join(r6) == r7) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.dch0 r24, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ekf0.e(a.dch0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[Catch: all -> 0x0047, PHI: r1 r2 r4
  0x00ea: PHI (r1v5 a.i050) = (r1v14 a.i050), (r1v15 a.i050) binds: [B:44:0x00e6, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r2v3 a.gkf0) = (r2v2 a.gkf0), (r2v22 a.gkf0) binds: [B:44:0x00e6, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r4v6 ??) = (r4v15 ??), (r4v16 ??) binds: [B:44:0x00e6, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0041, B:53:0x016f, B:22:0x0056, B:46:0x00ea, B:48:0x00f4, B:50:0x0144, B:49:0x013a, B:43:0x00bd), top: B:60:0x0035, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0041, B:53:0x016f, B:22:0x0056, B:46:0x00ea, B:48:0x00f4, B:50:0x0144, B:49:0x013a, B:43:0x00bd), top: B:60:0x0035, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x013a A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:15:0x0041, B:53:0x016f, B:22:0x0056, B:46:0x00ea, B:48:0x00f4, B:50:0x0144, B:49:0x013a, B:43:0x00bd), top: B:60:0x0035, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
    
        if (a.msm0.t(a.qcc.g0(r2), r4, r5) == r6) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.gkf0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.gkf0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [a.gkf0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.gkf0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(a.gkf0 r21, a.gkf0 r22, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ekf0.f(a.gkf0, a.gkf0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: long
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: long
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
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v28 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void g(long r19) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ekf0.g(long):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Object obj, long j, zje zjeVar) {
        dkf0 dkf0Var;
        Object next;
        gkf0 gkf0Var;
        long j2;
        if (zjeVar instanceof dkf0) {
            dkf0Var = (dkf0) zjeVar;
            int i = dkf0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkf0Var.n = i - Integer.MIN_VALUE;
            } else {
                dkf0Var = new dkf0(this, zjeVar);
            }
        } else {
            dkf0Var = new dkf0(this, zjeVar);
        }
        Object obj2 = dkf0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = dkf0Var.n;
        if (i2 == 0) {
            z1x.P(obj2);
            jw20 jw20Var = this.f7949a;
            Iterator it = jw20Var.e().g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((gkf0) next).f11441a.l.equals(obj));
            gkf0Var = (gkf0) next;
            if (gkf0Var != null) {
                long jA = gkf0Var.a();
                int iOrdinal = d().ordinal();
                if (iOrdinal == 0) {
                    j2 = jA & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    j2 = jA >> 32;
                }
                int i3 = (int) j2;
                if (i3 < 0) {
                    nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
                    dkf0Var.i = obj;
                    dkf0Var.j = gkf0Var;
                    dkf0Var.k = j;
                    dkf0Var.n = 1;
                    if (bww.x((xcz) jw20Var.b, i3, nul0VarG0, dkf0Var) == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = dkf0Var.k;
        gkf0 gkf0Var2 = dkf0Var.j;
        Object obj3 = dkf0Var.i;
        z1x.P(obj2);
        gkf0Var = gkf0Var2;
        obj = obj3;
        ((hgk0) this.j).setValue(obj);
        ((hgk0) this.l).setValue(new ikx(gkf0Var.a()));
        this.o = j;
        return Unit.f46060a;
    }

    public final void i() {
        ekf0 ekf0Var;
        gkf0 gkf0VarB = b();
        yje yjeVar = null;
        ikx ikxVar = gkf0VarB != null ? new ikx(gkf0VarB.a()) : null;
        gkf0 gkf0VarB2 = b();
        Integer numValueOf = gkf0VarB2 != null ? Integer.valueOf(gkf0VarB2.f11441a.f23317a) : null;
        pz40 pz40Var = this.j;
        if (numValueOf != null) {
            ((hgk0) this.q).setValue(((hgk0) pz40Var).getValue());
            ekf0Var = this;
            qjj.W(ekf0Var.b, null, null, new hu3(ekf0Var, c(), yjeVar, (byte) 6), 3);
        } else {
            ekf0Var = this;
        }
        ((hgk0) ekf0Var.k).setValue(new ne60(0L));
        ((hgk0) pz40Var).setValue(null);
        ((hgk0) ekf0Var.l).setValue(new ikx(ikxVar != null ? ikxVar.f14950a : 0L));
        jch0 jch0Var = ekf0Var.f;
        qjj.W(jch0Var.b, null, null, new hch0(jch0Var, yjeVar, (byte) 1), 3);
        ((hgk0) ekf0Var.m).setValue(null);
        ((hgk0) ekf0Var.n).setValue(null);
    }

    public final long j(long j) {
        boolean z = ((mcz) this.f7949a.e().f15470a).p;
        if (z) {
            j = zdx.I(j, d());
        } else if (z) {
            t9f.b();
            return 0L;
        }
        int iOrdinal = d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return 0L;
            }
            int iOrdinal2 = this.g.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return zdx.I(j, ma80.b);
                }
                t9f.b();
                return 0L;
            }
        }
        return j;
    }

    public final long k(long j) {
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        t9f.b();
        return 0L;
    }
}
