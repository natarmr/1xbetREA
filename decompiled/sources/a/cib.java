package a;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes5.dex */
public final class cib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f4403a;
    public final lya b;

    public cib(vby vbyVar, lya lyaVar) {
        vbyVar.getClass();
        this.f4403a = vbyVar;
        this.b = lyaVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void postMessage(String str) {
        Object g0g0Var;
        Object g0g0Var2;
        vby vbyVar = this.f4403a;
        if (str == null) {
            return;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            vbyVar.getClass();
            g0g0Var = ((h740) vbyVar.b(h740.Companion.serializer(), str)).f12560a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        String str2 = (String) g0g0Var;
        if (str2 == null) {
            return;
        }
        int iHashCode = str2.hashCode();
        lya lyaVar = this.b;
        switch (iHashCode) {
            case -2102303835:
                if (str2.equals("IFRAME_OPEN_BETTING")) {
                    try {
                        vbyVar.getClass();
                        fw70 fw70Var = (fw70) ((xxw) vbyVar.b(xxw.Companion.serializer(fw70.Companion.serializer()), str)).b;
                        g0g0Var2 = fw70Var != null ? b8k0.Y(fw70Var) : null;
                    } catch (Throwable th2) {
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var2 = new g0g0(th2);
                    }
                    String str3 = (String) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2);
                    if (str3 != null) {
                        lyaVar.invoke(str3);
                    }
                    break;
                }
                break;
            case 85053950:
                if (str2.equals("IFRAME_AUTHORIZATION")) {
                    lyaVar.invoke("://open/login");
                }
                break;
            case 636792436:
                if (str2.equals("IFRAME_REGISTRATION")) {
                    lyaVar.invoke("://open/registration");
                    break;
                }
                break;
            case 1413237046:
                if (str2.equals("IFRAME_OPEN_OFFICE")) {
                    lyaVar.invoke("://open/editprofile");
                    break;
                }
                break;
            case 1767074615:
                if (str2.equals("IFRAME_OPEN_PROMO_STORE")) {
                    lyaVar.invoke("://open/promoshop");
                    break;
                }
                break;
        }
    }
}
