package com.huawei.agconnect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AGCRoutePolicy {
    public static final AGCRoutePolicy b = new AGCRoutePolicy(0);
    public static final AGCRoutePolicy c = new AGCRoutePolicy(1);
    public static final AGCRoutePolicy d = new AGCRoutePolicy(2);
    public static final AGCRoutePolicy e = new AGCRoutePolicy(3);
    public static final AGCRoutePolicy f = new AGCRoutePolicy(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f45674a;

    /* JADX WARN: Multi-variable type inference failed */
    public AGCRoutePolicy(int i) {
        this.f45674a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AGCRoutePolicy.class == obj.getClass() && this.f45674a == ((AGCRoutePolicy) obj).f45674a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45674a)});
    }
}
