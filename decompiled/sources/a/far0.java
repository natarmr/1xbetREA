package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class far0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9224a;

    public far0(List list) {
        list.getClass();
        this.f9224a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof far0) && Intrinsics.d(this.f9224a, ((far0) obj).f9224a);
    }

    public final int hashCode() {
        return this.f9224a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9224a, "TopPlayersInfoState(legends=", Separators.RPAREN);
    }
}
