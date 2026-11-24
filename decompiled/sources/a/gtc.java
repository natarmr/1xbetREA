package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class gtc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d6x f11873a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ucg0 c;
    public final /* synthetic */ Function0 d;

    public gtc(d6x d6xVar, boolean z, ucg0 ucg0Var, Function0 function0) {
        this.f11873a = d6xVar;
        this.b = z;
        this.c = ucg0Var;
        this.d = function0;
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
        mm40 mm40VarE = a6x.a(jm40.b, gy40Var, this.f11873a).e(new dtc(gy40Var, null, false, this.b, null, this.c, this.d));
        fetVar.r(false);
        return mm40VarE;
    }
}
