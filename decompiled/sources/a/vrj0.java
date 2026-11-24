package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vrj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37902a;
    public final String b;
    public final String c;

    public vrj0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f37902a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrj0)) {
            return false;
        }
        vrj0 vrj0Var = (vrj0) obj;
        return Intrinsics.d(this.f37902a, vrj0Var.f37902a) && Intrinsics.d(this.b, vrj0Var.b) && Intrinsics.d(this.c, vrj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f37902a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShortStatisticItemModel(name=", this.f37902a, ", statOne=", this.b, ", statTwo="), this.c, Separators.RPAREN);
    }
}
