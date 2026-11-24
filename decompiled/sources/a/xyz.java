package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xyz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41729a;
    public final /* synthetic */ bzz b;

    public /* synthetic */ xyz(bzz bzzVar, byte b) {
        this.f41729a = b;
        this.b = bzzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f41729a;
        bzz bzzVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = bzzVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bzzVar.f.getClass();
                } while (!p7m0Var.m(value, ryz.a((ryz) value, null, null, 0, false, false, null, null, 2039)));
                break;
            case 1:
                p7m0 p7m0Var2 = bzzVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    bzzVar.f.getClass();
                } while (!p7m0Var2.m(value2, ryz.a((ryz) value2, null, null, 0, false, false, null, null, 2039)));
                break;
            default:
                p7m0 p7m0Var3 = bzzVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    bzzVar.f.getClass();
                } while (!p7m0Var3.m(value3, ryz.a((ryz) value3, null, null, 0, false, false, null, null, 2039)));
                break;
        }
        return Unit.f46060a;
    }
}
