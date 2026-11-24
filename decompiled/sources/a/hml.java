package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hml implements jml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eml f13313a;
    public final eml b;

    public hml(eml emlVar, eml emlVar2) {
        this.f13313a = emlVar;
        this.b = emlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hml)) {
            return false;
        }
        hml hmlVar = (hml) obj;
        return this.f13313a.equals(hmlVar.f13313a) && Intrinsics.d(this.b, hmlVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f13313a.hashCode() * 31;
        eml emlVar = this.b;
        return iHashCode + (emlVar == null ? 0 : emlVar.hashCode());
    }

    public final String toString() {
        return "Content(firstGameCardPopularUiModel=" + this.f13313a + ", secondGameCardPopularUiModel=" + this.b + Separators.RPAREN;
    }
}
