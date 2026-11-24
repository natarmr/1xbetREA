package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ie9 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ je9 m;
    public final /* synthetic */ nlx n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie9(t33 t33Var, float f, boolean z, je9 je9Var, nlx nlxVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = f;
        this.l = z;
        this.m = je9Var;
        this.n = nlxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ie9(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ie9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r9.f(r8, r1) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (a.bsn.a(r9, r5, r2, r8.n, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.i
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r2
        L14:
            a.z1x.P(r9)
            goto L84
        L18:
            a.z1x.P(r9)
            a.t33 r9 = r8.j
            a.pz40 r1 = r9.e
            a.hgk0 r1 = (a.hgk0) r1
            java.lang.Object r1 = r1.getValue()
            a.ycl r1 = (a.ycl) r1
            float r1 = r1.f42389a
            float r5 = r8.k
            boolean r1 = a.ycl.b(r1, r5)
            if (r1 != 0) goto L84
            boolean r1 = r8.l
            if (r1 != 0) goto L43
            a.ycl r1 = new a.ycl
            r1.<init>(r5)
            r8.i = r4
            java.lang.Object r8 = r9.f(r8, r1)
            if (r8 != r0) goto L84
            goto L83
        L43:
            a.pz40 r1 = r9.e
            a.hgk0 r1 = (a.hgk0) r1
            java.lang.Object r1 = r1.getValue()
            a.ycl r1 = (a.ycl) r1
            float r1 = r1.f42389a
            r4 = 0
            boolean r6 = a.ycl.b(r1, r4)
            if (r6 == 0) goto L5e
            a.jub0 r2 = new a.jub0
            r6 = 0
            r2.<init>(r6)
            goto L79
        L5e:
            a.je9 r6 = r8.m
            float r6 = r6.f16362a
            boolean r6 = a.ycl.b(r1, r6)
            if (r6 == 0) goto L6e
            a.rsw r2 = new a.rsw
            r2.<init>()
            goto L79
        L6e:
            boolean r1 = a.ycl.b(r1, r4)
            if (r1 == 0) goto L79
            a.qpq r2 = new a.qpq
            r2.<init>()
        L79:
            r8.i = r3
            a.nlx r1 = r8.n
            java.lang.Object r8 = a.bsn.a(r9, r5, r2, r1, r8)
            if (r8 != r0) goto L84
        L83:
            return r0
        L84:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ie9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
