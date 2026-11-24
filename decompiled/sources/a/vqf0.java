package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vqf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trf0 f37854a;
    public final wof0 b;

    public vqf0(trf0 trf0Var, wof0 wof0Var) {
        this.f37854a = trf0Var;
        this.b = wof0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqf0)) {
            return false;
        }
        vqf0 vqf0Var = (vqf0) obj;
        return this.f37854a.equals(vqf0Var.f37854a) && Intrinsics.d(this.b, vqf0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f37854a.hashCode() * 31;
        wof0 wof0Var = this.b;
        return iHashCode + (wof0Var == null ? 0 : wof0Var.hashCode());
    }

    public final String toString() {
        return "ResidentModel(secondLife=" + this.f37854a + ", game=" + this.b + Separators.RPAREN;
    }
}
