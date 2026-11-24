package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hla0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13249a = 0;
    public final /* synthetic */ ola0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ hla0(ola0 ola0Var, Function1 function1) {
        this.b = ola0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13249a;
        Function1 function1 = this.c;
        ola0 ola0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (ola0Var.f) {
                    fetVar.e0(-2135831718);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    fyl fylVar = ola0Var.g;
                    vxl vxlVar = vxl.b;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new hs80(function1, (byte) 23);
                        fetVar.o0(objP);
                    }
                    ebc.r(mm40VarD, fylVar, vxlVar, (Function1) objP, null, fetVar, 390, 40);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-2135459811);
                    fetVar.r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                knx.q(ola0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hla0(ola0 ola0Var, Function1 function1, int i) {
        this.b = ola0Var;
        this.c = function1;
    }
}
