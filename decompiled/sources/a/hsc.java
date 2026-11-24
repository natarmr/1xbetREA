package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13574a;

    public hsc(List list) {
        list.getClass();
        this.f13574a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsc) && Intrinsics.d(this.f13574a, ((hsc) obj).f13574a);
    }

    public final int hashCode() {
        return this.f13574a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f13574a, "ClearTeamsStateModel(availableElements=", Separators.RPAREN);
    }
}
