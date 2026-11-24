package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eh8 implements ih8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7795a;
    public final String b;
    public final String c;

    public eh8(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7795a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh8)) {
            return false;
        }
        eh8 eh8Var = (eh8) obj;
        return this.f7795a == eh8Var.f7795a && Intrinsics.d(this.b, eh8Var.b) && Intrinsics.d(this.c, eh8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f7795a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f7795a, "PlaceHolder(id=", ", title=", this.b, ", description="), this.c, Separators.RPAREN);
    }
}
