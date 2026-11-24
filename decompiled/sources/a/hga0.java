package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hga0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2a0 f13009a;
    public final f2a0 b;
    public final q2a0 c;
    public final a4x d;

    public hga0(f2a0 f2a0Var, f2a0 f2a0Var2, q2a0 q2a0Var, i4 i4Var) {
        i4Var.getClass();
        this.f13009a = f2a0Var;
        this.b = f2a0Var2;
        this.c = q2a0Var;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hga0)) {
            return false;
        }
        hga0 hga0Var = (hga0) obj;
        return this.f13009a.equals(hga0Var.f13009a) && this.b.equals(hga0Var.b) && this.c.equals(hga0Var.c) && Intrinsics.d(this.d, hga0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13009a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayersDuelUiModel(firstPlayerInfo=" + this.f13009a + ", secondPlayerInfo=" + this.b + ", playersStatistic=" + this.c + ", playersDuelAvailablePages=" + this.d + Separators.RPAREN;
    }
}
