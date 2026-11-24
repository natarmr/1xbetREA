package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28335a;
    public final String b;
    public final boolean c;

    public q970(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f28335a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q970)) {
            return false;
        }
        q970 q970Var = (q970) obj;
        return Intrinsics.d(this.f28335a, q970Var.f28335a) && Intrinsics.d(this.b, q970Var.b) && this.c == q970Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f28335a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("OneXGamesWebGameDisableDemoDialogState(demoBalance=", this.f28335a, ", demoWinSum=", this.b, ", exitButtonEnable="), this.c, Separators.RPAREN);
    }
}
