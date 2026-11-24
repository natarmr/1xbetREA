package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class d0o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5277a;
    public final /* synthetic */ e0o b;

    public /* synthetic */ d0o(e0o e0oVar, byte b) {
        this.f5277a = b;
        this.b = e0oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5277a;
        e0o e0oVar = this.b;
        switch (b) {
            case 0:
                g950 g950Var = (g950) obj;
                if (g950Var != null) {
                    return e0oVar.j(g950Var, e0oVar.i().a(g950Var, ux50.f));
                }
                e0o.h(8);
                throw null;
            default:
                g950 g950Var2 = (g950) obj;
                if (g950Var2 != null) {
                    return e0oVar.j(g950Var2, e0oVar.i().f(g950Var2, ux50.f));
                }
                e0o.h(4);
                throw null;
        }
    }
}
