package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ur90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bee f36153a;
    public final String b;
    public final sr90 c;
    public final rr90 d;
    public final or90 e;

    public ur90(bee beeVar, String str, sr90 sr90Var, rr90 rr90Var, or90 or90Var) {
        beeVar.getClass();
        str.getClass();
        or90Var.getClass();
        this.f36153a = beeVar;
        this.b = str;
        this.c = sr90Var;
        this.d = rr90Var;
        this.e = or90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur90)) {
            return false;
        }
        ur90 ur90Var = (ur90) obj;
        return Intrinsics.d(this.f36153a, ur90Var.f36153a) && Intrinsics.d(this.b, ur90Var.b) && Intrinsics.d(this.c, ur90Var.c) && Intrinsics.d(this.d, ur90Var.d) && Intrinsics.d(this.e, ur90Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f36153a.hashCode() * 31, 31, this.b);
        sr90 sr90Var = this.c;
        int iHashCode = (iB + (sr90Var == null ? 0 : sr90Var.hashCode())) * 31;
        rr90 rr90Var = this.d;
        return this.e.hashCode() + ((iHashCode + (rr90Var != null ? rr90Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PickerUiState(contentDialogState=" + this.f36153a + ", title=" + this.b + ", searchFieldUiModel=" + this.c + ", phoneCodeUiModel=" + this.d + ", middleContentUiModel=" + this.e + Separators.RPAREN;
    }
}
