package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vgh {
    public static final ugh Companion = new ugh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37380a;
    public final String b;

    public /* synthetic */ vgh(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37380a = null;
        } else {
            this.f37380a = str;
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
        if (!(obj instanceof vgh)) {
            return false;
        }
        vgh vghVar = (vgh) obj;
        return Intrinsics.d(this.f37380a, vghVar.f37380a) && Intrinsics.d(this.b, vghVar.b);
    }

    public final int hashCode() {
        String str = this.f37380a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CyberSubScoreResponse(opponent1=", this.f37380a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
