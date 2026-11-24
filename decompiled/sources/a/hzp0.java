package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hzp0 implements lzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13918a;
    public final List b;
    public final boolean c;

    public hzp0(lc00 lc00Var, lc00 lc00Var2, boolean z) {
        lc00Var.getClass();
        lc00Var2.getClass();
        this.f13918a = lc00Var;
        this.b = lc00Var2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzp0)) {
            return false;
        }
        hzp0 hzp0Var = (hzp0) obj;
        return Intrinsics.d(this.f13918a, hzp0Var.f13918a) && Intrinsics.d(this.b, hzp0Var.b) && this.c == hzp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(this.f13918a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(w6x.t("Content(serviceStats=", ", returnStats=", this.f13918a, ", isFiltered=", this.b), this.c, Separators.RPAREN);
    }
}
