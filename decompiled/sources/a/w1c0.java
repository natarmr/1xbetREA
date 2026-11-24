package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w1c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ b2c0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1c0(b2c0 b2c0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b2c0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b2c0 b2c0Var = this.k;
        switch (b) {
            case 0:
                return new w1c0(b2c0Var, yjeVar, (byte) 0);
            default:
                return new w1c0(b2c0Var, yjeVar, (byte) 1);
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
        return ((w1c0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r5.R(r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r5.M(r7) == r0) goto L49;
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
            a.b2c0 r5 = r7.k
            switch(r0) {
                case 0: goto L6d;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L22
            if (r6 == r3) goto L1e
            if (r6 != r4) goto L1a
            a.z1x.P(r8)
            goto L6a
        L1a:
            a.jf4.n(r2)
            goto L6c
        L1e:
            a.z1x.P(r8)
            goto L30
        L22:
            a.z1x.P(r8)
            a.rou r8 = r5.p
            r7.j = r3
            java.lang.Object r8 = r8.a(r3, r7)
            if (r8 != r0) goto L30
            goto L68
        L30:
            a.m2c0 r8 = (a.m2c0) r8
            java.lang.String r1 = r8.Z
            a.jqt0 r2 = r8.k
            int r1 = r1.length()
            r6 = 0
            if (r1 != 0) goto L47
            a.jqt0 r1 = a.jqt0.b
            if (r2 == r1) goto L45
            a.jqt0 r1 = a.jqt0.c
            if (r2 != r1) goto L47
        L45:
            r1 = r3
            goto L48
        L47:
            r1 = r6
        L48:
            java.lang.String r8 = r8.Z
            int r8 = r8.length()
            if (r8 <= 0) goto L59
            a.jqt0 r8 = a.jqt0.b
            if (r2 == r8) goto L5a
            a.jqt0 r8 = a.jqt0.c
            if (r2 != r8) goto L59
            goto L5a
        L59:
            r3 = r6
        L5a:
            if (r1 != 0) goto L6a
            if (r3 != 0) goto L6a
            r7.j = r4
            java.util.List r8 = a.b2c0.C
            java.lang.Object r7 = r5.R(r7)
            if (r7 != r0) goto L6a
        L68:
            r1 = r0
            goto L6c
        L6a:
            kotlin.Unit r1 = kotlin.Unit.f46060a
        L6c:
            return r1
        L6d:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L83
            if (r6 == r3) goto L7f
            if (r6 != r4) goto L7b
            a.z1x.P(r8)
            goto L9d
        L7b:
            a.jf4.n(r2)
            goto L9f
        L7f:
            a.z1x.P(r8)
            goto L91
        L83:
            a.z1x.P(r8)
            r7.j = r3
            java.util.List r8 = a.b2c0.C
            java.lang.Object r8 = r5.S(r7)
            if (r8 != r0) goto L91
            goto L9b
        L91:
            r7.j = r4
            java.util.List r8 = a.b2c0.C
            java.lang.Object r7 = r5.M(r7)
            if (r7 != r0) goto L9d
        L9b:
            r1 = r0
            goto L9f
        L9d:
            kotlin.Unit r1 = kotlin.Unit.f46060a
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w1c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
