package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ko5 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18614a;
    public final String b;
    public final String c;
    public final boolean d;

    public ko5(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.f18614a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko5)) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        return this.f18614a.equals(ko5Var.f18614a) && this.b.equals(ko5Var.b) && Intrinsics.d(this.c, ko5Var.c) && this.d == ko5Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f18614a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f18614a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", heroBanned=", Separators.RPAREN, b1j.n("BanPicksHeroUiModel(key=", this.f18614a, ", heroImage=", this.b, ", heroNumber="), this.d);
    }
}
