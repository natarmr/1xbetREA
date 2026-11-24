package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l9q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19668a;
    public final /* synthetic */ n9q b;

    public /* synthetic */ l9q(n9q n9qVar, byte b) {
        this.f19668a = b;
        this.b = n9qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19668a;
        n9q n9qVar = this.b;
        switch (b) {
            case 0:
                ihi ihiVar = n9qVar.L1;
                if (ihiVar != null) {
                    return new q0h0(ihiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr = n9q.S1;
                n9qVar.G0().x(e9q.f7434a);
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr2 = n9q.S1;
                n9qVar.G0().x(d9q.f5713a);
                return Unit.f46060a;
        }
    }
}
