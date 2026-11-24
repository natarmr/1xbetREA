package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42000a;
    public final String b;

    public y4e0(int i, String str) {
        str.getClass();
        this.f42000a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4e0)) {
            return false;
        }
        y4e0 y4e0Var = (y4e0) obj;
        return this.f42000a == y4e0Var.f42000a && Intrinsics.d(this.b, y4e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f42000a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f42000a, "RatingHeaderModel(sportId=", ", title=", this.b, Separators.RPAREN);
    }
}
