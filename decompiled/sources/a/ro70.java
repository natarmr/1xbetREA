package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ro70 extends bnn0 implements Function2 {
    public to70 i;
    public double j;
    public boolean k;
    public byte l;
    public final /* synthetic */ to70 m;
    public final /* synthetic */ double n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro70(to70 to70Var, double d, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.m = to70Var;
        this.n = d;
        this.o = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ro70(this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ro70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: CancellationException -> 0x0070, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0070, blocks: (B:7:0x0012, B:11:0x001c, B:26:0x0062, B:14:0x0026, B:23:0x004b, B:17:0x002d, B:19:0x0035), top: B:35:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r6.y(r12, r11) == r0) goto L28;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r11.l
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            a.to70 r6 = r11.m
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            a.z1x.P(r12)     // Catch: java.util.concurrent.CancellationException -> L70
            goto L82
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r2
        L1c:
            a.z1x.P(r12)     // Catch: java.util.concurrent.CancellationException -> L70
            goto L62
        L20:
            boolean r1 = r11.k
            double r7 = r11.j
            a.to70 r9 = r11.i
            a.z1x.P(r12)     // Catch: java.util.concurrent.CancellationException -> L70
            goto L4b
        L2a:
            a.z1x.P(r12)
            a.oqt r12 = r6.i     // Catch: java.util.concurrent.CancellationException -> L70
            boolean r12 = r12.a()     // Catch: java.util.concurrent.CancellationException -> L70
            if (r12 == 0) goto L62
            double r7 = r11.n     // Catch: java.util.concurrent.CancellationException -> L70
            boolean r1 = r11.o     // Catch: java.util.concurrent.CancellationException -> L70
            a.t0u r12 = r6.F     // Catch: java.util.concurrent.CancellationException -> L70
            r11.i = r6     // Catch: java.util.concurrent.CancellationException -> L70
            r11.j = r7     // Catch: java.util.concurrent.CancellationException -> L70
            r11.k = r1     // Catch: java.util.concurrent.CancellationException -> L70
            r11.l = r5     // Catch: java.util.concurrent.CancellationException -> L70
            java.lang.Object r12 = r12.a(r11)     // Catch: java.util.concurrent.CancellationException -> L70
            if (r12 != r0) goto L4a
            goto L6f
        L4a:
            r9 = r6
        L4b:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.util.concurrent.CancellationException -> L70
            a.ao70 r10 = new a.ao70     // Catch: java.util.concurrent.CancellationException -> L70
            r10.<init>(r7, r12, r1)     // Catch: java.util.concurrent.CancellationException -> L70
            r9.F(r10)     // Catch: java.util.concurrent.CancellationException -> L70
            r11.i = r2     // Catch: java.util.concurrent.CancellationException -> L70
            r11.l = r4     // Catch: java.util.concurrent.CancellationException -> L70
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r12 = a.qcc.O(r1, r11)     // Catch: java.util.concurrent.CancellationException -> L70
            if (r12 != r0) goto L62
            goto L6f
        L62:
            a.cn70 r12 = new a.cn70     // Catch: java.util.concurrent.CancellationException -> L70
            r12.<init>(r6, r5)     // Catch: java.util.concurrent.CancellationException -> L70
            r11.l = r3     // Catch: java.util.concurrent.CancellationException -> L70
            java.lang.Object r11 = r6.y(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L70
            if (r11 != r0) goto L82
        L6f:
            return r0
        L70:
            a.hni0 r11 = r6.C
            r12 = 0
            r11.a(r12)
            a.ly5 r11 = r6.T
            if (r11 == 0) goto L7d
            r6.w(r11)
        L7d:
            a.un70 r11 = a.un70.f35948a
            r6.F(r11)
        L82:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ro70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
