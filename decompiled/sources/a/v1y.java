package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v1y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36656a;
    public final /* synthetic */ a2y b;

    public /* synthetic */ v1y(a2y a2yVar, byte b) {
        this.f36656a = b;
        this.b = a2yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36656a;
        a2y a2yVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                a2yVar.G(new p1y(str, true));
                break;
            case 1:
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.q) {
                    a2yVar.G(new n1y(str));
                } else {
                    a2yVar.G(new p1y(str, false));
                }
                break;
            default:
                p1y p1yVar = new p1y(str, true);
                int i = a2y.G;
                a2yVar.G(p1yVar);
                break;
        }
        return Unit.f46060a;
    }
}
