package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zdl0 implements del0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44218a;

    public zdl0(String str) {
        str.getClass();
        this.f44218a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdl0) && Intrinsics.d(this.f44218a, ((zdl0) obj).f44218a);
    }

    public final int hashCode() {
        return this.f44218a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(sportIconUrl=", this.f44218a, Separators.RPAREN);
    }
}
