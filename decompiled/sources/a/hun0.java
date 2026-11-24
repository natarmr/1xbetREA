package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hun0 implements iun0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13691a;
    public final CharSequence b;
    public final boolean c;
    public final CharSequence d;

    public hun0(String str, String str2, String str3, boolean z) {
        brm0.B(str, str2, str3);
        this.f13691a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hun0)) {
            return false;
        }
        hun0 hun0Var = (hun0) obj;
        return Intrinsics.d(this.f13691a, hun0Var.f13691a) && Intrinsics.d(this.b, hun0Var.b) && this.c == hun0Var.c && Intrinsics.d(this.d, hun0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f13691a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Value(balanceString=" + ((Object) this.f13691a) + ", currency=" + ((Object) this.b) + ", isCanChangeBalance=" + this.c + ", name=" + ((Object) this.d) + Separators.RPAREN;
    }
}
