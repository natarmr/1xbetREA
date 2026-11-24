package a;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class xk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41010a;
    public boolean b;
    public boolean c;
    public boolean g;
    public boolean h;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final p7m0 e = q7m0.a(iun.f15405a);
    public final qoj0 f = roj0.a(0, 1, i99.b);
    public final k050 i = new k050();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jm0 jm0Var, zje zjeVar) {
        vk0 vk0Var;
        jm0 jm0Var2;
        i050 i050Var;
        Throwable th;
        i050 i050Var2;
        if (zjeVar instanceof vk0) {
            vk0Var = (vk0) zjeVar;
            int i = vk0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk0Var.m = i - Integer.MIN_VALUE;
            } else {
                vk0Var = new vk0(this, zjeVar);
            }
        } else {
            vk0Var = new vk0(this, zjeVar);
        }
        Object obj = vk0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = vk0Var.m;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                vk0Var.i = jm0Var;
                k050 k050Var = this.i;
                vk0Var.j = k050Var;
                vk0Var.m = 1;
                if (k050Var.d(vk0Var) != wneVar) {
                    jm0Var2 = jm0Var;
                    i050Var = k050Var;
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = vk0Var.j;
                try {
                    z1x.P(obj);
                    i050Var = i050Var2;
                    i050Var.c(null);
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2.c(null);
                    throw th;
                }
            }
            i050Var = vk0Var.j;
            jm0Var2 = vk0Var.i;
            z1x.P(obj);
            if (this.f41010a) {
                if (!this.b && this.c && this.d.isEmpty()) {
                }
                i050Var.c(null);
                return Unit.f46060a;
            }
            vk0Var.i = null;
            vk0Var.j = i050Var;
            vk0Var.m = 2;
            if (jm0Var2.invoke(vk0Var) != wneVar) {
                i050Var2 = i050Var;
                i050Var = i050Var2;
                i050Var.c(null);
                return Unit.f46060a;
            }
            return wneVar;
        } catch (Throwable th3) {
            i050 i050Var3 = i050Var;
            th = th3;
            i050Var2 = i050Var3;
            i050Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r7.invoke(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.xk0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.km0 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.wk0
            if (r0 == 0) goto L13
            r0 = r8
            a.wk0 r0 = (a.wk0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.wk0 r0 = new a.wk0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.i050 r6 = r0.j
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5c
        L2d:
            r7 = move-exception
            goto L62
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L35:
            a.i050 r6 = r0.j
            a.km0 r7 = r0.i
            a.z1x.P(r8)
            goto L4f
        L3d:
            a.z1x.P(r8)
            r0.i = r7
            a.k050 r6 = r6.i
            r0.j = r6
            r0.m = r4
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L4f
            goto L5b
        L4f:
            r0.i = r5     // Catch: java.lang.Throwable -> L2d
            r0.j = r6     // Catch: java.lang.Throwable -> L2d
            r0.m = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r6.c(r5)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L62:
            r6.c(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xk0.b(a.km0, a.zje):java.lang.Object");
    }

    public final void c() {
        this.e.o(null, new ArrayList(this.d));
        this.f.g(Unit.f46060a);
    }
}
