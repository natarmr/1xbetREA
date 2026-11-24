package a;

import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jo00 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j700 l;
    public final /* synthetic */ pzu m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ jvn p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ long r;
    public final /* synthetic */ Set s;
    public kmq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo00(yje yjeVar, j700 j700Var, pzu pzuVar, int i, Set set, jvn jvnVar, boolean z, long j, Set set2) {
        super(3, yjeVar);
        this.l = j700Var;
        this.m = pzuVar;
        this.n = i;
        this.o = set;
        this.p = jvnVar;
        this.q = z;
        this.r = j;
        this.s = set2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        jo00 jo00Var = new jo00((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        jo00Var.j = (kmq) obj;
        jo00Var.k = obj2;
        return jo00Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r0 == r12) goto L28;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r11 = r16
            a.wne r12 = a.wne.f39444a
            byte r0 = r11.i
            r13 = 2
            r1 = 1
            r14 = 0
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1a
            if (r0 != r13) goto L14
            a.z1x.P(r17)
            goto L7c
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r14
        L1a:
            a.kmq r0 = r11.t
            a.z1x.P(r17)
            r15 = r0
            r0 = r17
            goto L60
        L23:
            a.z1x.P(r17)
            a.kmq r15 = r11.j
            java.lang.Object r0 = r11.k
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            a.j700 r2 = r11.l
            if (r0 != 0) goto L3b
            a.j700 r0 = a.j700.c
            if (r2 != r0) goto L39
            goto L3b
        L39:
            r0 = 0
            goto L3c
        L3b:
            r0 = r1
        L3c:
            a.pzu r3 = r11.m
            java.lang.Object r3 = r3.d
            a.wdu r3 = (a.wdu) r3
            r11.j = r14
            r11.k = r14
            r11.t = r15
            r11.i = r1
            r1 = r0
            r0 = r3
            int r3 = r11.n
            java.util.Set r4 = r11.o
            a.jvn r5 = r11.p
            boolean r6 = r11.q
            long r7 = r11.r
            java.util.Set r9 = r11.s
            r10 = 0
            java.io.Serializable r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r0 != r12) goto L60
            goto L7b
        L60:
            r11.j = r14
            r11.k = r14
            r11.t = r14
            r11.i = r13
            a.f7k.J(r15)
            java.lang.Object r0 = r15.a(r0, r11)
            if (r0 != r12) goto L72
            goto L74
        L72:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L74:
            if (r0 != r12) goto L77
            goto L79
        L77:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L79:
            if (r0 != r12) goto L7c
        L7b:
            return r12
        L7c:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jo00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
