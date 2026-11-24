package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uiv implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35751a;

    public uiv(List list) {
        list.getClass();
        this.f35751a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uiv) && Intrinsics.d(this.f35751a, ((uiv) obj).f35751a);
    }

    public final int hashCode() {
        return this.f35751a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f35751a, "GuiltyGearModel(rounds=", Separators.RPAREN);
    }
}
