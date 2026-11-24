package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11578a;
    public final String b;

    public gnb0(String str, String str2) {
        str.getClass();
        this.f11578a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnb0)) {
            return false;
        }
        gnb0 gnb0Var = (gnb0) obj;
        return Intrinsics.d(this.f11578a, gnb0Var.f11578a) && this.b.equals(gnb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11578a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PossibleWinInfoModel(title=", this.f11578a, ", winSum=", this.b, Separators.RPAREN);
    }
}
