package com.huawei.hms.support.account.service;

import a.duo0;
import android.content.Intent;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.feature.service.AuthService;

/* JADX INFO: loaded from: classes2.dex */
public interface AccountAuthService extends AuthService {
    duo0 getAssistToken(GetAssistTokenRequest getAssistTokenRequest);

    duo0 getChannel();

    Intent getIndependentSignInIntent(String str);

    duo0 logout();

    duo0 silentSignIn();

    duo0 startAssistLogin(String str);
}
