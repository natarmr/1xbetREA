package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40905a;
    public final xex b;

    public xhp(Set set, xex xexVar) {
        set.getClass();
        this.f40905a = set;
        this.b = xexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xhp) {
            xhp xhpVar = (xhp) obj;
            return Intrinsics.d(this.f40905a, xhpVar.f40905a) && this.b == xhpVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40905a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedComponentStore(screens=" + this.f40905a + ", component=" + this.b + Separators.RPAREN;
    }
}
