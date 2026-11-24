package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0n0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15690a;
    public final /* synthetic */ l0n0 b;

    public /* synthetic */ j0n0(l0n0 l0n0Var, byte b) {
        this.f15690a = b;
        this.b = l0n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15690a;
        l0n0 l0n0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = l0n0.P1;
                l0n0Var.G0().x(new b0n0(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s2m0 s2m0Var2 = l0n0.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) l0n0Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = l0n0Var.G0();
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP);
                    }
                    vne vneVar = (vne) objP;
                    boolean zI = fetVar.i(l0n0Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new j1l0(l0n0Var, (byte) 20);
                        fetVar.o0(objP2);
                    }
                    Function1 function1 = (Function1) objP2;
                    Unit unit = Unit.f46060a;
                    boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarG0) | fetVar.g(function1) | fetVar.g(null);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new ggc0(vneVar, k3t0VarG0, function1, (byte) 11);
                        fetVar.o0(objP3);
                    }
                    m0x0.o(unit, (Function1) objP3, fetVar);
                    boolean zI3 = fetVar.i(l0n0Var);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new i0n0(l0n0Var, (byte) 1);
                        fetVar.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zI4 = fetVar.i(l0n0Var);
                    Object objP5 = fetVar.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new i0n0(l0n0Var, (byte) 2);
                        fetVar.o0(objP5);
                    }
                    v3c.z(function0, (Function0) objP5, null, fetVar, 0, 4);
                    u2n0 u2n0Var = (u2n0) pz40VarY.getValue();
                    k3t0 k3t0VarG1 = l0n0Var.G0();
                    boolean zI5 = fetVar.i(k3t0VarG1);
                    Object objP6 = fetVar.P();
                    if (zI5 || objP6 == cl5Var) {
                        kcl0 kcl0Var = new kcl0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar.o0(kcl0Var);
                        objP6 = kcl0Var;
                    }
                    unh0.c0(null, u2n0Var, (Function1) ((jhy) objP6), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
