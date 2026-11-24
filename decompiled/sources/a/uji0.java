package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class uji0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f35782a;
    public final dgq b;
    public final xmi0 c;
    public final oco d;
    public final CoroutineContext e;

    public uji0(nfq nfqVar, dgq dgqVar, xmi0 xmi0Var, oco ocoVar, CoroutineContext coroutineContext) {
        nfqVar.getClass();
        dgqVar.getClass();
        xmi0Var.getClass();
        ocoVar.getClass();
        coroutineContext.getClass();
        this.f35782a = nfqVar;
        this.b = dgqVar;
        this.c = xmi0Var;
        this.d = ocoVar;
        this.e = coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r6.b(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.tji0
            if (r0 == 0) goto L13
            r0 = r7
            a.tji0 r0 = (a.tji0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.tji0 r0 = new a.tji0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            java.lang.String r5 = "FirebaseSessions"
            a.xmi0 r6 = r6.c
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            a.z1x.P(r7)
            goto L7e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L35:
            a.z1x.P(r7)
            goto L47
        L39:
            a.z1x.P(r7)
            a.nhq r7 = a.nhq.f23546a
            r0.k = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L47
            goto L7d
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L5d
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5d
            goto Lb3
        L5d:
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r7.next()
            a.a8f r2 = (a.a8f) r2
            a.qaj r2 = r2.f421a
            boolean r2 = r2.e()
            if (r2 == 0) goto L61
            r0.k = r3
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            a.w6j0 r7 = r6.f41126a
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L8b
        L86:
            boolean r4 = r7.booleanValue()
            goto L94
        L8b:
            a.w6j0 r7 = r6.b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L94
            goto L86
        L94:
            if (r4 != 0) goto L9e
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9e:
            double r0 = a.uji0.f
            double r6 = r6.a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lab
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lab:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uji0.a(a.zje):java.lang.Object");
    }
}
