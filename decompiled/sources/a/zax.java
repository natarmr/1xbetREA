package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zax implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44086a;
    public final /* synthetic */ ibx b;

    public /* synthetic */ zax(ibx ibxVar, byte b) {
        this.f44086a = b;
        this.b = ibxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44086a;
        ibx ibxVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                ibxVar.i.b(th, new v1x((byte) 12));
                break;
            default:
                th.getClass();
                ibxVar.i.b(th, new v1x((byte) 11));
                break;
        }
        return Unit.f46060a;
    }
}
