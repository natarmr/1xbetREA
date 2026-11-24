package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z5m0 extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u5m0 k;
    public final /* synthetic */ k43 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ t33 p;
    public final /* synthetic */ t33 q;
    public final /* synthetic */ t33 r;
    public final /* synthetic */ t33 s;
    public final /* synthetic */ t33 t;
    public final /* synthetic */ t33 u;
    public final /* synthetic */ t33 v;
    public final /* synthetic */ c0d w;
    public final /* synthetic */ t33 x;
    public final /* synthetic */ t33 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5m0(u5m0 u5m0Var, k43 k43Var, long j, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, t33 t33Var6, t33 t33Var7, t33 t33Var8, t33 t33Var9, c0d c0dVar, t33 t33Var10, t33 t33Var11, yje yjeVar) {
        super(2, yjeVar);
        this.k = u5m0Var;
        this.l = k43Var;
        this.m = j;
        this.n = t33Var;
        this.o = t33Var2;
        this.p = t33Var3;
        this.q = t33Var4;
        this.r = t33Var5;
        this.s = t33Var6;
        this.t = t33Var7;
        this.u = t33Var8;
        this.v = t33Var9;
        this.w = c0dVar;
        this.x = t33Var10;
        this.y = t33Var11;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        z5m0 z5m0Var = new z5m0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, yjeVar);
        z5m0Var.j = obj;
        return z5m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z5m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0117 A[PHI: r8
  0x0117: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v7 java.lang.Object) binds: [B:33:0x0114, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        if (r24.p.f(r24, r1) == r2) goto L37;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z5m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
