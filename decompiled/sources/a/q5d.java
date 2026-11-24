package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q5d extends w8b implements s5d {
    public final String d;
    public final int e;
    public final int f;

    public q5d(String str, int i, int i2) {
        super(vqd.e(str, str), Integer.valueOf(i), Integer.valueOf(i2), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5d)) {
            return false;
        }
        q5d q5dVar = (q5d) obj;
        return Intrinsics.d(this.d, q5dVar.d) && this.e == q5dVar.e && this.f == q5dVar.f;
    }

    @Override // a.s5d
    public final String getTitle() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, kng0.p(this.e, "ChampColumnTitle(title=", this.d, ", widthMax=", ", widthMin="));
    }
}
