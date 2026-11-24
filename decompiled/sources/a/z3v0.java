package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z3v0 implements b4v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43739a;

    public z3v0(String str) {
        str.getClass();
        this.f43739a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3v0) && Intrinsics.d(this.f43739a, ((z3v0) obj).f43739a);
    }

    public final int hashCode() {
        return this.f43739a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(url=", this.f43739a, Separators.RPAREN);
    }
}
