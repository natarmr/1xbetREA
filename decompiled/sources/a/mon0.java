package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mon0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22143a;

    public mon0(boolean z) {
        this.f22143a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mon0) && this.f22143a == ((mon0) obj).f22143a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22143a);
    }

    public final String toString() {
        return defpackage.c.d("OnSendResult(confirmed=", Separators.RPAREN, this.f22143a);
    }
}
