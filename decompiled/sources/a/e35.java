package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e35 extends m9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7118a;

    public e35(List list) {
        this.f7118a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m9f)) {
            return false;
        }
        return this.f7118a.equals(((e35) ((m9f) obj)).f7118a);
    }

    public final int hashCode() {
        return this.f7118a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dw9.r(new StringBuilder("RolloutsState{rolloutAssignments="), this.f7118a, "}");
    }
}
