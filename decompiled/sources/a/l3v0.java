package a;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l3v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f19375a;
    public final Function1 b;
    public final vby c;

    public l3v0(Function0 function0, Function1 function1, vby vbyVar) {
        vbyVar.getClass();
        this.f19375a = function0;
        this.b = function1;
        this.c = vbyVar;
    }

    @JavascriptInterface
    public final void openInBrowser(String str) {
        if (str == null) {
            return;
        }
        vby vbyVar = this.c;
        vbyVar.getClass();
        String str2 = ((k3v0) vbyVar.b(k3v0.Companion.serializer(), str)).f17638a;
        if (str2 == null) {
            return;
        }
        this.b.invoke(str2);
    }

    @JavascriptInterface
    public final void redirectToPersonalProfile() {
        this.f19375a.invoke();
    }
}
