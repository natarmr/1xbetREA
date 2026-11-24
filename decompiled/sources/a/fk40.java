package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fk40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9673a;
    public final /* synthetic */ ik40 b;

    public /* synthetic */ fk40(ik40 ik40Var, byte b) {
        this.f9673a = b;
        this.b = ik40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9673a;
        ik40 ik40Var = this.b;
        switch (b) {
            case 0:
                vli vliVar = ik40Var.K1;
                if (vliVar != null) {
                    return new q0h0(vliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                uuz uuzVar = ik40.S1;
                ((uzg) ((wk40) ik40Var.O1.getValue()).d).a();
                return Unit.f46060a;
        }
    }
}
