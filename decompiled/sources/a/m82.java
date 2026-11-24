package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m82 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21349a;
    public final /* synthetic */ y82 b;

    public /* synthetic */ m82(y82 y82Var, byte b) {
        this.f21349a = b;
        this.b = y82Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21349a;
        d82 d82Var = d82.f5622a;
        y82 y82Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = y82.V1;
                String str = efx.v(y82Var).f4046a;
                ComponentCallbacks2 application = y82Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(apk0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof apk0)) {
                        ze3Var = null;
                    }
                    apk0 apk0Var = (apk0) ze3Var;
                    if (apk0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(y82Var);
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        String strB = xnk0.b(y82Var.H0(), str);
                        Application application2 = y82Var.n0().getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        LinkedHashMap linkedHashMap2 = xbv0.f40619a;
                        String strB2 = xbv0.b(y82Var.H0(), efx.v(y82Var).f4046a);
                        Application application3 = y82Var.n0().getApplication();
                        application3.getClass();
                        return apk0Var.a(i1w0VarF, new hpk0(y82.class.getSimpleName(), y82Var.H0(), y82Var.O1.n(y82Var, y82.W1[1]), str), cuiVarC, xbv0.c(application3, strB2));
                    }
                }
                jf4.n(b1j.i(apk0.class, "Cannot create dependency "));
                return null;
            case 1:
                qek0 qek0Var2 = y82.V1;
                y82Var.I0().x(new h82(0L));
                return Unit.f46060a;
            case 2:
                qek0 qek0Var3 = y82.V1;
                y82Var.I0().x(f82.f9087a);
                return Unit.f46060a;
            case 3:
                qek0 qek0Var4 = y82.V1;
                return new q0h0((eui) y82Var.G0().Y.get());
            case 4:
                qek0 qek0Var5 = y82.V1;
                y82Var.I0().x(d82Var);
                return Unit.f46060a;
            case 5:
                qek0 qek0Var6 = y82.V1;
                y82Var.I0().x(g82.f10844a);
                return Unit.f46060a;
            case 6:
                qek0 qek0Var7 = y82.V1;
                y82Var.I0().x(b82.f2137a);
                return Unit.f46060a;
            case 7:
                qek0 qek0Var8 = y82.V1;
                y82Var.I0().x(d82Var);
                return Unit.f46060a;
            default:
                qek0 qek0Var9 = y82.V1;
                y82Var.I0().x(z72.f43897a);
                return Unit.f46060a;
        }
    }
}
