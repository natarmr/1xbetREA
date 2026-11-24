package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h210 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12310a;
    public final /* synthetic */ k210 b;

    public /* synthetic */ h210(k210 k210Var, byte b) {
        this.f12310a = b;
        this.b = k210Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12310a;
        k210 k210Var = this.b;
        switch (b) {
            case 0:
                bki bkiVar = k210Var.K1;
                if (bkiVar != null) {
                    return new q0h0(bkiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar = k210.U1;
                ((uzg) ((b310) k210Var.O1.getValue()).d).a();
                return Unit.f46060a;
        }
    }
}
