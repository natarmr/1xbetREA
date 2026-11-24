package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vtv0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ buv0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtv0(buv0 buv0Var, float f, int i, yje yjeVar) {
        super(2, yjeVar);
        this.j = buv0Var;
        this.k = f;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vtv0(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vtv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r0.a(0.0f, r6, r5) == r1) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            a.buv0 r0 = r5.j
            a.glt0 r0 = r0.b
            a.wne r1 = a.wne.f39444a
            byte r2 = r5.i
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L1f
            if (r2 == r3) goto L1b
            if (r2 != r4) goto L14
            a.z1x.P(r6)
            goto L40
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L1b:
            a.z1x.P(r6)
            goto L2d
        L1f:
            a.z1x.P(r6)
            r5.i = r3
            float r6 = r5.k
            java.lang.Object r6 = r0.g(r6, r5)
            if (r6 != r1) goto L2d
            goto L3f
        L2d:
            r6 = 0
            a.zsf r2 = a.buv0.m
            int r3 = r5.l
            a.uts0 r6 = a.ro4.m0(r3, r6, r2, r4)
            r5.i = r4
            r2 = 0
            java.lang.Object r5 = r0.a(r2, r6, r5)
            if (r5 != r1) goto L40
        L3f:
            return r1
        L40:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vtv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
