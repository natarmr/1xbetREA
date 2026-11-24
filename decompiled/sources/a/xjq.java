package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xjq {
    public static final List b = q3d.j(new xjq(0), new xjq(1), new xjq(2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f40999a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xjq(int i) {
        this.f40999a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xjq) {
            return this.f40999a == ((xjq) obj).f40999a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40999a);
    }

    public final String toString() {
        return brm0.l("FlashMode(value=", this.f40999a, ')');
    }
}
