package com.google.firebase.perf.metrics;

import a.dps0;
import a.dw9;
import a.epi0;
import a.f03;
import a.hne;
import a.hsd;
import a.jf4;
import a.kng0;
import a.mj3;
import a.nj3;
import a.pd90;
import a.rdr0;
import a.rii0;
import a.yk5;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class Trace extends nj3 implements Parcelable, rii0 {
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final f03 m = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f45669a;
    public final Trace b;
    public final GaugeManager c;
    public final String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final List g;
    public final ArrayList h;
    public final dps0 i;
    public final yk5 j;
    public Timer k;
    public Timer l;

    static {
        new ConcurrentHashMap();
        CREATOR = new rdr0((byte) 12);
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : mj3.a());
        this.f45669a = new WeakReference(this);
        this.b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.g = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.i = null;
            this.j = null;
            this.c = null;
        } else {
            this.i = dps0.s;
            this.j = new yk5();
            this.c = GaugeManager.getInstance();
        }
    }

    @Override // a.rii0
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            m.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.k == null || b()) {
                return;
            }
            this.g.add(perfSession);
        }
    }

    public final boolean b() {
        return this.l != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.k != null) && !b()) {
                m.g("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.f.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.b.get();
    }

    public void incrementMetric(String str, long j) {
        String strC = pd90.c(str);
        f03 f03Var = m;
        if (strC != null) {
            f03Var.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            f03Var.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            f03Var.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.b;
        atomicLong.addAndGet(j);
        if (f03Var.f8700a) {
            StringBuilder sbT = kng0.t("Incrementing metric '", str, "' to ");
            sbT.append(atomicLong.get());
            sbT.append(" on trace '");
            sbT.append(str2);
            sbT.append(Separators.QUOTE);
            f03Var.a(sbT.toString());
        }
    }

    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f;
        f03 f03Var = m;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zB = b();
            String str3 = this.d;
            if (zB) {
                Locale locale = Locale.ENGLISH;
                jf4.o(kng0.l("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                pd90.b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                jf4.o("Exceeds max limit of number of attributes - 5");
            }
            f03Var.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            f03Var.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String strC = pd90.c(str);
        f03 f03Var = m;
        if (strC != null) {
            f03Var.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            f03Var.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            f03Var.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.b.set(j);
        f03Var.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    public void removeAttribute(String str) {
        if (!b()) {
            this.f.remove(str);
        } else if (m.f8700a) {
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public void start() {
        String str;
        String str2;
        boolean zN = hsd.e().n();
        f03 f03Var = m;
        if (!zN) {
            f03Var.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = pd90.f26798a;
        String str3 = this.d;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith(BundleUtil.UNDERLINE_TAG)) {
            int[] iArrH = hne.H(6);
            int length = iArrH.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrH[i]) {
                        case 1:
                            str2 = "_as";
                            break;
                        case 2:
                            str2 = "_astui";
                            break;
                        case 3:
                            str2 = "_astfd";
                            break;
                        case 4:
                            str2 = "_asti";
                            break;
                        case 5:
                            str2 = "_fs";
                            break;
                        case 6:
                            str2 = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str2.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str = "Trace name must not start with '_'";
                }
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            f03Var.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.k != null) {
            f03Var.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.j.getClass();
        this.k = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f45669a);
        a(perfSession);
        if (perfSession.c) {
            this.c.collectGaugeMetricOnce(perfSession.b);
        }
    }

    public void stop() {
        Timer timer = this.k;
        String str = this.d;
        f03 f03Var = m;
        if (timer == null) {
            f03Var.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (b()) {
            f03Var.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f45669a);
        unregisterForAppState();
        this.j.getClass();
        Timer timer2 = new Timer();
        this.l = timer2;
        if (this.b == null) {
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) dw9.l(1, arrayList);
                if (trace.l == null) {
                    trace.l = timer2;
                }
            }
            if (str.isEmpty()) {
                if (f03Var.f8700a) {
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.i.c(new epi0((Object) this, (byte) 21).c(), getAppState());
            if (SessionManager.getInstance().perfSession().c) {
                this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.h);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.k, 0);
        parcel.writeParcelable(this.l, 0);
        synchronized (this.g) {
            parcel.writeList(this.g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, dps0 dps0Var, yk5 yk5Var, mj3 mj3Var) {
        super(mj3Var);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f45669a = new WeakReference(this);
        this.b = null;
        this.d = str.trim();
        this.h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = yk5Var;
        this.i = dps0Var;
        this.g = Collections.synchronizedList(new ArrayList());
        this.c = gaugeManager;
    }
}
