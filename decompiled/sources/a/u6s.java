package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35153a;

    public u6s(List list) {
        list.getClass();
        this.f35153a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6s) && Intrinsics.d(this.f35153a, ((u6s) obj).f35153a);
    }

    public final int hashCode() {
        return this.f35153a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f35153a, "UpdateDisplayedCards(cards=", Separators.RPAREN);
    }
}
