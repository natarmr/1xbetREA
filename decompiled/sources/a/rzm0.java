package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rzm0 {
    public static final ozm0 Companion = new ozm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31369a;
    public final String b;

    public /* synthetic */ rzm0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f31369a = null;
        } else {
            this.f31369a = str;
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
        if (!(obj instanceof rzm0)) {
            return false;
        }
        rzm0 rzm0Var = (rzm0) obj;
        return Intrinsics.d(this.f31369a, rzm0Var.f31369a) && Intrinsics.d(this.b, rzm0Var.b);
    }

    public final int hashCode() {
        String str = this.f31369a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubScoreResponse(opponent1=", this.f31369a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
