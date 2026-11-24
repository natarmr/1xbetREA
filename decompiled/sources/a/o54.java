package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o54 extends bnn0 implements Function2 {
    public int i;
    public na10 j;
    public u910 k;
    public float l;
    public float m;
    public byte n;
    public final /* synthetic */ xn4 o;
    public final /* synthetic */ na10 p;
    public final /* synthetic */ na10 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ u910 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o54(xn4 xn4Var, na10 na10Var, na10 na10Var2, boolean z, u910 u910Var, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.o = xn4Var;
        this.p = na10Var;
        this.q = na10Var2;
        this.r = z;
        this.s = u910Var;
        this.t = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new o54(this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o54) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[PHI: r0 r1 r2 r3 r8
  0x0031: PHI (r0v12 float) = (r0v10 float), (r0v20 float) binds: [B:45:0x00cf, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r1v6 float) = (r1v4 float), (r1v9 float) binds: [B:45:0x00cf, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r2v10 int) = (r2v8 int), (r2v15 int) binds: [B:45:0x00cf, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v10 java.lang.Object) = (r3v8 java.lang.Object), (r3v16 java.lang.Object) binds: [B:45:0x00cf, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r8v1 a.u910) = (r8v0 a.u910), (r8v2 a.u910) binds: [B:45:0x00cf, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        if (a.fww.s(r0, (a.fa10) r3, 1, r1, r4, r16, 1834) == r7) goto L49;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o54.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
