package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43506a;
    public final boolean b;
    public final List c;

    public yza0(List list, boolean z, boolean z2) {
        this.f43506a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yza0)) {
            return false;
        }
        yza0 yza0Var = (yza0) obj;
        return this.f43506a == yza0Var.f43506a && this.b == yza0Var.b && Intrinsics.d(this.c, yza0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f43506a) * 31, 31, this.b);
        List list = this.c;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return dw9.r(f140.q("CategoriesState(isLoading=", ", isError=", ", categories=", this.f43506a, this.b), this.c, Separators.RPAREN);
    }
}
