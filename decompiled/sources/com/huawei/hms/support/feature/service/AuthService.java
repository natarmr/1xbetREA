package com.huawei.hms.support.feature.service;

import a.duo0;
import android.content.Intent;
import com.huawei.hms.common.HuaweiApiInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthService extends HuaweiApiInterface {
    duo0 cancelAuthorization();

    Intent getSignInIntent();

    duo0 signOut();
}
