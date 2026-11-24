package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lhj0 implements ohj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20059a;

    public static String a(String str) {
        return kng0.l("EndText(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lhj0) {
            return Intrinsics.d(this.f20059a, ((lhj0) obj).f20059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20059a.hashCode();
    }

    public final String toString() {
        return a(this.f20059a);
    }
}
