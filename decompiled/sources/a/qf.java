package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qf extends tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28606a;

    public qf(String str) {
        str.getClass();
        this.f28606a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf) && Intrinsics.d(this.f28606a, ((qf) obj).f28606a);
    }

    public final int hashCode() {
        return this.f28606a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(url=", this.f28606a, Separators.RPAREN);
    }
}
