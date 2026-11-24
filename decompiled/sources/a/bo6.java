package a;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bo6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2916a;
    public final /* synthetic */ fo6 b;

    public /* synthetic */ bo6(fo6 fo6Var, byte b) {
        this.f2916a = b;
        this.b = fo6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2916a;
        yje yjeVar = null;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kj5 kj5Var = fo6.W1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    float f = qmk.a(fetVar).c;
                    if (fo6Var.P1 == null) {
                        Intrinsics.h("relatedGamesListFactory");
                        throw null;
                    }
                    mm40 mm40VarL = s5x0.L(o7k0.c, f, 0.0f, 2);
                    xuz xuzVar = pb10.c;
                    cge0.b(mm40VarL, fo6Var, new RelatedParams(false, -1L, -1L, -1L, -1L, tef0.c), fetVar);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                Bundle bundle = (Bundle) obj2;
                kj5 kj5Var2 = fo6.W1;
                if (!h97.B(bundle, (String) obj, "REQUEST_TEAM_ACTION_KEY")) {
                    return Unit.f46060a;
                }
                if (bundle.containsKey("RESULT_ON_ITEM_ACTION_LISTENER_KEY")) {
                    Serializable serializable = bundle.getSerializable("RESULT_ON_ITEM_ACTION_LISTENER_KEY");
                    serializable.getClass();
                    po6 po6VarH0 = fo6Var.H0();
                    sac.V(jiu0.a(po6VarH0), new yj5(1, po6VarH0, po6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 17), null, null, new cm3(po6VarH0, (ojp0) serializable, yjeVar, (byte) 27), 14);
                }
                return Unit.f46060a;
            default:
                long jLongValue = ((Long) obj).longValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                kj5 kj5Var3 = fo6.W1;
                po6 po6VarH1 = fo6Var.H0();
                sac.V(jiu0.a(po6VarH1), new yj5(1, po6VarH1, po6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 14), null, po6VarH1.D.b, new zg1(po6VarH1, jLongValue, iIntValue2, null), 10);
                return Unit.f46060a;
        }
    }
}
