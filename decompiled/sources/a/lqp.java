package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lqp extends bnn0 implements Function2 {
    public cqg i;
    public r2s0 j;
    public boolean k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ m9s n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ r2s0 p;
    public final /* synthetic */ ywq0 q;
    public final /* synthetic */ yws r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqp(m9s m9sVar, boolean z, r2s0 r2s0Var, ywq0 ywq0Var, yws ywsVar, yje yjeVar) {
        super(2, yjeVar);
        this.n = m9sVar;
        this.o = z;
        this.p = r2s0Var;
        this.q = ywq0Var;
        this.r = ywsVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        lqp lqpVar = new lqp(this.n, this.o, this.p, this.q, this.r, yjeVar);
        lqpVar.m = obj;
        return lqpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lqp) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r0.a(r6, r12) == r1) goto L17;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.m
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r13.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2d
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            a.cqg r13 = r13.i
            a.tdt0 r13 = (a.tdt0) r13
            a.z1x.P(r14)
            goto L6c
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r5
        L1f:
            boolean r2 = r13.k
            a.r2s0 r4 = r13.j
            a.cqg r6 = r13.i
            a.z1x.P(r14)
            r12 = r13
            r9 = r4
        L2a:
            r8 = r2
            r7 = r6
            goto L53
        L2d:
            a.z1x.P(r14)
            a.m9s r14 = r13.n
            a.cqg r6 = r14.I
            long r8 = r14.o
            long r10 = r14.A
            r13.m = r0
            r13.i = r6
            a.r2s0 r14 = r13.p
            r13.j = r14
            boolean r2 = r13.o
            r13.k = r2
            r13.l = r4
            a.ywq0 r7 = r13.q
            r12 = r13
            java.lang.Object r13 = r7.l(r8, r10, r12)
            if (r13 != r1) goto L50
            goto L6b
        L50:
            r9 = r14
            r14 = r13
            goto L2a
        L53:
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
            a.tdt0 r6 = new a.tdt0
            a.yws r11 = r12.r
            r6.<init>(r7, r8, r9, r10, r11)
            r12.m = r5
            r12.i = r5
            r12.j = r5
            r12.l = r3
            java.lang.Object r13 = r0.a(r6, r12)
            if (r13 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lqp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
