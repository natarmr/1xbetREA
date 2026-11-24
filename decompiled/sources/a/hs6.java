package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hs6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13565a;
    public final /* synthetic */ is6 b;

    public /* synthetic */ hs6(is6 is6Var, byte b) {
        this.f13565a = b;
        this.b = is6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13565a;
        is6 is6Var = this.b;
        switch (b) {
            case 0:
                int i = is6.r2;
                fiu0 fiu0Var = is6Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                int i2 = is6.r2;
                is6Var.P0().x(x420.f40245a);
                return Unit.f46060a;
            case 2:
                int i3 = is6.r2;
                is6Var.P0().x(y420.f41981a);
                return Unit.f46060a;
            case 3:
                int i4 = is6.r2;
                is6Var.P0().x(q320.f28029a);
                return Unit.f46060a;
            case 4:
                int i5 = is6.r2;
                is6Var.P0().x(e420.f7162a);
                return Unit.f46060a;
            default:
                int i6 = is6.r2;
                is6Var.P0().x(m320.f21093a);
                return Unit.f46060a;
        }
    }
}
