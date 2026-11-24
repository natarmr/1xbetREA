package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y4y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42025a;
    public final /* synthetic */ c5y b;

    public /* synthetic */ y4y(c5y c5yVar, byte b) {
        this.f42025a = b;
        this.b = c5yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42025a;
        c5y c5yVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                c5yVar.y.b(th, new z4y(c5yVar, (byte) 0));
                break;
            case 1:
                th.getClass();
                c5yVar.y.a(th);
                break;
            default:
                th.getClass();
                c5yVar.y.b(th, new z4y(c5yVar, (byte) 2));
                break;
        }
        return Unit.f46060a;
    }
}
