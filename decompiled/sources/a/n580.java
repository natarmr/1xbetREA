package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n580 implements p580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22931a;
    public final boolean b;

    public n580(String str, boolean z) {
        str.getClass();
        this.f22931a = str;
        this.b = z;
    }

    @Override // a.p580
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n580)) {
            return false;
        }
        n580 n580Var = (n580) obj;
        return Intrinsics.d(this.f22931a, n580Var.f22931a) && this.b == n580Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22931a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("SingleTeamOpponentsUiModel(teamName=", this.f22931a, ", isSupportRtl=", this.b, Separators.RPAREN);
    }
}
