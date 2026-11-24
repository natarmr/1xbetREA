package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class od60 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sd60 l;
    public final /* synthetic */ zos m;
    public final /* synthetic */ boolean n;
    public kmq o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od60(yje yjeVar, sd60 sd60Var, zos zosVar, boolean z) {
        super(3, yjeVar);
        this.l = sd60Var;
        this.m = zosVar;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        od60 od60Var = new od60((yje) obj3, this.l, this.m, this.n);
        od60Var.j = (kmq) obj;
        od60Var.k = obj2;
        return od60Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (a.slb.Q(r1, r12, r10) == r0) goto L19;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r11.i
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L17
            if (r1 != r2) goto L11
            a.z1x.P(r12)
            goto L67
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r4
        L17:
            a.kmq r1 = r11.o
            a.z1x.P(r12)
            r10 = r11
            goto L47
        L1e:
            a.z1x.P(r12)
            a.kmq r1 = r11.j
            java.lang.Object r12 = r11.k
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 != 0) goto L2d
            a.dun r12 = a.dun.f6704a
            r10 = r11
            goto L58
        L2d:
            long r6 = r12.longValue()
            r11.j = r4
            r11.k = r4
            r11.o = r1
            r11.i = r3
            a.sd60 r5 = r11.l
            a.zos r8 = r11.m
            boolean r9 = r11.n
            r10 = r11
            java.lang.Object r12 = r5.r(r6, r8, r9, r10)
            if (r12 != r0) goto L47
            goto L66
        L47:
            a.gmq r12 = (a.gmq) r12
            a.gsu r11 = new a.gsu
            a.zos r3 = r10.m
            r11.<init>(r3, r4)
            a.a1g r3 = new a.a1g
            r5 = 20
            r3.<init>(r12, r11, r5)
            r12 = r3
        L58:
            r10.j = r4
            r10.k = r4
            r10.o = r4
            r10.i = r2
            java.lang.Object r11 = a.slb.Q(r1, r12, r10)
            if (r11 != r0) goto L67
        L66:
            return r0
        L67:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.od60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
