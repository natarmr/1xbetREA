package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rk0 implements tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30622a;

    public rk0(String str) {
        str.getClass();
        this.f30622a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk0) && Intrinsics.d(this.f30622a, ((rk0) obj).f30622a);
    }

    public final int hashCode() {
        return this.f30622a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteErrorSnack(message=", this.f30622a, Separators.RPAREN);
    }
}
