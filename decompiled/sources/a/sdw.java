package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32051a;
    public final String b;

    public sdw(String str, String str2) {
        this.f32051a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdw)) {
            return false;
        }
        sdw sdwVar = (sdw) obj;
        return this.f32051a.equals(sdwVar.f32051a) && this.b.equals(sdwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32051a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HltvAwardsNomineesStatInfoModel(label=", this.f32051a, ", value=", this.b, Separators.RPAREN);
    }
}
