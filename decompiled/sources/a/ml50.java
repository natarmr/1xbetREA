package a;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ml50 extends nj3 implements rii0 {
    public static final f03 h = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21971a;
    public final GaugeManager b;
    public final dps0 c;
    public final jl50 d;
    public final WeakReference e;
    public String f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ml50(dps0 dps0Var) {
        mj3 mj3VarA = mj3.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(mj3VarA);
        this.d = ll50.M();
        this.e = new WeakReference(this);
        this.c = dps0Var;
        this.b = gaugeManager;
        this.f21971a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // a.rii0
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            h.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        jl50 jl50Var = this.d;
        if (!((ll50) jl50Var.b).E() || ((ll50) jl50Var.b).K()) {
            return;
        }
        this.f21971a.add(perfSession);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.f21971a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f21971a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        rd90[] rd90VarArrB = PerfSession.b(listUnmodifiableList);
        if (rd90VarArrB != null) {
            jl50 jl50Var = this.d;
            List listAsList = Arrays.asList(rd90VarArrB);
            jl50Var.i();
            ((ll50) jl50Var.b).r(listAsList);
        }
        ll50 ll50Var = (ll50) this.d.h();
        String str = this.f;
        if (str == null) {
            Pattern pattern = nl50.f23711a;
        } else if (nl50.f23711a.matcher(str).matches()) {
            h.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.g) {
            return;
        }
        dps0 dps0Var = this.c;
        dps0Var.i.execute(new cps0(dps0Var, ll50Var, getAppState(), (byte) 0));
        this.g = true;
    }

    public final void d(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            int i = 8;
            switch (upperCase) {
                case "OPTIONS":
                    break;
                case "GET":
                    i = 2;
                    break;
                case "PUT":
                    i = 3;
                    break;
                case "HEAD":
                    i = 6;
                    break;
                case "POST":
                    i = 4;
                    break;
                case "PATCH":
                    i = 7;
                    break;
                case "TRACE":
                    i = 9;
                    break;
                case "CONNECT":
                    i = 10;
                    break;
                case "DELETE":
                    i = 5;
                    break;
                default:
                    i = 1;
                    break;
            }
            jl50 jl50Var = this.d;
            jl50Var.i();
            ((ll50) jl50Var.b).O(i);
        }
    }

    public final void g(int i) {
        jl50 jl50Var = this.d;
        jl50Var.i();
        ((ll50) jl50Var.b).P(i);
    }

    public final void h(long j) {
        jl50 jl50Var = this.d;
        jl50Var.i();
        ((ll50) jl50Var.b).R(j);
    }

    public final void i(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        jl50 jl50Var = this.d;
        jl50Var.i();
        ((ll50) jl50Var.b).N(j);
        a(perfSession);
        if (perfSession.c) {
            this.b.collectGaugeMetricOnce(perfSession.b);
        }
    }

    public final void k(String str) {
        jl50 jl50Var = this.d;
        if (str == null) {
            jl50Var.i();
            ((ll50) jl50Var.b).s();
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            jl50Var.i();
            ((ll50) jl50Var.b).S(str);
            return;
        }
        h.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void l(long j) {
        jl50 jl50Var = this.d;
        jl50Var.i();
        ((ll50) jl50Var.b).T(j);
    }

    public final void m(long j) {
        jl50 jl50Var = this.d;
        jl50Var.i();
        ((ll50) jl50Var.b).V(j);
        if (SessionManager.getInstance().perfSession().c) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
        }
    }

    public final void n(String str) {
        HttpUrl httpUrlB;
        int iLastIndexOf;
        if (str != null) {
            HttpUrl httpUrlB2 = null;
            try {
                httpUrlB = HttpUrl.Companion.b(str);
            } catch (IllegalArgumentException unused) {
                httpUrlB = null;
            }
            if (httpUrlB != null) {
                HttpUrl.Builder builderG = httpUrlB.g();
                builderG.b = _UrlKt.a("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
                builderG.c = _UrlKt.a("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
                builderG.g = null;
                builderG.h = null;
                str = builderG.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        httpUrlB2 = HttpUrl.Companion.b(str);
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (httpUrlB2 != null && httpUrlB2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            jl50 jl50Var = this.d;
            jl50Var.i();
            ((ll50) jl50Var.b).X(str);
        }
    }
}
