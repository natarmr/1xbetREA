package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ym80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42876a;
    public final /* synthetic */ w6n b;
    public final /* synthetic */ j5a0 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ ym80(w6n w6nVar, j5a0 j5a0Var, Function2 function2, byte b) {
        this.f42876a = b;
        this.b = w6nVar;
        this.c = j5a0Var;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42876a;
        cl5 cl5Var = ukd.f35823a;
        Function2 function2 = this.d;
        j5a0 j5a0Var = this.c;
        w6n w6nVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a5a0 a5a0Var = (a5a0) j5a0Var;
                    mm40 mm40VarK0 = mrv.k0(gap.b(w6nVar, a5a0Var.d, (k6z) fetVar.k(gap.f10979a)), "FAVORITE_ICON");
                    if (function2 == null) {
                        fetVar.e0(-1449618480);
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new zc70((byte) 21);
                            fetVar.o0(objP);
                        }
                        function2 = (Function2) objP;
                    } else {
                        fetVar.e0(507426822);
                    }
                    fetVar.r(false);
                    xkb.t(mm40VarK0, a5a0Var, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a5a0 a5a0Var2 = (a5a0) j5a0Var;
                    mm40 mm40VarK1 = mrv.k0(gap.b(w6nVar, a5a0Var2.d, (k6z) fetVar.k(gap.f10979a)), "FAVORITE_ICON");
                    if (function2 == null) {
                        fetVar.e0(-1617603769);
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new zc70((byte) 20);
                            fetVar.o0(objP2);
                        }
                        function2 = (Function2) objP2;
                    } else {
                        fetVar.e0(1887481263);
                    }
                    fetVar.r(false);
                    xkb.t(mm40VarK1, a5a0Var2, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a5a0 a5a0Var3 = (a5a0) j5a0Var;
                    mm40 mm40VarK2 = mrv.k0(gap.b(w6nVar, a5a0Var3.d, (k6z) fetVar.k(gap.f10979a)), "FAVORITE_ICON");
                    if (function2 == null) {
                        fetVar.e0(-1482586445);
                        Object objP3 = fetVar.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ogj0((byte) 26);
                            fetVar.o0(objP3);
                        }
                        function2 = (Function2) objP3;
                    } else {
                        fetVar.e0(229268675);
                    }
                    fetVar.r(false);
                    xkb.t(mm40VarK2, a5a0Var3, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
