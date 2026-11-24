package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29772a;
    public final long b;
    public final n0x c;
    public final n0x d;
    public final String e;
    public final mz60 f;
    public final int g;

    public r370(int i, long j, n0x n0xVar, n0x n0xVar2, String str, mz60 mz60Var, int i2) {
        str.getClass();
        mz60Var.getClass();
        this.f29772a = i;
        this.b = j;
        this.c = n0xVar;
        this.d = n0xVar2;
        this.e = str;
        this.f = mz60Var;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r370)) {
            return false;
        }
        r370 r370Var = (r370) obj;
        return this.f29772a == r370Var.f29772a && this.b == r370Var.b && this.c.equals(r370Var.c) && this.d.equals(r370Var.d) && Intrinsics.d(this.e, r370Var.e) && Intrinsics.d(this.f, r370Var.f) && this.g == r370Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + ua80.b(f140.f(this.d, f140.f(this.c, rw2.b(Integer.hashCode(this.f29772a) * 31, 31, this.b), 31), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f29772a, this.b, "OneXGamesSpotlightBannerUiModel(categoryId=", ", gameId=");
        sbQ.append(", gamePicture=");
        sbQ.append(this.c);
        sbQ.append(", gamePictureFallback=");
        sbQ.append(this.d);
        sbQ.append(", gameLabel=");
        sbQ.append(this.e);
        sbQ.append(", gameModel=");
        sbQ.append(this.f);
        return vqd.p(sbQ, ", bannerPosition=", this.g, Separators.RPAREN);
    }
}
