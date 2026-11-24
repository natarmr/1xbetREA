package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43106a;
    public final /* synthetic */ as6 b;

    public /* synthetic */ yr6(as6 as6Var, byte b) {
        this.f43106a = b;
        this.b = as6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43106a;
        as6 as6Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                as6Var.s.b(th, new xr6(as6Var, (byte) 1));
                break;
            default:
                th.getClass();
                as6Var.s.b(th, new xr6(as6Var, (byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
