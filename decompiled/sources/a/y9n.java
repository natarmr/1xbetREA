package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42257a;
    public final String b;

    public y9n(String str, String str2) {
        str.getClass();
        this.f42257a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9n)) {
            return false;
        }
        y9n y9nVar = (y9n) obj;
        return Intrinsics.d(this.f42257a, y9nVar.f42257a) && this.b.equals(y9nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42257a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DsWebGameCardWinningModel(textLabel=", this.f42257a, ", numberWin=", this.b, Separators.RPAREN);
    }
}
