package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.aggregator.game.impl.game.navigation.AggregatorGameScreens$AggregatorPreloadGameScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cc1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4088a = 1;
    public final /* synthetic */ kc1 b;
    public final /* synthetic */ mlr c;

    public /* synthetic */ cc1(kc1 kc1Var, mlr mlrVar) {
        this.b = kc1Var;
        this.c = mlrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4088a;
        mlr mlrVar = this.c;
        kc1 kc1Var = this.b;
        switch (b) {
            case 0:
                ikt0 ikt0VarH = ((k0w0) obj).h(new AggregatorGameScreens$AggregatorPreloadGameScreen(mlrVar.f22006a, mlrVar.f, mlrVar.c, mlrVar.l, mlrVar.b, mlrVar.m, ((xb1) kc1Var.D()).f40578a.g, ((xb1) kc1Var.D()).f40578a.h, mlrVar.n, false, ((xb1) kc1Var.D()).f40578a.j, ((xb1) kc1Var.D()).f40578a.l, ((xb1) kc1Var.D()).k));
                cc1 cc1Var = new cc1(kc1Var, mlrVar);
                c8d c8dVar = (c8d) ikt0VarH.f14945a;
                x7d x7dVar = new x7d();
                cc1Var.invoke(x7dVar);
                c8dVar.f3908a = new v7d(x7dVar.f40408a, x7dVar.b, x7dVar.c);
                break;
            default:
                x7d x7dVar2 = (x7d) obj;
                boolean z = true;
                if (!((xb1) kc1Var.D()).f40578a.j && mlrVar.n) {
                    z = false;
                }
                x7dVar2.f40408a = z;
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cc1(mlr mlrVar, kc1 kc1Var) {
        this.c = mlrVar;
        this.b = kc1Var;
    }
}
