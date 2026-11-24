package a;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l3k0 implements mlx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f19361a = new k050();
    public final ok50 b = new ok50((byte) 11);
    public final vsg0 c = new vsg0(new p23(2, null, 12));

    public l3k0(String str) {
    }

    @Override // a.mlx
    public final Object a(zje zjeVar) {
        return new Integer(((AtomicInteger) this.b.f25390a).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.l3k0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // a.mlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.j3k0
            if (r0 == 0) goto L13
            r0 = r8
            a.j3k0 r0 = (a.j3k0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.j3k0 r0 = new a.j3k0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.i
            a.i050 r6 = (a.i050) r6
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L37:
            a.k050 r6 = r0.j
            java.lang.Object r7 = r0.i
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            a.z1x.P(r8)
            goto L53
        L41:
            a.z1x.P(r8)
            r0.i = r7
            a.k050 r6 = r6.f19361a
            r0.j = r6
            r0.m = r4
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L53
            goto L5f
        L53:
            r0.i = r6     // Catch: java.lang.Throwable -> L2f
            r0.j = r5     // Catch: java.lang.Throwable -> L2f
            r0.m = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            r6.c(r5)
            return r8
        L64:
            r6.c(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l3k0.b(kotlin.jvm.functions.Function1, a.zje):java.lang.Object");
    }

    @Override // a.mlx
    public final gmq c() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.mlx
    public final Object d(Function2 function2, zje zjeVar) throws Throwable {
        k3k0 k3k0Var;
        k050 k050Var;
        boolean z;
        Throwable th;
        if (zjeVar instanceof k3k0) {
            k3k0Var = (k3k0) zjeVar;
            int i = k3k0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                k3k0Var.m = i - Integer.MIN_VALUE;
            } else {
                k3k0Var = new k3k0(this, zjeVar);
            }
        } else {
            k3k0Var = new k3k0(this, zjeVar);
        }
        Object obj = k3k0Var.k;
        Object obj2 = wne.f39444a;
        int i2 = k3k0Var.m;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = k3k0Var.j;
            k050Var = k3k0Var.i;
            try {
                z1x.P(obj);
                if (z) {
                    k050Var.c(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    k050Var.c(null);
                }
                throw th;
            }
        }
        z1x.P(obj);
        k050 k050Var2 = this.f19361a;
        boolean zG = k050Var2.g();
        try {
            Object objValueOf = Boolean.valueOf(zG);
            k3k0Var.i = k050Var2;
            k3k0Var.j = zG;
            k3k0Var.m = 1;
            Object objInvoke = function2.invoke(objValueOf, k3k0Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            k050Var = k050Var2;
            z = zG;
            obj = objInvoke;
            if (z) {
                k050Var.c(null);
            }
            return obj;
        } catch (Throwable th3) {
            k050Var = k050Var2;
            z = zG;
            th = th3;
            if (z) {
                k050Var.c(null);
            }
            throw th;
        }
    }

    @Override // a.mlx
    public final Object e(mcj mcjVar) {
        return new Integer(((AtomicInteger) this.b.f25390a).incrementAndGet());
    }
}
