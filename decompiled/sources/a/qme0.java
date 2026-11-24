package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28979a;

    public qme0(List list) {
        list.getClass();
        this.f28979a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qme0) && Intrinsics.d(this.f28979a, ((qme0) obj).f28979a);
    }

    public final int hashCode() {
        return this.f28979a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f28979a, "RefereesListState(refereesList=", Separators.RPAREN);
    }
}
