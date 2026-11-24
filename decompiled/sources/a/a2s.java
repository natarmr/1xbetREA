package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a2s implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f139a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ j2s c;

    public /* synthetic */ a2s(l7m0 l7m0Var, j2s j2sVar, byte b) {
        this.f139a = b;
        this.b = l7m0Var;
        this.c = j2sVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f139a;
        cl5 cl5Var = ukd.f35823a;
        j2s j2sVar = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xak xakVar = j2s.b2;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    k3t0 k3t0VarJ0 = j2sVar.J0();
                    boolean zI = fetVar.i(k3t0VarJ0);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        h2s h2sVar = new h2s(1, k3t0VarJ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar.o0(h2sVar);
                        objP = h2sVar;
                    }
                    Function1 function1 = (Function1) ((jhy) objP);
                    l7m0Var.getClass();
                    function1.getClass();
                    String str = (String) ((b3s) l7m0Var.getValue()).e.getValue();
                    if (str == null) {
                        str = "";
                    }
                    pz40 pz40VarF = androidx.compose.runtime.e.f(str, fetVar);
                    boolean zG = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new o0q0(function1, (byte) 16);
                        fetVar.o0(objP2);
                    }
                    wvb.z(mm40Var, pz40VarF, (Function0) objP2, u1c.M(359912101, new itz(l7m0Var, function1, (byte) 6), fetVar), u1c.M(1409781316, new itz(l7m0Var, function1, (byte) 10), fetVar), fetVar, (iIntValue & 14) | 27648);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xak xakVar2 = j2s.b2;
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                }
                if (!fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    fetVar2.X();
                } else if (((n930) l7m0Var.getValue()).j) {
                    fetVar2.e0(255484144);
                    mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), 4.0f, 0.0f, 2);
                    dxh0 dxh0Var = ((n930) l7m0Var.getValue()).h;
                    a4x a4xVar = ((n930) l7m0Var.getValue()).i;
                    boolean zG2 = fetVar2.g(l7m0Var);
                    Object objP3 = fetVar2.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new zwp(l7m0Var, (byte) 20);
                        fetVar2.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG3 = fetVar2.g(l7m0Var) | fetVar2.i(j2sVar);
                    Object objP4 = fetVar2.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new f5p(l7m0Var, j2sVar, (byte) 28);
                        fetVar2.o0(objP4);
                    }
                    ibc.n(mm40VarL, a4xVar, fxh0.f10310a, dxh0Var, false, function0, (Function1) objP4, fetVar2, 384, 16);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(257085263);
                    fetVar2.r(false);
                }
                break;
            default:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xak xakVar3 = j2s.b2;
                mm40Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    d0k0 d0k0Var = (d0k0) l7m0Var.getValue();
                    boolean zI2 = fetVar3.i(j2sVar);
                    Object objP5 = fetVar3.P();
                    if (zI2 || objP5 == cl5Var) {
                        objP5 = new g2s(j2sVar, (byte) 0);
                        fetVar3.o0(objP5);
                    }
                    bww.u(mm40Var3, d0k0Var, (Function1) objP5, fetVar3, iIntValue3 & 14);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
