package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a.new, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cnew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23407a;
    public final List b;

    public Cnew(String str, List list) {
        list.getClass();
        this.f23407a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cnew)) {
            return false;
        }
        Cnew cnew = (Cnew) obj;
        return this.f23407a.equals(cnew.f23407a) && Intrinsics.d(this.b, cnew.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23407a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("HltvAwardsStatisticModel(title=", this.f23407a, ", categories=", this.b, Separators.RPAREN);
    }
}
