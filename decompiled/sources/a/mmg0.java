package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mmg0 implements omg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22036a;

    public mmg0(Map map) {
        map.getClass();
        this.f22036a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmg0) && Intrinsics.d(this.f22036a, ((mmg0) obj).f22036a);
    }

    public final int hashCode() {
        return this.f22036a.hashCode();
    }

    public final String toString() {
        return "Headers(headers=" + this.f22036a + Separators.RPAREN;
    }
}
