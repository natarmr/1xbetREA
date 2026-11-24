package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43477a;
    public final String b;

    public yyp(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f43477a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyp)) {
            return false;
        }
        yyp yypVar = (yyp) obj;
        return Intrinsics.d(this.f43477a, yypVar.f43477a) && Intrinsics.d(this.b, yypVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43477a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("V4(liveTagText=", this.f43477a, ", info=", this.b, Separators.RPAREN);
    }
}
