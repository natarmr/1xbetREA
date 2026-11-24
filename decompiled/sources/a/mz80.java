package a;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mz80 implements fhs0, v9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final due0 f22641a;
    public final qpg0 b;
    public final AtomicInteger c;
    public dhs0 d;

    public mz80(due0 due0Var, qpg0 qpg0Var) {
        qpg0Var.getClass();
        this.f22641a = due0Var;
        this.b = qpg0Var;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.mz80] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // a.iva0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.jvm.functions.Function2 r9, a.zje r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof a.lz80
            if (r0 == 0) goto L13
            r0 = r10
            a.lz80 r0 = (a.lz80) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.lz80 r0 = new a.lz80
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.i
            java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L32
            goto L8e
        L32:
            r8 = move-exception
            goto L92
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L3a:
            a.z1x.P(r10)
            return r10
        L3e:
            a.bnn0 r8 = r0.j
            r9 = r8
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r8 = r0.i
            java.lang.String r8 = (java.lang.String) r8
            a.z1x.P(r10)
            goto L5e
        L4b:
            a.z1x.P(r10)
            r0.i = r8
            r10 = r9
            a.bnn0 r10 = (a.bnn0) r10
            r0.j = r10
            r0.m = r5
            java.lang.Boolean r10 = r7.b(r0)
            if (r10 != r1) goto L5e
            goto L8d
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7b
            a.bm4 r10 = new a.bm4
            r10.<init>(r7, r8, r9, r6)
            r0.i = r6
            r0.j = r6
            r0.m = r4
            a.due0 r7 = r7.f22641a
            java.lang.Object r7 = r7.invoke(r10, r0)
            if (r7 != r1) goto L7a
            goto L8d
        L7a:
            return r7
        L7b:
            a.qpg0 r7 = r7.b
            a.xpg0 r7 = r7.Z0(r8)
            r0.i = r7     // Catch: java.lang.Throwable -> L32
            r0.j = r6     // Catch: java.lang.Throwable -> L32
            r0.m = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = r9.invoke(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r10 != r1) goto L8e
        L8d:
            return r1
        L8e:
            a.ay3.L(r7, r6)
            return r10
        L92:
            throw r8     // Catch: java.lang.Throwable -> L93
        L93:
            r9 = move-exception
            a.ay3.L(r7, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mz80.a(java.lang.String, kotlin.jvm.functions.Function2, a.zje):java.lang.Object");
    }

    @Override // a.fhs0
    public final Boolean b(yje yjeVar) {
        return Boolean.valueOf(this.d != null || this.b.P0());
    }

    @Override // a.v9e0
    public final Object c(kyh kyhVar, yje yjeVar) {
        return kyhVar.invoke(this.b, yjeVar);
    }

    @Override // a.fhs0
    public final Object d(dhs0 dhs0Var, Function2 function2, bnn0 bnn0Var) {
        Object objInvoke = this.f22641a.invoke(new xg0(this, dhs0Var, function2, null, (byte) 18), bnn0Var);
        wne wneVar = wne.f39444a;
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object e(dhs0 dhs0Var, Function2 function2, zje zjeVar) {
        kz80 kz80Var;
        dhs0 dhs0Var2;
        Function2 function3;
        hie0 hie0Var;
        mie0 mie0Var;
        hie0 hie0Var2;
        mie0 mie0Var2;
        Object obj;
        hie0 hie0Var3;
        z560 z560Var;
        mt00 mt00Var;
        if (zjeVar instanceof kz80) {
            kz80Var = (kz80) zjeVar;
            int i = kz80Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz80Var.m = i - Integer.MIN_VALUE;
            } else {
                kz80Var = new kz80(this, zjeVar);
            }
        } else {
            kz80Var = new kz80(this, zjeVar);
        }
        kz80 kz80Var2 = kz80Var;
        Object obj2 = kz80Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = kz80Var2.m;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                z560 z560Var2 = z560.b;
                er60 er60Var = new er60(dhs0Var, this, yjeVar, (byte) 14);
                kz80Var2.i = dhs0Var;
                kz80Var2.j = (Serializable) function2;
                kz80Var2.m = 1;
                if (qjj.d0(z560Var2, er60Var, kz80Var2) != wneVar) {
                    dhs0Var2 = dhs0Var;
                    function3 = function2;
                }
                return wneVar;
            }
            if (i2 == 1) {
                Function2 function4 = (Function2) kz80Var2.j;
                dhs0 dhs0Var3 = (dhs0) kz80Var2.i;
                z1x.P(obj2);
                function3 = function4;
                dhs0Var2 = dhs0Var3;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Object obj3 = kz80Var2.i;
                        z1x.P(obj2);
                        return obj3;
                    }
                    if (i2 == 4) {
                        Object obj4 = kz80Var2.i;
                        z1x.P(obj2);
                        return obj4;
                    }
                    if (i2 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) kz80Var2.i;
                    z1x.P(obj2);
                    throw th;
                }
                mie0Var2 = (mie0) kz80Var2.j;
                hie0 hie0Var4 = (hie0) kz80Var2.i;
                try {
                    z1x.P(obj2);
                    obj = obj2;
                    hie0Var3 = hie0Var4;
                    z560Var = z560.b;
                    mt00Var = new mt00(this, hie0Var3, mie0Var2, yjeVar, (byte) 28);
                    kz80Var2.i = obj;
                    kz80Var2.j = null;
                    kz80Var2.m = 3;
                    if (qjj.d0(z560Var, mt00Var, kz80Var2) != wneVar) {
                        return wneVar;
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    hie0Var2 = hie0Var4;
                    try {
                        hie0Var2.f13108a = false;
                        mie0Var2.f21842a = th;
                        throw th;
                    } catch (Throwable th3) {
                        z560 z560Var3 = z560.b;
                        mt00 mt00Var2 = new mt00(this, hie0Var2, mie0Var2, yjeVar, (byte) 28);
                        kz80Var2.i = th3;
                        kz80Var2.j = null;
                        kz80Var2.m = 5;
                        if (qjj.d0(z560Var3, mt00Var2, kz80Var2) != wneVar) {
                            throw th3;
                        }
                    }
                }
            }
            jz80 jz80Var = new jz80(this, (byte) 0);
            kz80Var2.i = hie0Var;
            kz80Var2.j = mie0Var;
            kz80Var2.m = 2;
            Object objInvoke = function3.invoke(jz80Var, kz80Var2);
            if (objInvoke != wneVar) {
                obj = objInvoke;
                hie0Var3 = hie0Var;
                mie0Var2 = mie0Var;
                z560Var = z560.b;
                mt00Var = new mt00(this, hie0Var3, mie0Var2, yjeVar, (byte) 28);
                kz80Var2.i = obj;
                kz80Var2.j = null;
                kz80Var2.m = 3;
                if (qjj.d0(z560Var, mt00Var, kz80Var2) != wneVar) {
                    return obj;
                }
            }
            return wneVar;
        } catch (Throwable th4) {
            th = th4;
            hie0Var2 = hie0Var;
            mie0Var2 = mie0Var;
            hie0Var2.f13108a = false;
            mie0Var2.f21842a = th;
            throw th;
        }
        if (this.c.incrementAndGet() > 0) {
            this.d = dhs0Var2;
        }
        hie0Var = new hie0();
        hie0Var.f13108a = true;
        mie0Var = new mie0();
    }
}
