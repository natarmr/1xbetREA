package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class an80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1138a;
    public final /* synthetic */ g5a0 b;
    public final /* synthetic */ w6n c;

    public /* synthetic */ an80(g5a0 g5a0Var, w6n w6nVar, byte b) {
        this.f1138a = b;
        this.b = g5a0Var;
        this.c = w6nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1138a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        w6n w6nVar = this.c;
        g5a0 g5a0Var = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u6n u6nVarM = z1x.M(g5a0Var.f10709a, w6nVar, fetVar);
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "LOGO");
                    boolean zG = fetVar.g(u6nVarM);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new m2m(u6nVarM, (byte) 1);
                        fetVar.o0(objP);
                    }
                    kkb.p(0, fetVar, mm40VarK0, (Function0) objP);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u6n u6nVarM2 = z1x.M(g5a0Var.f10709a, w6nVar, fetVar);
                    mm40 mm40VarK1 = mrv.k0(jm40Var, "LOGO");
                    boolean zG2 = fetVar.g(u6nVarM2);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new m2m(u6nVarM2, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    kkb.p(0, fetVar, mm40VarK1, (Function0) objP2);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u6n u6nVarM3 = z1x.M(g5a0Var.f10709a, w6nVar, fetVar);
                    mm40 mm40VarK2 = mrv.k0(jm40Var, "LOGO");
                    boolean zG3 = fetVar.g(u6nVarM3);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new m2m(u6nVarM3, (byte) 1);
                        fetVar.o0(objP3);
                    }
                    kkb.p(0, fetVar, mm40VarK2, (Function0) objP3);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
