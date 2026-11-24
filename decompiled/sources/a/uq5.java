package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uq5 implements wq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f36102a;
    public final int b;
    public final boolean c;

    public uq5(kr5 kr5Var, int i, boolean z) {
        kr5Var.getClass();
        this.f36102a = kr5Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq5)) {
            return false;
        }
        uq5 uq5Var = (uq5) obj;
        return Intrinsics.d(this.f36102a, uq5Var.f36102a) && this.b == uq5Var.b && this.c == uq5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f36102a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOldBanner(banner=");
        sb.append(this.f36102a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", showNavBar=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
