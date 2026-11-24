package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class zcv0 {
    public static final ycv0 Companion = new ycv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44184a;
    public final String b;

    public /* synthetic */ zcv0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f44184a = null;
        } else {
            this.f44184a = str;
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
        if (!(obj instanceof zcv0)) {
            return false;
        }
        zcv0 zcv0Var = (zcv0) obj;
        return Intrinsics.d(this.f44184a, zcv0Var.f44184a) && Intrinsics.d(this.b, zcv0Var.b);
    }

    public final int hashCode() {
        String str = this.f44184a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("WicketScoreResponse(opponent1=", this.f44184a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
