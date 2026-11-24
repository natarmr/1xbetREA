package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b54 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1982a;
    public final /* synthetic */ d54 b;

    public /* synthetic */ b54(d54 d54Var, byte b) {
        this.f1982a = b;
        this.b = d54Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1982a;
        w44 w44Var = w44.f38527a;
        d54 d54Var = this.b;
        switch (b) {
            case 0:
                x8i x8iVar = d54Var.L1;
                if (x8iVar != null) {
                    return new q0h0(x8iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gfk0 gfk0Var = d54.R1;
                d54Var.G0().x(w44Var);
                return Unit.f46060a;
            default:
                gfk0 gfk0Var2 = d54.R1;
                d54Var.G0().x(w44Var);
                return Unit.f46060a;
        }
    }
}
