package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b000 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1745a;
    public final /* synthetic */ f000 b;

    public /* synthetic */ b000(f000 f000Var, byte b) {
        this.f1745a = b;
        this.b = f000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1745a) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                atz atzVar = f000.O1;
                if (h97.B(bundle, (String) obj, "SEND_RESULT_REQUEST_KEY")) {
                    this.b.G0().x(tzz.f34827a);
                }
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                atz atzVar2 = f000.O1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f000 f000Var = this.b;
                    pz40 pz40VarY = ((i3t0) f000Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = f000Var.G0();
                    boolean zI = fetVar.i(f000Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        svz svzVar = new svz(1, f000Var, f000.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_ne/impl/presentation/limits_main_screen/models/LimitsNeSideEffect;)V", 0, (byte) 5);
                        fetVar.o0(svzVar);
                        objP = svzVar;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(f000Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        bio bioVar = new bio(k3t0VarG0, f000Var, pz40VarF, null, (byte) 29);
                        fetVar.o0(bioVar);
                        objP2 = bioVar;
                    }
                    m0x0.t(fetVar, f000Var, (Function2) objP2);
                    k3t0 k3t0VarG1 = f000Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        svz svzVar2 = new svz(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar.o0(svzVar2);
                        objP3 = svzVar2;
                    }
                    unh0.J(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
