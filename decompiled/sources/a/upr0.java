package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class upr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36081a;
    public final /* synthetic */ wpr0 b;

    public /* synthetic */ upr0(wpr0 wpr0Var, byte b) {
        this.f36081a = b;
        this.b = wpr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36081a;
        wpr0 wpr0Var = this.b;
        switch (b) {
            case 0:
                s9m0 s9m0Var = wpr0.P1;
                fiu0 fiu0Var = wpr0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s9m0 s9m0Var2 = wpr0.P1;
                ((k3t0) wpr0Var.O1.getValue()).x(zor0.f44729a);
                return Unit.f46060a;
            default:
                s9m0 s9m0Var3 = wpr0.P1;
                ((k3t0) wpr0Var.O1.getValue()).x(wor0.f39511a);
                return Unit.f46060a;
        }
    }
}
