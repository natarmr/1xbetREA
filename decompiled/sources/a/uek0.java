package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uek0 implements qkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3d f35534a;
    public final qkq b;
    public final j73 c;

    public uek0(f3d f3dVar, iuj iujVar, j73 j73Var) {
        iujVar.getClass();
        j73Var.getClass();
        this.f35534a = f3dVar;
        this.b = iujVar;
        this.c = j73Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (a.hhm0.q(r3, r4, r11.c, false, r7, r8, 4) == r2) goto L34;
     */
    @Override // a.qkq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.qah0 r12, float r13, a.zje r14) {
        /*
            r11 = this;
            a.f3d r0 = r11.f35534a
            a.agk0 r1 = r0.f8856a
            boolean r2 = r14 instanceof a.tek0
            if (r2 == 0) goto L18
            r2 = r14
            a.tek0 r2 = (a.tek0) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.m = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            a.tek0 r2 = new a.tek0
            r2.<init>(r11, r14)
            goto L16
        L1e:
            java.lang.Object r14 = r8.k
            a.wne r2 = a.wne.f39444a
            int r3 = r8.m
            r4 = 2
            r5 = 1
            r6 = 0
            r10 = 0
            if (r3 == 0) goto L41
            if (r3 == r5) goto L39
            if (r3 != r4) goto L33
            a.z1x.P(r14)
            goto Lb0
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r6
        L39:
            float r13 = r8.j
            a.qah0 r12 = r8.i
            a.z1x.P(r14)
            goto L53
        L41:
            a.z1x.P(r14)
            r8.i = r12
            r8.j = r13
            r8.m = r5
            a.qkq r14 = r11.b
            java.lang.Object r14 = r14.a(r12, r13, r8)
            if (r14 != r2) goto L53
            goto Laf
        L53:
            java.lang.Number r14 = (java.lang.Number) r14
            r14.floatValue()
            a.agk0 r14 = r0.d
            float r14 = r14.l()
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L68
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            return r11
        L68:
            float r0 = r1.l()
            float r0 = r0 / r14
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto Lb0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb0
            r3 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L83
            float r0 = r1.l()
            float r0 = r0 - r14
            goto L87
        L83:
            float r0 = r1.l()
        L87:
            a.jie0 r14 = new a.jie0
            r14.<init>()
            r1 = 30
            a.l73 r3 = a.x4d0.d(r10, r10, r1)
            r1 = r4
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            a.huh0 r7 = new a.huh0
            r0 = 22
            r7.<init>(r12, r14, r0)
            r8.i = r6
            r8.j = r13
            r8.m = r1
            a.j73 r5 = r11.c
            r6 = 0
            r9 = 4
            java.lang.Object r11 = a.hhm0.q(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r2) goto Lb0
        Laf:
            return r2
        Lb0:
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uek0.a(a.qah0, float, a.zje):java.lang.Object");
    }
}
