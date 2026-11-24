package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class k8b implements los0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2v f17865a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final quc e;
    public final quc f;

    public k8b(Context context, quc qucVar, quc qucVar2) {
        hcy hcyVar = new hcy();
        yu4 yu4Var = yu4.f43251a;
        hcyVar.a(sa6.class, yu4Var);
        hcyVar.a(n15.class, yu4Var);
        fv4 fv4Var = fv4.f10197a;
        hcyVar.a(nv00.class, fv4Var);
        hcyVar.a(i45.class, fv4Var);
        zu4 zu4Var = zu4.f44992a;
        hcyVar.a(ytc.class, zu4Var);
        hcyVar.a(s15.class, zu4Var);
        xu4 xu4Var = xu4.f41492a;
        hcyVar.a(yw2.class, xu4Var);
        hcyVar.a(k15.class, xu4Var);
        ev4 ev4Var = ev4.f8451a;
        hcyVar.a(iv00.class, ev4Var);
        hcyVar.a(h45.class, ev4Var);
        av4 av4Var = av4.f1509a;
        hcyVar.a(mfd.class, av4Var);
        hcyVar.a(t15.class, av4Var);
        dv4 dv4Var = dv4.f6727a;
        hcyVar.a(wto.class, dv4Var);
        hcyVar.a(u35.class, dv4Var);
        cv4 cv4Var = cv4.f5014a;
        hcyVar.a(vto.class, cv4Var);
        hcyVar.a(t35.class, cv4Var);
        gv4 gv4Var = gv4.f11958a;
        hcyVar.a(sk50.class, gv4Var);
        hcyVar.a(k45.class, gv4Var);
        bv4 bv4Var = bv4.f3263a;
        hcyVar.a(too.class, bv4Var);
        hcyVar.a(s35.class, bv4Var);
        hcyVar.d = true;
        this.f17865a = new g2v(hcyVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(ug9.c);
        this.e = qucVar2;
        this.f = qucVar;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e9d0.t(kng0.k("Invalid url: ", str), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    public final q35 a(q35 q35Var) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        ru ruVarC = q35Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) ruVarC.f;
        if (map2 == null) {
            jf4.n("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        ruVarC.a("model", Build.MODEL);
        ruVarC.a("hardware", Build.HARDWARE);
        ruVarC.a("device", Build.DEVICE);
        ruVarC.a("product", Build.PRODUCT);
        ruVarC.a("os-uild", Build.ID);
        ruVarC.a("manufacturer", Build.MANUFACTURER);
        ruVarC.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) ruVarC.f;
        if (map3 == null) {
            jf4.n("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = rk50.f30632a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) ruVarC.f;
        if (map4 == null) {
            jf4.n("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = qk50.f28869a;
                subtype = 100;
            } else if (((qk50) qk50.f28869a.get(subtype)) == null) {
            }
            map = (HashMap) ruVarC.f;
            if (map != null) {
                jf4.n("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            ruVarC.a("country", Locale.getDefault().getCountry());
            ruVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            ruVarC.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                m8x.O(e, "CctTransportBackend", "Unable to find version code for package");
            }
            ruVarC.a("application_build", Integer.toString(i2));
            return ruVarC.b();
        }
        SparseArray sparseArray3 = qk50.f28869a;
        subtype = 0;
        map = (HashMap) ruVarC.f;
        if (map != null) {
            jf4.n("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        ruVarC.a("country", Locale.getDefault().getCountry());
        ruVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        ruVarC.a("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        ruVarC.a("application_build", Integer.toString(i2));
        return ruVarC.b();
    }
}
