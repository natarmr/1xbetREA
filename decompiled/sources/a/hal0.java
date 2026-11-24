package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hal0 implements jal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12729a;
    public final j5a0 b;
    public final j5a0 c;

    public hal0(String str, j5a0 j5a0Var, j5a0 j5a0Var2) {
        str.getClass();
        this.f12729a = str;
        this.b = j5a0Var;
        this.c = j5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hal0)) {
            return false;
        }
        hal0 hal0Var = (hal0) obj;
        return Intrinsics.d(this.f12729a, hal0Var.f12729a) && this.b.equals(hal0Var.b) && this.c.equals(hal0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f12729a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Pair(name=" + this.f12729a + ", firstPlayerLogo=" + this.b + ", secondPlayerLogo=" + this.c + Separators.RPAREN;
    }
}
