package a;

import android.content.SharedPreferences;
import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes.dex */
public final class hs3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ApplicationLoader k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs3(ApplicationLoader applicationLoader, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = applicationLoader;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ApplicationLoader applicationLoader = this.k;
        switch (b) {
            case 0:
                return new hs3(applicationLoader, yjeVar, (byte) 0);
            default:
                return new hs3(applicationLoader, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((hs3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                ApplicationLoader applicationLoader = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    z7z z7zVar = applicationLoader.k;
                    if (z7zVar == null) {
                        Intrinsics.h("biometryFeature");
                        throw null;
                    }
                    a1d a1dVar = ((y58) z7zVar.get()).j().f18757a;
                    xwb0 xwb0Var = (xwb0) a1dVar.b;
                    boolean z2 = !a1dVar.i();
                    xwb0Var.getClass();
                    if (((SharedPreferences) xwb0Var.c.getValue()).getBoolean("biometrics_passed", z2)) {
                        z7z z7zVar2 = applicationLoader.j;
                        if (z7zVar2 == null) {
                            Intrinsics.h("prophylaxisFeature");
                            throw null;
                        }
                        ylt0 ylt0VarE = ((c1d0) z7zVar2.get()).e();
                        this.j = true;
                        if (ylt0VarE.a(true, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(2500L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rv3 rv3Var = (rv3) this.k.c().X3.get();
                if (!rv3Var.n) {
                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                    appsFlyerLib.setHost("", "appsflyersdk.com");
                    byte b = 0;
                    appsFlyerLib.setDisableAdvertisingIdentifiers(false);
                    appsFlyerLib.setCollectAndroidID(true);
                    appsFlyerLib.setAndroidIdData(rv3Var.g.a());
                    appsFlyerLib.init("iGjRWepvHRRUkVX6DYuTPC", new ov3(rv3Var), rv3Var.f31152a);
                    appsFlyerLib.subscribeForDeepLink(new hv3(rv3Var));
                    appsFlyerLib.setDeepLinkTimeout(5000L);
                    appsFlyerLib.registerSessionReadyListener(new hv3(rv3Var));
                    String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(rv3Var.f31152a);
                    if (appsFlyerUID != null) {
                        rv3Var.c.f17908a.h("APPS_FLYER_ID", appsFlyerUID);
                    }
                    rv3Var.s = appsFlyerLib;
                    rv3Var.n = true;
                    rv3Var.a(appsFlyerLib);
                    sac.V(rv3Var.r, pv3.f27644a, null, null, new qv3(rv3Var, yjeVar, b), 14);
                }
                return Unit.f46060a;
        }
    }
}
