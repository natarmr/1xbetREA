package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31813a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public s8o0(int i, String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str3.getClass();
        this.f31813a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8o0)) {
            return false;
        }
        s8o0 s8o0Var = (s8o0) obj;
        return this.f31813a.equals(s8o0Var.f31813a) && Intrinsics.d(this.b, s8o0Var.b) && Intrinsics.d(this.c, s8o0Var.c) && this.d.equals(s8o0Var.d) && this.e.equals(s8o0Var.e) && this.f == s8o0Var.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f31813a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f31813a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticUfcUiModel(key=", this.f31813a, ", round=", this.b, ", time=");
        f140.v(sbN, this.c, ", winner=", this.d, ", typeOfWin=");
        return brm0.j(this.f, this.e, ", background=", Separators.RPAREN, sbN);
    }
}
