package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xe2 implements ye2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40723a;

    public xe2(int i) {
        this.f40723a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe2) && this.f40723a == ((xe2) obj).f40723a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40723a);
    }

    public final String toString() {
        return ua80.e(this.f40723a, "OnSelectTab(id=", Separators.RPAREN);
    }
}
