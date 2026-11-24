package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class daa0 {
    public static final s9a0 Companion = new s9a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5738a;
    public final String b;

    public /* synthetic */ daa0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f5738a = null;
        } else {
            this.f5738a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daa0)) {
            return false;
        }
        daa0 daa0Var = (daa0) obj;
        return Intrinsics.d(this.f5738a, daa0Var.f5738a) && Intrinsics.d(this.b, daa0Var.b);
    }

    public final int hashCode() {
        Long l = this.f5738a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f5738a, "PlayerResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
