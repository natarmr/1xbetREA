package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fwz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10284a;
    public final /* synthetic */ hwz b;

    public /* synthetic */ fwz(hwz hwzVar, byte b) {
        this.f10284a = b;
        this.b = hwzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10284a;
        hwz hwzVar = this.b;
        switch (b) {
            case 0:
                wsz wszVar = hwz.N1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                ((k3t0) hwzVar.L1.getValue()).x(zvz.f45081a);
                break;
            default:
                a8z a8zVar = hwzVar.L1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                wsz wszVar2 = hwz.N1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        svz svzVar = new svz(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar.o0(svzVar);
                        objP = svzVar;
                    }
                    ro4.I(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
