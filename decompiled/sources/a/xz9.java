package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tz9 f41744a;
    public final Map b;

    public xz9(tz9 tz9Var, Map map) {
        map.getClass();
        this.f41744a = tz9Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz9)) {
            return false;
        }
        xz9 xz9Var = (xz9) obj;
        return this.f41744a.equals(xz9Var.f41744a) && Intrinsics.d(this.b, xz9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41744a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.f41744a + ", streamConfigMap=" + this.b + ')';
    }
}
