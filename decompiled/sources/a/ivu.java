package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ivu implements gvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f15462a;

    public ivu(sjl0 sjl0Var) {
        sjl0Var.getClass();
        this.f15462a = sjl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(int r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.hvu
            if (r0 == 0) goto L13
            r0 = r7
            a.hvu r0 = (a.hvu) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.hvu r0 = new a.hvu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L5b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r7)
            goto L4f
        L35:
            a.z1x.P(r7)
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r6 = org.xplatform.cyber.section.api.domain.entity.d.d(r6)
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Real r7 = org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Real.INSTANCE
            boolean r6 = r6.equals(r7)
            a.sjl0 r5 = r5.f15462a
            if (r6 == 0) goto L52
            r0.k = r4
            java.io.Serializable r7 = r5.b(r0)
            if (r7 != r1) goto L4f
            goto L5a
        L4f:
            java.util.List r7 = (java.util.List) r7
            goto L5d
        L52:
            r0.k = r3
            java.io.Serializable r7 = r5.g(r0)
            if (r7 != r1) goto L5b
        L5a:
            return r1
        L5b:
            java.util.List r7 = (java.util.List) r7
        L5d:
            r5 = 10
            int r5 = a.r3d.q(r7, r5)
            int r5 = a.wp20.a(r5)
            r6 = 16
            if (r5 >= r6) goto L6c
            r5 = r6
        L6c:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L75:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r5.next()
            r0 = r7
            a.ypl0 r0 = (a.ypl0) r0
            long r0 = r0.f43037a
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r6.put(r2, r7)
            goto L75
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ivu.a(int, a.zje):java.io.Serializable");
    }
}
