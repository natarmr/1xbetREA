package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dtt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrt0 f6671a;
    public final CharSequence b;
    public final int c;
    public final String d;

    public dtt0(xrt0 xrt0Var, String str, int i, String str2) {
        xrt0Var.getClass();
        str.getClass();
        this.f6671a = xrt0Var;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtt0)) {
            return false;
        }
        dtt0 dtt0Var = (dtt0) obj;
        return Intrinsics.d(this.f6671a, dtt0Var.f6671a) && Intrinsics.d(this.b, dtt0Var.b) && this.c == dtt0Var.c && this.d.equals(dtt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f6671a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserUIModel(userModel=");
        sb.append(this.f6671a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", placeholder=");
        return rw2.k(this.c, ", avatarImageUrl=", this.d, Separators.RPAREN, sb);
    }
}
