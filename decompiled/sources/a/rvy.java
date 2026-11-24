package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31193a;
    public final n0x b;
    public final n0x c;
    public final String d;

    public rvy(long j, n0x n0xVar, n0x n0xVar2, String str) {
        str.getClass();
        this.f31193a = j;
        this.b = n0xVar;
        this.c = n0xVar2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvy)) {
            return false;
        }
        rvy rvyVar = (rvy) obj;
        return this.f31193a == rvyVar.f31193a && this.b.equals(rvyVar.b) && this.c.equals(rvyVar.c) && Intrinsics.d(this.d, rvyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.f(this.c, f140.f(this.b, Long.hashCode(this.f31193a) * 31, 31), 31);
    }

    public final String toString() {
        return "LargeBannerGamesUiModel(gameId=" + this.f31193a + ", gamePicture=" + this.b + ", gamePictureFallback=" + this.c + ", gameLabel=" + this.d + Separators.RPAREN;
    }
}
