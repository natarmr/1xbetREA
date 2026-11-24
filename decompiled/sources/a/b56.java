package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b56 implements f56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1986a;

    public b56(List list) {
        list.getClass();
        this.f1986a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b56) && Intrinsics.d(this.f1986a, ((b56) obj).f1986a);
    }

    public final int hashCode() {
        return this.f1986a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f1986a, "DataLoaded(games=", Separators.RPAREN);
    }
}
