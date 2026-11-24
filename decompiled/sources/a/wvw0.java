package a;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class wvw0 extends ryw0 {
    public static final Pair A = new Pair("", 0L);
    public SharedPreferences d;
    public SharedPreferences e;
    public hac f;
    public final rvw0 g;
    public final o24 h;
    public String i;
    public boolean j;
    public long k;
    public final rvw0 l;
    public final mvw0 m;
    public final o24 n;
    public final fht0 o;
    public final mvw0 p;
    public final rvw0 q;
    public final rvw0 r;
    public boolean s;
    public final mvw0 t;
    public final mvw0 u;
    public final rvw0 v;
    public final o24 w;
    public final o24 x;
    public final rvw0 y;
    public final fht0 z;

    public wvw0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.l = new rvw0(this, "session_timeout", 1800000L);
        this.m = new mvw0(this, "start_new_session", true);
        this.q = new rvw0(this, "last_pause_time", 0L);
        this.r = new rvw0(this, "session_id", 0L);
        this.n = new o24(this, "non_personalized_ads");
        this.o = new fht0(this, "last_received_uri_timestamps_by_source");
        this.p = new mvw0(this, "allow_remote_dynamite", false);
        this.g = new rvw0(this, "first_open_time", 0L);
        new rvw0(this, "app_install_time", 0L);
        this.h = new o24(this, "app_instance_id");
        this.t = new mvw0(this, "app_backgrounded", false);
        this.u = new mvw0(this, "deep_link_retrieval_complete", false);
        this.v = new rvw0(this, "deep_link_retrieval_attempts", 0L);
        this.w = new o24(this, "firebase_feature_rollouts");
        this.x = new o24(this, "deferred_attribution_cache");
        this.y = new rvw0(this, "deferred_attribution_cache_timestamp", 0L);
        this.z = new fht0(this, "default_event_parameters");
    }

    @Override // a.ryw0
    public final boolean n1() {
        return true;
    }

    public final SharedPreferences q1() {
        m1();
        o1();
        s0x.H(this.d);
        return this.d;
    }

    public final SharedPreferences r1() {
        m1();
        o1();
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        kxw0 kxw0Var = (kxw0) this.b;
        String strValueOf = String.valueOf(kxw0Var.f19080a.getPackageName());
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        quw0 quw0Var = uuw0Var.o;
        String strConcat = strValueOf.concat("_preferences");
        quw0Var.b(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = kxw0Var.f19080a.getSharedPreferences(strConcat, 0);
        this.e = sharedPreferences2;
        return sharedPreferences2;
    }

    public final SparseArray s1() {
        Bundle bundleS = this.o.s();
        int[] intArray = bundleS.getIntArray("uriSources");
        long[] longArray = bundleS.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final xyw0 t1() {
        m1();
        return xyw0.c(q1().getInt("consent_source", 100), q1().getString("consent_settings", "G1"));
    }

    public final void u1(boolean z) {
        m1();
        uuw0 uuw0Var = ((kxw0) this.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.o.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = q1().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean v1(long j) {
        return j - this.l.a() > this.q.a();
    }
}
