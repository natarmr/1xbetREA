package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kyv0 implements pyv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19125a;
    public final String b;

    public kyv0(long j, String str) {
        this.f19125a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyv0)) {
            return false;
        }
        kyv0 kyv0Var = (kyv0) obj;
        return this.f19125a == kyv0Var.f19125a && Intrinsics.d(this.b, kyv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f19125a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f19125a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
