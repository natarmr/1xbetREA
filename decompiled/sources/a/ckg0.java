package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ckg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4505a;
    public final String b;
    public final t6n c;
    public final boolean d;
    public final String e;

    public ckg0(int i, String str, t6n t6nVar, boolean z, String str2) {
        str2.getClass();
        this.f4505a = i;
        this.b = str;
        this.c = t6nVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckg0)) {
            return false;
        }
        ckg0 ckg0Var = (ckg0) obj;
        return this.f4505a == ckg0Var.f4505a && this.b.equals(ckg0Var.b) && this.c.equals(ckg0Var.c) && this.d == ckg0Var.d && Intrinsics.d(this.e, ckg0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + ua80.b(Integer.hashCode(this.f4505a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f4505a, "RpsResultPlayerInfoUiModel(id=", ", name=", this.b, ", avatar=");
        sbR.append(this.c);
        sbR.append(", greenStyle=");
        sbR.append(this.d);
        sbR.append(", tagScoreTitle=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }
}
