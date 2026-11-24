package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbv f12989a;
    public final List b;

    public hfv0(pbv pbvVar, List list) {
        list.getClass();
        this.f12989a = pbvVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfv0)) {
            return false;
        }
        hfv0 hfv0Var = (hfv0) obj;
        return Intrinsics.d(this.f12989a, hfv0Var.f12989a) && Intrinsics.d(this.b, hfv0Var.b);
    }

    public final int hashCode() {
        pbv pbvVar = this.f12989a;
        return this.b.hashCode() + ((pbvVar == null ? 0 : pbvVar.hashCode()) * 31);
    }

    public final String toString() {
        return "WildFreeBetBottomSheetState(recommendedGame=" + this.f12989a + ", otherGames=" + this.b + Separators.RPAREN;
    }
}
