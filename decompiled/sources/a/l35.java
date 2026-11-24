package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmn0 f19342a;
    public final cmn0 b;
    public final ArrayList c;

    public l35(cmn0 cmn0Var, cmn0 cmn0Var2, ArrayList arrayList) {
        if (cmn0Var == null) {
            hny.u("Null primarySurfaceEdge");
            throw null;
        }
        this.f19342a = cmn0Var;
        if (cmn0Var2 == null) {
            hny.u("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = cmn0Var2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l35)) {
            return false;
        }
        l35 l35Var = (l35) obj;
        return this.f19342a.equals(l35Var.f19342a) && this.b.equals(l35Var.b) && this.c.equals(l35Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f19342a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.f19342a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return rz4.n(sb, this.c, "}");
    }
}
