package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mal0 implements nal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21463a;
    public final j5a0 b;
    public final kal0 c;

    public mal0(String str, j5a0 j5a0Var, kal0 kal0Var) {
        str.getClass();
        this.f21463a = str;
        this.b = j5a0Var;
        this.c = kal0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mal0)) {
            return false;
        }
        mal0 mal0Var = (mal0) obj;
        return Intrinsics.d(this.f21463a, mal0Var.f21463a) && this.b.equals(mal0Var.b) && Intrinsics.d(this.c, mal0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f21463a.hashCode() * 31)) * 31;
        kal0 kal0Var = this.c;
        return iHashCode + (kal0Var == null ? 0 : kal0Var.hashCode());
    }

    public final String toString() {
        return "Single(name=" + this.f21463a + ", playerLogo=" + this.b + ", additionalInfo=" + this.c + Separators.RPAREN;
    }
}
