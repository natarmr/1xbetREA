package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20615a;
    public final /* synthetic */ st6 b;

    public /* synthetic */ lt6(st6 st6Var, byte b) {
        this.f20615a = b;
        this.b = st6Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055 A[PHI: r10
  0x0055: PHI (r10v7 double) = (r10v5 double), (r10v6 double) binds: [B:11:0x0053, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r6
  0x00a6: PHI (r6v5 double) = (r6v2 double), (r6v7 double) binds: [B:33:0x00ac, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        StepInputConfigModel stepInputConfigModel;
        double d;
        double d2;
        Object value2;
        StepInputConfigModel stepInputConfigModel2;
        double d3;
        byte b = this.f20615a;
        byte b2 = 23;
        byte b3 = 13;
        byte b4 = 2;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        yje yjeVar = null;
        st6 st6Var = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = st6.R1;
                rg20 rg20VarH0 = st6Var.H0();
                sac.V(jiu0.a(rg20VarH0), new hd20(rg20VarH0, b4), null, rg20VarH0.o.b, new fj3((diu0) rg20VarH0, true, yjeVar, b3), 10);
                return Unit.f46060a;
            case 1:
                yk5 yk5Var2 = st6.R1;
                rg20 rg20VarH1 = st6Var.H0();
                rg20VarH1.v.f(k7k.BetConstructor);
                l7k l7kVar = rg20VarH1.w;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("bet_constructor", rg20VarH1.E.g());
                sac.V(jiu0.a(rg20VarH1), new hd20(rg20VarH1, objArr == true ? 1 : 0), null, rg20VarH1.o.f22085a, new v620(rg20VarH1, yjeVar, b2), 10);
                return Unit.f46060a;
            case 2:
                yki ykiVar = st6Var.K1;
                if (ykiVar != null) {
                    return ykiVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                yk5 yk5Var3 = st6.R1;
                rg20 rg20VarH2 = st6Var.H0();
                rg20VarH2.v.f(k7k.NoMoneyBetConstructor);
                l7k l7kVar2 = rg20VarH2.w;
                y1p y1pVar2 = y1p.MAIN;
                l7kVar2.b("no_money_bet_constructor", rg20VarH2.E.g());
                sac.V(jiu0.a(rg20VarH2), new hd20(rg20VarH2, objArr2 == true ? 1 : 0), null, rg20VarH2.o.f22085a, new v620(rg20VarH2, yjeVar, b2), 10);
                return Unit.f46060a;
            case 4:
                yk5 yk5Var4 = st6.R1;
                p7m0 p7m0Var = st6Var.H0().O;
                do {
                    value = p7m0Var.getValue();
                    stepInputConfigModel = (StepInputConfigModel) value;
                    double d4 = stepInputConfigModel.f46382a;
                    double d5 = stepInputConfigModel.e;
                    double d6 = stepInputConfigModel.c;
                    if (d4 == -1.0d) {
                        boolean z2 = stepInputConfigModel.i;
                        d2 = stepInputConfigModel.b;
                        if (!z2) {
                            d = d2 + d6;
                            if (d <= d5) {
                                d5 = d;
                            }
                            d2 = d5;
                        }
                    } else {
                        d = d4 + d6;
                        if (d <= d5) {
                            d5 = d;
                        }
                        d2 = d5;
                    }
                } while (!p7m0Var.m(value, StepInputConfigModel.a(stepInputConfigModel, d2, 0.0d, 0.0d, 0.0d, 0.0d, 0L, null, false, false, false, 4094)));
                return Unit.f46060a;
            case 5:
                yk5 yk5Var5 = st6.R1;
                p7m0 p7m0Var2 = st6Var.H0().O;
                do {
                    value2 = p7m0Var2.getValue();
                    stepInputConfigModel2 = (StepInputConfigModel) value2;
                    double d7 = stepInputConfigModel2.f46382a;
                    if (d7 == -1.0d) {
                        d3 = stepInputConfigModel2.b;
                    } else {
                        double d8 = d7 - stepInputConfigModel2.c;
                        double d9 = stepInputConfigModel2.d;
                        if (d8 < d9) {
                            d3 = d9;
                        } else {
                            d9 = stepInputConfigModel2.e;
                            if (d7 > d9) {
                                d3 = d9;
                            } else {
                                d3 = d8;
                            }
                        }
                    }
                } while (!p7m0Var2.m(value2, StepInputConfigModel.a(stepInputConfigModel2, d3, 0.0d, 0.0d, 0.0d, 0.0d, 0L, null, false, false, false, 4094)));
                return Unit.f46060a;
            default:
                yk5 yk5Var6 = st6.R1;
                rg20 rg20VarH3 = st6Var.H0();
                sac.V(jiu0.a(rg20VarH3), new hd20(rg20VarH3, b4), null, rg20VarH3.o.b, new fj3(rg20VarH3, z, yjeVar, b3), 10);
                return Unit.f46060a;
        }
    }
}
