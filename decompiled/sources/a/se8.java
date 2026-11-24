package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class se8 implements bf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32065a;
    public final String b;

    public se8(long j, String str) {
        this.f32065a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se8)) {
            return false;
        }
        se8 se8Var = (se8) obj;
        return this.f32065a == se8Var.f32065a && Intrinsics.d(this.b, se8Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f32065a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32065a, "OnGameClickedFromUi(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
