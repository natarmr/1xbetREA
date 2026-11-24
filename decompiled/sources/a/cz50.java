package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cz50 implements iz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5210a;
    public final String b;

    public cz50(long j, String str) {
        this.f5210a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz50)) {
            return false;
        }
        cz50 cz50Var = (cz50) obj;
        return this.f5210a == cz50Var.f5210a && Intrinsics.d(this.b, cz50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f5210a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5210a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
