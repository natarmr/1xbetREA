package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ct50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ gt50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct50(gt50 gt50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gt50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gt50 gt50Var = this.k;
        switch (b) {
            case 0:
                return new ct50(gt50Var, yjeVar, (byte) 0);
            default:
                return new ct50(gt50Var, yjeVar, (byte) 1);
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
        return ((ct50) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.P(r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r5.Q(false, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r5.P(r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r5.Q(true, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            java.lang.String r1 = "PROMOTIONS_WERE_LAUNCHED"
            java.lang.String r2 = "CMS_PROMOTIONS_WERE_LAUNCHED"
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a.gt50 r5 = r9.k
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L60;
                default: goto L10;
            }
        L10:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L23
            if (r8 == r6) goto L1f
            if (r8 != r7) goto L1b
            goto L1f
        L1b:
            a.jf4.n(r4)
            goto L5f
        L1f:
            a.z1x.P(r10)
            goto L42
        L23:
            a.z1x.P(r10)
            int r10 = a.gt50.G
            boolean r10 = r5.N()
            if (r10 == 0) goto L37
            r9.j = r6
            java.lang.Object r9 = r5.P(r9)
            if (r9 != r0) goto L42
            goto L40
        L37:
            r9.j = r7
            r10 = 0
            java.lang.Object r9 = r5.Q(r10, r9)
            if (r9 != r0) goto L42
        L40:
            r3 = r0
            goto L5f
        L42:
            int r9 = a.gt50.G
            boolean r9 = r5.N()
            if (r9 == 0) goto L54
            a.coi0 r9 = r5.D
            a.rwc r9 = r9.f4703a
            a.q7d0 r9 = r9.g
            r9.d(r2, r6)
            goto L5d
        L54:
            a.asi0 r9 = r5.C
            a.cu5 r9 = r9.f1393a
            a.q7d0 r9 = r9.f
            r9.d(r1, r6)
        L5d:
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L5f:
            return r3
        L60:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L73
            if (r8 == r6) goto L6f
            if (r8 != r7) goto L6b
            goto L6f
        L6b:
            a.jf4.n(r4)
            goto Lae
        L6f:
            a.z1x.P(r10)
            goto L91
        L73:
            a.z1x.P(r10)
            int r10 = a.gt50.G
            boolean r10 = r5.N()
            if (r10 == 0) goto L87
            r9.j = r6
            java.lang.Object r9 = r5.P(r9)
            if (r9 != r0) goto L91
            goto L8f
        L87:
            r9.j = r7
            java.lang.Object r9 = r5.Q(r6, r9)
            if (r9 != r0) goto L91
        L8f:
            r3 = r0
            goto Lae
        L91:
            int r9 = a.gt50.G
            boolean r9 = r5.N()
            if (r9 == 0) goto La3
            a.coi0 r9 = r5.D
            a.rwc r9 = r9.f4703a
            a.q7d0 r9 = r9.g
            r9.d(r2, r6)
            goto Lac
        La3:
            a.asi0 r9 = r5.C
            a.cu5 r9 = r9.f1393a
            a.q7d0 r9 = r9.f
            r9.d(r1, r6)
        Lac:
            kotlin.Unit r3 = kotlin.Unit.f46060a
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ct50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
