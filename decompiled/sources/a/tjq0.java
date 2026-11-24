package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tjq0 implements wjq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34061a;

    public tjq0(int i) {
        this.f34061a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjq0) && this.f34061a == ((tjq0) obj).f34061a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34061a);
    }

    public final String toString() {
        return ua80.e(this.f34061a, "OnLimitValueSelect(index=", Separators.RPAREN);
    }
}
