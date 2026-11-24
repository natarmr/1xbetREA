package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class oq50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ sq50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq50(sq50 sq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sq50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sq50 sq50Var = this.k;
        switch (b) {
            case 0:
                return new oq50(sq50Var, yjeVar, (byte) 0);
            default:
                return new oq50(sq50Var, yjeVar, (byte) 1);
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
        return ((oq50) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.O(r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r5.P(r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r5.O(r7) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r5.P(r7) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.i
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 2
            a.sq50 r5 = r7.k
            switch(r0) {
                case 0: goto L48;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L1f
            if (r6 == r3) goto L1b
            if (r6 != r4) goto L17
            goto L1b
        L17:
            a.jf4.n(r2)
            goto L47
        L1b:
            a.z1x.P(r8)
            goto L45
        L1f:
            a.z1x.P(r8)
            int r8 = a.sq50.B
            a.n0o0 r8 = r5.z
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3b
            r7.j = r3
            java.lang.Object r7 = r5.O(r7)
            if (r7 != r0) goto L45
            goto L43
        L3b:
            r7.j = r4
            java.lang.Object r7 = r5.P(r7)
            if (r7 != r0) goto L45
        L43:
            r1 = r0
            goto L47
        L45:
            kotlin.Unit r1 = kotlin.Unit.f46060a
        L47:
            return r1
        L48:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L5b
            if (r6 == r3) goto L57
            if (r6 != r4) goto L53
            goto L57
        L53:
            a.jf4.n(r2)
            goto L83
        L57:
            a.z1x.P(r8)
            goto L81
        L5b:
            a.z1x.P(r8)
            int r8 = a.sq50.B
            a.n0o0 r8 = r5.z
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L77
            r7.j = r3
            java.lang.Object r7 = r5.O(r7)
            if (r7 != r0) goto L81
            goto L7f
        L77:
            r7.j = r4
            java.lang.Object r7 = r5.P(r7)
            if (r7 != r0) goto L81
        L7f:
            r1 = r0
            goto L83
        L81:
            kotlin.Unit r1 = kotlin.Unit.f46060a
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oq50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
