package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kr10 implements lr10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18744a;

    public final boolean equals(Object obj) {
        if (obj instanceof kr10) {
            return this.f18744a == ((kr10) obj).f18744a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18744a);
    }

    public final String toString() {
        return ua80.e(this.f18744a, "OnSelectedTab(index=", Separators.RPAREN);
    }
}
