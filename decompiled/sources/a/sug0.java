package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sug0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32818a;
    public final /* synthetic */ zug0 b;

    public /* synthetic */ sug0(zug0 zug0Var, byte b) {
        this.f32818a = b;
        this.b = zug0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32818a;
        zug0 zug0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = zug0.V1;
                zug0Var.I0().B();
                return Unit.f46060a;
            case 1:
                gne0 gne0Var2 = zug0.V1;
                zug0Var.I0().B();
                return Unit.f46060a;
            default:
                fiu0 fiu0Var = zug0Var.Q1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
