package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16095a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;

    public j8o0(int i, String str, String str2, String str3, ArrayList arrayList) {
        str2.getClass();
        this.f16095a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8o0)) {
            return false;
        }
        j8o0 j8o0Var = (j8o0) obj;
        return this.f16095a.equals(j8o0Var.f16095a) && Intrinsics.d(this.b, j8o0Var.b) && this.c.equals(j8o0Var.c) && this.d.equals(j8o0Var.d) && this.e == j8o0Var.e;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16095a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.g(this.d, ua80.b(ua80.b(this.f16095a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticTekkenUiModel(key=", this.f16095a, ", teamName=", this.b, ", teamImage=");
        sbN.append(this.c);
        sbN.append(", teamRounds=");
        sbN.append(this.d);
        sbN.append(", background=");
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
