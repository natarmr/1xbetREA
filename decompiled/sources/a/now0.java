package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class now0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f23886a;

    static {
        HashMap map = new HashMap();
        f23886a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(CrashHianalyticsData.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f23886a;
                if (map.containsKey(string)) {
                    return msm0.v(((String) map.get(string)) + Separators.COLON + string2);
                }
            }
            return msm0.v("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            return msm0.v("WEB_INTERNAL_ERROR:" + str + "[ " + e.getLocalizedMessage() + " ]");
        }
    }
}
