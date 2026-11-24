package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class scp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31998a;
    public final String b;

    public scp(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f31998a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scp)) {
            return false;
        }
        scp scpVar = (scp) obj;
        return Intrinsics.d(this.f31998a, scpVar.f31998a) && Intrinsics.d(this.b, scpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31998a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("FavoriteResultSubGameModel(title=", this.f31998a, ", score=", this.b, Separators.RPAREN);
    }
}
