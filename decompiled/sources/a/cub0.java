package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4981a;
    public final boolean b;

    public cub0(String str, boolean z) {
        str.getClass();
        this.f4981a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cub0)) {
            return false;
        }
        cub0 cub0Var = (cub0) obj;
        return Intrinsics.d(this.f4981a, cub0Var.f4981a) && this.b == cub0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f4981a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("PresetButtonUiModel(text=", this.f4981a, ", isSelected=", this.b, Separators.RPAREN);
    }
}
