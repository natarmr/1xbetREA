package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fde0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9355a;
    public final /* synthetic */ hde0 b;

    public /* synthetic */ fde0(hde0 hde0Var, byte b) {
        this.f9355a = b;
        this.b = hde0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9355a;
        hde0 hde0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = hde0Var.j;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                hde0Var.f.b();
                break;
            case 1:
                p7m0 p7m0Var2 = hde0Var.j;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                hde0Var.w(false);
                break;
            default:
                p7m0 p7m0Var3 = hde0Var.j;
                Boolean bool3 = Boolean.FALSE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool3);
                break;
        }
        return Unit.f46060a;
    }
}
