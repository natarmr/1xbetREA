package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j3v extends bnn0 implements Function2 {
    public Object i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nc0 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Date q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j3v(nc0 nc0Var, long j, int i, int i2, Date date, yje yjeVar) {
        super(2, yjeVar);
        this.m = nc0Var;
        this.n = j;
        this.o = i;
        this.p = i2;
        this.q = date;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        j3v j3vVar = new j3v(this.m, this.n, this.o, this.p, this.q, yjeVar);
        j3vVar.l = obj;
        return j3vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j3v) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[PHI: r1 r7
  0x00a0: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v6 java.lang.Object), (r1v6 java.lang.Object), (r1v8 java.lang.Object) binds: [B:22:0x006d, B:24:0x0074, B:26:0x007c, B:31:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r7v3 a.kmq) = (r7v2 a.kmq), (r7v2 a.kmq), (r7v2 a.kmq), (r7v4 a.kmq) binds: [B:22:0x006d, B:24:0x0074, B:26:0x007c, B:31:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r7.a(r0, r13) == r8) goto L34;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.l
            r7 = r0
            a.kmq r7 = (a.kmq) r7
            a.wne r8 = a.wne.f39444a
            byte r0 = r13.k
            a.nc0 r9 = r13.m
            r10 = 3
            r11 = 2
            r1 = 1
            r12 = 0
            if (r0 == 0) goto L39
            if (r0 == r1) goto L2b
            if (r0 == r11) goto L22
            if (r0 != r10) goto L1c
            a.z1x.P(r14)
            goto Lb4
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r12
        L22:
            a.kmq r0 = r13.j
            java.lang.Object r1 = r13.i
            a.z1x.P(r14)
            goto L9f
        L2b:
            java.lang.Object r0 = r13.i
            r7 = r0
            a.kmq r7 = (a.kmq) r7
            a.z1x.P(r14)
            r0 = r14
            a.j0g0 r0 = (a.j0g0) r0
            java.lang.Object r0 = r0.f15681a
            goto L55
        L39:
            a.z1x.P(r14)
            java.lang.Object r0 = r9.l
            a.svu r0 = (a.svu) r0
            r13.l = r12
            r13.i = r7
            r13.k = r1
            int r1 = r13.o
            byte r2 = r13.p
            long r3 = r13.n
            r6 = 0
            r5 = r13
            java.lang.Object r0 = r0.m(r1, r2, r3, r5, r6)
            if (r0 != r8) goto L55
            goto Lb3
        L55:
            a.e0g0 r1 = a.j0g0.b
            boolean r1 = r0 instanceof a.g0g0
            if (r1 != 0) goto L69
            a.vdg r0 = (a.vdg) r0     // Catch: java.lang.Throwable -> L60
            java.util.ArrayList r0 = r0.f37230a     // Catch: java.lang.Throwable -> L60
            goto L69
        L60:
            r0 = move-exception
            a.e0g0 r1 = a.j0g0.b
            a.g0g0 r1 = new a.g0g0
            r1.<init>(r0)
            r0 = r1
        L69:
            r1 = r0
            boolean r0 = r1 instanceof a.g0g0
            if (r0 != 0) goto La0
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.Date r2 = r13.q
            if (r2 != 0) goto La0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            java.util.Date r0 = (java.util.Date) r0
            if (r0 == 0) goto La0
            java.lang.Object r2 = r9.m
            a.pmi0 r2 = (a.pmi0) r2
            r13.l = r12
            r13.i = r1
            r13.j = r7
            r13.k = r11
            java.lang.Object r2 = r2.f27236a
            a.epi0 r2 = (a.epi0) r2
            java.lang.Object r2 = r2.b
            a.eat0 r2 = (a.eat0) r2
            a.p7m0 r2 = r2.f7486a
            r2.o(r12, r0)
            kotlin.Unit r0 = kotlin.Unit.f46060a
            a.wne r2 = a.wne.f39444a
            if (r0 != r8) goto L9e
            goto Lb3
        L9e:
            r0 = r7
        L9f:
            r7 = r0
        La0:
            a.j0g0 r0 = new a.j0g0
            r0.<init>(r1)
            r13.l = r12
            r13.i = r12
            r13.j = r12
            r13.k = r10
            java.lang.Object r0 = r7.a(r0, r13)
            if (r0 != r8) goto Lb4
        Lb3:
            return r8
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j3v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
