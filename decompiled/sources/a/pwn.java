package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pwn implements rwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27719a;

    public pwn(String str) {
        str.getClass();
        this.f27719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwn) && Intrinsics.d(this.f27719a, ((pwn) obj).f27719a);
    }

    public final int hashCode() {
        return this.f27719a.hashCode();
    }

    public final String toString() {
        return kng0.l("StartDestination(value=", this.f27719a, Separators.RPAREN);
    }
}
