package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a500 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f246a;
    public final /* synthetic */ g500 b;

    public /* synthetic */ a500(g500 g500Var, byte b) {
        this.f246a = b;
        this.b = g500Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f246a;
        g500 g500Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = g500Var.n;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
            case 1:
                p7m0 p7m0Var2 = g500Var.n;
                do {
                    value = p7m0Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var2.m(value, Boolean.FALSE));
                break;
            default:
                p7m0 p7m0Var3 = g500Var.n;
                do {
                    value2 = p7m0Var3.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var3.m(value2, Boolean.FALSE));
                break;
        }
        return Unit.f46060a;
    }
}
