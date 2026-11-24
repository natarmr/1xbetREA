package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final class mc4 implements pc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f21534a;
    public final AuthDataModel b;

    public mc4(Throwable th, AuthDataModel authDataModel) {
        authDataModel.getClass();
        this.f21534a = th;
        this.b = authDataModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc4)) {
            return false;
        }
        mc4 mc4Var = (mc4) obj;
        return Intrinsics.d(this.f21534a, mc4Var.f21534a) && Intrinsics.d(this.b, mc4Var.b);
    }

    public final int hashCode() {
        Throwable th = this.f21534a;
        return this.b.hashCode() + ((th == null ? 0 : th.hashCode()) * 31);
    }

    public final String toString() {
        return "HandleAuthorizationException(throwable=" + this.f21534a + ", authDataModel=" + this.b + Separators.RPAREN;
    }
}
