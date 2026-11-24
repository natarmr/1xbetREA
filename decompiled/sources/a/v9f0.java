package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v9f0 extends bnn0 implements Function2 {
    public int i;
    public int j;
    public int k;
    public byte l;
    public final /* synthetic */ y9f0 m;
    public final /* synthetic */ xcz n;
    public final /* synthetic */ rv2 o;
    public final /* synthetic */ u0f0 p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9f0(y9f0 y9f0Var, xcz xczVar, rv2 rv2Var, u0f0 u0f0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = y9f0Var;
        this.n = xczVar;
        this.o = rv2Var;
        this.p = u0f0Var;
        this.q = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v9f0(this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v9f0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        if (r2.f(r6, r4, r12) == r0) goto L47;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v9f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
