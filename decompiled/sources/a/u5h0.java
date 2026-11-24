package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35095a;
    public final String b;
    public final int c;

    public u5h0(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f35095a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5h0)) {
            return false;
        }
        u5h0 u5h0Var = (u5h0) obj;
        return Intrinsics.d(this.f35095a, u5h0Var.f35095a) && Intrinsics.d(this.b, u5h0Var.b) && this.c == u5h0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f35095a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("Scores(score1=", this.f35095a, ", score2=", this.b, ", winner="));
    }
}
