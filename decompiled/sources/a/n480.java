package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n480 {
    public static final j480 Companion = new j480();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22887a;
    public final String b;

    public /* synthetic */ n480(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f22887a = null;
        } else {
            this.f22887a = str;
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
        if (!(obj instanceof n480)) {
            return false;
        }
        n480 n480Var = (n480) obj;
        return Intrinsics.d(this.f22887a, n480Var.f22887a) && Intrinsics.d(this.b, n480Var.b);
    }

    public final int hashCode() {
        String str = this.f22887a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("OpponentsResponse(opp1NameEng=", this.f22887a, ", opp2NameEng=", this.b, Separators.RPAREN);
    }
}
