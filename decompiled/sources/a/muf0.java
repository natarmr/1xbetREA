package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class muf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22411a;
    public final /* synthetic */ wuf0 b;

    public /* synthetic */ muf0(wuf0 wuf0Var, byte b) {
        this.f22411a = b;
        this.b = wuf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f22411a;
        wuf0 wuf0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = wuf0Var.r;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, vuf0.a((vuf0) value, false, false, false, 6)));
                break;
            default:
                p7m0 p7m0Var2 = wuf0Var.r;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, vuf0.a((vuf0) value2, false, false, false, 5)));
                break;
        }
        return Unit.f46060a;
    }
}
