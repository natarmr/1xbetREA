package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kyl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19111a;
    public final /* synthetic */ syl0 b;

    public /* synthetic */ kyl0(syl0 syl0Var, byte b) {
        this.f19111a = b;
        this.b = syl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19111a;
        syl0 syl0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                eke0 eke0Var = syl0.f2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) syl0Var.H0()).y(fetVar);
                    k3t0 k3t0VarH0 = syl0Var.H0();
                    boolean zI = fetVar.i(k3t0VarH0);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        kcl0 kcl0Var = new kcl0(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar.o0(kcl0Var);
                        objP = kcl0Var;
                    }
                    l8x.M(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                eke0 eke0Var2 = syl0.f2;
                syl0Var.H0().x(new ozl0(iIntValue2, iIntValue3));
                break;
            case 2:
                clz clzVar = (clz) obj;
                eke0 eke0Var3 = syl0.f2;
                clzVar.getClass();
                ((blz) obj2).getClass();
                syl0Var.n0().k().a(clzVar, syl0Var.d2);
                break;
            case 3:
                eke0 eke0Var4 = syl0.f2;
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                syl0Var.d2.e();
                break;
            default:
                mk50 mk50Var = (mk50) obj;
                String str = (String) obj2;
                eke0 eke0Var5 = syl0.f2;
                mk50Var.getClass();
                str.getClass();
                syl0Var.H0().x(new szl0(mk50Var, str));
                break;
        }
        return Unit.f46060a;
    }
}
