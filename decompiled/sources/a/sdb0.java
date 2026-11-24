package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32026a;
    public final int b;
    public final String c;

    public sdb0(String str, int i, long j) {
        this.f32026a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdb0)) {
            return false;
        }
        sdb0 sdb0Var = (sdb0) obj;
        return this.f32026a == sdb0Var.f32026a && this.b == sdb0Var.b && Intrinsics.d(this.c, sdb0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f32026a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f32026a, "OnLargeBannerGamesCollectionItemClick(gameId=", ", bannerPosition="), ", loadedPictureUrl=", this.c, Separators.RPAREN);
    }
}
