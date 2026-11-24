package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14190a;
    public final /* synthetic */ n5g b;

    public /* synthetic */ i5g(n5g n5gVar, byte b) {
        this.f14190a = b;
        this.b = n5gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14190a;
        n5g n5gVar = this.b;
        switch (b) {
            case 0:
                qud qudVar = n5g.S1;
                n5gVar.I0().z(-1);
                return Unit.f46060a;
            case 1:
                qud qudVar2 = n5g.S1;
                n5gVar.I0().z(1);
                return Unit.f46060a;
            default:
                wdi wdiVar = n5gVar.K1;
                if (wdiVar != null) {
                    return new q0h0(wdiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
