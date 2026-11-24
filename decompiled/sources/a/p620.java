package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p620 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26433a;
    public final /* synthetic */ z620 b;

    public /* synthetic */ p620(z620 z620Var, byte b) {
        this.f26433a = b;
        this.b = z620Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26433a;
        z620 z620Var = this.b;
        switch (b) {
            case 0:
                ghi ghiVar = z620Var.k2;
                if (ghiVar != null) {
                    return new q0h0(ghiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                uuz uuzVar = z620.u2;
                z620Var.Q0().x(x420.f40245a);
                return Unit.f46060a;
            case 2:
                uuz uuzVar2 = z620.u2;
                z620Var.Q0().x(y420.f41981a);
                return Unit.f46060a;
            case 3:
                uuz uuzVar3 = z620.u2;
                z620Var.Q0().x(q320.f28029a);
                return Unit.f46060a;
            case 4:
                uuz uuzVar4 = z620.u2;
                z620Var.Q0().x(e420.f7162a);
                return Unit.f46060a;
            default:
                uuz uuzVar5 = z620.u2;
                z620Var.Q0().x(m320.f21093a);
                return Unit.f46060a;
        }
    }
}
