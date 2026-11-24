package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes5.dex */
public final class vqi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TokenRestoreData f37857a;
    public final long b;
    public final we50 c;

    public vqi0(TokenRestoreData tokenRestoreData, long j, we50 we50Var) {
        this.f37857a = tokenRestoreData;
        this.b = j;
        this.c = we50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqi0)) {
            return false;
        }
        vqi0 vqi0Var = (vqi0) obj;
        return this.f37857a.equals(vqi0Var.f37857a) && this.b == vqi0Var.b && this.c == vqi0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f37857a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SetNewPasswordBundleModel(tokenRestoreData=" + this.f37857a + ", userId=" + this.b + ", navigation=" + this.c + Separators.RPAREN;
    }
}
