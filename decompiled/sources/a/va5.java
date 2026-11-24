package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class va5 {
    public static final List b = q3d.j(new va5(0), new va5(1), new va5(6), new va5(5), new va5(2), new va5(3), new va5(8), new va5(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f37069a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ va5(int i) {
        this.f37069a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof va5) {
            return this.f37069a == ((va5) obj).f37069a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37069a);
    }

    public final String toString() {
        return brm0.l("AwbMode(value=", this.f37069a, ')');
    }
}
