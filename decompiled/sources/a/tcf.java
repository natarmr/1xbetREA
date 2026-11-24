package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class tcf extends bnn0 implements Function2 {
    public float i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hea l;
    public final /* synthetic */ xcf m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ t33 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcf(hea heaVar, xcf xcfVar, t33 t33Var, t33 t33Var2, t33 t33Var3, yje yjeVar) {
        super(2, yjeVar);
        this.l = heaVar;
        this.m = xcfVar;
        this.n = t33Var;
        this.o = t33Var2;
        this.p = t33Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        tcf tcfVar = new tcf(this.l, this.m, this.n, this.o, this.p, yjeVar);
        tcfVar.k = obj;
        return tcfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tcf) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r13 == r1) goto L23;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.k
            a.vne r0 = (a.vne) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r13.j
            a.t33 r3 = r13.n
            a.t33 r4 = r13.o
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L25
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L19
            a.z1x.P(r14)
            goto L85
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r7
        L1f:
            float r0 = r13.i
            a.z1x.P(r14)
            goto L6c
        L25:
            a.z1x.P(r14)
            a.hea r14 = r13.l
            a.hea r2 = a.hea.f12913a
            if (r14 != r2) goto L31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L33
        L31:
            r14 = 1065353216(0x3f800000, float:1.0)
        L33:
            a.ly7 r2 = new a.ly7
            r2.<init>(r4, r14, r7, r6)
            r8 = 3
            a.c4m0 r2 = a.qjj.W(r0, r7, r7, r2, r8)
            a.my7 r9 = new a.my7
            r10 = 16
            r9.<init>(r3, r7, r10)
            a.c4m0 r9 = a.qjj.W(r0, r7, r7, r9, r8)
            a.my7 r10 = new a.my7
            a.t33 r11 = r13.p
            r12 = 15
            r10.<init>(r11, r7, r12)
            a.c4m0 r0 = a.qjj.W(r0, r7, r7, r10, r8)
            a.bby[] r8 = new a.bby[r8]
            r10 = 0
            r8[r10] = r9
            r8[r6] = r0
            r8[r5] = r2
            r13.k = r7
            r13.i = r14
            r13.j = r6
            java.lang.Object r0 = a.qjj.U(r8, r13)
            if (r0 != r1) goto L6b
            goto L84
        L6b:
            r0 = r14
        L6c:
            r13.k = r7
            r13.i = r0
            r13.j = r5
            a.fr9 r14 = new a.fr9
            r0 = 10
            r14.<init>(r4, r3, r7, r0)
            java.lang.Object r13 = a.d5c.J(r13, r14)
            if (r13 != r1) goto L80
            goto L82
        L80:
            kotlin.Unit r13 = kotlin.Unit.f46060a
        L82:
            if (r13 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tcf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
