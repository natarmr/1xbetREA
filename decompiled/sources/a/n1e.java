package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class n1e extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ boolean k;

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        n1e n1eVar = new n1e(3, (yje) obj3);
        n1eVar.j = (kmq) obj;
        n1eVar.k = zBooleanValue;
        return n1eVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r0.a(r9, r8) == r2) goto L17;
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
            boolean r1 = r8.k
            a.wne r2 = a.wne.f39444a
            byte r3 = r8.i
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L1f
            if (r3 == r6) goto L1b
            if (r3 != r5) goto L15
            a.z1x.P(r9)
            goto L44
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L1b:
            a.z1x.P(r9)
            goto L33
        L1f:
            a.z1x.P(r9)
            if (r1 != 0) goto L33
            r8.j = r0
            r8.k = r1
            r8.i = r6
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = a.qcc.O(r6, r8)
            if (r9 != r2) goto L33
            goto L43
        L33:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r8.j = r4
            r8.k = r1
            r8.i = r5
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r2) goto L44
        L43:
            return r2
        L44:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n1e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
