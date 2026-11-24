package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hy7 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ e960 j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ t33 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ t33 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ pz40 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy7(e960 e960Var, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, t33 t33Var6, float f, t33 t33Var7, float f2, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = e960Var;
        this.k = t33Var;
        this.l = t33Var2;
        this.m = t33Var3;
        this.n = t33Var4;
        this.o = t33Var5;
        this.p = t33Var6;
        this.q = f;
        this.r = t33Var7;
        this.s = f2;
        this.t = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new hy7(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hy7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c A[PHI: r13 r18
  0x008c: PHI (r13v4 a.pz40) = (r13v3 a.pz40), (r13v8 a.pz40) binds: [B:24:0x0089, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r18v2 a.e960) = (r18v1 a.e960), (r18v5 a.e960) binds: [B:24:0x0089, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[PHI: r13 r18
  0x0095: PHI (r13v5 a.pz40) = (r13v4 a.pz40), (r13v9 a.pz40) binds: [B:27:0x0092, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r18v3 a.e960) = (r18v2 a.e960), (r18v6 a.e960) binds: [B:27:0x0092, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (a.ry7.f(r19.m, r19.p, r19.r, r19) == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r0 == r9) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hy7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
