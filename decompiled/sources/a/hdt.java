package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hdt implements qdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12886a;

    public hdt(List list) {
        list.getClass();
        this.f12886a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdt) && Intrinsics.d(this.f12886a, ((hdt) obj).f12886a);
    }

    public final int hashCode() {
        return this.f12886a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f12886a, "Loaded(items=", Separators.RPAREN);
    }
}
