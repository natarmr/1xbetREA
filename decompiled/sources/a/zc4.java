package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zc4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthDataModel f44148a;

    public zc4(AuthDataModel authDataModel) {
        authDataModel.getClass();
        this.f44148a = authDataModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc4) && Intrinsics.d(this.f44148a, ((zc4) obj).f44148a);
    }

    public final int hashCode() {
        return this.f44148a.hashCode();
    }

    public final String toString() {
        return "NeedCaptcha(authDataModel=" + this.f44148a + Separators.RPAREN;
    }
}
