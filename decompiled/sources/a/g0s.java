package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10474a;
    public final /* synthetic */ l0s b;

    public /* synthetic */ g0s(l0s l0sVar, byte b) {
        this.f10474a = b;
        this.b = l0sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10474a;
        l0s l0sVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                l0sVar.n.f(th, new g0s(l0sVar, (byte) 1));
                break;
            default:
                l0sVar.B.g(new b1k0(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
