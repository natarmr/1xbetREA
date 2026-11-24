package com.huawei.hms.support.hwid.service;

import a.duo0;
import android.content.Intent;
import com.huawei.hms.support.feature.service.AuthService;

/* JADX INFO: loaded from: classes2.dex */
public interface HuaweiIdAuthService extends AuthService {
    Intent getSignInIntent(String str);

    duo0 silentSignIn();

    duo0 silentSignIn(String str);
}
