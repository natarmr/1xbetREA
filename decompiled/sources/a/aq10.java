package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aq10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1276a;
    public final /* synthetic */ vq10 b;

    public /* synthetic */ aq10(vq10 vq10Var, byte b) {
        this.f1276a = b;
        this.b = vq10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1276a;
        vq10 vq10Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new bq10(vq10Var, (byte) 1))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                vq10Var.n.b(th, new g2z((Object) vq10Var, (byte) 26));
                break;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                Object obj2 = vq10Var.e.f;
                k0w0Var2.h(new BindPhoneNumberScreen(new i38(8)));
                break;
        }
        return Unit.f46060a;
    }
}
