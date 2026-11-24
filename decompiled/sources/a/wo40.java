package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wo40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39475a;
    public final /* synthetic */ yo40 b;

    public /* synthetic */ wo40(yo40 yo40Var, byte b) {
        this.f39475a = b;
        this.b = yo40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39475a;
        yo40 yo40Var = this.b;
        switch (b) {
            case 0:
                xli xliVar = yo40Var.K1;
                if (xliVar != null) {
                    return new q0h0(xliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                atz atzVar = yo40.P1;
                yo40Var.G0().x(oo40.f25575a);
                return Unit.f46060a;
            case 2:
                atz atzVar2 = yo40.P1;
                yo40Var.G0().x(qo40.f29055a);
                return Unit.f46060a;
            default:
                atz atzVar3 = yo40.P1;
                yo40Var.G0().x(no40.f23852a);
                return Unit.f46060a;
        }
    }
}
