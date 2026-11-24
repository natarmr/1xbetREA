package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ms6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22303a;
    public final /* synthetic */ dt6 b;

    public /* synthetic */ ms6(dt6 dt6Var, byte b) {
        this.f22303a = b;
        this.b = dt6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22303a;
        dt6 dt6Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                dt6Var.U.b(th, new gh5((byte) 28));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                dt6Var.U.b(th2, new ls6(dt6Var, (byte) 0));
                break;
            default:
                duj dujVar = dt6Var.U;
                Throwable th3 = (Throwable) obj;
                bby bbyVar = dt6Var.d0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                dujVar.b(th3, new ls6(dt6Var, (byte) 4));
                dujVar.b(th3, new ls6(dt6Var, (byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
