package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a6y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f340a;
    public final /* synthetic */ e6y b;

    public /* synthetic */ a6y(e6y e6yVar, byte b) {
        this.f340a = b;
        this.b = e6yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f340a;
        e6y e6yVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.q) {
                    e6yVar.G(new s5y(str));
                } else {
                    e6yVar.G(new u5y(str, false));
                }
                break;
            case 1:
                th.getClass();
                str.getClass();
                e6yVar.G(new u5y(str, true));
                break;
            default:
                u5y u5yVar = new u5y(str, true);
                int i = e6y.G;
                e6yVar.G(u5yVar);
                break;
        }
        return Unit.f46060a;
    }
}
