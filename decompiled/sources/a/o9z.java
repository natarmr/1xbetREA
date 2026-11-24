package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class o9z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24904a;
    public final p9z b;

    public /* synthetic */ o9z(p9z p9zVar, byte b) {
        this.f24904a = b;
        this.b = p9zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24904a;
        p9z p9zVar = this.b;
        g950 g950Var = (g950) obj;
        switch (b) {
            case 0:
                g950Var.getClass();
                return p9zVar.N(g950Var);
            default:
                g950Var.getClass();
                return p9zVar.O(g950Var);
        }
    }
}
