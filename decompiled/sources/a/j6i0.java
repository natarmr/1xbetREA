package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j6i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15989a;
    public final Map b;

    public j6i0(Map map, boolean z) {
        map.getClass();
        this.f15989a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6i0)) {
            return false;
        }
        j6i0 j6i0Var = (j6i0) obj;
        return this.f15989a == j6i0Var.f15989a && Intrinsics.d(this.b, j6i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f15989a) * 31);
    }

    public final String toString() {
        return "SelectorsModel(isSelectorChange=" + this.f15989a + ", selectorsMap=" + this.b + Separators.RPAREN;
    }
}
