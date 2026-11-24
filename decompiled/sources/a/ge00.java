package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ge00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11127a;
    public final /* synthetic */ ef00 b;

    public /* synthetic */ ge00(ef00 ef00Var, byte b) {
        this.f11127a = b;
        this.b = ef00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11127a;
        ef00 ef00Var = this.b;
        switch (b) {
            case 0:
                ef00Var.x0.f(ie00.f14609a);
                break;
            case 1:
                ef00 ef00Var2 = this.b;
                sac.V(jiu0.a(ef00Var2), new svz(1, ef00Var2, ef00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, ef00Var2.N.f22085a, new slx(ef00Var2, null, (byte) 16), 10);
                break;
            default:
                ef00Var.Q.d(new ee00(ef00Var, (byte) 4));
                break;
        }
        return Unit.f46060a;
    }
}
