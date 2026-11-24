package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rgq extends pd90 {
    public static final f03 d = f03.d();
    public final ibs0 c;

    public rgq(ibs0 ibs0Var) {
        this.c = ibs0Var;
    }

    public static boolean d(ibs0 ibs0Var, int i) {
        if (ibs0Var != null) {
            f03 f03Var = d;
            if (i > 1) {
                f03Var.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : ibs0Var.x().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        f03Var.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        f03Var.f("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        f03Var.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                f03Var.f("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator it = ibs0Var.D().iterator();
            while (it.hasNext()) {
                if (!d((ibs0) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(ibs0 ibs0Var, int i) {
        Long l;
        f03 f03Var = d;
        if (ibs0Var == null) {
            f03Var.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            f03Var.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strB = ibs0Var.B();
        if (strB != null) {
            String strTrim = strB.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (ibs0Var.A() <= 0) {
                    f03Var.f("invalid TraceDuration:" + ibs0Var.A());
                    return false;
                }
                if (!ibs0Var.E()) {
                    f03Var.f("clientStartTimeUs is null.");
                    return false;
                }
                if (ibs0Var.B().startsWith("_st_") && ((l = (Long) ibs0Var.x().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    f03Var.f("non-positive totalFrames in screen trace " + ibs0Var.B());
                    return false;
                }
                Iterator it = ibs0Var.D().iterator();
                while (it.hasNext()) {
                    if (!e((ibs0) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : ibs0Var.y().entrySet()) {
                    try {
                        pd90.b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        f03Var.f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        f03Var.f("invalid TraceId:" + ibs0Var.B());
        return false;
    }

    @Override // a.pd90
    public final boolean a() {
        ibs0 ibs0Var = this.c;
        boolean zE = e(ibs0Var, 0);
        f03 f03Var = d;
        if (!zE) {
            f03Var.f("Invalid Trace:" + ibs0Var.B());
            return false;
        }
        if (ibs0Var.w() <= 0) {
            Iterator it = ibs0Var.D().iterator();
            while (it.hasNext()) {
                if (((ibs0) it.next()).w() > 0) {
                }
            }
            return true;
        }
        if (d(ibs0Var, 0)) {
            return true;
        }
        f03Var.f("Invalid Counters for Trace:" + ibs0Var.B());
        return false;
    }
}
