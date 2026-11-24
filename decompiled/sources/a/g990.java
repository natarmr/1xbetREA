package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g990 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ p990 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g990(p990 p990Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p990Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p990 p990Var = this.k;
        switch (b) {
            case 0:
                return new g990(p990Var, yjeVar, (byte) 0);
            default:
                return new g990(p990Var, yjeVar, (byte) 1);
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
        return ((g990) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r2.z(r9, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r9 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r2.y(r9, r8) == r0) goto L42;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.UnsupportedEncodingException {
        /*
            r8 = this;
            byte r0 = r8.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a.p990 r2 = r8.k
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L5f;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r8.j
            r7 = 3
            if (r6 == 0) goto L29
            if (r6 == r3) goto L25
            if (r6 == r4) goto L21
            if (r6 != r7) goto L1d
            a.z1x.P(r9)
            goto L5c
        L1d:
            a.jf4.n(r1)
            goto L5e
        L21:
            a.z1x.P(r9)
            goto L50
        L25:
            a.z1x.P(r9)
            goto L39
        L29:
            a.z1x.P(r9)
            a.hse0 r9 = r2.c
            r8.j = r3
            r1 = 0
            r3 = 7
            java.lang.Object r9 = a.hse0.a(r9, r5, r1, r8, r3)
            if (r9 != r0) goto L39
            goto L5a
        L39:
            java.lang.String r9 = r2.B
            int r1 = r9.length()
            if (r1 != 0) goto L52
            a.w5z r9 = r2.e
            boolean r1 = r2.A
            long r5 = r2.F
            r8.j = r4
            java.lang.Object r9 = r9.T(r5, r8, r1)
            if (r9 != r0) goto L50
            goto L5a
        L50:
            java.lang.String r9 = (java.lang.String) r9
        L52:
            r8.j = r7
            java.lang.Object r8 = r2.z(r9, r8)
            if (r8 != r0) goto L5c
        L5a:
            r5 = r0
            goto L5e
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L5e:
            return r5
        L5f:
            a.wne r0 = a.wne.f39444a
            byte r6 = r8.j
            if (r6 == 0) goto L75
            if (r6 == r3) goto L71
            if (r6 != r4) goto L6d
            a.z1x.P(r9)
            goto L9b
        L6d:
            a.jf4.n(r1)
            goto L9d
        L71:
            a.z1x.P(r9)
            goto L8f
        L75:
            a.z1x.P(r9)
            java.lang.String r9 = r2.B
            int r1 = r9.length()
            if (r1 != 0) goto L91
            a.w5z r9 = r2.e
            boolean r1 = r2.A
            long r5 = r2.F
            r8.j = r3
            java.lang.Object r9 = r9.T(r5, r8, r1)
            if (r9 != r0) goto L8f
            goto L99
        L8f:
            java.lang.String r9 = (java.lang.String) r9
        L91:
            r8.j = r4
            java.lang.Object r8 = r2.y(r9, r8)
            if (r8 != r0) goto L9b
        L99:
            r5 = r0
            goto L9d
        L9b:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L9d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g990.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
