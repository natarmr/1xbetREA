package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class clf0 {
    public static final blf0 Companion = new blf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4556a;
    public final String b;
    public final String c;

    public /* synthetic */ clf0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f4556a = null;
        } else {
            this.f4556a = str;
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
        if (!(obj instanceof clf0)) {
            return false;
        }
        clf0 clf0Var = (clf0) obj;
        return Intrinsics.d(this.f4556a, clf0Var.f4556a) && Intrinsics.d(this.b, clf0Var.b) && Intrinsics.d(this.c, clf0Var.c);
    }

    public final int hashCode() {
        String str = this.f4556a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("Button(id=", this.f4556a, ", type=", this.b, ", text="), this.c, Separators.RPAREN);
    }
}
