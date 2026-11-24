package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c07 implements e07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3509a;
    public final String b;
    public final boolean c;

    public c07(String str, String str2, boolean z) {
        str.getClass();
        this.f3509a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c07)) {
            return false;
        }
        c07 c07Var = (c07) obj;
        return Intrinsics.d(this.f3509a, c07Var.f3509a) && this.b.equals(c07Var.b) && this.c == c07Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f3509a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("BetGroupHeaderWithSubtitleUiModel(groupName=", this.f3509a, ", subGameName=", this.b, ", subGameVisible="), this.c, Separators.RPAREN);
    }
}
