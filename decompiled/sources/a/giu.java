package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class giu extends bnn0 implements Function2 {
    public boolean i;
    public long j;
    public int k;
    public jvn l;
    public byte m;
    public final /* synthetic */ xzp n;
    public final /* synthetic */ long o;
    public final /* synthetic */ aj00 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giu(xzp xzpVar, long j, aj00 aj00Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = xzpVar;
        this.o = j;
        this.p = aj00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new giu(this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((giu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r0 == r10) goto L29;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            a.wne r10 = a.wne.f39444a
            byte r0 = r13.m
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            a.xzp r5 = r13.n
            if (r0 == 0) goto L39
            if (r0 == r4) goto L30
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L18
            a.z1x.P(r14)
            r0 = r14
            goto Lc1
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r1
        L1e:
            int r0 = r13.k
            long r3 = r13.j
            boolean r6 = r13.i
            a.jvn r7 = r13.l
            a.z1x.P(r14)
            r11 = r3
            r4 = r6
            r8 = r7
            r3 = r14
            r7 = r0
            goto La4
        L30:
            long r6 = r13.j
            boolean r0 = r13.i
            a.z1x.P(r14)
            r4 = r14
            goto L7e
        L39:
            a.z1x.P(r14)
            a.e0g0 r0 = a.j0g0.b     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r5.e     // Catch: java.lang.Throwable -> L4f
            a.gst0 r0 = (a.gst0) r0     // Catch: java.lang.Throwable -> L4f
            a.rrt0 r0 = r0.f11847a     // Catch: java.lang.Throwable -> L4f
            a.krt0 r0 = r0.a()     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            a.e0g0 r6 = a.j0g0.b
            a.g0g0 r6 = new a.g0g0
            r6.<init>(r0)
            r0 = r6
        L58:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof a.g0g0
            if (r7 == 0) goto L5f
            r0 = r6
        L5f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r6 = r5.e
            a.gst0 r6 = (a.gst0) r6
            long r6 = r6.e()
            java.lang.Object r8 = r5.d
            a.pmi r8 = (a.pmi) r8
            r13.i = r0
            r13.j = r6
            r13.m = r4
            java.io.Serializable r4 = r8.x(r13)
            if (r4 != r10) goto L7e
            goto Lc0
        L7e:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r8 = r5.b
            a.uzc r8 = (a.uzc) r8
            a.jvn r8 = r8.b()
            java.lang.Object r11 = r5.c
            a.ehf0 r11 = (a.ehf0) r11
            r13.l = r8
            r13.i = r0
            r13.j = r6
            r13.k = r4
            r13.m = r3
            java.lang.Object r3 = r11.x(r13)
            if (r3 != r10) goto La1
            goto Lc0
        La1:
            r11 = r6
            r7 = r4
            r4 = r0
        La4:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r5.f41764a
            a.xfu r0 = (a.xfu) r0
            r13.l = r1
            r13.i = r4
            r13.j = r11
            r13.k = r7
            r13.m = r2
            long r1 = r13.o
            a.aj00 r3 = r13.p
            r9 = r13
            r5 = r11
            java.lang.Object r0 = r0.f(r1, r3, r4, r5, r7, r8, r9)
            if (r0 != r10) goto Lc1
        Lc0:
            return r10
        Lc1:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.giu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
