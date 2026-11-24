package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class edi0 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ldi0 l;
    public kmq m;
    public String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edi0(yje yjeVar, ldi0 ldi0Var) {
        super(3, yjeVar);
        this.l = ldi0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        edi0 edi0Var = new edi0((yje) obj3, this.l);
        edi0Var.j = (kmq) obj;
        edi0Var.k = obj2;
        return edi0Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (a.slb.Q(r4, r1, r9) == r0) goto L16;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r9.i
            a.ldi0 r2 = r9.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            a.z1x.P(r10)
            goto L70
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L19:
            java.lang.String r1 = r9.n
            a.kmq r4 = r9.m
            a.z1x.P(r10)
            goto L49
        L21:
            a.z1x.P(r10)
            a.kmq r10 = r9.j
            java.lang.Object r1 = r9.k
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            a.rou r6 = r2.q
            r9.j = r5
            r9.k = r5
            r9.m = r10
            r9.n = r1
            r9.i = r4
            r4 = 0
            java.lang.Object r4 = r6.a(r4, r9)
            if (r4 != r0) goto L46
            goto L6f
        L46:
            r8 = r4
            r4 = r10
            r10 = r8
        L49:
            a.m2c0 r10 = (a.m2c0) r10
            java.lang.String r10 = r10.Z
            a.zl60 r6 = new a.zl60
            r6.<init>(r1, r10)
            a.cyh r10 = r2.h
            a.p5a r10 = r10.a(r6)
            a.m430 r1 = new a.m430
            r2 = 28
            r1.<init>(r10, r6, r2)
            r9.j = r5
            r9.k = r5
            r9.m = r5
            r9.n = r5
            r9.i = r3
            java.lang.Object r9 = a.slb.Q(r4, r1, r9)
            if (r9 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.edi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
