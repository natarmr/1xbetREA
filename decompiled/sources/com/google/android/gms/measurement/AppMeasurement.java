package com.google.android.gms.measurement;

import a.d1x0;
import a.dmw0;
import a.gbw0;
import a.kxw0;
import a.qnw0;
import a.s0x;
import a.u4n0;
import android.content.Context;
import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qnw0 f45535a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(kxw0 kxw0Var) {
        this.f45535a = new gbw0(kxw0Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    d1x0 d1x0Var = (d1x0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (d1x0Var != null) {
                        b = new AppMeasurement(d1x0Var);
                    } else {
                        b = new AppMeasurement(kxw0.l(context, new zzdb(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.f45535a.c(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f45535a.g(bundle, str, str2);
    }

    public void endAdUnitExposure(String str) {
        this.f45535a.b(str);
    }

    public long generateEventId() {
        return this.f45535a.zzl();
    }

    public String getAppInstanceId() {
        return this.f45535a.zzj();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listH = this.f45535a.h(str, str2);
        ArrayList arrayList = new ArrayList(listH == null ? 0 : listH.size());
        for (Bundle bundle : listH) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            s0x.H(bundle);
            conditionalUserProperty.mAppId = (String) u4n0.y(bundle, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
            conditionalUserProperty.mOrigin = (String) u4n0.y(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) u4n0.y(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = u4n0.y(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) u4n0.y(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) u4n0.y(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) u4n0.y(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) u4n0.y(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) u4n0.y(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) u4n0.y(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) u4n0.y(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) u4n0.y(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) u4n0.y(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) u4n0.y(bundle, SubscriptionStateHeader.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) u4n0.y(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) u4n0.y(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f45535a.zzi();
    }

    public String getCurrentScreenName() {
        return this.f45535a.zzh();
    }

    public String getGmpAppId() {
        return this.f45535a.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.f45535a.d(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f45535a.f(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f45535a.e(bundle, str, str2);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        s0x.H(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            u4n0.x(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(SubscriptionStateHeader.ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f45535a.a(bundle);
    }

    public AppMeasurement(d1x0 d1x0Var) {
        this.f45535a = new dmw0(d1x0Var);
    }
}
