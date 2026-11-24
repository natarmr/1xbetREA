package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dcn0 implements ecn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5854a;

    public dcn0(int i) {
        this.f5854a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcn0) && this.f5854a == ((dcn0) obj).f5854a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5854a);
    }

    public final String toString() {
        return ua80.e(this.f5854a, "OnTabSelected(selectedTab=", Separators.RPAREN);
    }
}
