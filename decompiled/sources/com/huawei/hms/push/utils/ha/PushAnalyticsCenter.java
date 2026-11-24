package com.huawei.hms.push.utils.ha;

/* JADX INFO: loaded from: classes2.dex */
public class PushAnalyticsCenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PushBaseAnalytics f45954a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static PushAnalyticsCenter f45955a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f45955a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f45954a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f45954a = pushBaseAnalytics;
    }
}
