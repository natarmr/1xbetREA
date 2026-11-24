package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z4j0 implements a5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43773a;

    public z4j0(boolean z) {
        this.f43773a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4j0) && this.f43773a == ((z4j0) obj).f43773a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43773a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateAppNotificationSettings(hasAppNotificationSettings=", Separators.RPAREN, this.f43773a);
    }
}
