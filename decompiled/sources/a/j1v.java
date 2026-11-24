package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class j1v extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ kmq k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1v(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.l;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                j1v j1vVar = new j1v((wdu) obj4, yjeVar, (byte) 0);
                j1vVar.k = kmqVar;
                return j1vVar.invokeSuspend(Unit.f46060a);
            default:
                j1v j1vVar2 = new j1v((rrd) obj4, yjeVar, (byte) 1);
                j1vVar2.k = kmqVar;
                return j1vVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r0.a(r9, r8) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r0.a(r9, r8) == r6) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.i
            java.lang.Object r1 = r8.l
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L5d;
                default: goto Lc;
            }
        Lc:
            a.kmq r0 = r8.k
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L24
            if (r7 == r3) goto L20
            if (r7 != r4) goto L1c
            a.z1x.P(r9)
            goto L5a
        L1c:
            a.jf4.n(r2)
            goto L5c
        L20:
            a.z1x.P(r9)
            goto L42
        L24:
            a.z1x.P(r9)
            a.rrd r1 = (a.rrd) r1
            java.lang.Object r9 = r1.e
            a.ivn r9 = (a.ivn) r9
            a.y9s r1 = a.y9s.b
            java.lang.Object r9 = r9.f15453a
            a.w5z r9 = (a.w5z) r9
            a.gmq r9 = r9.r(r1)
            r8.k = r0
            r8.j = r3
            java.lang.Object r9 = a.ntb.M(r9, r8)
            if (r9 != r6) goto L42
            goto L58
        L42:
            java.util.Collection r9 = (java.util.Collection) r9
            if (r9 == 0) goto L4c
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L5a
        L4c:
            a.iun r9 = a.iun.f15405a
            r8.k = r5
            r8.j = r4
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r6) goto L5a
        L58:
            r5 = r6
            goto L5c
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L5c:
            return r5
        L5d:
            a.kmq r0 = r8.k
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L75
            if (r7 == r3) goto L71
            if (r7 != r4) goto L6d
            a.z1x.P(r9)
            goto Lab
        L6d:
            a.jf4.n(r2)
            goto Lad
        L71:
            a.z1x.P(r9)
            goto L93
        L75:
            a.z1x.P(r9)
            a.wdu r1 = (a.wdu) r1
            java.lang.Object r9 = r1.e
            a.ivn r9 = (a.ivn) r9
            a.y9s r1 = a.y9s.f42264a
            java.lang.Object r9 = r9.f15453a
            a.w5z r9 = (a.w5z) r9
            a.gmq r9 = r9.r(r1)
            r8.k = r0
            r8.j = r3
            java.lang.Object r9 = a.ntb.M(r9, r8)
            if (r9 != r6) goto L93
            goto La9
        L93:
            java.util.Collection r9 = (java.util.Collection) r9
            if (r9 == 0) goto L9d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lab
        L9d:
            a.iun r9 = a.iun.f15405a
            r8.k = r5
            r8.j = r4
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r6) goto Lab
        La9:
            r5 = r6
            goto Lad
        Lab:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j1v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
