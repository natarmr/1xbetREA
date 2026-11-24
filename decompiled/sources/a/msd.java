package a;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class msd {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22313a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public msd(SharedPreferences sharedPreferences) {
        this.f22313a = sharedPreferences;
    }

    public final lsd a() {
        lsd lsdVar;
        synchronized (this.c) {
            int i = this.f22313a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f22313a.getLong("backoff_end_time_in_millis", -1L));
            lsdVar = new lsd();
            lsdVar.f20573a = i;
            lsdVar.b = date;
        }
        return lsdVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f22313a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final lsd c() {
        lsd lsdVar;
        synchronized (this.d) {
            int i = this.f22313a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f22313a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lsdVar = new lsd();
            lsdVar.f20573a = i;
            lsdVar.b = date;
        }
        return lsdVar;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.f22313a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.d) {
            this.f22313a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
