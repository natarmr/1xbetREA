package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z3y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43741a;
    public final /* synthetic */ d4y b;

    public /* synthetic */ z3y(d4y d4yVar, byte b) {
        this.f43741a = b;
        this.b = d4yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43741a;
        d4y d4yVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                d4yVar.y.b(th, new a4y(d4yVar, (byte) 0));
                break;
            case 1:
                th.getClass();
                d4yVar.y.a(th);
                break;
            default:
                th.getClass();
                d4yVar.y.b(th, new a4y(d4yVar, (byte) 2));
                break;
        }
        return Unit.f46060a;
    }
}
