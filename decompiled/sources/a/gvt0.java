package a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.AuthSdkActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gvt0 extends bsr0 {
    public final /* synthetic */ byte h = 1;
    public Object i;

    public gvt0(fvt0 fvt0Var) {
        fvt0Var.getClass();
        this.i = fvt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012d A[LOOP:1: B:42:0x0127->B:44:0x012d, LOOP_END] */
    @Override // a.bsr0
    public final Intent Z(Context context, Object obj) {
        int integer;
        ArrayList arrayList;
        Iterator it;
        Intent intentPutExtra;
        List<ResolveInfo> listQueryIntentActivities;
        switch (this.h) {
            case 0:
                Collection collection = (Collection) obj;
                collection.getClass();
                if (collection.contains(xvt0.f41578a)) {
                    Log.w("VKAuthResultContract", " Don't use OFFLINE scope, if you registered app as embedded. Read more https://dev.vk.com/reference/access-rights");
                }
                try {
                    vkr0 vkr0Var = tut0.b;
                    if (vkr0Var == null) {
                        Intrinsics.h("apiManager");
                        throw null;
                    }
                    integer = ((wut0) vkr0Var.b).b;
                    if (integer == 0) {
                        jf4.n("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
                        return null;
                    }
                    HashSet hashSet = new HashSet(collection);
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null || (listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null), 65536)) == null || listQueryIntentActivities.isEmpty()) {
                        dvt0 dvt0Var = VKWebViewAuthActivity.d;
                        Intent intent = new Intent(context, (Class<?>) VKWebViewAuthActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("vk_app_id", integer);
                        arrayList = new ArrayList(r3d.q(hashSet, 10));
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((xvt0) it.next()).name());
                        }
                        bundle.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
                        bundle.putString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
                        intentPutExtra = intent.putExtra("vk_auth_params", bundle);
                        intentPutExtra.getClass();
                    } else {
                        Iterator<T> it2 = listQueryIntentActivities.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.d(((ResolveInfo) it2.next()).activityInfo.packageName, "com.vkontakte.android")) {
                                ((fvt0) this.i).getClass();
                                intentPutExtra = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                                intentPutExtra.setPackage("com.vkontakte.android");
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt(CommonConstant.ReqAccessTokenParam.CLIENT_ID, integer);
                                bundle2.putBoolean("revoke", true);
                                bundle2.putString(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, CollectionsKt.b0(hashSet, Separators.COMMA, null, null, null, 62));
                                bundle2.putString("redirect_url", "https://oauth.vk.com/blank.html");
                                intentPutExtra.putExtras(bundle2);
                            }
                        }
                        dvt0 dvt0Var2 = VKWebViewAuthActivity.d;
                        Intent intent2 = new Intent(context, (Class<?>) VKWebViewAuthActivity.class);
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("vk_app_id", integer);
                        arrayList = new ArrayList(r3d.q(hashSet, 10));
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((xvt0) it.next()).name());
                        }
                        bundle3.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
                        bundle3.putString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
                        intentPutExtra = intent2.putExtra("vk_auth_params", bundle3);
                        intentPutExtra.getClass();
                    }
                    return intentPutExtra;
                } catch (Exception unused) {
                    integer = tut0.e;
                    if (integer == 0) {
                        integer = context.getResources().getInteger(R.integer.com_vk_sdk_AppId);
                        if (integer == 0) {
                            itt0.k("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
                            return null;
                        }
                        tut0.e = integer;
                    }
                }
                break;
            default:
                ((Unit) obj).getClass();
                YandexAuthOptions yandexAuthOptions = new YandexAuthOptions(context);
                this.i = new kys0(yandexAuthOptions, (byte) 18);
                YandexAuthLoginOptions yandexAuthLoginOptions = new YandexAuthLoginOptions(vw00.f38127a, null);
                String str = yandexAuthLoginOptions.b;
                if (str != null && !StringsKt.W(str)) {
                    yandexAuthOptions = new YandexAuthOptions(str, yandexAuthOptions.c, yandexAuthOptions.b, yandexAuthOptions.d);
                }
                String strG = axq.g();
                Intent intent3 = new Intent(context, (Class<?>) AuthSdkActivity.class);
                intent3.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", yandexAuthOptions);
                intent3.putExtra("com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", yandexAuthLoginOptions);
                intent3.putExtra("com.yandex.authsdk.EXTRA_STATE", strG);
                return intent3;
        }
    }

    @Override // a.bsr0
    public final Object i0(int i, Intent intent) {
        HashMap map;
        hvt0 hvt0Var;
        Object hvt0Var2;
        Unit unit;
        int i2 = 0;
        Object obj = null;
        switch (this.h) {
            case 0:
                fvt0 fvt0Var = (fvt0) this.i;
                if (i == -1) {
                    fvt0Var.getClass();
                    if (intent == null) {
                        hvt0Var = new hvt0(new evt0(0, "No result from caller provided"));
                    } else {
                        if (intent.hasExtra("extra-token-data")) {
                            map = ibm0.k(intent.getStringExtra("extra-token-data"));
                        } else if (intent.getExtras() != null) {
                            map = new HashMap();
                            Bundle extras = intent.getExtras();
                            extras.getClass();
                            for (String str : extras.keySet()) {
                                str.getClass();
                                Bundle extras2 = intent.getExtras();
                                extras2.getClass();
                                map.put(str, String.valueOf(extras2.get(str)));
                            }
                        } else {
                            map = null;
                        }
                        if (map == null || map.get("error") != null) {
                            Bundle extras3 = intent.getExtras();
                            i2 = extras3 != null ? extras3.getInt("vw_login_error") : 0;
                            Bundle extras4 = intent.getExtras();
                            hvt0Var = new hvt0(new evt0(i2, extras4 != null ? extras4.getString("error") : null));
                        } else {
                            try {
                                hvt0Var2 = new ivt0(new uut0(map));
                            } catch (Exception e) {
                                Log.e(fvt0.class.getSimpleName(), "Failed to get VK token", e);
                                hvt0Var2 = new hvt0(new evt0(0, "Auth failed due to exception: " + e.getMessage()));
                            }
                        }
                    }
                    hvt0Var2 = hvt0Var;
                    break;
                } else {
                    hvt0Var2 = new hvt0(new evt0(0, twn.m(i, "Authentication cancelled with activity code = ")));
                }
                if (hvt0Var2 instanceof ivt0) {
                    fvt0Var.getClass();
                    nmt0 nmt0Var = (nmt0) fvt0Var.f10231a;
                    nmt0Var.getClass();
                    SharedPreferences sharedPreferences = (SharedPreferences) nmt0Var.f23789a;
                    HashMap map2 = new HashMap();
                    uut0 uut0Var = ((ivt0) hvt0Var2).f15461a;
                    map2.put("access_token", uut0Var.b);
                    map2.put("secret", uut0Var.c);
                    map2.put("https_required", uut0Var.i ? "1" : "0");
                    map2.put("created", String.valueOf(uut0Var.d));
                    map2.put("expires_in", String.valueOf(uut0Var.h));
                    map2.put("user_id", String.valueOf(uut0Var.f36319a.f46053a));
                    map2.put("email", uut0Var.e);
                    map2.put("phone", uut0Var.f);
                    map2.put("phone_access_key", uut0Var.g);
                    for (Map.Entry entry : map2.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        str2.getClass();
                        if (str3 != null) {
                            sharedPreferences.edit().putString(str2, str3).apply();
                            unit = Unit.f46060a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            sharedPreferences.edit().remove(str2).apply();
                        }
                    }
                    vkr0 vkr0Var = tut0.b;
                    if (vkr0Var == null) {
                        Intrinsics.h("apiManager");
                        throw null;
                    }
                    vkr0Var.A(kotlin.collections.a.c(new xut0(uut0Var.h, uut0Var.d, uut0Var.f36319a, uut0Var.b, uut0Var.c)));
                    kvt0 kvt0Var = new kvt0("stats.trackVisitor");
                    Object value = wvt0.c.getValue();
                    value.getClass();
                    ((ExecutorService) value).submit(new qaq0(kvt0Var, null, (byte) 9));
                }
                return hvt0Var2;
            default:
                s2w0 s2w0Var = s2w0.f31525a;
                if (i == -1) {
                    try {
                        if (((kys0) this.i) != null) {
                            Object h2w0Var = f2w0.f8835a;
                            if (intent != null && i == -1) {
                                d2w0 d2w0Var = (d2w0) x2x.V(intent);
                                if (d2w0Var != null) {
                                    h2w0Var = new g2w0(d2w0Var);
                                } else {
                                    YandexAuthToken yandexAuthToken = (YandexAuthToken) x2x.U(intent, "com.yandex.authsdk.EXTRA_TOKEN", YandexAuthToken.class);
                                    if (yandexAuthToken != null) {
                                        h2w0Var = new h2w0(yandexAuthToken);
                                    }
                                }
                            }
                            obj = h2w0Var;
                        }
                        if (obj == null) {
                            i2 = -1;
                        } else if (!(obj instanceof h2w0)) {
                            i2 = obj instanceof f2w0 ? 1 : -2;
                        }
                        if (i2 == 0) {
                            return new t2w0(((h2w0) obj).f12356a.f46056a);
                        }
                        if (i2 != 1) {
                            return s2w0Var;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return s2w0Var;
                    }
                }
                return r2w0.f29759a;
        }
    }

    public /* synthetic */ gvt0() {
    }
}
