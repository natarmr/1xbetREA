package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tbt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33684a;

    public tbt0(String str) {
        str.getClass();
        this.f33684a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbt0) && Intrinsics.d(this.f33684a, ((tbt0) obj).f33684a);
    }

    public final int hashCode() {
        return this.f33684a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f33684a, Separators.RPAREN);
    }
}
