package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tjr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34062a;
    public final /* synthetic */ vjr b;

    public /* synthetic */ tjr(vjr vjrVar, byte b) {
        this.f34062a = b;
        this.b = vjrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34062a;
        vjr vjrVar = this.b;
        switch (b) {
            case 0:
                lhi lhiVar = vjrVar.K1;
                if (lhiVar != null) {
                    return new q0h0(lhiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                xak xakVar = vjr.P1;
                ((k3t0) vjrVar.N1.getValue()).x(rjr.f30609a);
                return Unit.f46060a;
        }
    }
}
