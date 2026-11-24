package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hi8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13101a;
    public final /* synthetic */ ni8 b;

    public /* synthetic */ hi8(ni8 ni8Var, byte b) {
        this.f13101a = b;
        this.b = ni8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13101a;
        ni8 ni8Var = this.b;
        switch (b) {
            case 0:
                kai kaiVar = ni8Var.K1;
                if (kaiVar != null) {
                    return new q0h0(kaiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                yk5 yk5Var = ni8.U1;
                ni8Var.G0().x(qh8.f28725a);
                return Unit.f46060a;
            default:
                yk5 yk5Var2 = ni8.U1;
                ni8Var.G0().x(ph8.f26985a);
                return Unit.f46060a;
        }
    }
}
