package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u5j implements v5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35097a;

    public u5j(String str) {
        str.getClass();
        this.f35097a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5j) && Intrinsics.d(this.f35097a, ((u5j) obj).f35097a);
    }

    public final int hashCode() {
        return this.f35097a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowUpdateStatusErrorSnackBar(message=", this.f35097a, Separators.RPAREN);
    }
}
