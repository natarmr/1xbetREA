package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26469a;
    public final vx3 b;

    public p6q(String str, vx3 vx3Var) {
        str.getClass();
        this.f26469a = str;
        this.b = vx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6q)) {
            return false;
        }
        p6q p6qVar = (p6q) obj;
        return Intrinsics.d(this.f26469a, p6qVar.f26469a) && this.b == p6qVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26469a.hashCode() * 31);
    }

    public final String toString() {
        return "FinBetLevelUiModel(levelText=" + this.f26469a + ", arrowState=" + this.b + Separators.RPAREN;
    }
}
