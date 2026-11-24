package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w820 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38701a;
    public final /* synthetic */ b920 b;

    public /* synthetic */ w820(b920 b920Var, byte b) {
        this.f38701a = b;
        this.b = b920Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38701a;
        b920 b920Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = b920.U1;
                fiu0 fiu0Var = b920Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                htz htzVar2 = b920.U1;
                b920Var.J0().x(x420.f40245a);
                return Unit.f46060a;
            case 2:
                htz htzVar3 = b920.U1;
                b920Var.J0().x(y420.f41981a);
                return Unit.f46060a;
            case 3:
                htz htzVar4 = b920.U1;
                b920Var.J0().x(e520.f7211a);
                return Unit.f46060a;
            case 4:
                htz htzVar5 = b920.U1;
                b920Var.J0().x(f520.f8939a);
                return Unit.f46060a;
            case 5:
                htz htzVar6 = b920.U1;
                b920Var.J0().x(q320.f28029a);
                return Unit.f46060a;
            case 6:
                htz htzVar7 = b920.U1;
                b920Var.J0().x(e420.f7162a);
                return Unit.f46060a;
            case 7:
                htz htzVar8 = b920.U1;
                b920Var.J0().x(m320.f21093a);
                return Unit.f46060a;
            case 8:
                htz htzVar9 = b920.U1;
                b920Var.J0().x(f420.f8892a);
                return Unit.f46060a;
            default:
                htz htzVar10 = b920.U1;
                b920Var.J0().x(d420.f5434a);
                qcc.Q(b920Var);
                return Unit.f46060a;
        }
    }
}
