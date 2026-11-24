package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ynu0 implements cou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42958a;

    public final boolean equals(Object obj) {
        if (obj instanceof ynu0) {
            return this.f42958a == ((ynu0) obj).f42958a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42958a);
    }

    public final String toString() {
        return axq.h(this.f42958a, "DisciplineClick(id=", Separators.RPAREN);
    }
}
