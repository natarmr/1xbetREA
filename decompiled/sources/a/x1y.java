package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x1y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40141a;
    public final /* synthetic */ a2y b;

    public /* synthetic */ x1y(a2y a2yVar, byte b) {
        this.f40141a = b;
        this.b = a2yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40141a;
        a2y a2yVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                a2yVar.z.b(th, new v1y(a2yVar, (byte) 1));
                break;
            case 1:
                th.getClass();
                a2yVar.z.b(th, new v1x((byte) 21));
                break;
            default:
                th.getClass();
                a2yVar.z.b(th, new v1y(a2yVar, (byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
