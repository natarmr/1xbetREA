package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rfd0 implements xfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30383a;

    public rfd0(String str) {
        str.getClass();
        this.f30383a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfd0) && Intrinsics.d(this.f30383a, ((rfd0) obj).f30383a);
    }

    public final int hashCode() {
        return this.f30383a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCodeError(message=", this.f30383a, Separators.RPAREN);
    }
}
