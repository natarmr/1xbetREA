package a;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes5.dex */
public final class m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f21299a;

    public /* synthetic */ m73(us00 us00Var) {
        this.f21299a = us00Var;
    }

    public String a(String str) {
        String imei;
        str.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = this.f21299a.getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                return (telephonyManager == null || (imei = telephonyManager.getImei()) == null) ? "-1" : imei;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public vqc b() {
        return new vqc((Object) new wsf0(new bb6(this.f21299a), (byte) 17), (byte) 10);
    }
}
