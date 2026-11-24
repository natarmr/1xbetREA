package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class auz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1502a;
    public final /* synthetic */ euz b;

    public /* synthetic */ auz(euz euzVar, byte b) {
        this.f1502a = b;
        this.b = euzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f1502a;
        euz euzVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = euzVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    euzVar.f.getClass();
                } while (!p7m0Var.m(value, ttz.a((ttz) value, null, null, 0, false, false, false, null, null, 2039)));
                break;
            case 1:
                p7m0 p7m0Var2 = euzVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    euzVar.f.getClass();
                } while (!p7m0Var2.m(value2, ttz.a((ttz) value2, null, null, 0, false, false, false, null, null, 2039)));
                break;
            default:
                p7m0 p7m0Var3 = euzVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    euzVar.f.getClass();
                } while (!p7m0Var3.m(value3, ttz.a((ttz) value3, null, null, 0, false, false, false, null, null, 2039)));
                break;
        }
        return Unit.f46060a;
    }
}
