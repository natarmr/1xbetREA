package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jb30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16220a;
    public final String b;
    public final String c;

    public jb30(String str, String str2, String str3) {
        str3.getClass();
        this.f16220a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb30)) {
            return false;
        }
        jb30 jb30Var = (jb30) obj;
        return this.f16220a.equals(jb30Var.f16220a) && this.b.equals(jb30Var.b) && Intrinsics.d(this.c, jb30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f16220a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("Team(tournamentName=", this.f16220a, ", description=", this.b, ", date="), this.c, Separators.RPAREN);
    }
}
