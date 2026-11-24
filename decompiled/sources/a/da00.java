package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5725a;
    public final /* synthetic */ ppj0 b;

    public /* synthetic */ da00(ppj0 ppj0Var, byte b) {
        this.f5725a = b;
        this.b = ppj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5725a;
        ppj0 ppj0Var = this.b;
        switch (b) {
            case 0:
                ppj0Var.b();
                break;
            default:
                ppj0Var.b();
                break;
        }
        return Unit.f46060a;
    }
}
