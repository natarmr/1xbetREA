package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class y600 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Integer m;
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;
    public final /* synthetic */ wdu r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y600(boolean z, String str, int i, Integer num, int i2, String str2, boolean z2, long j, wdu wduVar, List list, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = str;
        this.l = i;
        this.m = num;
        this.n = i2;
        this.o = str2;
        this.p = z2;
        this.q = j;
        this.r = wduVar;
        this.s = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new y600(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y600) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0 == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r0 == r3) goto L21;
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
            a.wdu r1 = r0.r
            java.lang.Object r2 = r1.b
            a.bwl r2 = (a.bwl) r2
            a.wne r3 = a.wne.f39444a
            byte r4 = r0.i
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L27
            if (r4 == r6) goto L21
            if (r4 != r5) goto L1b
            a.z1x.P(r17)
            r0 = r17
            goto L73
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r7
        L21:
            a.z1x.P(r17)
            r0 = r17
            goto L56
        L27:
            a.z1x.P(r17)
            boolean r4 = r0.j
            if (r4 == 0) goto L30
            java.lang.String r7 = r0.k
        L30:
            r15 = r7
            boolean r12 = r0.p
            long r13 = r0.q
            int r8 = r0.l
            java.lang.Integer r9 = r0.m
            int r10 = r0.n
            java.lang.String r11 = r0.o
            java.util.TreeMap r7 = a.jeb.O(r8, r9, r10, r11, r12, r13, r15)
            if (r4 == 0) goto L59
            r0.i = r6
            java.lang.Object r2 = r2.f3330a
            a.wgn r2 = (a.wgn) r2
            java.lang.Object r2 = r2.invoke()
            a.t8p r2 = (a.t8p) r2
            java.lang.Object r0 = r2.c(r7, r0)
            if (r0 != r3) goto L56
            goto L72
        L56:
            a.dx5 r0 = (a.dx5) r0
            goto L75
        L59:
            a.r8p r4 = new a.r8p
            java.util.List r6 = r0.s
            r4.<init>(r6)
            r0.i = r5
            java.lang.Object r2 = r2.f3330a
            a.wgn r2 = (a.wgn) r2
            java.lang.Object r2 = r2.invoke()
            a.t8p r2 = (a.t8p) r2
            java.lang.Object r0 = r2.d(r7, r4, r0)
            if (r0 != r3) goto L73
        L72:
            return r3
        L73:
            a.dx5 r0 = (a.dx5) r0
        L75:
            java.lang.Object r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.r3d.q(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La0
            java.lang.Object r3 = r0.next()
            a.su10 r3 = (a.su10) r3
            a.bek r4 = a.sip.f32274a
            a.nas r3 = a.g7x.Z(r3)
            r2.add(r3)
            goto L8a
        La0:
            java.lang.Object r0 = r1.j
            a.f8p r0 = (a.f8p) r0
            a.j8p r1 = a.j8p.b
            r0.a(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y600.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
