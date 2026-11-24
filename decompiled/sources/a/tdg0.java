package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33768a;
    public boolean b;
    public final pwi c;
    public final ke70 d;
    public final List e;
    public final s1e f;

    public tdg0(pwi pwiVar, ke70 ke70Var, due0 due0Var) {
        tdg0 tdg0Var;
        s1e z1eVar;
        this.c = pwiVar;
        this.d = ke70Var;
        this.e = (List) pwiVar.f;
        spg0 spg0Var = (spg0) pwiVar.e;
        yje yjeVar = null;
        String str = "onexdatabase.name";
        if (spg0Var.b()) {
            tdg0Var = this;
            z1eVar = new qz80(new xg0(tdg0Var, spg0Var, str, yjeVar, (byte) 3), due0Var);
        } else {
            tdg0Var = this;
            u1e u1eVar = (u1e) pwiVar.k;
            if (u1eVar instanceof p0k0) {
                z1eVar = new z1e(new xg0(tdg0Var, spg0Var, str, yjeVar, (byte) 3));
            } else {
                if (!(u1eVar instanceof ox40)) {
                    t9f.b();
                    throw null;
                }
                z1eVar = new z1e(new xg0(tdg0Var, spg0Var, str, yjeVar, (byte) 3), 0);
            }
        }
        tdg0Var.f = z1eVar;
    }

    public static Unit c(qpg0 qpg0Var) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA busy_timeout");
        try {
            xpg0VarZ0.W0();
            long j = xpg0VarZ0.getLong(0);
            ay3.L(xpg0VarZ0, null);
            if (j >= 3000) {
                return Unit.f46060a;
            }
            Unit unitS = j0x.s(qpg0Var, "PRAGMA busy_timeout = 3000");
            return unitS == wne.f39444a ? unitS : Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:0: B:66:0x0151->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:1: B:27:0x00b3->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[PHI: r0 r1 r2 r3
  0x01a4: PHI (r0v10 ??) = (r0v27 ??), (r0v28 ??) binds: [B:78:0x01a0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r1v10 int) = (r1v7 int), (r1v11 int) binds: [B:78:0x01a0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r2v13 a.qpg0) = (r2v11 a.qpg0), (r2v14 a.qpg0) binds: [B:78:0x01a0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r3v10 a.tdg0) = (r3v8 a.tdg0), (r3v11 a.tdg0) binds: [B:78:0x01a0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01be  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa A[PHI: r0 r1
  0x01fa: PHI (r0v21 a.qpg0) = (r0v19 a.qpg0), (r0v23 a.qpg0) binds: [B:95:0x01f7, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x01fa: PHI (r1v22 a.tdg0) = (r1v20 a.tdg0), (r1v25 a.tdg0) binds: [B:95:0x01f7, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
    
        if (r4 == r6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        if (r3.m(r2, r5) == r6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0208, code lost:
    
        if (a.ke70.a(r0) == r6) goto L99;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x020e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(a.tdg0 r17, a.qpg0 r18, int r19, int r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.k(a.tdg0, a.qpg0, int, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:45:0x00ba, B:47:0x00c0), top: B:102:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8 A[Catch: all -> 0x005a, PHI: r13
  0x00f8: PHI (r13v16 a.qpg0) = (r13v8 a.qpg0), (r13v18 a.qpg0) binds: [B:64:0x00f4, B:27:0x006d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #3 {all -> 0x005a, blocks: (B:20:0x0055, B:74:0x011d, B:25:0x0068, B:69:0x0109, B:71:0x010f, B:80:0x0134, B:81:0x014b, B:66:0x00f8), top: B:106:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109 A[Catch: all -> 0x005a, PHI: r12 r13 r14
  0x0109: PHI (r12v17 'this' a.tdg0) = (r12v0 'this' a.tdg0 A[IMMUTABLE_TYPE, THIS]), (r12v20 'this' a.tdg0) binds: [B:67:0x0105, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r13v19 a.qpg0) = (r13v16 a.qpg0), (r13v21 a.qpg0) binds: [B:67:0x0105, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r14v26 java.lang.Object) = (r14v25 java.lang.Object), (r14v1 java.lang.Object) binds: [B:67:0x0105, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x005a, blocks: (B:20:0x0055, B:74:0x011d, B:25:0x0068, B:69:0x0109, B:71:0x010f, B:80:0x0134, B:81:0x014b, B:66:0x00f8), top: B:106:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010f A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:20:0x0055, B:74:0x011d, B:25:0x0068, B:69:0x0109, B:71:0x010f, B:80:0x0134, B:81:0x014b, B:66:0x00f8), top: B:106:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d A[Catch: all -> 0x005a, PHI: r12 r13
  0x011d: PHI (r12v21 'this' a.tdg0) = (r12v17 'this' a.tdg0), (r12v25 'this' a.tdg0) binds: [B:72:0x011a, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r13v22 a.qpg0) = (r13v19 a.qpg0), (r13v24 a.qpg0) binds: [B:72:0x011a, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x005a, blocks: (B:20:0x0055, B:74:0x011d, B:25:0x0068, B:69:0x0109, B:71:0x010f, B:80:0x0134, B:81:0x014b, B:66:0x00f8), top: B:106:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #3 {all -> 0x005a, blocks: (B:20:0x0055, B:74:0x011d, B:25:0x0068, B:69:0x0109, B:71:0x010f, B:80:0x0134, B:81:0x014b, B:66:0x00f8), top: B:106:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d A[PHI: r12 r13
  0x016d: PHI (r12v7 java.lang.Object) = (r12v5 java.lang.Object), (r12v5 java.lang.Object), (r12v31 java.lang.Object) binds: [B:84:0x0158, B:86:0x016a, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r13v5 a.qpg0) = (r13v4 a.qpg0), (r13v4 a.qpg0), (r13v29 a.qpg0) binds: [B:84:0x0158, B:86:0x016a, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0173  */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0134, please report this as an issue */
    public final Object a(qpg0 qpg0Var, zje zjeVar) throws Throwable {
        u16 u16Var;
        Throwable th;
        qpg0 qpg0Var2;
        qpg0 qpg0Var3;
        Object obj;
        Throwable thA;
        xpg0 xpg0VarZ0;
        String strJ0;
        eeg0 eeg0Var;
        ke70 ke70Var = this.d;
        if (zjeVar instanceof u16) {
            u16Var = (u16) zjeVar;
            int i = u16Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                u16Var.m = i - Integer.MIN_VALUE;
            } else {
                u16Var = new u16(this, zjeVar);
            }
        } else {
            u16Var = new u16(this, zjeVar);
        }
        Object objValueOf = u16Var.k;
        wne wneVar = wne.f39444a;
        try {
            switch (u16Var.m) {
                case 0:
                    z1x.P(objValueOf);
                    u16Var.i = qpg0Var;
                    boolean z = true;
                    u16Var.m = 1;
                    xpg0 xpg0VarZ1 = qpg0Var.Z0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                    try {
                        if (!xpg0VarZ1.W0() || xpg0VarZ1.getLong(0) == 0) {
                            z = false;
                        }
                        objValueOf = Boolean.valueOf(z);
                        ay3.L(xpg0VarZ1, null);
                        if (objValueOf != wneVar) {
                            if (!((Boolean) objValueOf).booleanValue()) {
                                xpg0VarZ0 = qpg0Var.Z0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                                try {
                                    if (xpg0VarZ0.W0()) {
                                        strJ0 = xpg0VarZ0.J0(0);
                                    } else {
                                        strJ0 = null;
                                    }
                                    ay3.L(xpg0VarZ0, null);
                                    if (!"9c0f7c853a4da42d379e451bd4efb125".equals(strJ0) && !"3a804b75b4586e7ea44eeec525afff4a".equals(strJ0)) {
                                        udk.e(strJ0, "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 9c0f7c853a4da42d379e451bd4efb125, found: ");
                                        return null;
                                    }
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ay3.L(xpg0VarZ0, th2);
                                        throw th3;
                                    }
                                }
                            } else {
                                u16Var.i = qpg0Var;
                                u16Var.m = 2;
                                if (j0x.s(qpg0Var, "BEGIN EXCLUSIVE TRANSACTION") != wneVar) {
                                    e0g0 e0g0Var = j0g0.b;
                                    u16Var.i = qpg0Var;
                                    u16Var.j = this;
                                    u16Var.m = 3;
                                    objValueOf = ke70Var.b(qpg0Var, u16Var);
                                    if (objValueOf != wneVar) {
                                        eeg0Var = (eeg0) objValueOf;
                                        if (eeg0Var.f7673a) {
                                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + eeg0Var.b).toString());
                                        }
                                        ke70 ke70Var2 = this.d;
                                        u16Var.i = qpg0Var;
                                        u16Var.j = this;
                                        u16Var.m = 4;
                                        if (Unit.f46060a == wneVar) {
                                            u16Var.i = qpg0Var;
                                            u16Var.j = null;
                                            u16Var.m = 5;
                                            if (this.m(qpg0Var, u16Var) != wneVar) {
                                                qpg0Var2 = qpg0Var;
                                                Unit unit = Unit.f46060a;
                                                e0g0 e0g0Var2 = j0g0.b;
                                                qpg0Var3 = qpg0Var2;
                                                obj = unit;
                                                if (obj instanceof g0g0) {
                                                    thA = j0g0.a(obj);
                                                    if (thA != null) {
                                                        u16Var.i = thA;
                                                        u16Var.j = null;
                                                        u16Var.m = 7;
                                                        if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                                            throw thA;
                                                        }
                                                    }
                                                } else {
                                                    u16Var.i = qpg0Var3;
                                                    u16Var.j = obj;
                                                    u16Var.m = 6;
                                                    if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                                                        thA = j0g0.a(obj);
                                                        if (thA != null) {
                                                            u16Var.i = thA;
                                                            u16Var.j = null;
                                                            u16Var.m = 7;
                                                            if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                                                throw thA;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.f46060a;
                        }
                        return wneVar;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ay3.L(xpg0VarZ1, th4);
                            throw th5;
                        }
                    }
                case 1:
                    qpg0Var = (qpg0) u16Var.i;
                    z1x.P(objValueOf);
                    if (!((Boolean) objValueOf).booleanValue()) {
                        u16Var.i = qpg0Var;
                        u16Var.m = 2;
                        if (j0x.s(qpg0Var, "BEGIN EXCLUSIVE TRANSACTION") != wneVar) {
                            e0g0 e0g0Var3 = j0g0.b;
                            u16Var.i = qpg0Var;
                            u16Var.j = this;
                            u16Var.m = 3;
                            objValueOf = ke70Var.b(qpg0Var, u16Var);
                            if (objValueOf != wneVar) {
                                eeg0Var = (eeg0) objValueOf;
                                if (eeg0Var.f7673a) {
                                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + eeg0Var.b).toString());
                                }
                                ke70 ke70Var3 = this.d;
                                u16Var.i = qpg0Var;
                                u16Var.j = this;
                                u16Var.m = 4;
                                if (Unit.f46060a == wneVar) {
                                    u16Var.i = qpg0Var;
                                    u16Var.j = null;
                                    u16Var.m = 5;
                                    if (this.m(qpg0Var, u16Var) != wneVar) {
                                        qpg0Var2 = qpg0Var;
                                        Unit unit2 = Unit.f46060a;
                                        e0g0 e0g0Var4 = j0g0.b;
                                        qpg0Var3 = qpg0Var2;
                                        obj = unit2;
                                        if (obj instanceof g0g0) {
                                            u16Var.i = qpg0Var3;
                                            u16Var.j = obj;
                                            u16Var.m = 6;
                                            if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                                                thA = j0g0.a(obj);
                                                if (thA != null) {
                                                    u16Var.i = thA;
                                                    u16Var.j = null;
                                                    u16Var.m = 7;
                                                    if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                                        throw thA;
                                                    }
                                                }
                                            }
                                        } else {
                                            thA = j0g0.a(obj);
                                            if (thA != null) {
                                                u16Var.i = thA;
                                                u16Var.j = null;
                                                u16Var.m = 7;
                                                if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                                    throw thA;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return wneVar;
                    }
                    xpg0VarZ0 = qpg0Var.Z0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                    if (xpg0VarZ0.W0()) {
                        strJ0 = xpg0VarZ0.J0(0);
                    } else {
                        strJ0 = null;
                    }
                    ay3.L(xpg0VarZ0, null);
                    if (!"9c0f7c853a4da42d379e451bd4efb125".equals(strJ0)) {
                        udk.e(strJ0, "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 9c0f7c853a4da42d379e451bd4efb125, found: ");
                        return null;
                    }
                    break;
                    return Unit.f46060a;
                case 2:
                    qpg0Var = (qpg0) u16Var.i;
                    z1x.P(objValueOf);
                    e0g0 e0g0Var5 = j0g0.b;
                    u16Var.i = qpg0Var;
                    u16Var.j = this;
                    u16Var.m = 3;
                    objValueOf = ke70Var.b(qpg0Var, u16Var);
                    if (objValueOf != wneVar) {
                        eeg0Var = (eeg0) objValueOf;
                        if (eeg0Var.f7673a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + eeg0Var.b).toString());
                        }
                        ke70 ke70Var4 = this.d;
                        u16Var.i = qpg0Var;
                        u16Var.j = this;
                        u16Var.m = 4;
                        if (Unit.f46060a == wneVar) {
                            u16Var.i = qpg0Var;
                            u16Var.j = null;
                            u16Var.m = 5;
                            if (this.m(qpg0Var, u16Var) != wneVar) {
                                qpg0Var2 = qpg0Var;
                                Unit unit3 = Unit.f46060a;
                                e0g0 e0g0Var6 = j0g0.b;
                                qpg0Var3 = qpg0Var2;
                                obj = unit3;
                                if (obj instanceof g0g0) {
                                    thA = j0g0.a(obj);
                                    if (thA != null) {
                                        u16Var.i = thA;
                                        u16Var.j = null;
                                        u16Var.m = 7;
                                        if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                            throw thA;
                                        }
                                    }
                                    return Unit.f46060a;
                                }
                                u16Var.i = qpg0Var3;
                                u16Var.j = obj;
                                u16Var.m = 6;
                                if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                                    thA = j0g0.a(obj);
                                    if (thA != null) {
                                        u16Var.i = thA;
                                        u16Var.j = null;
                                        u16Var.m = 7;
                                        if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                            throw thA;
                                        }
                                    }
                                    return Unit.f46060a;
                                }
                            }
                        }
                    }
                    return wneVar;
                case 3:
                    this = (tdg0) u16Var.j;
                    qpg0Var = (qpg0) u16Var.i;
                    z1x.P(objValueOf);
                    eeg0Var = (eeg0) objValueOf;
                    if (eeg0Var.f7673a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + eeg0Var.b).toString());
                    }
                    ke70 ke70Var5 = this.d;
                    u16Var.i = qpg0Var;
                    u16Var.j = this;
                    u16Var.m = 4;
                    if (Unit.f46060a == wneVar) {
                        u16Var.i = qpg0Var;
                        u16Var.j = null;
                        u16Var.m = 5;
                        if (this.m(qpg0Var, u16Var) != wneVar) {
                            qpg0Var2 = qpg0Var;
                            Unit unit4 = Unit.f46060a;
                            e0g0 e0g0Var7 = j0g0.b;
                            qpg0Var3 = qpg0Var2;
                            obj = unit4;
                            if (obj instanceof g0g0) {
                                thA = j0g0.a(obj);
                                if (thA != null) {
                                    u16Var.i = thA;
                                    u16Var.j = null;
                                    u16Var.m = 7;
                                    if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                        throw thA;
                                    }
                                }
                                return Unit.f46060a;
                            }
                            u16Var.i = qpg0Var3;
                            u16Var.j = obj;
                            u16Var.m = 6;
                            if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                                thA = j0g0.a(obj);
                                if (thA != null) {
                                    u16Var.i = thA;
                                    u16Var.j = null;
                                    u16Var.m = 7;
                                    if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                        throw thA;
                                    }
                                }
                                return Unit.f46060a;
                            }
                        }
                    }
                    return wneVar;
                case 4:
                    this = (tdg0) u16Var.j;
                    qpg0Var = (qpg0) u16Var.i;
                    z1x.P(objValueOf);
                    u16Var.i = qpg0Var;
                    u16Var.j = null;
                    u16Var.m = 5;
                    if (this.m(qpg0Var, u16Var) != wneVar) {
                        qpg0Var2 = qpg0Var;
                        Unit unit5 = Unit.f46060a;
                        e0g0 e0g0Var8 = j0g0.b;
                        qpg0Var3 = qpg0Var2;
                        obj = unit5;
                        if (obj instanceof g0g0) {
                            thA = j0g0.a(obj);
                            if (thA != null) {
                                u16Var.i = thA;
                                u16Var.j = null;
                                u16Var.m = 7;
                                if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                    throw thA;
                                }
                            }
                            return Unit.f46060a;
                        }
                        u16Var.i = qpg0Var3;
                        u16Var.j = obj;
                        u16Var.m = 6;
                        if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                            thA = j0g0.a(obj);
                            if (thA != null) {
                                u16Var.i = thA;
                                u16Var.j = null;
                                u16Var.m = 7;
                                if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                    throw thA;
                                }
                            }
                            return Unit.f46060a;
                        }
                    }
                    return wneVar;
                case 5:
                    qpg0Var2 = (qpg0) u16Var.i;
                    try {
                        z1x.P(objValueOf);
                        Unit unit6 = Unit.f46060a;
                        e0g0 e0g0Var9 = j0g0.b;
                        qpg0Var3 = qpg0Var2;
                        obj = unit6;
                    } catch (Throwable th6) {
                        th = th6;
                        e0g0 e0g0Var10 = j0g0.b;
                        g0g0 g0g0Var = new g0g0(th);
                        qpg0Var3 = qpg0Var2;
                        obj = g0g0Var;
                    }
                    if (obj instanceof g0g0) {
                        thA = j0g0.a(obj);
                        if (thA != null) {
                            u16Var.i = thA;
                            u16Var.j = null;
                            u16Var.m = 7;
                            if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                throw thA;
                            }
                        }
                        return Unit.f46060a;
                    }
                    u16Var.i = qpg0Var3;
                    u16Var.j = obj;
                    u16Var.m = 6;
                    if (j0x.s(qpg0Var3, "END TRANSACTION") != wneVar) {
                        thA = j0g0.a(obj);
                        if (thA != null) {
                            u16Var.i = thA;
                            u16Var.j = null;
                            u16Var.m = 7;
                            if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                                throw thA;
                            }
                        }
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 6:
                    obj = u16Var.j;
                    qpg0Var3 = (qpg0) u16Var.i;
                    z1x.P(objValueOf);
                    thA = j0g0.a(obj);
                    if (thA != null) {
                        u16Var.i = thA;
                        u16Var.j = null;
                        u16Var.m = 7;
                        if (j0x.s(qpg0Var3, "ROLLBACK TRANSACTION") == wneVar) {
                            return wneVar;
                        }
                        throw thA;
                    }
                    return Unit.f46060a;
                case 7:
                    Throwable th7 = (Throwable) u16Var.i;
                    z1x.P(objValueOf);
                    throw th7;
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th8) {
            th = th8;
            qpg0Var2 = qpg0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r7 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.qpg0 r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.v16
            if (r0 == 0) goto L13
            r0 = r9
            a.v16 r0 = (a.v16) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.v16 r0 = new a.v16
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.z1x.P(r9)
            goto L78
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L34:
            a.qpg0 r8 = r0.i
            a.z1x.P(r9)
            goto L59
        L3a:
            a.qpg0 r8 = r0.i
            a.z1x.P(r9)
            goto L4e
        L40:
            a.z1x.P(r9)
            r0.i = r8
            r0.l = r6
            kotlin.Unit r9 = c(r8)
            if (r9 != r1) goto L4e
            goto L77
        L4e:
            r0.i = r8
            r0.l = r5
            kotlin.Unit r9 = r7.e(r8)
            if (r9 != r1) goto L59
            goto L77
        L59:
            r0.i = r3
            r0.l = r4
            a.ke70 r7 = r7.d
            org.xplatform.onexdatabase.OnexDatabase_Impl r7 = r7.f18140a
            int r9 = org.xplatform.onexdatabase.OnexDatabase_Impl.y
            a.lox r7 = r7.d()
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L6e
            goto L70
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L70:
            if (r7 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L75:
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.b(a.qpg0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[PHI: r9
  0x00c6: PHI (r9v13 ??) = (r9v10 ??), (r9v15 ??) binds: [B:43:0x00c2, B:28:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[PHI: r9
  0x00d3: PHI (r9v16 ??) = (r9v45 ??), (r9v46 ??) binds: [B:46:0x00cf, B:27:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:21:0x0057, B:56:0x00fb, B:58:0x00ff, B:63:0x0112), top: B:99:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:21:0x0057, B:56:0x00fb, B:58:0x00ff, B:63:0x0112), top: B:99:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133 A[Catch: all -> 0x004c, PHI: r9
  0x0133: PHI (r9v34 ??) = (r9v40 ??), (r9v41 ??) binds: [B:67:0x0130, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:16:0x0047, B:69:0x0133, B:66:0x0121), top: B:99:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c A[PHI: r2 r9
  0x015c: PHI (r2v5 ??) = (r2v24 ??), (r2v25 ??), (r2v26 ??) binds: [B:73:0x0146, B:75:0x0159, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x015c: PHI (r9v7 java.lang.Object) = (r9v5 java.lang.Object), (r9v5 java.lang.Object), (r9v38 java.lang.Object) binds: [B:73:0x0146, B:75:0x0159, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176 A[PHI: r9
  0x0176: PHI (r9v6 ??) = (r9v9 ??), (r9v39 ??) binds: [B:84:0x0175, B:51:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (k(r8, r2, r9, 46, r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0182, code lost:
    
        if (l(r9, r0) == r1) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v34, types: [a.tdg0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.qpg0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.tdg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [a.qpg0] */
    /* JADX WARN: Type inference failed for: r9v16, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [a.qpg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v6, types: [a.qpg0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(a.qpg0 r9, a.zje r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.d(a.qpg0, a.zje):java.lang.Object");
    }

    public final Unit e(qpg0 qpg0Var) {
        if (((xdg0) this.c.c) == xdg0.b) {
            Unit unitS = j0x.s(qpg0Var, "PRAGMA synchronous = NORMAL");
            return unitS == wne.f39444a ? unitS : Unit.f46060a;
        }
        Unit unitS2 = j0x.s(qpg0Var, "PRAGMA synchronous = FULL");
        return unitS2 == wne.f39444a ? unitS2 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (kotlin.Unit.f46060a == r8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(a.qpg0 r7, a.zje r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.f(a.qpg0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Unit g(qpg0 qpg0Var, zje zjeVar) {
        y16 y16Var;
        Iterator it;
        if (zjeVar instanceof y16) {
            y16Var = (y16) zjeVar;
            int i = y16Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                y16Var.m = i - Integer.MIN_VALUE;
            } else {
                y16Var = new y16(this, zjeVar);
            }
        } else {
            y16Var = new y16(this, zjeVar);
        }
        Object obj = y16Var.k;
        wne wneVar = wne.f39444a;
        int i2 = y16Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            it = this.e.iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = y16Var.j;
            qpg0Var = y16Var.i;
            z1x.P(obj);
        }
        if (!it.hasNext()) {
            return Unit.f46060a;
        }
        if (it.next() != null) {
            hny.b();
            return null;
        }
        y16Var.i = qpg0Var;
        y16Var.j = it;
        y16Var.m = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Unit h(qpg0 qpg0Var, zje zjeVar) {
        z16 z16Var;
        Iterator it;
        if (zjeVar instanceof z16) {
            z16Var = (z16) zjeVar;
            int i = z16Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                z16Var.m = i - Integer.MIN_VALUE;
            } else {
                z16Var = new z16(this, zjeVar);
            }
        } else {
            z16Var = new z16(this, zjeVar);
        }
        Object obj = z16Var.k;
        wne wneVar = wne.f39444a;
        int i2 = z16Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            it = this.e.iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = z16Var.j;
            qpg0Var = z16Var.i;
            z1x.P(obj);
        }
        if (!it.hasNext()) {
            return Unit.f46060a;
        }
        if (it.next() != null) {
            hny.b();
            return null;
        }
        z16Var.i = qpg0Var;
        z16Var.j = it;
        z16Var.m = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Unit i(qpg0 qpg0Var, zje zjeVar) {
        a26 a26Var;
        Iterator it;
        if (zjeVar instanceof a26) {
            a26Var = (a26) zjeVar;
            int i = a26Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                a26Var.m = i - Integer.MIN_VALUE;
            } else {
                a26Var = new a26(this, zjeVar);
            }
        } else {
            a26Var = new a26(this, zjeVar);
        }
        Object obj = a26Var.k;
        wne wneVar = wne.f39444a;
        int i2 = a26Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            it = this.e.iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = a26Var.j;
            qpg0Var = a26Var.i;
            z1x.P(obj);
        }
        if (!it.hasNext()) {
            return Unit.f46060a;
        }
        if (it.next() != null) {
            hny.b();
            return null;
        }
        a26Var.i = qpg0Var;
        a26Var.j = it;
        a26Var.m = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[PHI: r2
  0x00b5: PHI (r2v8 a.qpg0) = (r2v6 a.qpg0), (r2v10 a.qpg0) binds: [B:35:0x0094, B:42:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc A[PHI: r11
  0x00cc: PHI (r11v18 a.qpg0) = (r11v16 a.qpg0), (r11v19 a.qpg0) binds: [B:50:0x00c9, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (g(r11, r0) == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.qpg0 r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.j(a.qpg0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (i(r8, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(a.qpg0 r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.d26
            if (r0 == 0) goto L13
            r0 = r9
            a.d26 r0 = (a.d26) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.d26 r0 = new a.d26
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.z1x.P(r9)
            goto L78
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L34:
            a.qpg0 r8 = r0.i
            a.z1x.P(r9)
            goto L6d
        L3a:
            a.qpg0 r8 = r0.i
            a.z1x.P(r9)
            goto L4e
        L40:
            a.z1x.P(r9)
            r0.i = r8
            r0.l = r6
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L4e
            goto L77
        L4e:
            r0.i = r8
            r0.l = r5
            a.ke70 r9 = r7.d
            org.xplatform.onexdatabase.OnexDatabase_Impl r9 = r9.f18140a
            int r2 = org.xplatform.onexdatabase.OnexDatabase_Impl.y
            a.lox r9 = r9.d()
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L65:
            if (r9 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L6a:
            if (r9 != r1) goto L6d
            goto L77
        L6d:
            r0.i = r3
            r0.l = r4
            kotlin.Unit r8 = r7.i(r8, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            r7.f33768a = r6
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.l(a.qpg0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (a.j0x.s(r6, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9c0f7c853a4da42d379e451bd4efb125')") == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(a.qpg0 r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.f26
            if (r0 == 0) goto L13
            r0 = r7
            a.f26 r0 = (a.f26) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.f26 r0 = new a.f26
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.j
            a.wne r7 = a.wne.f39444a
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            a.z1x.P(r5)
            goto L59
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            return r2
        L31:
            a.qpg0 r6 = r0.i
            a.z1x.P(r5)
            goto L4c
        L37:
            a.z1x.P(r5)
            r0.i = r6
            r0.l = r4
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            kotlin.Unit r5 = a.j0x.s(r6, r5)
            if (r5 != r7) goto L47
            goto L49
        L47:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L49:
            if (r5 != r7) goto L4c
            goto L58
        L4c:
            r0.i = r2
            r0.l = r3
            java.lang.String r5 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9c0f7c853a4da42d379e451bd4efb125')"
            kotlin.Unit r5 = a.j0x.s(r6, r5)
            if (r5 != r7) goto L59
        L58:
            return r7
        L59:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tdg0.m(a.qpg0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(boolean z, Function2 function2, zje zjeVar) {
        sdg0 sdg0Var;
        if (zjeVar instanceof sdg0) {
            sdg0Var = (sdg0) zjeVar;
            int i = sdg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdg0Var.k = i - Integer.MIN_VALUE;
            } else {
                sdg0Var = new sdg0(this, zjeVar);
            }
        } else {
            sdg0Var = new sdg0(this, zjeVar);
        }
        Object objM = sdg0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = sdg0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objM);
                s1e s1eVar = this.f;
                sdg0Var.k = 1;
                objM = s1eVar.m(z, function2, sdg0Var);
                if (objM == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objM);
            }
            return objM;
        } catch (Throwable th) {
            throw th;
        }
    }
}
