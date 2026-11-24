package a;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f12894a;

    public hdy(Function1 function1) {
        this.f12894a = function1;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        str.getClass();
        this.f12894a.invoke(str);
    }
}
