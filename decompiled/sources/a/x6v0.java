package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x6v0 implements a7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40384a;
    public final boolean b;

    public x6v0(int i, boolean z) {
        this.f40384a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6v0)) {
            return false;
        }
        x6v0 x6v0Var = (x6v0) obj;
        return this.f40384a == x6v0Var.f40384a && this.b == x6v0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f40384a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f40384a, "SetCurrentDayPosition(position=", ", completed=", Separators.RPAREN, this.b);
    }
}
