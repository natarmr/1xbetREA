package a;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4x f34257a = f4x.q("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final rcf0 b;
    public static final rcf0 c;
    public static final rcf0 d;
    public static final rcf0 e;
    public static final rcf0 f;

    static {
        v3x v3xVar = b4x.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        h8x.w(7, objArr);
        b = b4x.k(7, objArr);
        Object[] objArr2 = {"auto", Payload.TYPE_APP, "am"};
        h8x.w(3, objArr2);
        c = b4x.k(3, objArr2);
        d = b4x.v("_r", "_dbg");
        u3x u3xVar = new u3x(4);
        u3xVar.f(epv0.p);
        u3xVar.f(epv0.q);
        e = u3xVar.g();
        f = b4x.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            rcf0 rcf0Var = d;
            int i = rcf0Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) rcf0Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            rcf0 rcf0Var = f;
            int i = rcf0Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) rcf0Var.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(Bundle bundle, String str, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            rcf0 rcf0Var = d;
            int i = rcf0Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) rcf0Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
