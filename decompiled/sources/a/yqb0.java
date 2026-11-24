package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yqb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43068a;
    public final /* synthetic */ crb0 b;

    public /* synthetic */ yqb0(crb0 crb0Var, byte b) {
        this.f43068a = b;
        this.b = crb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43068a;
        crb0 crb0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = crb0Var.O1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jh70 jh70Var = crb0.S1;
                crb0Var.H0().x();
                return Unit.f46060a;
            default:
                jh70 jh70Var2 = crb0.S1;
                crb0Var.H0().x();
                return Unit.f46060a;
        }
    }
}
