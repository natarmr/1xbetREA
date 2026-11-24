package a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.AuthSdkActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yn4 implements wn, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42919a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yn4(Object obj, byte b) {
        this.f42919a = b;
        this.b = obj;
    }

    @Override // a.wn
    public final void a(Object obj) {
        xg90 tg90Var;
        byte b = this.f42919a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AuthSdkActivity authSdkActivity = (AuthSdkActivity) obj2;
                Object obj3 = ((j0g0) obj).f15681a;
                int i = AuthSdkActivity.Z;
                e0g0 e0g0Var = j0g0.b;
                if (!(obj3 instanceof g0g0)) {
                    YandexAuthToken yandexAuthToken = (YandexAuthToken) obj3;
                    YandexAuthOptions yandexAuthOptions = authSdkActivity.Y;
                    if (yandexAuthOptions == null) {
                        Intrinsics.h("options");
                        throw null;
                    }
                    if (yandexAuthOptions.b) {
                        Log.d("AuthSdkActivity", "Token received");
                    }
                    if (yandexAuthToken != null) {
                        Intent intent = new Intent();
                        intent.putExtra("com.yandex.authsdk.EXTRA_TOKEN", yandexAuthToken);
                        authSdkActivity.setResult(-1, intent);
                    }
                }
                Throwable thA = j0g0.a(obj3);
                if (thA != null) {
                    YandexAuthOptions yandexAuthOptions2 = authSdkActivity.Y;
                    if (yandexAuthOptions2 == null) {
                        Intrinsics.h("options");
                        throw null;
                    }
                    if (yandexAuthOptions2.b) {
                        Log.d("AuthSdkActivity", "Error received");
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("com.yandex.authsdk.EXTRA_ERROR", thA);
                    authSdkActivity.setResult(-1, intent2);
                }
                authSdkActivity.finish();
                return;
            default:
                Map map = (Map) obj;
                map.getClass();
                s2g0 s2g0Var = (s2g0) obj2;
                String[] strArr = s2g0Var.K1;
                if (strArr == null) {
                    return;
                }
                s2g0Var.K1 = null;
                qog0 qog0Var = (qog0) s2g0Var.I1.get(tx3.l0(strArr));
                if (qog0Var == null) {
                    return;
                }
                Context contextO0 = s2g0Var.o0();
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    Object objValueOf = map.get(str);
                    if (objValueOf == null) {
                        str.getClass();
                        objValueOf = Boolean.valueOf(jiq0.j0(contextO0, str) == 0);
                    }
                    if (((Boolean) objValueOf).booleanValue()) {
                        tg90Var = new vg90(str);
                    } else {
                        jxq jxqVar = s2g0Var.w;
                        tg90Var = jxqVar != null ? jiq0.v0(jxqVar.e, str) : false ? new tg90(str) : new sg90(str);
                    }
                    arrayList.add(tg90Var);
                }
                Iterator it = CollectionsKt.P0(qog0Var.f29072a).iterator();
                while (it.hasNext()) {
                    ((rg90) it.next()).d(arrayList);
                }
                return;
        }
    }

    @Override // a.fer
    public final wdr b() {
        byte b = this.f42919a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new rer(1, (AuthSdkActivity) obj, AuthSdkActivity.class, "onGetResult", "onGetResult(Ljava/lang/Object;)V", 0);
            default:
                return new rer(1, (s2g0) obj, s2g0.class, "onPermissionsResult", "onPermissionsResult(Ljava/util/Map;)V", 0);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f42919a) {
            case 0:
                if ((obj instanceof wn) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            default:
                if ((obj instanceof wn) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f42919a) {
            case 0:
                break;
        }
        return b().hashCode();
    }
}
