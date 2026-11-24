package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f1y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8789a;
    public final /* synthetic */ h1y b;

    public /* synthetic */ f1y(h1y h1yVar, byte b) {
        this.f8789a = b;
        this.b = h1yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8789a;
        h1y h1yVar = this.b;
        switch (b) {
            case 0:
                hji hjiVar = h1yVar.k2;
                if (hjiVar != null) {
                    return new q0h0(hjiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i = h1y.q2;
                ((k3t0) h1yVar.p2.getValue()).x(z0y.f43592a);
                return Unit.f46060a;
        }
    }
}
