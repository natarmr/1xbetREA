package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class msh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22319a;
    public final /* synthetic */ rsh b;

    public /* synthetic */ msh(rsh rshVar, byte b) {
        this.f22319a = b;
        this.b = rshVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22319a;
        rsh rshVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                rshVar.x();
                break;
            default:
                th.getClass();
                rshVar.x();
                break;
        }
        return Unit.f46060a;
    }
}
