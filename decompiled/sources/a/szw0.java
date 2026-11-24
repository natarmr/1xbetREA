package a;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class szw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33088a;
    public final /* synthetic */ b1x0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ szw0(b1x0 b1x0Var, Bundle bundle, byte b) {
        this.f33088a = b;
        this.c = bundle;
        this.b = b1x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f33088a;
        Bundle bundle = this.c;
        b1x0 b1x0Var = this.b;
        switch (b) {
            case 0:
                b1x0Var.m1();
                b1x0Var.n1();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                s0x.E(string);
                s0x.E(string2);
                s0x.H(bundle.get("value"));
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                if (!kxw0Var.a()) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.o.a("Conditional property not set since app measurement is disabled");
                } else {
                    zzpl zzplVar = new zzpl(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        x6x0 x6x0Var = kxw0Var.i;
                        kxw0.e(x6x0Var);
                        bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                        zzbh zzbhVarT1 = x6x0Var.T1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        kxw0.e(x6x0Var);
                        bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                        zzbh zzbhVarT2 = x6x0Var.T1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                        kxw0Var.i().E1(new zzah(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzbhVarT2, bundle.getLong("trigger_timeout"), zzbhVarT1, bundle.getLong("time_to_live"), x6x0Var.T1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                zlt0 zlt0Var = b1x0Var.w;
                kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                if (!bundle.isEmpty()) {
                    wvw0 wvw0Var = kxw0Var2.e;
                    x6x0 x6x0Var2 = kxw0Var2.i;
                    bkw0 bkw0Var = kxw0Var2.d;
                    uuw0 uuw0Var2 = kxw0Var2.f;
                    kxw0.e(wvw0Var);
                    Bundle bundle2 = new Bundle(wvw0Var.z.s());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            kxw0.e(x6x0Var2);
                            if (x6x0.y2(obj)) {
                                x6x0.E1(zlt0Var, null, 27, null, null, 0);
                            }
                            kxw0.g(uuw0Var2);
                            uuw0Var2.l.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (x6x0.Q1(str)) {
                            kxw0.g(uuw0Var2);
                            uuw0Var2.l.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            kxw0.e(x6x0Var2);
                            bkw0Var.getClass();
                            if (x6x0Var2.q1(obj, RemoteMessageConst.MessageBody.PARAM, 500, str)) {
                                x6x0Var2.D1(str, bundle2, obj);
                            }
                        }
                    }
                    kxw0.e(x6x0Var2);
                    x6x0 x6x0Var3 = ((kxw0) bkw0Var.b).i;
                    kxw0.e(x6x0Var3);
                    int i = x6x0Var3.W1(201500000) ? 100 : 25;
                    if (bundle2.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle2.remove(str2);
                            }
                        }
                        kxw0.e(x6x0Var2);
                        x6x0.E1(zlt0Var, null, 26, null, null, 0);
                        kxw0.g(uuw0Var2);
                        uuw0Var2.l.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                wvw0 wvw0Var2 = kxw0Var2.e;
                kxw0.e(wvw0Var2);
                wvw0Var2.z.y(bundle);
                kxw0Var2.i().q1(bundle);
                break;
        }
    }
}
