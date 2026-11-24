package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class n6m0 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ int k;
    public final /* synthetic */ o6m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6m0(o6m0 o6m0Var, yje yjeVar) {
        super(3, yjeVar);
        this.l = o6m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        n6m0 n6m0Var = new n6m0(this.l, (yje) obj3);
        n6m0Var.j = (kmq) obj;
        n6m0Var.k = iIntValue;
        return n6m0Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r2.a(r15, r14) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r2.a(r15, r14) == r4) goto L34;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            a.o6m0 r0 = r14.l
            long r0 = r0.f24744a
            a.kmq r2 = r14.j
            int r3 = r14.k
            a.wne r4 = a.wne.f39444a
            byte r5 = r14.i
            r6 = 0
            r8 = 0
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            if (r5 == 0) goto L37
            if (r5 == r13) goto L33
            if (r5 == r12) goto L2f
            if (r5 == r11) goto L2b
            if (r5 == r10) goto L27
            if (r5 != r9) goto L21
            goto L33
        L21:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r8
        L27:
            a.z1x.P(r15)
            goto L78
        L2b:
            a.z1x.P(r15)
            goto L6b
        L2f:
            a.z1x.P(r15)
            goto L58
        L33:
            a.z1x.P(r15)
            goto L87
        L37:
            a.z1x.P(r15)
            if (r3 <= 0) goto L4b
            a.jpj0 r15 = a.jpj0.f16905a
            r14.j = r8
            r14.k = r3
            r14.i = r13
            java.lang.Object r14 = r2.a(r15, r14)
            if (r14 != r4) goto L87
            goto L86
        L4b:
            r14.j = r2
            r14.k = r3
            r14.i = r12
            java.lang.Object r15 = a.qcc.O(r6, r14)
            if (r15 != r4) goto L58
            goto L86
        L58:
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 <= 0) goto L78
            a.jpj0 r15 = a.jpj0.b
            r14.j = r2
            r14.k = r3
            r14.i = r11
            java.lang.Object r15 = r2.a(r15, r14)
            if (r15 != r4) goto L6b
            goto L86
        L6b:
            r14.j = r2
            r14.k = r3
            r14.i = r10
            java.lang.Object r15 = a.qcc.O(r0, r14)
            if (r15 != r4) goto L78
            goto L86
        L78:
            a.jpj0 r15 = a.jpj0.c
            r14.j = r8
            r14.k = r3
            r14.i = r9
            java.lang.Object r14 = r2.a(r15, r14)
            if (r14 != r4) goto L87
        L86:
            return r4
        L87:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n6m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
