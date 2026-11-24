package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bsv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final esv0 f3152a;
    public final esv0 b;

    public bsv0(esv0 esv0Var, esv0 esv0Var2) {
        this.f3152a = esv0Var;
        this.b = esv0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsv0)) {
            return false;
        }
        bsv0 bsv0Var = (bsv0) obj;
        return this.f3152a.equals(bsv0Var.f3152a) && Intrinsics.d(this.b, bsv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f3152a.hashCode() * 31;
        esv0 esv0Var = this.b;
        return iHashCode + (esv0Var == null ? 0 : esv0Var.hashCode());
    }

    public final String toString() {
        return "XBottomSheetAnchorModel(rest=" + this.f3152a + ", expand=" + this.b + Separators.RPAREN;
    }
}
