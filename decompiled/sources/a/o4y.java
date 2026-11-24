package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o4y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24662a;
    public final /* synthetic */ p4y b;

    public /* synthetic */ o4y(p4y p4yVar, byte b) {
        this.f24662a = b;
        this.b = p4yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24662a;
        p4y p4yVar = this.b;
        switch (b) {
            case 0:
                lli lliVar = p4yVar.k2;
                if (lliVar != null) {
                    return new q0h0(lliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i = p4y.q2;
                ((k3t0) p4yVar.p2.getValue()).x(l4y.f19433a);
                return Unit.f46060a;
        }
    }
}
