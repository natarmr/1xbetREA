package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c470 implements d470 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3712a;
    public final String b;

    public c470(long j, String str) {
        this.f3712a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c470)) {
            return false;
        }
        c470 c470Var = (c470) obj;
        return this.f3712a == c470Var.f3712a && Intrinsics.d(this.b, c470Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f3712a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f3712a, "OnGameClick(gameId=", ", loadedPictureUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
