package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uqv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36136a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uqv0(ywv0 ywv0Var, int i) {
        this.f36136a = (byte) 2;
        this.b = ywv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object tmj0Var;
        tyv0 tyv0Var;
        byte b = this.f36136a;
        byte b2 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new ikx(((long) ((yx7) obj3).a(0, (int) (((qkx) obj).f28908a & 4294967295L))) & 4294967295L);
            case 1:
                return new ikx(((u12) obj3).a(0L, ((qkx) obj).f28908a, (k6z) obj2));
            case 2:
                ((Integer) obj2).getClass();
                luv0.a(jm40.b, (ywv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                u4s u4sVar = (u4s) obj;
                sxs0 sxs0Var = cyv0.O1;
                u4sVar.getClass();
                fho0 fho0Var = (fho0) ((cyv0) obj3).M1.getValue();
                sac.V(jiu0.a(fho0Var), new tfo0(1, fho0Var, fho0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, fho0Var.x.f22085a, new ze1((Object) u4sVar, (Object) fho0Var, obj2, (yje) null, (byte) 13), 10);
                return Unit.f46060a;
            case 4:
                tyv0 tyv0Var2 = (tyv0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                uxs0 uxs0Var = tyv0.O1;
                byte b3 = 2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hzv0 hzv0Var = (hzv0) ((i3t0) tyv0Var2.H0()).y(fetVar).getValue();
                    k3t0 k3t0VarH0 = tyv0Var2.H0();
                    boolean zI = fetVar.i(tyv0Var2);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new ryv0(tyv0Var2, b2);
                        fetVar.o0(objP);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                    boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(tyv0Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        tyv0Var = tyv0Var2;
                        tmj0Var = new tmj0(k3t0VarH0, tyv0Var, pz40VarF, null, (byte) 28);
                        fetVar.o0(tmj0Var);
                    } else {
                        tmj0Var = objP2;
                        tyv0Var = tyv0Var2;
                    }
                    m0x0.t(fetVar, tyv0Var, (Function2) tmj0Var);
                    k3t0 k3t0VarH1 = tyv0Var.H0();
                    boolean zI3 = fetVar.i(k3t0VarH1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        wzu0 wzu0Var = new wzu0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar.o0(wzu0Var);
                        objP3 = wzu0Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP3);
                    boolean zI4 = fetVar.i(tyv0Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new ryv0(tyv0Var, b3);
                        fetVar.o0(objP4);
                    }
                    xia0.Z(null, hzv0Var, function1, (Function1) objP4, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                u4s u4sVar2 = (u4s) obj;
                String str = (String) obj2;
                wxs0 wxs0Var = wzv0.O1;
                u4sVar2.getClass();
                rio0 rio0Var = (rio0) ((wzv0) obj3).M1.getValue();
                bby bbyVar = rio0Var.P0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    rio0Var.P0 = sac.V(jiu0.a(rio0Var), new tfo0(1, rio0Var, rio0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, rio0Var.y.f22085a, new ze1((Object) rio0Var, (Object) str, (Object) u4sVar2, (yje) null, (byte) 14), 10);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ uqv0(Object obj, byte b) {
        this.f36136a = b;
        this.b = obj;
    }
}
