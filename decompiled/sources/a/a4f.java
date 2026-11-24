package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a4f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220a;
    public final String b;
    public final sek0 c;

    public a4f(String str, String str2, sek0 sek0Var) {
        this.f220a = str;
        this.b = str2;
        this.c = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4f)) {
            return false;
        }
        a4f a4fVar = (a4f) obj;
        return Intrinsics.d(this.f220a, a4fVar.f220a) && Intrinsics.d(this.b, a4fVar.b) && Intrinsics.d(this.c, a4fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f220a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShowSnackBarMessage(title=", this.f220a, ", subTitle=", this.b, ", messageType=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
