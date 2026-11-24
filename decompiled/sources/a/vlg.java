package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37621a;

    public vlg(String str) {
        str.getClass();
        this.f37621a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlg) && Intrinsics.d(this.f37621a, ((vlg) obj).f37621a);
    }

    public final int hashCode() {
        return this.f37621a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWarning(message=", this.f37621a, Separators.RPAREN);
    }
}
