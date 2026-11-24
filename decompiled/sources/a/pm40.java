package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pm40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ d39 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm40(d39 d39Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d39Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new pm40(this.k, yjeVar, (byte) 0);
            case 1:
                return new pm40(this.k, yjeVar, (byte) 1);
            default:
                return new pm40(this.k, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((pm40) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r1.a(null, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r1.a(null, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r1.a(null, r9) == r0) goto L46;
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
            a.d39 r1 = r9.k
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L3d;
                default: goto Le;
            }
        Le:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L24
            if (r8 == r5) goto L20
            if (r8 != r6) goto L1c
            a.z1x.P(r10)
            goto L3a
        L1c:
            a.jf4.n(r4)
            goto L3c
        L20:
            a.z1x.P(r10)
            goto L30
        L24:
            a.z1x.P(r10)
            r9.j = r5
            java.lang.Object r10 = a.qcc.O(r2, r9)
            if (r10 != r0) goto L30
            goto L38
        L30:
            r9.j = r6
            java.lang.Object r9 = r1.a(r7, r9)
            if (r9 != r0) goto L3a
        L38:
            r7 = r0
            goto L3c
        L3a:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L3c:
            return r7
        L3d:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L53
            if (r8 == r5) goto L4f
            if (r8 != r6) goto L4b
            a.z1x.P(r10)
            goto L69
        L4b:
            a.jf4.n(r4)
            goto L6b
        L4f:
            a.z1x.P(r10)
            goto L5f
        L53:
            a.z1x.P(r10)
            r9.j = r5
            java.lang.Object r10 = a.qcc.O(r2, r9)
            if (r10 != r0) goto L5f
            goto L67
        L5f:
            r9.j = r6
            java.lang.Object r9 = r1.a(r7, r9)
            if (r9 != r0) goto L69
        L67:
            r7 = r0
            goto L6b
        L69:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L6b:
            return r7
        L6c:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L82
            if (r8 == r5) goto L7e
            if (r8 != r6) goto L7a
            a.z1x.P(r10)
            goto L98
        L7a:
            a.jf4.n(r4)
            goto L9a
        L7e:
            a.z1x.P(r10)
            goto L8e
        L82:
            a.z1x.P(r10)
            r9.j = r5
            java.lang.Object r10 = a.qcc.O(r2, r9)
            if (r10 != r0) goto L8e
            goto L96
        L8e:
            r9.j = r6
            java.lang.Object r9 = r1.a(r7, r9)
            if (r9 != r0) goto L98
        L96:
            r7 = r0
            goto L9a
        L98:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pm40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
