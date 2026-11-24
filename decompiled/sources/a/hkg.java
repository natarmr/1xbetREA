package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hkg implements jkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13207a;

    public hkg(List list) {
        list.getClass();
        this.f13207a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkg) && Intrinsics.d(this.f13207a, ((hkg) obj).f13207a);
    }

    public final int hashCode() {
        return this.f13207a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f13207a, "Success(content=", Separators.RPAREN);
    }
}
