package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cgc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4305a;
    public final /* synthetic */ igc0 b;

    public /* synthetic */ cgc0(igc0 igc0Var, byte b) {
        this.f4305a = b;
        this.b = igc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4305a;
        igc0 igc0Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fl70 fl70Var = igc0.V1;
                igc0Var.H0(x8x.L(1), (fet) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fl70 fl70Var2 = igc0.V1;
                igc0Var.G0(x8x.L(1), (fet) obj);
                break;
            case 2:
                igc0 igc0Var2 = this.b;
                a8z a8zVar = igc0Var2.S1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                fl70 fl70Var3 = igc0.V1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP);
                    }
                    vne vneVar = (vne) objP;
                    boolean zI = fetVar.i(igc0Var2);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        l8c0 l8c0Var = new l8c0(1, igc0Var2, igc0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promo/impl/promocodes/presentation/models/PromoCodesScreenSideEffect;)V", 0, (byte) 18);
                        fetVar.o0(l8c0Var);
                        objP2 = l8c0Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP2);
                    Unit unit = Unit.f46060a;
                    boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new ggc0(vneVar, k3t0Var, function1, (byte) 2);
                        fetVar.o0(objP3);
                    }
                    m0x0.o(unit, (Function1) objP3, fetVar);
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI3 = fetVar.i(k3t0Var2);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        l8c0 l8c0Var2 = new l8c0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar.o0(l8c0Var2);
                        objP4 = l8c0Var2;
                    }
                    epv0.B(pz40VarY, (Function1) ((jhy) objP4), u1c.M(133873568, new cgc0(igc0Var2, (byte) 3), fetVar), u1c.M(-293396161, new cgc0(igc0Var2, (byte) 4), fetVar), fetVar, 3456);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                fl70 fl70Var4 = igc0.V1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    igc0Var.H0(0, fetVar2);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                fl70 fl70Var5 = igc0.V1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    igc0Var.G0(0, fetVar3);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cgc0(igc0 igc0Var, int i, byte b) {
        this.f4305a = b;
        this.b = igc0Var;
    }
}
