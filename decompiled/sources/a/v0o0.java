package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v0o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36590a;
    public final String b;

    public v0o0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36590a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0o0)) {
            return false;
        }
        v0o0 v0o0Var = (v0o0) obj;
        return Intrinsics.d(this.f36590a, v0o0Var.f36590a) && Intrinsics.d(this.b, v0o0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MARBLE_BASEBALL_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.cybergame_synthetic_baseball_header_bg) + ua80.b(ua80.b(987123413, 31, this.f36590a), 31, this.b);
    }

    public final String toString() {
        return rz4.j(R.drawable.cybergame_synthetic_baseball_header_bg, Separators.RPAREN, b1j.n("SyntheticBaseballHeaderUiModel(key=MARBLE_BASEBALL_ROUND_HEADER_KEY, firstTeamName=", this.f36590a, ", secondTeamName=", this.b, ", background="));
    }
}
