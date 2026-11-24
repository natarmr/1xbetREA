package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l2d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19302a = 1;
    public final /* synthetic */ nyq0 b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ l2d(ugd ugdVar, nyq0 nyq0Var) {
        this.c = ugdVar;
        this.b = nyq0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19302a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        ugd ugdVar = this.c;
        nyq0 nyq0Var = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = jgk0.b(new h8a(nyq0Var, (byte) 20));
                        fetVar.o0(objP);
                    }
                    l7m0 l7m0Var = (l7m0) objP;
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new x1d(l7m0Var, (byte) 3);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP2);
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new x1d(l7m0Var, (byte) 4);
                        fetVar.o0(objP3);
                    }
                    ugdVar.F(kbc.O(mm40VarT, new nc40((Function1) objP3, (byte) 10)), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarG = o7k0.g(lgb.K(jm40Var), 0.0f, 56.0f, 1);
                    boolean zG = fetVar.g(nyq0Var);
                    Object objP4 = fetVar.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new k2d(nyq0Var);
                        fetVar.o0(objP4);
                    }
                    qzb.L((k2d) objP4, mm40VarG, ugdVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l2d(nyq0 nyq0Var, ugd ugdVar) {
        this.b = nyq0Var;
        this.c = ugdVar;
    }
}
