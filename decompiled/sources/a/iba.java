package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class iba {
    public static final hba Companion = new hba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Byte f14477a;
    public final Byte b;
    public final ooa c;
    public final Boolean d;

    public /* synthetic */ iba(int i, Byte b, Byte b2, ooa ooaVar, Boolean bool) {
        if ((i & 1) == 0) {
            this.f14477a = null;
        } else {
            this.f14477a = b;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ooaVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iba)) {
            return false;
        }
        iba ibaVar = (iba) obj;
        return Intrinsics.d(this.f14477a, ibaVar.f14477a) && Intrinsics.d(this.b, ibaVar.b) && Intrinsics.d(this.c, ibaVar.c) && Intrinsics.d(this.d, ibaVar.d);
    }

    public final int hashCode() {
        Byte b = this.f14477a;
        int iHashCode = (b == null ? 0 : b.hashCode()) * 31;
        Byte b2 = this.b;
        int iHashCode2 = (iHashCode + (b2 == null ? 0 : b2.hashCode())) * 31;
        ooa ooaVar = this.c;
        int iHashCode3 = (iHashCode2 + (ooaVar == null ? 0 : ooaVar.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CardBasketballPlayerInfoResponse(quarter=" + this.f14477a + ", points=" + this.b + ", card=" + this.c + ", success=" + this.d + Separators.RPAREN;
    }
}
