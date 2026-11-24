package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ssr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32740a;
    public final /* synthetic */ usr0 b;

    public /* synthetic */ ssr0(usr0 usr0Var, byte b) {
        this.f32740a = b;
        this.b = usr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32740a;
        usr0 usr0Var = this.b;
        switch (b) {
            case 0:
                int i = usr0.r2;
                fiu0 fiu0Var = usr0Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i2 = usr0.r2;
                usr0Var.Q0().x(m320.f21093a);
                return Unit.f46060a;
        }
    }
}
