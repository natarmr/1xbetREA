package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bij0 implements dij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2662a;

    public static String a(String str) {
        return kng0.l("EndText(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bij0) {
            return Intrinsics.d(this.f2662a, ((bij0) obj).f2662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2662a.hashCode();
    }

    public final String toString() {
        return a(this.f2662a);
    }
}
