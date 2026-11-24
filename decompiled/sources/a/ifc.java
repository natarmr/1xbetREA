package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ifc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14679a;
    public final /* synthetic */ pkk0 b;

    public /* synthetic */ ifc(pkk0 pkk0Var, byte b) {
        this.f14679a = b;
        this.b = pkk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14679a;
        pkk0 pkk0Var = this.b;
        switch (b) {
            case 0:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            case 1:
                cge0 cge0Var = xfh0.V1;
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            default:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
        }
        return Unit.f46060a;
    }
}
