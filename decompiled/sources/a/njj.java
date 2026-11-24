package a;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class njj implements kt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23640a = 0;
    public final Object b;

    public njj(us00 us00Var) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(us00Var);
        firebaseAnalytics.getClass();
        this.b = firebaseAnalytics;
    }

    @Override // a.kt2
    public final void a(String str, Map map) {
        byte b = this.f23640a;
        Object obj = this.b;
        switch (b) {
            case 0:
                map.getClass();
                Objects.toString(map);
                ((cu) obj).o("AnalyticsLogger\nEvent: " + str + "\nParams: [" + map);
                break;
            default:
                map.getClass();
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) obj;
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    bundle.putString((String) entry.getKey(), String.valueOf(entry.getValue()));
                }
                wrw0 wrw0Var = firebaseAnalytics.f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new hqw0(wrw0Var, (String) null, str, bundle, false));
                break;
        }
    }

    @Override // a.kt2
    public final void b(String str, String str2) {
        switch (this.f23640a) {
            case 0:
                str2.getClass();
                break;
            default:
                str2.getClass();
                wrw0 wrw0Var = ((FirebaseAnalytics) this.b).f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new hqw0(wrw0Var, (String) null, str, (Object) str2, false));
                break;
        }
    }

    @Override // a.kt2
    public final void c(String str) {
        byte b = this.f23640a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cu) obj).o("AnalyticsLogger\nEvent: ".concat(str));
                break;
            default:
                wrw0 wrw0Var = ((FirebaseAnalytics) obj).f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new hqw0(wrw0Var, (String) null, str, (Bundle) null, false));
                break;
        }
    }

    @Override // a.kt2
    public final void d(long j) {
        switch (this.f23640a) {
            case 0:
                break;
            default:
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.b;
                String strValueOf = String.valueOf(j);
                wrw0 wrw0Var = firebaseAnalytics.f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new nqw0(wrw0Var, strValueOf, (byte) 0));
                break;
        }
    }

    @Override // a.kt2
    public final void e() {
        switch (this.f23640a) {
            case 0:
                break;
            default:
                wrw0 wrw0Var = ((FirebaseAnalytics) this.b).f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new nqw0(wrw0Var, null, (byte) 0));
                break;
        }
    }

    @Override // a.kt2
    public final void f(String str) {
        switch (this.f23640a) {
            case 0:
                break;
            default:
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.b;
                Bundle bundleV = i120.V(new Pair("currentScreen", str));
                wrw0 wrw0Var = firebaseAnalytics.f45641a;
                wrw0Var.getClass();
                wrw0Var.c(new hqw0(wrw0Var, (String) null, "screen_view", bundleV, false));
                break;
        }
    }

    @Override // a.kt2
    public final void g(boolean z) {
        hfq hfqVar;
        switch (this.f23640a) {
            case 0:
                break;
            default:
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.b;
                if (z) {
                    hfqVar = hfq.f12983a;
                } else if (z) {
                    t9f.b();
                } else {
                    hfqVar = hfq.b;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ifq ifqVar = ifq.b;
                linkedHashMap.put(ifqVar, hfqVar);
                firebaseAnalytics.getClass();
                wrw0 wrw0Var = firebaseAnalytics.f45641a;
                Bundle bundle = new Bundle();
                hfq hfqVar2 = (hfq) linkedHashMap.get(ifq.f14701a);
                if (hfqVar2 != null) {
                    int iOrdinal = hfqVar2.ordinal();
                    if (iOrdinal == 0) {
                        bundle.putString("ad_storage", "granted");
                    } else if (iOrdinal == 1) {
                        bundle.putString("ad_storage", "denied");
                    }
                }
                hfq hfqVar3 = (hfq) linkedHashMap.get(ifqVar);
                if (hfqVar3 != null) {
                    int iOrdinal2 = hfqVar3.ordinal();
                    if (iOrdinal2 == 0) {
                        bundle.putString("analytics_storage", "granted");
                    } else if (iOrdinal2 == 1) {
                        bundle.putString("analytics_storage", "denied");
                    }
                }
                hfq hfqVar4 = (hfq) linkedHashMap.get(ifq.c);
                if (hfqVar4 != null) {
                    int iOrdinal3 = hfqVar4.ordinal();
                    if (iOrdinal3 == 0) {
                        bundle.putString("ad_user_data", "granted");
                    } else if (iOrdinal3 == 1) {
                        bundle.putString("ad_user_data", "denied");
                    }
                }
                hfq hfqVar5 = (hfq) linkedHashMap.get(ifq.d);
                if (hfqVar5 != null) {
                    int iOrdinal4 = hfqVar5.ordinal();
                    if (iOrdinal4 == 0) {
                        bundle.putString("ad_personalization", "granted");
                    } else if (iOrdinal4 == 1) {
                        bundle.putString("ad_personalization", "denied");
                    }
                }
                wrw0Var.getClass();
                wrw0Var.c(new jqw0(wrw0Var, bundle, (byte) 1));
                Boolean boolValueOf = Boolean.valueOf(z);
                wrw0Var.getClass();
                wrw0Var.c(new oqw0(wrw0Var, boolValueOf));
                break;
        }
    }

    public njj(cu cuVar) {
        this.b = cuVar;
    }

    private final void j() {
    }

    private final void h(boolean z) {
    }

    private final void i(String str) {
    }

    private final void k(long j) {
    }
}
