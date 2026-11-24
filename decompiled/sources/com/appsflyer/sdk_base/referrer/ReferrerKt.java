package com.appsflyer.sdk_base.referrer;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import android.content.ComponentName;
import android.content.Context;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljava/lang/Class;", "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;", "Landroid/content/Context;", "context", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "logger", "La/j0g0;", "", "disableInitProvider", "(Ljava/lang/Class;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Ljava/lang/Object;", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReferrerKt {
    public static final Object disableInitProvider(Class<? extends BaseReferrerInitProvider> cls, Context context, AFLoggerBase aFLoggerBase) {
        cls.getClass();
        context.getClass();
        aFLoggerBase.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 2, 1);
            AFLoggerBase.d$default(aFLoggerBase, LogTag.RFR_INIT_PROVIDER, "Disabled provider: ".concat(cls.getName()), false, 4, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(th);
        }
    }
}
