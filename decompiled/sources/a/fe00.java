package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fe00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9380a;
    public final /* synthetic */ ef00 b;

    public /* synthetic */ fe00(ef00 ef00Var, byte b) {
        this.f9380a = b;
        this.b = ef00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9380a;
        ef00 ef00Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                ef00Var.x0.f(new le00(str));
                break;
            default:
                th.getClass();
                str.getClass();
                ef00Var.x0.f(new me00(str));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
