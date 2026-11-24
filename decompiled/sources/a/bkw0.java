package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class bkw0 extends p4 {
    public Boolean c;
    public String d;
    public rjw0 e;
    public Boolean f;

    public final boolean A1() {
        ((kxw0) this.b).getClass();
        Boolean boolZ1 = z1("firebase_analytics_collection_deactivated");
        return boolZ1 != null && boolZ1.booleanValue();
    }

    public final boolean B1() {
        Boolean boolZ1 = z1("google_analytics_automatic_screen_reporting_enabled");
        return boolZ1 == null || boolZ1.booleanValue();
    }

    public final tyw0 C1(String str, boolean z) {
        Object obj;
        s0x.E(str);
        kxw0 kxw0Var = (kxw0) this.b;
        Bundle bundleY1 = y1();
        if (bundleY1 == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleY1.get(str);
        }
        tyw0 tyw0Var = tyw0.UNINITIALIZED;
        if (obj == null) {
            return tyw0Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return tyw0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return tyw0.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return tyw0.POLICY;
        }
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.g(uuw0Var2);
        uuw0Var2.j.b(str, "Invalid manifest metadata for");
        return tyw0Var;
    }

    public final boolean n1(String str) {
        kxw0.e(((kxw0) this.b).i);
        if (x6x0.O1((String) btw0.g1.a(null), str) || x6x0.O1((String) btw0.h1.a(null), str) || x6x0.O1((String) btw0.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.e.U(str, "gaia_collection_enabled"));
    }

    public final boolean o1(String str) {
        return "1".equals(this.e.U(str, "measurement.event_sampling_enabled"));
    }

    public final boolean p1() {
        Boolean boolZ1 = this.c;
        if (boolZ1 == null) {
            boolZ1 = z1("app_measurement_lite");
            this.c = boolZ1;
            if (boolZ1 == null) {
                boolZ1 = Boolean.FALSE;
                this.c = boolZ1;
            }
        }
        return boolZ1.booleanValue() || !((kxw0) this.b).b;
    }

    public final String q1(String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            s0x.H(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.g.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            uuw0 uuw0Var4 = kxw0Var.f;
            kxw0.g(uuw0Var4);
            uuw0Var4.g.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int r1(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(v1(str, btw0.g0), 500), 100) : 500, 256);
    }

    public final void s1() {
        ((kxw0) this.b).getClass();
    }

    public final String t1(String str, atw0 atw0Var) {
        return TextUtils.isEmpty(str) ? (String) atw0Var.a(null) : (String) atw0Var.a(this.e.U(str, atw0Var.f1452a));
    }

    public final long u1(String str, atw0 atw0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) atw0Var.a(null)).longValue();
        }
        String strU = this.e.U(str, atw0Var.f1452a);
        if (TextUtils.isEmpty(strU)) {
            return ((Long) atw0Var.a(null)).longValue();
        }
        try {
            return ((Long) atw0Var.a(Long.valueOf(Long.parseLong(strU)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) atw0Var.a(null)).longValue();
        }
    }

    public final int v1(String str, atw0 atw0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) atw0Var.a(null)).intValue();
        }
        String strU = this.e.U(str, atw0Var.f1452a);
        if (TextUtils.isEmpty(strU)) {
            return ((Integer) atw0Var.a(null)).intValue();
        }
        try {
            return ((Integer) atw0Var.a(Integer.valueOf(Integer.parseInt(strU)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) atw0Var.a(null)).intValue();
        }
    }

    public final double w1(String str, atw0 atw0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) atw0Var.a(null)).doubleValue();
        }
        String strU = this.e.U(str, atw0Var.f1452a);
        if (TextUtils.isEmpty(strU)) {
            return ((Double) atw0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) atw0Var.a(Double.valueOf(Double.parseDouble(strU)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) atw0Var.a(null)).doubleValue();
        }
    }

    public final boolean x1(String str, atw0 atw0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) atw0Var.a(null)).booleanValue();
        }
        String strU = this.e.U(str, atw0Var.f1452a);
        return TextUtils.isEmpty(strU) ? ((Boolean) atw0Var.a(null)).booleanValue() : ((Boolean) atw0Var.a(Boolean.valueOf("1".equals(strU)))).booleanValue();
    }

    public final Bundle y1() {
        kxw0 kxw0Var = (kxw0) this.b;
        try {
            Context context = kxw0Var.f19080a;
            Context context2 = kxw0Var.f19080a;
            uuw0 uuw0Var = kxw0Var.f;
            if (context.getPackageManager() == null) {
                kxw0.g(uuw0Var);
                uuw0Var.g.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = grv0.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean z1(String str) {
        s0x.E(str);
        Bundle bundleY1 = y1();
        if (bundleY1 != null) {
            if (bundleY1.containsKey(str)) {
                return Boolean.valueOf(bundleY1.getBoolean(str));
            }
            return null;
        }
        uuw0 uuw0Var = ((kxw0) this.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.g.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }
}
