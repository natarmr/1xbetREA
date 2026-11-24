package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class noz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23888a;
    public final /* synthetic */ qoz b;

    public /* synthetic */ noz(qoz qozVar, byte b) {
        this.f23888a = b;
        this.b = qozVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23888a;
        qoz qozVar = this.b;
        switch (b) {
            case 0:
                sqt sqtVar = qoz.N1;
                ((k3t0) qozVar.M1.getValue()).x(ioz.f15138a);
                return Unit.f46060a;
            case 1:
                sqt sqtVar2 = qoz.N1;
                ((k3t0) qozVar.M1.getValue()).x(joz.f16874a);
                return Unit.f46060a;
            default:
                sqt sqtVar3 = qoz.N1;
                fiu0 fiu0Var = qozVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
