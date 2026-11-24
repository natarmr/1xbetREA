package a;

import android.os.Build;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gfq f40851a;
    public final Executor b;
    public final krd c;
    public final krd d;
    public final rrd e;
    public final srd f;
    public final msd g;
    public final phf0 h;
    public final n660 i;

    public xgq(gfq gfqVar, Executor executor, krd krdVar, krd krdVar2, krd krdVar3, rrd rrdVar, srd srdVar, msd msdVar, phf0 phf0Var, n660 n660Var) {
        this.f40851a = gfqVar;
        this.b = executor;
        this.c = krdVar;
        this.d = krdVar2;
        this.e = rrdVar;
        this.f = srdVar;
        this.g = msdVar;
        this.h = phf0Var;
        this.i = n660Var;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        String string;
        ehq ehqVar;
        srd srdVar = this.f;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(srd.a(srdVar.c));
        hashSet.addAll(srd.a(srdVar.d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            mrd mrdVarC = srdVar.c.c();
            String string2 = null;
            if (mrdVarC == null) {
                string = null;
            } else {
                try {
                    string = mrdVarC.b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                mrd mrdVarC2 = srdVar.c.c();
                if (mrdVarC2 != null) {
                    synchronized (srdVar.f32670a) {
                        try {
                            Iterator it = srdVar.f32670a.iterator();
                            while (it.hasNext()) {
                                srdVar.b.execute(new b1((off0) it.next(), str, mrdVarC2, (byte) 7));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ehqVar = new ehq(string, 2);
            } else {
                mrd mrdVarC3 = srdVar.d.c();
                if (mrdVarC3 != null) {
                    try {
                        string2 = mrdVarC3.b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    ehqVar = new ehq(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    ehqVar = new ehq("", 0);
                }
            }
            map.put(str, ehqVar);
        }
        return map;
    }

    public final x860 b() {
        x860 x860Var;
        msd msdVar = this.g;
        synchronized (msdVar.b) {
            try {
                msdVar.f22313a.getLong("last_fetch_time_in_millis", -1L);
                int i = msdVar.f22313a.getInt("last_fetch_status", 0);
                long j = msdVar.f22313a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j2 = msdVar.f22313a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                x860Var = new x860(i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return x860Var;
    }

    public final void c(boolean z) {
        HttpURLConnection httpURLConnection;
        phf0 phf0Var = this.h;
        synchronized (phf0Var) {
            esd esdVar = (esd) phf0Var.b;
            synchronized (esdVar.q) {
                try {
                    esdVar.e = z;
                    grd grdVar = esdVar.g;
                    if (grdVar != null) {
                        grdVar.f11774a = z;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = esdVar.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                synchronized (phf0Var) {
                    if (!((LinkedHashSet) phf0Var.f26994a).isEmpty()) {
                        ((esd) phf0Var.b).e(0L);
                    }
                }
            }
        }
    }
}
