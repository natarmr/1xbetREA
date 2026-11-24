package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final class lc4 implements pc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f19782a;
    public final AuthDataModel b;

    public lc4(rvs0 rvs0Var, AuthDataModel authDataModel) {
        authDataModel.getClass();
        this.f19782a = rvs0Var;
        this.b = authDataModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc4)) {
            return false;
        }
        lc4 lc4Var = (lc4) obj;
        return this.f19782a.equals(lc4Var.f19782a) && Intrinsics.d(this.b, lc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19782a.hashCode() * 31);
    }

    public final String toString() {
        return "Handle2FAResult(result=" + this.f19782a + ", authDataModel=" + this.b + Separators.RPAREN;
    }
}
