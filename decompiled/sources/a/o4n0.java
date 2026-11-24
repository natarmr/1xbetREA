package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class o4n0 {
    public static final j4n0 Companion = new j4n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24647a;
    public final String b;

    public /* synthetic */ o4n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24647a = null;
        } else {
            this.f24647a = str;
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
        if (!(obj instanceof o4n0)) {
            return false;
        }
        o4n0 o4n0Var = (o4n0) obj;
        return Intrinsics.d(this.f24647a, o4n0Var.f24647a) && Intrinsics.d(this.b, o4n0Var.b);
    }

    public final int hashCode() {
        String str = this.f24647a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubTeamResponse(title=", this.f24647a, ", image=", this.b, Separators.RPAREN);
    }
}
