package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ojj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ony f25362a;

    public ojj(ony onyVar, byte b) {
        onyVar.getClass();
        switch (b) {
            case 1:
                this.f25362a = onyVar;
                break;
            case 2:
                this.f25362a = onyVar;
                break;
            default:
                this.f25362a = onyVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(gv00 gv00Var, zje zjeVar) {
        kfi0 kfi0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof kfi0) {
            kfi0Var = (kfi0) zjeVar;
            int i = kfi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfi0Var.k = i - Integer.MIN_VALUE;
            } else {
                kfi0Var = new kfi0(this, zjeVar);
            }
        } else {
            kfi0Var = new kfi0(this, zjeVar);
        }
        Object objD0 = kfi0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kfi0Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                ony onyVar = this.f25362a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("userId", ncy.c(gv00Var.f11954a));
                linkedHashMap.put("wifiName", ncy.c(gv00Var.b));
                linkedHashMap.put("carrierName", ncy.c(gv00Var.c));
                linkedHashMap.put("crashLogs", ncy.c(gv00Var.d));
                tny tnyVar = new tny("event", xp20.n(linkedHashMap));
                kfi0Var.k = 1;
                rny rnyVar = (rny) onyVar;
                objD0 = qjj.d0(rnyVar.f.b, new u5u(rnyVar, tnyVar, yjeVar, (byte) 29), kfi0Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            g0g0Var = (Boolean) objD0;
            g0g0Var.getClass();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? Boolean.FALSE : g0g0Var;
    }

    public void b(jb90 jb90Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ib90 ib90Var = jb90Var.f16228a;
        String str = jb90Var.d;
        linkedHashMap.put("ErrorType", ncy.c(ib90Var.f14476a));
        linkedHashMap.put(RemoteMessageConst.Notification.URL, ncy.c(jb90Var.b));
        int i = jb90Var.c;
        if (i > 0) {
            linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, ncy.b(Integer.valueOf(i)));
        }
        if (str.length() > 0) {
            linkedHashMap.put("description", ncy.c(str));
        }
        if (ib90Var == ib90.SSL) {
            linkedHashMap.put("sslProceeded", ncy.a(Boolean.valueOf(jb90Var.e)));
        }
        ((rny) this.f25362a).a("depositErrorEvent", new tny("event", xp20.n(linkedHashMap)));
    }

    public void c(String str, Throwable th) {
        th.getClass();
        String strS = wgm0.s(th);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Debug", ncy.c(str + Separators.RETURN + strS));
        ((rny) this.f25362a).a("Debug", new tny("event", xp20.n(linkedHashMap)));
    }
}
