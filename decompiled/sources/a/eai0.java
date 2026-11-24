package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eai0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7466a;
    public final /* synthetic */ jai0 b;

    public /* synthetic */ eai0(jai0 jai0Var, byte b) {
        this.f7466a = b;
        this.b = jai0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f7466a;
        jai0 jai0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = jai0Var.h;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.FALSE));
                break;
            default:
                p7m0 p7m0Var2 = jai0Var.h;
                do {
                    value2 = p7m0Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var2.m(value2, Boolean.FALSE));
                break;
        }
        return Unit.f46060a;
    }
}
