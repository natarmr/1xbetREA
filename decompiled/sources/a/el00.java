package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class el00 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ j0g0 j;
    public /* synthetic */ j0g0 k;
    public final /* synthetic */ ywq0 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el00(ywq0 ywq0Var, long j, yje yjeVar) {
        super(3, yjeVar);
        this.l = ywq0Var;
        this.m = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        el00 el00Var = new el00(this.l, this.m, (yje) obj3);
        el00Var.j = (j0g0) obj;
        el00Var.k = (j0g0) obj2;
        return el00Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r11 == r2) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            a.j0g0 r0 = r11.j
            a.j0g0 r1 = r11.k
            a.wne r2 = a.wne.f39444a
            byte r3 = r11.i
            r4 = 0
            long r5 = r11.m
            a.ywq0 r7 = r11.l
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L25
            if (r3 == r9) goto L21
            if (r3 != r8) goto L1a
            a.z1x.P(r12)
            goto L9e
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L21:
            a.z1x.P(r12)
            goto L63
        L25:
            a.z1x.P(r12)
            java.lang.Object r12 = r7.e
            a.fvt r12 = (a.fvt) r12
            r11.j = r0
            r11.k = r1
            r11.i = r9
            a.udg r12 = r12.f10230a
            a.tcg r12 = r12.b
            java.util.LinkedHashMap r12 = r12.f
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r10 = r12.get(r3)
            if (r10 != 0) goto L4b
            a.i99 r10 = a.i99.b
            a.qoj0 r10 = a.roj0.b(r9, r4, r10, r8)
            r12.put(r3, r10)
        L4b:
            a.mz40 r10 = (a.mz40) r10
            java.lang.Object r12 = r10.a(r0, r11)
            if (r12 != r2) goto L54
            goto L56
        L54:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L56:
            if (r12 != r2) goto L59
            goto L5b
        L59:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L5b:
            if (r12 != r2) goto L5e
            goto L60
        L5e:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L60:
            if (r12 != r2) goto L63
            goto L9d
        L63:
            java.lang.Object r12 = r7.f
            a.zwt r12 = (a.zwt) r12
            r11.j = r0
            r11.k = r1
            r11.i = r8
            a.udg r12 = r12.f45124a
            a.tcg r12 = r12.b
            java.util.LinkedHashMap r12 = r12.g
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r12.get(r3)
            if (r5 != 0) goto L86
            a.i99 r5 = a.i99.b
            a.qoj0 r5 = a.roj0.b(r9, r4, r5, r8)
            r12.put(r3, r5)
        L86:
            a.mz40 r5 = (a.mz40) r5
            java.lang.Object r11 = r5.a(r1, r11)
            if (r11 != r2) goto L8f
            goto L91
        L8f:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L91:
            if (r11 != r2) goto L94
            goto L96
        L94:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L96:
            if (r11 != r2) goto L99
            goto L9b
        L99:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L9b:
            if (r11 != r2) goto L9e
        L9d:
            return r2
        L9e:
            a.hcg r11 = new a.hcg
            a.iun r12 = a.iun.f15405a
            r11.<init>(r12, r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.el00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
