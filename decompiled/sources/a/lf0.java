package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19928a;
    public final /* synthetic */ nf0 b;

    public /* synthetic */ lf0(nf0 nf0Var, byte b) {
        this.f19928a = b;
        this.b = nf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19928a;
        nf0 nf0Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = nf0.S1;
                nf0Var.G0().x(we0.f38997a);
                return Unit.f46060a;
            default:
                hfk0 hfk0Var2 = nf0.S1;
                fiu0 fiu0Var = nf0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
