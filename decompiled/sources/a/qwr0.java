package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29448a;
    public final String b;
    public final boolean c;

    public qwr0(String str, int i, boolean z) {
        str.getClass();
        this.f29448a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwr0)) {
            return false;
        }
        qwr0 qwr0Var = (qwr0) obj;
        return this.f29448a == qwr0Var.f29448a && Intrinsics.d(this.b, qwr0Var.b) && this.c == qwr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f29448a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f29448a, "TournamentBracketChipsUiModel(id=", ", name=", this.b, ", isSelected="), this.c, Separators.RPAREN);
    }
}
