package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gdc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11099a;
    public final /* synthetic */ idc0 b;

    public /* synthetic */ gdc0(idc0 idc0Var, byte b) {
        this.f11099a = b;
        this.b = idc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11099a;
        idc0 idc0Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = idc0.S1;
                c720 c720Var = idc0Var.K1;
                if (c720Var != null) {
                    c720Var.x0();
                }
                return Unit.f46060a;
            case 1:
                jh70 jh70Var2 = idc0.S1;
                kvc0 kvc0VarM0 = idc0Var.M0();
                String strI0 = sj3.i0(((ivc0) kvc0VarM0.D.getValue()).f15440a);
                if (strI0 != null) {
                    kvc0VarM0.C(strI0, true);
                }
                return Unit.f46060a;
            default:
                fiu0 fiu0Var = idc0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
