package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sk40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32330a;
    public final /* synthetic */ wk40 b;

    public /* synthetic */ sk40(wk40 wk40Var, byte b) {
        this.f32330a = b;
        this.b = wk40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f32330a;
        wk40 wk40Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = wk40Var.w;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wk40Var.w((da10) wk40Var.z.getValue())));
                wk40Var.c.a(th);
                break;
            default:
                wk40Var.x.f(new tk40(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
