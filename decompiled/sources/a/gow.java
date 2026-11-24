package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11654a;

    public gow(List list) {
        list.getClass();
        this.f11654a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gow) && Intrinsics.d(this.f11654a, ((gow) obj).f11654a);
    }

    public final int hashCode() {
        return this.f11654a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f11654a, "HorseRacesStatisticModel(statistic=", Separators.RPAREN);
    }
}
