package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d77 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5581a;
    public final String b;
    public final int c;

    public d77(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5581a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d77)) {
            return false;
        }
        d77 d77Var = (d77) obj;
        return Intrinsics.d(this.f5581a, d77Var.f5581a) && Intrinsics.d(this.b, d77Var.b) && this.c == d77Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f5581a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("ShowPushSnackBar(title=", this.f5581a, ", subtitle=", this.b, ", icon="));
    }
}
