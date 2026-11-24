package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8394a;
    public final /* synthetic */ hu0 b;

    public /* synthetic */ eu0(hu0 hu0Var, byte b) {
        this.f8394a = b;
        this.b = hu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8394a;
        hu0 hu0Var = this.b;
        switch (b) {
            case 0:
                rek0 rek0Var = hu0.Y1;
                khf0 khf0VarQ = m7x.Q(hu0Var, j120.V(), new String[0]);
                if (khf0VarQ != null) {
                    return khf0VarQ.d();
                }
                return null;
            case 1:
                rek0 rek0Var2 = hu0.Y1;
                fiu0 fiu0Var = hu0Var.U1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                rek0 rek0Var3 = hu0.Y1;
                hu0Var.G0().x(ps0.f27490a);
                return Unit.f46060a;
            default:
                rek0 rek0Var4 = hu0.Y1;
                hu0Var.G0().x(os0.f25760a);
                return Unit.f46060a;
        }
    }
}
