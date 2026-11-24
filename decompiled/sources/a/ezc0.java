package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ezc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8666a;
    public final String b;
    public final boolean c;

    public ezc0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f8666a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezc0)) {
            return false;
        }
        ezc0 ezc0Var = (ezc0) obj;
        return Intrinsics.d(this.f8666a, ezc0Var.f8666a) && Intrinsics.d(this.b, ezc0Var.b) && this.c == ezc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f8666a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PromotedCategoryModel(id=", this.f8666a, ", name=", this.b, ", checked="), this.c, Separators.RPAREN);
    }
}
