package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r5n0 implements s5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29896a;
    public final o6q b;

    public r5n0(String str, o6q o6qVar) {
        str.getClass();
        this.f29896a = str;
        this.b = o6qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5n0)) {
            return false;
        }
        r5n0 r5n0Var = (r5n0) obj;
        return Intrinsics.d(this.f29896a, r5n0Var.f29896a) && this.b.equals(r5n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29896a.hashCode() * 31);
    }

    public final String toString() {
        return "SubgameAndFinBetLevel(subgameText=" + this.f29896a + ", finBetLevelUiModel=" + this.b + Separators.RPAREN;
    }
}
