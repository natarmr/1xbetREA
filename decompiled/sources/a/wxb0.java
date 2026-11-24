package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39925a;
    public final String b;

    public wxb0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f39925a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxb0)) {
            return false;
        }
        wxb0 wxb0Var = (wxb0) obj;
        return Intrinsics.d(this.f39925a, wxb0Var.f39925a) && Intrinsics.d(this.b, wxb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39925a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PrizeModel(prizeName=", this.f39925a, ", imageUrl=", this.b, Separators.RPAREN);
    }
}
