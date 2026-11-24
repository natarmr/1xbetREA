package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gi8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11333a;
    public final /* synthetic */ oi8 b;

    public /* synthetic */ gi8(oi8 oi8Var, byte b) {
        this.f11333a = b;
        this.b = oi8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11333a;
        oi8 oi8Var = this.b;
        switch (b) {
            case 0:
                lai laiVar = oi8Var.K1;
                if (laiVar != null) {
                    return new q0h0(laiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                cl5 cl5Var = oi8.P1;
                oi8Var.G0().x(pk8.f27123a);
                return Unit.f46060a;
        }
    }
}
