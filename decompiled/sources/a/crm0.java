package a;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.AttributionReporter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class crm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4852a;
    public final String b;
    public final String c;

    public crm0(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f4852a = j;
        this.b = str;
        this.c = str2;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put(AttributionReporter.APP_VERSION, str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static crm0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new crm0(str, (String) null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new crm0(jSONObject.getString("token"), jSONObject.getString(AttributionReporter.APP_VERSION), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public crm0(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.f4852a = j;
    }
}
