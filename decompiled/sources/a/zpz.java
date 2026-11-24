package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zpz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44784a;
    public final /* synthetic */ bqz b;

    public /* synthetic */ zpz(bqz bqzVar, byte b) {
        this.f44784a = b;
        this.b = bqzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44784a;
        bqz bqzVar = this.b;
        switch (b) {
            case 0:
                art artVar = bqz.O1;
                bqzVar.G0().x(vpz.f37831a);
                return Unit.f46060a;
            case 1:
                art artVar2 = bqz.O1;
                bqzVar.G0().x(tpz.f34359a);
                return Unit.f46060a;
            case 2:
                art artVar3 = bqz.O1;
                bqzVar.G0().x(upz.f36092a);
                return Unit.f46060a;
            default:
                art artVar4 = bqz.O1;
                fiu0 fiu0Var = bqzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
