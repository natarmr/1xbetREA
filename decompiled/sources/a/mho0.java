package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mho0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21805a;
    public final /* synthetic */ rio0 b;

    public /* synthetic */ mho0(rio0 rio0Var, byte b) {
        this.f21805a = b;
        this.b = rio0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21805a;
        rio0 rio0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                rio0Var.M0.f(new uho0(pek0.f26859a, str));
                break;
            default:
                th.getClass();
                str.getClass();
                rio0Var.M0.f(new uho0(rek0.b, str));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
