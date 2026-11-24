package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h120 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w950 f12261a;
    public final cb50 b;

    public h120(w950 w950Var, cb50 cb50Var) {
        cb50Var.getClass();
        this.f12261a = w950Var;
        this.b = cb50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h120)) {
            return false;
        }
        h120 h120Var = (h120) obj;
        return this.f12261a.equals(h120Var.f12261a) && Intrinsics.d(this.b, h120Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12261a.hashCode() * 31);
    }

    public final String toString() {
        return "MainTabState(navBarCommandState=" + this.f12261a + ", initialScreenType=" + this.b + Separators.RPAREN;
    }
}
