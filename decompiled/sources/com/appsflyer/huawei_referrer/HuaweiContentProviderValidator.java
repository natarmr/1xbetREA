package com.appsflyer.huawei_referrer;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;", "", "isContentProviderPresent", "", "context", "Landroid/content/Context;", "isProviderSignatureValid", "huawei_referrer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HuaweiContentProviderValidator {
    boolean isContentProviderPresent(Context context);

    boolean isProviderSignatureValid(Context context);
}
