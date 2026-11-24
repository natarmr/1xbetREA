package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class miw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21865a;
    public final /* synthetic */ piw b;

    public /* synthetic */ miw(piw piwVar, byte b) {
        this.f21865a = b;
        this.b = piwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21865a;
        piw piwVar = this.b;
        switch (b) {
            case 0:
                sqt sqtVar = piw.Y1;
                ComponentCallbacks2 application = piwVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(k1h.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof k1h)) {
                        ze3Var = null;
                    }
                    k1h k1hVar = (k1h) ze3Var;
                    if (k1hVar != null) {
                        return k1hVar.a(piwVar.G0());
                    }
                }
                jf4.n(b1j.i(k1h.class, "Cannot create dependency "));
                return null;
            case 1:
                sqt sqtVar2 = piw.Y1;
                fiu0 fiu0Var = piwVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                pru pruVar = piwVar.M1;
                if (pruVar != null) {
                    return pruVar.a().c.o;
                }
                Intrinsics.h("getRemoteConfigUseCase");
                throw null;
            case 3:
                sqt sqtVar3 = piw.Y1;
                piwVar.H0().x(ogw.f25238a);
                return Unit.f46060a;
            case 4:
                sqt sqtVar4 = piw.Y1;
                piwVar.H0().x(fgw.f9514a);
                return Unit.f46060a;
            default:
                sqt sqtVar5 = piw.Y1;
                piwVar.H0().x(dgw.f6062a);
                return Unit.f46060a;
        }
    }
}
