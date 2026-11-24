package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a400 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f199a;
    public final /* synthetic */ c400 b;

    public /* synthetic */ a400(c400 c400Var, byte b) {
        this.f199a = b;
        this.b = c400Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f199a;
        c400 c400Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = c400.N1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                ((k3t0) c400Var.L1.getValue()).x(u300.f34972a);
                break;
            default:
                a8z a8zVar = c400Var.L1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xuz xuzVar2 = c400.N1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        svz svzVar = new svz(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar.o0(svzVar);
                        objP = svzVar;
                    }
                    ccq0.A(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
