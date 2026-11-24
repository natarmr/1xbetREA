package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qaf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28392a;
    public final /* synthetic */ lbf b;

    public /* synthetic */ qaf(lbf lbfVar, byte b) {
        this.f28392a = b;
        this.b = lbfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28392a;
        lbf lbfVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                lbfVar.w(th);
                break;
            default:
                th.getClass();
                lbfVar.g.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
