package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ibp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14500a;
    public final /* synthetic */ ccp b;

    public /* synthetic */ ibp(ccp ccpVar, byte b) {
        this.f14500a = b;
        this.b = ccpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f14500a;
        ccp ccpVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = ccpVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ccpVar.f.getClass();
                } while (!p7m0Var.m(value, dd80.a((dd80) value, false, false, false, false, false, false, null, null, false, 8189)));
                break;
            case 1:
                p7m0 p7m0Var2 = ccpVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    ccpVar.f.getClass();
                } while (!p7m0Var2.m(value2, dd80.a((dd80) value2, false, false, false, false, false, false, null, null, false, 8189)));
                break;
            default:
                p7m0 p7m0Var3 = ccpVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    ccpVar.f.getClass();
                } while (!p7m0Var3.m(value3, dd80.a((dd80) value3, false, false, false, false, false, false, null, null, false, 8189)));
                break;
        }
        return Unit.f46060a;
    }
}
