package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42179a;
    public final String b;
    public final String c;

    public y85(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f42179a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y85)) {
            return false;
        }
        y85 y85Var = (y85) obj;
        return this.f42179a == y85Var.f42179a && Intrinsics.d(this.b, y85Var.b) && Intrinsics.d(this.c, y85Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f42179a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f42179a, "AvailableValueModel(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
