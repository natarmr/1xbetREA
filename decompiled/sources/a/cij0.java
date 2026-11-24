package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cij0 implements dij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4418a;

    public static String a(String str) {
        return kng0.l("SubTitle(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cij0) {
            return Intrinsics.d(this.f4418a, ((cij0) obj).f4418a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4418a.hashCode();
    }

    public final String toString() {
        return a(this.f4418a);
    }
}
