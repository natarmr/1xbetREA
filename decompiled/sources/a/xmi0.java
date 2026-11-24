package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xmi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6j0 f41126a;
    public final w6j0 b;

    public xmi0(w6j0 w6j0Var, w6j0 w6j0Var2) {
        w6j0Var.getClass();
        w6j0Var2.getClass();
        this.f41126a = w6j0Var;
        this.b = w6j0Var2;
    }

    public final double a() {
        Double dC = this.f41126a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.b.d(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.wmi0
            if (r0 == 0) goto L13
            r0 = r6
            a.wmi0 r0 = (a.wmi0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.wmi0 r0 = new a.wmi0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L43
        L35:
            a.z1x.P(r6)
            r0.k = r4
            a.w6j0 r6 = r5.f41126a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L43
            goto L4d
        L43:
            r0.k = r3
            a.w6j0 r5 = r5.b
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xmi0.b(a.zje):java.lang.Object");
    }
}
