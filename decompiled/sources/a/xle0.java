package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xle0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41069a = 0;
    public final /* synthetic */ ame0 b;

    public /* synthetic */ xle0(ame0 ame0Var) {
        this.b = ame0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41069a;
        ame0 ame0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new bod0((byte) 28);
                        fetVar.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI = fetVar.i(ame0Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new v6d0(ame0Var, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    dwi0.b(function1, null, (Function1) objP2, fetVar, 6, 2);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                uc9.i(ame0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xle0(ame0 ame0Var, int i) {
        this.b = ame0Var;
    }
}
