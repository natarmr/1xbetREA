package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z40 {
    public static final List b = q3d.j(new z40(0), new z40(1), new z40(2), new z40(3), new z40(4), new z40(5), new z40(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43743a;

    public /* synthetic */ z40(int i) {
        this.f43743a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z40) {
            return this.f43743a == ((z40) obj).f43743a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43743a);
    }

    public final String toString() {
        return brm0.l("AeMode(value=", this.f43743a, ')');
    }
}
