package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ark0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1350a;

    public ark0(String str) {
        str.getClass();
        this.f1350a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ark0) && Intrinsics.d(this.f1350a, ((ark0) obj).f1350a);
    }

    public final int hashCode() {
        return this.f1350a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRankingsSectionClick(eventId=", this.f1350a, Separators.RPAREN);
    }
}
