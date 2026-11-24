package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j6h0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15987a;
    public final /* synthetic */ l6h0 b;

    public /* synthetic */ j6h0(l6h0 l6h0Var, byte b) {
        this.f15987a = b;
        this.b = l6h0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15987a;
        l6h0 l6h0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = l6h0.O1;
                fiu0 fiu0Var = l6h0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("scratchCardViewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = l6h0.O1;
                w6h0 w6h0Var = (w6h0) l6h0Var.M1.getValue();
                sac.V(jiu0.a(w6h0Var), v6h0.f36878a, null, null, new z8b0(w6h0Var, null, (byte) 12), 14);
                return Unit.f46060a;
        }
    }
}
