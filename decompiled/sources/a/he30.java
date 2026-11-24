package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class he30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12902a;
    public final List b;

    public he30(String str, List list) {
        list.getClass();
        this.f12902a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he30)) {
            return false;
        }
        he30 he30Var = (he30) obj;
        return this.f12902a.equals(he30Var.f12902a) && Intrinsics.d(this.b, he30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12902a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("MatchReviewEventModel(periodName=", this.f12902a, ", events=", this.b, Separators.RPAREN);
    }
}
