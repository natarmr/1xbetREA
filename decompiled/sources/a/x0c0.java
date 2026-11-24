package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x0c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40064a;
    public final /* synthetic */ a1c0 b;

    public /* synthetic */ x0c0(a1c0 a1c0Var, byte b) {
        this.f40064a = b;
        this.b = a1c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40064a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                rl70 rl70Var = a1c0.O1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a1c0 a1c0Var = this.b;
                    k3t0 k3t0VarH0 = a1c0Var.H0();
                    boolean zI = fetVar.i(a1c0Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        e9b0 e9b0Var = new e9b0(1, a1c0Var, a1c0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjSideEffect;)V", 0, (byte) 21);
                        fetVar.o0(e9b0Var);
                        objP = e9b0Var;
                    }
                    clz clzVar = (clz) fetVar.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        kc70 kc70Var = new kc70(k3t0VarH0, clzVar, pz40VarF, null, (byte) 6);
                        fetVar.o0(kc70Var);
                        objP2 = kc70Var;
                    }
                    m0x0.t(fetVar, clzVar, (Function2) objP2);
                    pz40 pz40VarY = ((i3t0) a1c0Var.H0()).y(fetVar);
                    k3t0 k3t0VarH1 = a1c0Var.H0();
                    boolean zI3 = fetVar.i(k3t0VarH1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        e9b0 e9b0Var2 = new e9b0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar.o0(e9b0Var2);
                        objP3 = e9b0Var2;
                    }
                    e1c0.e(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                rl70 rl70Var2 = a1c0.O1;
                this.b.H0().x(new s0c0(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                break;
        }
        return Unit.f46060a;
    }
}
