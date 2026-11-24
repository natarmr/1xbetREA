package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cpk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4752a;
    public final /* synthetic */ fpk0 b;

    public /* synthetic */ cpk0(fpk0 fpk0Var, byte b) {
        this.f4752a = b;
        this.b = fpk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4752a;
        wok0 wok0Var = wok0.f39502a;
        fpk0 fpk0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = fpk0.V1;
                String str = efx.v(fpk0Var).f4046a;
                ComponentCallbacks2 application = fpk0Var.n0().getApplication();
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
                        i1w0 i1w0VarF = a4n0.f(fpk0Var);
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        String strB = xnk0.b(fpk0Var.H0(), str);
                        Application application2 = fpk0Var.n0().getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        LinkedHashMap linkedHashMap2 = xbv0.f40619a;
                        String strB2 = xbv0.b(fpk0Var.H0(), efx.v(fpk0Var).f4046a);
                        Application application3 = fpk0Var.n0().getApplication();
                        application3.getClass();
                        return apk0Var.a(i1w0VarF, new hpk0(fpk0.class.getSimpleName(), fpk0Var.H0(), fpk0Var.O1.n(fpk0Var, fpk0.W1[1]), str), cuiVarC, xbv0.c(application3, strB2));
                    }
                }
                jf4.n(b1j.i(apk0.class, "Cannot create dependency "));
                return null;
            case 1:
                zie0 zie0Var2 = fpk0.V1;
                fpk0Var.I0().x(wok0Var);
                return Unit.f46060a;
            case 2:
                zie0 zie0Var3 = fpk0.V1;
                return new q0h0((dui) fpk0Var.G0().W.get());
            case 3:
                zie0 zie0Var4 = fpk0.V1;
                fpk0Var.I0().x(new yok0(0));
                return Unit.f46060a;
            case 4:
                zie0 zie0Var5 = fpk0.V1;
                fpk0Var.I0().x(wok0Var);
                return Unit.f46060a;
            case 5:
                zie0 zie0Var6 = fpk0.V1;
                fpk0Var.I0().x(xok0.f41225a);
                return Unit.f46060a;
            case 6:
                zie0 zie0Var7 = fpk0.V1;
                fpk0Var.I0().x(uok0.f36021a);
                return Unit.f46060a;
            default:
                zie0 zie0Var8 = fpk0.V1;
                fpk0Var.I0().x(tok0.f34289a);
                return Unit.f46060a;
        }
    }
}
