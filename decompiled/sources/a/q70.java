package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q70 {
    public static final List b = q3d.j(new q70(0), new q70(1), new q70(2), new q70(3), new q70(4), new q70(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28225a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q70(int i) {
        this.f28225a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q70) {
            return this.f28225a == ((q70) obj).f28225a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28225a);
    }

    public final String toString() {
        return brm0.l("AfMode(value=", this.f28225a, ')');
    }
}
