package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class qc9 implements sc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28474a = "BuilderUnfinishedKey";
    public final sso0 b = kro0.f18776a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc9)) {
            return false;
        }
        qc9 qc9Var = (qc9) obj;
        return this.f28474a.equals(qc9Var.f28474a) && this.b.equals(qc9Var.b);
    }

    @Override // a.sc9
    public final String getKey() {
        return this.f28474a;
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(R.string.incompatible, this.f28474a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.string.incompatible, "Incompatible(key=", this.f28474a, ", title=", ", tagStyleType=");
        sbP.append(this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
