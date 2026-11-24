package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mkv implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21962a;

    public final boolean equals(Object obj) {
        if (obj instanceof mkv) {
            return this.f21962a == ((mkv) obj).f21962a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21962a);
    }

    public final String toString() {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, this.f21962a);
    }
}
