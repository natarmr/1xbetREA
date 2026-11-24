package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.client1.features.main.MainScreenProviderImpl$screen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ikt implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14944a;
    public final /* synthetic */ mkt b;

    public /* synthetic */ ikt(mkt mktVar, byte b) {
        this.f14944a = b;
        this.b = mktVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14944a;
        mkt mktVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                duj dujVar = mktVar.l;
                dujVar.f6698a.m(new uu00(jwb.G(th, dujVar.b)));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                duj dujVar2 = mktVar.l;
                dujVar2.f6698a.m(new uu00(jwb.G(th2, dujVar2.b)));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                mktVar.e.getClass();
                MainScreenProviderImpl$screen$1 mainScreenProviderImpl$screen$1 = new MainScreenProviderImpl$screen$1();
                k0w0Var.getClass();
                k0w0Var.b(new y0w0(mainScreenProviderImpl$screen$1));
                break;
        }
        return Unit.f46060a;
    }
}
