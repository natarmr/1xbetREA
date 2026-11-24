package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mle0 {
    public static final lle0 Companion = new lle0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21986a;
    public final String b;

    public /* synthetic */ mle0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21986a = null;
        } else {
            this.f21986a = str;
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
        if (!(obj instanceof mle0)) {
            return false;
        }
        mle0 mle0Var = (mle0) obj;
        return Intrinsics.d(this.f21986a, mle0Var.f21986a) && Intrinsics.d(this.b, mle0Var.b);
    }

    public final int hashCode() {
        String str = this.f21986a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("RefereeTourInfoDataResponse(id=", this.f21986a, ", title=", this.b, Separators.RPAREN);
    }
}
