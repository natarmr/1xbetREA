package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class utr implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36267a;

    public final boolean equals(Object obj) {
        if (obj instanceof utr) {
            return this.f36267a == ((utr) obj).f36267a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36267a);
    }

    public final String toString() {
        return defpackage.c.d("NotificationActivated(value=", Separators.RPAREN, this.f36267a);
    }
}
