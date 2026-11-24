package a;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class dd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3w f5873a;
    public final a2z b;
    public final vby c;

    public dd10(r3w r3wVar, a2z a2zVar, vby vbyVar) {
        vbyVar.getClass();
        this.f5873a = r3wVar;
        this.b = a2zVar;
        this.c = vbyVar;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        str.getClass();
        vby vbyVar = this.c;
        vbyVar.getClass();
        String str2 = ((cd10) vbyVar.b(cd10.Companion.serializer(), str)).f4139a;
        if (str2 == null) {
            return;
        }
        if (str2.equals("IFRAME_OPEN_PAYMENTS")) {
            this.f5873a.invoke("://open/paysystems");
        } else if (str2.equals("IFRAME_BACK")) {
            this.b.invoke();
        }
    }
}
