package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jt3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17080a;

    public jt3(String str) {
        str.getClass();
        this.f17080a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt3) && Intrinsics.d(this.f17080a, ((jt3) obj).f17080a);
    }

    public final int hashCode() {
        return this.f17080a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f17080a, Separators.RPAREN);
    }
}
