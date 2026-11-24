package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y0e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41801a;
    public final /* synthetic */ g1e b;

    public /* synthetic */ y0e(g1e g1eVar, byte b) {
        this.f41801a = b;
        this.b = g1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41801a;
        g1e g1eVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.printStackTrace();
                g1eVar.C.f(new l0e(str));
                break;
            default:
                th.printStackTrace();
                g1eVar.C.f(new l0e(str));
                break;
        }
        return Unit.f46060a;
    }
}
