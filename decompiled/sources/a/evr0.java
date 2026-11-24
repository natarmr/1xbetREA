package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class evr0 implements ivr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8486a;

    public evr0(int i) {
        this.f8486a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evr0) && this.f8486a == ((evr0) obj).f8486a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8486a);
    }

    public final String toString() {
        return ua80.e(this.f8486a, "OnTirageCategoryLayoutClick(tirageNum=", Separators.RPAREN);
    }
}
