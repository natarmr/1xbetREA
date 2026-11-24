package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zuj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45013a;
    public final /* synthetic */ kvj0 b;

    public /* synthetic */ zuj0(kvj0 kvj0Var, byte b) {
        this.f45013a = b;
        this.b = kvj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45013a;
        kvj0 kvj0Var = this.b;
        switch (b) {
            case 0:
                fhi fhiVar = kvj0Var.N1;
                if (fhiVar != null) {
                    return fhiVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                eke0 eke0Var = kvj0.S1;
                yxj0 yxj0VarM0 = kvj0Var.M0();
                bby bbyVar = yxj0VarM0.U;
                if (bbyVar == null || !bbyVar.isActive()) {
                    yxj0VarM0.C(true);
                }
                return Unit.f46060a;
            default:
                eke0 eke0Var2 = kvj0.S1;
                sj3.T(kvj0Var);
                return Unit.f46060a;
        }
    }
}
