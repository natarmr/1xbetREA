package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fm20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ nn20 k;
    public final /* synthetic */ m0k0 l;
    public final /* synthetic */ zxj0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm20(nn20 nn20Var, m0k0 m0k0Var, zxj0 zxj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nn20Var;
        this.l = m0k0Var;
        this.m = zxj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new fm20(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new fm20(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((fm20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r7.t0(r1, r3, r11, r5, r13) == r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r8.l0((a.aud) r1, r13) == r0) goto L36;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.i
            a.zxj0 r1 = r13.m
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 2
            a.m0k0 r6 = r13.l
            switch(r0) {
                case 0: goto L6a;
                default: goto Le;
            }
        Le:
            a.wne r10 = a.wne.f39444a
            byte r0 = r13.j
            a.nn20 r7 = r13.k
            r8 = 3
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L29
            if (r0 == r5) goto L25
            if (r0 != r8) goto L21
            a.z1x.P(r14)
            goto L67
        L21:
            a.jf4.n(r3)
            goto L69
        L25:
            a.z1x.P(r14)
            goto L4f
        L29:
            a.z1x.P(r14)
            r0 = r14
            goto L42
        L2e:
            a.z1x.P(r14)
            a.xzp r0 = r7.D0
            a.ms2 r2 = r7.p
            a.gwe r2 = a.phu0.Y(r2)
            r13.j = r4
            java.lang.Object r0 = r0.N(r6, r1, r2, r13)
            if (r0 != r10) goto L42
            goto L65
        L42:
            a.vtd r0 = (a.vtd) r0
            r13.j = r5
            int r1 = a.nn20.c1
            java.lang.Object r0 = r7.l0(r0, r13)
            if (r0 != r10) goto L4f
            goto L65
        L4f:
            long r1 = r6.Y
            long r3 = r6.f20959a
            long r11 = r6.B
            long r5 = r6.z
            r13.j = r8
            int r0 = a.nn20.c1
            r9 = r13
            r0 = r7
            r7 = r5
            r5 = r11
            java.lang.Object r0 = r0.t0(r1, r3, r5, r7, r9)
            if (r0 != r10) goto L67
        L65:
            r2 = r10
            goto L69
        L67:
            kotlin.Unit r2 = kotlin.Unit.f46060a
        L69:
            return r2
        L6a:
            a.wne r0 = a.wne.f39444a
            byte r7 = r13.j
            a.nn20 r8 = r13.k
            if (r7 == 0) goto L83
            if (r7 == r4) goto L7e
            if (r7 != r5) goto L7a
            a.z1x.P(r14)
            goto La5
        L7a:
            a.jf4.n(r3)
            goto La7
        L7e:
            a.z1x.P(r14)
            r1 = r14
            goto L97
        L83:
            a.z1x.P(r14)
            a.cr r2 = r8.C0
            a.ms2 r3 = r8.p
            a.gwe r3 = a.phu0.Y(r3)
            r13.j = r4
            java.lang.Object r1 = a.cr.c(r2, r6, r1, r3, r13)
            if (r1 != r0) goto L97
            goto La3
        L97:
            a.aud r1 = (a.aud) r1
            r13.j = r5
            int r2 = a.nn20.c1
            java.lang.Object r1 = r8.l0(r1, r13)
            if (r1 != r0) goto La5
        La3:
            r2 = r0
            goto La7
        La5:
            kotlin.Unit r2 = kotlin.Unit.f46060a
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fm20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
