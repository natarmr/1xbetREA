package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bpi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f2986a;
    public final rgs b;
    public final vrs0 c;

    public bpi0(pbt pbtVar, rgs rgsVar, vrs0 vrs0Var) {
        rgsVar.getClass();
        vrs0Var.getClass();
        this.f2986a = pbtVar;
        this.b = rgsVar;
        this.c = vrs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r5.c.a(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.api0
            if (r0 == 0) goto L13
            r0 = r7
            a.api0 r0 = (a.api0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.api0 r0 = new a.api0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L65
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            boolean r6 = r0.i
            a.z1x.P(r7)
            goto L58
        L37:
            a.z1x.P(r7)
            a.pbt r7 = r5.f2986a
            a.j5t r7 = r7.f26724a
            r7.u = r6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            java.lang.String r2 = "factorsLoaded"
            a.j5t.a(r7, r2)
            if (r6 == 0) goto L68
            r0.i = r6
            r0.l = r4
            a.rgs r7 = r5.b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L58
            goto L64
        L58:
            r0.i = r6
            r0.l = r3
            a.vrs0 r5 = r5.c
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L68:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bpi0.a(boolean, a.zje):java.lang.Object");
    }
}
