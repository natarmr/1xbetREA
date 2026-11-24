package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44206a;
    public final String b;
    public final long c;

    public zdc0(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f44206a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdc0)) {
            return false;
        }
        zdc0 zdc0Var = (zdc0) obj;
        return Intrinsics.d(this.f44206a, zdc0Var.f44206a) && Intrinsics.d(this.b, zdc0Var.b) && this.c == zdc0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(this.f44206a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, b1j.n("PromoCodeListInfoDetailUiModel(detailName=", this.f44206a, ", detailValue=", this.b, ", dateTime="));
    }
}
