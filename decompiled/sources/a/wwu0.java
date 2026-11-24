package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wwu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39902a;
    public final /* synthetic */ ywu0 b;

    public /* synthetic */ wwu0(ywu0 ywu0Var, byte b) {
        this.f39902a = b;
        this.b = ywu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39902a;
        ywu0 ywu0Var = this.b;
        switch (b) {
            case 0:
                gzi gziVar = ywu0Var.k2;
                if (gziVar != null) {
                    return new q0h0(gziVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                sxs0 sxs0Var = ywu0.s2;
                if (!ywu0Var.R()) {
                    ywu0Var.y0();
                }
                return Unit.f46060a;
            default:
                sxs0 sxs0Var2 = ywu0.s2;
                ywu0Var.P0().x(awu0.f1593a);
                return Unit.f46060a;
        }
    }
}
