package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uqz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36140a;
    public final /* synthetic */ wqz b;

    public /* synthetic */ uqz(wqz wqzVar, byte b) {
        this.f36140a = b;
        this.b = wqzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36140a;
        wqz wqzVar = this.b;
        switch (b) {
            case 0:
                bst bstVar = wqz.Q1;
                k3t0 k3t0VarG0 = wqzVar.G0();
                zz2 zz2Var = wqzVar.N1;
                iiy[] iiyVarArr = wqz.R1;
                k3t0VarG0.x(new pqz(zz2Var.n(wqzVar, iiyVarArr[1]).intValue(), wqzVar.O1.n(wqzVar, iiyVarArr[2])));
                return Unit.f46060a;
            case 1:
                bst bstVar2 = wqz.Q1;
                wqzVar.G0().x(oqz.f25711a);
                return Unit.f46060a;
            default:
                bst bstVar3 = wqz.Q1;
                fiu0 fiu0Var = wqzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
