package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s44 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31587a;
    public final String b;
    public final boolean c;

    public s44(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f31587a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s44)) {
            return false;
        }
        s44 s44Var = (s44) obj;
        return Intrinsics.d(this.f31587a, s44Var.f31587a) && Intrinsics.d(this.b, s44Var.b) && this.c == s44Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f31587a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f31587a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("AuthCloseAllSessionsUiItemModel(title=", this.f31587a, ", subtitle=", this.b, ", enabled="), this.c, Separators.RPAREN);
    }
}
