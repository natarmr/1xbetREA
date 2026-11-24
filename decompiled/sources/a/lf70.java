package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lf70 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ qf70 j;
    public final /* synthetic */ double k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf70(qf70 qf70Var, double d, long j, yje yjeVar) {
        super(2, yjeVar);
        this.j = qf70Var;
        this.k = d;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new lf70(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lf70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r10.j.I(r10.k, r10.l, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r11.G(r10.k, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r10.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L14:
            a.z1x.P(r11)
            goto L4b
        L18:
            a.z1x.P(r11)
            a.qf70 r11 = r10.j
            a.gqx r1 = r11.s
            a.d3c r4 = r1.f11755a
            boolean r4 = r4.a()
            if (r4 == 0) goto L3f
            a.xyb r1 = r1.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L3f
            r10.i = r3
            a.qf70 r4 = r10.j
            double r5 = r10.k
            long r7 = r10.l
            r9 = r10
            java.lang.Object r10 = r4.I(r5, r7, r9)
            if (r10 != r0) goto L4b
            goto L4a
        L3f:
            r9 = r10
            r9.i = r2
            double r1 = r9.k
            java.lang.Object r10 = r11.G(r1, r9)
            if (r10 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lf70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
