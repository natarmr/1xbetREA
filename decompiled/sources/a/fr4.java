package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10002a;

    public fr4(a4x a4xVar) {
        a4xVar.getClass();
        this.f10002a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr4) && Intrinsics.d(this.f10002a, ((fr4) obj).f10002a);
    }

    public final int hashCode() {
        return this.f10002a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10002a, "AuthenticatorOptionsUiState(items=", Separators.RPAREN);
    }
}
