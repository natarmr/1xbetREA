package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xwa0 {
    public static final wwa0 Companion = new wwa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41601a;
    public final String b;

    public /* synthetic */ xwa0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f41601a = null;
        } else {
            this.f41601a = str;
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
        if (!(obj instanceof xwa0)) {
            return false;
        }
        xwa0 xwa0Var = (xwa0) obj;
        return Intrinsics.d(this.f41601a, xwa0Var.f41601a) && Intrinsics.d(this.b, xwa0Var.b);
    }

    public final int hashCode() {
        String str = this.f41601a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("PopUpCheckListResponse(img=", this.f41601a, ", text=", this.b, Separators.RPAREN);
    }
}
