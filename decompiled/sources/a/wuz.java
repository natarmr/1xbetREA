package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wuz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39813a;
    public final /* synthetic */ zuz b;

    public /* synthetic */ wuz(zuz zuzVar, byte b) {
        this.f39813a = b;
        this.b = zuzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39813a;
        zuz zuzVar = this.b;
        switch (b) {
            case 0:
                a8z a8zVar = zuzVar.L1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xuz xuzVar = zuz.N1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        g1y g1yVar = new g1y(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar.o0(g1yVar);
                        objP = g1yVar;
                    }
                    ffb0.v(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                xuz xuzVar2 = zuz.N1;
                if (h97.B(bundle, (String) obj, "SEND_RESULT_REQUEST_KEY")) {
                    ((k3t0) zuzVar.L1.getValue()).x(puz.f27639a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
