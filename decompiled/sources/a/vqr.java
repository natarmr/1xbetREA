package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f37867a;
    public final ig30 b;

    public vqr(j83 j83Var, ig30 ig30Var) {
        this.f37867a = j83Var;
        this.b = ig30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqr)) {
            return false;
        }
        vqr vqrVar = (vqr) obj;
        return this.f37867a.equals(vqrVar.f37867a) && Intrinsics.d(this.b, vqrVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f37867a.hashCode() * 31;
        ig30 ig30Var = this.b;
        return iHashCode + (ig30Var == null ? 0 : ig30Var.hashCode());
    }

    public final String toString() {
        return "GameBoardLabelsUiModel(gameInfo=" + ((Object) this.f37867a) + ", timer=" + this.b + Separators.RPAREN;
    }
}
