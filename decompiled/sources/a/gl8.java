package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gl8 implements jl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11478a;

    public gl8(String str) {
        str.getClass();
        this.f11478a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl8) && Intrinsics.d(this.f11478a, ((gl8) obj).f11478a);
    }

    public final int hashCode() {
        return this.f11478a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowRefuseErrorSnackbar(message=", this.f11478a, Separators.RPAREN);
    }
}
