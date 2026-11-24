package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5633a;

    public d88(List list) {
        list.getClass();
        this.f5633a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d88) && Intrinsics.d(this.f5633a, ((d88) obj).f5633a);
    }

    public final int hashCode() {
        return this.f5633a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5633a, "BlockGameModel(games=", Separators.RPAREN);
    }
}
