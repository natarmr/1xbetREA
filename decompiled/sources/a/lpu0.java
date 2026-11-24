package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lpu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20458a;
    public final /* synthetic */ opu0 b;

    public /* synthetic */ lpu0(opu0 opu0Var, byte b) {
        this.f20458a = b;
        this.b = opu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20458a;
        opu0 opu0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                uxs0 uxs0Var = opu0.W1;
                uidVar.getClass();
                opu0Var.G0().x(new wou0(uidVar));
                break;
            case 1:
                dpu0 dpu0Var = (dpu0) obj;
                uxs0 uxs0Var2 = opu0.W1;
                dpu0Var.getClass();
                opu0Var.G0().x(dpu0Var);
                break;
            default:
                bem bemVar = (bem) obj;
                uxs0 uxs0Var3 = opu0.W1;
                bemVar.getClass();
                opu0Var.G0().x(new xou0(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
