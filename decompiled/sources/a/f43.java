package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f43 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ u910 j;
    public final /* synthetic */ fa10 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(u910 u910Var, fa10 fa10Var, float f, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        ea10 ea10Var = ea10.f7448a;
        this.j = u910Var;
        this.k = fa10Var;
        this.l = f;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ea10 ea10Var = ea10.f7448a;
        return new f43(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (a.fww.s(r4, r11.k, Integer.MAX_VALUE, r11.l, r8, r11, 514) == r0) goto L35;
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
            a.pz40 r2 = r11.m
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L13
            a.z1x.P(r12)
            goto L96
        L13:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L1a:
            a.z1x.P(r12)
            goto L76
        L1e:
            a.z1x.P(r12)
            java.lang.Object r12 = r2.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L76
            r11.i = r4
            a.u910 r6 = r11.j
            a.fa10 r12 = r6.c()
            r6.b()
            float r1 = r6.g()
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L44
            if (r12 != 0) goto L44
            goto L49
        L44:
            if (r12 != 0) goto L47
            goto L4b
        L47:
            if (r1 >= 0) goto L4b
        L49:
            r5 = 1065353216(0x3f800000, float:1.0)
        L4b:
            r8 = r5
            a.fa10 r7 = r6.c()
            float r12 = r6.f()
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 != 0) goto L5a
            r12 = r4
            goto L5b
        L5a:
            r12 = 0
        L5b:
            r9 = r12 ^ 1
            a.g050 r12 = r6.n
            a.t910 r5 = new a.t910
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = a.g050.a(r12, r5, r11)
            if (r12 != r0) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L6e:
            if (r12 != r0) goto L71
            goto L73
        L71:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L73:
            if (r12 != r0) goto L76
            goto L95
        L76:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r2.setValue(r12)
            a.u910 r4 = r11.j
            float r8 = r4.f()
            a.ea10 r12 = a.ea10.f7448a
            r11.i = r3
            a.fa10 r5 = r11.k
            r6 = 2147483647(0x7fffffff, float:NaN)
            float r7 = r11.l
            r10 = 514(0x202, float:7.2E-43)
            r9 = r11
            java.lang.Object r11 = a.fww.s(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
