package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bd5 {
    public static final ad5 Companion = new ad5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2383a;
    public final String b;

    public /* synthetic */ bd5(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f2383a = null;
        } else {
            this.f2383a = str;
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
        if (!(obj instanceof bd5)) {
            return false;
        }
        bd5 bd5Var = (bd5) obj;
        return Intrinsics.d(this.f2383a, bd5Var.f2383a) && Intrinsics.d(this.b, bd5Var.b);
    }

    public final int hashCode() {
        String str = this.f2383a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("BackgroundResourcesRulesResponse(key=", this.f2383a, ", value=", this.b, Separators.RPAREN);
    }
}
