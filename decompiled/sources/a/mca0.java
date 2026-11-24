package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mca0 {
    public static final lca0 Companion = new lca0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21541a;
    public final String b;

    public /* synthetic */ mca0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21541a = null;
        } else {
            this.f21541a = str;
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
        if (!(obj instanceof mca0)) {
            return false;
        }
        mca0 mca0Var = (mca0) obj;
        return Intrinsics.d(this.f21541a, mca0Var.f21541a) && Intrinsics.d(this.b, mca0Var.b);
    }

    public final int hashCode() {
        String str = this.f21541a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("PlayerTransferResponse(nickname=", this.f21541a, ", image=", this.b, Separators.RPAREN);
    }
}
