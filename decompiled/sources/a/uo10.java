package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class uo10 extends bnn0 implements Function2 {
    public float i;
    public float j;
    public byte k;
    public final /* synthetic */ vo10 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ pz40 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo10(vo10 vo10Var, t33 t33Var, Function0 function0, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.l = vo10Var;
        this.m = t33Var;
        this.n = function0;
        this.o = pz40Var;
        this.p = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new uo10(this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uo10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (a.t33.a(r13.m, r7, r8, null, r10, r11, 4) == r0) goto L20;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r13.k
            a.pz40 r2 = r13.p
            a.pz40 r3 = r13.o
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 != r5) goto L16
            a.z1x.P(r14)
            r11 = r13
            goto L88
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L1d:
            float r1 = r13.j
            float r4 = r13.i
            a.z1x.P(r14)
            goto L58
        L25:
            a.z1x.P(r14)
            a.vo10 r14 = r13.l
            a.esr r1 = r14.c
            if (r1 != 0) goto L31
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        L31:
            java.lang.Object r6 = r3.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r7 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r7
            r7 = 7
            float r1 = a.y0x0.E(r14, r1, r7, r6)
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r6)
            r13.i = r6
            r13.j = r1
            r13.k = r4
            a.t33 r4 = r13.m
            java.lang.Object r14 = r4.f(r13, r14)
            if (r14 != r0) goto L57
            goto L87
        L57:
            r4 = r6
        L58:
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r2.setValue(r14)
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r1)
            r14 = 0
            a.zsf r6 = a.ihn.f14788a
            r8 = 1500(0x5dc, float:2.102E-42)
            a.uts0 r8 = a.ro4.m0(r8, r14, r6, r5)
            a.y9v r10 = new a.y9v
            r14 = 17
            r10.<init>(r3, r14)
            r13.i = r4
            r13.j = r1
            r13.k = r5
            a.t33 r6 = r13.m
            r9 = 0
            r12 = 4
            r11 = r13
            java.lang.Object r13 = a.t33.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L88
        L87:
            return r0
        L88:
            r13 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r2.setValue(r13)
            kotlin.jvm.functions.Function0 r13 = r11.n
            r13.invoke()
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uo10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
