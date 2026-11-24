package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lop implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20404a;
    public final /* synthetic */ q0h0 b;

    public /* synthetic */ lop(q0h0 q0h0Var, byte b) {
        this.f20404a = b;
        this.b = q0h0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20404a;
        q0h0 q0h0Var = this.b;
        switch (b) {
            case 0:
                nek nekVar = rop.a2;
                break;
            case 1:
                fl70 fl70Var = igc0.V1;
                break;
            default:
                mi70 mi70Var = lmc0.Q1;
                break;
        }
        return q0h0Var;
    }
}
