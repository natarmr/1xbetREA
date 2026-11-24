package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hwa0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13761a;
    public final /* synthetic */ iwa0 b;

    public /* synthetic */ hwa0(iwa0 iwa0Var, byte b) {
        this.f13761a = b;
        this.b = iwa0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13761a;
        iwa0 iwa0Var = this.b;
        switch (b) {
            case 0:
                int i = iwa0.m2;
                fiu0 fiu0Var = iwa0Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                int i2 = iwa0.m2;
                ((k3t0) iwa0Var.l2.getValue()).x(ewa0.f8513a);
                return Unit.f46060a;
            default:
                int i3 = iwa0.m2;
                ((k3t0) iwa0Var.l2.getValue()).x(dwa0.f6788a);
                return Unit.f46060a;
        }
    }
}
