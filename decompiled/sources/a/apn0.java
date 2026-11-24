package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class apn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1261a = 0;
    public final /* synthetic */ wxn0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ apn0(wxn0 wxn0Var, Function1 function1) {
        this.b = wxn0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1261a;
        Function1 function1 = this.c;
        wxn0 wxn0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    ee eeVar = wxn0Var.j;
                    ksn0 ksn0Var = wxn0Var.m;
                    sd sdVar = new sd(ksn0Var.b, ksn0Var.c, wxn0Var.l);
                    rd rdVar = wxn0Var.k;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new opm0(function1, (byte) 18);
                        fetVar.o0(objP);
                    }
                    jcb.f(mm40VarN, eeVar, sdVar, false, rdVar, (Function0) objP, fetVar, 3072, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ihm0.a(wxn0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ apn0(wxn0 wxn0Var, Function1 function1, int i) {
        this.b = wxn0Var;
        this.c = function1;
    }
}
