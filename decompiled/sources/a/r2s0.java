package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29752a;

    public r2s0(List list) {
        list.getClass();
        this.f29752a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2s0) && Intrinsics.d(this.f29752a, ((r2s0) obj).f29752a);
    }

    public final int hashCode() {
        return this.f29752a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29752a, "TournamentModel(teams=", Separators.RPAREN);
    }
}
