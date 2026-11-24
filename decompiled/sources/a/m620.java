package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m620 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21247a;
    public final /* synthetic */ b720 b;

    public /* synthetic */ m620(b720 b720Var, byte b) {
        this.f21247a = b;
        this.b = b720Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21247a;
        b720 b720Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = b720.w2;
                b720Var.Q0().x(g420.f10642a);
                return Unit.f46060a;
            case 1:
                evz evzVar2 = b720.w2;
                b720Var.Q0().x(e520.f7211a);
                return Unit.f46060a;
            case 2:
                evz evzVar3 = b720.w2;
                b720Var.Q0().x(f520.f8939a);
                return Unit.f46060a;
            case 3:
                evz evzVar4 = b720.w2;
                b720Var.Q0().x(q320.f28029a);
                return Unit.f46060a;
            case 4:
                evz evzVar5 = b720.w2;
                b720Var.Q0().x(e420.f7162a);
                return Unit.f46060a;
            case 5:
                evz evzVar6 = b720.w2;
                b720Var.Q0().x(m320.f21093a);
                return Unit.f46060a;
            case 6:
                mli mliVar = b720Var.k2;
                if (mliVar != null) {
                    return new q0h0(mliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                evz evzVar7 = b720.w2;
                b720Var.Q0().x(x420.f40245a);
                return Unit.f46060a;
            case 8:
                evz evzVar8 = b720.w2;
                b720Var.Q0().x(y420.f41981a);
                return Unit.f46060a;
            case 9:
                evz evzVar9 = b720.w2;
                b720Var.y0();
                return Unit.f46060a;
            case 10:
                evz evzVar10 = b720.w2;
                b720Var.y0();
                return Unit.f46060a;
            default:
                evz evzVar11 = b720.w2;
                b720Var.Q0().x(p320.f26279a);
                return Unit.f46060a;
        }
    }
}
