package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class p88 {
    public static final o88 Companion = new o88();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26541a;
    public final String b;

    public /* synthetic */ p88(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26541a = null;
        } else {
            this.f26541a = str;
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
        if (!(obj instanceof p88)) {
            return false;
        }
        p88 p88Var = (p88) obj;
        return Intrinsics.d(this.f26541a, p88Var.f26541a) && Intrinsics.d(this.b, p88Var.b);
    }

    public final int hashCode() {
        String str = this.f26541a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("BlockImageResponse(backgroundMediaValue=", this.f26541a, ", listMediaValue=", this.b, Separators.RPAREN);
    }
}
