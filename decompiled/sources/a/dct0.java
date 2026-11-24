package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dct0 implements fct0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5862a;

    public dct0(String str) {
        str.getClass();
        this.f5862a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dct0) && Intrinsics.d(this.f5862a, ((dct0) obj).f5862a);
    }

    public final int hashCode() {
        return this.f5862a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f5862a, Separators.RPAREN);
    }
}
