package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class pp70 extends bnn0 implements ydr {
    public byte i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ sp70 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp70(sp70 sp70Var, yje yjeVar) {
        super(4, yjeVar);
        this.m = sp70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r0.f(a.tle.f34139a, r10) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r0.f(r11, r10) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r5;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.sp70 r0 = r10.m
            a.gmt r1 = r0.d
            boolean r2 = r10.j
            boolean r3 = r10.k
            boolean r4 = r10.l
            a.wne r5 = a.wne.f39444a
            byte r6 = r10.i
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L22
            if (r6 == r8) goto L1e
            if (r6 != r7) goto L17
            goto L1e
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L1e:
            a.z1x.P(r11)
            goto L7c
        L22:
            a.z1x.P(r11)
            if (r2 == 0) goto L7c
            if (r4 == 0) goto L7c
            a.ql5 r11 = r1.a()
            if (r11 == 0) goto L7c
            a.txs0 r6 = r11.i
            a.g9c r9 = r0.f
            a.fq r0 = r0.e
            boolean r11 = r9.a(r11)
            if (r11 == 0) goto L52
            boolean r11 = r6.f()
            if (r11 != 0) goto L52
            r10.j = r2
            r10.k = r3
            r10.l = r4
            r10.i = r8
            a.tle r11 = a.tle.f34139a
            java.lang.Object r10 = r0.f(r11, r10)
            if (r10 != r5) goto L7c
            goto L7b
        L52:
            if (r3 == 0) goto L7c
            boolean r11 = r6.d()
            if (r11 != 0) goto L7c
            a.ule r11 = new a.ule
            a.ql5 r1 = r1.a()
            if (r1 == 0) goto L69
            a.txs0 r1 = r1.i
            boolean r1 = r1.b()
            goto L6a
        L69:
            r1 = 0
        L6a:
            r11.<init>(r1)
            r10.j = r2
            r10.k = r3
            r10.l = r4
            r10.i = r7
            java.lang.Object r10 = r0.f(r11, r10)
            if (r10 != r5) goto L7c
        L7b:
            return r5
        L7c:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pp70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        pp70 pp70Var = new pp70(this.m, (yje) obj4);
        pp70Var.j = zBooleanValue;
        pp70Var.k = zBooleanValue2;
        pp70Var.l = zBooleanValue3;
        return pp70Var.invokeSuspend(Unit.f46060a);
    }
}
