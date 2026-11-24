package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wvr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39853a;
    public final /* synthetic */ zvr0 b;

    public /* synthetic */ wvr0(zvr0 zvr0Var, byte b) {
        this.f39853a = b;
        this.b = zvr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39853a;
        bvr0 bvr0Var = bvr0.f3292a;
        zvr0 zvr0Var = this.b;
        switch (b) {
            case 0:
                zvr0Var.R();
                break;
            case 1:
                zvr0Var.x(bvr0Var);
                break;
            default:
                zvr0Var.x(bvr0Var);
                break;
        }
        return Unit.f46060a;
    }
}
