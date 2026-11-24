package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class i8p {
    public static final h8p Companion = new h8p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14350a;
    public final String b;

    public /* synthetic */ i8p(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, g8p.f10876a.getDescriptor());
            throw null;
        }
        this.f14350a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8p)) {
            return false;
        }
        i8p i8pVar = (i8p) obj;
        return this.f14350a == i8pVar.f14350a && Intrinsics.d(this.b, i8pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f14350a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f14350a, "FavoriteGame(gameId=", ", gameName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
