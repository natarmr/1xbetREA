package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24749a;
    public final ux3 b;

    public o6q(String str, ux3 ux3Var) {
        str.getClass();
        this.f24749a = str;
        this.b = ux3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6q)) {
            return false;
        }
        o6q o6qVar = (o6q) obj;
        return Intrinsics.d(this.f24749a, o6qVar.f24749a) && this.b == o6qVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24749a.hashCode() * 31);
    }

    public final String toString() {
        return "FinBetLevelUiModel(levelText=" + this.f24749a + ", arrowState=" + this.b + Separators.RPAREN;
    }
}
