package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class gin extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ kin k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gin(kin kinVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kinVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kin kinVar = this.k;
        switch (b) {
            case 0:
                return new gin(kinVar, yjeVar, (byte) 0);
            default:
                return new gin(kinVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gin) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r2.B((a.cjn) r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r2.B(r9, r8) == r0) goto L35;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a.kin r2 = r8.k
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L6b;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r8.j
            if (r6 == 0) goto L22
            if (r6 == r3) goto L1e
            if (r6 != r4) goto L1a
            a.z1x.P(r9)
            goto L62
        L1a:
            a.jf4.n(r1)
            goto L64
        L1e:
            a.z1x.P(r9)
            goto L56
        L22:
            a.z1x.P(r9)
            a.p7m0 r9 = r2.w
            r9.getClass()
            a.zin r1 = a.zin.f44448a
            r9.o(r5, r1)
            a.rpt r9 = r2.p
            a.cjn r9 = r9.c()
            a.fhj r1 = r2.o
            int r9 = r9.b
            r8.j = r3
            java.lang.Object r3 = r1.f9543a
            a.f4u r3 = (a.f4u) r3
            java.lang.Object r1 = r1.b
            a.gmt r1 = (a.gmt) r1
            a.ql5 r1 = r1.a()
            if (r1 == 0) goto L65
            long r5 = r1.f28916a
            java.lang.Object r1 = r3.b
            a.ali r1 = (a.ali) r1
            java.lang.Object r9 = r1.l(r9, r5, r8)
            if (r9 != r0) goto L56
            goto L60
        L56:
            a.cjn r9 = (a.cjn) r9
            r8.j = r4
            java.lang.Object r8 = r2.B(r9, r8)
            if (r8 != r0) goto L62
        L60:
            r5 = r0
            goto L64
        L62:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L64:
            return r5
        L65:
            a.ss3 r8 = new a.ss3
            r8.<init>()
            throw r8
        L6b:
            a.wne r0 = a.wne.f39444a
            byte r6 = r8.j
            if (r6 == 0) goto L81
            if (r6 == r3) goto L7d
            if (r6 != r4) goto L79
            a.z1x.P(r9)
            goto La1
        L79:
            a.jf4.n(r1)
            goto Lad
        L7d:
            a.z1x.P(r9)
            goto L91
        L81:
            a.z1x.P(r9)
            a.ymx r9 = a.ymx.INTERVAL_100
            r8.j = r3
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = a.qcc.O(r6, r8)
            if (r9 != r0) goto L91
            goto L9f
        L91:
            a.rpt r9 = r2.p
            a.cjn r9 = r9.c()
            r8.j = r4
            java.lang.Object r8 = r2.B(r9, r8)
            if (r8 != r0) goto La1
        L9f:
            r5 = r0
            goto Lad
        La1:
            a.p7m0 r8 = r2.y
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.getClass()
            r8.o(r5, r9)
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
