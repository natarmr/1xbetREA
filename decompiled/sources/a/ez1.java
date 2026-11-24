package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ez1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz1 f8650a;
    public final String b;

    public ez1(hz1 hz1Var, String str) {
        hz1Var.getClass();
        this.f8650a = hz1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return Intrinsics.d(this.f8650a, ez1Var.f8650a) && this.b.equals(ez1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8650a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournamentsTipModel(screen=" + this.f8650a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
