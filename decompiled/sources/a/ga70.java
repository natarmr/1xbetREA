package a;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ga70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f10952a;
    public final vby b;

    public ga70(Function1 function1, vby vbyVar) {
        vbyVar.getClass();
        this.f10952a = function1;
        this.b = vbyVar;
    }

    @JavascriptInterface
    public final void GPWebAppInit(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new b870((dgr) vbyVar.b(dgr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppRefreshPage(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new c870((ggr) vbyVar.b(ggr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetDemoStatus(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new d870((sgr) vbyVar.b(sgr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetFreezeAccount(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new e870((vgr) vbyVar.b(vgr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetGameUnderMaintenance(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new f870((bhr) vbyVar.b(bhr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetPageLoaded(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new g870((ehr) vbyVar.b(ehr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetPageTitle(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new h870((hhr) vbyVar.b(hhr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetRoute(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new i870((khr) vbyVar.b(khr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSetUserAccountBalance(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new j870((qhr) vbyVar.b(qhr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppShowAuthenticationFailed(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new k870((thr) vbyVar.b(thr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppShowAuthenticationRequired(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new l870((whr) vbyVar.b(whr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppShowGameBonus(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new m870((zhr) vbyVar.b(zhr.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppShowGameState(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new n870((cir) vbyVar.b(cir.Companion.serializer(), str)));
    }

    @JavascriptInterface
    public final void GPWebAppSuggestRefreshPage(String str) {
        if (str == null) {
            str = "";
        }
        vby vbyVar = this.b;
        vbyVar.getClass();
        this.f10952a.invoke(new o870((fir) vbyVar.b(fir.Companion.serializer(), str)));
    }
}
