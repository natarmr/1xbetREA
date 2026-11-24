package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class esd {
    public static final int[] r = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f8322a;
    public int c;
    public HttpURLConnection f;
    public grd g;
    public final ScheduledExecutorService h;
    public final rrd i;
    public final nfq j;
    public final dgq k;
    public final krd l;
    public final Context m;
    public final String n;
    public final msd p;
    public boolean b = false;
    public final Random o = new Random();
    public boolean d = false;
    public boolean e = false;
    public final Object q = new Object();

    public esd(nfq nfqVar, dgq dgqVar, rrd rrdVar, krd krdVar, Context context, String str, LinkedHashSet linkedHashSet, msd msdVar, ScheduledExecutorService scheduledExecutorService) {
        this.f8322a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - msdVar.c().f20573a, 1);
        this.j = nfqVar;
        this.i = rrdVar;
        this.k = dgqVar;
        this.l = krdVar;
        this.m = context;
        this.n = str;
        this.p = msdVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        return (this.f8322a.isEmpty() || this.b || this.d || this.e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        nfq nfqVar = this.j;
        nfqVar.a();
        Matcher matcher = s.matcher(nfqVar.c.b);
        return b1j.k("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new mx2(this, (byte) 4), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new ygq("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f8322a.iterator();
        while (it.hasNext()) {
            ((dsd) it.next()).a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.p.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String strC;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        nfq nfqVar = this.j;
        nfqVar.a();
        mgq mgqVar = nfqVar.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", mgqVar.f21755a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrN = o050.N(context, context.getPackageName());
            if (bArrN == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strC = null;
            } else {
                strC = nnw0.C(bArrN);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", AuthorizationHeaderIms.YES);
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        nfqVar.a();
        Matcher matcher = s.matcher(mgqVar.b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.n);
        map.put("lastKnownVersionNumber", Long.toString(((msd) this.i.h).f22313a.getLong("last_template_version", 0L)));
        nfqVar.a();
        map.put("appId", mgqVar.b);
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized grd j(HttpURLConnection httpURLConnection) {
        return new grd(httpURLConnection, this.i, this.l, this.f8322a, new dsd(this), this.h, this.p);
    }

    public final void k(Date date) {
        msd msdVar = this.p;
        int i = msdVar.c().f20573a + 1;
        long millis = TimeUnit.MINUTES.toMillis(r[(i < 8 ? i : 8) - 1]);
        msdVar.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }
}
