package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j5t {
    public boolean A;
    public boolean d;
    public boolean f;
    public boolean g;
    public double n;
    public double o;
    public ql5 q;
    public ql5 r;
    public boolean t;
    public boolean u;
    public boolean v;
    public double w;
    public boolean y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoj0 f15949a = roj0.b(0, Integer.MAX_VALUE, null, 5);
    public boolean b = true;
    public vrs c = vrs.f37917a;
    public int e = -1;
    public HashMap h = new HashMap();
    public HashMap i = new HashMap();
    public HashMap j = new HashMap();
    public dqr k = new dqr(0.0d, 0.0d, 0.0d);
    public final LinkedHashMap l = new LinkedHashMap();
    public final ArrayList m = new ArrayList();
    public csr p = csr.e;
    public boolean s = true;
    public boolean x = true;
    public y5s z = y5s.i;
    public final k050 B = new k050();

    public static void a(Object obj, String str) {
        Log.i("GamesProcess.Flag", str + " = " + obj);
    }

    public final void b(double d, long j) {
        this.h.put(Long.valueOf(j), Double.valueOf(d));
        Double d2 = (Double) this.h.get(Long.valueOf(j));
        if (d2 != null) {
            a(Double.valueOf(d2.doubleValue()), "firstFastBet");
        }
    }

    public final void c(double d, long j) {
        this.i.put(Long.valueOf(j), Double.valueOf(d));
        Double d2 = (Double) this.i.get(Long.valueOf(j));
        if (d2 != null) {
            a(Double.valueOf(d2.doubleValue()), "secondFastBet");
        }
    }

    public final void d(double d, long j) {
        this.j.put(Long.valueOf(j), Double.valueOf(d));
        Double d2 = (Double) this.j.get(Long.valueOf(j));
        if (d2 != null) {
            a(Double.valueOf(d2.doubleValue()), "thirdFastBet");
        }
    }
}
