package com.google.firebase.remoteconfig.internal;

import a.chq;
import a.ia3;
import a.lrd;
import a.mrd;
import a.nnw0;
import a.o050;
import a.qrd;
import a.ygq;
import a.zgq;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.push.AttributionReporter;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45673a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f45673a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) throws ygq {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new ygq("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.b);
        Context context = this.f45673a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put(CommonConstant.KEY_COUNTRY_CODE, locale.getCountry());
        map3.put("languageCode", locale.toLanguageTag());
        int i = Build.VERSION.SDK_INT;
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(AttributionReporter.APP_VERSION, packageInfo.versionName);
                map3.put("appBuild", Long.toString(i >= 28 ? ia3.m(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put(com.huawei.hms.support.api.entity.common.CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, context.getPackageName());
        map3.put("sdkVersion", "23.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new zgq(e.getMessage());
        }
    }

    public qrd fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) {
        String strC;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z;
        httpURLConnection.setDoOutput(true);
        long j = this.f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.f45673a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrN = o050.N(context, context.getPackageName());
            if (bArrN == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strC = null;
            } else {
                strC = nnw0.C(bArrN);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", AuthorizationHeaderIms.YES);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new chq(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectC = c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    lrd lrdVarD = mrd.d();
                    lrdVarD.d = date;
                    try {
                        jSONObject = jSONObjectC.getJSONObject("entries");
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            lrdVarD.b = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            lrdVarD.e = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            lrdVarD.c = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                    if (string != null) {
                        lrdVarD.f20526a = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectC.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused8) {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null) {
                        try {
                            lrdVarD.f = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused9) {
                        }
                    }
                    mrd mrdVar = new mrd((JSONObject) lrdVarD.b, (Date) lrdVarD.d, (JSONArray) lrdVarD.e, (JSONObject) lrdVarD.c, lrdVarD.f20526a, (JSONArray) lrdVarD.f);
                    try {
                        z = !jSONObjectC.get(com.huawei.hms.support.api.entity.common.CommonConstant.ReqAccessTokenParam.STATE_LABEL).equals("NO_CHANGE");
                    } catch (JSONException unused10) {
                        z = true;
                    }
                    return !z ? new qrd(1, mrdVar, null) : new qrd(0, mrdVar, headerField);
                } catch (JSONException e2) {
                    throw new ygq("Fetch failed: fetch response could not be parsed.", e2);
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused11) {
                }
                throw th;
            }
        } catch (IOException | JSONException e3) {
            throw new ygq("The client had an error while calling the backend!", e3);
        }
    }
}
