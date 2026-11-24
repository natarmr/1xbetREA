package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class r5r0 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        r5r0 r5r0Var = new r5r0(3, (yje) obj3);
        r5r0Var.j = (kmq) obj;
        return r5r0Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r0.a(r9, r8) == r1) goto L20;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.kmq r0 = r8.j
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.i
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L24
            if (r2 == r6) goto L20
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L16
            a.z1x.P(r9)
            goto L56
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L1c:
            a.z1x.P(r9)
            goto L49
        L20:
            a.z1x.P(r9)
            goto L34
        L24:
            a.z1x.P(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.j = r0
            r8.i = r6
            java.lang.Object r9 = r0.a(r9, r8)
            if (r9 != r1) goto L34
            goto L55
        L34:
            a.uen r9 = a.wen.b
            r6 = 30000(0x7530, double:1.4822E-319)
            a.bfn r9 = a.bfn.MILLISECONDS
            long r6 = a.ibc.w0(r6, r9)
            r8.j = r0
            r8.i = r5
            java.lang.Object r9 = a.qcc.P(r6, r8)
            if (r9 != r1) goto L49
            goto L55
        L49:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.j = r3
            r8.i = r4
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r5r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
