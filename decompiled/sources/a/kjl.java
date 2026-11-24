package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18391a;

    public kjl(String str) {
        str.getClass();
        this.f18391a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjl) && Intrinsics.d(this.f18391a, ((kjl) obj).f18391a);
    }

    public final int hashCode() {
        return this.f18391a.hashCode();
    }

    public final String toString() {
        return kng0.l("DsActionUiModel(title=", this.f18391a, Separators.RPAREN);
    }
}
