package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cyj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5178a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ vne c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ cyj(xk80 xk80Var, vne vneVar, l7m0 l7m0Var, Function1 function1, byte b) {
        this.f5178a = b;
        this.b = xk80Var;
        this.c = vneVar;
        this.d = l7m0Var;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5178a;
        vne vneVar = this.c;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                xk80 xk80Var = this.b;
                if (iIntValue != xk80Var.k()) {
                    qjj.W(vneVar, null, null, new gyj(xk80Var, iIntValue, this.d, this.e, null, (byte) 0), 3);
                }
                break;
            case 1:
                xk80 xk80Var2 = this.b;
                if (iIntValue != xk80Var2.k()) {
                    qjj.W(vneVar, null, null, new gyj(xk80Var2, iIntValue, this.d, this.e, null, (byte) 1), 3);
                }
                break;
            default:
                xk80 xk80Var3 = this.b;
                if (iIntValue != xk80Var3.k()) {
                    qjj.W(vneVar, null, null, new gyj(xk80Var3, iIntValue, this.d, this.e, null, (byte) 2), 3);
                }
                break;
        }
        return Unit.f46060a;
    }
}
