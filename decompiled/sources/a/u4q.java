package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35063a;
    public final String b;
    public final boolean c;

    public u4q(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f35063a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4q)) {
            return false;
        }
        u4q u4qVar = (u4q) obj;
        return Intrinsics.d(this.f35063a, u4qVar.f35063a) && Intrinsics.d(this.b, u4qVar.b) && this.c == u4qVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f35063a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("FilterWinLossUiModel(matchType=", this.f35063a, ", season=", this.b, ", confirmEnabled="), this.c, Separators.RPAREN);
    }
}
