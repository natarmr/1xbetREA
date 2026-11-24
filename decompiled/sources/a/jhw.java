package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jhw implements vhw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16547a;

    public jhw(String str) {
        str.getClass();
        this.f16547a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhw) && Intrinsics.d(this.f16547a, ((jhw) obj).f16547a);
    }

    public final int hashCode() {
        return this.f16547a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHeaderChampClick(champId=", this.f16547a, Separators.RPAREN);
    }
}
