package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uxa implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36430a;
    public final /* synthetic */ wxa b;

    public /* synthetic */ uxa(wxa wxaVar, byte b) {
        this.f36430a = b;
        this.b = wxaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36430a;
        wxa wxaVar = this.b;
        switch (b) {
            case 0:
                kl5 kl5Var = wxa.U1;
                wxaVar.G0().x(ixa.f15532a);
                return Unit.f46060a;
            case 1:
                kl5 kl5Var2 = wxa.U1;
                fiu0 fiu0Var = wxaVar.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                kl5 kl5Var3 = wxa.U1;
                ComponentCallbacks2 application = wxaVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zya.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zya)) {
                        ze3Var = null;
                    }
                    zya zyaVar = (zya) ze3Var;
                    if (zyaVar != null) {
                        return zyaVar.a(a4n0.f(wxaVar));
                    }
                }
                jf4.n(b1j.i(zya.class, "Cannot create dependency "));
                return null;
            case 3:
                kl5 kl5Var4 = wxa.U1;
                wxaVar.G0().x(oxa.f26002a);
                return Unit.f46060a;
            case 4:
                kl5 kl5Var5 = wxa.U1;
                wxaVar.G0().x(nxa.f24275a);
                return Unit.f46060a;
            case 5:
                kl5 kl5Var6 = wxa.U1;
                wxaVar.G0().x(pxa.f27744a);
                return Unit.f46060a;
            case 6:
                kl5 kl5Var7 = wxa.U1;
                wxaVar.G0().x(new hxa(wxaVar.K1.n(wxaVar, wxa.V1[0]).longValue()));
                return Unit.f46060a;
            default:
                kl5 kl5Var8 = wxa.U1;
                wxaVar.G0().x(gxa.f12069a);
                return Unit.f46060a;
        }
    }
}
