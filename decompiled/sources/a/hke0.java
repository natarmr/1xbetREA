package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hke0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13204a = 0;
    public final /* synthetic */ kke0 b;

    public /* synthetic */ hke0(kke0 kke0Var) {
        this.b = kke0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13204a;
        kke0 kke0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    Object objP = fetVar.P();
                    byte b2 = 27;
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new bod0((byte) 27);
                        fetVar.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zG = fetVar.g(kke0Var);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new v6d0(kke0Var, b2);
                        fetVar.o0(objP2);
                    }
                    dwi0.b(function1, n0qVar, (Function1) objP2, fetVar, 54, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rq8.j(kke0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hke0(kke0 kke0Var, int i) {
        this.b = kke0Var;
    }
}
