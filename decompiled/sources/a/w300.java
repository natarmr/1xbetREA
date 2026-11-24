package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class w300 implements x300 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38475a;

    public final boolean equals(Object obj) {
        if (obj instanceof w300) {
            return this.f38475a == ((w300) obj).f38475a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38475a);
    }

    public final String toString() {
        return ua80.e(this.f38475a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
