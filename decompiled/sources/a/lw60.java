package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20749a;
    public final String b;

    public lw60(long j, String str) {
        this.f20749a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw60)) {
            return false;
        }
        lw60 lw60Var = (lw60) obj;
        return this.f20749a == lw60Var.f20749a && Intrinsics.d(this.b, lw60Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f20749a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f20749a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
