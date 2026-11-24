package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nof0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23863a;
    public final /* synthetic */ vof0 b;

    public /* synthetic */ nof0(vof0 vof0Var, byte b) {
        this.f23863a = b;
        this.b = vof0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        srf0 srf0Var;
        byte b = this.f23863a;
        Object obj = null;
        vof0 vof0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = vof0.O1;
                fiu0 fiu0Var = vof0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = vof0.O1;
                ResidentSafeLineView residentSafeLineView = vof0Var.H0().e;
                for (Object obj2 : residentSafeLineView.f46885a) {
                    mrf0 mrf0Var = ((srf0) obj2).c;
                    if ((mrf0Var != null ? mrf0Var.d : null) == qrf0.f29208a) {
                        obj = obj2;
                        srf0Var = (srf0) obj;
                        if (srf0Var != null) {
                            qrf0 qrf0Var = qrf0.f29208a;
                            srf0Var.a(new mrf0(7), residentSafeLineView.e);
                        }
                        return Unit.f46060a;
                    }
                }
                srf0Var = (srf0) obj;
                if (srf0Var != null) {
                    qrf0 qrf0Var2 = qrf0.f29208a;
                    srf0Var.a(new mrf0(7), residentSafeLineView.e);
                }
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr3 = vof0.O1;
                vof0Var.I0().C();
                return Unit.f46060a;
        }
    }
}
