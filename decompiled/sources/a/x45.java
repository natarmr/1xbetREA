package a;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class x45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f40248a;

    public x45(HashSet hashSet) {
        this.f40248a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x45) {
            return this.f40248a.equals(((x45) obj).f40248a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40248a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f40248a + "}";
    }
}
