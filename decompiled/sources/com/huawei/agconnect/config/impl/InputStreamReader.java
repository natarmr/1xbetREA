package com.huawei.agconnect.config.impl;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InputStreamReader implements ConfigReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f45685a;

    public InputStreamReader(InputStream inputStream, String str) {
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (inputStream != null) {
            try {
                jSONObject = new JSONObject(Utils.c(inputStream));
            } catch (IOException unused) {
                str2 = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str2);
                jSONObject = new JSONObject();
            } catch (JSONException unused2) {
                str2 = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str2);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f45685a = jSONObject;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("appInfos");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    jSONObject2 = null;
                    break;
                }
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.getString("package_name").equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (jSONObject2 == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused3) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                jSONObject.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, jSONObject2.getString(HiAnalyticsConstant.BI_KEY_APP_ID));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"package_name".equals(next)) {
                        a(next, jSONObject2.get(next), jSONObject);
                    }
                }
            }
        } catch (JSONException unused4) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    public static void a(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public final String getString(String str, String str2) {
        if (!str.endsWith(Separators.SLASH)) {
            String[] strArrSplit = str.split(Separators.SLASH);
            try {
                JSONObject jSONObject = this.f45685a;
                for (int i = 1; i < strArrSplit.length; i++) {
                    if (i == strArrSplit.length - 1) {
                        return jSONObject.get(strArrSplit[i]).toString();
                    }
                    jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
                }
            } catch (JSONException unused) {
                Log.w("InputStreamReader", "JSONException when reading 'path': ".concat(str));
                return str2;
            }
        }
        return str2;
    }

    public final String toString() {
        return "InputStreamReader{config=" + this.f45685a.toString().hashCode() + '}';
    }
}
