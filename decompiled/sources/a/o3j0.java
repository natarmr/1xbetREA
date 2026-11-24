package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o3j0 implements p3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24589a;

    public final boolean equals(Object obj) {
        if (obj instanceof o3j0) {
            return this.f24589a == ((o3j0) obj).f24589a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24589a);
    }

    public final String toString() {
        return defpackage.c.d("SubscribeBetUpdatesToggleChangeState(value=", Separators.RPAREN, this.f24589a);
    }
}
