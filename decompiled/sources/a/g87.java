package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10851a;
    public final /* synthetic */ f97 b;

    public /* synthetic */ g87(f97 f97Var, byte b) {
        this.f10851a = b;
        this.b = f97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10851a;
        f97 f97Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                f97Var.G(new e77(str));
                break;
            case 1:
                th.getClass();
                str.getClass();
                f97Var.G(b77.f2090a);
                break;
            case 2:
                th.getClass();
                str.getClass();
                if (th instanceof zhi0) {
                    f97Var.G(new g77(str));
                }
                break;
            case 3:
                th.getClass();
                str.getClass();
                f97Var.G(new e77(str));
                break;
            case 4:
                th.getClass();
                str.getClass();
                f97Var.G(new e77(str));
                break;
            case 5:
                th.getClass();
                str.getClass();
                f97Var.G(new g77(str));
                break;
            default:
                str.getClass();
                e77 e77Var = new e77(str);
                int i = f97.R0;
                f97Var.G(e77Var);
                break;
        }
        return Unit.f46060a;
    }
}
