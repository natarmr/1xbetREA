package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ya60 extends bnn0 implements Function2 {
    public Object i;
    public int j;
    public boolean k;
    public boolean l;
    public long m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ tzi p;
    public final /* synthetic */ List q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya60(tzi tziVar, List list, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.p = tziVar;
        this.q = list;
        this.r = z;
        this.s = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ya60 ya60Var = new ya60(this.p, this.q, this.r, this.s, yjeVar);
        ya60Var.o = obj;
        return ya60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ya60) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b2 A[PHI: r0 r2 r3 r4 r10
  0x00b2: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v16 java.lang.Object) binds: [B:21:0x00af, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r2v7 boolean) = (r2v6 boolean), (r2v9 boolean) binds: [B:21:0x00af, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:21:0x00af, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r4v4 long) = (r4v3 long), (r4v7 long) binds: [B:21:0x00af, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r10v2 a.kmq) = (r10v1 a.kmq), (r10v4 a.kmq) binds: [B:21:0x00af, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (r10.a(r0, r14) == r11) goto L25;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.o
            r10 = r0
            a.kmq r10 = (a.kmq) r10
            a.wne r11 = a.wne.f39444a
            byte r0 = r14.n
            r12 = 4
            r1 = 3
            r2 = 2
            a.tzi r3 = r14.p
            r13 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 == r4) goto L3e
            if (r0 == r2) goto L37
            if (r0 == r1) goto L25
            if (r0 != r12) goto L1f
            a.z1x.P(r15)
            goto Lc5
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r13
        L25:
            long r0 = r14.m
            boolean r2 = r14.l
            int r3 = r14.j
            java.lang.Object r4 = r14.i
            r10 = r4
            a.kmq r10 = (a.kmq) r10
            a.z1x.P(r15)
            r4 = r0
            r0 = r15
            goto Lb2
        L37:
            int r0 = r14.j
            a.z1x.P(r15)
            r2 = r15
            goto L86
        L3e:
            boolean r4 = r14.k
            int r0 = r14.j
            java.lang.Object r5 = r14.i
            a.rtu r5 = (a.rtu) r5
            a.z1x.P(r15)
            r6 = r15
            goto L73
        L4b:
            a.z1x.P(r15)
            java.lang.Object r0 = r3.d
            a.uzc r0 = (a.uzc) r0
            a.jvn r0 = r0.b()
            int r0 = r0.getId()
            java.lang.Object r5 = r3.b
            a.rtu r5 = (a.rtu) r5
            java.lang.Object r6 = r3.c
            a.ieu r6 = (a.ieu) r6
            r14.o = r10
            r14.i = r5
            r14.j = r0
            r14.k = r4
            r14.n = r4
            java.lang.Object r6 = r6.i(r14)
            if (r6 != r11) goto L73
            goto Lc4
        L73:
            a.elt r6 = (a.elt) r6
            int r6 = r6.e
            r14.o = r10
            r14.i = r13
            r14.j = r0
            r14.n = r2
            java.lang.Object r2 = r5.a(r4, r6, r14)
            if (r2 != r11) goto L86
            goto Lc4
        L86:
            a.c3c0 r2 = (a.c3c0) r2
            boolean r4 = r2.b
            long r5 = r2.c
            java.lang.Object r2 = r3.f
            a.w8u r2 = (a.w8u) r2
            r14.o = r13
            r14.i = r10
            r14.j = r0
            r14.l = r4
            r14.m = r5
            r14.n = r1
            a.wdu r1 = r2.f38742a
            r2 = r4
            r4 = r5
            a.j8p r6 = a.j8p.b
            r3 = r0
            r0 = r1
            java.util.List r1 = r14.q
            boolean r7 = r14.r
            java.lang.String r8 = r14.s
            r9 = r14
            java.io.Serializable r0 = r0.j(r1, r2, r3, r4, r6, r7, r8, r9)
            if (r0 != r11) goto Lb2
            goto Lc4
        Lb2:
            r14.o = r13
            r14.i = r13
            r14.j = r3
            r14.l = r2
            r14.m = r4
            r14.n = r12
            java.lang.Object r0 = r10.a(r0, r14)
            if (r0 != r11) goto Lc5
        Lc4:
            return r11
        Lc5:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ya60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
