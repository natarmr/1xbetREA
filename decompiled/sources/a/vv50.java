package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vv50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38083a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ w2d c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ vv50(w2d w2dVar, Function1 function1, l7m0 l7m0Var) {
        this.c = w2dVar;
        this.d = function1;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38083a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dw50 dw50Var = (dw50) l7m0Var.getValue();
                    Function1 function1 = this.d;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new w250(function1, (byte) 29);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new xv50(function1, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    gq80.h(dw50Var, this.c, function0, (Function0) objP2, fetVar, 64);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q0x.v(null, ((jrc0) l7m0Var.getValue()).a(), !(l7m0Var.getValue() instanceof hrc0), this.c, this.d, fetVar2, 4096);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vv50(l7m0 l7m0Var, w2d w2dVar, Function1 function1) {
        this.b = l7m0Var;
        this.c = w2dVar;
        this.d = function1;
    }
}
