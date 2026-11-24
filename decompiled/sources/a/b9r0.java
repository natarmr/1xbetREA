package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class b9r0 {
    public static final a9r0 Companion = new a9r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2225a;
    public final String b;

    public /* synthetic */ b9r0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f2225a = null;
        } else {
            this.f2225a = str;
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
        if (!(obj instanceof b9r0)) {
            return false;
        }
        b9r0 b9r0Var = (b9r0) obj;
        return Intrinsics.d(this.f2225a, b9r0Var.f2225a) && Intrinsics.d(this.b, b9r0Var.b);
    }

    public final int hashCode() {
        String str = this.f2225a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TopPlayerScoreResponse(playerId=", this.f2225a, ", playerScore=", this.b, Separators.RPAREN);
    }
}
