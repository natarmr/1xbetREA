package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ywp0 {
    public static final xwp0 Companion = new xwp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43382a;
    public final String b;

    public /* synthetic */ ywp0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f43382a = null;
        } else {
            this.f43382a = str;
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
        if (!(obj instanceof ywp0)) {
            return false;
        }
        ywp0 ywp0Var = (ywp0) obj;
        return Intrinsics.d(this.f43382a, ywp0Var.f43382a) && Intrinsics.d(this.b, ywp0Var.b);
    }

    public final int hashCode() {
        String str = this.f43382a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TemporaryTokenResponse(guid=", this.f43382a, ", token=", this.b, Separators.RPAREN);
    }
}
