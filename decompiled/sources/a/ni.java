package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ni implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23560a;
    public final /* synthetic */ pi b;

    public /* synthetic */ ni(pi piVar, byte b) {
        this.f23560a = b;
        this.b = piVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23560a;
        pi piVar = this.b;
        switch (b) {
            case 0:
                rek0 rek0Var = pi.l2;
                Application application = piVar.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                rek0 rek0Var2 = pi.l2;
                fiu0 fiu0Var = piVar.h2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                rek0 rek0Var3 = pi.l2;
                t0 t0Var = new t0(1, (wj) piVar.i2.getValue(), wj.class, "onActionClicked", "onActionClicked(Lorg/xplatform/sportgame/action_menu/impl/presentation/adapter/ActionUiModel;)V", 0, (byte) 12);
                uh uhVar = new uh(nk.f23658a);
                uhVar.d.b(new gbn(new hhd((byte) 21), new l9(3, (byte) 13), new t1(t0Var, (byte) 11), m9.o));
                return uhVar;
        }
    }
}
