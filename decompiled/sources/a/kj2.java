package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kj2 implements nj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18365a;

    public kj2(List list) {
        list.getClass();
        this.f18365a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj2) && Intrinsics.d(this.f18365a, ((kj2) obj).f18365a);
    }

    public final int hashCode() {
        return this.f18365a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18365a, "Favorites(items=", Separators.RPAREN);
    }
}
