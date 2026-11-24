package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w7p implements y7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38685a;
    public final String b;

    public w7p(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38685a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7p)) {
            return false;
        }
        w7p w7pVar = (w7p) obj;
        return Intrinsics.d(this.f38685a, w7pVar.f38685a) && Intrinsics.d(this.b, w7pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38685a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TwoPairs(firstOpponentLabel=", this.f38685a, ", secondOpponentLabel=", this.b, Separators.RPAREN);
    }
}
