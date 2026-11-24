package a;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk50 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tk50 f34079a = new tk50(1, j2e.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && jiq0.j0(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new i2e(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return h2e.f12327a;
    }
}
