package a;

/* JADX INFO: loaded from: classes3.dex */
public final class s7t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f31767a;
    public final d3c b;
    public final fq c;
    public final qpt d;
    public final gmt e;
    public final rgs f;

    public s7t0(pbt pbtVar, d3c d3cVar, fq fqVar, qpt qptVar, gmt gmtVar, rgs rgsVar) {
        d3cVar.getClass();
        fqVar.getClass();
        qptVar.getClass();
        gmtVar.getClass();
        rgsVar.getClass();
        this.f31767a = pbtVar;
        this.b = d3cVar;
        this.c = fqVar;
        this.d = qptVar;
        this.e = gmtVar;
        this.f = rgsVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[PHI: r10
  0x009e: PHI (r10v3 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v5 boolean) binds: [B:33:0x008f, B:35:0x009b, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r9.f.a(r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.r7t0
            if (r0 == 0) goto L13
            r0 = r11
            a.r7t0 r0 = (a.r7t0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.r7t0 r0 = new a.r7t0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            a.fq r3 = r9.c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            a.z1x.P(r11)
            goto Lab
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L37:
            boolean r10 = r0.i
            a.z1x.P(r11)
            goto L9e
        L3d:
            boolean r10 = r0.i
            a.z1x.P(r11)
            goto L80
        L43:
            a.z1x.P(r11)
            a.pbt r11 = r9.f31767a
            a.j5t r11 = r11.f26724a
            r11.x = r10
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            java.lang.String r7 = "activeGameLoaded"
            a.j5t.a(r2, r7)
            if (r10 == 0) goto L8f
            a.d3c r2 = r9.b
            boolean r2 = r2.a()
            if (r2 != 0) goto L8f
            a.gmt r2 = r9.e
            a.ql5 r2 = r2.a()
            if (r2 != 0) goto L6d
            a.qpt r2 = r9.d
            a.ql5 r2 = r2.a()
        L6d:
            r8 = 0
            if (r2 == 0) goto L86
            a.hle r11 = new a.hle
            r11.<init>(r2, r8)
            r0.i = r10
            r0.l = r6
            java.lang.Object r11 = r3.f(r11, r0)
            if (r11 != r1) goto L80
            goto Laa
        L80:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            goto L8f
        L86:
            if (r10 == 0) goto L8f
            r11.x = r8
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            a.j5t.a(r11, r7)
        L8f:
            if (r10 == 0) goto L9e
            r0.i = r10
            r0.l = r5
            a.qle r11 = a.qle.f28929a
            java.lang.Object r11 = r3.f(r11, r0)
            if (r11 != r1) goto L9e
            goto Laa
        L9e:
            r0.i = r10
            r0.l = r4
            a.rgs r9 = r9.f
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s7t0.a(boolean, a.zje):java.lang.Object");
    }
}
