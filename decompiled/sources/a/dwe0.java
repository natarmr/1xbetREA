package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dwe0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6796a;

    public dwe0(int i) {
        this.f6796a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwe0) && this.f6796a == ((dwe0) obj).f6796a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6796a);
    }

    public final String toString() {
        return ua80.e(this.f6796a, "OnSocialSectionItemClick(socialId=", Separators.RPAREN);
    }
}
