package com.huawei.hms.support.hwid;

import a.duo0;
import a.fuo0;
import a.hny;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.x;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HuaweiIdAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, x.a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Fragment fragment, int i, List<Scope> list) {
        if (fragment == null) {
            hny.u("Fragment should not be null");
            return;
        }
        if (list == null) {
            hny.u("ScopeList should not be null");
            return;
        }
        try {
            fragment.startActivityForResult(a(fragment.getActivity(), list), i);
        } catch (Exception e) {
            as.d("HuaweiIdAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
        }
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, List<Scope> list) {
        if (authHuaweiId == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authHuaweiId.getAuthorizedScopes().containsAll(list);
    }

    public static AuthHuaweiId getAuthResult() {
        return x.b();
    }

    public static AuthHuaweiId getAuthResultWithScopes(List<Scope> list) throws HuaweiIdAuthException {
        if (ap.a(list).booleanValue()) {
            throw new HuaweiIdAuthException("ScopeList should not be empty");
        }
        AuthHuaweiId authHuaweiIdB = x.b();
        if (authHuaweiIdB == null) {
            authHuaweiIdB = new AuthHuaweiId();
        }
        authHuaweiIdB.requestExtraScopes(list);
        return authHuaweiIdB;
    }

    public static AuthHuaweiId getExtendedAuthResult(HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            hny.u("HuaweiIdAuthExtendedParams should not be null");
            return null;
        }
        List<Scope> extendedScopes = huaweiIdAuthExtendedParams.getExtendedScopes();
        AuthHuaweiId authHuaweiIdB = x.b();
        if (authHuaweiIdB == null) {
            authHuaweiIdB = new AuthHuaweiId();
        }
        return authHuaweiIdB.requestExtraScopes(extendedScopes);
    }

    public static HuaweiIdAuthService getService(Context context, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParams, 60900100);
    }

    public static duo0 parseAuthResultFromIntent(Intent intent) {
        fuo0 fuo0Var = new fuo0();
        HuaweiIdAuthResult huaweiIdAuthResultA = x.a(intent);
        if (huaweiIdAuthResultA == null) {
            fuo0Var.a(new ApiException(new Status(8)));
        } else if (!huaweiIdAuthResultA.isSuccess() || huaweiIdAuthResultA.getHuaweiId() == null) {
            fuo0Var.a(new ApiException(huaweiIdAuthResultA.getStatus()));
        } else {
            fuo0Var.b(huaweiIdAuthResultA.getHuaweiId());
        }
        return fuo0Var.f10174a;
    }

    public static HuaweiIdAuthService getService(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(activity, huaweiIdAuthParams, 60900100);
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authHuaweiId, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static void addAuthScopes(Fragment fragment, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams != null) {
            addAuthScopes(fragment, i, huaweiIdAuthExtendedParams.getExtendedScopes());
        } else {
            hny.u("HuaweiIdAuthExtendedParams should not be null");
        }
    }

    public static void addAuthScopes(Activity activity, int i, List<Scope> list) {
        if (activity == null) {
            hny.u("Activity should not be null");
            return;
        }
        if (list != null) {
            try {
                activity.startActivityForResult(a(activity, list), i);
                return;
            } catch (Exception e) {
                as.d("HuaweiIdAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
                return;
            }
        }
        hny.u("ScopeList should not be null");
    }

    public static void addAuthScopes(Activity activity, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams != null) {
            addAuthScopes(activity, i, huaweiIdAuthExtendedParams.getExtendedScopes());
        } else {
            hny.u("HuaweiIdAuthExtendedParams should not be null");
        }
    }
}
