package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16226a;
    public final String b;

    public jb80(long j, String str) {
        this.f16226a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb80)) {
            return false;
        }
        jb80 jb80Var = (jb80) obj;
        return this.f16226a == jb80Var.f16226a && Intrinsics.d(this.b, jb80Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f16226a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16226a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
