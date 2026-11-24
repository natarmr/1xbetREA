package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class huf implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13677a;

    public huf(List list) {
        list.getClass();
        this.f13677a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof huf) && Intrinsics.d(this.f13677a, ((huf) obj).f13677a);
    }

    public final int hashCode() {
        return this.f13677a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f13677a, "CupheadStatisticModel(rounds=", Separators.RPAREN);
    }
}
