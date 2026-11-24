package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44008a;
    public final String b;
    public final boolean c;

    public z9b0(String str, int i, boolean z) {
        str.getClass();
        this.f44008a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9b0)) {
            return false;
        }
        z9b0 z9b0Var = (z9b0) obj;
        return this.f44008a == z9b0Var.f44008a && Intrinsics.d(this.b, z9b0Var.b) && this.c == z9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f44008a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f44008a, "LiveGames(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
