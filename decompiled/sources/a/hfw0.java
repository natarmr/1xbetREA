package a;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import com.huawei.hms.android.HwBuildEx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hfw0 extends AsyncTask {
    public static final zz2 g = new zz2("FirebaseAuth", "GetAuthDomainTask");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12990a;
    public final String b;
    public final WeakReference c;
    public final Uri.Builder d;
    public final String e;
    public final nfq f;

    public hfw0(String str, String str2, Intent intent, nfq nfqVar, kfw0 kfw0Var) {
        s0x.E(str);
        this.f12990a = str;
        this.f = nfqVar;
        s0x.E(str2);
        s0x.H(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        s0x.E(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(kfw0Var.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        s0x.H(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.b = builderBuildUpon.build().toString();
        this.c = new WeakReference(kfw0Var);
        this.d = kfw0Var.c(intent, str, str2);
        this.e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static String a(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : egm0.x(new String(d(errorStream)));
        } catch (IOException e) {
            zz2 zz2Var = g;
            Log.w((String) zz2Var.b, zz2Var.p("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e)), new Object[0]));
            return null;
        }
    }

    public static boolean c(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            return host != null && (host.endsWith("firebaseapp.com") || host.endsWith("web.app"));
        } catch (URISyntaxException e) {
            g.k(ua80.i("Error parsing URL for auth domain check: ", str, ". ", e.getMessage()), new Object[0]);
        }
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(mfw0 mfw0Var) {
        String str;
        String str2;
        Uri.Builder builder;
        kfw0 kfw0Var = (kfw0) this.c.get();
        if (mfw0Var != null) {
            str = mfw0Var.f21714a;
            str2 = mfw0Var.b;
        } else {
            str = null;
            str2 = null;
        }
        if (kfw0Var == null) {
            g.k("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.d) == null) {
            kfw0Var.a(msm0.v(str2));
        } else {
            builder.authority(str);
            kfw0Var.j(builder.build(), this.f12990a, FirebaseAuth.getInstance(this.f).p);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str = this.e;
        zz2 zz2Var = g;
        try {
            URL url = new URL(this.b);
            kfw0 kfw0Var = (kfw0) this.c.get();
            HttpURLConnection httpURLConnectionD = kfw0Var.d(url);
            httpURLConnectionD.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionD.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            httpURLConnectionD.setReadTimeout(60000);
            new fht0(kfw0Var.zza(), this.f, x860.i().j()).w(httpURLConnectionD);
            int responseCode = httpURLConnectionD.getResponseCode();
            if (responseCode != 200) {
                String strA = a(httpURLConnectionD);
                zz2Var.k("Error getting project config. Failed with " + strA + Separators.SP + responseCode, new Object[0]);
                mfw0 mfw0Var = new mfw0();
                mfw0Var.b = strA;
                return mfw0Var;
            }
            ikt0 ikt0Var = new ikt0();
            ikt0Var.zza(new String(d(httpURLConnectionD.getInputStream())));
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ArrayList<String> arrayList = (ArrayList) ikt0Var.f14945a;
            if (!zIsEmpty) {
                if (arrayList.contains(str)) {
                    mfw0 mfw0Var2 = new mfw0();
                    mfw0Var2.f21714a = str;
                    return mfw0Var2;
                }
                mfw0 mfw0Var3 = new mfw0();
                mfw0Var3.b = "UNAUTHORIZED_DOMAIN";
                return mfw0Var3;
            }
            for (String str2 : arrayList) {
                if (c(str2)) {
                    mfw0 mfw0Var4 = new mfw0();
                    mfw0Var4.f21714a = str2;
                    return mfw0Var4;
                }
            }
            return null;
        } catch (udw0 e) {
            zz2Var.k(kng0.k("ConversionException encountered: ", e.getMessage()), new Object[0]);
            return null;
        } catch (IOException e2) {
            zz2Var.k(kng0.k("IOException occurred: ", e2.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e3) {
            zz2Var.k(kng0.k("Null pointer encountered: ", e3.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
