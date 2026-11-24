package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rcm implements tcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30245a;

    public rcm(String str) {
        str.getClass();
        this.f30245a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcm) && Intrinsics.d(this.f30245a, ((rcm) obj).f30245a);
    }

    public final int hashCode() {
        return this.f30245a.hashCode();
    }

    public final String toString() {
        return kng0.l("Active(title=", this.f30245a, Separators.RPAREN);
    }
}
