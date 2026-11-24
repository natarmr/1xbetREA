package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class so7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32531a;
    public final String b;
    public final int c;

    public so7(int i, String str, String str2) {
        str2.getClass();
        this.f32531a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so7)) {
            return false;
        }
        so7 so7Var = (so7) obj;
        return this.f32531a.equals(so7Var.f32531a) && Intrinsics.d(this.b, so7Var.b) && this.c == so7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f32531a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("BetWinUiModel(betWinTitle=", this.f32531a, ", betWinValue=", this.b, ", betWinColor="));
    }
}
