package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3109a;
    public final /* synthetic */ ns30 b;

    public /* synthetic */ bs30(ns30 ns30Var, byte b) {
        this.f3109a = b;
        this.b = ns30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f3109a;
        ns30 ns30Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = ns30Var.q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, ks30.a((ks30) value, false, false, 2)));
                break;
            default:
                p7m0 p7m0Var2 = ns30Var.q;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ks30.a((ks30) value2, false, false, 2)));
                break;
        }
        return Unit.f46060a;
    }
}
