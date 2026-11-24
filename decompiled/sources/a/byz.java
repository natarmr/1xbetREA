package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class byz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3441a;
    public final /* synthetic */ eyz b;

    public /* synthetic */ byz(eyz eyzVar, byte b) {
        this.f3441a = b;
        this.b = eyzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3441a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                evz evzVar = eyz.O1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eyz eyzVar = this.b;
                    pz40 pz40VarY = ((i3t0) eyzVar.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = eyzVar.G0();
                    boolean zI = fetVar.i(eyzVar);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        svz svzVar = new svz(1, eyzVar, eyz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/LimitsKenyaSideEffect;)V", 0, (byte) 3);
                        fetVar.o0(svzVar);
                        objP = svzVar;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(eyzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        bio bioVar = new bio(k3t0VarG0, eyzVar, pz40VarF, null, (byte) 28);
                        fetVar.o0(bioVar);
                        objP2 = bioVar;
                    }
                    m0x0.t(fetVar, eyzVar, (Function2) objP2);
                    k3t0 k3t0VarG1 = eyzVar.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        svz svzVar2 = new svz(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar.o0(svzVar2);
                        objP3 = svzVar2;
                    }
                    x4d0.H(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                evz evzVar2 = eyz.O1;
                if (h97.B(bundle, (String) obj, "SEND_RESULT_REQUEST_KEY")) {
                    this.b.G0().x(hxz.f13836a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
