package a;

import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zz2 f30762a = new zz2("JSONParser", new String[0]);

    public static gx3 a(JSONObject jSONObject) throws JSONException {
        gx3 gx3Var = new gx3(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            gx3Var.put(next, objA);
        }
        return gx3Var;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objA = jSONArray.get(i);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static Map c(String str) {
        s0x.E(str);
        gvw0 gvw0Var = new gvw0('.');
        w4p0 w4p0Var = new w4p0((byte) 27);
        w4p0Var.b = gvw0Var;
        List listD = new ikt0(w4p0Var).d(str);
        if (listD.size() < 2) {
            f30762a.k("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        gx3 gx3VarD = d(new String(y0x0.F((String) listD.get(1)), StandardCharsets.UTF_8));
        return gx3VarD == null ? new HashMap() : gx3VarD;
    }

    public static gx3 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new kcw0(e);
        }
    }
}
