package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gt6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11865a;
    public final /* synthetic */ kt6 b;

    public /* synthetic */ gt6(kt6 kt6Var, byte b) {
        this.f11865a = b;
        this.b = kt6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f11865a;
        kt6 kt6Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = kt6Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                bj5 bj5Var = kt6.Q1;
                y920 y920VarH0 = kt6Var.H0();
                CharSequence text = kt6Var.G0().c.getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                y920VarH0.w(string, true);
                return Unit.f46060a;
        }
    }
}
