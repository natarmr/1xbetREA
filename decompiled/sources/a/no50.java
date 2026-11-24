package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class no50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23854a;
    public final /* synthetic */ po50 b;

    public /* synthetic */ no50(po50 po50Var, byte b) {
        this.f23854a = b;
        this.b = po50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23854a;
        po50 po50Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = po50.S1;
                fiu0 fiu0Var = po50Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                htz htzVar2 = po50.S1;
                po50Var.G0().x(eo50.f8125a);
                po50Var.G0().x(wn50.f39433a);
                return Unit.f46060a;
            default:
                htz htzVar3 = po50.S1;
                po50Var.G0().x(do50.f6401a);
                return Unit.f46060a;
        }
    }
}
