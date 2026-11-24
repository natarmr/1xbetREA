package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lam0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19712a;
    public final /* synthetic */ nam0 b;

    public /* synthetic */ lam0(nam0 nam0Var, byte b) {
        this.f19712a = b;
        this.b = nam0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19712a;
        nam0 nam0Var = this.b;
        switch (b) {
            case 0:
                wui wuiVar = nam0Var.L1;
                if (wuiVar != null) {
                    return new q0h0(wuiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s2m0 s2m0Var = nam0.U1;
                kiu0 kiu0Var = nam0Var.O1;
                return new o9m0(new nfj0(2, (tam0) kiu0Var.getValue(), tam0.class, "onMovedItem", "onMovedItem(II)V", 0, (byte) 7), new lph0(0, (tam0) kiu0Var.getValue(), tam0.class, "onUpdateEnd", "onUpdateEnd()V", 0, (byte) 24), new nfj0(2, (tam0) kiu0Var.getValue(), tam0.class, "onSelectItemClicked", "onSelectItemClicked(IZ)V", 0, (byte) 8), new kcl0(1, nam0Var.R1, r9m0.class, "startDrag", "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0, (byte) 16));
            default:
                s2m0 s2m0Var2 = nam0.U1;
                tam0 tam0Var = (tam0) nam0Var.O1.getValue();
                if (Intrinsics.d(tam0Var.n, tam0Var.o)) {
                    tam0Var.x();
                } else {
                    tam0Var.l.f(k9m0.f17921a);
                }
                return Unit.f46060a;
        }
    }
}
