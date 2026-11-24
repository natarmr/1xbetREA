package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uge implements aie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35621a;

    public uge(List list) {
        list.getClass();
        this.f35621a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uge) && Intrinsics.d(this.f35621a, ((uge) obj).f35621a);
    }

    public final int hashCode() {
        return this.f35621a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f35621a, "Content(games=", Separators.RPAREN);
    }
}
