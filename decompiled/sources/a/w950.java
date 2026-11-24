package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class w950 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb50 f38762a;
    public final boolean b;
    public final boolean c;

    public w950(cb50 cb50Var, boolean z, boolean z2) {
        this.f38762a = cb50Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w950)) {
            return false;
        }
        w950 w950Var = (w950) obj;
        return this.f38762a.equals(w950Var.f38762a) && this.b == w950Var.b && this.c == w950Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f38762a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavBarCommandState(screenType=");
        sb.append(this.f38762a);
        sb.append(", newRootScreen=");
        sb.append(this.b);
        sb.append(", backToRoot=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
