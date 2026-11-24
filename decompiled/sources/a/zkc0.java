package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zkc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44526a;
    public final boolean b;
    public final boolean c;

    public zkc0(String str, boolean z, boolean z2) {
        this.f44526a = str;
        this.b = z;
        this.c = z2;
    }

    public static zkc0 a(zkc0 zkc0Var, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = zkc0Var.f44526a;
        }
        if ((i & 2) != 0) {
            z = zkc0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = zkc0Var.c;
        }
        zkc0Var.getClass();
        str.getClass();
        return new zkc0(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkc0)) {
            return false;
        }
        zkc0 zkc0Var = (zkc0) obj;
        return this.f44526a.equals(zkc0Var.f44526a) && this.b == zkc0Var.b && this.c == zkc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f44526a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("ToolbarViewState(title=", this.f44526a, ", backIconEnabled=", this.b, ", rulesIconEnabled="), this.c, Separators.RPAREN);
    }
}
