package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class k800 {
    public static final j800 Companion = new j800();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17849a;
    public final String b;
    public final String c;

    public /* synthetic */ k800(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f17849a = null;
        } else {
            this.f17849a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k800)) {
            return false;
        }
        k800 k800Var = (k800) obj;
        return Intrinsics.d(this.f17849a, k800Var.f17849a) && Intrinsics.d(this.b, k800Var.b) && Intrinsics.d(this.c, k800Var.c);
    }

    public final int hashCode() {
        String str = this.f17849a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("LineUpMissingPlayerResponse(player=", this.f17849a, ", status=", this.b, ", reasonText="), this.c, Separators.RPAREN);
    }
}
