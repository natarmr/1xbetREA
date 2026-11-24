package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z4y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43794a;
    public final /* synthetic */ c5y b;

    public /* synthetic */ z4y(c5y c5yVar, byte b) {
        this.f43794a = b;
        this.b = c5yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43794a;
        c5y c5yVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.q) {
                    c5yVar.G(new t4y(str));
                } else {
                    c5yVar.G(new v4y(str, false));
                }
                return Unit.f46060a;
            case 1:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a || ((zzx) c5yVar.D()).b.f35904a == 0);
            case 2:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                c5yVar.G(new v4y(str2, true));
                return Unit.f46060a;
            default:
                v4y v4yVar = new v4y((String) obj2, true);
                int i = c5y.F;
                c5yVar.G(v4yVar);
                return Unit.f46060a;
        }
    }
}
