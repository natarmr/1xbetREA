package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class srm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32685a;
    public final int b;

    public srm0(int i, Map map) {
        map.getClass();
        this.f32685a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srm0)) {
            return false;
        }
        srm0 srm0Var = (srm0) obj;
        return Intrinsics.d(this.f32685a, srm0Var.f32685a) && this.b == srm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f32685a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.f32685a);
        sb.append(", maxSupportedFrameRate=");
        return brm0.n(sb, this.b, ')');
    }
}
