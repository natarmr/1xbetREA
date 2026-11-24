package com.appsflyer.huawei_referrer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;", "Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;", "logger", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "<init>", "(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V", "getLogger", "()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "isContentProviderPresent", "", "context", "Landroid/content/Context;", "isProviderSignatureValid", "getContentProviderInfo", "Landroid/content/pm/ProviderInfo;", "onError", "", "throwable", "", "huawei_referrer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaweiContentProviderValidatorImpl implements HuaweiContentProviderValidator {
    private final AFLoggerBase logger;

    public HuaweiContentProviderValidatorImpl(AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        this.logger = aFLoggerBase;
    }

    private final ProviderInfo getContentProviderInfo(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            onError(th);
            return null;
        }
    }

    private final void onError(Throwable throwable) {
        AFLoggerBase aFLoggerBase = this.logger;
        LogTag logTag = LogTag.REFERRER;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        AFLoggerBase.e$default(aFLoggerBase, logTag, message, throwable, false, false, false, false, 96, null);
    }

    public final AFLoggerBase getLogger() {
        return this.logger;
    }

    @Override // com.appsflyer.huawei_referrer.HuaweiContentProviderValidator
    public boolean isContentProviderPresent(Context context) {
        context.getClass();
        return getContentProviderInfo(context) != null;
    }

    @Override // com.appsflyer.huawei_referrer.HuaweiContentProviderValidator
    public boolean isProviderSignatureValid(Context context) {
        context.getClass();
        ProviderInfo contentProviderInfo = getContentProviderInfo(context);
        if (contentProviderInfo == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(contentProviderInfo.packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            onError(th);
            return false;
        }
    }
}
