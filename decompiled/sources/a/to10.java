package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class to10 extends bnn0 implements Function2 {
    public float i;
    public float j;
    public byte k;
    public final /* synthetic */ vo10 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ pz40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to10(vo10 vo10Var, t33 t33Var, Function0 function0, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = vo10Var;
        this.m = t33Var;
        this.n = function0;
        this.o = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new to10(this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((to10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (a.t33.a(r12.m, r6, r7, null, r9, r10, 4) == r0) goto L20;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r12.k
            a.pz40 r2 = r12.o
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L13
            a.z1x.P(r13)
            r10 = r12
            goto L7b
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L1a:
            float r1 = r12.j
            float r3 = r12.i
            a.z1x.P(r13)
            goto L54
        L22:
            a.z1x.P(r13)
            a.vo10 r13 = r12.l
            a.esr r1 = r13.b
            if (r1 != 0) goto L2e
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        L2e:
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 % r6
            float r1 = a.y0x0.E(r13, r1, r4, r5)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r5)
            r12.i = r5
            r12.j = r1
            r12.k = r3
            a.t33 r3 = r12.m
            java.lang.Object r13 = r3.f(r12, r13)
            if (r13 != r0) goto L53
            goto L7a
        L53:
            r3 = r5
        L54:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r13 = 0
            a.zsf r5 = a.ihn.f14788a
            r7 = 1500(0x5dc, float:2.102E-42)
            a.uts0 r7 = a.ro4.m0(r7, r13, r5, r4)
            a.y9v r9 = new a.y9v
            r13 = 16
            r9.<init>(r2, r13)
            r12.i = r3
            r12.j = r1
            r12.k = r4
            a.t33 r5 = r12.m
            r8 = 0
            r11 = 4
            r10 = r12
            java.lang.Object r12 = a.t33.a(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.jvm.functions.Function0 r12 = r10.n
            r12.invoke()
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.to10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
