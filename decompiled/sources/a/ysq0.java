package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ysq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43183a;
    public final /* synthetic */ xtq0 b;

    public /* synthetic */ ysq0(xtq0 xtq0Var, byte b) {
        this.f43183a = b;
        this.b = xtq0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43183a;
        xtq0 xtq0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                xtq0Var.C0.f(new ftq0(pek0.f26859a, str));
                break;
            default:
                th.getClass();
                str.getClass();
                xtq0Var.C0.f(new ftq0(rek0.b, str));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
