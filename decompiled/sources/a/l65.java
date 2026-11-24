package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19488a;

    public l65(List list) {
        list.getClass();
        this.f19488a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l65) && Intrinsics.d(this.f19488a, ((l65) obj).f19488a);
    }

    public final int hashCode() {
        return this.f19488a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19488a, "AvailableBonusesResult(bonusesList=", Separators.RPAREN);
    }
}
