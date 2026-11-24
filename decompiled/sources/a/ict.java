package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ict {
    public static final hct Companion = new hct();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14551a;
    public final String b;

    public /* synthetic */ ict(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14551a = null;
        } else {
            this.f14551a = str;
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
        if (!(obj instanceof ict)) {
            return false;
        }
        ict ictVar = (ict) obj;
        return Intrinsics.d(this.f14551a, ictVar.f14551a) && Intrinsics.d(this.b, ictVar.b);
    }

    public final int hashCode() {
        String str = this.f14551a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubGame(title=", this.f14551a, ", score=", this.b, Separators.RPAREN);
    }
}
