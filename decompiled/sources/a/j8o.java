package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j8o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16094a;
    public final /* synthetic */ k8o b;

    public /* synthetic */ j8o(k8o k8oVar, byte b) {
        this.f16094a = b;
        this.b = k8oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16094a;
        k8o k8oVar = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = k8oVar.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                k8oVar.G0().x(g7o.f10826a);
                return Unit.f46060a;
            default:
                k8oVar.G0().x(f7o.f9067a);
                return Unit.f46060a;
        }
    }
}
