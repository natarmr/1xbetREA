package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22463a;
    public final int b;
    public final int c;
    public final String d;

    public mvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f22463a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvm)) {
            return false;
        }
        mvm mvmVar = (mvm) obj;
        return Intrinsics.d(this.f22463a, mvmVar.f22463a) && this.b == mvmVar.b && this.c == mvmVar.c && this.d.equals(mvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f22463a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V1(opponentName=", this.f22463a, ", firstCard=", ", secondCard="));
    }
}
