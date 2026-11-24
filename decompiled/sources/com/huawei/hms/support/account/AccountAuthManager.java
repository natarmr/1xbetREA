package com.huawei.hms.support.account;

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
import com.huawei.hms.hwid.f;
import com.huawei.hms.support.account.common.AccountAuthException;
import com.huawei.hms.support.account.request.AccountAuthExtendedParams;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.account.service.AccountAuthServiceImpl;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AccountAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, f.a(list)).getSignInIntent();
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
            as.d("AccountAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
        }
    }

    public static boolean containScopes(AuthAccount authAccount, List<Scope> list) {
        if (authAccount == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authAccount.getAuthorizedScopes().containsAll(list);
    }

    public static AuthAccount getAuthResult() {
        return f.b();
    }

    public static AuthAccount getAuthResultWithScopes(List<Scope> list) throws AccountAuthException {
        if (ap.a(list).booleanValue()) {
            throw new AccountAuthException("ScopeList should not be empty");
        }
        AuthAccount authAccountB = f.b();
        if (authAccountB == null) {
            authAccountB = new AuthAccount();
        }
        authAccountB.requestExtraScopes(list);
        return authAccountB;
    }

    public static AuthAccount getExtendedAuthResult(AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            hny.u("AccountAuthExtendedParams should not be null");
            return null;
        }
        List<Scope> extendedScopes = accountAuthExtendedParams.getExtendedScopes();
        AuthAccount authAccountB = f.b();
        if (authAccountB == null) {
            authAccountB = new AuthAccount();
        }
        return authAccountB.requestExtraScopes(extendedScopes);
    }

    public static AccountAuthService getService(Context context, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(context, accountAuthParams, 60900100);
    }

    public static duo0 parseAuthResultFromIntent(Intent intent) {
        fuo0 fuo0Var = new fuo0();
        AccountAuthResult accountAuthResultA = f.a(intent);
        if (accountAuthResultA == null) {
            fuo0Var.a(new ApiException(new Status(8)));
        } else if (!accountAuthResultA.isSuccess() || accountAuthResultA.getAccount() == null) {
            fuo0Var.a(new ApiException(accountAuthResultA.getStatus()));
        } else {
            fuo0Var.b(accountAuthResultA.getAccount());
        }
        return fuo0Var.f10174a;
    }

    public static AccountAuthService getService(Activity activity, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(activity, accountAuthParams, 60900100);
    }

    public static boolean containScopes(AuthAccount authAccount, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authAccount, accountAuthExtendedParams.getExtendedScopes());
    }

    public static void addAuthScopes(Fragment fragment, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams != null) {
            addAuthScopes(fragment, i, accountAuthExtendedParams.getExtendedScopes());
        } else {
            hny.u("AccountAuthExtendedParams should not be null");
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
                as.d("AccountAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
                return;
            }
        }
        hny.u("ScopeList should not be null");
    }

    public static void addAuthScopes(Activity activity, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams != null) {
            addAuthScopes(activity, i, accountAuthExtendedParams.getExtendedScopes());
        } else {
            hny.u("AccountAuthExtendedParams should not be null");
        }
    }
}
