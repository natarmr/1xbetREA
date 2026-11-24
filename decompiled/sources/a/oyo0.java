package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class oyo0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pyo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyo0(pyo0 pyo0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = pyo0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        pyo0 pyo0Var = this.k;
        switch (b) {
            case 0:
                return new oyo0(pyo0Var, yjeVar, (byte) 0);
            default:
                return new oyo0(pyo0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((oyo0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objV;
        byte b = this.i;
        pyo0 pyo0Var = this.k;
        switch (b) {
            case 0:
                TeamBetScreenParams teamBetScreenParams = pyo0Var.p;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hcp0 hcp0Var = pyo0Var.s;
                    long j = teamBetScreenParams.f46640a;
                    boolean z2 = ((kyo0) pyo0Var.D()).g;
                    long j2 = teamBetScreenParams.c;
                    long j3 = teamBetScreenParams.d;
                    this.j = true;
                    if (hcp0Var.p(j, z2, j2, j3, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    fck0 fck0Var = pyo0Var.r;
                    long j4 = pyo0Var.p.f46640a;
                    boolean z4 = ((kyo0) pyo0Var.D()).f;
                    this.j = true;
                    if (z4) {
                        objV = ((oif0) fck0Var.c).x(j4, true, this);
                        if (objV != wneVar2) {
                            objV = Unit.f46060a;
                        }
                    } else {
                        cu cuVar = (cu) fck0Var.b;
                        if (((m1e) cuVar.d).c()) {
                            yje yjeVar = null;
                            byte b2 = 1;
                            byte b3 = 0;
                            objV = ipm0.v(new au(cuVar, j4, yjeVar, (byte) 0), new au(cuVar, j4, yjeVar, b2), new bu(cuVar, yjeVar, b3), new zt(cuVar, j4, b3), new tr(cuVar, j4, yjeVar, b2), cu.class, this);
                            if (objV != wneVar2) {
                                objV = Unit.f46060a;
                            }
                        } else {
                            objV = Unit.f46060a;
                        }
                        if (objV != wneVar2) {
                            objV = Unit.f46060a;
                        }
                    }
                    if (objV == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
