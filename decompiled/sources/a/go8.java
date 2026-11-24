package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class go8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11618a;
    public final long b;
    public final boolean c;

    public go8(String str, long j, boolean z) {
        str.getClass();
        this.f11618a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8Var = (go8) obj;
        return Intrinsics.d(this.f11618a, go8Var.f11618a) && this.b == go8Var.b && this.c == go8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f11618a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "BottomMainInfoUiModel(description=", this.f11618a, ", timeStart="), ", timerVisibility=", this.c, Separators.RPAREN);
    }
}
