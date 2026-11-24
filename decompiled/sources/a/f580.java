package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f580 implements h580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8949a;
    public final boolean b;

    public f580(String str, boolean z) {
        str.getClass();
        this.f8949a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f580)) {
            return false;
        }
        f580 f580Var = (f580) obj;
        return Intrinsics.d(this.f8949a, f580Var.f8949a) && this.b == f580Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f8949a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("SingleTeamOpponentsStateModel(teamName=", this.f8949a, ", isSupportRtl=", this.b, Separators.RPAREN);
    }
}
