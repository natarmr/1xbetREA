package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class eea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7662a;

    public eea0(String str) {
        str.getClass();
        this.f7662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eea0) && Intrinsics.d(this.f7662a, ((eea0) obj).f7662a);
    }

    public final int hashCode() {
        return this.f7662a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerTransfersToolbarUiModel(title=", this.f7662a, Separators.RPAREN);
    }
}
