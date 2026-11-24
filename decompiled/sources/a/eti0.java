package a;

/* JADX INFO: loaded from: classes.dex */
public final class eti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw20 f8377a;
    public final phf0 b;
    public final zlt0 c;

    public eti0(nw20 nw20Var, phf0 phf0Var, zlt0 zlt0Var) {
        this.f8377a = nw20Var;
        this.b = phf0Var;
        this.c = zlt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r7.f8377a.m(r8, r4, r5, r6) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long[] r10, a.zje r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof a.dti0
            if (r0 == 0) goto L14
            r0 = r11
            a.dti0 r0 = (a.dti0) r0
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
            a.dti0 r0 = new a.dti0
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.k
            a.wne r0 = a.wne.f39444a
            int r1 = r6.m
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            a.z1x.P(r11)
            goto L74
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r2
        L33:
            long r8 = r6.i
            long[] r10 = r6.j
            a.z1x.P(r11)
            goto L5c
        L3b:
            a.z1x.P(r11)
            a.zlt0 r11 = r7.c
            boolean r11 = r11.n()
            if (r11 != 0) goto L49
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L49:
            a.phf0 r11 = r7.b
            a.i89 r11 = r11.m()
            r6.j = r10
            r6.i = r8
            r6.m = r4
            java.lang.Object r11 = a.ntb.K(r11, r6)
            if (r11 != r0) goto L5c
            goto L73
        L5c:
            r4 = r11
            a.ql5 r4 = (a.ql5) r4
            int r11 = r10.length
            long[] r5 = java.util.Arrays.copyOf(r10, r11)
            r6.j = r2
            r6.i = r8
            r6.m = r3
            a.nw20 r1 = r7.f8377a
            r2 = r8
            java.lang.Object r7 = r1.m(r2, r4, r5, r6)
            if (r7 != r0) goto L74
        L73:
            return r0
        L74:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eti0.a(long, long[], a.zje):java.lang.Object");
    }
}
