package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.search.impl.presentation.xgames.models.XGamesSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ryv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31331a;
    public final /* synthetic */ tyv0 b;

    public /* synthetic */ ryv0(tyv0 tyv0Var, byte b) {
        this.f31331a = b;
        this.b = tyv0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31331a;
        tyv0 tyv0Var = this.b;
        switch (b) {
            case 0:
                dn60 dn60Var = (dn60) obj;
                uxs0 uxs0Var = tyv0.O1;
                dn60Var.getClass();
                tyv0Var.H0().x(new oyv0(dn60Var));
                return Unit.f46060a;
            case 1:
                azv0 azv0Var = (azv0) obj;
                uxs0 uxs0Var2 = tyv0.O1;
                azv0Var.getClass();
                if (azv0Var instanceof yyv0) {
                    afm0 afm0VarB = ((vzi) tyv0Var.K1.getValue()).f38301a.b();
                    x1x.x(afm0VarB);
                    afm0VarB.q(tyv0Var, ((yyv0) azv0Var).f43488a, new ryv0(tyv0Var, (byte) 3), new ryv0(tyv0Var, (byte) 4));
                } else if (azv0Var.equals(xyv0.f41725a)) {
                    View viewQ0 = tyv0Var.q0();
                    j120.X(viewQ0);
                    viewQ0.requestFocus();
                } else {
                    if (!azv0Var.equals(zyv0.f45224a)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.U(), tyv0Var, ((XGamesSearchFragmentSettings) tyv0Var.N1.n(tyv0Var, tyv0.P1[1])).b);
                }
                tyv0Var.H0().x(gyv0.f12151a);
                return Unit.f46060a;
            case 2:
                dn60 dn60Var2 = (dn60) obj;
                uxs0 uxs0Var3 = tyv0.O1;
                dn60Var2.getClass();
                tyv0Var.H0().x(new oyv0(dn60Var2));
                return Unit.f46060a;
            case 3:
                dn60 dn60Var3 = (dn60) obj;
                uxs0 uxs0Var4 = tyv0.O1;
                dn60Var3.getClass();
                tyv0Var.H0().x(new oyv0(dn60Var3));
                return Unit.f46060a;
            default:
                on60 on60Var = (on60) obj;
                uxs0 uxs0Var5 = tyv0.O1;
                on60Var.getClass();
                tyv0Var.H0().x(new iyv0(on60Var));
                return Unit.f46060a;
        }
    }
}
