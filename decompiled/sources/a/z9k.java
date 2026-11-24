package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z9k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44023a;
    public final boolean b;

    public z9k(List list, boolean z) {
        list.getClass();
        this.f44023a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9k)) {
            return false;
        }
        z9k z9kVar = (z9k) obj;
        return Intrinsics.d(this.f44023a, z9kVar.f44023a) && this.b == z9kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44023a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentState(content=" + this.f44023a + ", saveBtnEnabled=" + this.b + Separators.RPAREN;
    }
}
