package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qr {
    public static final pr Companion = new pr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29185a;
    public final Boolean b;

    public /* synthetic */ qr(int i, long j, Boolean bool) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, or.f25712a.getDescriptor());
            throw null;
        }
        this.f29185a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return this.f29185a == qrVar.f29185a && Intrinsics.d(this.b, qrVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f29185a) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "AddFavoriteGameRequest(gameId=" + this.f29185a + ", subscribe=" + this.b + Separators.RPAREN;
    }

    public qr(long j, Boolean bool) {
        this.f29185a = j;
        this.b = bool;
    }
}
