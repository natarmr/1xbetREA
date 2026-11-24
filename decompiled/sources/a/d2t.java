package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d2t implements n2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5374a;
    public final String b;

    public d2t(long j, String str) {
        this.f5374a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2t)) {
            return false;
        }
        d2t d2tVar = (d2t) obj;
        return this.f5374a == d2tVar.f5374a && Intrinsics.d(this.b, d2tVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f5374a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5374a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
