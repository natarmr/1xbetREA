package a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fvw0 extends u5x0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvw0(m6x0 m6x0Var, byte b) {
        super(m6x0Var);
        this.e = b;
    }

    @Override // a.u5x0
    public final void p1() {
        byte b = this.e;
    }

    public boolean q1() {
        n1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((kxw0) this.b).f19080a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void t1(String str, w5x0 w5x0Var, ixw0 ixw0Var, zuw0 zuw0Var) {
        String str2;
        String str3 = w5x0Var.f38603a;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        n1();
        try {
            URL url = new URI(str3).toURL();
            this.c.j0();
            byte[] bArrA = ixw0Var.a();
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            Map map = w5x0Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                fxw0Var.y1(new cvw0(this, str2, url, bArrA, map, zuw0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.g.c(uuw0.q1(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    private final void r1() {
    }

    private final void s1() {
    }
}
