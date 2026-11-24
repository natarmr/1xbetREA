package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33887a;
    public final String b;

    public tfz(String str, String str2) {
        str.getClass();
        this.f33887a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfz)) {
            return false;
        }
        tfz tfzVar = (tfz) obj;
        return Intrinsics.d(this.f33887a, tfzVar.f33887a) && this.b.equals(tfzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33887a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LeaderboardAnalyticsCardTopUiModel(label=", this.f33887a, ", totalAmount=", this.b, Separators.RPAREN);
    }
}
