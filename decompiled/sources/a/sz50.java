package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sz50 implements tz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33054a;

    public sz50(List list) {
        list.getClass();
        this.f33054a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz50) && Intrinsics.d(this.f33054a, ((sz50) obj).f33054a);
    }

    public final int hashCode() {
        return this.f33054a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f33054a, "RecommendedGames(games=", Separators.RPAREN);
    }
}
