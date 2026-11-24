package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class m380 {
    public static final l380 Companion = new l380();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21102a;
    public final String b;

    public /* synthetic */ m380(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21102a = null;
        } else {
            this.f21102a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m380)) {
            return false;
        }
        m380 m380Var = (m380) obj;
        return Intrinsics.d(this.f21102a, m380Var.f21102a) && Intrinsics.d(this.b, m380Var.b);
    }

    public final int hashCode() {
        String str = this.f21102a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("OpponentScoreResponse(opponent1=", this.f21102a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
