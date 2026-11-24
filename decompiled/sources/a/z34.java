package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f43701a;
    public final t3x b;
    public final bmq0 c;
    public final vn30 d;

    public z34(mii0 mii0Var) {
        this.f43701a = (androidx.media3.common.b) mii0Var.b;
        this.b = (t3x) mii0Var.c;
        this.c = (bmq0) mii0Var.d;
        this.d = (vn30) mii0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z34)) {
            return false;
        }
        z34 z34Var = (z34) obj;
        return this.f43701a.equals(z34Var.f43701a) && Objects.equals(this.b, z34Var.b) && this.c.equals(z34Var.c) && Objects.equals(this.d, z34Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f43701a.hashCode() * 961;
        t3x t3xVar = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (t3xVar == null ? 0 : t3xVar.hashCode())) * 31)) * 31;
        vn30 vn30Var = this.d;
        return iHashCode2 + (vn30Var != null ? vn30Var.hashCode() : 0);
    }
}
