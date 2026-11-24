package a;

import android.net.Uri;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class xgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bs3 f40837a;
    public final CoroutineContext b;

    public xgf0(bs3 bs3Var, CoroutineContext coroutineContext) {
        bs3Var.getClass();
        coroutineContext.getClass();
        this.f40837a = bs3Var;
        this.b = coroutineContext;
    }

    public final URL a() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        bs3 bs3Var = this.f40837a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bs3Var.f3108a).appendPath("settings");
        gw2 gw2Var = bs3Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", gw2Var.c).appendQueryParameter("display_version", gw2Var.b).build().toString());
    }
}
