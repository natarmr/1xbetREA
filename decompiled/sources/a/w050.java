package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w050 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38334a;
    public final String b;

    public w050(int i, String str) {
        str.getClass();
        this.f38334a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w050)) {
            return false;
        }
        w050 w050Var = (w050) obj;
        return this.f38334a == w050Var.f38334a && Intrinsics.d(this.b, w050Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38334a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f38334a, "OnBannerClick(bannerId=", ", key=", this.b, Separators.RPAREN);
    }
}
