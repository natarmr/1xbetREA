package a;

import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ho00 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pzu l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Set n;
    public final /* synthetic */ jvn o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Set r;
    public final /* synthetic */ long s;
    public kmq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho00(yje yjeVar, pzu pzuVar, int i, Set set, jvn jvnVar, boolean z, long j, Set set2, long j2) {
        super(3, yjeVar);
        this.l = pzuVar;
        this.m = i;
        this.n = set;
        this.o = jvnVar;
        this.p = z;
        this.q = j;
        this.r = set2;
        this.s = j2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ho00 ho00Var = new ho00((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        ho00Var.j = (kmq) obj;
        ho00Var.k = obj2;
        return ho00Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r0 == r13) goto L22;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r17
            a.wne r13 = a.wne.f39444a
            byte r0 = r12.i
            r14 = 2
            r1 = 1
            r15 = 0
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1a
            if (r0 != r14) goto L14
            a.z1x.P(r18)
            goto L92
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r15
        L1a:
            a.kmq r0 = r12.t
            a.z1x.P(r18)
            r1 = r0
            r0 = r18
            goto L74
        L23:
            a.z1x.P(r18)
            a.kmq r0 = r12.j
            java.lang.Object r2 = r12.k
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.f46059a
            a.ygq0 r3 = (a.ygq0) r3
            java.lang.Object r2 = r2.b
            a.xgq0 r2 = (a.xgq0) r2
            a.pzu r4 = r12.l
            java.lang.Object r4 = r4.d
            a.wdu r4 = (a.wdu) r4
            long r5 = r2.f40852a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            long r5 = r2.b
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            kotlin.Pair r11 = new kotlin.Pair
            r11.<init>(r7, r2)
            r12.j = r15
            r12.k = r15
            r12.t = r0
            r12.i = r1
            int r2 = r12.m
            r1 = r3
            java.util.Set r3 = r12.n
            r5 = r0
            r0 = r4
            a.jvn r4 = r12.o
            r6 = r5
            boolean r5 = r12.p
            r8 = r6
            long r6 = r12.q
            r9 = r8
            java.util.Set r8 = r12.r
            r16 = r9
            long r9 = r12.s
            java.io.Serializable r0 = r0.i(r1, r2, r3, r4, r5, r6, r8, r9, r11, r12)
            if (r0 != r13) goto L72
            goto L91
        L72:
            r1 = r16
        L74:
            java.util.List r0 = (java.util.List) r0
            r12.j = r15
            r12.k = r15
            r12.t = r15
            r12.i = r14
            a.f7k.J(r1)
            java.lang.Object r0 = r1.a(r0, r12)
            if (r0 != r13) goto L88
            goto L8a
        L88:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L8a:
            if (r0 != r13) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L8f:
            if (r0 != r13) goto L92
        L91:
            return r13
        L92:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ho00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
