package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e1f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f7033a;

    public e1f0(rrc rrcVar) {
        this.f7033a = maz.b(new dio(rrcVar, (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        c1f0 c1f0Var;
        if (zjeVar instanceof c1f0) {
            c1f0Var = (c1f0) zjeVar;
            int i = c1f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1f0Var.k = i - Integer.MIN_VALUE;
            } else {
                c1f0Var = new c1f0(this, zjeVar);
            }
        } else {
            c1f0Var = new c1f0(this, zjeVar);
        }
        Object objW0 = c1f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = c1f0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            xue0 xue0Var = (xue0) this.f7033a.getValue();
            c1f0Var.k = 1;
            objW0 = sj3.w0(c1f0Var, xue0Var.f41507a, new st20(2, yjeVar, (byte) 23), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return Boolean.valueOf(((Number) objW0).longValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r8 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.ArrayList r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.d1f0
            if (r0 == 0) goto L13
            r0 = r10
            a.d1f0 r0 = (a.d1f0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.d1f0 r0 = new a.d1f0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            a.n0o0 r8 = r8.f7033a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3a
            if (r2 == r6) goto L34
            if (r2 != r5) goto L2e
            a.z1x.P(r10)
            goto L7b
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L34:
            java.util.ArrayList r9 = r0.i
            a.z1x.P(r10)
            goto L5c
        L3a:
            a.z1x.P(r10)
            java.lang.Object r10 = r8.getValue()
            a.xue0 r10 = (a.xue0) r10
            r0.i = r9
            r0.l = r6
            a.zdg0 r10 = r10.f41507a
            a.st20 r2 = new a.st20
            r7 = 24
            r2.<init>(r5, r4, r7)
            java.lang.Object r10 = a.sj3.w0(r0, r10, r2, r3, r6)
            if (r10 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L59:
            if (r10 != r1) goto L5c
            goto L7a
        L5c:
            java.lang.Object r8 = r8.getValue()
            a.xue0 r8 = (a.xue0) r8
            r0.i = r4
            r0.l = r5
            a.zdg0 r10 = r8.f41507a
            a.g4e0 r2 = new a.g4e0
            r5 = 26
            r2.<init>(r8, r9, r4, r5)
            java.lang.Object r8 = a.sj3.w0(r0, r10, r2, r3, r6)
            if (r8 != r1) goto L76
            goto L78
        L76:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L78:
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e1f0.b(java.util.ArrayList, a.zje):java.lang.Object");
    }
}
