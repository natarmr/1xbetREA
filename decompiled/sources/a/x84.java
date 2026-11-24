package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x84 implements y84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40445a;
    public final sek0 b;

    public x84(sek0 sek0Var, String str) {
        str.getClass();
        this.f40445a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        x84 x84Var = (x84) obj;
        return Intrinsics.d(this.f40445a, x84Var.f40445a) && this.b.equals(x84Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40445a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackBar(title=" + this.f40445a + ", type=" + this.b + Separators.RPAREN;
    }
}
