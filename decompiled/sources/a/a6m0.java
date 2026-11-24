package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a6m0 extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zsf k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;
    public final /* synthetic */ t33 q;
    public final /* synthetic */ t33 r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6m0(zsf zsfVar, t33 t33Var, t33 t33Var2, t33 t33Var3, float f, float f2, t33 t33Var4, t33 t33Var5, long j, yje yjeVar) {
        super(2, yjeVar);
        this.k = zsfVar;
        this.l = t33Var;
        this.m = t33Var2;
        this.n = t33Var3;
        this.o = f;
        this.p = f2;
        this.q = t33Var4;
        this.r = t33Var5;
        this.s = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        a6m0 a6m0Var = new a6m0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
        a6m0Var.j = obj;
        return a6m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a6m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (a.qcc.O(4000, r16) == r2) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.j
            a.vne r1 = (a.vne) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r0.i
            a.zsf r6 = r0.k
            r12 = 3
            r13 = 2
            r14 = 1
            r15 = 0
            if (r3 == 0) goto L24
            if (r3 == r14) goto L20
            if (r3 != r13) goto L1a
            a.z1x.P(r17)
            goto L53
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r15
        L20:
            a.z1x.P(r17)
            goto L46
        L24:
            a.z1x.P(r17)
            a.x5m0 r4 = new a.x5m0
            r11 = 0
            a.t33 r5 = r0.l
            a.t33 r7 = r0.m
            float r8 = r0.o
            a.t33 r9 = r0.n
            float r10 = r0.p
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            a.c4m0 r3 = a.qjj.W(r1, r15, r15, r4, r12)
            r0.j = r1
            r0.i = r14
            java.lang.Object r3 = r3.join(r0)
            if (r3 != r2) goto L46
            goto L52
        L46:
            r0.j = r1
            r0.i = r13
            r3 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r3 = a.qcc.O(r3, r0)
            if (r3 != r2) goto L53
        L52:
            return r2
        L53:
            a.oxn r4 = new a.oxn
            r9 = 0
            r10 = 5
            a.t33 r5 = r0.r
            r8 = r6
            long r6 = r0.s
            r4.<init>(r5, r6, r8, r9, r10)
            r6 = r8
            a.qjj.W(r1, r15, r15, r4, r12)
            a.pxn r2 = new a.pxn
            r3 = 7
            a.t33 r4 = r0.q
            r2.<init>(r4, r6, r15, r3)
            a.qjj.W(r1, r15, r15, r2, r12)
            a.pxn r2 = new a.pxn
            r3 = 8
            a.t33 r0 = r0.m
            r2.<init>(r0, r6, r15, r3)
            a.qjj.W(r1, r15, r15, r2, r12)
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
