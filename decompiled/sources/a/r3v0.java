package a;

import android.webkit.JavascriptInterface;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class r3v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f29804a;
    public final hxc0 b;
    public final hxc0 c;
    public final ppb0 d;
    public final Map e;

    public r3v0(vby vbyVar, hxc0 hxc0Var, hxc0 hxc0Var2, ppb0 ppb0Var) {
        vbyVar.getClass();
        this.f29804a = vbyVar;
        this.b = hxc0Var;
        this.c = hxc0Var2;
        this.d = ppb0Var;
        this.e = xp20.f(new Pair("IFRAME_OPEN_PROMOPAGE", new wzu0(1, this, r3v0.class, "parsePromoPageDeeplink", "parsePromoPageDeeplink(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 8)), new Pair("IFRAME_OPEN_CASINO", new q3v0(this, (byte) 0)), new Pair("IFRAME_OPEN_BETTING", new q3v0(this, (byte) 1)), new Pair("IFRAME_OPEN_LINK_IN_BROWSER", new q3v0(this, (byte) 2)), new Pair("IFRAME_OPEN_ALL_GAMES_ENTRANCE", new q3v0(this, (byte) 3)), new Pair("IFRAME_OPEN_TEAM_LINE_AND_LIVE", new q3v0(this, (byte) 4)), new Pair("IFRAME_BET_ON_OWN", new q3v0(this, (byte) 5)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void postMessage(String str) {
        Object g0g0Var;
        String str2;
        if (str == null) {
            return;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            vby vbyVar = this.f29804a;
            vbyVar.getClass();
            g0g0Var = ((f740) vbyVar.b(f740.Companion.serializer(), str)).f9042a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        String str3 = (String) g0g0Var;
        if (str3 == null) {
            return;
        }
        int iHashCode = str3.hashCode();
        ppb0 ppb0Var = this.d;
        switch (iHashCode) {
            case -2102303835:
                if (!str3.equals("IFRAME_OPEN_BETTING")) {
                    return;
                }
                break;
            case -1639649582:
                if (str3.equals("IFRAME_OPEN_INFORMATION")) {
                    this.b.invoke();
                    return;
                }
                return;
            case -1432948873:
                if (!str3.equals("IFRAME_OPEN_TEAM_LINE_AND_LIVE")) {
                    return;
                }
                break;
            case -679172980:
                if (!str3.equals("IFRAME_OPEN_ALL_GAMES_ENTRANCE")) {
                    return;
                }
                break;
            case -369575100:
                if (!str3.equals("IFRAME_OPEN_PROMOPAGE")) {
                    return;
                }
                break;
            case -365209127:
                if (str3.equals("IFRAME_OPEN_HOME")) {
                    ppb0Var.invoke("://open/popular");
                    return;
                }
                return;
            case 85053950:
                if (str3.equals("IFRAME_AUTHORIZATION")) {
                    ppb0Var.invoke("://open/login");
                    return;
                }
                return;
            case 353255695:
                if (!str3.equals("IFRAME_BET_ON_OWN")) {
                    return;
                }
                break;
            case 508822136:
                if (str3.equals("IFRAME_OPEN_FAST_GAMES")) {
                    ppb0Var.invoke("://open/fastgames");
                    return;
                }
                return;
            case 554615925:
                if (str3.equals("IFRAME_OPEN_SUPPORT")) {
                    ppb0Var.invoke("://open/support");
                    return;
                }
                return;
            case 636792436:
                if (str3.equals("IFRAME_REGISTRATION")) {
                    ppb0Var.invoke("://open/registration");
                    return;
                }
                return;
            case 1065457263:
                if (!str3.equals("IFRAME_OPEN_CASINO")) {
                    return;
                }
                break;
            case 1256444441:
                if (!str3.equals("IFRAME_OPEN_LINK_IN_BROWSER")) {
                    return;
                }
                break;
            case 1413237046:
                if (str3.equals("IFRAME_OPEN_OFFICE")) {
                    ppb0Var.invoke("://open/editprofile");
                    return;
                }
                return;
            case 1565014111:
                if (str3.equals("IFRAME_OPEN_TOP_UP")) {
                    ppb0Var.invoke("://open/paysystems");
                    return;
                }
                return;
            case 1767074615:
                if (str3.equals("IFRAME_OPEN_PROMO_STORE")) {
                    ppb0Var.invoke("://open/promoshop");
                    return;
                }
                return;
            case 1812801569:
                if (str3.equals("IFRAME_PAGE_NOT_FOUND")) {
                    this.c.invoke();
                    return;
                }
                return;
            default:
                return;
        }
        Function1 function1 = (Function1) this.e.get(str3);
        if (function1 == null || (str2 = (String) function1.invoke(str)) == null) {
            return;
        }
        ppb0Var.invoke(str2);
    }
}
