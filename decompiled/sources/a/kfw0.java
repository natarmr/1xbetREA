package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public interface kfw0 {
    public static final zz2 U0 = new zz2("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void a(Status status);

    Uri.Builder c(Intent intent, String str, String str2);

    HttpURLConnection d(URL url);

    void j(Uri uri, String str, p5d0 p5d0Var);

    Context zza();

    String zza(String str);
}
