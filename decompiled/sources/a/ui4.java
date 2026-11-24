package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ui4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35711a;
    public final /* synthetic */ cj4 b;

    public /* synthetic */ ui4(cj4 cj4Var, byte b) {
        this.f35711a = b;
        this.b = cj4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35711a;
        fi4 fi4Var = fi4.f9570a;
        cj4 cj4Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = cj4.U1;
                cj4Var.G0().x(yh4.f42619a);
                return Unit.f46060a;
            case 1:
                gfk0 gfk0Var2 = cj4.U1;
                cj4Var.G0().x(oh4.f25248a);
                return Unit.f46060a;
            case 2:
                gfk0 gfk0Var3 = cj4.U1;
                cj4Var.G0().x(mh4.f21773a);
                return Unit.f46060a;
            case 3:
                gfk0 gfk0Var4 = cj4.U1;
                cj4Var.G0().x(wh4.f39148a);
                return Unit.f46060a;
            case 4:
                a9i a9iVar = cj4Var.L1;
                if (a9iVar != null) {
                    return new q0h0(a9iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                gfk0 gfk0Var5 = cj4.U1;
                cj4Var.G0().x(xh4.f40870a);
                return Unit.f46060a;
            case 6:
                gfk0 gfk0Var6 = cj4.U1;
                cj4Var.G0().x(ai4.f907a);
                return Unit.f46060a;
            case 7:
                gfk0 gfk0Var7 = cj4.U1;
                cj4Var.G0().x(ci4.f4393a);
                return Unit.f46060a;
            case 8:
                gfk0 gfk0Var8 = cj4.U1;
                cj4Var.G0().x(sh4.f32192a);
                return Unit.f46060a;
            case 9:
                gfk0 gfk0Var9 = cj4.U1;
                cj4Var.G0().x(rh4.f30471a);
                return Unit.f46060a;
            case 10:
                gfk0 gfk0Var10 = cj4.U1;
                cj4Var.G0().x(fi4Var);
                return Unit.f46060a;
            default:
                gfk0 gfk0Var11 = cj4.U1;
                cj4Var.G0().x(fi4Var);
                return Unit.f46060a;
        }
    }
}
