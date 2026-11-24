package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n5y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22968a;
    public final /* synthetic */ o5y b;

    public /* synthetic */ n5y(o5y o5yVar, byte b) {
        this.f22968a = b;
        this.b = o5yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22968a;
        o5y o5yVar = this.b;
        switch (b) {
            case 0:
                kji kjiVar = o5yVar.k2;
                if (kjiVar != null) {
                    return new q0h0(kjiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i = o5y.q2;
                ((k3t0) o5yVar.p2.getValue()).x(h5y.f12504a);
                return Unit.f46060a;
        }
    }
}
