package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ao6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1186a;
    public final /* synthetic */ fo6 b;

    public /* synthetic */ ao6(fo6 fo6Var, byte b) {
        this.f1186a = b;
        this.b = fo6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1186a;
        yje yjeVar = null;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                kj5 kj5Var = fo6.W1;
                ((View) obj).getClass();
                po6 po6VarH0 = fo6Var.H0();
                if (!po6VarH0.u.j()) {
                    sac.V(jiu0.a(po6VarH0), new yj5(1, po6VarH0, po6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 16), null, null, new lo6(po6VarH0, yjeVar, (byte) 2), 14);
                }
                break;
            default:
                BetZip betZip = (BetZip) obj;
                kj5 kj5Var2 = fo6.W1;
                betZip.getClass();
                po6 po6VarH1 = fo6Var.H0();
                jg7 jg7VarF0 = x8f.f0(betZip);
                sac.V(jiu0.a(po6VarH1), new os5(po6VarH1, (byte) 9), new ho6(po6VarH1, jg7VarF0, (byte) 0), po6VarH1.D.b, new xw5(po6VarH1, jg7VarF0, yjeVar, (byte) 11), 8);
                break;
        }
        return Unit.f46060a;
    }
}
