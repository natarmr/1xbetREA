package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n15 extends sa6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22731a;

    public n15(ArrayList arrayList) {
        this.f22731a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa6)) {
            return false;
        }
        return this.f22731a.equals(((n15) ((sa6) obj)).f22731a);
    }

    public final int hashCode() {
        return this.f22731a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return rz4.n(new StringBuilder("BatchedLogRequest{logRequests="), this.f22731a, "}");
    }
}
