package a;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class klu extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nlu l;
    public final /* synthetic */ gmq m;
    public final /* synthetic */ gmq n;
    public final /* synthetic */ Map o;
    public final /* synthetic */ boolean p;
    public kmq q;
    public gmq r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klu(yje yjeVar, nlu nluVar, gmq gmqVar, gmq gmqVar2, Map map, boolean z) {
        super(3, yjeVar);
        this.l = nluVar;
        this.m = gmqVar;
        this.n = gmqVar2;
        this.o = map;
        this.p = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        klu kluVar = new klu((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        kluVar.j = (kmq) obj;
        kluVar.k = obj2;
        return kluVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (a.slb.Q(r2, r10, r9) == r0) goto L22;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r9.i
            a.nlu r2 = r9.l
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L17
            a.z1x.P(r10)
            goto L94
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r6
        L1d:
            a.gmq r1 = r9.r
            a.gmq r1 = (a.gmq) r1
            a.kmq r2 = r9.q
            a.z1x.P(r10)
            goto L70
        L27:
            int r1 = r9.s
            a.kmq r5 = r9.q
            a.z1x.P(r10)
            goto L52
        L2f:
            a.z1x.P(r10)
            a.kmq r10 = r9.j
            java.lang.Object r1 = r9.k
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            a.uau r7 = r2.f23745a
            r9.j = r6
            r9.k = r6
            r9.q = r10
            r9.s = r1
            r9.i = r5
            java.lang.Object r5 = r7.a(r1, r9)
            if (r5 != r0) goto L4f
            goto L93
        L4f:
            r8 = r5
            r5 = r10
            r10 = r8
        L52:
            a.gmq r10 = (a.gmq) r10
            a.nau r2 = r2.b
            r9.j = r6
            r9.k = r6
            r9.q = r5
            r7 = r10
            a.gmq r7 = (a.gmq) r7
            r9.r = r7
            r9.s = r1
            r9.i = r4
            java.lang.Object r1 = r2.a(r1, r9)
            if (r1 != r0) goto L6c
            goto L93
        L6c:
            r2 = r1
            r1 = r10
            r10 = r2
            r2 = r5
        L70:
            a.gmq r10 = (a.gmq) r10
            a.mlu r4 = new a.mlu
            java.util.Map r5 = r9.o
            boolean r7 = r9.p
            r4.<init>(r5, r7, r6)
            a.gmq r5 = r9.m
            a.gmq r7 = r9.n
            a.a1g r10 = a.dub.e0(r5, r7, r1, r10, r4)
            r9.j = r6
            r9.k = r6
            r9.q = r6
            r9.r = r6
            r9.i = r3
            java.lang.Object r9 = a.slb.Q(r2, r10, r9)
            if (r9 != r0) goto L94
        L93:
            return r0
        L94:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.klu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
