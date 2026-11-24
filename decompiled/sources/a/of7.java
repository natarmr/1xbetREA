package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class of7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25151a;
    public final /* synthetic */ uf7 b;

    public /* synthetic */ of7(uf7 uf7Var, byte b) {
        this.f25151a = b;
        this.b = uf7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25151a;
        uf7 uf7Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = uf7Var.j;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
            default:
                p7m0 p7m0Var2 = uf7Var.j;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                break;
        }
        return Unit.f46060a;
    }
}
