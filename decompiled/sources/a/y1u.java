package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul9 f41877a;

    public y1u(ul9 ul9Var, byte b) {
        switch (b) {
            case 1:
                this.f41877a = ul9Var;
                break;
            default:
                ul9Var.getClass();
                this.f41877a = ul9Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r13.h(r6) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.j4g r14, a.zje r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof a.qoi0
            if (r0 == 0) goto L13
            r0 = r15
            a.qoi0 r0 = (a.qoi0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.qoi0 r0 = new a.qoi0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            a.ul9 r13 = r13.f41877a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.z1x.P(r15)
            goto L96
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r3
        L33:
            a.j4g r14 = r0.i
            a.z1x.P(r15)
            goto L65
        L39:
            a.z1x.P(r15)
            r0.i = r14
            r0.l = r5
            byte r15 = r13.f35861a
            switch(r15) {
                case 0: goto L54;
                default: goto L45;
            }
        L45:
            java.lang.Object r15 = r13.d
            a.s3t0 r15 = (a.s3t0) r15
            r14.getClass()
            a.ol60 r15 = r15.f
            r15.f(r14)
            kotlin.Unit r15 = kotlin.Unit.f46060a
            goto L62
        L54:
            java.lang.Object r15 = r13.d
            a.hl9 r15 = (a.hl9) r15
            r14.getClass()
            a.ol60 r15 = r15.f
            r15.f(r14)
            kotlin.Unit r15 = kotlin.Unit.f46060a
        L62:
            if (r15 != r1) goto L65
            goto L95
        L65:
            long r14 = r14.f15883a
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2)
            r2.setTimeInMillis(r14)
            a.c5g r6 = new a.c5g
            int r7 = r2.get(r5)
            int r8 = r2.get(r4)
            r14 = 5
            int r9 = r2.get(r14)
            int r10 = r2.get(r14)
            a.yag r11 = a.yag.d
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.i = r3
            r0.l = r4
            kotlin.Unit r13 = r13.h(r6)
            if (r13 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y1u.a(a.j4g, a.zje):java.lang.Object");
    }
}
