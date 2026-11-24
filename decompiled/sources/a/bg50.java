package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bg50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri50 f2538a;

    public bg50(ri50 ri50Var) {
        this.f2538a = ri50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg50) && Intrinsics.d(this.f2538a, ((bg50) obj).f2538a);
    }

    public final int hashCode() {
        ri50 ri50Var = this.f2538a;
        if (ri50Var == null) {
            return 0;
        }
        return ri50Var.hashCode();
    }

    public final String toString() {
        return "NearestGameDetailsCricketScoreModel(wicketScore=" + this.f2538a + Separators.RPAREN;
    }
}
