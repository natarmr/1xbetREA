package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jrq0 implements lrq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17016a;
    public final String b;

    public jrq0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f17016a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrq0)) {
            return false;
        }
        jrq0 jrq0Var = (jrq0) obj;
        return Intrinsics.d(this.f17016a, jrq0Var.f17016a) && Intrinsics.d(this.b, jrq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17016a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Toto1xContent(numberOfBets=", this.f17016a, ", confirmedBets=", this.b, Separators.RPAREN);
    }
}
