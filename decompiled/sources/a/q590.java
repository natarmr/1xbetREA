package a;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes5.dex */
public final class q590 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r590 f28141a;
    public final r590 b;
    public final r590 c;
    public final yr80 d;
    public final vby e;

    public q590(r590 r590Var, r590 r590Var2, r590 r590Var3, yr80 yr80Var, vby vbyVar) {
        vbyVar.getClass();
        this.f28141a = r590Var;
        this.b = r590Var2;
        this.c = r590Var3;
        this.d = yr80Var;
        this.e = vbyVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void postMessage(String str) throws Exception {
        if (str == null) {
            return;
        }
        vby vbyVar = this.e;
        vbyVar.getClass();
        String str2 = ((p590) vbyVar.b(p590.Companion.serializer(), str)).f26395a;
        if (str2 == null) {
            return;
        }
        int iHashCode = str2.hashCode();
        String strK = null;
        yr80 yr80Var = this.d;
        switch (iHashCode) {
            case -2102303835:
                if (str2.equals("IFRAME_OPEN_BETTING")) {
                    ew70 ew70Var = (ew70) ((wxw) vbyVar.b(wxw.Companion.serializer(ew70.Companion.serializer()), str)).b;
                    strK = ew70Var != null ? a8k0.K(ew70Var) : null;
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case -1639649582:
                if (str2.equals("IFRAME_OPEN_INFORMATION")) {
                    this.f28141a.invoke();
                    break;
                }
                break;
            case -1432948873:
                if (str2.equals("IFRAME_OPEN_TEAM_LINE_AND_LIVE")) {
                    mx70 mx70Var = (mx70) ((wxw) vbyVar.b(wxw.Companion.serializer(mx70.Companion.serializer()), str)).b;
                    strK = mx70Var != null ? m8x.m0(mx70Var) : null;
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case -679172980:
                if (str2.equals("IFRAME_OPEN_ALL_GAMES_ENTRANCE")) {
                    mv70 mv70Var = (mv70) ((wxw) vbyVar.b(wxw.Companion.serializer(mv70.Companion.serializer()), str)).b;
                    strK = mv70Var != null ? u7x.I(mv70Var) : null;
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case -365209127:
                if (str2.equals("IFRAME_OPEN_HOME")) {
                    yr80Var.invoke("://open/popular");
                    break;
                }
                break;
            case 85053950:
                if (str2.equals("IFRAME_AUTHORIZATION")) {
                    yr80Var.invoke("://open/login");
                    break;
                }
                break;
            case 353255695:
                if (str2.equals("IFRAME_BET_ON_OWN")) {
                    zv70 zv70Var = (zv70) ((wxw) vbyVar.b(wxw.Companion.serializer(zv70.Companion.serializer()), str)).b;
                    if (zv70Var != null) {
                        String str3 = zv70Var.f45043a;
                        strK = kng0.k("://open/betonyournationalteam?", str3 != null ? "type=".concat(str3) : null);
                    }
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case 636792436:
                if (str2.equals("IFRAME_REGISTRATION")) {
                    yr80Var.invoke("://open/registration");
                    break;
                }
                break;
            case 1065457263:
                if (str2.equals("IFRAME_OPEN_CASINO")) {
                    jv70 jv70Var = (jv70) ((wxw) vbyVar.b(wxw.Companion.serializer(jv70.Companion.serializer()), str)).b;
                    strK = jv70Var != null ? r7x.I(jv70Var) : null;
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case 1256444441:
                if (str2.equals("IFRAME_OPEN_LINK_IN_BROWSER")) {
                    sw70 sw70Var = (sw70) ((wxw) vbyVar.b(wxw.Companion.serializer(sw70.Companion.serializer()), str)).b;
                    strK = sw70Var != null ? h8x.S(sw70Var) : null;
                    if (strK != null) {
                        yr80Var.invoke(strK);
                    }
                    break;
                }
                break;
            case 1413237046:
                if (str2.equals("IFRAME_OPEN_OFFICE")) {
                    this.b.invoke();
                    break;
                }
                break;
            case 1565014111:
                if (str2.equals("IFRAME_OPEN_TOP_UP")) {
                    yr80Var.invoke("://open/paysystems");
                    break;
                }
                break;
            case 1812801569:
                if (str2.equals("IFRAME_PAGE_NOT_FOUND")) {
                    this.c.invoke();
                    break;
                }
                break;
        }
    }
}
