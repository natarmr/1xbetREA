package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kyj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19107a;
    public final /* synthetic */ oyj0 b;

    public /* synthetic */ kyj0(oyj0 oyj0Var, byte b) {
        this.f19107a = b;
        this.b = oyj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19107a;
        yje yjeVar = null;
        oyj0 oyj0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = oyj0.U1;
                wyj0 wyj0VarH0 = oyj0Var.H0();
                sac.V(jiu0.a(wyj0VarH0), new pyj0(wyj0VarH0, (byte) 1), null, wyj0VarH0.k.b, new z8t(wyj0VarH0, yjeVar, (byte) 7), 10);
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = oyj0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                gle0 gle0Var2 = oyj0.U1;
                wyj0 wyj0VarH1 = oyj0Var.H0();
                wyj0VarH1.z.f(k7k.NoMoneyToto);
                l7k l7kVar = wyj0VarH1.A;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("no_money_toto", wyj0VarH1.B.g());
                sac.V(jiu0.a(wyj0VarH1), new pyj0(wyj0VarH1, (byte) 0), null, null, new myj0(wyj0VarH1, null), 14);
                return Unit.f46060a;
            default:
                gle0 gle0Var3 = oyj0.U1;
                oyj0Var.G0().e.setMakeBetButtonEnabled(true);
                return Unit.f46060a;
        }
    }
}
