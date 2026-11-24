package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yo80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42973a;
    public final String b;

    public yo80(String str, boolean z) {
        this.f42973a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo80)) {
            return false;
        }
        yo80 yo80Var = (yo80) obj;
        return this.f42973a == yo80Var.f42973a && Intrinsics.d(this.b, yo80Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f42973a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ua80.k("ParamsEditUiModel(isError=", this.f42973a, ", errorMessage=", this.b, Separators.RPAREN);
    }
}
