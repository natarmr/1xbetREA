package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xl8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41058a;
    public final /* synthetic */ jm8 b;

    public /* synthetic */ xl8(jm8 jm8Var, byte b) {
        this.f41058a = b;
        this.b = jm8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f41058a;
        jm8 jm8Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = jm8Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    jm8Var.f.getClass();
                } while (!p7m0Var.m(value, kl8.a((kl8) value, false, null, null, null, false, false, null, null, false, null, null, false, false, 61439)));
                break;
            default:
                p7m0 p7m0Var2 = jm8Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    jm8Var.f.getClass();
                } while (!p7m0Var2.m(value2, kl8.a((kl8) value2, false, null, null, csr.e, false, false, null, null, false, null, null, false, false, 65519)));
                break;
        }
        return Unit.f46060a;
    }
}
