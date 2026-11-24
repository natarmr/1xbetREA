package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hsd {
    public static final f03 d = f03.d();
    public static volatile hsd e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f13576a = RemoteConfigManager.getInstance();
    public q3x b = new q3x();
    public final rgk c = rgk.b();

    public static synchronized hsd e() {
        try {
            if (e == null) {
                e = new hsd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean k(long j) {
        return j >= 0;
    }

    public static boolean l(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(Separators.SEMICOLON)) {
                if (str2.trim().equals("22.0.6")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(long j) {
        return j >= 0;
    }

    public static boolean o(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final v680 a(obb obbVar) {
        rgk rgkVar = this.c;
        String strA0 = obbVar.a0();
        if (strA0 == null) {
            rgkVar.getClass();
            rgk.c.a("Key is null when getting boolean value on device cache.");
            return new v680();
        }
        if (rgkVar.f30441a == null) {
            rgkVar.c(rgk.a());
            if (rgkVar.f30441a == null) {
                return new v680();
            }
        }
        if (!rgkVar.f30441a.contains(strA0)) {
            return new v680();
        }
        try {
            return new v680(Boolean.valueOf(rgkVar.f30441a.getBoolean(strA0, false)));
        } catch (ClassCastException e2) {
            rgk.c.b("Key %s from sharedPreferences has type other than long: %s", strA0, e2.getMessage());
            return new v680();
        }
    }

    public final v680 b(obb obbVar) {
        rgk rgkVar = this.c;
        String strA0 = obbVar.a0();
        if (strA0 == null) {
            rgkVar.getClass();
            rgk.c.a("Key is null when getting double value on device cache.");
            return new v680();
        }
        if (rgkVar.f30441a == null) {
            rgkVar.c(rgk.a());
            if (rgkVar.f30441a == null) {
                return new v680();
            }
        }
        if (!rgkVar.f30441a.contains(strA0)) {
            return new v680();
        }
        try {
            try {
                return new v680(Double.valueOf(Double.longBitsToDouble(rgkVar.f30441a.getLong(strA0, 0L))));
            } catch (ClassCastException e2) {
                rgk.c.b("Key %s from sharedPreferences has type other than double: %s", strA0, e2.getMessage());
                return new v680();
            }
        } catch (ClassCastException unused) {
            return new v680(Double.valueOf(Float.valueOf(rgkVar.f30441a.getFloat(strA0, 0.0f)).doubleValue()));
        }
    }

    public final v680 c(obb obbVar) {
        rgk rgkVar = this.c;
        String strA0 = obbVar.a0();
        if (strA0 == null) {
            rgkVar.getClass();
            rgk.c.a("Key is null when getting long value on device cache.");
            return new v680();
        }
        if (rgkVar.f30441a == null) {
            rgkVar.c(rgk.a());
            if (rgkVar.f30441a == null) {
                return new v680();
            }
        }
        if (!rgkVar.f30441a.contains(strA0)) {
            return new v680();
        }
        try {
            return new v680(Long.valueOf(rgkVar.f30441a.getLong(strA0, 0L)));
        } catch (ClassCastException e2) {
            rgk.c.b("Key %s from sharedPreferences has type other than long: %s", strA0, e2.getMessage());
            return new v680();
        }
    }

    public final v680 d(obb obbVar) {
        rgk rgkVar = this.c;
        String strA0 = obbVar.a0();
        if (strA0 == null) {
            rgkVar.getClass();
            rgk.c.a("Key is null when getting String value on device cache.");
            return new v680();
        }
        if (rgkVar.f30441a == null) {
            rgkVar.c(rgk.a());
            if (rgkVar.f30441a == null) {
                return new v680();
            }
        }
        if (!rgkVar.f30441a.contains(strA0)) {
            return new v680();
        }
        try {
            return new v680(rgkVar.f30441a.getString(strA0, ""));
        } catch (ClassCastException e2) {
            rgk.c.b("Key %s from sharedPreferences has type other than String: %s", strA0, e2.getMessage());
            return new v680();
        }
    }

    public final Boolean f() {
        xsd xsdVar;
        ysd ysdVar;
        synchronized (xsd.class) {
            xsdVar = xsd.f41410a;
            if (xsdVar == null) {
                xsdVar = new xsd();
                xsd.f41410a = xsdVar;
            }
        }
        v680 v680VarG = g(xsdVar);
        if ((v680VarG.b() ? (Boolean) v680VarG.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (ysd.class) {
            ysdVar = ysd.f43162a;
            if (ysdVar == null) {
                ysdVar = new ysd();
                ysd.f43162a = ysdVar;
            }
        }
        v680 v680VarA = a(ysdVar);
        if (v680VarA.b()) {
            return (Boolean) v680VarA.a();
        }
        v680 v680VarG2 = g(ysdVar);
        if (v680VarG2.b()) {
            return (Boolean) v680VarG2.a();
        }
        return null;
    }

    public final v680 g(obb obbVar) {
        Bundle bundle = this.b.f28072a;
        String strB0 = obbVar.b0();
        if (strB0 == null || !bundle.containsKey(strB0)) {
            return new v680();
        }
        try {
            Boolean bool = (Boolean) bundle.get(strB0);
            return bool == null ? new v680() : new v680(bool);
        } catch (ClassCastException e2) {
            q3x.b.b("Metadata key %s contains type other than boolean: %s", strB0, e2.getMessage());
            return new v680();
        }
    }

    public final v680 h(obb obbVar) {
        Bundle bundle = this.b.f28072a;
        String strB0 = obbVar.b0();
        if (strB0 == null || !bundle.containsKey(strB0)) {
            return new v680();
        }
        Object obj = bundle.get(strB0);
        if (obj == null) {
            return new v680();
        }
        if (obj instanceof Float) {
            return new v680(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new v680((Double) obj);
        }
        q3x.b.b("Metadata key %s contains type other than double: %s", strB0);
        return new v680();
    }

    public final v680 i(obb obbVar) {
        v680 v680Var;
        Bundle bundle = this.b.f28072a;
        String strB0 = obbVar.b0();
        if (strB0 == null || !bundle.containsKey(strB0)) {
            v680Var = new v680();
        } else {
            try {
                Integer num = (Integer) bundle.get(strB0);
                v680Var = num == null ? new v680() : new v680(num);
            } catch (ClassCastException e2) {
                q3x.b.b("Metadata key %s contains type other than int: %s", strB0, e2.getMessage());
                v680Var = new v680();
            }
        }
        return v680Var.b() ? new v680(Long.valueOf(((Integer) v680Var.a()).intValue())) : new v680();
    }

    public final long j() {
        gtd gtdVar;
        synchronized (gtd.class) {
            gtdVar = gtd.f11875a;
            if (gtdVar == null) {
                gtdVar = new gtd();
                gtd.f11875a = gtdVar;
            }
        }
        v680 v680Var = this.f13576a.getLong("fpr_rl_time_limit_sec");
        if (v680Var.b() && ((Long) v680Var.a()).longValue() > 0) {
            this.c.d(((Long) v680Var.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) v680Var.a()).longValue();
        }
        v680 v680VarC = c(gtdVar);
        if (!v680VarC.b() || ((Long) v680VarC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) v680VarC.a()).longValue();
    }

    public final boolean n() {
        itd itdVar;
        boolean zBooleanValue;
        htd htdVar;
        boolean zL;
        Boolean boolF = f();
        if (boolF == null || boolF.booleanValue()) {
            synchronized (itd.class) {
                itdVar = itd.f15349a;
                if (itdVar == null) {
                    itdVar = new itd();
                    itd.f15349a = itdVar;
                }
            }
            v680 v680VarA = a(itdVar);
            v680 v680Var = this.f13576a.getBoolean("fpr_enabled");
            if (!v680Var.b()) {
                zBooleanValue = v680VarA.b() ? ((Boolean) v680VarA.a()).booleanValue() : true;
            } else if (this.f13576a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean bool = (Boolean) v680Var.a();
                if (!v680VarA.b() || v680VarA.a() != bool) {
                    this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                synchronized (htd.class) {
                    htdVar = htd.f13627a;
                    if (htdVar == null) {
                        htdVar = new htd();
                        htd.f13627a = htdVar;
                    }
                }
                v680 v680VarD = d(htdVar);
                v680 string = this.f13576a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String str = (String) string.a();
                    if (!v680VarD.b() || !((String) v680VarD.a()).equals(str)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    zL = l(str);
                } else {
                    zL = v680VarD.b() ? l((String) v680VarD.a()) : l("");
                }
                if (!zL) {
                    return true;
                }
            }
        }
        return false;
    }
}
