package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s250 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31486a;
    public final /* synthetic */ u250 b;

    public /* synthetic */ s250(u250 u250Var, byte b) {
        this.f31486a = b;
        this.b = u250Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31486a;
        u250 u250Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = u250.V1;
                fiu0 fiu0Var = u250Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                wsz wszVar2 = u250.V1;
                u250Var.G0().x(z050.f43549a);
                return Unit.f46060a;
        }
    }
}
