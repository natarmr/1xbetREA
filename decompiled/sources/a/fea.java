package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fea extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ nea j;
    public final /* synthetic */ xcf k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ t33 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ t33 r;
    public final /* synthetic */ t33 s;
    public final /* synthetic */ t33 t;
    public final /* synthetic */ pz40 u;
    public final /* synthetic */ pz40 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fea(nea neaVar, xcf xcfVar, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, Function1 function1, t33 t33Var6, t33 t33Var7, t33 t33Var8, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = neaVar;
        this.k = xcfVar;
        this.l = t33Var;
        this.m = t33Var2;
        this.n = t33Var3;
        this.o = t33Var4;
        this.p = t33Var5;
        this.q = function1;
        this.r = t33Var6;
        this.s = t33Var7;
        this.t = t33Var8;
        this.u = pz40Var;
        this.v = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fea(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fea) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (a.xcf.c(r17.l, r17.m, r17.n, r17.o, r17.p, r5, r17) == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (a.d5c.J(r17, new a.rcf(r17.l, r17.m, r17.p, r10, r17.n, r17.o, r17.t, null)) == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r0 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
    
        if (r0 == r7) goto L50;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
