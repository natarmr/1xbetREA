package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xtv0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ buv0 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtv0(boolean z, buv0 buv0Var, float f, int i, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = buv0Var;
        this.l = f;
        this.m = i;
        this.n = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new xtv0(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xtv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (a.d5c.J(r10, r0) == r8) goto L22;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.buv0 r2 = r10.k
            a.pz40 r7 = r2.i
            a.t33 r0 = r2.j
            a.wne r8 = a.wne.f39444a
            byte r1 = r10.i
            r9 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r9) goto L19
            a.z1x.P(r11)     // Catch: java.lang.Throwable -> L16
            goto L61
        L16:
            r0 = move-exception
            r10 = r0
            goto L6d
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L20:
            a.z1x.P(r11)
            goto L4a
        L24:
            a.z1x.P(r11)
            boolean r11 = r10.j
            if (r11 != 0) goto L4a
            java.lang.Object r11 = r0.d()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 < 0) goto L4a
            java.lang.Float r11 = new java.lang.Float
            r1 = 0
            r11.<init>(r1)
            r10.i = r3
            java.lang.Object r11 = r0.f(r10, r11)
            if (r11 != r8) goto L4a
            goto L60
        L4a:
            a.wtv0 r0 = new a.wtv0     // Catch: java.lang.Throwable -> L16
            boolean r1 = r10.j     // Catch: java.lang.Throwable -> L16
            float r3 = r10.l     // Catch: java.lang.Throwable -> L16
            int r4 = r10.m     // Catch: java.lang.Throwable -> L16
            float r5 = r10.n     // Catch: java.lang.Throwable -> L16
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            r10.i = r9     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = a.d5c.J(r10, r0)     // Catch: java.lang.Throwable -> L16
            if (r10 != r8) goto L61
        L60:
            return r8
        L61:
            a.zsf r10 = a.buv0.m
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            a.hgk0 r7 = (a.hgk0) r7
            r7.setValue(r10)
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        L6d:
            a.zsf r11 = a.buv0.m
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            a.hgk0 r7 = (a.hgk0) r7
            r7.setValue(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xtv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
