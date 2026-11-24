package a;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class raw0 implements Runnable {
    public static final zz2 c = new zz2("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30157a;
    public final com0 b;

    public raw0(String str) {
        s0x.E(str);
        this.f30157a = str;
        this.b = new com0(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zz2 zz2Var = c;
        Status status = Status.g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=".concat(this.f30157a)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                zz2Var.k("Unable to revoke access!", new Object[0]);
            }
            String str = "Response Code: " + responseCode;
            Object[] objArr = new Object[0];
            if (zz2Var.f45232a <= 3) {
                Log.d((String) zz2Var.b, zz2Var.p(str, objArr));
            }
        } catch (IOException e) {
            zz2Var.k("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            zz2Var.k("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.e(status);
    }
}
