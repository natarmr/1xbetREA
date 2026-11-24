package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26159a;
    public final /* synthetic */ t0m0 b;

    public /* synthetic */ p0m0(t0m0 t0m0Var, byte b) {
        this.f26159a = b;
        this.b = t0m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26159a;
        t0m0 t0m0Var = this.b;
        switch (b) {
            case 0:
                clz clzVar = (clz) obj;
                gne0 gne0Var = t0m0.Z1;
                clzVar.getClass();
                ((blz) obj2).getClass();
                t0m0Var.n0().k().a(clzVar, t0m0Var.X1);
                break;
            case 1:
                gne0 gne0Var2 = t0m0.Z1;
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                t0m0Var.X1.e();
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                gne0 gne0Var3 = t0m0.Z1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) t0m0Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = t0m0Var.G0();
                    boolean zI = fetVar.i(k3t0VarG0);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        kcl0 kcl0Var = new kcl0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar.o0(kcl0Var);
                        objP = kcl0Var;
                    }
                    h8x.o(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
