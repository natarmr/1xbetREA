package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37845a;
    public final /* synthetic */ wq9 b;

    public /* synthetic */ vq9(wq9 wq9Var, byte b) {
        this.f37845a = b;
        this.b = wq9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37845a) {
            case 0:
                gl5 gl5Var = wq9.S1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                this.b.G0().x(mq9.f22212a);
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                gl5 gl5Var2 = wq9.S1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wq9 wq9Var = this.b;
                    boolean zI = fetVar.i(wq9Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new uq9(wq9Var, (byte) 1);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(wq9Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new uq9(wq9Var, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
                    pz40 pz40VarY = ((i3t0) wq9Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = wq9Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG0);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        li8 li8Var = new li8(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar.o0(li8Var);
                        objP3 = li8Var;
                    }
                    cwr0.k(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                    k3t0 k3t0VarG1 = wq9Var.G0();
                    boolean zI4 = fetVar.i(wq9Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        li8 li8Var2 = new li8(1, wq9Var, wq9.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/callback/impl/presentation/history_compose/actions/CallbackHistorySideEffect;)V", 0, (byte) 19);
                        fetVar.o0(li8Var2);
                        objP4 = li8Var2;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar);
                    boolean zI5 = fetVar.i(k3t0VarG1) | fetVar.i(wq9Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        ua7 ua7Var = new ua7(k3t0VarG1, wq9Var, pz40VarF, null, (byte) 11);
                        fetVar.o0(ua7Var);
                        objP5 = ua7Var;
                    }
                    m0x0.t(fetVar, wq9Var, (Function2) objP5);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
