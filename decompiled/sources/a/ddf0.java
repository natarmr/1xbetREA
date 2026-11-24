package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ddf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5895a;
    public final /* synthetic */ fdf0 b;

    public /* synthetic */ ddf0(fdf0 fdf0Var, byte b) {
        this.f5895a = b;
        this.b = fdf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5895a;
        fdf0 fdf0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = fdf0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                lme0 lme0Var = fdf0.R1;
                ((yef0) fdf0Var.P1.getValue()).w();
                return Unit.f46060a;
            default:
                lme0 lme0Var2 = fdf0.R1;
                ((yef0) fdf0Var.P1.getValue()).w();
                return Unit.f46060a;
        }
    }
}
