package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q25 extends f9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27984a;
    public final b9f b;
    public final r8f c;
    public final w8f d;
    public final t25 e;
    public final List f;

    public q25(List list, b9f b9fVar, r8f r8fVar, w8f w8fVar, t25 t25Var, List list2) {
        this.f27984a = list;
        this.b = b9fVar;
        this.c = r8fVar;
        this.d = w8fVar;
        this.e = t25Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f9f)) {
            return false;
        }
        f9f f9fVar = (f9f) obj;
        List list = this.f27984a;
        if (list == null) {
            if (((q25) f9fVar).f27984a != null) {
                return false;
            }
        } else if (!list.equals(((q25) f9fVar).f27984a)) {
            return false;
        }
        b9f b9fVar = this.b;
        if (b9fVar == null) {
            if (((q25) f9fVar).b != null) {
                return false;
            }
        } else if (!b9fVar.equals(((q25) f9fVar).b)) {
            return false;
        }
        r8f r8fVar = this.c;
        if (r8fVar == null) {
            if (((q25) f9fVar).c != null) {
                return false;
            }
        } else if (!r8fVar.equals(((q25) f9fVar).c)) {
            return false;
        }
        w8f w8fVar = this.d;
        if (w8fVar == null) {
            if (((q25) f9fVar).d != null) {
                return false;
            }
        } else if (!w8fVar.equals(((q25) f9fVar).d)) {
            return false;
        }
        q25 q25Var = (q25) f9fVar;
        return this.e.equals(q25Var.e) && this.f.equals(q25Var.f);
    }

    public final int hashCode() {
        List list = this.f27984a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        b9f b9fVar = this.b;
        int iHashCode2 = (iHashCode ^ (b9fVar == null ? 0 : b9fVar.hashCode())) * 1000003;
        r8f r8fVar = this.c;
        int iHashCode3 = (iHashCode2 ^ (r8fVar == null ? 0 : r8fVar.hashCode())) * 1000003;
        w8f w8fVar = this.d;
        return this.f.hashCode() ^ (((((w8fVar != null ? w8fVar.hashCode() : 0) ^ iHashCode3) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.f27984a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", profilingManagerInfo=");
        sb.append(this.d);
        sb.append(", signal=");
        sb.append(this.e);
        sb.append(", binaries=");
        return dw9.r(sb, this.f, "}");
    }
}
