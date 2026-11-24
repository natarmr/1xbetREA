package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a4y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f244a;
    public final /* synthetic */ d4y b;

    public /* synthetic */ a4y(d4y d4yVar, byte b) {
        this.f244a = b;
        this.b = d4yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f244a;
        d4y d4yVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.q) {
                    d4yVar.G(new s3y(str));
                } else {
                    d4yVar.G(new u3y(str, false));
                }
                return Unit.f46060a;
            case 1:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a || ((x3y) d4yVar.D()).b.f34176a == 0);
            case 2:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                d4yVar.G(new u3y(str2, true));
                return Unit.f46060a;
            default:
                u3y u3yVar = new u3y((String) obj2, true);
                int i = d4y.F;
                d4yVar.G(u3yVar);
                return Unit.f46060a;
        }
    }
}
