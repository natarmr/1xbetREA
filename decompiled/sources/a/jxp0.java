package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jxp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17319a;
    public final boolean b;

    public jxp0(String str, boolean z) {
        str.getClass();
        this.f17319a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxp0)) {
            return false;
        }
        jxp0 jxp0Var = (jxp0) obj;
        return Intrinsics.d(this.f17319a, jxp0Var.f17319a) && this.b == jxp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f17319a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("TennisScore(value=", this.f17319a, ", hasChanged=", this.b, Separators.RPAREN);
    }
}
