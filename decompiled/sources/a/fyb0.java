package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fyb0 {
    public static final fyb0 c = new fyb0(iun.f15405a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10352a;
    public final List b;

    public fyb0(List list, boolean z) {
        list.getClass();
        this.f10352a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyb0)) {
            return false;
        }
        fyb0 fyb0Var = (fyb0) obj;
        return this.f10352a == fyb0Var.f10352a && Intrinsics.d(this.b, fyb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f10352a) * 31);
    }

    public final String toString() {
        return "PrizesState(isVisible=" + this.f10352a + ", prizes=" + this.b + Separators.RPAREN;
    }
}
