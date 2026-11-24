package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ek50 f42727a;
    public ek50 b;
    public Function0 c = new np30(this, 18);
    public vne d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, long r11, a.zje r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof a.wj50
            if (r0 == 0) goto L14
            r0 = r13
            a.wj50 r0 = (a.wj50) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            a.wj50 r0 = new a.wj50
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.i
            a.wne r1 = a.wne.f39444a
            int r2 = r13.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.z1x.P(r0)
            goto L6e
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L33:
            a.z1x.P(r0)
            goto L55
        L37:
            a.z1x.P(r0)
            a.ek50 r0 = r8.f42727a
            if (r0 == 0) goto L43
            a.ek50 r0 = r0.a1()
            goto L44
        L43:
            r0 = r3
        L44:
            r6 = 0
            if (r0 != 0) goto L5a
            a.ek50 r8 = r8.b
            if (r8 == 0) goto L72
            r13.k = r5
            java.lang.Object r0 = r8.g(r9, r11, r13)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            a.g6u0 r0 = (a.g6u0) r0
            long r6 = r0.f10786a
            goto L72
        L5a:
            a.ek50 r8 = r8.f42727a
            if (r8 == 0) goto L62
            a.ek50 r3 = r8.a1()
        L62:
            r8 = r3
            if (r8 == 0) goto L72
            r13.k = r4
            java.lang.Object r0 = r8.g(r9, r11, r13)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            a.g6u0 r0 = (a.g6u0) r0
            long r6 = r0.f10786a
        L72:
            a.g6u0 r8 = new a.g6u0
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj50.a(long, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zje zjeVar) {
        xj50 xj50Var;
        long j2;
        if (zjeVar instanceof xj50) {
            xj50Var = (xj50) zjeVar;
            int i = xj50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj50Var.k = i - Integer.MIN_VALUE;
            } else {
                xj50Var = new xj50(this, zjeVar);
            }
        } else {
            xj50Var = new xj50(this, zjeVar);
        }
        Object objI0 = xj50Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xj50Var.k;
        if (i2 == 0) {
            z1x.P(objI0);
            ek50 ek50Var = this.f42727a;
            ek50 ek50VarA1 = ek50Var != null ? ek50Var.a1() : null;
            if (ek50VarA1 != null) {
                xj50Var.k = 1;
                objI0 = ek50VarA1.I0(j, xj50Var);
                if (objI0 == wneVar) {
                    return wneVar;
                }
            } else {
                j2 = 0;
            }
            return new g6u0(j2);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objI0);
        j2 = ((g6u0) objI0).f10786a;
        return new g6u0(j2);
    }

    public final vne c() {
        vne vneVar = (vne) this.c.invoke();
        if (vneVar != null) {
            return vneVar;
        }
        jf4.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
