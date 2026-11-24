package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nhj0 implements ohj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23535a;

    public static String a(String str) {
        return kng0.l("SubTitle(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhj0) {
            return Intrinsics.d(this.f23535a, ((nhj0) obj).f23535a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23535a.hashCode();
    }

    public final String toString() {
        return a(this.f23535a);
    }
}
