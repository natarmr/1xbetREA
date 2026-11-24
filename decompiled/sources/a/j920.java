package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j920 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16116a;
    public final /* synthetic */ y920 b;

    public /* synthetic */ j920(y920 y920Var, byte b) {
        this.f16116a = b;
        this.b = y920Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16116a;
        y920 y920Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = y920Var.l;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                b1j.z(str, th);
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.BetExistsError) {
                    k920 k920Var = new k920(str);
                    p7m0Var.getClass();
                    p7m0Var.o(null, k920Var);
                } else {
                    n920 n920Var = new n920(str);
                    p7m0Var.getClass();
                    p7m0Var.o(null, n920Var);
                }
                break;
            case 1:
                String str2 = (String) obj2;
                b1j.z(str2, (Throwable) obj);
                p7m0 p7m0Var2 = y920Var.l;
                n920 n920Var2 = new n920(str2);
                p7m0Var2.getClass();
                p7m0Var2.o(null, n920Var2);
                break;
            default:
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var3 = y920Var.l;
                n920 n920Var3 = new n920((String) obj2);
                p7m0Var3.getClass();
                p7m0Var3.o(null, n920Var3);
                break;
        }
        return Unit.f46060a;
    }
}
