package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n3m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22857a = 1;
    public final /* synthetic */ vne b;
    public final /* synthetic */ x3m c;

    public /* synthetic */ n3m(vne vneVar, x3m x3mVar) {
        this.b = vneVar;
        this.c = x3mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22857a;
        x3m x3mVar = this.c;
        vne vneVar = this.b;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                y3m y3mVarC = x3mVar.c();
                iiy[] iiyVarArr = cbi0.f4063a;
                y3mVarC.getClass();
                zai0 zai0Var = cbi0.f;
                iiy[] iiyVarArr2 = cbi0.f4063a;
                iiy iiyVar = iiyVarArr2[4];
                zai0Var.getClass();
                abi0Var.b(zai0Var, y3mVarC);
                n3m n3mVar = new n3m(vneVar, x3mVar);
                zai0 zai0Var2 = cbi0.r;
                iiy iiyVar2 = iiyVarArr2[15];
                zai0Var2.getClass();
                abi0Var.b(zai0Var2, n3mVar);
                break;
            default:
                lo8 lo8Var = (lo8) obj;
                lo8Var.getClass();
                qjj.W(vneVar, null, null, new fr9(lo8Var, x3mVar, null, (byte) 22), 3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n3m(x3m x3mVar, vne vneVar) {
        this.c = x3mVar;
        this.b = vneVar;
    }
}
