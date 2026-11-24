package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ml30 extends wl30 {
    public static final ll30 Companion = new ll30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21968a;
    public final String b;

    public ml30(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21968a = null;
        } else {
            this.f21968a = str;
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
        if (!(obj instanceof ml30)) {
            return false;
        }
        ml30 ml30Var = (ml30) obj;
        return Intrinsics.d(this.f21968a, ml30Var.f21968a) && Intrinsics.d(this.b, ml30Var.b);
    }

    public final int hashCode() {
        String str = this.f21968a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("DocumentAttributeFileName(type=", this.f21968a, ", name=", this.b, Separators.RPAREN);
    }
}
