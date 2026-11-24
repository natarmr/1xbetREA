package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xr6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41355a;
    public final /* synthetic */ as6 b;

    public /* synthetic */ xr6(as6 as6Var, byte b) {
        this.f41355a = b;
        this.b = as6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41355a;
        as6 as6Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                as6Var.F.f(new wct(str));
                break;
            default:
                th.getClass();
                str.getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var = as6Var.D;
                    beu beuVar = new beu(as6Var.z());
                    p7m0Var.getClass();
                    p7m0Var.o(null, beuVar);
                } else {
                    as6Var.D();
                }
                break;
        }
        return Unit.f46060a;
    }
}
