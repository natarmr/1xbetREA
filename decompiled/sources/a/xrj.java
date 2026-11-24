package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xrj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41373a;
    public final /* synthetic */ zrj b;
    public final /* synthetic */ rlj c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ xrj(zrj zrjVar, rlj rljVar, boolean z, byte b) {
        this.f41373a = b;
        this.b = zrjVar;
        this.c = rljVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41373a;
        byte b2 = 0;
        boolean z = this.d;
        rlj rljVar = this.c;
        zrj zrjVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zrjVar.d.m();
                ((c8d) k0w0Var.h(new AuthenticatorScreenFactoryImpl$authenticatorScreen$1(mq4.b, rljVar.f30700a, rljVar.b)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, z));
                break;
            default:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new xrj(zrjVar, rljVar, z, b2));
                break;
        }
        return Unit.f46060a;
    }
}
