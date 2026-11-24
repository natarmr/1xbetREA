package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26220a;
    public final List b;

    public p1s0(String str, List list) {
        str.getClass();
        this.f26220a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1s0)) {
            return false;
        }
        p1s0 p1s0Var = (p1s0) obj;
        return Intrinsics.d(this.f26220a, p1s0Var.f26220a) && this.b.equals(p1s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26220a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("TournamentGroupStageModel(title=", this.f26220a, ", matches=", this.b, Separators.RPAREN);
    }
}
