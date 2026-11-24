package a;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dzw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6963a;
    public final /* synthetic */ b1x0 b;

    public /* synthetic */ dzw0(b1x0 b1x0Var, byte b) {
        this.f6963a = b;
        this.b = b1x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f6963a;
        b1x0 b1x0Var = this.b;
        switch (b) {
            case 0:
                b1x0Var.I1();
                break;
            case 1:
                zlt0 zlt0Var = b1x0Var.r;
                kxw0 kxw0Var = (kxw0) zlt0Var.b;
                fxw0 fxw0Var = kxw0Var.g;
                b1x0 b1x0Var2 = kxw0Var.m;
                wvw0 wvw0Var = kxw0Var.e;
                kxw0.g(fxw0Var);
                fxw0Var.m1();
                if (zlt0Var.t()) {
                    if (zlt0Var.s()) {
                        kxw0.e(wvw0Var);
                        wvw0Var.x.u(null);
                        Bundle bundle = new Bundle();
                        bundle.putString(Payload.SOURCE, "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        bundle.putLong("_cc", 1L);
                        kxw0.f(b1x0Var2);
                        b1x0Var2.s1(bundle, "auto", "_cmpx");
                    } else {
                        kxw0.e(wvw0Var);
                        o24 o24Var = wvw0Var.x;
                        String strT = o24Var.t();
                        if (TextUtils.isEmpty(strT)) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.h.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jA = wvw0Var.y.a() / 3600000;
                            Uri uri = Uri.parse(strT);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? Payload.TYPE_APP : (String) obj;
                            kxw0.f(b1x0Var2);
                            b1x0Var2.s1((Bundle) pair.second, str2, "_cmp");
                        }
                        o24Var.u(null);
                    }
                    kxw0.e(wvw0Var);
                    wvw0Var.y.b(0L);
                    break;
                }
                break;
            case 2:
                b1x0Var.m1();
                kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                wvw0 wvw0Var2 = kxw0Var2.e;
                uuw0 uuw0Var2 = kxw0Var2.f;
                kxw0.e(wvw0Var2);
                mvw0 mvw0Var = wvw0Var2.u;
                if (mvw0Var.a()) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.n.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    rvw0 rvw0Var = wvw0Var2.v;
                    long jA2 = rvw0Var.a();
                    rvw0Var.b(1 + jA2);
                    if (jA2 >= 5) {
                        kxw0.g(uuw0Var2);
                        uuw0Var2.j.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        mvw0Var.b(true);
                    } else {
                        ezw0 ezw0Var = b1x0Var.t;
                        if (ezw0Var == null) {
                            ezw0Var = new ezw0(b1x0Var, kxw0Var2, (byte) 3, false);
                            b1x0Var.t = ezw0Var;
                        }
                        ezw0Var.b(0L);
                    }
                }
                break;
            default:
                b1x0Var.I1();
                break;
        }
    }
}
