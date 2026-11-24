package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class j4i0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d6x f15886a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ucg0 d;
    public final /* synthetic */ Function0 e;

    public j4i0(d6x d6xVar, boolean z, boolean z2, ucg0 ucg0Var, Function0 function0) {
        this.f15886a = d6xVar;
        this.b = z;
        this.c = z2;
        this.d = ucg0Var;
        this.e = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        fetVar.e0(-1525724089);
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = dw9.j(fetVar);
        }
        gy40 gy40Var = (gy40) objP;
        mm40 mm40VarE = a6x.a(jm40.b, gy40Var, this.f15886a).e(new i4i0(this.b, gy40Var, null, this.c, this.d, this.e));
        fetVar.r(false);
        return mm40VarE;
    }
}
