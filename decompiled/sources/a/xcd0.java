package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xcd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40642a;

    public final boolean equals(Object obj) {
        if (obj instanceof xcd0) {
            return this.f40642a == ((xcd0) obj).f40642a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40642a);
    }

    public final String toString() {
        return ua80.e(this.f40642a, "SpecialEventTopChamp(topChampId=", Separators.RPAREN);
    }
}
