package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m960 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21397a;
    public final e960 b;
    public final a4x c;
    public final String d;
    public final g960 e;

    public m960(String str, e960 e960Var, i4 i4Var, String str2, g960 g960Var) {
        str.getClass();
        i4Var.getClass();
        str2.getClass();
        this.f21397a = str;
        this.b = e960Var;
        this.c = i4Var;
        this.d = str2;
        this.e = g960Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m960)) {
            return false;
        }
        m960 m960Var = (m960) obj;
        return Intrinsics.d(this.f21397a, m960Var.f21397a) && this.b.equals(m960Var.b) && Intrinsics.d(this.c, m960Var.c) && Intrinsics.d(this.d, m960Var.d) && this.e.equals(m960Var.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "NUMBERS_KEY";
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(cs0.b(this.c, (this.b.hashCode() + ua80.b(3903126, 31, this.f21397a)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "NumbersUiModel(key=NUMBERS_KEY, description=" + this.f21397a + ", currentCookie=" + this.b + ", allCookies=" + this.c + ", typefacePath=" + this.d + ", gameImages=" + this.e + Separators.RPAREN;
    }
}
