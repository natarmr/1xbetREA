package a;

/* JADX INFO: loaded from: classes.dex */
public final class pmq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27249a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ kmq d;

    public /* synthetic */ pmq(mie0 mie0Var, xdr xdrVar, kmq kmqVar, byte b) {
        this.f27249a = b;
        this.b = mie0Var;
        this.c = xdrVar;
        this.d = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r1.a(r11, r0) == r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r11 == r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r1.a(r11, r0) == r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r13;
     */
    @Override // a.kmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r12, a.yje r13) {
        /*
            r11 = this;
            byte r0 = r11.f27249a
            a.kmq r1 = r11.d
            a.xdr r2 = r11.c
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            r6 = 2
            a.mie0 r7 = r11.b
            r8 = 0
            switch(r0) {
                case 0: goto L66;
                default: goto L12;
            }
        L12:
            boolean r0 = r13 instanceof a.poq
            if (r0 == 0) goto L23
            r0 = r13
            a.poq r0 = (a.poq) r0
            int r9 = r0.l
            r10 = r9 & r4
            if (r10 == 0) goto L23
            int r9 = r9 - r4
            r0.l = r9
            goto L28
        L23:
            a.poq r0 = new a.poq
            r0.<init>(r11, r13)
        L28:
            java.lang.Object r11 = r0.j
            a.wne r13 = a.wne.f39444a
            int r4 = r0.l
            if (r4 == 0) goto L42
            if (r4 == r5) goto L3c
            if (r4 != r6) goto L38
            a.z1x.P(r11)
            goto L63
        L38:
            a.jf4.n(r3)
            goto L65
        L3c:
            a.mie0 r12 = r0.i
            a.z1x.P(r11)
            goto L53
        L42:
            a.z1x.P(r11)
            java.lang.Object r11 = r7.f21842a
            r0.i = r7
            r0.l = r5
            java.lang.Object r11 = r2.F(r11, r12, r0)
            if (r11 != r13) goto L52
            goto L61
        L52:
            r12 = r7
        L53:
            r12.f21842a = r11
            java.lang.Object r11 = r7.f21842a
            r0.i = r8
            r0.l = r6
            java.lang.Object r11 = r1.a(r11, r0)
            if (r11 != r13) goto L63
        L61:
            r8 = r13
            goto L65
        L63:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L65:
            return r8
        L66:
            boolean r0 = r13 instanceof a.omq
            if (r0 == 0) goto L77
            r0 = r13
            a.omq r0 = (a.omq) r0
            int r9 = r0.l
            r10 = r9 & r4
            if (r10 == 0) goto L77
            int r9 = r9 - r4
            r0.l = r9
            goto L7c
        L77:
            a.omq r0 = new a.omq
            r0.<init>(r11, r13)
        L7c:
            java.lang.Object r11 = r0.j
            a.wne r13 = a.wne.f39444a
            int r4 = r0.l
            if (r4 == 0) goto L96
            if (r4 == r5) goto L90
            if (r4 != r6) goto L8c
            a.z1x.P(r11)
            goto Lbd
        L8c:
            a.jf4.n(r3)
            goto Lbf
        L90:
            a.mie0 r12 = r0.i
            a.z1x.P(r11)
            goto Lad
        L96:
            a.z1x.P(r11)
            java.lang.Object r11 = r7.f21842a
            java.lang.Object r3 = a.lv00.i
            if (r11 != r3) goto La2
            r11 = r12
        La0:
            r12 = r7
            goto Lad
        La2:
            r0.i = r7
            r0.l = r5
            java.lang.Object r11 = r2.F(r11, r12, r0)
            if (r11 != r13) goto La0
            goto Lbb
        Lad:
            r12.f21842a = r11
            java.lang.Object r11 = r7.f21842a
            r0.i = r8
            r0.l = r6
            java.lang.Object r11 = r1.a(r11, r0)
            if (r11 != r13) goto Lbd
        Lbb:
            r8 = r13
            goto Lbf
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        Lbf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmq.a(java.lang.Object, a.yje):java.lang.Object");
    }
}
