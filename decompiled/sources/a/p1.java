package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ gy40 k;
    public final /* synthetic */ jub0 l;
    public final /* synthetic */ s1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(gy40 gy40Var, jub0 jub0Var, s1 s1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gy40Var;
        this.l = jub0Var;
        this.m = s1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new p1(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new p1(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((p1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.a(r7, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r2.a(r7, r9) == r0) goto L31;
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
            a.s1 r1 = r9.m
            a.gy40 r2 = r9.k
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 2
            a.jub0 r7 = r9.l
            switch(r0) {
                case 0: goto L43;
                default: goto L10;
            }
        L10:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L26
            if (r8 == r5) goto L22
            if (r8 != r6) goto L1e
            a.z1x.P(r10)
            goto L3e
        L1e:
            a.jf4.n(r4)
            goto L42
        L22:
            a.z1x.P(r10)
            goto L34
        L26:
            a.z1x.P(r10)
            long r3 = a.ntc.f24091a
            r9.j = r5
            java.lang.Object r10 = a.qcc.O(r3, r9)
            if (r10 != r0) goto L34
            goto L3c
        L34:
            r9.j = r6
            java.lang.Object r9 = r2.a(r7, r9)
            if (r9 != r0) goto L3e
        L3c:
            r3 = r0
            goto L42
        L3e:
            r1.Y = r7
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L42:
            return r3
        L43:
            a.wne r0 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L59
            if (r8 == r5) goto L55
            if (r8 != r6) goto L51
            a.z1x.P(r10)
            goto L71
        L51:
            a.jf4.n(r4)
            goto L75
        L55:
            a.z1x.P(r10)
            goto L67
        L59:
            a.z1x.P(r10)
            long r3 = a.ntc.f24091a
            r9.j = r5
            java.lang.Object r10 = a.qcc.O(r3, r9)
            if (r10 != r0) goto L67
            goto L6f
        L67:
            r9.j = r6
            java.lang.Object r9 = r2.a(r7, r9)
            if (r9 != r0) goto L71
        L6f:
            r3 = r0
            goto L75
        L71:
            r1.h1 = r7
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
