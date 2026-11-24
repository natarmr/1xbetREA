package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19356a;

    public l3f0(int i) {
        this.f19356a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3f0) && this.f19356a == ((l3f0) obj).f19356a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19356a);
    }

    public final String toString() {
        return ua80.e(this.f19356a, "OnSocialSectionItemClick(socialId=", Separators.RPAREN);
    }
}
