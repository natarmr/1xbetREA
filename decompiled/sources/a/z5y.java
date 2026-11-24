package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z5y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43840a;
    public final /* synthetic */ e6y b;

    public /* synthetic */ z5y(e6y e6yVar, byte b) {
        this.f43840a = b;
        this.b = e6yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43840a;
        e6y e6yVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                e6yVar.z.b(th, new a6y(e6yVar, (byte) 0));
                break;
            case 1:
                th.getClass();
                e6yVar.z.b(th, new v1x((byte) 23));
                break;
            default:
                th.getClass();
                e6yVar.z.b(th, new a6y(e6yVar, (byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
