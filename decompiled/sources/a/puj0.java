package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class puj0 implements xuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27620a;

    public puj0(String str) {
        str.getClass();
        this.f27620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puj0) && Intrinsics.d(this.f27620a, ((puj0) obj).f27620a);
    }

    public final int hashCode() {
        return this.f27620a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f27620a, Separators.RPAREN);
    }
}
