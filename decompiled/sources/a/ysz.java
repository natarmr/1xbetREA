package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ysz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43193a;
    public final /* synthetic */ ctz b;

    public /* synthetic */ ysz(ctz ctzVar, byte b) {
        this.f43193a = b;
        this.b = ctzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43193a) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                atz atzVar = ctz.O1;
                if (h97.B(bundle, (String) obj, "SEND_RESULT_REQUEST_KEY")) {
                    this.b.G0().x(psz.f27537a);
                }
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                atz atzVar2 = ctz.O1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ctz ctzVar = this.b;
                    pz40 pz40VarY = ((i3t0) ctzVar.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = ctzVar.G0();
                    boolean zI = fetVar.i(ctzVar);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        g1y g1yVar = new g1y(1, ctzVar, ctz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_africa/impl/presentation/limits_main_screen/models/LimitsAfricaSideEffect;)V", 0, (byte) 27);
                        fetVar.o0(g1yVar);
                        objP = g1yVar;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(ctzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        bio bioVar = new bio(k3t0VarG0, ctzVar, pz40VarF, null, (byte) 27);
                        fetVar.o0(bioVar);
                        objP2 = bioVar;
                    }
                    m0x0.t(fetVar, ctzVar, (Function2) objP2);
                    k3t0 k3t0VarG1 = ctzVar.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        g1y g1yVar2 = new g1y(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                        fetVar.o0(g1yVar2);
                        objP3 = g1yVar2;
                    }
                    oja0.D(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
